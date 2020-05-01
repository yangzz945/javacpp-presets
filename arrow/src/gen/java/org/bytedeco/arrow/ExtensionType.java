// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief The base class for custom / user-defined types. */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class ExtensionType extends DataType {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ExtensionType(Pointer p) { super(p); }

  @MemberGetter public static native @Cast("const arrow::Type::type") int type_id();
  public static final int type_id = type_id();

  public static native String type_name();

  /** \brief The type of array used to represent this extension type's data */
  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType storage_type();

  public native @ByVal DataTypeLayout layout();

  public native @StdString String ToString();

  public native @StdString String name();

  /** \brief Unique name of extension type used to identify type for
   *  serialization
   *  @return the string name of the extension */
  public native @StdString String extension_name();

  /** \brief Determine if two instances of the same extension types are
   *  equal. Invoked from ExtensionType::Equals
   *  @param other [in] the type to compare this type with
   *  @return bool true if type instances are equal */
  public native @Cast("bool") boolean ExtensionEquals(@Const @ByRef ExtensionType other);

  /** \brief Wrap built-in Array type in a user-defined ExtensionArray instance
   *  @param data [in] the physical storage for the extension type */
  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::Array>"}) Array MakeArray(@SharedPtr @Cast({"", "std::shared_ptr<arrow::ArrayData>"}) ArrayData data);

  /** \brief Create an instance of the ExtensionType given the actual storage
   *  type and the serialized representation
   *  @param storage_type [in] the physical storage type of the extension
   *  @param serialized_data [in] the serialized representation produced by
   *  Serialize */
  public native @ByVal DataTypeResult Deserialize(
        @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType storage_type,
        @StdString String serialized_data);
  public native @ByVal DataTypeResult Deserialize(
        @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType storage_type,
        @StdString BytePointer serialized_data);

  public native @Deprecated @ByVal Status Deserialize(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType storage_type,
                       @StdString String serialized_data,
                       @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>*"}) DataType out);
  public native @Deprecated @ByVal Status Deserialize(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType storage_type,
                       @StdString BytePointer serialized_data,
                       @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>*"}) DataType out);

  /** \brief Create a serialized representation of the extension type's
   *  metadata. The storage type will be handled automatically in IPC code
   *  paths
   *  @return the serialized representation */
  public native @StdString String Serialize();
}
