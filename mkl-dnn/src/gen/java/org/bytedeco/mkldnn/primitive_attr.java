// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.mkldnn.global.mklml.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;


// #ifndef DOXYGEN_SHOULD_SKIP_THIS
// #endif

@Namespace("mkldnn") @Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class primitive_attr extends mkldnn_primitive_attr_handle {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public primitive_attr(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public primitive_attr(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public primitive_attr position(long position) {
        return (primitive_attr)super.position(position);
    }
    @Override public primitive_attr getPointer(long i) {
        return new primitive_attr((Pointer)this).offsetAddress(i);
    }

    public primitive_attr() { super((Pointer)null); allocate(); }
    private native void allocate();

    public native @Cast("mkldnn::round_mode") int get_int_output_round_mode();

    public native void set_int_output_round_mode(@Cast("mkldnn::round_mode") int mode);

    public native void get_output_scales(@ByRef IntPointer mask, @StdVector FloatPointer scales);
    public native void get_output_scales(@ByRef IntBuffer mask, @StdVector FloatBuffer scales);
    public native void get_output_scales(@ByRef int[] mask, @StdVector float[] scales);

    public native void set_output_scales(int mask, @StdVector FloatPointer scales);
    public native void set_output_scales(int mask, @StdVector FloatBuffer scales);
    public native void set_output_scales(int mask, @StdVector float[] scales);

    public native @Const @ByVal post_ops get_post_ops();

    public native void set_post_ops(@ByVal post_ops ops);

    public native void set_rnn_data_qparams(float scale, float shift);

    public native void set_rnn_weights_qparams(int mask, @StdVector FloatPointer scales);
    public native void set_rnn_weights_qparams(int mask, @StdVector FloatBuffer scales);
    public native void set_rnn_weights_qparams(int mask, @StdVector float[] scales);
}
