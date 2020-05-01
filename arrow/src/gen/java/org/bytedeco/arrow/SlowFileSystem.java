// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief A FileSystem implementation that delegates to another
 *  implementation but inserts latencies at various points. */
@Namespace("arrow::fs") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class SlowFileSystem extends FileSystem {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SlowFileSystem(Pointer p) { super(p); }

  public SlowFileSystem(@SharedPtr FileSystem base_fs,
                   @SharedPtr LatencyGenerator latencies) { super((Pointer)null); allocate(base_fs, latencies); }
  private native void allocate(@SharedPtr FileSystem base_fs,
                   @SharedPtr LatencyGenerator latencies);
  public SlowFileSystem(@SharedPtr FileSystem base_fs, double average_latency) { super((Pointer)null); allocate(base_fs, average_latency); }
  private native void allocate(@SharedPtr FileSystem base_fs, double average_latency);
  public SlowFileSystem(@SharedPtr FileSystem base_fs, double average_latency,
                   int seed) { super((Pointer)null); allocate(base_fs, average_latency, seed); }
  private native void allocate(@SharedPtr FileSystem base_fs, double average_latency,
                   int seed);

  public native @StdString String type_name();
  public native @Cast("bool") boolean Equals(@Const @ByRef FileSystem other);
  public native @ByVal FileInfoResult GetFileInfo(@StdString String path);
  public native @ByVal FileInfoResult GetFileInfo(@StdString BytePointer path);
  public native @ByVal FileInfoVectorResult GetFileInfo(@Const @ByRef FileSelector select);

  public native @ByVal Status CreateDir(@StdString String path, @Cast("bool") boolean recursive/*=true*/);
  public native @ByVal Status CreateDir(@StdString String path);
  public native @ByVal Status CreateDir(@StdString BytePointer path, @Cast("bool") boolean recursive/*=true*/);
  public native @ByVal Status CreateDir(@StdString BytePointer path);

  public native @ByVal Status DeleteDir(@StdString String path);
  public native @ByVal Status DeleteDir(@StdString BytePointer path);
  public native @ByVal Status DeleteDirContents(@StdString String path);
  public native @ByVal Status DeleteDirContents(@StdString BytePointer path);

  public native @ByVal Status DeleteFile(@StdString String path);
  public native @ByVal Status DeleteFile(@StdString BytePointer path);

  public native @ByVal Status Move(@StdString String src, @StdString String dest);
  public native @ByVal Status Move(@StdString BytePointer src, @StdString BytePointer dest);

  public native @ByVal Status CopyFile(@StdString String src, @StdString String dest);
  public native @ByVal Status CopyFile(@StdString BytePointer src, @StdString BytePointer dest);

  public native @ByVal InputStreamResult OpenInputStream(
        @StdString String path);
  public native @ByVal InputStreamResult OpenInputStream(
        @StdString BytePointer path);
  public native @ByVal RandomAccessFileResult OpenInputFile(
        @StdString String path);
  public native @ByVal RandomAccessFileResult OpenInputFile(
        @StdString BytePointer path);
  public native @ByVal OutputStreamResult OpenOutputStream(
        @StdString String path);
  public native @ByVal OutputStreamResult OpenOutputStream(
        @StdString BytePointer path);
  public native @ByVal OutputStreamResult OpenAppendStream(
        @StdString String path);
  public native @ByVal OutputStreamResult OpenAppendStream(
        @StdString BytePointer path);
}
