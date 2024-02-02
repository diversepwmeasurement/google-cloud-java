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
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

// Protobuf Java Version: 3.25.2
package com.google.recaptchaenterprise.v1;

/**
 *
 *
 * <pre>
 * An identifier associated with a user.
 * </pre>
 *
 * Protobuf type {@code google.cloud.recaptchaenterprise.v1.UserId}
 */
public final class UserId extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.recaptchaenterprise.v1.UserId)
    UserIdOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UserId.newBuilder() to construct.
  private UserId(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UserId() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UserId();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
        .internal_static_google_cloud_recaptchaenterprise_v1_UserId_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
        .internal_static_google_cloud_recaptchaenterprise_v1_UserId_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.recaptchaenterprise.v1.UserId.class,
            com.google.recaptchaenterprise.v1.UserId.Builder.class);
  }

  private int idOneofCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object idOneof_;

  public enum IdOneofCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    EMAIL(1),
    PHONE_NUMBER(2),
    USERNAME(3),
    IDONEOF_NOT_SET(0);
    private final int value;

    private IdOneofCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static IdOneofCase valueOf(int value) {
      return forNumber(value);
    }

    public static IdOneofCase forNumber(int value) {
      switch (value) {
        case 1:
          return EMAIL;
        case 2:
          return PHONE_NUMBER;
        case 3:
          return USERNAME;
        case 0:
          return IDONEOF_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public IdOneofCase getIdOneofCase() {
    return IdOneofCase.forNumber(idOneofCase_);
  }

  public static final int EMAIL_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * Optional. An email address.
   * </pre>
   *
   * <code>string email = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the email field is set.
   */
  public boolean hasEmail() {
    return idOneofCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * Optional. An email address.
   * </pre>
   *
   * <code>string email = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The email.
   */
  public java.lang.String getEmail() {
    java.lang.Object ref = "";
    if (idOneofCase_ == 1) {
      ref = idOneof_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (idOneofCase_ == 1) {
        idOneof_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. An email address.
   * </pre>
   *
   * <code>string email = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for email.
   */
  public com.google.protobuf.ByteString getEmailBytes() {
    java.lang.Object ref = "";
    if (idOneofCase_ == 1) {
      ref = idOneof_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (idOneofCase_ == 1) {
        idOneof_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PHONE_NUMBER_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * Optional. A phone number. Should use the E.164 format.
   * </pre>
   *
   * <code>string phone_number = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the phoneNumber field is set.
   */
  public boolean hasPhoneNumber() {
    return idOneofCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * Optional. A phone number. Should use the E.164 format.
   * </pre>
   *
   * <code>string phone_number = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The phoneNumber.
   */
  public java.lang.String getPhoneNumber() {
    java.lang.Object ref = "";
    if (idOneofCase_ == 2) {
      ref = idOneof_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (idOneofCase_ == 2) {
        idOneof_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. A phone number. Should use the E.164 format.
   * </pre>
   *
   * <code>string phone_number = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for phoneNumber.
   */
  public com.google.protobuf.ByteString getPhoneNumberBytes() {
    java.lang.Object ref = "";
    if (idOneofCase_ == 2) {
      ref = idOneof_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (idOneofCase_ == 2) {
        idOneof_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USERNAME_FIELD_NUMBER = 3;
  /**
   *
   *
   * <pre>
   * Optional. A unique username, if different from all the other identifiers
   * and `account_id` that are provided. Can be a unique login handle or
   * display name for a user.
   * </pre>
   *
   * <code>string username = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the username field is set.
   */
  public boolean hasUsername() {
    return idOneofCase_ == 3;
  }
  /**
   *
   *
   * <pre>
   * Optional. A unique username, if different from all the other identifiers
   * and `account_id` that are provided. Can be a unique login handle or
   * display name for a user.
   * </pre>
   *
   * <code>string username = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The username.
   */
  public java.lang.String getUsername() {
    java.lang.Object ref = "";
    if (idOneofCase_ == 3) {
      ref = idOneof_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (idOneofCase_ == 3) {
        idOneof_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. A unique username, if different from all the other identifiers
   * and `account_id` that are provided. Can be a unique login handle or
   * display name for a user.
   * </pre>
   *
   * <code>string username = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for username.
   */
  public com.google.protobuf.ByteString getUsernameBytes() {
    java.lang.Object ref = "";
    if (idOneofCase_ == 3) {
      ref = idOneof_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (idOneofCase_ == 3) {
        idOneof_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (idOneofCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, idOneof_);
    }
    if (idOneofCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, idOneof_);
    }
    if (idOneofCase_ == 3) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, idOneof_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (idOneofCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, idOneof_);
    }
    if (idOneofCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, idOneof_);
    }
    if (idOneofCase_ == 3) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, idOneof_);
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
    if (!(obj instanceof com.google.recaptchaenterprise.v1.UserId)) {
      return super.equals(obj);
    }
    com.google.recaptchaenterprise.v1.UserId other = (com.google.recaptchaenterprise.v1.UserId) obj;

    if (!getIdOneofCase().equals(other.getIdOneofCase())) return false;
    switch (idOneofCase_) {
      case 1:
        if (!getEmail().equals(other.getEmail())) return false;
        break;
      case 2:
        if (!getPhoneNumber().equals(other.getPhoneNumber())) return false;
        break;
      case 3:
        if (!getUsername().equals(other.getUsername())) return false;
        break;
      case 0:
      default:
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
    switch (idOneofCase_) {
      case 1:
        hash = (37 * hash) + EMAIL_FIELD_NUMBER;
        hash = (53 * hash) + getEmail().hashCode();
        break;
      case 2:
        hash = (37 * hash) + PHONE_NUMBER_FIELD_NUMBER;
        hash = (53 * hash) + getPhoneNumber().hashCode();
        break;
      case 3:
        hash = (37 * hash) + USERNAME_FIELD_NUMBER;
        hash = (53 * hash) + getUsername().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.recaptchaenterprise.v1.UserId parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.UserId parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.UserId parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.UserId parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.UserId parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.UserId parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.UserId parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.UserId parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.UserId parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.UserId parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.UserId parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.UserId parseFrom(
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

  public static Builder newBuilder(com.google.recaptchaenterprise.v1.UserId prototype) {
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
   * An identifier associated with a user.
   * </pre>
   *
   * Protobuf type {@code google.cloud.recaptchaenterprise.v1.UserId}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recaptchaenterprise.v1.UserId)
      com.google.recaptchaenterprise.v1.UserIdOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_UserId_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_UserId_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.recaptchaenterprise.v1.UserId.class,
              com.google.recaptchaenterprise.v1.UserId.Builder.class);
    }

    // Construct using com.google.recaptchaenterprise.v1.UserId.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      idOneofCase_ = 0;
      idOneof_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_UserId_descriptor;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.UserId getDefaultInstanceForType() {
      return com.google.recaptchaenterprise.v1.UserId.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.UserId build() {
      com.google.recaptchaenterprise.v1.UserId result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.UserId buildPartial() {
      com.google.recaptchaenterprise.v1.UserId result =
          new com.google.recaptchaenterprise.v1.UserId(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.recaptchaenterprise.v1.UserId result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.recaptchaenterprise.v1.UserId result) {
      result.idOneofCase_ = idOneofCase_;
      result.idOneof_ = this.idOneof_;
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
      if (other instanceof com.google.recaptchaenterprise.v1.UserId) {
        return mergeFrom((com.google.recaptchaenterprise.v1.UserId) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.recaptchaenterprise.v1.UserId other) {
      if (other == com.google.recaptchaenterprise.v1.UserId.getDefaultInstance()) return this;
      switch (other.getIdOneofCase()) {
        case EMAIL:
          {
            idOneofCase_ = 1;
            idOneof_ = other.idOneof_;
            onChanged();
            break;
          }
        case PHONE_NUMBER:
          {
            idOneofCase_ = 2;
            idOneof_ = other.idOneof_;
            onChanged();
            break;
          }
        case USERNAME:
          {
            idOneofCase_ = 3;
            idOneof_ = other.idOneof_;
            onChanged();
            break;
          }
        case IDONEOF_NOT_SET:
          {
            break;
          }
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
                java.lang.String s = input.readStringRequireUtf8();
                idOneofCase_ = 1;
                idOneof_ = s;
                break;
              } // case 10
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                idOneofCase_ = 2;
                idOneof_ = s;
                break;
              } // case 18
            case 26:
              {
                java.lang.String s = input.readStringRequireUtf8();
                idOneofCase_ = 3;
                idOneof_ = s;
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

    private int idOneofCase_ = 0;
    private java.lang.Object idOneof_;

    public IdOneofCase getIdOneofCase() {
      return IdOneofCase.forNumber(idOneofCase_);
    }

    public Builder clearIdOneof() {
      idOneofCase_ = 0;
      idOneof_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     *
     *
     * <pre>
     * Optional. An email address.
     * </pre>
     *
     * <code>string email = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return Whether the email field is set.
     */
    @java.lang.Override
    public boolean hasEmail() {
      return idOneofCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * Optional. An email address.
     * </pre>
     *
     * <code>string email = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The email.
     */
    @java.lang.Override
    public java.lang.String getEmail() {
      java.lang.Object ref = "";
      if (idOneofCase_ == 1) {
        ref = idOneof_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (idOneofCase_ == 1) {
          idOneof_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. An email address.
     * </pre>
     *
     * <code>string email = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for email.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getEmailBytes() {
      java.lang.Object ref = "";
      if (idOneofCase_ == 1) {
        ref = idOneof_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (idOneofCase_ == 1) {
          idOneof_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. An email address.
     * </pre>
     *
     * <code>string email = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The email to set.
     * @return This builder for chaining.
     */
    public Builder setEmail(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      idOneofCase_ = 1;
      idOneof_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. An email address.
     * </pre>
     *
     * <code>string email = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEmail() {
      if (idOneofCase_ == 1) {
        idOneofCase_ = 0;
        idOneof_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. An email address.
     * </pre>
     *
     * <code>string email = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for email to set.
     * @return This builder for chaining.
     */
    public Builder setEmailBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      idOneofCase_ = 1;
      idOneof_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. A phone number. Should use the E.164 format.
     * </pre>
     *
     * <code>string phone_number = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return Whether the phoneNumber field is set.
     */
    @java.lang.Override
    public boolean hasPhoneNumber() {
      return idOneofCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * Optional. A phone number. Should use the E.164 format.
     * </pre>
     *
     * <code>string phone_number = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The phoneNumber.
     */
    @java.lang.Override
    public java.lang.String getPhoneNumber() {
      java.lang.Object ref = "";
      if (idOneofCase_ == 2) {
        ref = idOneof_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (idOneofCase_ == 2) {
          idOneof_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. A phone number. Should use the E.164 format.
     * </pre>
     *
     * <code>string phone_number = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for phoneNumber.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getPhoneNumberBytes() {
      java.lang.Object ref = "";
      if (idOneofCase_ == 2) {
        ref = idOneof_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (idOneofCase_ == 2) {
          idOneof_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. A phone number. Should use the E.164 format.
     * </pre>
     *
     * <code>string phone_number = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The phoneNumber to set.
     * @return This builder for chaining.
     */
    public Builder setPhoneNumber(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      idOneofCase_ = 2;
      idOneof_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A phone number. Should use the E.164 format.
     * </pre>
     *
     * <code>string phone_number = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPhoneNumber() {
      if (idOneofCase_ == 2) {
        idOneofCase_ = 0;
        idOneof_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A phone number. Should use the E.164 format.
     * </pre>
     *
     * <code>string phone_number = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for phoneNumber to set.
     * @return This builder for chaining.
     */
    public Builder setPhoneNumberBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      idOneofCase_ = 2;
      idOneof_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. A unique username, if different from all the other identifiers
     * and `account_id` that are provided. Can be a unique login handle or
     * display name for a user.
     * </pre>
     *
     * <code>string username = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return Whether the username field is set.
     */
    @java.lang.Override
    public boolean hasUsername() {
      return idOneofCase_ == 3;
    }
    /**
     *
     *
     * <pre>
     * Optional. A unique username, if different from all the other identifiers
     * and `account_id` that are provided. Can be a unique login handle or
     * display name for a user.
     * </pre>
     *
     * <code>string username = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The username.
     */
    @java.lang.Override
    public java.lang.String getUsername() {
      java.lang.Object ref = "";
      if (idOneofCase_ == 3) {
        ref = idOneof_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (idOneofCase_ == 3) {
          idOneof_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. A unique username, if different from all the other identifiers
     * and `account_id` that are provided. Can be a unique login handle or
     * display name for a user.
     * </pre>
     *
     * <code>string username = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for username.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getUsernameBytes() {
      java.lang.Object ref = "";
      if (idOneofCase_ == 3) {
        ref = idOneof_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (idOneofCase_ == 3) {
          idOneof_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. A unique username, if different from all the other identifiers
     * and `account_id` that are provided. Can be a unique login handle or
     * display name for a user.
     * </pre>
     *
     * <code>string username = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The username to set.
     * @return This builder for chaining.
     */
    public Builder setUsername(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      idOneofCase_ = 3;
      idOneof_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A unique username, if different from all the other identifiers
     * and `account_id` that are provided. Can be a unique login handle or
     * display name for a user.
     * </pre>
     *
     * <code>string username = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUsername() {
      if (idOneofCase_ == 3) {
        idOneofCase_ = 0;
        idOneof_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A unique username, if different from all the other identifiers
     * and `account_id` that are provided. Can be a unique login handle or
     * display name for a user.
     * </pre>
     *
     * <code>string username = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for username to set.
     * @return This builder for chaining.
     */
    public Builder setUsernameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      idOneofCase_ = 3;
      idOneof_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.recaptchaenterprise.v1.UserId)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recaptchaenterprise.v1.UserId)
  private static final com.google.recaptchaenterprise.v1.UserId DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.recaptchaenterprise.v1.UserId();
  }

  public static com.google.recaptchaenterprise.v1.UserId getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserId> PARSER =
      new com.google.protobuf.AbstractParser<UserId>() {
        @java.lang.Override
        public UserId parsePartialFrom(
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

  public static com.google.protobuf.Parser<UserId> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserId> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.recaptchaenterprise.v1.UserId getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
