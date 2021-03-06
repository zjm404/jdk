/*
 * Copyright (c) 2011, 2014, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package javafx.scene.effect;

/**
Builder class for javafx.scene.effect.GaussianBlur
@see javafx.scene.effect.GaussianBlur
@deprecated This class is deprecated and will be removed in the next version
* @since JavaFX 2.0
*/
@javax.annotation.Generated("Generated by javafx.builder.processor.BuilderProcessor")
@Deprecated
public class GaussianBlurBuilder<B extends javafx.scene.effect.GaussianBlurBuilder<B>> implements javafx.util.Builder<javafx.scene.effect.GaussianBlur> {
    protected GaussianBlurBuilder() {
    }

    /** Creates a new instance of GaussianBlurBuilder. */
    @SuppressWarnings({"deprecation", "rawtypes", "unchecked"})
    public static javafx.scene.effect.GaussianBlurBuilder<?> create() {
        return new javafx.scene.effect.GaussianBlurBuilder();
    }

    private int __set;
    public void applyTo(javafx.scene.effect.GaussianBlur x) {
        int set = __set;
        if ((set & (1 << 0)) != 0) x.setInput(this.input);
        if ((set & (1 << 1)) != 0) x.setRadius(this.radius);
    }

    private javafx.scene.effect.Effect input;
    /**
    Set the value of the {@link javafx.scene.effect.GaussianBlur#getInput() input} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B input(javafx.scene.effect.Effect x) {
        this.input = x;
        __set |= 1 << 0;
        return (B) this;
    }

    private double radius;
    /**
    Set the value of the {@link javafx.scene.effect.GaussianBlur#getRadius() radius} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B radius(double x) {
        this.radius = x;
        __set |= 1 << 1;
        return (B) this;
    }

    /**
    Make an instance of {@link javafx.scene.effect.GaussianBlur} based on the properties set on this builder.
    */
    public javafx.scene.effect.GaussianBlur build() {
        javafx.scene.effect.GaussianBlur x = new javafx.scene.effect.GaussianBlur();
        applyTo(x);
        return x;
    }
}
