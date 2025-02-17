// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


/* Asynchronous Generators */

@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyAsyncGenObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyAsyncGenObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyAsyncGenObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyAsyncGenObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyAsyncGenObject position(long position) {
        return (PyAsyncGenObject)super.position(position);
    }
    @Override public PyAsyncGenObject getPointer(long i) {
        return new PyAsyncGenObject((Pointer)this).offsetAddress(i);
    }

    public native @ByRef PyObject ob_base(); public native PyAsyncGenObject ob_base(PyObject setter);
    /* Note: gi_frame can be NULL if the generator is "finished" */
    public native PyFrameObject ag_frame(); public native PyAsyncGenObject ag_frame(PyFrameObject setter);
    /* True if generator is being executed. */
    public native @Cast("char") byte ag_running(); public native PyAsyncGenObject ag_running(byte setter);
    /* The code object backing the generator */
    public native PyObject ag_code(); public native PyAsyncGenObject ag_code(PyObject setter);
    /* List of weak reference. */
    public native PyObject ag_weakreflist(); public native PyAsyncGenObject ag_weakreflist(PyObject setter);
    /* Name of the generator. */
    public native PyObject ag_name(); public native PyAsyncGenObject ag_name(PyObject setter);
    /* Qualified name of the generator. */
    public native PyObject ag_qualname(); public native PyAsyncGenObject ag_qualname(PyObject setter);
    public native @ByRef _PyErr_StackItem ag_exc_state(); public native PyAsyncGenObject ag_exc_state(_PyErr_StackItem setter);
    public native PyObject ag_finalizer(); public native PyAsyncGenObject ag_finalizer(PyObject setter);

    /* Flag is set to 1 when hooks set up by sys.set_asyncgen_hooks
       were called on the generator, to avoid calling them more
       than once. */
    public native int ag_hooks_inited(); public native PyAsyncGenObject ag_hooks_inited(int setter);

    /* Flag is set to 1 when aclose() is called for the first time, or
       when a StopAsyncIteration exception is raised. */
    public native int ag_closed(); public native PyAsyncGenObject ag_closed(int setter);

    public native int ag_running_async(); public native PyAsyncGenObject ag_running_async(int setter);
}
