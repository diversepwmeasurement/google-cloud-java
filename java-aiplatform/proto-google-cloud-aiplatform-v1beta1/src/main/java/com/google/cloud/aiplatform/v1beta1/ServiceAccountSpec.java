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
// source: google/cloud/aiplatform/v1beta1/persistent_resource.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Configuration for the use of custom service account to run the workloads.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.ServiceAccountSpec}
 */
public final class ServiceAccountSpec extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.ServiceAccountSpec)
    ServiceAccountSpecOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ServiceAccountSpec.newBuilder() to construct.
  private ServiceAccountSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ServiceAccountSpec() {
    serviceAccount_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ServiceAccountSpec();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.PersistentResourceProto
        .internal_static_google_cloud_aiplatform_v1beta1_ServiceAccountSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.PersistentResourceProto
        .internal_static_google_cloud_aiplatform_v1beta1_ServiceAccountSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.ServiceAccountSpec.class,
            com.google.cloud.aiplatform.v1beta1.ServiceAccountSpec.Builder.class);
  }

  public static final int ENABLE_CUSTOM_SERVICE_ACCOUNT_FIELD_NUMBER = 1;
  private boolean enableCustomServiceAccount_ = false;
  /**
   *
   *
   * <pre>
   * Required. If true, custom user-managed service account is enforced to run
   * any workloads (e.g. Vertex Jobs) on the resource; Otherwise, will always
   * use [Vertex AI Custom Code Service
   * Agent](https://cloud.google.com/vertex-ai/docs/general/access-control#service-agents)
   * </pre>
   *
   * <code>bool enable_custom_service_account = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The enableCustomServiceAccount.
   */
  @java.lang.Override
  public boolean getEnableCustomServiceAccount() {
    return enableCustomServiceAccount_;
  }

  public static final int SERVICE_ACCOUNT_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object serviceAccount_ = "";
  /**
   *
   *
   * <pre>
   * Optional. Default service account that this PersistentResource's workloads
   * run as. The workloads include:
   *  * Any runtime specified via `ResourceRuntimeSpec` on creation time,
   *  e.g. Ray;
   *  * Jobs submitted to PersistentResource, if no other service account
   *  specified in the job specs.
   *
   *
   * Only works when custom service account is enabled and users have the
   * `iam.serviceAccounts.actAs` permission on this service account.
   *
   * Required if any containers specified in `ResourceRuntimeSpec`.
   * </pre>
   *
   * <code>string service_account = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The serviceAccount.
   */
  @java.lang.Override
  public java.lang.String getServiceAccount() {
    java.lang.Object ref = serviceAccount_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceAccount_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. Default service account that this PersistentResource's workloads
   * run as. The workloads include:
   *  * Any runtime specified via `ResourceRuntimeSpec` on creation time,
   *  e.g. Ray;
   *  * Jobs submitted to PersistentResource, if no other service account
   *  specified in the job specs.
   *
   *
   * Only works when custom service account is enabled and users have the
   * `iam.serviceAccounts.actAs` permission on this service account.
   *
   * Required if any containers specified in `ResourceRuntimeSpec`.
   * </pre>
   *
   * <code>string service_account = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for serviceAccount.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getServiceAccountBytes() {
    java.lang.Object ref = serviceAccount_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      serviceAccount_ = b;
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
    if (enableCustomServiceAccount_ != false) {
      output.writeBool(1, enableCustomServiceAccount_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceAccount_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, serviceAccount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enableCustomServiceAccount_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, enableCustomServiceAccount_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceAccount_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, serviceAccount_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.ServiceAccountSpec)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.ServiceAccountSpec other =
        (com.google.cloud.aiplatform.v1beta1.ServiceAccountSpec) obj;

    if (getEnableCustomServiceAccount() != other.getEnableCustomServiceAccount()) return false;
    if (!getServiceAccount().equals(other.getServiceAccount())) return false;
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
    hash = (37 * hash) + ENABLE_CUSTOM_SERVICE_ACCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEnableCustomServiceAccount());
    hash = (37 * hash) + SERVICE_ACCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getServiceAccount().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.ServiceAccountSpec parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ServiceAccountSpec parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ServiceAccountSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ServiceAccountSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ServiceAccountSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ServiceAccountSpec parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ServiceAccountSpec parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ServiceAccountSpec parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ServiceAccountSpec parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ServiceAccountSpec parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ServiceAccountSpec parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ServiceAccountSpec parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.ServiceAccountSpec prototype) {
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
   * Configuration for the use of custom service account to run the workloads.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.ServiceAccountSpec}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.ServiceAccountSpec)
      com.google.cloud.aiplatform.v1beta1.ServiceAccountSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.PersistentResourceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ServiceAccountSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.PersistentResourceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ServiceAccountSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.ServiceAccountSpec.class,
              com.google.cloud.aiplatform.v1beta1.ServiceAccountSpec.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.ServiceAccountSpec.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      enableCustomServiceAccount_ = false;
      serviceAccount_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.PersistentResourceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ServiceAccountSpec_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ServiceAccountSpec getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.ServiceAccountSpec.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ServiceAccountSpec build() {
      com.google.cloud.aiplatform.v1beta1.ServiceAccountSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ServiceAccountSpec buildPartial() {
      com.google.cloud.aiplatform.v1beta1.ServiceAccountSpec result =
          new com.google.cloud.aiplatform.v1beta1.ServiceAccountSpec(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.ServiceAccountSpec result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.enableCustomServiceAccount_ = enableCustomServiceAccount_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.serviceAccount_ = serviceAccount_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.ServiceAccountSpec) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.ServiceAccountSpec) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.ServiceAccountSpec other) {
      if (other == com.google.cloud.aiplatform.v1beta1.ServiceAccountSpec.getDefaultInstance())
        return this;
      if (other.getEnableCustomServiceAccount() != false) {
        setEnableCustomServiceAccount(other.getEnableCustomServiceAccount());
      }
      if (!other.getServiceAccount().isEmpty()) {
        serviceAccount_ = other.serviceAccount_;
        bitField0_ |= 0x00000002;
        onChanged();
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
            case 8:
              {
                enableCustomServiceAccount_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                serviceAccount_ = input.readStringRequireUtf8();
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

    private boolean enableCustomServiceAccount_;
    /**
     *
     *
     * <pre>
     * Required. If true, custom user-managed service account is enforced to run
     * any workloads (e.g. Vertex Jobs) on the resource; Otherwise, will always
     * use [Vertex AI Custom Code Service
     * Agent](https://cloud.google.com/vertex-ai/docs/general/access-control#service-agents)
     * </pre>
     *
     * <code>bool enable_custom_service_account = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The enableCustomServiceAccount.
     */
    @java.lang.Override
    public boolean getEnableCustomServiceAccount() {
      return enableCustomServiceAccount_;
    }
    /**
     *
     *
     * <pre>
     * Required. If true, custom user-managed service account is enforced to run
     * any workloads (e.g. Vertex Jobs) on the resource; Otherwise, will always
     * use [Vertex AI Custom Code Service
     * Agent](https://cloud.google.com/vertex-ai/docs/general/access-control#service-agents)
     * </pre>
     *
     * <code>bool enable_custom_service_account = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The enableCustomServiceAccount to set.
     * @return This builder for chaining.
     */
    public Builder setEnableCustomServiceAccount(boolean value) {

      enableCustomServiceAccount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. If true, custom user-managed service account is enforced to run
     * any workloads (e.g. Vertex Jobs) on the resource; Otherwise, will always
     * use [Vertex AI Custom Code Service
     * Agent](https://cloud.google.com/vertex-ai/docs/general/access-control#service-agents)
     * </pre>
     *
     * <code>bool enable_custom_service_account = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnableCustomServiceAccount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      enableCustomServiceAccount_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object serviceAccount_ = "";
    /**
     *
     *
     * <pre>
     * Optional. Default service account that this PersistentResource's workloads
     * run as. The workloads include:
     *  * Any runtime specified via `ResourceRuntimeSpec` on creation time,
     *  e.g. Ray;
     *  * Jobs submitted to PersistentResource, if no other service account
     *  specified in the job specs.
     *
     *
     * Only works when custom service account is enabled and users have the
     * `iam.serviceAccounts.actAs` permission on this service account.
     *
     * Required if any containers specified in `ResourceRuntimeSpec`.
     * </pre>
     *
     * <code>string service_account = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The serviceAccount.
     */
    public java.lang.String getServiceAccount() {
      java.lang.Object ref = serviceAccount_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceAccount_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Default service account that this PersistentResource's workloads
     * run as. The workloads include:
     *  * Any runtime specified via `ResourceRuntimeSpec` on creation time,
     *  e.g. Ray;
     *  * Jobs submitted to PersistentResource, if no other service account
     *  specified in the job specs.
     *
     *
     * Only works when custom service account is enabled and users have the
     * `iam.serviceAccounts.actAs` permission on this service account.
     *
     * Required if any containers specified in `ResourceRuntimeSpec`.
     * </pre>
     *
     * <code>string service_account = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for serviceAccount.
     */
    public com.google.protobuf.ByteString getServiceAccountBytes() {
      java.lang.Object ref = serviceAccount_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        serviceAccount_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Default service account that this PersistentResource's workloads
     * run as. The workloads include:
     *  * Any runtime specified via `ResourceRuntimeSpec` on creation time,
     *  e.g. Ray;
     *  * Jobs submitted to PersistentResource, if no other service account
     *  specified in the job specs.
     *
     *
     * Only works when custom service account is enabled and users have the
     * `iam.serviceAccounts.actAs` permission on this service account.
     *
     * Required if any containers specified in `ResourceRuntimeSpec`.
     * </pre>
     *
     * <code>string service_account = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The serviceAccount to set.
     * @return This builder for chaining.
     */
    public Builder setServiceAccount(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      serviceAccount_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Default service account that this PersistentResource's workloads
     * run as. The workloads include:
     *  * Any runtime specified via `ResourceRuntimeSpec` on creation time,
     *  e.g. Ray;
     *  * Jobs submitted to PersistentResource, if no other service account
     *  specified in the job specs.
     *
     *
     * Only works when custom service account is enabled and users have the
     * `iam.serviceAccounts.actAs` permission on this service account.
     *
     * Required if any containers specified in `ResourceRuntimeSpec`.
     * </pre>
     *
     * <code>string service_account = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearServiceAccount() {
      serviceAccount_ = getDefaultInstance().getServiceAccount();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Default service account that this PersistentResource's workloads
     * run as. The workloads include:
     *  * Any runtime specified via `ResourceRuntimeSpec` on creation time,
     *  e.g. Ray;
     *  * Jobs submitted to PersistentResource, if no other service account
     *  specified in the job specs.
     *
     *
     * Only works when custom service account is enabled and users have the
     * `iam.serviceAccounts.actAs` permission on this service account.
     *
     * Required if any containers specified in `ResourceRuntimeSpec`.
     * </pre>
     *
     * <code>string service_account = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for serviceAccount to set.
     * @return This builder for chaining.
     */
    public Builder setServiceAccountBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      serviceAccount_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.ServiceAccountSpec)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.ServiceAccountSpec)
  private static final com.google.cloud.aiplatform.v1beta1.ServiceAccountSpec DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.ServiceAccountSpec();
  }

  public static com.google.cloud.aiplatform.v1beta1.ServiceAccountSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ServiceAccountSpec> PARSER =
      new com.google.protobuf.AbstractParser<ServiceAccountSpec>() {
        @java.lang.Override
        public ServiceAccountSpec parsePartialFrom(
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

  public static com.google.protobuf.Parser<ServiceAccountSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ServiceAccountSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ServiceAccountSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
