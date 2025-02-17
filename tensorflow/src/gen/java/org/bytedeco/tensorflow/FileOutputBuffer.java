// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// A buffering wrapper for a WritableFile.  Useful if the caller wishes to issue
// small writes to a file (e.g. writing out a list of small varints).
// External synchronization must be used in the presence of concurrent callers.
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class FileOutputBuffer extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FileOutputBuffer(Pointer p) { super(p); }

  public FileOutputBuffer(WritableFile file, @Cast("size_t") long buffer_size) { super((Pointer)null); allocate(file, buffer_size); }
  private native void allocate(WritableFile file, @Cast("size_t") long buffer_size);

  // Buffered append.
  public native @ByVal Status Append(@StringPiece BytePointer data);
  public native @ByVal Status Append(@StringPiece String data);

  // Returns the running crc32c checksum of all currently appended bytes.
  public native @Cast("tensorflow::uint32") int crc32c();
  // Clears the running crc32c checksum.
  public native void clear_crc32c();

  // Appends the buffered data, then closes the underlying file.
  public native @ByVal Status Close();
}
