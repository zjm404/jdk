/*
 * Copyright (c) 2012, 2020, Oracle and/or its affiliates. All rights reserved.
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

/*
 * COPYRIGHT AND PERMISSION NOTICE
 *
 * Copyright (C) 1991-2016 Unicode, Inc. All rights reserved.
 * Distributed under the Terms of Use in 
 * http://www.unicode.org/copyright.html.
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of the Unicode data files and any associated documentation
 * (the "Data Files") or Unicode software and any associated documentation
 * (the "Software") to deal in the Data Files or Software
 * without restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, and/or sell copies of
 * the Data Files or Software, and to permit persons to whom the Data Files
 * or Software are furnished to do so, provided that
 * (a) this copyright and permission notice appear with all copies 
 * of the Data Files or Software,
 * (b) this copyright and permission notice appear in associated 
 * documentation, and
 * (c) there is clear notice in each modified Data File or in the Software
 * as well as in the documentation associated with the Data File(s) or
 * Software that the data or software has been modified.
 *
 * THE DATA FILES AND SOFTWARE ARE PROVIDED "AS IS", WITHOUT WARRANTY OF
 * ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT OF THIRD PARTY RIGHTS.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR HOLDERS INCLUDED IN THIS
 * NOTICE BE LIABLE FOR ANY CLAIM, OR ANY SPECIAL INDIRECT OR CONSEQUENTIAL
 * DAMAGES, OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE,
 * DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER
 * TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR
 * PERFORMANCE OF THE DATA FILES OR SOFTWARE.
 *
 * Except as contained in this notice, the name of a copyright holder
 * shall not be used in advertising or otherwise to promote the sale,
 * use or other dealings in these Data Files or Software without prior
 * written authorization of the copyright holder.
 */

package sun.text.resources.cldr.ext;

import java.util.ListResourceBundle;

