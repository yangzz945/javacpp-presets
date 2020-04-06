// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_xfeatures2d;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_ml.*;
import static org.bytedeco.opencv.global.opencv_ml.*;
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
import org.bytedeco.opencv.opencv_shape.*;
import static org.bytedeco.opencv.global.opencv_shape.*;

import static org.bytedeco.opencv.global.opencv_xfeatures2d.*;


/**
 * \brief Class implementing the Harris-Laplace feature detector as described in \cite Mikolajczyk2004.
 */
@Namespace("cv::xfeatures2d") @Properties(inherit = org.bytedeco.opencv.presets.opencv_xfeatures2d.class)
public class HarrisLaplaceFeatureDetector extends Feature2D {
    static { Loader.load(); }
    /** Default native constructor. */
    public HarrisLaplaceFeatureDetector() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public HarrisLaplaceFeatureDetector(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public HarrisLaplaceFeatureDetector(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public HarrisLaplaceFeatureDetector position(long position) {
        return (HarrisLaplaceFeatureDetector)super.position(position);
    }

    /**
     * \brief Creates a new implementation instance.
     *
     * @param numOctaves the number of octaves in the scale-space pyramid
     * @param corn_thresh the threshold for the Harris cornerness measure
     * @param DOG_thresh the threshold for the Difference-of-Gaussians scale selection
     * @param maxCorners the maximum number of corners to consider
     * @param num_layers the number of intermediate scales per octave
     */
    public static native @Ptr HarrisLaplaceFeatureDetector create(
                int numOctaves/*=6*/,
                float corn_thresh/*=0.01f*/,
                float DOG_thresh/*=0.01f*/,
                int maxCorners/*=5000*/,
                int num_layers/*=4*/);
    public static native @Ptr HarrisLaplaceFeatureDetector create();
}
