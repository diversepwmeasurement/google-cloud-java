/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/datacatalog/v1/policytagmanagerserialization.proto

package com.google.cloud.datacatalog.v1;

/**
 *
 *
 * <pre>
 * Request message for
 * [ReplaceTaxonomy][google.cloud.datacatalog.v1.PolicyTagManagerSerialization.ReplaceTaxonomy].
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1.ReplaceTaxonomyRequest}
 */
public final class ReplaceTaxonomyRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1.ReplaceTaxonomyRequest)
    ReplaceTaxonomyRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ReplaceTaxonomyRequest.newBuilder() to construct.
  private ReplaceTaxonomyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ReplaceTaxonomyRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ReplaceTaxonomyRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datacatalog.v1.PolicyTagManagerSerializationProto
        .internal_static_google_cloud_datacatalog_v1_ReplaceTaxonomyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1.PolicyTagManagerSerializationProto
        .internal_static_google_cloud_datacatalog_v1_ReplaceTaxonomyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1.ReplaceTaxonomyRequest.class,
            com.google.cloud.datacatalog.v1.ReplaceTaxonomyRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Required. Resource name of the taxonomy to update.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Resource name of the taxonomy to update.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SERIALIZED_TAXONOMY_FIELD_NUMBER = 2;
  private com.google.cloud.datacatalog.v1.SerializedTaxonomy serializedTaxonomy_;
  /**
   *
   *
   * <pre>
   * Required. Taxonomy to update along with its child policy tags.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.SerializedTaxonomy serialized_taxonomy = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the serializedTaxonomy field is set.
   */
  @java.lang.Override
  public boolean hasSerializedTaxonomy() {
    return serializedTaxonomy_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. Taxonomy to update along with its child policy tags.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.SerializedTaxonomy serialized_taxonomy = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The serializedTaxonomy.
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.SerializedTaxonomy getSerializedTaxonomy() {
    return serializedTaxonomy_ == null
        ? com.google.cloud.datacatalog.v1.SerializedTaxonomy.getDefaultInstance()
        : serializedTaxonomy_;
  }
  /**
   *
   *
   * <pre>
   * Required. Taxonomy to update along with its child policy tags.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.SerializedTaxonomy serialized_taxonomy = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.SerializedTaxonomyOrBuilder
      getSerializedTaxonomyOrBuilder() {
    return serializedTaxonomy_ == null
        ? com.google.cloud.datacatalog.v1.SerializedTaxonomy.getDefaultInstance()
        : serializedTaxonomy_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (serializedTaxonomy_ != null) {
      output.writeMessage(2, getSerializedTaxonomy());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (serializedTaxonomy_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSerializedTaxonomy());
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
    if (!(obj instanceof com.google.cloud.datacatalog.v1.ReplaceTaxonomyRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1.ReplaceTaxonomyRequest other =
        (com.google.cloud.datacatalog.v1.ReplaceTaxonomyRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasSerializedTaxonomy() != other.hasSerializedTaxonomy()) return false;
    if (hasSerializedTaxonomy()) {
      if (!getSerializedTaxonomy().equals(other.getSerializedTaxonomy())) return false;
    }
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasSerializedTaxonomy()) {
      hash = (37 * hash) + SERIALIZED_TAXONOMY_FIELD_NUMBER;
      hash = (53 * hash) + getSerializedTaxonomy().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1.ReplaceTaxonomyRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.ReplaceTaxonomyRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.ReplaceTaxonomyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.ReplaceTaxonomyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.ReplaceTaxonomyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.ReplaceTaxonomyRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.ReplaceTaxonomyRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.ReplaceTaxonomyRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.ReplaceTaxonomyRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.ReplaceTaxonomyRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.ReplaceTaxonomyRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.ReplaceTaxonomyRequest parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.datacatalog.v1.ReplaceTaxonomyRequest prototype) {
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
   * Request message for
   * [ReplaceTaxonomy][google.cloud.datacatalog.v1.PolicyTagManagerSerialization.ReplaceTaxonomy].
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1.ReplaceTaxonomyRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1.ReplaceTaxonomyRequest)
      com.google.cloud.datacatalog.v1.ReplaceTaxonomyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datacatalog.v1.PolicyTagManagerSerializationProto
          .internal_static_google_cloud_datacatalog_v1_ReplaceTaxonomyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1.PolicyTagManagerSerializationProto
          .internal_static_google_cloud_datacatalog_v1_ReplaceTaxonomyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1.ReplaceTaxonomyRequest.class,
              com.google.cloud.datacatalog.v1.ReplaceTaxonomyRequest.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1.ReplaceTaxonomyRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      serializedTaxonomy_ = null;
      if (serializedTaxonomyBuilder_ != null) {
        serializedTaxonomyBuilder_.dispose();
        serializedTaxonomyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datacatalog.v1.PolicyTagManagerSerializationProto
          .internal_static_google_cloud_datacatalog_v1_ReplaceTaxonomyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.ReplaceTaxonomyRequest getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1.ReplaceTaxonomyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.ReplaceTaxonomyRequest build() {
      com.google.cloud.datacatalog.v1.ReplaceTaxonomyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.ReplaceTaxonomyRequest buildPartial() {
      com.google.cloud.datacatalog.v1.ReplaceTaxonomyRequest result =
          new com.google.cloud.datacatalog.v1.ReplaceTaxonomyRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.datacatalog.v1.ReplaceTaxonomyRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.serializedTaxonomy_ =
            serializedTaxonomyBuilder_ == null
                ? serializedTaxonomy_
                : serializedTaxonomyBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.datacatalog.v1.ReplaceTaxonomyRequest) {
        return mergeFrom((com.google.cloud.datacatalog.v1.ReplaceTaxonomyRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1.ReplaceTaxonomyRequest other) {
      if (other == com.google.cloud.datacatalog.v1.ReplaceTaxonomyRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasSerializedTaxonomy()) {
        mergeSerializedTaxonomy(other.getSerializedTaxonomy());
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
            case 10:
              {
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(
                    getSerializedTaxonomyFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. Resource name of the taxonomy to update.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Resource name of the taxonomy to update.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Resource name of the taxonomy to update.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Resource name of the taxonomy to update.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Resource name of the taxonomy to update.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.datacatalog.v1.SerializedTaxonomy serializedTaxonomy_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.v1.SerializedTaxonomy,
            com.google.cloud.datacatalog.v1.SerializedTaxonomy.Builder,
            com.google.cloud.datacatalog.v1.SerializedTaxonomyOrBuilder>
        serializedTaxonomyBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Taxonomy to update along with its child policy tags.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.SerializedTaxonomy serialized_taxonomy = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the serializedTaxonomy field is set.
     */
    public boolean hasSerializedTaxonomy() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. Taxonomy to update along with its child policy tags.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.SerializedTaxonomy serialized_taxonomy = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The serializedTaxonomy.
     */
    public com.google.cloud.datacatalog.v1.SerializedTaxonomy getSerializedTaxonomy() {
      if (serializedTaxonomyBuilder_ == null) {
        return serializedTaxonomy_ == null
            ? com.google.cloud.datacatalog.v1.SerializedTaxonomy.getDefaultInstance()
            : serializedTaxonomy_;
      } else {
        return serializedTaxonomyBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Taxonomy to update along with its child policy tags.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.SerializedTaxonomy serialized_taxonomy = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setSerializedTaxonomy(com.google.cloud.datacatalog.v1.SerializedTaxonomy value) {
      if (serializedTaxonomyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        serializedTaxonomy_ = value;
      } else {
        serializedTaxonomyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Taxonomy to update along with its child policy tags.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.SerializedTaxonomy serialized_taxonomy = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setSerializedTaxonomy(
        com.google.cloud.datacatalog.v1.SerializedTaxonomy.Builder builderForValue) {
      if (serializedTaxonomyBuilder_ == null) {
        serializedTaxonomy_ = builderForValue.build();
      } else {
        serializedTaxonomyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Taxonomy to update along with its child policy tags.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.SerializedTaxonomy serialized_taxonomy = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeSerializedTaxonomy(
        com.google.cloud.datacatalog.v1.SerializedTaxonomy value) {
      if (serializedTaxonomyBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && serializedTaxonomy_ != null
            && serializedTaxonomy_
                != com.google.cloud.datacatalog.v1.SerializedTaxonomy.getDefaultInstance()) {
          getSerializedTaxonomyBuilder().mergeFrom(value);
        } else {
          serializedTaxonomy_ = value;
        }
      } else {
        serializedTaxonomyBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Taxonomy to update along with its child policy tags.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.SerializedTaxonomy serialized_taxonomy = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearSerializedTaxonomy() {
      bitField0_ = (bitField0_ & ~0x00000002);
      serializedTaxonomy_ = null;
      if (serializedTaxonomyBuilder_ != null) {
        serializedTaxonomyBuilder_.dispose();
        serializedTaxonomyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Taxonomy to update along with its child policy tags.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.SerializedTaxonomy serialized_taxonomy = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.datacatalog.v1.SerializedTaxonomy.Builder
        getSerializedTaxonomyBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getSerializedTaxonomyFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Taxonomy to update along with its child policy tags.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.SerializedTaxonomy serialized_taxonomy = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.datacatalog.v1.SerializedTaxonomyOrBuilder
        getSerializedTaxonomyOrBuilder() {
      if (serializedTaxonomyBuilder_ != null) {
        return serializedTaxonomyBuilder_.getMessageOrBuilder();
      } else {
        return serializedTaxonomy_ == null
            ? com.google.cloud.datacatalog.v1.SerializedTaxonomy.getDefaultInstance()
            : serializedTaxonomy_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Taxonomy to update along with its child policy tags.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.SerializedTaxonomy serialized_taxonomy = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.v1.SerializedTaxonomy,
            com.google.cloud.datacatalog.v1.SerializedTaxonomy.Builder,
            com.google.cloud.datacatalog.v1.SerializedTaxonomyOrBuilder>
        getSerializedTaxonomyFieldBuilder() {
      if (serializedTaxonomyBuilder_ == null) {
        serializedTaxonomyBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.datacatalog.v1.SerializedTaxonomy,
                com.google.cloud.datacatalog.v1.SerializedTaxonomy.Builder,
                com.google.cloud.datacatalog.v1.SerializedTaxonomyOrBuilder>(
                getSerializedTaxonomy(), getParentForChildren(), isClean());
        serializedTaxonomy_ = null;
      }
      return serializedTaxonomyBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1.ReplaceTaxonomyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1.ReplaceTaxonomyRequest)
  private static final com.google.cloud.datacatalog.v1.ReplaceTaxonomyRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1.ReplaceTaxonomyRequest();
  }

  public static com.google.cloud.datacatalog.v1.ReplaceTaxonomyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReplaceTaxonomyRequest> PARSER =
      new com.google.protobuf.AbstractParser<ReplaceTaxonomyRequest>() {
        @java.lang.Override
        public ReplaceTaxonomyRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReplaceTaxonomyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReplaceTaxonomyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1.ReplaceTaxonomyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
