/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataplex/v1/metadata.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dataplex.v1;

/**
 *
 *
 * <pre>
 * Update a metadata entity request.
 * The exiting entity will be fully replaced by the entity in the request.
 * The entity ID is mutable. To modify the ID, use the current entity ID in the
 * request URL and specify the new ID in the request body.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataplex.v1.UpdateEntityRequest}
 */
public final class UpdateEntityRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataplex.v1.UpdateEntityRequest)
    UpdateEntityRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateEntityRequest.newBuilder() to construct.
  private UpdateEntityRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateEntityRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateEntityRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataplex.v1.MetadataProto
        .internal_static_google_cloud_dataplex_v1_UpdateEntityRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataplex.v1.MetadataProto
        .internal_static_google_cloud_dataplex_v1_UpdateEntityRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataplex.v1.UpdateEntityRequest.class,
            com.google.cloud.dataplex.v1.UpdateEntityRequest.Builder.class);
  }

  private int bitField0_;
  public static final int ENTITY_FIELD_NUMBER = 2;
  private com.google.cloud.dataplex.v1.Entity entity_;
  /**
   *
   *
   * <pre>
   * Required. Update description.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Entity entity = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the entity field is set.
   */
  @java.lang.Override
  public boolean hasEntity() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. Update description.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Entity entity = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The entity.
   */
  @java.lang.Override
  public com.google.cloud.dataplex.v1.Entity getEntity() {
    return entity_ == null ? com.google.cloud.dataplex.v1.Entity.getDefaultInstance() : entity_;
  }
  /**
   *
   *
   * <pre>
   * Required. Update description.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Entity entity = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dataplex.v1.EntityOrBuilder getEntityOrBuilder() {
    return entity_ == null ? com.google.cloud.dataplex.v1.Entity.getDefaultInstance() : entity_;
  }

  public static final int VALIDATE_ONLY_FIELD_NUMBER = 3;
  private boolean validateOnly_ = false;
  /**
   *
   *
   * <pre>
   * Optional. Only validate the request, but do not perform mutations.
   * The default is false.
   * </pre>
   *
   * <code>bool validate_only = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The validateOnly.
   */
  @java.lang.Override
  public boolean getValidateOnly() {
    return validateOnly_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getEntity());
    }
    if (validateOnly_ != false) {
      output.writeBool(3, validateOnly_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getEntity());
    }
    if (validateOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, validateOnly_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.dataplex.v1.UpdateEntityRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dataplex.v1.UpdateEntityRequest other =
        (com.google.cloud.dataplex.v1.UpdateEntityRequest) obj;

    if (hasEntity() != other.hasEntity()) return false;
    if (hasEntity()) {
      if (!getEntity().equals(other.getEntity())) return false;
    }
    if (getValidateOnly() != other.getValidateOnly()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasEntity()) {
      hash = (37 * hash) + ENTITY_FIELD_NUMBER;
      hash = (53 * hash) + getEntity().hashCode();
    }
    hash = (37 * hash) + VALIDATE_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getValidateOnly());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataplex.v1.UpdateEntityRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.UpdateEntityRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.UpdateEntityRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.UpdateEntityRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.UpdateEntityRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.UpdateEntityRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.UpdateEntityRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.UpdateEntityRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.UpdateEntityRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.UpdateEntityRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.UpdateEntityRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.UpdateEntityRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.dataplex.v1.UpdateEntityRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Update a metadata entity request.
   * The exiting entity will be fully replaced by the entity in the request.
   * The entity ID is mutable. To modify the ID, use the current entity ID in the
   * request URL and specify the new ID in the request body.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataplex.v1.UpdateEntityRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataplex.v1.UpdateEntityRequest)
      com.google.cloud.dataplex.v1.UpdateEntityRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataplex.v1.MetadataProto
          .internal_static_google_cloud_dataplex_v1_UpdateEntityRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataplex.v1.MetadataProto
          .internal_static_google_cloud_dataplex_v1_UpdateEntityRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataplex.v1.UpdateEntityRequest.class,
              com.google.cloud.dataplex.v1.UpdateEntityRequest.Builder.class);
    }

    // Construct using com.google.cloud.dataplex.v1.UpdateEntityRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getEntityFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      entity_ = null;
      if (entityBuilder_ != null) {
        entityBuilder_.dispose();
        entityBuilder_ = null;
      }
      validateOnly_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataplex.v1.MetadataProto
          .internal_static_google_cloud_dataplex_v1_UpdateEntityRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.UpdateEntityRequest getDefaultInstanceForType() {
      return com.google.cloud.dataplex.v1.UpdateEntityRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.UpdateEntityRequest build() {
      com.google.cloud.dataplex.v1.UpdateEntityRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.UpdateEntityRequest buildPartial() {
      com.google.cloud.dataplex.v1.UpdateEntityRequest result =
          new com.google.cloud.dataplex.v1.UpdateEntityRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dataplex.v1.UpdateEntityRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.entity_ = entityBuilder_ == null ? entity_ : entityBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.validateOnly_ = validateOnly_;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.dataplex.v1.UpdateEntityRequest) {
        return mergeFrom((com.google.cloud.dataplex.v1.UpdateEntityRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataplex.v1.UpdateEntityRequest other) {
      if (other == com.google.cloud.dataplex.v1.UpdateEntityRequest.getDefaultInstance())
        return this;
      if (other.hasEntity()) {
        mergeEntity(other.getEntity());
      }
      if (other.getValidateOnly() != false) {
        setValidateOnly(other.getValidateOnly());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 18:
              {
                input.readMessage(getEntityFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 18
            case 24:
              {
                validateOnly_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 24
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private com.google.cloud.dataplex.v1.Entity entity_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataplex.v1.Entity,
            com.google.cloud.dataplex.v1.Entity.Builder,
            com.google.cloud.dataplex.v1.EntityOrBuilder>
        entityBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Update description.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Entity entity = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the entity field is set.
     */
    public boolean hasEntity() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. Update description.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Entity entity = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The entity.
     */
    public com.google.cloud.dataplex.v1.Entity getEntity() {
      if (entityBuilder_ == null) {
        return entity_ == null ? com.google.cloud.dataplex.v1.Entity.getDefaultInstance() : entity_;
      } else {
        return entityBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Update description.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Entity entity = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setEntity(com.google.cloud.dataplex.v1.Entity value) {
      if (entityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        entity_ = value;
      } else {
        entityBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Update description.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Entity entity = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setEntity(com.google.cloud.dataplex.v1.Entity.Builder builderForValue) {
      if (entityBuilder_ == null) {
        entity_ = builderForValue.build();
      } else {
        entityBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Update description.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Entity entity = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeEntity(com.google.cloud.dataplex.v1.Entity value) {
      if (entityBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && entity_ != null
            && entity_ != com.google.cloud.dataplex.v1.Entity.getDefaultInstance()) {
          getEntityBuilder().mergeFrom(value);
        } else {
          entity_ = value;
        }
      } else {
        entityBuilder_.mergeFrom(value);
      }
      if (entity_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Update description.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Entity entity = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearEntity() {
      bitField0_ = (bitField0_ & ~0x00000001);
      entity_ = null;
      if (entityBuilder_ != null) {
        entityBuilder_.dispose();
        entityBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Update description.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Entity entity = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dataplex.v1.Entity.Builder getEntityBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getEntityFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Update description.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Entity entity = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dataplex.v1.EntityOrBuilder getEntityOrBuilder() {
      if (entityBuilder_ != null) {
        return entityBuilder_.getMessageOrBuilder();
      } else {
        return entity_ == null ? com.google.cloud.dataplex.v1.Entity.getDefaultInstance() : entity_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Update description.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Entity entity = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataplex.v1.Entity,
            com.google.cloud.dataplex.v1.Entity.Builder,
            com.google.cloud.dataplex.v1.EntityOrBuilder>
        getEntityFieldBuilder() {
      if (entityBuilder_ == null) {
        entityBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dataplex.v1.Entity,
                com.google.cloud.dataplex.v1.Entity.Builder,
                com.google.cloud.dataplex.v1.EntityOrBuilder>(
                getEntity(), getParentForChildren(), isClean());
        entity_ = null;
      }
      return entityBuilder_;
    }

    private boolean validateOnly_;
    /**
     *
     *
     * <pre>
     * Optional. Only validate the request, but do not perform mutations.
     * The default is false.
     * </pre>
     *
     * <code>bool validate_only = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The validateOnly.
     */
    @java.lang.Override
    public boolean getValidateOnly() {
      return validateOnly_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Only validate the request, but do not perform mutations.
     * The default is false.
     * </pre>
     *
     * <code>bool validate_only = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The validateOnly to set.
     * @return This builder for chaining.
     */
    public Builder setValidateOnly(boolean value) {

      validateOnly_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Only validate the request, but do not perform mutations.
     * The default is false.
     * </pre>
     *
     * <code>bool validate_only = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearValidateOnly() {
      bitField0_ = (bitField0_ & ~0x00000002);
      validateOnly_ = false;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.dataplex.v1.UpdateEntityRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataplex.v1.UpdateEntityRequest)
  private static final com.google.cloud.dataplex.v1.UpdateEntityRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataplex.v1.UpdateEntityRequest();
  }

  public static com.google.cloud.dataplex.v1.UpdateEntityRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateEntityRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateEntityRequest>() {
        @java.lang.Override
        public UpdateEntityRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<UpdateEntityRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateEntityRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataplex.v1.UpdateEntityRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
