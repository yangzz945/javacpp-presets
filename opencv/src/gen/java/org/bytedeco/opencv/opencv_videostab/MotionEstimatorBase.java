// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_videostab;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;
import org.bytedeco.opencv.opencv_objdetect.*;
import static org.bytedeco.opencv.global.opencv_objdetect.*;
import org.bytedeco.opencv.opencv_ximgproc.*;
import static org.bytedeco.opencv.global.opencv_ximgproc.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;
import org.bytedeco.opencv.opencv_optflow.*;
import static org.bytedeco.opencv.global.opencv_optflow.*;
import org.bytedeco.opencv.opencv_photo.*;
import static org.bytedeco.opencv.global.opencv_photo.*;

import static org.bytedeco.opencv.global.opencv_videostab.*;


/** \brief Base class for all global motion estimation methods.
 */
@Namespace("cv::videostab") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_videostab.class)
public class MotionEstimatorBase extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MotionEstimatorBase(Pointer p) { super(p); }


    /** \brief Sets motion model.
    <p>
    @param val Motion model. See cv::videostab::MotionModel.
     */
    public native void setMotionModel(@Cast("cv::videostab::MotionModel") int val);

    /**
    @return Motion model. See cv::videostab::MotionModel.
    */
    public native @Cast("cv::videostab::MotionModel") int motionModel();

    /** \brief Estimates global motion between two 2D point clouds.
    <p>
    @param points0 Source set of 2D points (32F).
    @param points1 Destination set of 2D points (32F).
    @param ok Indicates whether motion was estimated successfully.
    @return 3x3 2D transformation matrix (32F).
     */
    public native @ByVal Mat estimate(@ByVal Mat points0, @ByVal Mat points1, @Cast("bool*") BoolPointer ok/*=0*/);
    public native @ByVal Mat estimate(@ByVal Mat points0, @ByVal Mat points1);
    public native @ByVal Mat estimate(@ByVal Mat points0, @ByVal Mat points1, @Cast("bool*") boolean[] ok/*=0*/);
    public native @ByVal Mat estimate(@ByVal UMat points0, @ByVal UMat points1, @Cast("bool*") boolean[] ok/*=0*/);
    public native @ByVal Mat estimate(@ByVal UMat points0, @ByVal UMat points1);
    public native @ByVal Mat estimate(@ByVal UMat points0, @ByVal UMat points1, @Cast("bool*") BoolPointer ok/*=0*/);
    public native @ByVal Mat estimate(@ByVal GpuMat points0, @ByVal GpuMat points1, @Cast("bool*") BoolPointer ok/*=0*/);
    public native @ByVal Mat estimate(@ByVal GpuMat points0, @ByVal GpuMat points1);
    public native @ByVal Mat estimate(@ByVal GpuMat points0, @ByVal GpuMat points1, @Cast("bool*") boolean[] ok/*=0*/);
}
