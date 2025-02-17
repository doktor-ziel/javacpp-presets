// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow::compute") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class SortOptions extends FunctionOptions {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SortOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SortOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SortOptions position(long position) {
        return (SortOptions)super.position(position);
    }
    @Override public SortOptions getPointer(long i) {
        return new SortOptions((Pointer)this).offsetAddress(i);
    }

  public SortOptions(@StdVector SortKey sort_keys/*={}*/) { super((Pointer)null); allocate(sort_keys); }
  private native void allocate(@StdVector SortKey sort_keys/*={}*/);
  public SortOptions() { super((Pointer)null); allocate(); }
  private native void allocate();
  @MemberGetter public static native byte kTypeName(int i);
  @MemberGetter public static native String kTypeName();
  public static native @ByVal SortOptions Defaults();

  public native @StdVector SortKey sort_keys(); public native SortOptions sort_keys(SortKey setter);
}
