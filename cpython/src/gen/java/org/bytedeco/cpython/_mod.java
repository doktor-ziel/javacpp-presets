// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;

@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class _mod extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public _mod() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public _mod(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public _mod(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public _mod position(long position) {
        return (_mod)super.position(position);
    }
    @Override public _mod getPointer(long i) {
        return new _mod((Pointer)this).offsetAddress(i);
    }

    public native @Cast("_mod_kind") int kind(); public native _mod kind(int setter);
            @Name("v.Module.body") public native asdl_seq v_Module_body(); public native _mod v_Module_body(asdl_seq setter);
            @Name("v.Module.type_ignores") public native asdl_seq v_Module_type_ignores(); public native _mod v_Module_type_ignores(asdl_seq setter);

            @Name("v.Interactive.body") public native asdl_seq v_Interactive_body(); public native _mod v_Interactive_body(asdl_seq setter);

            @Name("v.Expression.body") public native _expr v_Expression_body(); public native _mod v_Expression_body(_expr setter);

            @Name("v.FunctionType.argtypes") public native asdl_seq v_FunctionType_argtypes(); public native _mod v_FunctionType_argtypes(asdl_seq setter);
            @Name("v.FunctionType.returns") public native _expr v_FunctionType_returns(); public native _mod v_FunctionType_returns(_expr setter);
}
