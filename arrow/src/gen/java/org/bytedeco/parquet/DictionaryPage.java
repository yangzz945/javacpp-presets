// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.parquet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.parquet.*;

@Namespace("parquet") @Opaque @Properties(inherit = org.bytedeco.arrow.presets.parquet.class)
public class DictionaryPage extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public DictionaryPage() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DictionaryPage(Pointer p) { super(p); }
}
