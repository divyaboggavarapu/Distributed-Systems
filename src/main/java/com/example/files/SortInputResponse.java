// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: file-metadata.proto

package com.example.files;

/**
 * Protobuf type {@code com.example.files.SortInputResponse}
 */
public final class SortInputResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.example.files.SortInputResponse)
    SortInputResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SortInputResponse.newBuilder() to construct.
  private SortInputResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SortInputResponse() {
    output_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SortInputResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SortInputResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              output_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            output_.addInt(input.readInt32());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              output_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              output_.addInt(input.readInt32());
            }
            input.popLimit(limit);
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        output_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.files.FileMetadata.internal_static_com_example_files_SortInputResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.files.FileMetadata.internal_static_com_example_files_SortInputResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.files.SortInputResponse.class, com.example.files.SortInputResponse.Builder.class);
  }

  public static final int OUTPUT_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.IntList output_;
  /**
   * <code>repeated int32 output = 1;</code>
   * @return A list containing the output.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getOutputList() {
    return output_;
  }
  /**
   * <code>repeated int32 output = 1;</code>
   * @return The count of output.
   */
  public int getOutputCount() {
    return output_.size();
  }
  /**
   * <code>repeated int32 output = 1;</code>
   * @param index The index of the element to return.
   * @return The output at the given index.
   */
  public int getOutput(int index) {
    return output_.getInt(index);
  }
  private int outputMemoizedSerializedSize = -1;

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (getOutputList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(outputMemoizedSerializedSize);
    }
    for (int i = 0; i < output_.size(); i++) {
      output.writeInt32NoTag(output_.getInt(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < output_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(output_.getInt(i));
      }
      size += dataSize;
      if (!getOutputList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      outputMemoizedSerializedSize = dataSize;
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.files.SortInputResponse)) {
      return super.equals(obj);
    }
    com.example.files.SortInputResponse other = (com.example.files.SortInputResponse) obj;

    if (!getOutputList()
        .equals(other.getOutputList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getOutputCount() > 0) {
      hash = (37 * hash) + OUTPUT_FIELD_NUMBER;
      hash = (53 * hash) + getOutputList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.files.SortInputResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.files.SortInputResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.files.SortInputResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.files.SortInputResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.files.SortInputResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.files.SortInputResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.files.SortInputResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.files.SortInputResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.files.SortInputResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.files.SortInputResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.files.SortInputResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.files.SortInputResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.example.files.SortInputResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.example.files.SortInputResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.files.SortInputResponse)
      com.example.files.SortInputResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.files.FileMetadata.internal_static_com_example_files_SortInputResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.files.FileMetadata.internal_static_com_example_files_SortInputResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.files.SortInputResponse.class, com.example.files.SortInputResponse.Builder.class);
    }

    // Construct using com.example.files.SortInputResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      output_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.files.FileMetadata.internal_static_com_example_files_SortInputResponse_descriptor;
    }

    @java.lang.Override
    public com.example.files.SortInputResponse getDefaultInstanceForType() {
      return com.example.files.SortInputResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.files.SortInputResponse build() {
      com.example.files.SortInputResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.files.SortInputResponse buildPartial() {
      com.example.files.SortInputResponse result = new com.example.files.SortInputResponse(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        output_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.output_ = output_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.files.SortInputResponse) {
        return mergeFrom((com.example.files.SortInputResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.files.SortInputResponse other) {
      if (other == com.example.files.SortInputResponse.getDefaultInstance()) return this;
      if (!other.output_.isEmpty()) {
        if (output_.isEmpty()) {
          output_ = other.output_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureOutputIsMutable();
          output_.addAll(other.output_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.example.files.SortInputResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.files.SortInputResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.IntList output_ = emptyIntList();
    private void ensureOutputIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        output_ = mutableCopy(output_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int32 output = 1;</code>
     * @return A list containing the output.
     */
    public java.util.List<java.lang.Integer>
        getOutputList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(output_) : output_;
    }
    /**
     * <code>repeated int32 output = 1;</code>
     * @return The count of output.
     */
    public int getOutputCount() {
      return output_.size();
    }
    /**
     * <code>repeated int32 output = 1;</code>
     * @param index The index of the element to return.
     * @return The output at the given index.
     */
    public int getOutput(int index) {
      return output_.getInt(index);
    }
    /**
     * <code>repeated int32 output = 1;</code>
     * @param index The index to set the value at.
     * @param value The output to set.
     * @return This builder for chaining.
     */
    public Builder setOutput(
        int index, int value) {
      ensureOutputIsMutable();
      output_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 output = 1;</code>
     * @param value The output to add.
     * @return This builder for chaining.
     */
    public Builder addOutput(int value) {
      ensureOutputIsMutable();
      output_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 output = 1;</code>
     * @param values The output to add.
     * @return This builder for chaining.
     */
    public Builder addAllOutput(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureOutputIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, output_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 output = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOutput() {
      output_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.example.files.SortInputResponse)
  }

  // @@protoc_insertion_point(class_scope:com.example.files.SortInputResponse)
  private static final com.example.files.SortInputResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.files.SortInputResponse();
  }

  public static com.example.files.SortInputResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SortInputResponse>
      PARSER = new com.google.protobuf.AbstractParser<SortInputResponse>() {
    @java.lang.Override
    public SortInputResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SortInputResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SortInputResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SortInputResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.files.SortInputResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

