// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.global;

import org.bytedeco.opencv.opencv_cudacodec.*;

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

public class opencv_cudacodec extends org.bytedeco.opencv.presets.opencv_cudacodec {
    static { Loader.load(); }

// Parsed from <opencv2/cudacodec.hpp>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                          License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2000-2008, Intel Corporation, all rights reserved.
// Copyright (C) 2009, Willow Garage Inc., all rights reserved.
// Copyright (C) 2013, OpenCV Foundation, all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef OPENCV_CUDACODEC_HPP
// #define OPENCV_CUDACODEC_HPP

// #ifndef __cplusplus
// #endif

// #include "opencv2/core/cuda.hpp"

/**
  \addtogroup cuda
  \{
    \defgroup cudacodec Video Encoding/Decoding
  \}
 */  // Stream

/** \addtogroup cudacodec
 *  \{
<p>
////////////////////////////////// Video Encoding ////////////////////////////////// */

// Works only under Windows.
// Supports only H264 video codec and AVI files.

/** enum cv::cudacodec::SurfaceFormat */
public static final int
    SF_UYVY = 0,
    SF_YUY2 = 1,
    SF_YV12 = 2,
    SF_NV12 = 3,
    SF_IYUV = 4,
    SF_BGR = 5,
    SF_GRAY = SF_BGR;
// Targeting ../opencv_cudacodec/EncoderParams.java


// Targeting ../opencv_cudacodec/EncoderCallBack.java


// Targeting ../opencv_cudacodec/VideoWriter.java



/** \brief Creates video writer.
<p>
@param fileName Name of the output video file. Only AVI file format is supported.
@param frameSize Size of the input video frames.
@param fps Framerate of the created video stream.
@param format Surface format of input frames ( SF_UYVY , SF_YUY2 , SF_YV12 , SF_NV12 ,
SF_IYUV , SF_BGR or SF_GRAY). BGR or gray frames will be converted to YV12 format before
encoding, frames with other formats will be used as is.
<p>
The constructors initialize video writer. FFMPEG is used to write videos. User can implement own
multiplexing with cudacodec::EncoderCallBack .
 */
@Namespace("cv::cudacodec") public static native @Ptr org.bytedeco.opencv.opencv_cudacodec.VideoWriter createVideoWriter(@Str BytePointer fileName, @ByVal Size frameSize, double fps, @Cast("cv::cudacodec::SurfaceFormat") int format/*=cv::cudacodec::SF_BGR*/);
@Namespace("cv::cudacodec") public static native @Ptr org.bytedeco.opencv.opencv_cudacodec.VideoWriter createVideoWriter(@Str BytePointer fileName, @ByVal Size frameSize, double fps);
@Namespace("cv::cudacodec") public static native @Ptr org.bytedeco.opencv.opencv_cudacodec.VideoWriter createVideoWriter(@Str String fileName, @ByVal Size frameSize, double fps, @Cast("cv::cudacodec::SurfaceFormat") int format/*=cv::cudacodec::SF_BGR*/);
@Namespace("cv::cudacodec") public static native @Ptr org.bytedeco.opencv.opencv_cudacodec.VideoWriter createVideoWriter(@Str String fileName, @ByVal Size frameSize, double fps);
/** \overload
@param fileName Name of the output video file. Only AVI file format is supported.
@param frameSize Size of the input video frames.
@param fps Framerate of the created video stream.
@param params Encoder parameters. See cudacodec::EncoderParams .
@param format Surface format of input frames ( SF_UYVY , SF_YUY2 , SF_YV12 , SF_NV12 ,
SF_IYUV , SF_BGR or SF_GRAY). BGR or gray frames will be converted to YV12 format before
encoding, frames with other formats will be used as is.
*/
@Namespace("cv::cudacodec") public static native @Ptr org.bytedeco.opencv.opencv_cudacodec.VideoWriter createVideoWriter(@Str BytePointer fileName, @ByVal Size frameSize, double fps, @Const @ByRef EncoderParams params, @Cast("cv::cudacodec::SurfaceFormat") int format/*=cv::cudacodec::SF_BGR*/);
@Namespace("cv::cudacodec") public static native @Ptr org.bytedeco.opencv.opencv_cudacodec.VideoWriter createVideoWriter(@Str BytePointer fileName, @ByVal Size frameSize, double fps, @Const @ByRef EncoderParams params);
@Namespace("cv::cudacodec") public static native @Ptr org.bytedeco.opencv.opencv_cudacodec.VideoWriter createVideoWriter(@Str String fileName, @ByVal Size frameSize, double fps, @Const @ByRef EncoderParams params, @Cast("cv::cudacodec::SurfaceFormat") int format/*=cv::cudacodec::SF_BGR*/);
@Namespace("cv::cudacodec") public static native @Ptr org.bytedeco.opencv.opencv_cudacodec.VideoWriter createVideoWriter(@Str String fileName, @ByVal Size frameSize, double fps, @Const @ByRef EncoderParams params);

/** \overload
@param encoderCallback Callbacks for video encoder. See cudacodec::EncoderCallBack . Use it if you
want to work with raw video stream.
@param frameSize Size of the input video frames.
@param fps Framerate of the created video stream.
@param format Surface format of input frames ( SF_UYVY , SF_YUY2 , SF_YV12 , SF_NV12 ,
SF_IYUV , SF_BGR or SF_GRAY). BGR or gray frames will be converted to YV12 format before
encoding, frames with other formats will be used as is.
*/
@Namespace("cv::cudacodec") public static native @Ptr org.bytedeco.opencv.opencv_cudacodec.VideoWriter createVideoWriter(@Ptr EncoderCallBack encoderCallback, @ByVal Size frameSize, double fps, @Cast("cv::cudacodec::SurfaceFormat") int format/*=cv::cudacodec::SF_BGR*/);
@Namespace("cv::cudacodec") public static native @Ptr org.bytedeco.opencv.opencv_cudacodec.VideoWriter createVideoWriter(@Ptr EncoderCallBack encoderCallback, @ByVal Size frameSize, double fps);
/** \overload
@param encoderCallback Callbacks for video encoder. See cudacodec::EncoderCallBack . Use it if you
want to work with raw video stream.
@param frameSize Size of the input video frames.
@param fps Framerate of the created video stream.
@param params Encoder parameters. See cudacodec::EncoderParams .
@param format Surface format of input frames ( SF_UYVY , SF_YUY2 , SF_YV12 , SF_NV12 ,
SF_IYUV , SF_BGR or SF_GRAY). BGR or gray frames will be converted to YV12 format before
encoding, frames with other formats will be used as is.
*/
@Namespace("cv::cudacodec") public static native @Ptr org.bytedeco.opencv.opencv_cudacodec.VideoWriter createVideoWriter(@Ptr EncoderCallBack encoderCallback, @ByVal Size frameSize, double fps, @Const @ByRef EncoderParams params, @Cast("cv::cudacodec::SurfaceFormat") int format/*=cv::cudacodec::SF_BGR*/);
@Namespace("cv::cudacodec") public static native @Ptr org.bytedeco.opencv.opencv_cudacodec.VideoWriter createVideoWriter(@Ptr EncoderCallBack encoderCallback, @ByVal Size frameSize, double fps, @Const @ByRef EncoderParams params);

////////////////////////////////// Video Decoding //////////////////////////////////////////

/** \brief Video codecs supported by cudacodec::VideoReader .
 */
/** enum cv::cudacodec::Codec */
public static final int
    MPEG1 = 0,
    MPEG2 = 1,
    MPEG4 = 2,
    VC1 = 3,
    H264 = 4,
    JPEG = 5,
    H264_SVC = 6,
    H264_MVC = 7,
    HEVC = 8,
    VP8 = 9,
    VP9 = 10,
    NumCodecs = 11,

