// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/prediction_service.proto

package com.google.cloud.automl.v1beta1;

/**
 * <pre>
 * Response message for [PredictionService.Predict][google.cloud.automl.v1beta1.PredictionService.Predict].
 * Currently, this is only
 * used to return an image recognition prediction result. More prediction
 * output metadata might be introduced in the future.
 * </pre>
 *
 * Protobuf type {@code google.cloud.automl.v1beta1.PredictResponse}
 */
public  final class PredictResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.automl.v1beta1.PredictResponse)
    PredictResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PredictResponse.newBuilder() to construct.
  private PredictResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PredictResponse() {
    payload_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PredictResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              payload_ = new java.util.ArrayList<com.google.cloud.automl.v1beta1.AnnotationPayload>();
              mutable_bitField0_ |= 0x00000001;
            }
            payload_.add(
                input.readMessage(com.google.cloud.automl.v1beta1.AnnotationPayload.parser(), extensionRegistry));
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              metadata_ = com.google.protobuf.MapField.newMapField(
                  MetadataDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000002;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
            metadata__ = input.readMessage(
                MetadataDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            metadata_.getMutableMap().put(
                metadata__.getKey(), metadata__.getValue());
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        payload_ = java.util.Collections.unmodifiableList(payload_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.automl.v1beta1.PredictionServiceProto.internal_static_google_cloud_automl_v1beta1_PredictResponse_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetMetadata();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.automl.v1beta1.PredictionServiceProto.internal_static_google_cloud_automl_v1beta1_PredictResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.automl.v1beta1.PredictResponse.class, com.google.cloud.automl.v1beta1.PredictResponse.Builder.class);
  }

  public static final int PAYLOAD_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.automl.v1beta1.AnnotationPayload> payload_;
  /**
   * <pre>
   * Prediction result.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.AnnotationPayload payload = 1;</code>
   */
  public java.util.List<com.google.cloud.automl.v1beta1.AnnotationPayload> getPayloadList() {
    return payload_;
  }
  /**
   * <pre>
   * Prediction result.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.AnnotationPayload payload = 1;</code>
   */
  public java.util.List<? extends com.google.cloud.automl.v1beta1.AnnotationPayloadOrBuilder> 
      getPayloadOrBuilderList() {
    return payload_;
  }
  /**
   * <pre>
   * Prediction result.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.AnnotationPayload payload = 1;</code>
   */
  public int getPayloadCount() {
    return payload_.size();
  }
  /**
   * <pre>
   * Prediction result.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.AnnotationPayload payload = 1;</code>
   */
  public com.google.cloud.automl.v1beta1.AnnotationPayload getPayload(int index) {
    return payload_.get(index);
  }
  /**
   * <pre>
   * Prediction result.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.AnnotationPayload payload = 1;</code>
   */
  public com.google.cloud.automl.v1beta1.AnnotationPayloadOrBuilder getPayloadOrBuilder(
      int index) {
    return payload_.get(index);
  }

  public static final int METADATA_FIELD_NUMBER = 2;
  private static final class MetadataDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.google.cloud.automl.v1beta1.PredictionServiceProto.internal_static_google_cloud_automl_v1beta1_PredictResponse_MetadataEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> metadata_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetMetadata() {
    if (metadata_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          MetadataDefaultEntryHolder.defaultEntry);
    }
    return metadata_;
  }

  public int getMetadataCount() {
    return internalGetMetadata().getMap().size();
  }
  /**
   * <pre>
   * Additional domain-specific prediction response metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 2;</code>
   */

  public boolean containsMetadata(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetMetadata().getMap().containsKey(key);
  }
  /**
   * Use {@link #getMetadataMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getMetadata() {
    return getMetadataMap();
  }
  /**
   * <pre>
   * Additional domain-specific prediction response metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 2;</code>
   */

  public java.util.Map<java.lang.String, java.lang.String> getMetadataMap() {
    return internalGetMetadata().getMap();
  }
  /**
   * <pre>
   * Additional domain-specific prediction response metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 2;</code>
   */

  public java.lang.String getMetadataOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetMetadata().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * Additional domain-specific prediction response metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 2;</code>
   */

  public java.lang.String getMetadataOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetMetadata().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < payload_.size(); i++) {
      output.writeMessage(1, payload_.get(i));
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetMetadata(),
        MetadataDefaultEntryHolder.defaultEntry,
        2);
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < payload_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, payload_.get(i));
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetMetadata().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      metadata__ = MetadataDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, metadata__);
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
    if (!(obj instanceof com.google.cloud.automl.v1beta1.PredictResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.automl.v1beta1.PredictResponse other = (com.google.cloud.automl.v1beta1.PredictResponse) obj;

    boolean result = true;
    result = result && getPayloadList()
        .equals(other.getPayloadList());
    result = result && internalGetMetadata().equals(
        other.internalGetMetadata());
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
    if (getPayloadCount() > 0) {
      hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
      hash = (53 * hash) + getPayloadList().hashCode();
    }
    if (!internalGetMetadata().getMap().isEmpty()) {
      hash = (37 * hash) + METADATA_FIELD_NUMBER;
      hash = (53 * hash) + internalGetMetadata().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.automl.v1beta1.PredictResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.automl.v1beta1.PredictResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.automl.v1beta1.PredictResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.automl.v1beta1.PredictResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.automl.v1beta1.PredictResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.automl.v1beta1.PredictResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.automl.v1beta1.PredictResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.automl.v1beta1.PredictResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.automl.v1beta1.PredictResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.automl.v1beta1.PredictResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.automl.v1beta1.PredictResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.automl.v1beta1.PredictResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.automl.v1beta1.PredictResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * <pre>
   * Response message for [PredictionService.Predict][google.cloud.automl.v1beta1.PredictionService.Predict].
   * Currently, this is only
   * used to return an image recognition prediction result. More prediction
   * output metadata might be introduced in the future.
   * </pre>
   *
   * Protobuf type {@code google.cloud.automl.v1beta1.PredictResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.automl.v1beta1.PredictResponse)
      com.google.cloud.automl.v1beta1.PredictResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.automl.v1beta1.PredictionServiceProto.internal_static_google_cloud_automl_v1beta1_PredictResponse_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMetadata();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableMetadata();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.automl.v1beta1.PredictionServiceProto.internal_static_google_cloud_automl_v1beta1_PredictResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.automl.v1beta1.PredictResponse.class, com.google.cloud.automl.v1beta1.PredictResponse.Builder.class);
    }

    // Construct using com.google.cloud.automl.v1beta1.PredictResponse.newBuilder()
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
        getPayloadFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (payloadBuilder_ == null) {
        payload_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        payloadBuilder_.clear();
      }
      internalGetMutableMetadata().clear();
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.automl.v1beta1.PredictionServiceProto.internal_static_google_cloud_automl_v1beta1_PredictResponse_descriptor;
    }

    public com.google.cloud.automl.v1beta1.PredictResponse getDefaultInstanceForType() {
      return com.google.cloud.automl.v1beta1.PredictResponse.getDefaultInstance();
    }

    public com.google.cloud.automl.v1beta1.PredictResponse build() {
      com.google.cloud.automl.v1beta1.PredictResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.automl.v1beta1.PredictResponse buildPartial() {
      com.google.cloud.automl.v1beta1.PredictResponse result = new com.google.cloud.automl.v1beta1.PredictResponse(this);
      int from_bitField0_ = bitField0_;
      if (payloadBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          payload_ = java.util.Collections.unmodifiableList(payload_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.payload_ = payload_;
      } else {
        result.payload_ = payloadBuilder_.build();
      }
      result.metadata_ = internalGetMetadata();
      result.metadata_.makeImmutable();
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.automl.v1beta1.PredictResponse) {
        return mergeFrom((com.google.cloud.automl.v1beta1.PredictResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.automl.v1beta1.PredictResponse other) {
      if (other == com.google.cloud.automl.v1beta1.PredictResponse.getDefaultInstance()) return this;
      if (payloadBuilder_ == null) {
        if (!other.payload_.isEmpty()) {
          if (payload_.isEmpty()) {
            payload_ = other.payload_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePayloadIsMutable();
            payload_.addAll(other.payload_);
          }
          onChanged();
        }
      } else {
        if (!other.payload_.isEmpty()) {
          if (payloadBuilder_.isEmpty()) {
            payloadBuilder_.dispose();
            payloadBuilder_ = null;
            payload_ = other.payload_;
            bitField0_ = (bitField0_ & ~0x00000001);
            payloadBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPayloadFieldBuilder() : null;
          } else {
            payloadBuilder_.addAllMessages(other.payload_);
          }
        }
      }
      internalGetMutableMetadata().mergeFrom(
          other.internalGetMetadata());
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.automl.v1beta1.PredictResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.automl.v1beta1.PredictResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.cloud.automl.v1beta1.AnnotationPayload> payload_ =
      java.util.Collections.emptyList();
    private void ensurePayloadIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        payload_ = new java.util.ArrayList<com.google.cloud.automl.v1beta1.AnnotationPayload>(payload_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.automl.v1beta1.AnnotationPayload, com.google.cloud.automl.v1beta1.AnnotationPayload.Builder, com.google.cloud.automl.v1beta1.AnnotationPayloadOrBuilder> payloadBuilder_;

    /**
     * <pre>
     * Prediction result.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1beta1.AnnotationPayload payload = 1;</code>
     */
    public java.util.List<com.google.cloud.automl.v1beta1.AnnotationPayload> getPayloadList() {
      if (payloadBuilder_ == null) {
        return java.util.Collections.unmodifiableList(payload_);
      } else {
        return payloadBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Prediction result.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1beta1.AnnotationPayload payload = 1;</code>
     */
    public int getPayloadCount() {
      if (payloadBuilder_ == null) {
        return payload_.size();
      } else {
        return payloadBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Prediction result.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1beta1.AnnotationPayload payload = 1;</code>
     */
    public com.google.cloud.automl.v1beta1.AnnotationPayload getPayload(int index) {
      if (payloadBuilder_ == null) {
        return payload_.get(index);
      } else {
        return payloadBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Prediction result.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1beta1.AnnotationPayload payload = 1;</code>
     */
    public Builder setPayload(
        int index, com.google.cloud.automl.v1beta1.AnnotationPayload value) {
      if (payloadBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePayloadIsMutable();
        payload_.set(index, value);
        onChanged();
      } else {
        payloadBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Prediction result.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1beta1.AnnotationPayload payload = 1;</code>
     */
    public Builder setPayload(
        int index, com.google.cloud.automl.v1beta1.AnnotationPayload.Builder builderForValue) {
      if (payloadBuilder_ == null) {
        ensurePayloadIsMutable();
        payload_.set(index, builderForValue.build());
        onChanged();
      } else {
        payloadBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Prediction result.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1beta1.AnnotationPayload payload = 1;</code>
     */
    public Builder addPayload(com.google.cloud.automl.v1beta1.AnnotationPayload value) {
      if (payloadBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePayloadIsMutable();
        payload_.add(value);
        onChanged();
      } else {
        payloadBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Prediction result.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1beta1.AnnotationPayload payload = 1;</code>
     */
    public Builder addPayload(
        int index, com.google.cloud.automl.v1beta1.AnnotationPayload value) {
      if (payloadBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePayloadIsMutable();
        payload_.add(index, value);
        onChanged();
      } else {
        payloadBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Prediction result.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1beta1.AnnotationPayload payload = 1;</code>
     */
    public Builder addPayload(
        com.google.cloud.automl.v1beta1.AnnotationPayload.Builder builderForValue) {
      if (payloadBuilder_ == null) {
        ensurePayloadIsMutable();
        payload_.add(builderForValue.build());
        onChanged();
      } else {
        payloadBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Prediction result.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1beta1.AnnotationPayload payload = 1;</code>
     */
    public Builder addPayload(
        int index, com.google.cloud.automl.v1beta1.AnnotationPayload.Builder builderForValue) {
      if (payloadBuilder_ == null) {
        ensurePayloadIsMutable();
        payload_.add(index, builderForValue.build());
        onChanged();
      } else {
        payloadBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Prediction result.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1beta1.AnnotationPayload payload = 1;</code>
     */
    public Builder addAllPayload(
        java.lang.Iterable<? extends com.google.cloud.automl.v1beta1.AnnotationPayload> values) {
      if (payloadBuilder_ == null) {
        ensurePayloadIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, payload_);
        onChanged();
      } else {
        payloadBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Prediction result.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1beta1.AnnotationPayload payload = 1;</code>
     */
    public Builder clearPayload() {
      if (payloadBuilder_ == null) {
        payload_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        payloadBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Prediction result.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1beta1.AnnotationPayload payload = 1;</code>
     */
    public Builder removePayload(int index) {
      if (payloadBuilder_ == null) {
        ensurePayloadIsMutable();
        payload_.remove(index);
        onChanged();
      } else {
        payloadBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Prediction result.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1beta1.AnnotationPayload payload = 1;</code>
     */
    public com.google.cloud.automl.v1beta1.AnnotationPayload.Builder getPayloadBuilder(
        int index) {
      return getPayloadFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Prediction result.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1beta1.AnnotationPayload payload = 1;</code>
     */
    public com.google.cloud.automl.v1beta1.AnnotationPayloadOrBuilder getPayloadOrBuilder(
        int index) {
      if (payloadBuilder_ == null) {
        return payload_.get(index);  } else {
        return payloadBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Prediction result.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1beta1.AnnotationPayload payload = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.automl.v1beta1.AnnotationPayloadOrBuilder> 
         getPayloadOrBuilderList() {
      if (payloadBuilder_ != null) {
        return payloadBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(payload_);
      }
    }
    /**
     * <pre>
     * Prediction result.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1beta1.AnnotationPayload payload = 1;</code>
     */
    public com.google.cloud.automl.v1beta1.AnnotationPayload.Builder addPayloadBuilder() {
      return getPayloadFieldBuilder().addBuilder(
          com.google.cloud.automl.v1beta1.AnnotationPayload.getDefaultInstance());
    }
    /**
     * <pre>
     * Prediction result.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1beta1.AnnotationPayload payload = 1;</code>
     */
    public com.google.cloud.automl.v1beta1.AnnotationPayload.Builder addPayloadBuilder(
        int index) {
      return getPayloadFieldBuilder().addBuilder(
          index, com.google.cloud.automl.v1beta1.AnnotationPayload.getDefaultInstance());
    }
    /**
     * <pre>
     * Prediction result.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1beta1.AnnotationPayload payload = 1;</code>
     */
    public java.util.List<com.google.cloud.automl.v1beta1.AnnotationPayload.Builder> 
         getPayloadBuilderList() {
      return getPayloadFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.automl.v1beta1.AnnotationPayload, com.google.cloud.automl.v1beta1.AnnotationPayload.Builder, com.google.cloud.automl.v1beta1.AnnotationPayloadOrBuilder> 
        getPayloadFieldBuilder() {
      if (payloadBuilder_ == null) {
        payloadBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.automl.v1beta1.AnnotationPayload, com.google.cloud.automl.v1beta1.AnnotationPayload.Builder, com.google.cloud.automl.v1beta1.AnnotationPayloadOrBuilder>(
                payload_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        payload_ = null;
      }
      return payloadBuilder_;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> metadata_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMetadata() {
      if (metadata_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            MetadataDefaultEntryHolder.defaultEntry);
      }
      return metadata_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableMetadata() {
      onChanged();;
      if (metadata_ == null) {
        metadata_ = com.google.protobuf.MapField.newMapField(
            MetadataDefaultEntryHolder.defaultEntry);
      }
      if (!metadata_.isMutable()) {
        metadata_ = metadata_.copy();
      }
      return metadata_;
    }

    public int getMetadataCount() {
      return internalGetMetadata().getMap().size();
    }
    /**
     * <pre>
     * Additional domain-specific prediction response metadata.
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 2;</code>
     */

    public boolean containsMetadata(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetMetadata().getMap().containsKey(key);
    }
    /**
     * Use {@link #getMetadataMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMetadata() {
      return getMetadataMap();
    }
    /**
     * <pre>
     * Additional domain-specific prediction response metadata.
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 2;</code>
     */

    public java.util.Map<java.lang.String, java.lang.String> getMetadataMap() {
      return internalGetMetadata().getMap();
    }
    /**
     * <pre>
     * Additional domain-specific prediction response metadata.
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 2;</code>
     */

    public java.lang.String getMetadataOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetMetadata().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * Additional domain-specific prediction response metadata.
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 2;</code>
     */

    public java.lang.String getMetadataOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetMetadata().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearMetadata() {
      internalGetMutableMetadata().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * Additional domain-specific prediction response metadata.
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 2;</code>
     */

    public Builder removeMetadata(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableMetadata().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableMetadata() {
      return internalGetMutableMetadata().getMutableMap();
    }
    /**
     * <pre>
     * Additional domain-specific prediction response metadata.
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 2;</code>
     */
    public Builder putMetadata(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableMetadata().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     * Additional domain-specific prediction response metadata.
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 2;</code>
     */

    public Builder putAllMetadata(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableMetadata().getMutableMap()
          .putAll(values);
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.automl.v1beta1.PredictResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.automl.v1beta1.PredictResponse)
  private static final com.google.cloud.automl.v1beta1.PredictResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.automl.v1beta1.PredictResponse();
  }

  public static com.google.cloud.automl.v1beta1.PredictResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PredictResponse>
      PARSER = new com.google.protobuf.AbstractParser<PredictResponse>() {
    public PredictResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new PredictResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PredictResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PredictResponse> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.automl.v1beta1.PredictResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

