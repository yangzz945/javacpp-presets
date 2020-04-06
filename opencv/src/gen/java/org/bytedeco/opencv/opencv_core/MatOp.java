// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;




///////////////////////////////// Matrix Expressions /////////////////////////////////

@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class MatOp extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MatOp(Pointer p) { super(p); }


    public native @Cast("bool") boolean elementWise(@Const @ByRef MatExpr expr);
    public native void assign(@Const @ByRef MatExpr expr, @ByRef Mat m, int type/*=-1*/);
    public native void assign(@Const @ByRef MatExpr expr, @ByRef Mat m);
    public native void roi(@Const @ByRef MatExpr expr, @Const @ByRef Range rowRange,
                         @Const @ByRef Range colRange, @ByRef MatExpr res);
    public native void diag(@Const @ByRef MatExpr expr, int d, @ByRef MatExpr res);
    public native void augAssignAdd(@Const @ByRef MatExpr expr, @ByRef Mat m);
    public native void augAssignSubtract(@Const @ByRef MatExpr expr, @ByRef Mat m);
    public native void augAssignMultiply(@Const @ByRef MatExpr expr, @ByRef Mat m);
    public native void augAssignDivide(@Const @ByRef MatExpr expr, @ByRef Mat m);
    public native void augAssignAnd(@Const @ByRef MatExpr expr, @ByRef Mat m);
    public native void augAssignOr(@Const @ByRef MatExpr expr, @ByRef Mat m);
    public native void augAssignXor(@Const @ByRef MatExpr expr, @ByRef Mat m);

    public native void add(@Const @ByRef MatExpr expr1, @Const @ByRef MatExpr expr2, @ByRef MatExpr res);
    public native void add(@Const @ByRef MatExpr expr1, @Const @ByRef Scalar s, @ByRef MatExpr res);

    public native void subtract(@Const @ByRef MatExpr expr1, @Const @ByRef MatExpr expr2, @ByRef MatExpr res);
    public native void subtract(@Const @ByRef Scalar s, @Const @ByRef MatExpr expr, @ByRef MatExpr res);

    public native void multiply(@Const @ByRef MatExpr expr1, @Const @ByRef MatExpr expr2, @ByRef MatExpr res, double scale/*=1*/);
    public native void multiply(@Const @ByRef MatExpr expr1, @Const @ByRef MatExpr expr2, @ByRef MatExpr res);
    public native void multiply(@Const @ByRef MatExpr expr1, double s, @ByRef MatExpr res);

    public native void divide(@Const @ByRef MatExpr expr1, @Const @ByRef MatExpr expr2, @ByRef MatExpr res, double scale/*=1*/);
    public native void divide(@Const @ByRef MatExpr expr1, @Const @ByRef MatExpr expr2, @ByRef MatExpr res);
    public native void divide(double s, @Const @ByRef MatExpr expr, @ByRef MatExpr res);

    public native void abs(@Const @ByRef MatExpr expr, @ByRef MatExpr res);

    public native void transpose(@Const @ByRef MatExpr expr, @ByRef MatExpr res);
    public native void matmul(@Const @ByRef MatExpr expr1, @Const @ByRef MatExpr expr2, @ByRef MatExpr res);
    public native void invert(@Const @ByRef MatExpr expr, int method, @ByRef MatExpr res);

    public native @ByVal Size size(@Const @ByRef MatExpr expr);
    public native int type(@Const @ByRef MatExpr expr);
}
