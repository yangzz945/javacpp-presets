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


/** \brief Abstract class that represents the model of the target. It must be instantiated by specialized
tracker
<p>
See \cite AAM Ak
<p>
Inherits this with your TrackerModel
 */
@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_tracking.class)
public class TrackerModel extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TrackerModel(Pointer p) { super(p); }


  /**
   * \brief Constructor
   */

  /**
   * \brief Destructor
   */

  /** \brief Set TrackerEstimator, return true if the tracker state estimator is added, false otherwise
    @param trackerStateEstimator The TrackerStateEstimator
    \note You can add only one TrackerStateEstimator
     */
  public native @Cast("bool") boolean setTrackerStateEstimator( @Ptr TrackerStateEstimator trackerStateEstimator );

  /** \brief Estimate the most likely target location
    <p>
    \cite AAM ME, Model Estimation table I
    @param responses Features extracted from TrackerFeatureSet
     */
  public native void modelEstimation( @Const @ByRef MatVector responses );

  /** \brief Update the model
    <p>
    \cite AAM MU, Model Update table I
     */
  public native void modelUpdate();

  /** \brief Run the TrackerStateEstimator, return true if is possible to estimate a new state, false otherwise
    */
  public native @Cast("bool") boolean runStateEstimator();

  /** \brief Set the current TrackerTargetState in the Trajectory
    @param lastTargetState The current TrackerTargetState
     */
  public native void setLastTargetState( @Const @Ptr @ByRef TrackerTargetState lastTargetState );

  /** \brief Get the last TrackerTargetState from Trajectory
    */
  public native @Ptr @ByVal TrackerTargetState getLastTargetState();

  /** \brief Get the list of the ConfidenceMap
    */
  public native @Const @ByRef ConfidenceMapVector getConfidenceMaps();

  /** \brief Get the last ConfidenceMap for the current frame
     */
  public native @Const @ByRef ConfidenceMap getLastConfidenceMap();

  /** \brief Get the TrackerStateEstimator
    */
  public native @Ptr TrackerStateEstimator getTrackerStateEstimator();

}
