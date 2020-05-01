// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_flight;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.arrow_flight.*;


/** \brief A type of action that can be performed with the DoAction RPC. */
@Namespace("arrow::flight") @Properties(inherit = org.bytedeco.arrow.presets.arrow_flight.class)
public class ActionType extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ActionType() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ActionType(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ActionType(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ActionType position(long position) {
        return (ActionType)super.position(position);
    }

  /** \brief The name of the action. */
  public native @StdString String type(); public native ActionType type(String setter);

  /** \brief A human-readable description of the action. */
  public native @StdString String description(); public native ActionType description(String setter);
}
