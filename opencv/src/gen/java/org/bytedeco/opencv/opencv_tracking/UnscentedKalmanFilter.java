// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_tracking;

import org.bytedeco.javacpp.annotation.Index;
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
import org.bytedeco.opencv.opencv_plot.*;
import static org.bytedeco.opencv.global.opencv_plot.*;
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
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;

import static org.bytedeco.opencv.global.opencv_tracking.*;


/** \brief The interface for Unscented Kalman filter and Augmented Unscented Kalman filter.
*/
@Namespace("cv::tracking") @Properties(inherit = org.bytedeco.opencv.presets.opencv_tracking.class)
public class UnscentedKalmanFilter extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public UnscentedKalmanFilter(Pointer p) { super(p); }


    /** The function performs prediction step of the algorithm
    * @param control - the current control vector,
    * @return the predicted estimate of the state.
    */
    public native @ByVal Mat predict( @ByVal(nullValue = "cv::InputArray(cv::noArray())") Mat control );
    public native @ByVal Mat predict( );
    public native @ByVal Mat predict( @ByVal(nullValue = "cv::InputArray(cv::noArray())") UMat control );
    public native @ByVal Mat predict( @ByVal(nullValue = "cv::InputArray(cv::noArray())") GpuMat control );

    /** The function performs correction step of the algorithm
    * @param measurement - the current measurement vector,
    * @return the corrected estimate of the state.
    */
    public native @ByVal Mat correct( @ByVal Mat measurement );
    public native @ByVal Mat correct( @ByVal UMat measurement );
    public native @ByVal Mat correct( @ByVal GpuMat measurement );

    /**
    * @return the process noise cross-covariance matrix.
    */
    public native @ByVal Mat getProcessNoiseCov();

    /**
    * @return the measurement noise cross-covariance matrix.
    */
    public native @ByVal Mat getMeasurementNoiseCov();

    /**
    * @return the error cross-covariance matrix.
    */
    public native @ByVal Mat getErrorCov();

    /**
    * @return the current estimate of the state.
    */
    public native @ByVal Mat getState();
}
