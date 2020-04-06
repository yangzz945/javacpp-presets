// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_shape;

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

import static org.bytedeco.opencv.global.opencv_shape.*;


/** \addtogroup shape
 *  \{
<p>
/** \example modules/shape/samples/shape_example.cpp
An example using shape distance algorithm
*/
/** \brief Abstract base class for shape distance algorithms.
 */
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_shape.class)
public class ShapeDistanceExtractor extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ShapeDistanceExtractor(Pointer p) { super(p); }

    /** \brief Compute the shape distance between two shapes defined by its contours.
    <p>
    @param contour1 Contour defining first shape.
    @param contour2 Contour defining second shape.
     */
    public native float computeDistance(@ByVal Mat contour1, @ByVal Mat contour2);
    public native float computeDistance(@ByVal UMat contour1, @ByVal UMat contour2);
    public native float computeDistance(@ByVal GpuMat contour1, @ByVal GpuMat contour2);
}
