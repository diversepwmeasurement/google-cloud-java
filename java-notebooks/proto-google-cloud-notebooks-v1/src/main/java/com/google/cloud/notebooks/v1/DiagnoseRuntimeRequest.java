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
// source: google/cloud/notebooks/v1/managed_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.notebooks.v1;

/**
 *
 *
 * <pre>
 * Request for creating a notebook instance diagnostic file.
 * </pre>
 *
 * Protobuf type {@code google.cloud.notebooks.v1.DiagnoseRuntimeRequest}
 */
public final class DiagnoseRuntimeRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.notebooks.v1.DiagnoseRuntimeRequest)
    DiagnoseRuntimeRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DiagnoseRuntimeRequest.newBuilder() to construct.
  private DiagnoseRuntimeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DiagnoseRuntimeRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DiagnoseRuntimeRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.notebooks.v1.ManagedNotebooksProto
        .internal_static_google_cloud_notebooks_v1_DiagnoseRuntimeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.notebooks.v1.ManagedNotebooksProto
        .internal_static_google_cloud_notebooks_v1_DiagnoseRuntimeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.notebooks.v1.DiagnoseRuntimeRequest.class,
            com.google.cloud.notebooks.v1.DiagnoseRuntimeRequest.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Required. Format:
   * `projects/{project_id}/locations/{location}/runtimes/{runtimes_id}`
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
   * Required. Format:
   * `projects/{project_id}/locations/{location}/runtimes/{runtimes_id}`
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

  public static final int DIAGNOSTIC_CONFIG_FIELD_NUMBER = 2;
  private com.google.cloud.notebooks.v1.DiagnosticConfig diagnosticConfig_;
  /**
   *
   *
   * <pre>
   * Required. Defines flags that are used to run the diagnostic tool
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1.DiagnosticConfig diagnostic_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the diagnosticConfig field is set.
   */
  @java.lang.Override
  public boolean hasDiagnosticConfig() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. Defines flags that are used to run the diagnostic tool
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1.DiagnosticConfig diagnostic_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The diagnosticConfig.
   */
  @java.lang.Override
  public com.google.cloud.notebooks.v1.DiagnosticConfig getDiagnosticConfig() {
    return diagnosticConfig_ == null
        ? com.google.cloud.notebooks.v1.DiagnosticConfig.getDefaultInstance()
        : diagnosticConfig_;
  }
  /**
   *
   *
   * <pre>
   * Required. Defines flags that are used to run the diagnostic tool
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1.DiagnosticConfig diagnostic_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.notebooks.v1.DiagnosticConfigOrBuilder getDiagnosticConfigOrBuilder() {
    return diagnosticConfig_ == null
        ? com.google.cloud.notebooks.v1.DiagnosticConfig.getDefaultInstance()
        : diagnosticConfig_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getDiagnosticConfig());
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
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getDiagnosticConfig());
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
    if (!(obj instanceof com.google.cloud.notebooks.v1.DiagnoseRuntimeRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.notebooks.v1.DiagnoseRuntimeRequest other =
        (com.google.cloud.notebooks.v1.DiagnoseRuntimeRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasDiagnosticConfig() != other.hasDiagnosticConfig()) return false;
    if (hasDiagnosticConfig()) {
      if (!getDiagnosticConfig().equals(other.getDiagnosticConfig())) return false;
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
    if (hasDiagnosticConfig()) {
      hash = (37 * hash) + DIAGNOSTIC_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getDiagnosticConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.notebooks.v1.DiagnoseRuntimeRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v1.DiagnoseRuntimeRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.DiagnoseRuntimeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v1.DiagnoseRuntimeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.DiagnoseRuntimeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v1.DiagnoseRuntimeRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.DiagnoseRuntimeRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v1.DiagnoseRuntimeRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.DiagnoseRuntimeRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v1.DiagnoseRuntimeRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.DiagnoseRuntimeRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v1.DiagnoseRuntimeRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.notebooks.v1.DiagnoseRuntimeRequest prototype) {
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
   * Request for creating a notebook instance diagnostic file.
   * </pre>
   *
   * Protobuf type {@code google.cloud.notebooks.v1.DiagnoseRuntimeRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.notebooks.v1.DiagnoseRuntimeRequest)
      com.google.cloud.notebooks.v1.DiagnoseRuntimeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.notebooks.v1.ManagedNotebooksProto
          .internal_static_google_cloud_notebooks_v1_DiagnoseRuntimeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.notebooks.v1.ManagedNotebooksProto
          .internal_static_google_cloud_notebooks_v1_DiagnoseRuntimeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.notebooks.v1.DiagnoseRuntimeRequest.class,
              com.google.cloud.notebooks.v1.DiagnoseRuntimeRequest.Builder.class);
    }

    // Construct using com.google.cloud.notebooks.v1.DiagnoseRuntimeRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getDiagnosticConfigFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      diagnosticConfig_ = null;
      if (diagnosticConfigBuilder_ != null) {
        diagnosticConfigBuilder_.dispose();
        diagnosticConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.notebooks.v1.ManagedNotebooksProto
          .internal_static_google_cloud_notebooks_v1_DiagnoseRuntimeRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.DiagnoseRuntimeRequest getDefaultInstanceForType() {
      return com.google.cloud.notebooks.v1.DiagnoseRuntimeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.DiagnoseRuntimeRequest build() {
      com.google.cloud.notebooks.v1.DiagnoseRuntimeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.DiagnoseRuntimeRequest buildPartial() {
      com.google.cloud.notebooks.v1.DiagnoseRuntimeRequest result =
          new com.google.cloud.notebooks.v1.DiagnoseRuntimeRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.notebooks.v1.DiagnoseRuntimeRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.diagnosticConfig_ =
            diagnosticConfigBuilder_ == null ? diagnosticConfig_ : diagnosticConfigBuilder_.build();
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
      if (other instanceof com.google.cloud.notebooks.v1.DiagnoseRuntimeRequest) {
        return mergeFrom((com.google.cloud.notebooks.v1.DiagnoseRuntimeRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.notebooks.v1.DiagnoseRuntimeRequest other) {
      if (other == com.google.cloud.notebooks.v1.DiagnoseRuntimeRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasDiagnosticConfig()) {
        mergeDiagnosticConfig(other.getDiagnosticConfig());
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
                    getDiagnosticConfigFieldBuilder().getBuilder(), extensionRegistry);
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
     * Required. Format:
     * `projects/{project_id}/locations/{location}/runtimes/{runtimes_id}`
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
     * Required. Format:
     * `projects/{project_id}/locations/{location}/runtimes/{runtimes_id}`
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
     * Required. Format:
     * `projects/{project_id}/locations/{location}/runtimes/{runtimes_id}`
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
     * Required. Format:
     * `projects/{project_id}/locations/{location}/runtimes/{runtimes_id}`
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
     * Required. Format:
     * `projects/{project_id}/locations/{location}/runtimes/{runtimes_id}`
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

    private com.google.cloud.notebooks.v1.DiagnosticConfig diagnosticConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.notebooks.v1.DiagnosticConfig,
            com.google.cloud.notebooks.v1.DiagnosticConfig.Builder,
            com.google.cloud.notebooks.v1.DiagnosticConfigOrBuilder>
        diagnosticConfigBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Defines flags that are used to run the diagnostic tool
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v1.DiagnosticConfig diagnostic_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the diagnosticConfig field is set.
     */
    public boolean hasDiagnosticConfig() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. Defines flags that are used to run the diagnostic tool
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v1.DiagnosticConfig diagnostic_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The diagnosticConfig.
     */
    public com.google.cloud.notebooks.v1.DiagnosticConfig getDiagnosticConfig() {
      if (diagnosticConfigBuilder_ == null) {
        return diagnosticConfig_ == null
            ? com.google.cloud.notebooks.v1.DiagnosticConfig.getDefaultInstance()
            : diagnosticConfig_;
      } else {
        return diagnosticConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Defines flags that are used to run the diagnostic tool
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v1.DiagnosticConfig diagnostic_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setDiagnosticConfig(com.google.cloud.notebooks.v1.DiagnosticConfig value) {
      if (diagnosticConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        diagnosticConfig_ = value;
      } else {
        diagnosticConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Defines flags that are used to run the diagnostic tool
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v1.DiagnosticConfig diagnostic_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setDiagnosticConfig(
        com.google.cloud.notebooks.v1.DiagnosticConfig.Builder builderForValue) {
      if (diagnosticConfigBuilder_ == null) {
        diagnosticConfig_ = builderForValue.build();
      } else {
        diagnosticConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Defines flags that are used to run the diagnostic tool
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v1.DiagnosticConfig diagnostic_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeDiagnosticConfig(com.google.cloud.notebooks.v1.DiagnosticConfig value) {
      if (diagnosticConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && diagnosticConfig_ != null
            && diagnosticConfig_
                != com.google.cloud.notebooks.v1.DiagnosticConfig.getDefaultInstance()) {
          getDiagnosticConfigBuilder().mergeFrom(value);
        } else {
          diagnosticConfig_ = value;
        }
      } else {
        diagnosticConfigBuilder_.mergeFrom(value);
      }
      if (diagnosticConfig_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Defines flags that are used to run the diagnostic tool
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v1.DiagnosticConfig diagnostic_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearDiagnosticConfig() {
      bitField0_ = (bitField0_ & ~0x00000002);
      diagnosticConfig_ = null;
      if (diagnosticConfigBuilder_ != null) {
        diagnosticConfigBuilder_.dispose();
        diagnosticConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Defines flags that are used to run the diagnostic tool
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v1.DiagnosticConfig diagnostic_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.notebooks.v1.DiagnosticConfig.Builder getDiagnosticConfigBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getDiagnosticConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Defines flags that are used to run the diagnostic tool
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v1.DiagnosticConfig diagnostic_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.notebooks.v1.DiagnosticConfigOrBuilder getDiagnosticConfigOrBuilder() {
      if (diagnosticConfigBuilder_ != null) {
        return diagnosticConfigBuilder_.getMessageOrBuilder();
      } else {
        return diagnosticConfig_ == null
            ? com.google.cloud.notebooks.v1.DiagnosticConfig.getDefaultInstance()
            : diagnosticConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Defines flags that are used to run the diagnostic tool
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v1.DiagnosticConfig diagnostic_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.notebooks.v1.DiagnosticConfig,
            com.google.cloud.notebooks.v1.DiagnosticConfig.Builder,
            com.google.cloud.notebooks.v1.DiagnosticConfigOrBuilder>
        getDiagnosticConfigFieldBuilder() {
      if (diagnosticConfigBuilder_ == null) {
        diagnosticConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.notebooks.v1.DiagnosticConfig,
                com.google.cloud.notebooks.v1.DiagnosticConfig.Builder,
                com.google.cloud.notebooks.v1.DiagnosticConfigOrBuilder>(
                getDiagnosticConfig(), getParentForChildren(), isClean());
        diagnosticConfig_ = null;
      }
      return diagnosticConfigBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.notebooks.v1.DiagnoseRuntimeRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.notebooks.v1.DiagnoseRuntimeRequest)
  private static final com.google.cloud.notebooks.v1.DiagnoseRuntimeRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.notebooks.v1.DiagnoseRuntimeRequest();
  }

  public static com.google.cloud.notebooks.v1.DiagnoseRuntimeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DiagnoseRuntimeRequest> PARSER =
      new com.google.protobuf.AbstractParser<DiagnoseRuntimeRequest>() {
        @java.lang.Override
        public DiagnoseRuntimeRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<DiagnoseRuntimeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DiagnoseRuntimeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.notebooks.v1.DiagnoseRuntimeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
