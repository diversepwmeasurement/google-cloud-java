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
// source: google/cloud/deploy/v1/cloud_deploy.proto

package com.google.cloud.deploy.v1;

/**
 *
 *
 * <pre>
 * The request object used by `IgnoreJob`.
 * </pre>
 *
 * Protobuf type {@code google.cloud.deploy.v1.IgnoreJobRequest}
 */
public final class IgnoreJobRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.deploy.v1.IgnoreJobRequest)
    IgnoreJobRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use IgnoreJobRequest.newBuilder() to construct.
  private IgnoreJobRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private IgnoreJobRequest() {
    rollout_ = "";
    phaseId_ = "";
    jobId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new IgnoreJobRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.deploy.v1.CloudDeployProto
        .internal_static_google_cloud_deploy_v1_IgnoreJobRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.deploy.v1.CloudDeployProto
        .internal_static_google_cloud_deploy_v1_IgnoreJobRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.deploy.v1.IgnoreJobRequest.class,
            com.google.cloud.deploy.v1.IgnoreJobRequest.Builder.class);
  }

  public static final int ROLLOUT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object rollout_ = "";
  /**
   *
   *
   * <pre>
   * Required. Name of the Rollout. Format is
   * `projects/{project}/locations/{location}/deliveryPipelines/{deliveryPipeline}/releases/{release}/rollouts/{rollout}`.
   * </pre>
   *
   * <code>
   * string rollout = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The rollout.
   */
  @java.lang.Override
  public java.lang.String getRollout() {
    java.lang.Object ref = rollout_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      rollout_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Name of the Rollout. Format is
   * `projects/{project}/locations/{location}/deliveryPipelines/{deliveryPipeline}/releases/{release}/rollouts/{rollout}`.
   * </pre>
   *
   * <code>
   * string rollout = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for rollout.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRolloutBytes() {
    java.lang.Object ref = rollout_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      rollout_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PHASE_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object phaseId_ = "";
  /**
   *
   *
   * <pre>
   * Required. The phase ID the Job to ignore belongs to.
   * </pre>
   *
   * <code>string phase_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The phaseId.
   */
  @java.lang.Override
  public java.lang.String getPhaseId() {
    java.lang.Object ref = phaseId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      phaseId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The phase ID the Job to ignore belongs to.
   * </pre>
   *
   * <code>string phase_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for phaseId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPhaseIdBytes() {
    java.lang.Object ref = phaseId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      phaseId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int JOB_ID_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object jobId_ = "";
  /**
   *
   *
   * <pre>
   * Required. The job ID for the Job to ignore.
   * </pre>
   *
   * <code>string job_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The jobId.
   */
  @java.lang.Override
  public java.lang.String getJobId() {
    java.lang.Object ref = jobId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      jobId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The job ID for the Job to ignore.
   * </pre>
   *
   * <code>string job_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for jobId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getJobIdBytes() {
    java.lang.Object ref = jobId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      jobId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rollout_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, rollout_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(phaseId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, phaseId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(jobId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, jobId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rollout_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, rollout_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(phaseId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, phaseId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(jobId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, jobId_);
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
    if (!(obj instanceof com.google.cloud.deploy.v1.IgnoreJobRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.deploy.v1.IgnoreJobRequest other =
        (com.google.cloud.deploy.v1.IgnoreJobRequest) obj;

    if (!getRollout().equals(other.getRollout())) return false;
    if (!getPhaseId().equals(other.getPhaseId())) return false;
    if (!getJobId().equals(other.getJobId())) return false;
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
    hash = (37 * hash) + ROLLOUT_FIELD_NUMBER;
    hash = (53 * hash) + getRollout().hashCode();
    hash = (37 * hash) + PHASE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPhaseId().hashCode();
    hash = (37 * hash) + JOB_ID_FIELD_NUMBER;
    hash = (53 * hash) + getJobId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.deploy.v1.IgnoreJobRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.IgnoreJobRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.IgnoreJobRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.IgnoreJobRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.IgnoreJobRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.IgnoreJobRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.IgnoreJobRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.IgnoreJobRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.IgnoreJobRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.IgnoreJobRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.IgnoreJobRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.IgnoreJobRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.deploy.v1.IgnoreJobRequest prototype) {
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
   * The request object used by `IgnoreJob`.
   * </pre>
   *
   * Protobuf type {@code google.cloud.deploy.v1.IgnoreJobRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.deploy.v1.IgnoreJobRequest)
      com.google.cloud.deploy.v1.IgnoreJobRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_IgnoreJobRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_IgnoreJobRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.deploy.v1.IgnoreJobRequest.class,
              com.google.cloud.deploy.v1.IgnoreJobRequest.Builder.class);
    }

    // Construct using com.google.cloud.deploy.v1.IgnoreJobRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      rollout_ = "";
      phaseId_ = "";
      jobId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_IgnoreJobRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.IgnoreJobRequest getDefaultInstanceForType() {
      return com.google.cloud.deploy.v1.IgnoreJobRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.IgnoreJobRequest build() {
      com.google.cloud.deploy.v1.IgnoreJobRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.IgnoreJobRequest buildPartial() {
      com.google.cloud.deploy.v1.IgnoreJobRequest result =
          new com.google.cloud.deploy.v1.IgnoreJobRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.deploy.v1.IgnoreJobRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.rollout_ = rollout_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.phaseId_ = phaseId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.jobId_ = jobId_;
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
      if (other instanceof com.google.cloud.deploy.v1.IgnoreJobRequest) {
        return mergeFrom((com.google.cloud.deploy.v1.IgnoreJobRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.deploy.v1.IgnoreJobRequest other) {
      if (other == com.google.cloud.deploy.v1.IgnoreJobRequest.getDefaultInstance()) return this;
      if (!other.getRollout().isEmpty()) {
        rollout_ = other.rollout_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getPhaseId().isEmpty()) {
        phaseId_ = other.phaseId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getJobId().isEmpty()) {
        jobId_ = other.jobId_;
        bitField0_ |= 0x00000004;
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
            case 10:
              {
                rollout_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                phaseId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                jobId_ = input.readStringRequireUtf8();
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

    private java.lang.Object rollout_ = "";
    /**
     *
     *
     * <pre>
     * Required. Name of the Rollout. Format is
     * `projects/{project}/locations/{location}/deliveryPipelines/{deliveryPipeline}/releases/{release}/rollouts/{rollout}`.
     * </pre>
     *
     * <code>
     * string rollout = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The rollout.
     */
    public java.lang.String getRollout() {
      java.lang.Object ref = rollout_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rollout_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the Rollout. Format is
     * `projects/{project}/locations/{location}/deliveryPipelines/{deliveryPipeline}/releases/{release}/rollouts/{rollout}`.
     * </pre>
     *
     * <code>
     * string rollout = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for rollout.
     */
    public com.google.protobuf.ByteString getRolloutBytes() {
      java.lang.Object ref = rollout_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        rollout_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the Rollout. Format is
     * `projects/{project}/locations/{location}/deliveryPipelines/{deliveryPipeline}/releases/{release}/rollouts/{rollout}`.
     * </pre>
     *
     * <code>
     * string rollout = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The rollout to set.
     * @return This builder for chaining.
     */
    public Builder setRollout(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      rollout_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the Rollout. Format is
     * `projects/{project}/locations/{location}/deliveryPipelines/{deliveryPipeline}/releases/{release}/rollouts/{rollout}`.
     * </pre>
     *
     * <code>
     * string rollout = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRollout() {
      rollout_ = getDefaultInstance().getRollout();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the Rollout. Format is
     * `projects/{project}/locations/{location}/deliveryPipelines/{deliveryPipeline}/releases/{release}/rollouts/{rollout}`.
     * </pre>
     *
     * <code>
     * string rollout = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for rollout to set.
     * @return This builder for chaining.
     */
    public Builder setRolloutBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      rollout_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object phaseId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The phase ID the Job to ignore belongs to.
     * </pre>
     *
     * <code>string phase_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The phaseId.
     */
    public java.lang.String getPhaseId() {
      java.lang.Object ref = phaseId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        phaseId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The phase ID the Job to ignore belongs to.
     * </pre>
     *
     * <code>string phase_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for phaseId.
     */
    public com.google.protobuf.ByteString getPhaseIdBytes() {
      java.lang.Object ref = phaseId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        phaseId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The phase ID the Job to ignore belongs to.
     * </pre>
     *
     * <code>string phase_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The phaseId to set.
     * @return This builder for chaining.
     */
    public Builder setPhaseId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      phaseId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The phase ID the Job to ignore belongs to.
     * </pre>
     *
     * <code>string phase_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPhaseId() {
      phaseId_ = getDefaultInstance().getPhaseId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The phase ID the Job to ignore belongs to.
     * </pre>
     *
     * <code>string phase_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for phaseId to set.
     * @return This builder for chaining.
     */
    public Builder setPhaseIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      phaseId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object jobId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The job ID for the Job to ignore.
     * </pre>
     *
     * <code>string job_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The jobId.
     */
    public java.lang.String getJobId() {
      java.lang.Object ref = jobId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jobId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The job ID for the Job to ignore.
     * </pre>
     *
     * <code>string job_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for jobId.
     */
    public com.google.protobuf.ByteString getJobIdBytes() {
      java.lang.Object ref = jobId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        jobId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The job ID for the Job to ignore.
     * </pre>
     *
     * <code>string job_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The jobId to set.
     * @return This builder for chaining.
     */
    public Builder setJobId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      jobId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The job ID for the Job to ignore.
     * </pre>
     *
     * <code>string job_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearJobId() {
      jobId_ = getDefaultInstance().getJobId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The job ID for the Job to ignore.
     * </pre>
     *
     * <code>string job_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for jobId to set.
     * @return This builder for chaining.
     */
    public Builder setJobIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      jobId_ = value;
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.deploy.v1.IgnoreJobRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.deploy.v1.IgnoreJobRequest)
  private static final com.google.cloud.deploy.v1.IgnoreJobRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.deploy.v1.IgnoreJobRequest();
  }

  public static com.google.cloud.deploy.v1.IgnoreJobRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IgnoreJobRequest> PARSER =
      new com.google.protobuf.AbstractParser<IgnoreJobRequest>() {
        @java.lang.Override
        public IgnoreJobRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<IgnoreJobRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IgnoreJobRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.deploy.v1.IgnoreJobRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
