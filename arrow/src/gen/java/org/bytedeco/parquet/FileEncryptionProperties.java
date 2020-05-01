// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.parquet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.parquet.*;


@Namespace("parquet") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.parquet.class)
public class FileEncryptionProperties extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FileEncryptionProperties(Pointer p) { super(p); }

  @NoOffset public static class Builder extends Pointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Builder(Pointer p) { super(p); }
  
    public Builder(@StdString String footer_key) { super((Pointer)null); allocate(footer_key); }
    private native void allocate(@StdString String footer_key);
    public Builder(@StdString BytePointer footer_key) { super((Pointer)null); allocate(footer_key); }
    private native void allocate(@StdString BytePointer footer_key);

    /** Create files with plaintext footer.
     *  If not called, the files will be created with encrypted footer (default). */
    public native Builder set_plaintext_footer();

    /** Set encryption algorithm.
     *  If not called, files will be encrypted with AES_GCM_V1 (default). */
    public native Builder algorithm(ParquetCipher.type parquet_cipher);
    public native Builder algorithm(@Cast("parquet::ParquetCipher::type") int parquet_cipher);

    /** Set a key retrieval metadata (converted from String).
     *  use either footer_key_metadata or footer_key_id, not both. */
    public native Builder footer_key_id(@StdString String key_id);
    public native Builder footer_key_id(@StdString BytePointer key_id);

    /** Set a key retrieval metadata.
     *  use either footer_key_metadata or footer_key_id, not both. */
    public native Builder footer_key_metadata(@StdString String footer_key_metadata);
    public native Builder footer_key_metadata(@StdString BytePointer footer_key_metadata);

    /** Set the file AAD Prefix. */
    public native Builder aad_prefix(@StdString String aad_prefix);
    public native Builder aad_prefix(@StdString BytePointer aad_prefix);

    /** Skip storing AAD Prefix in file.
     *  If not called, and if AAD Prefix is set, it will be stored. */
    public native Builder disable_aad_prefix_storage();

    /** Set the list of encrypted columns and their properties (keys etc).
     *  If not called, all columns will be encrypted with the footer key.
     *  If called, the file columns not in the list will be left unencrypted. */
    public native Builder encrypted_columns(
            @Cast("const parquet::ColumnPathToEncryptionPropertiesMap*") @ByRef EncodingIntMap encrypted_columns);

    public native @SharedPtr FileEncryptionProperties build();
  }
  public native @Cast("bool") boolean encrypted_footer();

  public native @ByVal EncryptionAlgorithm algorithm();

  public native @StdString String footer_key();

  public native @StdString String footer_key_metadata();

  public native @StdString String file_aad();

  public native @SharedPtr ColumnEncryptionProperties column_encryption_properties(
        @StdString String column_path);
  public native @SharedPtr ColumnEncryptionProperties column_encryption_properties(
        @StdString BytePointer column_path);

  public native @Cast("bool") boolean is_utilized();

  /** FileEncryptionProperties object can be used for writing one file only.
   *  Mark FileEncryptionProperties as utilized once it is used to write a file as the
   *  encryption keys will be wiped out upon completion of file writing. */
  public native void set_utilized();

  /** Upon completion of file writing, the encryption keys
   *  will be wiped out (array values set to 0). */
  public native void WipeOutEncryptionKeys();

  /** FileEncryptionProperties object can be used for writing one file only.
   *  (at the end, keys are wiped out in the memory).
   *  This method allows to clone identical properties for another file,
   *  with an option to update the aadPrefix (if newAadPrefix is null,
   *  aadPrefix will be cloned too) */
  public native @SharedPtr FileEncryptionProperties DeepClone(@StdString String new_aad_prefix/*=""*/);
  public native @SharedPtr FileEncryptionProperties DeepClone();
  public native @SharedPtr FileEncryptionProperties DeepClone(@StdString BytePointer new_aad_prefix/*=""*/);

  public native @ByVal @Cast("parquet::ColumnPathToEncryptionPropertiesMap*") EncodingIntMap encrypted_columns();
}
