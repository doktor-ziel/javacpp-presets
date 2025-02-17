// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_flight;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.arrow_flight.*;


/** \brief A RecordBatchReader exposing Flight metadata and cancel
 *  operations. */
@Namespace("arrow::flight") @Properties(inherit = org.bytedeco.arrow.presets.arrow_flight.class)
public class FlightStreamReader extends MetadataRecordBatchReader {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FlightStreamReader(Pointer p) { super(p); }

  /** \brief Try to cancel the call. */
  public native void Cancel();
  /** \brief Consume entire stream as a vector of record batches */
  public native @ByVal Status ReadAll(RecordBatchVector batches,
                           @Const @ByRef StopToken stop_token);
  /** \brief Consume entire stream as a Table */
  public native @ByVal Status ReadAll(@SharedPtr Table table, @Const @ByRef StopToken stop_token);
}
