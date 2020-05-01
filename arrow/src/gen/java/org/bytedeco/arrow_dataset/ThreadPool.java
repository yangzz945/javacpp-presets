// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_dataset;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;
import org.bytedeco.parquet.*;
import static org.bytedeco.arrow.global.parquet.*;

import static org.bytedeco.arrow.global.arrow_dataset.*;
  // namespace detail

@Namespace("arrow::internal") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class ThreadPool extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ThreadPool(Pointer p) { super(p); }

  // Construct a thread pool with the given number of worker threads
  public static native @ByVal ThreadPoolResult Make(int threads);

  // Like Make(), but takes care that the returned ThreadPool is compatible
  // with destruction late at process exit.
  public static native @ByVal ThreadPoolResult MakeEternal(int threads);

  // Destroy thread pool; the pool will first be shut down

  // Return the desired number of worker threads.
  // The actual number of workers may lag a bit before being adjusted to
  // match this value.
  public native int GetCapacity();

  // Dynamically change the number of worker threads.
  // This function returns quickly, but it may take more time before the
  // thread count is fully adjusted.
  public native @ByVal Status SetCapacity(int threads);

  // Heuristic for the default capacity of a thread pool for CPU-bound tasks.
  // This is exposed as a static method to help with testing.
  public static native int DefaultCapacity();

  // Shutdown the pool.  Once the pool starts shutting down, new tasks
  // cannot be submitted anymore.
  // If "wait" is true, shutdown waits for all pending tasks to be finished.
  // If "wait" is false, workers are stopped as soon as currently executing
  // tasks are finished.
  public native @ByVal Status Shutdown(@Cast("bool") boolean _wait/*=true*/);
  public native @ByVal Status Shutdown();

  // Spawn a fire-and-forget task on one of the workers.

  // Submit a callable and arguments for execution.  Return a future that
  // will return the callable's result value once.
  // The callable's arguments are copied before execution.

  // Like Submit(), but also returns a (failed) Future when submission fails

  @Opaque public static class State extends Pointer {
      /** Empty constructor. Calls {@code super((Pointer)null)}. */
      public State() { super((Pointer)null); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public State(Pointer p) { super(p); }
  }
}
