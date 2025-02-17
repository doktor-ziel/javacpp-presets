// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.parquet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.parquet.*;


@Namespace("parquet") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.parquet.class)
public class FileMetaDataBuilder extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FileMetaDataBuilder(Pointer p) { super(p); }

  // API convenience to get a MetaData reader
  public static native @UniquePtr FileMetaDataBuilder Make(
        @Const SchemaDescriptor schema, @SharedPtr WriterProperties props,
        @Const @SharedPtr KeyValueMetadata key_value_metadata/*=nullptr*/);
  public static native @UniquePtr FileMetaDataBuilder Make(
        @Const SchemaDescriptor schema, @SharedPtr WriterProperties props);

  // The prior RowGroupMetaDataBuilder (if any) is destroyed
  public native RowGroupMetaDataBuilder AppendRowGroup();

  // Complete the Thrift structure
  public native @UniquePtr FileMetaData Finish();

  // crypto metadata
  public native @UniquePtr FileCryptoMetaData GetCryptoMetaData();
}
