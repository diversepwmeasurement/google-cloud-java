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
// source: google/cloud/securitycenter/v1beta1/securitycenter_service.proto

package com.google.cloud.securitycenter.v1beta1;

/**
 *
 *
 * <pre>
 * Request message for updating or creating a finding.
 * </pre>
 *
 * Protobuf type {@code google.cloud.securitycenter.v1beta1.UpdateFindingRequest}
 */
public final class UpdateFindingRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.securitycenter.v1beta1.UpdateFindingRequest)
    UpdateFindingRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateFindingRequest.newBuilder() to construct.
  private UpdateFindingRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateFindingRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateFindingRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.securitycenter.v1beta1.SecuritycenterService
        .internal_static_google_cloud_securitycenter_v1beta1_UpdateFindingRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securitycenter.v1beta1.SecuritycenterService
        .internal_static_google_cloud_securitycenter_v1beta1_UpdateFindingRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securitycenter.v1beta1.UpdateFindingRequest.class,
            com.google.cloud.securitycenter.v1beta1.UpdateFindingRequest.Builder.class);
  }

  public static final int FINDING_FIELD_NUMBER = 1;
  private com.google.cloud.securitycenter.v1beta1.Finding finding_;
  /**
   *
   *
   * <pre>
   * Required. The finding resource to update or create if it does not already exist.
   * parent, security_marks, and update_time will be ignored.
   * In the case of creation, the finding id portion of the name must
   * alphanumeric and less than or equal to 32 characters and greater than 0
   * characters in length.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1beta1.Finding finding = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the finding field is set.
   */
  @java.lang.Override
  public boolean hasFinding() {
    return finding_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The finding resource to update or create if it does not already exist.
   * parent, security_marks, and update_time will be ignored.
   * In the case of creation, the finding id portion of the name must
   * alphanumeric and less than or equal to 32 characters and greater than 0
   * characters in length.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1beta1.Finding finding = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The finding.
   */
  @java.lang.Override
  public com.google.cloud.securitycenter.v1beta1.Finding getFinding() {
    return finding_ == null
        ? com.google.cloud.securitycenter.v1beta1.Finding.getDefaultInstance()
        : finding_;
  }
  /**
   *
   *
   * <pre>
   * Required. The finding resource to update or create if it does not already exist.
   * parent, security_marks, and update_time will be ignored.
   * In the case of creation, the finding id portion of the name must
   * alphanumeric and less than or equal to 32 characters and greater than 0
   * characters in length.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1beta1.Finding finding = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.securitycenter.v1beta1.FindingOrBuilder getFindingOrBuilder() {
    return getFinding();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * The FieldMask to use when updating the finding resource. This field should
   * not be specified when creating a finding.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * The FieldMask to use when updating the finding resource. This field should
   * not be specified when creating a finding.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
   * The FieldMask to use when updating the finding resource. This field should
   * not be specified when creating a finding.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
    if (finding_ != null) {
      output.writeMessage(1, getFinding());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (finding_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getFinding());
    }
    if (updateMask_ != null) {
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
    if (!(obj instanceof com.google.cloud.securitycenter.v1beta1.UpdateFindingRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.securitycenter.v1beta1.UpdateFindingRequest other =
        (com.google.cloud.securitycenter.v1beta1.UpdateFindingRequest) obj;

    if (hasFinding() != other.hasFinding()) return false;
    if (hasFinding()) {
      if (!getFinding().equals(other.getFinding())) return false;
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
    if (hasFinding()) {
      hash = (37 * hash) + FINDING_FIELD_NUMBER;
      hash = (53 * hash) + getFinding().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securitycenter.v1beta1.UpdateFindingRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1beta1.UpdateFindingRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1beta1.UpdateFindingRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1beta1.UpdateFindingRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1beta1.UpdateFindingRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1beta1.UpdateFindingRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1beta1.UpdateFindingRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1beta1.UpdateFindingRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1beta1.UpdateFindingRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1beta1.UpdateFindingRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1beta1.UpdateFindingRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1beta1.UpdateFindingRequest parseFrom(
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
      com.google.cloud.securitycenter.v1beta1.UpdateFindingRequest prototype) {
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
   * Request message for updating or creating a finding.
   * </pre>
   *
   * Protobuf type {@code google.cloud.securitycenter.v1beta1.UpdateFindingRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securitycenter.v1beta1.UpdateFindingRequest)
      com.google.cloud.securitycenter.v1beta1.UpdateFindingRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.securitycenter.v1beta1.SecuritycenterService
          .internal_static_google_cloud_securitycenter_v1beta1_UpdateFindingRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securitycenter.v1beta1.SecuritycenterService
          .internal_static_google_cloud_securitycenter_v1beta1_UpdateFindingRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securitycenter.v1beta1.UpdateFindingRequest.class,
              com.google.cloud.securitycenter.v1beta1.UpdateFindingRequest.Builder.class);
    }

    // Construct using com.google.cloud.securitycenter.v1beta1.UpdateFindingRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (findingBuilder_ == null) {
        finding_ = null;
      } else {
        finding_ = null;
        findingBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.securitycenter.v1beta1.SecuritycenterService
          .internal_static_google_cloud_securitycenter_v1beta1_UpdateFindingRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1beta1.UpdateFindingRequest
        getDefaultInstanceForType() {
      return com.google.cloud.securitycenter.v1beta1.UpdateFindingRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1beta1.UpdateFindingRequest build() {
      com.google.cloud.securitycenter.v1beta1.UpdateFindingRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1beta1.UpdateFindingRequest buildPartial() {
      com.google.cloud.securitycenter.v1beta1.UpdateFindingRequest result =
          new com.google.cloud.securitycenter.v1beta1.UpdateFindingRequest(this);
      if (findingBuilder_ == null) {
        result.finding_ = finding_;
      } else {
        result.finding_ = findingBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
      onBuilt();
      return result;
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
      if (other instanceof com.google.cloud.securitycenter.v1beta1.UpdateFindingRequest) {
        return mergeFrom((com.google.cloud.securitycenter.v1beta1.UpdateFindingRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.securitycenter.v1beta1.UpdateFindingRequest other) {
      if (other
          == com.google.cloud.securitycenter.v1beta1.UpdateFindingRequest.getDefaultInstance())
        return this;
      if (other.hasFinding()) {
        mergeFinding(other.getFinding());
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
                input.readMessage(getFindingFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);

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

    private com.google.cloud.securitycenter.v1beta1.Finding finding_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.securitycenter.v1beta1.Finding,
            com.google.cloud.securitycenter.v1beta1.Finding.Builder,
            com.google.cloud.securitycenter.v1beta1.FindingOrBuilder>
        findingBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The finding resource to update or create if it does not already exist.
     * parent, security_marks, and update_time will be ignored.
     * In the case of creation, the finding id portion of the name must
     * alphanumeric and less than or equal to 32 characters and greater than 0
     * characters in length.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1beta1.Finding finding = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the finding field is set.
     */
    public boolean hasFinding() {
      return findingBuilder_ != null || finding_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The finding resource to update or create if it does not already exist.
     * parent, security_marks, and update_time will be ignored.
     * In the case of creation, the finding id portion of the name must
     * alphanumeric and less than or equal to 32 characters and greater than 0
     * characters in length.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1beta1.Finding finding = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The finding.
     */
    public com.google.cloud.securitycenter.v1beta1.Finding getFinding() {
      if (findingBuilder_ == null) {
        return finding_ == null
            ? com.google.cloud.securitycenter.v1beta1.Finding.getDefaultInstance()
            : finding_;
      } else {
        return findingBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The finding resource to update or create if it does not already exist.
     * parent, security_marks, and update_time will be ignored.
     * In the case of creation, the finding id portion of the name must
     * alphanumeric and less than or equal to 32 characters and greater than 0
     * characters in length.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1beta1.Finding finding = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setFinding(com.google.cloud.securitycenter.v1beta1.Finding value) {
      if (findingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        finding_ = value;
        onChanged();
      } else {
        findingBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The finding resource to update or create if it does not already exist.
     * parent, security_marks, and update_time will be ignored.
     * In the case of creation, the finding id portion of the name must
     * alphanumeric and less than or equal to 32 characters and greater than 0
     * characters in length.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1beta1.Finding finding = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setFinding(
        com.google.cloud.securitycenter.v1beta1.Finding.Builder builderForValue) {
      if (findingBuilder_ == null) {
        finding_ = builderForValue.build();
        onChanged();
      } else {
        findingBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The finding resource to update or create if it does not already exist.
     * parent, security_marks, and update_time will be ignored.
     * In the case of creation, the finding id portion of the name must
     * alphanumeric and less than or equal to 32 characters and greater than 0
     * characters in length.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1beta1.Finding finding = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeFinding(com.google.cloud.securitycenter.v1beta1.Finding value) {
      if (findingBuilder_ == null) {
        if (finding_ != null) {
          finding_ =
              com.google.cloud.securitycenter.v1beta1.Finding.newBuilder(finding_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          finding_ = value;
        }
        onChanged();
      } else {
        findingBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The finding resource to update or create if it does not already exist.
     * parent, security_marks, and update_time will be ignored.
     * In the case of creation, the finding id portion of the name must
     * alphanumeric and less than or equal to 32 characters and greater than 0
     * characters in length.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1beta1.Finding finding = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearFinding() {
      if (findingBuilder_ == null) {
        finding_ = null;
        onChanged();
      } else {
        finding_ = null;
        findingBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The finding resource to update or create if it does not already exist.
     * parent, security_marks, and update_time will be ignored.
     * In the case of creation, the finding id portion of the name must
     * alphanumeric and less than or equal to 32 characters and greater than 0
     * characters in length.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1beta1.Finding finding = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.securitycenter.v1beta1.Finding.Builder getFindingBuilder() {

      onChanged();
      return getFindingFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The finding resource to update or create if it does not already exist.
     * parent, security_marks, and update_time will be ignored.
     * In the case of creation, the finding id portion of the name must
     * alphanumeric and less than or equal to 32 characters and greater than 0
     * characters in length.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1beta1.Finding finding = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.securitycenter.v1beta1.FindingOrBuilder getFindingOrBuilder() {
      if (findingBuilder_ != null) {
        return findingBuilder_.getMessageOrBuilder();
      } else {
        return finding_ == null
            ? com.google.cloud.securitycenter.v1beta1.Finding.getDefaultInstance()
            : finding_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The finding resource to update or create if it does not already exist.
     * parent, security_marks, and update_time will be ignored.
     * In the case of creation, the finding id portion of the name must
     * alphanumeric and less than or equal to 32 characters and greater than 0
     * characters in length.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1beta1.Finding finding = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.securitycenter.v1beta1.Finding,
            com.google.cloud.securitycenter.v1beta1.Finding.Builder,
            com.google.cloud.securitycenter.v1beta1.FindingOrBuilder>
        getFindingFieldBuilder() {
      if (findingBuilder_ == null) {
        findingBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.securitycenter.v1beta1.Finding,
                com.google.cloud.securitycenter.v1beta1.Finding.Builder,
                com.google.cloud.securitycenter.v1beta1.FindingOrBuilder>(
                getFinding(), getParentForChildren(), isClean());
        finding_ = null;
      }
      return findingBuilder_;
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
     * The FieldMask to use when updating the finding resource. This field should
     * not be specified when creating a finding.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     *
     *
     * <pre>
     * The FieldMask to use when updating the finding resource. This field should
     * not be specified when creating a finding.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * The FieldMask to use when updating the finding resource. This field should
     * not be specified when creating a finding.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The FieldMask to use when updating the finding resource. This field should
     * not be specified when creating a finding.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The FieldMask to use when updating the finding resource. This field should
     * not be specified when creating a finding.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
              com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The FieldMask to use when updating the finding resource. This field should
     * not be specified when creating a finding.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The FieldMask to use when updating the finding resource. This field should
     * not be specified when creating a finding.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {

      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The FieldMask to use when updating the finding resource. This field should
     * not be specified when creating a finding.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * The FieldMask to use when updating the finding resource. This field should
     * not be specified when creating a finding.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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

    // @@protoc_insertion_point(builder_scope:google.cloud.securitycenter.v1beta1.UpdateFindingRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securitycenter.v1beta1.UpdateFindingRequest)
  private static final com.google.cloud.securitycenter.v1beta1.UpdateFindingRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.securitycenter.v1beta1.UpdateFindingRequest();
  }

  public static com.google.cloud.securitycenter.v1beta1.UpdateFindingRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateFindingRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateFindingRequest>() {
        @java.lang.Override
        public UpdateFindingRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateFindingRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateFindingRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securitycenter.v1beta1.UpdateFindingRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
