/*
 * Copyright (c) 2011, 2013, Oracle and/or its affiliates. All rights reserved.
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

package javafx.scene.transform;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.DoublePropertyBase;

import com.sun.javafx.geom.transform.Affine3D;
import com.sun.javafx.geom.transform.BaseTransform;
import javafx.geometry.Point2D;
import javafx.geometry.Point3D;


/**
 * This class represents an {@code Affine} object that translates coordinates
 * by the specified factors. The matrix representing the translating
 * transformation is as follows:
 * <pre>
 *              [   1    0    0    x  ]
 *              [   0    1    0    y  ]
 *              [   0    0    1    z  ]
 * </pre>
 * @since JavaFX 2.0
 */

public class Translate extends Transform {

    /**
     * Creates a default Translate (identity).
     */
    public Translate() {
    }

    /**
     * Creates a two-dimensional Translate.
     * @param x the distance by which coordinates are translated in the
     * X axis direction
     * @param y the distance by which coordinates are translated in the
     * Y axis direction
     */
    public Translate(double x, double y) {
        setX(x);
        setY(y);
    }

    /**
     * Creates a three-dimensional Translate.
     * @param x the distance by which coordinates are translated in the
     * X axis direction
     * @param y the distance by which coordinates are translated in the
     * Y axis direction
     * @param z the distance by which coordinates are translated in the
     * Z axis direction
     */
    public Translate(double x, double y, double z) {
        this(x, y);
        setZ(z);
    }

    /**
     * Defines the distance by which coordinates are translated in the
     * X axis direction
     */
    private DoubleProperty x;


    public final void setX(double value) {
        xProperty().set(value);
    }

    public final double getX() {
        return x == null ? 0.0 : x.get();
    }

    public final DoubleProperty xProperty() {
        if (x == null) {
            x = new DoublePropertyBase() {

                @Override
                public void invalidated() {
                    transformChanged();
                }

                @Override
                public Object getBean() {
                    return Translate.this;
                }

                @Override
                public String getName() {
                    return "x";
                }
            };
        }
        return x;
    }

    /**
     * Defines the distance by which coordinates are translated in the
     * Y axis direction
     */
    private DoubleProperty y;


    public final void setY(double value) {
        yProperty().set(value);
    }

    public final double getY() {
        return y == null ? 0.0 : y.get();
    }

    public final DoubleProperty yProperty() {
        if (y == null) {
            y = new DoublePropertyBase() {

                @Override
                public void invalidated() {
                    transformChanged();
                }

                @Override
                public Object getBean() {
                    return Translate.this;
                }

                @Override
                public String getName() {
                    return "y";
                }
            };
        }
        return y;
    }

    /**
     * Defines the distance by which coordinates are translated in the
     * Z axis direction
     */
    private DoubleProperty z;


    public final void setZ(double value) {
        zProperty().set(value);
    }

    public final double getZ() {
        return z == null ? 0.0 : z.get();
    }

    public final DoubleProperty zProperty() {
        if (z == null) {
            z = new DoublePropertyBase() {

                @Override
                public void invalidated() {
                    transformChanged();
                }

                @Override
                public Object getBean() {
                    return Translate.this;
                }

                @Override
                public String getName() {
                    return "z";
                }
            };
        }
        return z;
    }

    /* *************************************************************************
     *                                                                         *
     *                         Element getters                                 *
     *                                                                         *
     **************************************************************************/

    @Override
    public double getTx() {
        return getX();
    }

    @Override
    public double getTy() {
        return getY();
    }

    @Override
    public double getTz() {
        return getZ();
    }

    /* *************************************************************************
     *                                                                         *
     *                           State getters                                 *
     *                                                                         *
     **************************************************************************/

    @Override
    boolean computeIs2D() {
        return getZ() == 0.0;
    }

    @Override
    boolean computeIsIdentity() {
        return getX() == 0.0 && getY() == 0.0 && getZ() == 0.0;
    }

    /* *************************************************************************
     *                                                                         *
     *                           Array getters                                 *
     *                                                                         *
     **************************************************************************/

