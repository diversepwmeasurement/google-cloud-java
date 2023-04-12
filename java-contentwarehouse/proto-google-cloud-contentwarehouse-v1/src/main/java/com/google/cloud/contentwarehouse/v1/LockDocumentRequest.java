/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/contentwarehouse/v1/document_service_request.proto

package com.google.cloud.contentwarehouse.v1;

/**
 *
 *
 * <pre>
 * Request message for DocumentService.LockDocument.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contentwarehouse.v1.LockDocumentRequest}
 */
public final class LockDocumentRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.contentwarehouse.v1.LockDocumentRequest)
    LockDocumentRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use LockDocumentRequest.newBuilder() to construct.
  private LockDocumentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private LockDocumentRequest() {
    name_ = "";
    collectionId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new LockDocumentRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.contentwarehouse.v1.DocumentServiceRequestProto
        .internal_static_google_cloud_contentwarehouse_v1_LockDocumentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contentwarehouse.v1.DocumentServiceRequestProto
        .internal_static_google_cloud_contentwarehouse_v1_LockDocumentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contentwarehouse.v1.LockDocumentRequest.class,
            com.google.cloud.contentwarehouse.v1.LockDocumentRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Required. The name of the document to lock.
   * Format:
   * projects/{project_number}/locations/{location}/documents/{document}.
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
   * Required. The name of the document to lock.
   * Format:
   * projects/{project_number}/locations/{location}/documents/{document}.
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

  public static final int COLLECTION_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object collectionId_ = "";
  /**
   *
   *
   * <pre>
   * The collection the document connects to.
   * </pre>
   *
   * <code>string collection_id = 2;</code>
   *
   * @return The collectionId.
   */
  @java.lang.Override
  public java.lang.String getCollectionId() {
    java.lang.Object ref = collectionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      collectionId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The collection the document connects to.
   * </pre>
   *
   * <code>string collection_id = 2;</code>
   *
   * @return The bytes for collectionId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCollectionIdBytes() {
    java.lang.Object ref = collectionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      collectionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LOCKING_USER_FIELD_NUMBER = 3;
  private com.google.cloud.contentwarehouse.v1.UserInfo lockingUser_;
  /**
   *
   *
   * <pre>
   * The user information who locks the document.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.UserInfo locking_user = 3;</code>
   *
   * @return Whether the lockingUser field is set.
   */
  @java.lang.Override
  public boolean hasLockingUser() {
    return lockingUser_ != null;
  }
  /**
   *
   *
   * <pre>
   * The user information who locks the document.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.UserInfo locking_user = 3;</code>
   *
   * @return The lockingUser.
   */
  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.UserInfo getLockingUser() {
    return lockingUser_ == null
        ? com.google.cloud.contentwarehouse.v1.UserInfo.getDefaultInstance()
        : lockingUser_;
  }
  /**
   *
   *
   * <pre>
   * The user information who locks the document.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.UserInfo locking_user = 3;</code>
   */
  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.UserInfoOrBuilder getLockingUserOrBuilder() {
    return lockingUser_ == null
        ? com.google.cloud.contentwarehouse.v1.UserInfo.getDefaultInstance()
        : lockingUser_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(collectionId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, collectionId_);
    }
    if (lockingUser_ != null) {
      output.writeMessage(3, getLockingUser());
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(collectionId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, collectionId_);
    }
    if (lockingUser_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getLockingUser());
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
    if (!(obj instanceof com.google.cloud.contentwarehouse.v1.LockDocumentRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.contentwarehouse.v1.LockDocumentRequest other =
        (com.google.cloud.contentwarehouse.v1.LockDocumentRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getCollectionId().equals(other.getCollectionId())) return false;
    if (hasLockingUser() != other.hasLockingUser()) return false;
    if (hasLockingUser()) {
      if (!getLockingUser().equals(other.getLockingUser())) return false;
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
    hash = (37 * hash) + COLLECTION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCollectionId().hashCode();
    if (hasLockingUser()) {
      hash = (37 * hash) + LOCKING_USER_FIELD_NUMBER;
      hash = (53 * hash) + getLockingUser().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contentwarehouse.v1.LockDocumentRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.LockDocumentRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.LockDocumentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.LockDocumentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.LockDocumentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.LockDocumentRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.LockDocumentRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.LockDocumentRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.LockDocumentRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.LockDocumentRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.LockDocumentRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.LockDocumentRequest parseFrom(
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
      com.google.cloud.contentwarehouse.v1.LockDocumentRequest prototype) {
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
   * Request message for DocumentService.LockDocument.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contentwarehouse.v1.LockDocumentRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contentwarehouse.v1.LockDocumentRequest)
      com.google.cloud.contentwarehouse.v1.LockDocumentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.contentwarehouse.v1.DocumentServiceRequestProto
          .internal_static_google_cloud_contentwarehouse_v1_LockDocumentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contentwarehouse.v1.DocumentServiceRequestProto
          .internal_static_google_cloud_contentwarehouse_v1_LockDocumentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contentwarehouse.v1.LockDocumentRequest.class,
              com.google.cloud.contentwarehouse.v1.LockDocumentRequest.Builder.class);
    }

    // Construct using com.google.cloud.contentwarehouse.v1.LockDocumentRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      collectionId_ = "";
      lockingUser_ = null;
      if (lockingUserBuilder_ != null) {
        lockingUserBuilder_.dispose();
        lockingUserBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.contentwarehouse.v1.DocumentServiceRequestProto
          .internal_static_google_cloud_contentwarehouse_v1_LockDocumentRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.LockDocumentRequest getDefaultInstanceForType() {
      return com.google.cloud.contentwarehouse.v1.LockDocumentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.LockDocumentRequest build() {
      com.google.cloud.contentwarehouse.v1.LockDocumentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.LockDocumentRequest buildPartial() {
      com.google.cloud.contentwarehouse.v1.LockDocumentRequest result =
          new com.google.cloud.contentwarehouse.v1.LockDocumentRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.contentwarehouse.v1.LockDocumentRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.collectionId_ = collectionId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.lockingUser_ =
            lockingUserBuilder_ == null ? lockingUser_ : lockingUserBuilder_.build();
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
      if (other instanceof com.google.cloud.contentwarehouse.v1.LockDocumentRequest) {
        return mergeFrom((com.google.cloud.contentwarehouse.v1.LockDocumentRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contentwarehouse.v1.LockDocumentRequest other) {
      if (other == com.google.cloud.contentwarehouse.v1.LockDocumentRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getCollectionId().isEmpty()) {
        collectionId_ = other.collectionId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasLockingUser()) {
        mergeLockingUser(other.getLockingUser());
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
                collectionId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getLockingUserFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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
     * Required. The name of the document to lock.
     * Format:
     * projects/{project_number}/locations/{location}/documents/{document}.
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
     * Required. The name of the document to lock.
     * Format:
     * projects/{project_number}/locations/{location}/documents/{document}.
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
     * Required. The name of the document to lock.
     * Format:
     * projects/{project_number}/locations/{location}/documents/{document}.
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
     * Required. The name of the document to lock.
     * Format:
     * projects/{project_number}/locations/{location}/documents/{document}.
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
     * Required. The name of the document to lock.
     * Format:
     * projects/{project_number}/locations/{location}/documents/{document}.
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

    private java.lang.Object collectionId_ = "";
    /**
     *
     *
     * <pre>
     * The collection the document connects to.
     * </pre>
     *
     * <code>string collection_id = 2;</code>
     *
     * @return The collectionId.
     */
    public java.lang.String getCollectionId() {
      java.lang.Object ref = collectionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        collectionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The collection the document connects to.
     * </pre>
     *
     * <code>string collection_id = 2;</code>
     *
     * @return The bytes for collectionId.
     */
    public com.google.protobuf.ByteString getCollectionIdBytes() {
      java.lang.Object ref = collectionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        collectionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The collection the document connects to.
     * </pre>
     *
     * <code>string collection_id = 2;</code>
     *
     * @param value The collectionId to set.
     * @return This builder for chaining.
     */
    public Builder setCollectionId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      collectionId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The collection the document connects to.
     * </pre>
     *
     * <code>string collection_id = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCollectionId() {
      collectionId_ = getDefaultInstance().getCollectionId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The collection the document connects to.
     * </pre>
     *
     * <code>string collection_id = 2;</code>
     *
     * @param value The bytes for collectionId to set.
     * @return This builder for chaining.
     */
    public Builder setCollectionIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      collectionId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.contentwarehouse.v1.UserInfo lockingUser_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contentwarehouse.v1.UserInfo,
            com.google.cloud.contentwarehouse.v1.UserInfo.Builder,
            com.google.cloud.contentwarehouse.v1.UserInfoOrBuilder>
        lockingUserBuilder_;
    /**
     *
     *
     * <pre>
     * The user information who locks the document.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.UserInfo locking_user = 3;</code>
     *
     * @return Whether the lockingUser field is set.
     */
    public boolean hasLockingUser() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * The user information who locks the document.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.UserInfo locking_user = 3;</code>
     *
     * @return The lockingUser.
     */
    public com.google.cloud.contentwarehouse.v1.UserInfo getLockingUser() {
      if (lockingUserBuilder_ == null) {
        return lockingUser_ == null
            ? com.google.cloud.contentwarehouse.v1.UserInfo.getDefaultInstance()
            : lockingUser_;
      } else {
        return lockingUserBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The user information who locks the document.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.UserInfo locking_user = 3;</code>
     */
    public Builder setLockingUser(com.google.cloud.contentwarehouse.v1.UserInfo value) {
      if (lockingUserBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lockingUser_ = value;
      } else {
        lockingUserBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The user information who locks the document.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.UserInfo locking_user = 3;</code>
     */
    public Builder setLockingUser(
        com.google.cloud.contentwarehouse.v1.UserInfo.Builder builderForValue) {
      if (lockingUserBuilder_ == null) {
        lockingUser_ = builderForValue.build();
      } else {
        lockingUserBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The user information who locks the document.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.UserInfo locking_user = 3;</code>
     */
    public Builder mergeLockingUser(com.google.cloud.contentwarehouse.v1.UserInfo value) {
      if (lockingUserBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && lockingUser_ != null
            && lockingUser_ != com.google.cloud.contentwarehouse.v1.UserInfo.getDefaultInstance()) {
          getLockingUserBuilder().mergeFrom(value);
        } else {
          lockingUser_ = value;
        }
      } else {
        lockingUserBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The user information who locks the document.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.UserInfo locking_user = 3;</code>
     */
    public Builder clearLockingUser() {
      bitField0_ = (bitField0_ & ~0x00000004);
      lockingUser_ = null;
      if (lockingUserBuilder_ != null) {
        lockingUserBuilder_.dispose();
        lockingUserBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The user information who locks the document.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.UserInfo locking_user = 3;</code>
     */
    public com.google.cloud.contentwarehouse.v1.UserInfo.Builder getLockingUserBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getLockingUserFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The user information who locks the document.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.UserInfo locking_user = 3;</code>
     */
    public com.google.cloud.contentwarehouse.v1.UserInfoOrBuilder getLockingUserOrBuilder() {
      if (lockingUserBuilder_ != null) {
        return lockingUserBuilder_.getMessageOrBuilder();
      } else {
        return lockingUser_ == null
            ? com.google.cloud.contentwarehouse.v1.UserInfo.getDefaultInstance()
            : lockingUser_;
      }
    }
    /**
     *
     *
     * <pre>
     * The user information who locks the document.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.UserInfo locking_user = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contentwarehouse.v1.UserInfo,
            com.google.cloud.contentwarehouse.v1.UserInfo.Builder,
            com.google.cloud.contentwarehouse.v1.UserInfoOrBuilder>
        getLockingUserFieldBuilder() {
      if (lockingUserBuilder_ == null) {
        lockingUserBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.contentwarehouse.v1.UserInfo,
                com.google.cloud.contentwarehouse.v1.UserInfo.Builder,
                com.google.cloud.contentwarehouse.v1.UserInfoOrBuilder>(
                getLockingUser(), getParentForChildren(), isClean());
        lockingUser_ = null;
      }
      return lockingUserBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.contentwarehouse.v1.LockDocumentRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contentwarehouse.v1.LockDocumentRequest)
  private static final com.google.cloud.contentwarehouse.v1.LockDocumentRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.contentwarehouse.v1.LockDocumentRequest();
  }

  public static com.google.cloud.contentwarehouse.v1.LockDocumentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LockDocumentRequest> PARSER =
      new com.google.protobuf.AbstractParser<LockDocumentRequest>() {
        @java.lang.Override
        public LockDocumentRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<LockDocumentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LockDocumentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.LockDocumentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
