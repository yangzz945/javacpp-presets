// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_cudaarithm;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;

import static org.bytedeco.opencv.global.opencv_cudaarithm.*;


/** \brief Base class for transform using lookup table.
 */
@Namespace("cv::cuda") @Properties(inherit = org.bytedeco.opencv.presets.opencv_cudaarithm.class)
public class LookUpTable extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LookUpTable(Pointer p) { super(p); }

    /** \brief Transforms the source matrix into the destination matrix using the given look-up table:
    dst(I) = lut(src(I)) .
    <p>
    @param src Source matrix. CV_8UC1 and CV_8UC3 matrices are supported for now.
    @param dst Destination matrix.
    @param stream Stream for the asynchronous version.
     */
    public native void transform(@ByVal Mat src, @ByVal Mat dst, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void transform(@ByVal Mat src, @ByVal Mat dst);
    public native void transform(@ByVal UMat src, @ByVal UMat dst, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void transform(@ByVal UMat src, @ByVal UMat dst);
    public native void transform(@ByVal GpuMat src, @ByVal GpuMat dst, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void transform(@ByVal GpuMat src, @ByVal GpuMat dst);
}