    @Override
    void fill2DArray(double[] array) {
        array[0] = 1.0;
        array[1] = 0.0;
        array[2] = getX();
        array[3] = 0.0;
        array[4] = 1.0;
        array[5] = getY();
    }

    @Override
    void fill3DArray(double[] array) {
        array[0] = 1.0;
        array[1] = 0.0;
        array[2] = 0.0;
        array[3] = getX();
        array[4] = 0.0;
        array[5] = 1.0;
        array[6] = 0.0;
        array[7] = getY();
        array[8] = 0.0;
        array[9] = 0.0;
        array[10] = 1.0;
        array[11] = getZ();
    }

    /* *************************************************************************
     *                                                                         *
     *                         Transform creators                              *
     *                                                                         *
     **************************************************************************/

    @Override
    public Transform createConcatenation(Transform transform) {
        if (transform instanceof Translate) {
            final Translate t = (Translate) transform;
            return new Translate(
                    getX() + t.getX(),
                    getY() + t.getY(),
                    getZ() + t.getZ());
        }

        if (transform instanceof Scale) {
            final Scale s = (Scale) transform;

            final double sx = s.getX();
            final double sy = s.getY();
            final double sz = s.getZ();

            final double tx = getX();
            final double ty = getY();
            final double tz = getZ();

            if ((tx == 0.0 || sx != 1.0) &&
                    (ty == 0.0 || sy != 1.0) &&
                    (tz == 0.0 || sz != 1.0)) {
                return new Scale(
                        sx, sy, sz,
                        s.getPivotX() + (sx == 1.0 ? 0 : tx / (1.0 - sx)),
                        s.getPivotY() + (sy == 1.0 ? 0 : ty / (1.0 - sy)),
                        s.getPivotZ() + (sz == 1.0 ? 0 : tz / (1.0 - sz)));
            }
        }

        if (transform instanceof Affine) {
            Affine a = (Affine) transform.clone();
            a.prepend(this);
            return a;
        }

        final double txx = transform.getMxx();
        final double txy = transform.getMxy();
        final double txz = transform.getMxz();
        final double ttx = transform.getTx();
        final double tyx = transform.getMyx();
        final double tyy = transform.getMyy();
        final double tyz = transform.getMyz();
        final double tty = transform.getTy();
        final double tzx = transform.getMzx();
        final double tzy = transform.getMzy();
        final double tzz = transform.getMzz();
        final double ttz = transform.getTz();
        return new Affine(
                txx, txy, txz, ttx + getX(),
                tyx, tyy, tyz, tty + getY(),
                tzx, tzy, tzz, ttz + getZ());
    }

    @Override
    public Translate createInverse() {
        return new Translate(-getX(), -getY(), -getZ());
    }

    @Override
    public Translate clone() {
        return new Translate(getX(), getY(), getZ());
    }

    /* *************************************************************************
     *                                                                         *
     *                     Transform, Inverse Transform                        *
     *                                                                         *
     **************************************************************************/

    @Override
    public Point2D transform(double x, double y) {
        ensureCanTransform2DPoint();
        return new Point2D(
                x + getX(),
                y + getY());
    }

    @Override
    public Point3D transform(double x, double y, double z) {
        return new Point3D(
                x + getX(),
                y + getY(),
                z + getZ());
    }

    @Override
    void transform2DPointsImpl(double[] srcPts, int srcOff,
            double[] dstPts, int dstOff, int numPts) {
        final double tx = getX();
        final double ty = getY();

        while (--numPts >= 0) {
            final double x = srcPts[srcOff++];
            final double y = srcPts[srcOff++];

            dstPts[dstOff++] = x + tx;
            dstPts[dstOff++] = y + ty;
        }
    }

    @Override
    void transform3DPointsImpl(double[] srcPts, int srcOff,
            double[] dstPts, int dstOff, int numPts) {

        final double tx = getX();
        final double ty = getY();
        final double tz = getZ();

        while (--numPts >= 0) {
            final double x = srcPts[srcOff++];
            final double y = srcPts[srcOff++];
            final double z = srcPts[srcOff++];

            dstPts[dstOff++] = x + tx;
            dstPts[dstOff++] = y + ty;
            dstPts[dstOff++] = z + tz;
        }
    }