public class FormatData_zh_Hant extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_MonthNames = new String[] {
               "1\u6708",
               "2\u6708",
               "3\u6708",
               "4\u6708",
               "5\u6708",
               "6\u6708",
               "7\u6708",
               "8\u6708",
               "9\u6708",
               "10\u6708",
               "11\u6708",
               "12\u6708",
               "",
            };
        final String[] metaValue_MonthNarrows = new String[] {
               "1",
               "2",
               "3",
               "4",
               "5",
               "6",
               "7",
               "8",
               "9",
               "10",
               "11",
               "12",
               "",
            };
        final String[] metaValue_DayNames = new String[] {
               "\u661f\u671f\u65e5",
               "\u661f\u671f\u4e00",
               "\u661f\u671f\u4e8c",
               "\u661f\u671f\u4e09",
               "\u661f\u671f\u56db",
               "\u661f\u671f\u4e94",
               "\u661f\u671f\u516d",
            };
        final String[] metaValue_DayAbbreviations = new String[] {
               "\u9031\u65e5",
               "\u9031\u4e00",
               "\u9031\u4e8c",
               "\u9031\u4e09",
               "\u9031\u56db",
               "\u9031\u4e94",
               "\u9031\u516d",
            };
        final String[] metaValue_DayNarrows = new String[] {
               "\u65e5",
               "\u4e00",
               "\u4e8c",
               "\u4e09",
               "\u56db",
               "\u4e94",
               "\u516d",
            };
        final String[] metaValue_QuarterNames = new String[] {
               "\u7b2c1\u5b63",
               "\u7b2c2\u5b63",
               "\u7b2c3\u5b63",
               "\u7b2c4\u5b63",
            };
        final String[] metaValue_QuarterNarrows = new String[] {
               "1",
               "2",
               "3",
               "4",
            };
        final String[] metaValue_AmPmMarkers = new String[] {
               "\u4e0a\u5348",
               "\u4e0b\u5348",
            };
        final String[] metaValue_long_Eras = new String[] {
               "\u897f\u5143\u524d",
               "\u897f\u5143",
            };
        final String[] metaValue_TimePatterns = new String[] {
               "ah:mm:ss [zzzz]",
               "ah:mm:ss [z]",
               "ah:mm:ss",
               "ah:mm",
            };
        final String[] metaValue_java_time_buddhist_long_Eras = new String[] {
               "BC",
               "\u4f5b\u66c6",
            };
        final String[] metaValue_java_time_buddhist_DatePatterns = new String[] {
               "Gy\u5e74M\u6708d\u65e5EEEE",
               "Gy\u5e74M\u6708d\u65e5",
               "Gy\u5e74M\u6708d\u65e5",
               "Gy/M/d",
            };
        final String[] metaValue_buddhist_DatePatterns = new String[] {
               "GGGGy\u5e74M\u6708d\u65e5EEEE",
               "GGGGy\u5e74M\u6708d\u65e5",
               "GGGGy\u5e74M\u6708d\u65e5",
               "GGGGy/M/d",
            };
        final String[] metaValue_buddhist_DateTimePatterns = new String[] {
               "{1}{0}",
               "{1} {0}",
               "{1} {0}",
               "{1} {0}",
            };
        final String[] metaValue_java_time_japanese_long_Eras = new String[] {
               "\u897f\u5143",
               "\u660e\u6cbb",
               "\u5927\u6b63",
               "\u662d\u548c",
               "\u5e73\u6210",
               "\u4ee4\u548c",
            };
        final String[] metaValue_java_time_roc_long_Eras = new String[] {
               "\u6c11\u570b\u524d",
               "\u6c11\u570b",
            };
        final String[] metaValue_islamic_MonthNames = new String[] {
               "\u7a46\u54c8\u862d\u59c6\u6708",
               "\u8272\u6cd5\u723e\u6708",
               "\u8cf4\u6bd4\u6708 I",
               "\u8cf4\u6bd4\u6708 II",
               "\u4e3b\u99ac\u9054\u6708 I",
               "\u4e3b\u99ac\u9054\u6708 II",
               "\u8cf4\u54f2\u535c\u6708",
               "\u820d\u723e\u90a6\u6708",
               "\u8cf4\u8cb7\u4e39\u6708",
               "\u9583\u74e6\u9b6f\u6708",
               "\u90fd\u723e\u5580\u723e\u5fb7\u6708",
               "\u90fd\u723e\u9ed1\u54f2\u6708",
               "",
            };
        final String[] metaValue_java_time_islamic_long_Eras = new String[] {
               "",
               "\u4f0a\u65af\u862d\u66c6",
            };
        final String metaValue_calendarname_gregorian = "\u516c\u66c6";
        final String[] metaValue_arabext_NumberPatterns = new String[] {
               "#,##0.###",
               "\u00a4#,##0.00",
               "#,##0%",
               "\u00a4#,##0.00;(\u00a4#,##0.00)",
            };
        final String[] metaValue_brah_NumberElements = new String[] {
               ".",
               ",",
               ";",
               "%",
               "0",
               "#",
               "-",
               "E",
               "\u2030",
               "\u221e",
               "\u975e\u6578\u503c",
            };
        final String[] metaValue_short_CompactNumberPatterns = new String[] {
               "",
               "",
               "",
               "{other:0}",
               "{other:0\u842c}",
               "{other:00\u842c}",
               "{other:000\u842c}",
               "{other:0000\u842c}",
               "{other:0\u5104}",
               "{other:00\u5104}",
               "{other:000\u5104}",
               "{other:0000\u5104}",
               "{other:0\u5146}",
               "{other:00\u5146}",
               "{other:000\u5146}",
            };
        final Object[][] data = new Object[][] {
            { "MonthNames", metaValue_MonthNames },
            { "calendarname.islamic-umalqura", "\u70cf\u59c6\u5eab\u62c9\u66c6" },
            { "buddhist.narrow.Eras", metaValue_java_time_buddhist_long_Eras },
            { "osma.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "roc.QuarterNames", metaValue_QuarterNames },
            { "lana.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u1a80",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "\u975e\u6578\u503c",
                }
            },
            { "calendarname.islamic-civil", "\u4f0a\u65af\u862d\u6c11\u7528\u66c6" },
            { "talu.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u19d0",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "\u975e\u6578\u503c",
                }
            },
            { "gonm.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "abbreviated.AmPmMarkers", metaValue_AmPmMarkers },
            { "mtei.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\uabf0",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "\u975e\u6578\u503c",
                }
            },
            { "japanese.MonthNames", metaValue_MonthNames },
            { "standalone.DayAbbreviations", metaValue_DayAbbreviations },
            { "islamic.DayNames", metaValue_DayNames },
            { "buddhist.MonthAbbreviations", metaValue_MonthNames },
            { "cakm.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "DateTimePatterns",
                new String[] {
                    "{1} {0}",
                    "{1} {0}",
                    "{1} {0}",
                    "{1} {0}",
                }
            },
            { "narrow.AmPmMarkers", metaValue_AmPmMarkers },
            { "latn.NumberElements", metaValue_brah_NumberElements },
            { "guru.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u0a66",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "\u975e\u6578\u503c",
                }
            },
            { "field.minute", "\u5206\u9418" },
            { "buddhist.AmPmMarkers", metaValue_AmPmMarkers },
            { "bali.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "cham.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\uaa50",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "\u975e\u6578\u503c",
                }
            },
            { "islamic.MonthNames", metaValue_islamic_MonthNames },
            { "japanese.QuarterNarrows", metaValue_QuarterNarrows },
            { "saur.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "arab.NumberElements",
                new String[] {
                    "\u066b",
                    "\u066c",
                    "\u061b",
                    "\u066a\u061c",
                    "\u0660",
                    "#",
                    "-",
                    "\u0627\u0633",
                    "\u0609",
                    "\u221e",
                    "\u975e\u6578\u503c",
                }
            },
            { "beng.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "shrd.NumberElements", metaValue_brah_NumberElements },
            { "takr.NumberElements", metaValue_brah_NumberElements },
            { "islamic.DatePatterns", metaValue_buddhist_DatePatterns },
            { "deva.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u0966",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "\u975e\u6578\u503c",
                }
            },
            { "islamic.Eras", metaValue_java_time_islamic_long_Eras },
            { "sund.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "arabext.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "field.second", "\u79d2" },
            { "islamic.MonthNarrows",
                new String[] {
                    "1",
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9",
                    "10",
                    "11",
                    "12",
                    "",
                }
            },
            { "vaii.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "roc.DatePatterns",
                new String[] {
                    "GGGGy\u5e74M\u6708d\u65e5 EEEE",
                    "GGGGy\u5e74M\u6708d\u65e5",
                    "GGGGy\u5e74M\u6708d\u65e5",
                    "GGGGy/M/d",
                }
            },
            { "calendarname.islamic", "\u4f0a\u65af\u862d\u66c6" },
            { "java.time.roc.long.Eras", metaValue_java_time_roc_long_Eras },
            { "buddhist.TimePatterns", metaValue_TimePatterns },
            { "brah.NumberElements", metaValue_brah_NumberElements },
            { "standalone.MonthAbbreviations", metaValue_MonthNames },
            { "timezone.regionFormat", "{0}\u6642\u9593" },
            { "olck.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u1c50",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "\u975e\u6578\u503c",
                }
            },
            { "japanese.MonthNarrows", metaValue_MonthNarrows },
            { "tibt.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "khmr.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "roc.DayAbbreviations", metaValue_DayAbbreviations },
            { "java.time.buddhist.long.Eras", metaValue_java_time_buddhist_long_Eras },
            { "orya.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "mymrshan.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u1090",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "\u975e\u6578\u503c",
                }
            },
            { "islamic.AmPmMarkers", metaValue_AmPmMarkers },
            { "buddhist.long.Eras", metaValue_java_time_buddhist_long_Eras },
            { "java.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\ua9d0",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "\u975e\u6578\u503c",
                }
            },
            { "TimePatterns", metaValue_TimePatterns },
            { "islamic.DayNarrows", metaValue_DayNarrows },
            { "hanidec.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "roc.narrow.Eras", metaValue_java_time_roc_long_Eras },
            { "laoo.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u0ed0",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "\u975e\u6578\u503c",
                }
            },
            { "sund.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u1bb0",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "\u975e\u6578\u503c",
                }
            },
            { "telu.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "buddhist.narrow.AmPmMarkers", metaValue_AmPmMarkers },
            { "kali.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\ua900",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "\u975e\u6578\u503c",
                }
            },
            { "roc.DayNames", metaValue_DayNames },
            { "QuarterNarrows", metaValue_QuarterNarrows },
            { "lanatham.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "japanese.MonthAbbreviations", metaValue_MonthNames },
            { "islamic.DayAbbreviations", metaValue_DayAbbreviations },
            { "islamic.long.Eras", metaValue_java_time_islamic_long_Eras },
            { "java.time.islamic.Eras", metaValue_java_time_islamic_long_Eras },
            { "java.time.buddhist.Eras", metaValue_java_time_buddhist_long_Eras },
            { "mong.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "tamldec.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "mymr.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "nkoo.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u07c0",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "\u975e\u6578\u503c",
                }
            },
            { "cakm.NumberElements", metaValue_brah_NumberElements },
            { "tibt.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u0f20",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "\u975e\u6578\u503c",
                }
            },
            { "DayNames", metaValue_DayNames },
            { "buddhist.DatePatterns", metaValue_buddhist_DatePatterns },
            { "java.time.japanese.Eras", metaValue_java_time_japanese_long_Eras },
            { "roc.MonthNames", metaValue_MonthNames },
            { "sora.NumberElements", metaValue_brah_NumberElements },
            { "buddhist.DateTimePatterns", metaValue_buddhist_DateTimePatterns },
            { "gujr.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u0ae6",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "\u975e\u6578\u503c",
                }
            },
            { "buddhist.MonthNarrows", metaValue_MonthNarrows },
            { "limb.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u1946",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "\u975e\u6578\u503c",
                }
            },
            { "roc.DayNarrows", metaValue_DayNarrows },
            { "shrd.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "mlym.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "calendarname.gregorian", metaValue_calendarname_gregorian },
            { "java.time.buddhist.narrow.Eras", metaValue_java_time_buddhist_long_Eras },
            { "DatePatterns",
                new String[] {
                    "y\u5e74M\u6708d\u65e5 EEEE",
                    "y\u5e74M\u6708d\u65e5",
                    "y\u5e74M\u6708d\u65e5",
                    "y/M/d",
                }
            },
            { "islamic.TimePatterns", metaValue_TimePatterns },
            { "japanese.DateTimePatterns",
                new String[] {
                    "",
                    "{1} {0}",
                    "{1} {0}",
                    "{1} {0}",
                }
            },
            { "MonthAbbreviations", metaValue_MonthNames },
            { "standalone.DayNames", metaValue_DayNames },
            { "vaii.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\ua620",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "\u975e\u6578\u503c",
                }
            },
            { "QuarterAbbreviations", metaValue_QuarterNames },
            { "calendarname.gregory", metaValue_calendarname_gregorian },
            { "java.time.japanese.narrow.Eras", metaValue_java_time_japanese_long_Eras },
            { "field.year", "\u5e74" },
            { "arabext.NumberElements",
                new String[] {
                    "\u066b",
                    "\u066c",
                    "\u061b",
                    "\u066a",
                    "\u06f0",
                    "#",
                    "\u200e-\u200e",
                    "\u00d7\u06f1\u06f0^",
                    "\u0609",
                    "\u221e",
                    "\u975e\u6578\u503c",
                }
            },
            { "japanese.AmPmMarkers", metaValue_AmPmMarkers },
            { "AmPmMarkers", metaValue_AmPmMarkers },
            { "java.time.japanese.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "standalone.QuarterAbbreviations", metaValue_QuarterNames },
            { "mtei.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "japanese.narrow.Eras", metaValue_java_time_japanese_long_Eras },
            { "roc.MonthNarrows", metaValue_MonthNarrows },
            { "islamic.narrow.AmPmMarkers", metaValue_AmPmMarkers },
            { "takr.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "mymr.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u1040",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "\u975e\u6578\u503c",
                }
            },
            { "japanese.TimePatterns", metaValue_TimePatterns },
            { "narrow.Eras", metaValue_long_Eras },
            { "roc.long.Eras", metaValue_java_time_roc_long_Eras },
            { "tamldec.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u0be6",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "\u975e\u6578\u503c",
                }
            },
            { "japanese.abbreviated.AmPmMarkers", metaValue_AmPmMarkers },
            { "calendarname.japanese", "\u65e5\u672c\u66c6" },
            { "roc.MonthAbbreviations", metaValue_MonthNames },
            { "java.time.islamic.narrow.Eras", metaValue_java_time_islamic_long_Eras },
            { "beng.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u09e6",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "\u975e\u6578\u503c",
                }
            },
            { "long.Eras", metaValue_long_Eras },
            { "roc.QuarterNarrows", metaValue_QuarterNarrows },
            { "saur.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\ua8d0",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "\u975e\u6578\u503c",
                }
            },
            { "buddhist.MonthNames", metaValue_MonthNames },
            { "MonthNarrows", metaValue_MonthNarrows },
            { "japanese.DatePatterns", metaValue_buddhist_DatePatterns },
            { "buddhist.DayNames", metaValue_DayNames },
            { "japanese.long.Eras", metaValue_java_time_japanese_long_Eras },
            { "field.era", "\u5e74\u4ee3" },
            { "field.dayperiod", "\u4e0a\u5348/\u4e0b\u5348" },
            { "lana.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "calendarname.roc", "\u6c11\u570b\u66c6" },
            { "field.month", "\u6708" },
            { "osma.NumberElements", metaValue_brah_NumberElements },
            { "java.time.japanese.long.Eras", metaValue_java_time_japanese_long_Eras },
            { "roc.Eras", metaValue_java_time_roc_long_Eras },
            { "DayAbbreviations", metaValue_DayAbbreviations },
            { "DayNarrows", metaValue_DayNarrows },
            { "gonm.NumberElements", metaValue_brah_NumberElements },
            { "guru.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "knda.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u0ce6",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "\u975e\u6578\u503c",
                }
            },
            { "bali.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u1b50",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "\u975e\u6578\u503c",
                }
            },
            { "java.time.roc.narrow.Eras", metaValue_java_time_roc_long_Eras },
            { "japanese.narrow.AmPmMarkers", metaValue_AmPmMarkers },
            { "sora.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "long.CompactNumberPatterns", metaValue_short_CompactNumberPatterns },
            { "buddhist.QuarterNarrows", metaValue_QuarterNarrows },
            { "roc.narrow.AmPmMarkers", metaValue_AmPmMarkers },
            { "standalone.QuarterNames", metaValue_QuarterNames },
            { "standalone.DayNarrows", metaValue_DayNarrows },
            { "mlym.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u0d66",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "\u975e\u6578\u503c",
                }
            },
            { "lepc.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u1c40",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "\u975e\u6578\u503c",
                }
            },
            { "gujr.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "fullwide.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\uff10",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "\u975e\u6578\u503c",
                }
            },
            { "limb.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "java.time.roc.Eras", metaValue_java_time_roc_long_Eras },
            { "khmr.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u17e0",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "\u975e\u6578\u503c",
                }
            },
            { "field.zone", "\u6642\u5340" },
            { "roc.DateTimePatterns", metaValue_buddhist_DateTimePatterns },
            { "arab.NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "#,##0.00\u00a0\u00a4",
                    "#,##0%",
                    "",
                }
            },
            { "thai.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u0e50",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "\u975e\u6578\u503c",
                }
            },
            { "buddhist.abbreviated.AmPmMarkers", metaValue_AmPmMarkers },
            { "Eras", metaValue_long_Eras },
            { "hanidec.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "0",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "lepc.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "islamic.QuarterNames", metaValue_QuarterNames },
            { "mymrshan.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "islamic.abbreviated.AmPmMarkers", metaValue_AmPmMarkers },
            { "nkoo.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "mong.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u1810",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "\u975e\u6578\u503c",
                }
            },
            { "java.time.islamic.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "field.weekday", "\u9031\u5929" },
            { "islamic.DateTimePatterns", metaValue_buddhist_DateTimePatterns },
            { "brah.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "java.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "thai.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "fullwide.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "japanese.QuarterNames", metaValue_QuarterNames },
            { "telu.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u0c66",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "\u975e\u6578\u503c",
                }
            },
            { "olck.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "japanese.DayNames", metaValue_DayNames },
            { "knda.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "japanese.DayAbbreviations", metaValue_DayAbbreviations },
            { "lanatham.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u1a90",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "\u975e\u6578\u503c",
                }
            },
            { "buddhist.Eras", metaValue_java_time_buddhist_long_Eras },
            { "laoo.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "talu.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "field.week", "\u9031" },
            { "buddhist.QuarterNames", metaValue_QuarterNames },
            { "islamic.QuarterNarrows", metaValue_QuarterNarrows },
            { "orya.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u0b66",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "\u975e\u6578\u503c",
                }
            },
            { "roc.AmPmMarkers", metaValue_AmPmMarkers },
            { "java.time.roc.DatePatterns",
                new String[] {
                    "Gy\u5e74M\u6708d\u65e5 EEEE",
                    "Gy\u5e74M\u6708d\u65e5",
                    "Gy\u5e74M\u6708d\u65e5",
                    "Gy/M/d",
                }
            },
            { "short.CompactNumberPatterns", metaValue_short_CompactNumberPatterns },
            { "buddhist.DayAbbreviations", metaValue_DayAbbreviations },
            { "cham.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "field.hour", "\u5c0f\u6642" },
            { "islamic.MonthAbbreviations", metaValue_islamic_MonthNames },
            { "islamic.narrow.Eras", metaValue_java_time_islamic_long_Eras },
            { "calendarname.buddhist", "\u4f5b\u66c6" },
            { "kali.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "standalone.MonthNames", metaValue_MonthNames },
            { "latn.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "buddhist.DayNarrows", metaValue_DayNarrows },
            { "java.time.islamic.long.Eras", metaValue_java_time_islamic_long_Eras },
            { "japanese.DayNarrows", metaValue_DayNarrows },
            { "QuarterNames", metaValue_QuarterNames },
            { "roc.TimePatterns", metaValue_TimePatterns },
            { "japanese.Eras", metaValue_java_time_japanese_long_Eras },
            { "deva.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "roc.abbreviated.AmPmMarkers", metaValue_AmPmMarkers },
        };
        return data;
    }
}
