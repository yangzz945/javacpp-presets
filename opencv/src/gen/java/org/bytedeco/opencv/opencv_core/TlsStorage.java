// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


/** \addtogroup core_utils
 *  \{ */

@Namespace("cv::details") @Opaque @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class TlsStorage extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public TlsStorage() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TlsStorage(Pointer p) { super(p); }
}
