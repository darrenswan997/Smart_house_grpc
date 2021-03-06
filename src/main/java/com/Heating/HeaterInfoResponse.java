// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Heating.proto

package com.Heating;

/**
 * Protobuf type {@code HeaterInfoResponse}
 */
public  final class HeaterInfoResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:HeaterInfoResponse)
    HeaterInfoResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HeaterInfoResponse.newBuilder() to construct.
  private HeaterInfoResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HeaterInfoResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HeaterInfoResponse(
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
          case 10: {
            com.Heating.Heater.Builder subBuilder = null;
            if (heater_ != null) {
              subBuilder = heater_.toBuilder();
            }
            heater_ = input.readMessage(com.Heating.Heater.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(heater_);
              heater_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.Heating.Heating.internal_static_HeaterInfoResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.Heating.Heating.internal_static_HeaterInfoResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.Heating.HeaterInfoResponse.class, com.Heating.HeaterInfoResponse.Builder.class);
  }

  public static final int HEATER_FIELD_NUMBER = 1;
  private com.Heating.Heater heater_;
  /**
   * <code>.Heater heater = 1;</code>
   */
  public boolean hasHeater() {
    return heater_ != null;
  }
  /**
   * <code>.Heater heater = 1;</code>
   */
  public com.Heating.Heater getHeater() {
    return heater_ == null ? com.Heating.Heater.getDefaultInstance() : heater_;
  }
  /**
   * <code>.Heater heater = 1;</code>
   */
  public com.Heating.HeaterOrBuilder getHeaterOrBuilder() {
    return getHeater();
  }

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
    if (heater_ != null) {
      output.writeMessage(1, getHeater());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (heater_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHeater());
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
    if (!(obj instanceof com.Heating.HeaterInfoResponse)) {
      return super.equals(obj);
    }
    com.Heating.HeaterInfoResponse other = (com.Heating.HeaterInfoResponse) obj;

    boolean result = true;
    result = result && (hasHeater() == other.hasHeater());
    if (hasHeater()) {
      result = result && getHeater()
          .equals(other.getHeater());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasHeater()) {
      hash = (37 * hash) + HEATER_FIELD_NUMBER;
      hash = (53 * hash) + getHeater().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.Heating.HeaterInfoResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.Heating.HeaterInfoResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.Heating.HeaterInfoResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.Heating.HeaterInfoResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.Heating.HeaterInfoResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.Heating.HeaterInfoResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.Heating.HeaterInfoResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.Heating.HeaterInfoResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.Heating.HeaterInfoResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.Heating.HeaterInfoResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.Heating.HeaterInfoResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.Heating.HeaterInfoResponse parseFrom(
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
  public static Builder newBuilder(com.Heating.HeaterInfoResponse prototype) {
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
   * Protobuf type {@code HeaterInfoResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:HeaterInfoResponse)
      com.Heating.HeaterInfoResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.Heating.Heating.internal_static_HeaterInfoResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.Heating.Heating.internal_static_HeaterInfoResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.Heating.HeaterInfoResponse.class, com.Heating.HeaterInfoResponse.Builder.class);
    }

    // Construct using com.Heating.HeaterInfoResponse.newBuilder()
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
      if (heaterBuilder_ == null) {
        heater_ = null;
      } else {
        heater_ = null;
        heaterBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.Heating.Heating.internal_static_HeaterInfoResponse_descriptor;
    }

    @java.lang.Override
    public com.Heating.HeaterInfoResponse getDefaultInstanceForType() {
      return com.Heating.HeaterInfoResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.Heating.HeaterInfoResponse build() {
      com.Heating.HeaterInfoResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.Heating.HeaterInfoResponse buildPartial() {
      com.Heating.HeaterInfoResponse result = new com.Heating.HeaterInfoResponse(this);
      if (heaterBuilder_ == null) {
        result.heater_ = heater_;
      } else {
        result.heater_ = heaterBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.Heating.HeaterInfoResponse) {
        return mergeFrom((com.Heating.HeaterInfoResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.Heating.HeaterInfoResponse other) {
      if (other == com.Heating.HeaterInfoResponse.getDefaultInstance()) return this;
      if (other.hasHeater()) {
        mergeHeater(other.getHeater());
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
      com.Heating.HeaterInfoResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.Heating.HeaterInfoResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.Heating.Heater heater_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.Heating.Heater, com.Heating.Heater.Builder, com.Heating.HeaterOrBuilder> heaterBuilder_;
    /**
     * <code>.Heater heater = 1;</code>
     */
    public boolean hasHeater() {
      return heaterBuilder_ != null || heater_ != null;
    }
    /**
     * <code>.Heater heater = 1;</code>
     */
    public com.Heating.Heater getHeater() {
      if (heaterBuilder_ == null) {
        return heater_ == null ? com.Heating.Heater.getDefaultInstance() : heater_;
      } else {
        return heaterBuilder_.getMessage();
      }
    }
    /**
     * <code>.Heater heater = 1;</code>
     */
    public Builder setHeater(com.Heating.Heater value) {
      if (heaterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        heater_ = value;
        onChanged();
      } else {
        heaterBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Heater heater = 1;</code>
     */
    public Builder setHeater(
        com.Heating.Heater.Builder builderForValue) {
      if (heaterBuilder_ == null) {
        heater_ = builderForValue.build();
        onChanged();
      } else {
        heaterBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Heater heater = 1;</code>
     */
    public Builder mergeHeater(com.Heating.Heater value) {
      if (heaterBuilder_ == null) {
        if (heater_ != null) {
          heater_ =
            com.Heating.Heater.newBuilder(heater_).mergeFrom(value).buildPartial();
        } else {
          heater_ = value;
        }
        onChanged();
      } else {
        heaterBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Heater heater = 1;</code>
     */
    public Builder clearHeater() {
      if (heaterBuilder_ == null) {
        heater_ = null;
        onChanged();
      } else {
        heater_ = null;
        heaterBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Heater heater = 1;</code>
     */
    public com.Heating.Heater.Builder getHeaterBuilder() {
      
      onChanged();
      return getHeaterFieldBuilder().getBuilder();
    }
    /**
     * <code>.Heater heater = 1;</code>
     */
    public com.Heating.HeaterOrBuilder getHeaterOrBuilder() {
      if (heaterBuilder_ != null) {
        return heaterBuilder_.getMessageOrBuilder();
      } else {
        return heater_ == null ?
            com.Heating.Heater.getDefaultInstance() : heater_;
      }
    }
    /**
     * <code>.Heater heater = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.Heating.Heater, com.Heating.Heater.Builder, com.Heating.HeaterOrBuilder> 
        getHeaterFieldBuilder() {
      if (heaterBuilder_ == null) {
        heaterBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.Heating.Heater, com.Heating.Heater.Builder, com.Heating.HeaterOrBuilder>(
                getHeater(),
                getParentForChildren(),
                isClean());
        heater_ = null;
      }
      return heaterBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:HeaterInfoResponse)
  }

  // @@protoc_insertion_point(class_scope:HeaterInfoResponse)
  private static final com.Heating.HeaterInfoResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.Heating.HeaterInfoResponse();
  }

  public static com.Heating.HeaterInfoResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HeaterInfoResponse>
      PARSER = new com.google.protobuf.AbstractParser<HeaterInfoResponse>() {
    @java.lang.Override
    public HeaterInfoResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HeaterInfoResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HeaterInfoResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HeaterInfoResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.Heating.HeaterInfoResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

