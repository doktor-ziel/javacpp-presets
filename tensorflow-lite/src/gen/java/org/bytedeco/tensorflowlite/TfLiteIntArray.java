// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


// Fixed size list of integers. Used for dimensions and inputs/outputs tensor
// indices
@Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class TfLiteIntArray extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TfLiteIntArray(Pointer p) { super(p); }

  public native int size(); public native TfLiteIntArray size(int setter);
// gcc 6.1+ have a bug where flexible members aren't properly handled
// https://github.com/google/re2/commit/b94b7cd42e9f02673cd748c1ac1d16db4052514c
// #if (!defined(__clang__) && defined(__GNUC__) && __GNUC__ == 6 &&
//      __GNUC_MINOR__ >= 1) ||
//     defined(HEXAGON) ||
//     (defined(__clang__) && __clang_major__ == 7 && __clang_minor__ == 1)
  public native int data(int i); public native TfLiteIntArray data(int i, int setter);
  @MemberGetter public native IntPointer data();
// #else
// #endif
}