    /** Y,U,V (4:2:0) */
    Uncompressed_YUV420 = (('I'<<24)|('Y'<<16)|('U'<<8)|('V')),
    /** Y,V,U (4:2:0) */
    Uncompressed_YV12   = (('Y'<<24)|('V'<<16)|('1'<<8)|('2')),
    /** Y,UV  (4:2:0) */
    Uncompressed_NV12   = (('N'<<24)|('V'<<16)|('1'<<8)|('2')),
    /** YUYV/YUY2 (4:2:2) */
    Uncompressed_YUYV   = (('Y'<<24)|('U'<<16)|('Y'<<8)|('V')),
    /** UYVY (4:2:2) */
    Uncompressed_UYVY   = (('U'<<24)|('Y'<<16)|('V'<<8)|('Y'));

/** \brief Chroma formats supported by cudacodec::VideoReader .
 */
/** enum cv::cudacodec::ChromaFormat */
public static final int
    Monochrome = 0,
    YUV420 = 1,
    YUV422 = 2,
    YUV444 = 3,
    NumFormats = 4;
// Targeting ../opencv_cudacodec/FormatInfo.java


// Targeting ../opencv_cudacodec/VideoReader.java


// Targeting ../opencv_cudacodec/RawVideoSource.java



/** \brief Creates video reader.
<p>
@param filename Name of the input video file.
<p>
FFMPEG is used to read videos. User can implement own demultiplexing with cudacodec::RawVideoSource
 */
@Namespace("cv::cudacodec") public static native @Ptr org.bytedeco.opencv.opencv_cudacodec.VideoReader createVideoReader(@Str BytePointer filename);
@Namespace("cv::cudacodec") public static native @Ptr org.bytedeco.opencv.opencv_cudacodec.VideoReader createVideoReader(@Str String filename);
/** \overload
@param source RAW video source implemented by user.
*/
@Namespace("cv::cudacodec") public static native @Ptr org.bytedeco.opencv.opencv_cudacodec.VideoReader createVideoReader(@Ptr RawVideoSource source);

/** \} */

 // namespace cv { namespace cudacodec {

// #endif /* OPENCV_CUDACODEC_HPP */


}
