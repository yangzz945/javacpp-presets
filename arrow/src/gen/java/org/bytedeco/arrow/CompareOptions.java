// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow::compute") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class CompareOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CompareOptions(Pointer p) { super(p); }

  public CompareOptions(CompareOperator op) { super((Pointer)null); allocate(op); }
  private native void allocate(CompareOperator op);
  public CompareOptions(@Cast("arrow::compute::CompareOperator") int op) { super((Pointer)null); allocate(op); }
  private native void allocate(@Cast("arrow::compute::CompareOperator") int op);

  public native CompareOperator op(); public native CompareOptions op(CompareOperator setter);
}
