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
// source: google/cloud/notebooks/v1/service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.notebooks.v1;

/**
 *
 *
 * <pre>
 * Request for created scheduled notebooks
 * </pre>
 *
 * Protobuf type {@code google.cloud.notebooks.v1.CreateScheduleRequest}
 */
public final class CreateScheduleRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.notebooks.v1.CreateScheduleRequest)
    CreateScheduleRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateScheduleRequest.newBuilder() to construct.
  private CreateScheduleRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateScheduleRequest() {
    parent_ = "";
    scheduleId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateScheduleRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.notebooks.v1.NotebooksProto
        .internal_static_google_cloud_notebooks_v1_CreateScheduleRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.notebooks.v1.NotebooksProto
        .internal_static_google_cloud_notebooks_v1_CreateScheduleRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.notebooks.v1.CreateScheduleRequest.class,
            com.google.cloud.notebooks.v1.CreateScheduleRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. Format:
   * `parent=projects/{project_id}/locations/{location}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Format:
   * `parent=projects/{project_id}/locations/{location}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SCHEDULE_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object scheduleId_ = "";
  /**
   *
   *
   * <pre>
   * Required. User-defined unique ID of this schedule.
   * </pre>
   *
   * <code>string schedule_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The scheduleId.
   */
  @java.lang.Override
  public java.lang.String getScheduleId() {
    java.lang.Object ref = scheduleId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      scheduleId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. User-defined unique ID of this schedule.
   * </pre>
   *
   * <code>string schedule_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for scheduleId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getScheduleIdBytes() {
    java.lang.Object ref = scheduleId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      scheduleId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SCHEDULE_FIELD_NUMBER = 3;
  private com.google.cloud.notebooks.v1.Schedule schedule_;
  /**
   *
   *
   * <pre>
   * Required. The schedule to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1.Schedule schedule = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the schedule field is set.
   */
  @java.lang.Override
  public boolean hasSchedule() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The schedule to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1.Schedule schedule = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The schedule.
   */
  @java.lang.Override
  public com.google.cloud.notebooks.v1.Schedule getSchedule() {
    return schedule_ == null
        ? com.google.cloud.notebooks.v1.Schedule.getDefaultInstance()
        : schedule_;
  }
  /**
   *
   *
   * <pre>
   * Required. The schedule to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1.Schedule schedule = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.notebooks.v1.ScheduleOrBuilder getScheduleOrBuilder() {
    return schedule_ == null
        ? com.google.cloud.notebooks.v1.Schedule.getDefaultInstance()
        : schedule_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(scheduleId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, scheduleId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getSchedule());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(scheduleId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, scheduleId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getSchedule());
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
    if (!(obj instanceof com.google.cloud.notebooks.v1.CreateScheduleRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.notebooks.v1.CreateScheduleRequest other =
        (com.google.cloud.notebooks.v1.CreateScheduleRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getScheduleId().equals(other.getScheduleId())) return false;
    if (hasSchedule() != other.hasSchedule()) return false;
    if (hasSchedule()) {
      if (!getSchedule().equals(other.getSchedule())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + SCHEDULE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getScheduleId().hashCode();
    if (hasSchedule()) {
      hash = (37 * hash) + SCHEDULE_FIELD_NUMBER;
      hash = (53 * hash) + getSchedule().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.notebooks.v1.CreateScheduleRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v1.CreateScheduleRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.CreateScheduleRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v1.CreateScheduleRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.CreateScheduleRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v1.CreateScheduleRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.CreateScheduleRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v1.CreateScheduleRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.CreateScheduleRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v1.CreateScheduleRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.CreateScheduleRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v1.CreateScheduleRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.notebooks.v1.CreateScheduleRequest prototype) {
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
   * Request for created scheduled notebooks
   * </pre>
   *
   * Protobuf type {@code google.cloud.notebooks.v1.CreateScheduleRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.notebooks.v1.CreateScheduleRequest)
      com.google.cloud.notebooks.v1.CreateScheduleRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.notebooks.v1.NotebooksProto
          .internal_static_google_cloud_notebooks_v1_CreateScheduleRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.notebooks.v1.NotebooksProto
          .internal_static_google_cloud_notebooks_v1_CreateScheduleRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.notebooks.v1.CreateScheduleRequest.class,
              com.google.cloud.notebooks.v1.CreateScheduleRequest.Builder.class);
    }

    // Construct using com.google.cloud.notebooks.v1.CreateScheduleRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getScheduleFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      scheduleId_ = "";
      schedule_ = null;
      if (scheduleBuilder_ != null) {
        scheduleBuilder_.dispose();
        scheduleBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.notebooks.v1.NotebooksProto
          .internal_static_google_cloud_notebooks_v1_CreateScheduleRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.CreateScheduleRequest getDefaultInstanceForType() {
      return com.google.cloud.notebooks.v1.CreateScheduleRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.CreateScheduleRequest build() {
      com.google.cloud.notebooks.v1.CreateScheduleRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.CreateScheduleRequest buildPartial() {
      com.google.cloud.notebooks.v1.CreateScheduleRequest result =
          new com.google.cloud.notebooks.v1.CreateScheduleRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.notebooks.v1.CreateScheduleRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.scheduleId_ = scheduleId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.schedule_ = scheduleBuilder_ == null ? schedule_ : scheduleBuilder_.build();
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof com.google.cloud.notebooks.v1.CreateScheduleRequest) {
        return mergeFrom((com.google.cloud.notebooks.v1.CreateScheduleRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.notebooks.v1.CreateScheduleRequest other) {
      if (other == com.google.cloud.notebooks.v1.CreateScheduleRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getScheduleId().isEmpty()) {
        scheduleId_ = other.scheduleId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasSchedule()) {
        mergeSchedule(other.getSchedule());
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                scheduleId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getScheduleFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. Format:
     * `parent=projects/{project_id}/locations/{location}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Format:
     * `parent=projects/{project_id}/locations/{location}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Format:
     * `parent=projects/{project_id}/locations/{location}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Format:
     * `parent=projects/{project_id}/locations/{location}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Format:
     * `parent=projects/{project_id}/locations/{location}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object scheduleId_ = "";
    /**
     *
     *
     * <pre>
     * Required. User-defined unique ID of this schedule.
     * </pre>
     *
     * <code>string schedule_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The scheduleId.
     */
    public java.lang.String getScheduleId() {
      java.lang.Object ref = scheduleId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        scheduleId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. User-defined unique ID of this schedule.
     * </pre>
     *
     * <code>string schedule_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for scheduleId.
     */
    public com.google.protobuf.ByteString getScheduleIdBytes() {
      java.lang.Object ref = scheduleId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        scheduleId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. User-defined unique ID of this schedule.
     * </pre>
     *
     * <code>string schedule_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The scheduleId to set.
     * @return This builder for chaining.
     */
    public Builder setScheduleId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      scheduleId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. User-defined unique ID of this schedule.
     * </pre>
     *
     * <code>string schedule_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearScheduleId() {
      scheduleId_ = getDefaultInstance().getScheduleId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. User-defined unique ID of this schedule.
     * </pre>
     *
     * <code>string schedule_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for scheduleId to set.
     * @return This builder for chaining.
     */
    public Builder setScheduleIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      scheduleId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.notebooks.v1.Schedule schedule_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.notebooks.v1.Schedule,
            com.google.cloud.notebooks.v1.Schedule.Builder,
            com.google.cloud.notebooks.v1.ScheduleOrBuilder>
        scheduleBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The schedule to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v1.Schedule schedule = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the schedule field is set.
     */
    public boolean hasSchedule() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The schedule to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v1.Schedule schedule = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The schedule.
     */
    public com.google.cloud.notebooks.v1.Schedule getSchedule() {
      if (scheduleBuilder_ == null) {
        return schedule_ == null
            ? com.google.cloud.notebooks.v1.Schedule.getDefaultInstance()
            : schedule_;
      } else {
        return scheduleBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The schedule to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v1.Schedule schedule = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setSchedule(com.google.cloud.notebooks.v1.Schedule value) {
      if (scheduleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        schedule_ = value;
      } else {
        scheduleBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The schedule to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v1.Schedule schedule = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setSchedule(com.google.cloud.notebooks.v1.Schedule.Builder builderForValue) {
      if (scheduleBuilder_ == null) {
        schedule_ = builderForValue.build();
      } else {
        scheduleBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The schedule to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v1.Schedule schedule = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeSchedule(com.google.cloud.notebooks.v1.Schedule value) {
      if (scheduleBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && schedule_ != null
            && schedule_ != com.google.cloud.notebooks.v1.Schedule.getDefaultInstance()) {
          getScheduleBuilder().mergeFrom(value);
        } else {
          schedule_ = value;
        }
      } else {
        scheduleBuilder_.mergeFrom(value);
      }
      if (schedule_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The schedule to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v1.Schedule schedule = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearSchedule() {
      bitField0_ = (bitField0_ & ~0x00000004);
      schedule_ = null;
      if (scheduleBuilder_ != null) {
        scheduleBuilder_.dispose();
        scheduleBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The schedule to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v1.Schedule schedule = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.notebooks.v1.Schedule.Builder getScheduleBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getScheduleFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The schedule to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v1.Schedule schedule = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.notebooks.v1.ScheduleOrBuilder getScheduleOrBuilder() {
      if (scheduleBuilder_ != null) {
        return scheduleBuilder_.getMessageOrBuilder();
      } else {
        return schedule_ == null
            ? com.google.cloud.notebooks.v1.Schedule.getDefaultInstance()
            : schedule_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The schedule to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v1.Schedule schedule = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.notebooks.v1.Schedule,
            com.google.cloud.notebooks.v1.Schedule.Builder,
            com.google.cloud.notebooks.v1.ScheduleOrBuilder>
        getScheduleFieldBuilder() {
      if (scheduleBuilder_ == null) {
        scheduleBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.notebooks.v1.Schedule,
                com.google.cloud.notebooks.v1.Schedule.Builder,
                com.google.cloud.notebooks.v1.ScheduleOrBuilder>(
                getSchedule(), getParentForChildren(), isClean());
        schedule_ = null;
      }
      return scheduleBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.notebooks.v1.CreateScheduleRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.notebooks.v1.CreateScheduleRequest)
  private static final com.google.cloud.notebooks.v1.CreateScheduleRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.notebooks.v1.CreateScheduleRequest();
  }

  public static com.google.cloud.notebooks.v1.CreateScheduleRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateScheduleRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateScheduleRequest>() {
        @java.lang.Override
        public CreateScheduleRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateScheduleRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateScheduleRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.notebooks.v1.CreateScheduleRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
