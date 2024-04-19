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
// source: google/chat/v1/membership.proto

// Protobuf Java Version: 3.25.2
package com.google.chat.v1;

/**
 *
 *
 * <pre>
 * Request message for updating a membership.
 * </pre>
 *
 * Protobuf type {@code google.chat.v1.UpdateMembershipRequest}
 */
public final class UpdateMembershipRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.chat.v1.UpdateMembershipRequest)
    UpdateMembershipRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateMembershipRequest.newBuilder() to construct.
  private UpdateMembershipRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateMembershipRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateMembershipRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.chat.v1.MembershipProto
        .internal_static_google_chat_v1_UpdateMembershipRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.chat.v1.MembershipProto
        .internal_static_google_chat_v1_UpdateMembershipRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.chat.v1.UpdateMembershipRequest.class,
            com.google.chat.v1.UpdateMembershipRequest.Builder.class);
  }

  private int bitField0_;
  public static final int MEMBERSHIP_FIELD_NUMBER = 1;
  private com.google.chat.v1.Membership membership_;
  /**
   *
   *
   * <pre>
   * Required. The membership to update. Only fields specified by `update_mask`
   * are updated.
   * </pre>
   *
   * <code>.google.chat.v1.Membership membership = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the membership field is set.
   */
  @java.lang.Override
  public boolean hasMembership() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The membership to update. Only fields specified by `update_mask`
   * are updated.
   * </pre>
   *
   * <code>.google.chat.v1.Membership membership = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The membership.
   */
  @java.lang.Override
  public com.google.chat.v1.Membership getMembership() {
    return membership_ == null ? com.google.chat.v1.Membership.getDefaultInstance() : membership_;
  }
  /**
   *
   *
   * <pre>
   * Required. The membership to update. Only fields specified by `update_mask`
   * are updated.
   * </pre>
   *
   * <code>.google.chat.v1.Membership membership = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.chat.v1.MembershipOrBuilder getMembershipOrBuilder() {
    return membership_ == null ? com.google.chat.v1.Membership.getDefaultInstance() : membership_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Required. The field paths to update. Separate multiple values with commas
   * or use `*` to update all field paths.
   *
   * Currently supported field paths:
   *
   * - `role`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The field paths to update. Separate multiple values with commas
   * or use `*` to update all field paths.
   *
   * Currently supported field paths:
   *
   * - `role`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * Required. The field paths to update. Separate multiple values with commas
   * or use `*` to update all field paths.
   *
   * Currently supported field paths:
   *
   * - `role`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
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
      output.writeMessage(1, getMembership());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMembership());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.chat.v1.UpdateMembershipRequest)) {
      return super.equals(obj);
    }
    com.google.chat.v1.UpdateMembershipRequest other =
        (com.google.chat.v1.UpdateMembershipRequest) obj;

    if (hasMembership() != other.hasMembership()) return false;
    if (hasMembership()) {
      if (!getMembership().equals(other.getMembership())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
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
    if (hasMembership()) {
      hash = (37 * hash) + MEMBERSHIP_FIELD_NUMBER;
      hash = (53 * hash) + getMembership().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.chat.v1.UpdateMembershipRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.chat.v1.UpdateMembershipRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.chat.v1.UpdateMembershipRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.chat.v1.UpdateMembershipRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.chat.v1.UpdateMembershipRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.chat.v1.UpdateMembershipRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.chat.v1.UpdateMembershipRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.chat.v1.UpdateMembershipRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.chat.v1.UpdateMembershipRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.chat.v1.UpdateMembershipRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.chat.v1.UpdateMembershipRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.chat.v1.UpdateMembershipRequest parseFrom(
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

  public static Builder newBuilder(com.google.chat.v1.UpdateMembershipRequest prototype) {
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
   * Request message for updating a membership.
   * </pre>
   *
   * Protobuf type {@code google.chat.v1.UpdateMembershipRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.chat.v1.UpdateMembershipRequest)
      com.google.chat.v1.UpdateMembershipRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.chat.v1.MembershipProto
          .internal_static_google_chat_v1_UpdateMembershipRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.chat.v1.MembershipProto
          .internal_static_google_chat_v1_UpdateMembershipRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.chat.v1.UpdateMembershipRequest.class,
              com.google.chat.v1.UpdateMembershipRequest.Builder.class);
    }

    // Construct using com.google.chat.v1.UpdateMembershipRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getMembershipFieldBuilder();
        getUpdateMaskFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      membership_ = null;
      if (membershipBuilder_ != null) {
        membershipBuilder_.dispose();
        membershipBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.chat.v1.MembershipProto
          .internal_static_google_chat_v1_UpdateMembershipRequest_descriptor;
    }

    @java.lang.Override
    public com.google.chat.v1.UpdateMembershipRequest getDefaultInstanceForType() {
      return com.google.chat.v1.UpdateMembershipRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.chat.v1.UpdateMembershipRequest build() {
      com.google.chat.v1.UpdateMembershipRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.chat.v1.UpdateMembershipRequest buildPartial() {
      com.google.chat.v1.UpdateMembershipRequest result =
          new com.google.chat.v1.UpdateMembershipRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.chat.v1.UpdateMembershipRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.membership_ = membershipBuilder_ == null ? membership_ : membershipBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.chat.v1.UpdateMembershipRequest) {
        return mergeFrom((com.google.chat.v1.UpdateMembershipRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.chat.v1.UpdateMembershipRequest other) {
      if (other == com.google.chat.v1.UpdateMembershipRequest.getDefaultInstance()) return this;
      if (other.hasMembership()) {
        mergeMembership(other.getMembership());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
                input.readMessage(getMembershipFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.chat.v1.Membership membership_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.chat.v1.Membership,
            com.google.chat.v1.Membership.Builder,
            com.google.chat.v1.MembershipOrBuilder>
        membershipBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The membership to update. Only fields specified by `update_mask`
     * are updated.
     * </pre>
     *
     * <code>.google.chat.v1.Membership membership = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the membership field is set.
     */
    public boolean hasMembership() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The membership to update. Only fields specified by `update_mask`
     * are updated.
     * </pre>
     *
     * <code>.google.chat.v1.Membership membership = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The membership.
     */
    public com.google.chat.v1.Membership getMembership() {
      if (membershipBuilder_ == null) {
        return membership_ == null
            ? com.google.chat.v1.Membership.getDefaultInstance()
            : membership_;
      } else {
        return membershipBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The membership to update. Only fields specified by `update_mask`
     * are updated.
     * </pre>
     *
     * <code>.google.chat.v1.Membership membership = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setMembership(com.google.chat.v1.Membership value) {
      if (membershipBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        membership_ = value;
      } else {
        membershipBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The membership to update. Only fields specified by `update_mask`
     * are updated.
     * </pre>
     *
     * <code>.google.chat.v1.Membership membership = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setMembership(com.google.chat.v1.Membership.Builder builderForValue) {
      if (membershipBuilder_ == null) {
        membership_ = builderForValue.build();
      } else {
        membershipBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The membership to update. Only fields specified by `update_mask`
     * are updated.
     * </pre>
     *
     * <code>.google.chat.v1.Membership membership = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeMembership(com.google.chat.v1.Membership value) {
      if (membershipBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && membership_ != null
            && membership_ != com.google.chat.v1.Membership.getDefaultInstance()) {
          getMembershipBuilder().mergeFrom(value);
        } else {
          membership_ = value;
        }
      } else {
        membershipBuilder_.mergeFrom(value);
      }
      if (membership_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The membership to update. Only fields specified by `update_mask`
     * are updated.
     * </pre>
     *
     * <code>.google.chat.v1.Membership membership = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearMembership() {
      bitField0_ = (bitField0_ & ~0x00000001);
      membership_ = null;
      if (membershipBuilder_ != null) {
        membershipBuilder_.dispose();
        membershipBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The membership to update. Only fields specified by `update_mask`
     * are updated.
     * </pre>
     *
     * <code>.google.chat.v1.Membership membership = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.chat.v1.Membership.Builder getMembershipBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getMembershipFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The membership to update. Only fields specified by `update_mask`
     * are updated.
     * </pre>
     *
     * <code>.google.chat.v1.Membership membership = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.chat.v1.MembershipOrBuilder getMembershipOrBuilder() {
      if (membershipBuilder_ != null) {
        return membershipBuilder_.getMessageOrBuilder();
      } else {
        return membership_ == null
            ? com.google.chat.v1.Membership.getDefaultInstance()
            : membership_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The membership to update. Only fields specified by `update_mask`
     * are updated.
     * </pre>
     *
     * <code>.google.chat.v1.Membership membership = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.chat.v1.Membership,
            com.google.chat.v1.Membership.Builder,
            com.google.chat.v1.MembershipOrBuilder>
        getMembershipFieldBuilder() {
      if (membershipBuilder_ == null) {
        membershipBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.chat.v1.Membership,
                com.google.chat.v1.Membership.Builder,
                com.google.chat.v1.MembershipOrBuilder>(
                getMembership(), getParentForChildren(), isClean());
        membership_ = null;
      }
      return membershipBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The field paths to update. Separate multiple values with commas
     * or use `*` to update all field paths.
     *
     * Currently supported field paths:
     *
     * - `role`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The field paths to update. Separate multiple values with commas
     * or use `*` to update all field paths.
     *
     * Currently supported field paths:
     *
     * - `role`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The field paths to update. Separate multiple values with commas
     * or use `*` to update all field paths.
     *
     * Currently supported field paths:
     *
     * - `role`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The field paths to update. Separate multiple values with commas
     * or use `*` to update all field paths.
     *
     * Currently supported field paths:
     *
     * - `role`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The field paths to update. Separate multiple values with commas
     * or use `*` to update all field paths.
     *
     * Currently supported field paths:
     *
     * - `role`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && updateMask_ != null
            && updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      if (updateMask_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The field paths to update. Separate multiple values with commas
     * or use `*` to update all field paths.
     *
     * Currently supported field paths:
     *
     * - `role`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The field paths to update. Separate multiple values with commas
     * or use `*` to update all field paths.
     *
     * Currently supported field paths:
     *
     * - `role`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The field paths to update. Separate multiple values with commas
     * or use `*` to update all field paths.
     *
     * Currently supported field paths:
     *
     * - `role`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The field paths to update. Separate multiple values with commas
     * or use `*` to update all field paths.
     *
     * Currently supported field paths:
     *
     * - `role`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.chat.v1.UpdateMembershipRequest)
  }

  // @@protoc_insertion_point(class_scope:google.chat.v1.UpdateMembershipRequest)
  private static final com.google.chat.v1.UpdateMembershipRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.chat.v1.UpdateMembershipRequest();
  }

  public static com.google.chat.v1.UpdateMembershipRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateMembershipRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateMembershipRequest>() {
        @java.lang.Override
        public UpdateMembershipRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateMembershipRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateMembershipRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.chat.v1.UpdateMembershipRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
