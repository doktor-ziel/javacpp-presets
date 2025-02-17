// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_flight;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.arrow_flight.*;


/** \brief A ResultStream implementation based on a vector of
 *  Result objects.
 * 
 *  This can be iterated once, then it is consumed. */
@Namespace("arrow::flight") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_flight.class)
public class SimpleResultStream extends ResultStream {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SimpleResultStream(Pointer p) { super(p); }

  public SimpleResultStream(@StdVector Result results) { super((Pointer)null); allocate(results); }
  private native void allocate(@StdVector Result results);
  public native @ByVal Status Next(@UniquePtr Result result);
}
