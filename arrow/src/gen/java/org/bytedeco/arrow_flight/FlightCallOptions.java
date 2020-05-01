// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_flight;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.arrow_flight.*;


/** \brief Hints to the underlying RPC layer for Arrow Flight calls. */
@Namespace("arrow::flight") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_flight.class)
public class FlightCallOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FlightCallOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FlightCallOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public FlightCallOptions position(long position) {
        return (FlightCallOptions)super.position(position);
    }

  /** Create a default set of call options. */
  public FlightCallOptions() { super((Pointer)null); allocate(); }
  private native void allocate();

  /** \brief An optional timeout for this call. Negative durations
   *  mean an implementation-defined default behavior will be used
   *  instead. This is the default value. */
  public native @ByRef @Cast("arrow::flight::TimeoutDuration*") Pointer timeout(); public native FlightCallOptions timeout(Pointer setter);
}