    @Override
    public Point2D deltaTransform(double x, double y) {
        ensureCanTransform2DPoint();
        return new Point2D(x, y);
    }

    @Override
    public Point2D deltaTransform(Point2D point) {
        if (point == null) {
            throw new NullPointerException();
        }
        ensureCanTransform2DPoint();
        return point;
    }

    @Override
    public Point3D deltaTransform(double x, double y, double z) {
        return new Point3D(x, y, z);
    }

    @Override
    public Point3D deltaTransform(Point3D point) {
        if (point == null) {
            throw new NullPointerException();
        }
        return point;
    }

    @Override
    public Point2D inverseTransform(double x, double y) {
        ensureCanTransform2DPoint();
        return new Point2D(
                x - getX(),
                y - getY());
    }

    @Override
    public Point3D inverseTransform(double x, double y, double z) {
        return new Point3D(
                x - getX(),
                y - getY(),
                z - getZ());
    }

    @Override
    void inverseTransform2DPointsImpl(double[] srcPts, int srcOff,
            double[] dstPts, int dstOff, int numPts) {
        final double tx = getX();
        final double ty = getY();

        while (--numPts >= 0) {
            dstPts[dstOff++] = srcPts[srcOff++] - tx;
            dstPts[dstOff++] = srcPts[srcOff++] - ty;
        }
    }

    @Override
    void inverseTransform3DPointsImpl(double[] srcPts, int srcOff,
            double[] dstPts, int dstOff, int numPts) {

        final double tx = getX();
        final double ty = getY();
        final double tz = getZ();

        while (--numPts >= 0) {
            dstPts[dstOff++] = srcPts[srcOff++] - tx;
            dstPts[dstOff++] = srcPts[srcOff++] - ty;
            dstPts[dstOff++] = srcPts[srcOff++] - tz;
        }
    }

    @Override
    public Point2D inverseDeltaTransform(double x, double y) {
        ensureCanTransform2DPoint();
        return new Point2D(x, y);
    }

    @Override
    public Point2D inverseDeltaTransform(Point2D point) {
        if (point == null) {
            throw new NullPointerException();
        }
        ensureCanTransform2DPoint();
        return point;
    }

    @Override
    public Point3D inverseDeltaTransform(double x, double y, double z) {
        return new Point3D(x, y, z);
    }

    @Override
    public Point3D inverseDeltaTransform(Point3D point) {
        if (point == null) {
            throw new NullPointerException();
        }
        return point;
    }

    /* *************************************************************************
     *                                                                         *
     *                               Other API                                 *
     *                                                                         *
     **************************************************************************/

    /**
     * Returns a string representation of this {@code Translate} object.
     * @return a string representation of this {@code Translate} object.
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Translate [");

        sb.append("x=").append(getX());
        sb.append(", y=").append(getY());
        sb.append(", z=").append(getZ());

        return sb.append("]").toString();
    }

    /* *************************************************************************
     *                                                                         *
     *                    Internal implementation stuff                        *
     *                                                                         *
     **************************************************************************/

    /**
     * @treatAsPrivate implementation detail
     * @deprecated This is an internal API that is not intended for use and will be removed in the next version
     */
    @Deprecated
    @Override
    public void impl_apply(final Affine3D trans) {
        trans.translate(getX(), getY(), getZ());
    }

    /**
     * @treatAsPrivate implementation detail
     * @deprecated This is an internal API that is not intended for use and will be removed in the next version
     */
    @Deprecated
    @Override
    public BaseTransform impl_derive(final BaseTransform trans) {
        return trans.deriveWithTranslation(getX(), getY(), getZ());
    }

    @Override
    void validate() {
        getX();
        getY();
        getZ();
    }

    @Override
    void appendTo(Affine a) {
        a.appendTranslation(getTx(), getTy(), getTz());
    }

    @Override
    void prependTo(Affine a) {
        a.prependTranslation(getTx(), getTy(), getTz());
    }
}
