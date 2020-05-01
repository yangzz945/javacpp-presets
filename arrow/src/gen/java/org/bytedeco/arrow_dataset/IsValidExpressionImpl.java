// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_dataset;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;
import org.bytedeco.parquet.*;
import static org.bytedeco.arrow.global.parquet.*;

import static org.bytedeco.arrow.global.arrow_dataset.*;

@Name("arrow::dataset::ExpressionImpl<arrow::dataset::UnaryExpression,arrow::dataset::IsValidExpression,arrow::dataset::ExpressionType::IS_VALID>") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class IsValidExpressionImpl extends UnaryExpression {
    static { Loader.load(); }
    /** Default native constructor. */
    public IsValidExpressionImpl() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IsValidExpressionImpl(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IsValidExpressionImpl(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IsValidExpressionImpl position(long position) {
        return (IsValidExpressionImpl)super.position(position);
    }

  @MemberGetter public static native ExpressionType.type expression_type();

  public native @SharedPtr @ByVal Expression Copy();
}
