/*
 * Copyright (c) 2018, 2019, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package jdk.incubator.jpackage.internal;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.io.File;
import jdk.incubator.jpackage.internal.Arguments.CLIOptions;

/*
 * AddLauncherArguments
 *
 * Processes a add-launcher properties file to create the Map of
 * bundle params applicable to the add-launcher:
 *
 * BundlerParams p = (new AddLauncherArguments(file)).getLauncherMap();
 *
 * A add-launcher is another executable program generated by either the
 * create-app-image mode or the create-installer mode.
 * The add-launcher may be the same program with different configuration,
 * or a completely different program created from the same files.
 *
 * There may be multiple add-launchers, each created by using the
 * command line arg "--add-launcher <file path>
 *
 * The add-launcher properties file may have any of:
 *
 * appVersion
 * module
 * main-jar
 * main-class
 * icon
 * arguments
 * java-options
 * win-console
 * linux-app-category
 *
 */
class AddLauncherArguments {

    private final String name;
    private final String filename;
    private Map<String, String> allArgs;
    private Map<String, ? super Object> bundleParams;

    AddLauncherArguments(String name, String filename) {
        this.name = name;
        this.filename = filename;
    }

    private void initLauncherMap() {
        if (bundleParams != null) {
            return;
        }

        allArgs = Arguments.getPropertiesFromFile(filename);
        allArgs.put(CLIOptions.NAME.getId(), name);

        bundleParams = new HashMap<>();
        String mainJar = getOptionValue(CLIOptions.MAIN_JAR);
        String mainClass = getOptionValue(CLIOptions.APPCLASS);
        String module = getOptionValue(CLIOptions.MODULE);

        if (module != null && mainClass != null) {
            putUnlessNull(bundleParams, CLIOptions.MODULE.getId(),
                    module + "/" + mainClass);
        } else if (module != null) {
            putUnlessNull(bundleParams, CLIOptions.MODULE.getId(),
                    module);
        } else {
            putUnlessNull(bundleParams, CLIOptions.MAIN_JAR.getId(),
                    mainJar);
            putUnlessNull(bundleParams, CLIOptions.APPCLASS.getId(),
                    mainClass);
        }

        putUnlessNull(bundleParams, CLIOptions.NAME.getId(),
                getOptionValue(CLIOptions.NAME));

        putUnlessNull(bundleParams, CLIOptions.VERSION.getId(),
                getOptionValue(CLIOptions.VERSION));

        putUnlessNull(bundleParams, CLIOptions.RELEASE.getId(),
                getOptionValue(CLIOptions.RELEASE));

        putUnlessNull(bundleParams, CLIOptions.LINUX_CATEGORY.getId(),
                getOptionValue(CLIOptions.LINUX_CATEGORY));

        putUnlessNull(bundleParams,
                CLIOptions.WIN_CONSOLE_HINT.getId(),
                getOptionValue(CLIOptions.WIN_CONSOLE_HINT));

        String value = getOptionValue(CLIOptions.ICON);
        putUnlessNull(bundleParams, CLIOptions.ICON.getId(),
                (value == null) ? null : new File(value));

        // "arguments" and "java-options" even if value is null:
        if (allArgs.containsKey(CLIOptions.ARGUMENTS.getId())) {
            String argumentStr = getOptionValue(CLIOptions.ARGUMENTS);
            bundleParams.put(CLIOptions.ARGUMENTS.getId(),
                    Arguments.getArgumentList(argumentStr));
        }

        if (allArgs.containsKey(CLIOptions.JAVA_OPTIONS.getId())) {
            String jvmargsStr = getOptionValue(CLIOptions.JAVA_OPTIONS);
            bundleParams.put(CLIOptions.JAVA_OPTIONS.getId(),
                    Arguments.getArgumentList(jvmargsStr));
        }
    }

    private String getOptionValue(CLIOptions option) {
        if (option == null || allArgs == null) {
            return null;
        }

        String id = option.getId();

        if (allArgs.containsKey(id)) {
            return allArgs.get(id);
        }

        return null;
    }

    Map<String, ? super Object> getLauncherMap() {
        initLauncherMap();
        return bundleParams;
    }

    private void putUnlessNull(Map<String, ? super Object> params,
            String param, Object value) {
        if (value != null) {
            params.put(param, value);
        }
    }

    static Map<String, ? super Object> merge(
            Map<String, ? super Object> original,
            Map<String, ? super Object> additional) {
        Map<String, ? super Object> tmp = new HashMap<>(original);
        if (additional.containsKey(CLIOptions.MODULE.getId())) {
            tmp.remove(CLIOptions.MAIN_JAR.getId());
            tmp.remove(CLIOptions.APPCLASS.getId());
        } else if (additional.containsKey(CLIOptions.MAIN_JAR.getId())) {
            tmp.remove(CLIOptions.MODULE.getId());
        }
        if (additional.containsKey(CLIOptions.ARGUMENTS.getId())) {
            // if add launcher properties file contains "arguments", even with
            // null value, disregard the "arguments" from command line
            tmp.remove(CLIOptions.ARGUMENTS.getId());
        }
        if (additional.containsKey(CLIOptions.JAVA_OPTIONS.getId())) {
            // same thing for java-options
            tmp.remove(CLIOptions.JAVA_OPTIONS.getId());
        }
        tmp.putAll(additional);
        return tmp;
    }

}
