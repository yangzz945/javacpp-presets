// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.gandiva;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.gandiva.*;


@Namespace("gandiva") @Opaque @Properties(inherit = org.bytedeco.arrow.presets.gandiva.class)
public class LValue extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public LValue() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LValue(Pointer p) { super(p); }
}
