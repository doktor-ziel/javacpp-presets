// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief An output stream that writes into a fixed-size mutable buffer */
@Namespace("arrow::io") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class FixedSizeBufferWriter extends WritableFile {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FixedSizeBufferWriter(Pointer p) { super(p); }

  /** Input buffer must be mutable, will abort if not */
  public FixedSizeBufferWriter(@SharedPtr ArrowBuffer buffer) { super((Pointer)null); allocate(buffer); }
  private native void allocate(@SharedPtr ArrowBuffer buffer);

  public native @ByVal Status Close();
  public native @Cast("bool") boolean closed();
  public native @ByVal Status Seek(@Cast("int64_t") long _position);
  public native @ByVal LongResult Tell();
  public native @ByVal Status Write(@Const Pointer data, @Cast("int64_t") long nbytes);
  /** \cond FALSE */
  /** \endcond */

  public native @ByVal Status WriteAt(@Cast("int64_t") long _position, @Const Pointer data, @Cast("int64_t") long nbytes);

  public native void set_memcopy_threads(int num_threads);
  public native void set_memcopy_blocksize(@Cast("int64_t") long blocksize);
  public native void set_memcopy_threshold(@Cast("int64_t") long threshold);
}
