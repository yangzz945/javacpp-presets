// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;



/******************************** CvSize's & CvBox **************************************/

@NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class CvSize extends AbstractCvSize {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvSize(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvSize(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CvSize position(long position) {
        return (CvSize)super.position(position);
    }

    public native int width(); public native CvSize width(int setter);
    public native int height(); public native CvSize height(int setter);

// #ifdef CV__VALIDATE_UNUNITIALIZED_VARS
    public CvSize() { super((Pointer)null); allocate(); }
    private native void allocate();
// #elif defined(CV__ENABLE_C_API_CTORS) && defined(__cplusplus)
// #endif
// #ifdef __cplusplus
// #endif
}
