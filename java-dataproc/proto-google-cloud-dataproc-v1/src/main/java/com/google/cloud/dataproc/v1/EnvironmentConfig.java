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
// source: google/cloud/dataproc/v1/shared.proto

package com.google.cloud.dataproc.v1;

/**
 *
 *
 * <pre>
 * Environment configuration for a workload.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1.EnvironmentConfig}
 */
public final class EnvironmentConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1.EnvironmentConfig)
    EnvironmentConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use EnvironmentConfig.newBuilder() to construct.
  private EnvironmentConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private EnvironmentConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new EnvironmentConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataproc.v1.SharedProto
        .internal_static_google_cloud_dataproc_v1_EnvironmentConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1.SharedProto
        .internal_static_google_cloud_dataproc_v1_EnvironmentConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1.EnvironmentConfig.class,
            com.google.cloud.dataproc.v1.EnvironmentConfig.Builder.class);
  }

  public static final int EXECUTION_CONFIG_FIELD_NUMBER = 1;
  private com.google.cloud.dataproc.v1.ExecutionConfig executionConfig_;
  /**
   *
   *
   * <pre>
   * Optional. Execution configuration for a workload.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.ExecutionConfig execution_config = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the executionConfig field is set.
   */
  @java.lang.Override
  public boolean hasExecutionConfig() {
    return executionConfig_ != null;
  }
  /**
   *
   *
   * <pre>
   * Optional. Execution configuration for a workload.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.ExecutionConfig execution_config = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The executionConfig.
   */
  @java.lang.Override
  public com.google.cloud.dataproc.v1.ExecutionConfig getExecutionConfig() {
    return executionConfig_ == null
        ? com.google.cloud.dataproc.v1.ExecutionConfig.getDefaultInstance()
        : executionConfig_;
  }
  /**
   *
   *
   * <pre>
   * Optional. Execution configuration for a workload.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.ExecutionConfig execution_config = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dataproc.v1.ExecutionConfigOrBuilder getExecutionConfigOrBuilder() {
    return getExecutionConfig();
  }

  public static final int PERIPHERALS_CONFIG_FIELD_NUMBER = 2;
  private com.google.cloud.dataproc.v1.PeripheralsConfig peripheralsConfig_;
  /**
   *
   *
   * <pre>
   * Optional. Peripherals configuration that workload has access to.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.PeripheralsConfig peripherals_config = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the peripheralsConfig field is set.
   */
  @java.lang.Override
  public boolean hasPeripheralsConfig() {
    return peripheralsConfig_ != null;
  }
  /**
   *
   *
   * <pre>
   * Optional. Peripherals configuration that workload has access to.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.PeripheralsConfig peripherals_config = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The peripheralsConfig.
   */
  @java.lang.Override
  public com.google.cloud.dataproc.v1.PeripheralsConfig getPeripheralsConfig() {
    return peripheralsConfig_ == null
        ? com.google.cloud.dataproc.v1.PeripheralsConfig.getDefaultInstance()
        : peripheralsConfig_;
  }
  /**
   *
   *
   * <pre>
   * Optional. Peripherals configuration that workload has access to.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.PeripheralsConfig peripherals_config = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dataproc.v1.PeripheralsConfigOrBuilder getPeripheralsConfigOrBuilder() {
    return getPeripheralsConfig();
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
    if (executionConfig_ != null) {
      output.writeMessage(1, getExecutionConfig());
    }
    if (peripheralsConfig_ != null) {
      output.writeMessage(2, getPeripheralsConfig());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (executionConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getExecutionConfig());
    }
    if (peripheralsConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getPeripheralsConfig());
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
    if (!(obj instanceof com.google.cloud.dataproc.v1.EnvironmentConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1.EnvironmentConfig other =
        (com.google.cloud.dataproc.v1.EnvironmentConfig) obj;

    if (hasExecutionConfig() != other.hasExecutionConfig()) return false;
    if (hasExecutionConfig()) {
      if (!getExecutionConfig().equals(other.getExecutionConfig())) return false;
    }
    if (hasPeripheralsConfig() != other.hasPeripheralsConfig()) return false;
    if (hasPeripheralsConfig()) {
      if (!getPeripheralsConfig().equals(other.getPeripheralsConfig())) return false;
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
    if (hasExecutionConfig()) {
      hash = (37 * hash) + EXECUTION_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getExecutionConfig().hashCode();
    }
    if (hasPeripheralsConfig()) {
      hash = (37 * hash) + PERIPHERALS_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getPeripheralsConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1.EnvironmentConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.EnvironmentConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.EnvironmentConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.EnvironmentConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.EnvironmentConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.EnvironmentConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.EnvironmentConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.EnvironmentConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.EnvironmentConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.EnvironmentConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.EnvironmentConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.EnvironmentConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dataproc.v1.EnvironmentConfig prototype) {
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
   * Environment configuration for a workload.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1.EnvironmentConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1.EnvironmentConfig)
      com.google.cloud.dataproc.v1.EnvironmentConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataproc.v1.SharedProto
          .internal_static_google_cloud_dataproc_v1_EnvironmentConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1.SharedProto
          .internal_static_google_cloud_dataproc_v1_EnvironmentConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1.EnvironmentConfig.class,
              com.google.cloud.dataproc.v1.EnvironmentConfig.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1.EnvironmentConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (executionConfigBuilder_ == null) {
        executionConfig_ = null;
      } else {
        executionConfig_ = null;
        executionConfigBuilder_ = null;
      }
      if (peripheralsConfigBuilder_ == null) {
        peripheralsConfig_ = null;
      } else {
        peripheralsConfig_ = null;
        peripheralsConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataproc.v1.SharedProto
          .internal_static_google_cloud_dataproc_v1_EnvironmentConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.EnvironmentConfig getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1.EnvironmentConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.EnvironmentConfig build() {
      com.google.cloud.dataproc.v1.EnvironmentConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.EnvironmentConfig buildPartial() {
      com.google.cloud.dataproc.v1.EnvironmentConfig result =
          new com.google.cloud.dataproc.v1.EnvironmentConfig(this);
      if (executionConfigBuilder_ == null) {
        result.executionConfig_ = executionConfig_;
      } else {
        result.executionConfig_ = executionConfigBuilder_.build();
      }
      if (peripheralsConfigBuilder_ == null) {
        result.peripheralsConfig_ = peripheralsConfig_;
      } else {
        result.peripheralsConfig_ = peripheralsConfigBuilder_.build();
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
      if (other instanceof com.google.cloud.dataproc.v1.EnvironmentConfig) {
        return mergeFrom((com.google.cloud.dataproc.v1.EnvironmentConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1.EnvironmentConfig other) {
      if (other == com.google.cloud.dataproc.v1.EnvironmentConfig.getDefaultInstance()) return this;
      if (other.hasExecutionConfig()) {
        mergeExecutionConfig(other.getExecutionConfig());
      }
      if (other.hasPeripheralsConfig()) {
        mergePeripheralsConfig(other.getPeripheralsConfig());
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
                input.readMessage(getExecutionConfigFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 10
            case 18:
              {
                input.readMessage(
                    getPeripheralsConfigFieldBuilder().getBuilder(), extensionRegistry);

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

    private com.google.cloud.dataproc.v1.ExecutionConfig executionConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataproc.v1.ExecutionConfig,
            com.google.cloud.dataproc.v1.ExecutionConfig.Builder,
            com.google.cloud.dataproc.v1.ExecutionConfigOrBuilder>
        executionConfigBuilder_;
    /**
     *
     *
     * <pre>
     * Optional. Execution configuration for a workload.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.ExecutionConfig execution_config = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return Whether the executionConfig field is set.
     */
    public boolean hasExecutionConfig() {
      return executionConfigBuilder_ != null || executionConfig_ != null;
    }
    /**
     *
     *
     * <pre>
     * Optional. Execution configuration for a workload.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.ExecutionConfig execution_config = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The executionConfig.
     */
    public com.google.cloud.dataproc.v1.ExecutionConfig getExecutionConfig() {
      if (executionConfigBuilder_ == null) {
        return executionConfig_ == null
            ? com.google.cloud.dataproc.v1.ExecutionConfig.getDefaultInstance()
            : executionConfig_;
      } else {
        return executionConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Execution configuration for a workload.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.ExecutionConfig execution_config = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setExecutionConfig(com.google.cloud.dataproc.v1.ExecutionConfig value) {
      if (executionConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        executionConfig_ = value;
        onChanged();
      } else {
        executionConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Execution configuration for a workload.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.ExecutionConfig execution_config = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setExecutionConfig(
        com.google.cloud.dataproc.v1.ExecutionConfig.Builder builderForValue) {
      if (executionConfigBuilder_ == null) {
        executionConfig_ = builderForValue.build();
        onChanged();
      } else {
        executionConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Execution configuration for a workload.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.ExecutionConfig execution_config = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder mergeExecutionConfig(com.google.cloud.dataproc.v1.ExecutionConfig value) {
      if (executionConfigBuilder_ == null) {
        if (executionConfig_ != null) {
          executionConfig_ =
              com.google.cloud.dataproc.v1.ExecutionConfig.newBuilder(executionConfig_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          executionConfig_ = value;
        }
        onChanged();
      } else {
        executionConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Execution configuration for a workload.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.ExecutionConfig execution_config = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder clearExecutionConfig() {
      if (executionConfigBuilder_ == null) {
        executionConfig_ = null;
        onChanged();
      } else {
        executionConfig_ = null;
        executionConfigBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Execution configuration for a workload.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.ExecutionConfig execution_config = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.dataproc.v1.ExecutionConfig.Builder getExecutionConfigBuilder() {

      onChanged();
      return getExecutionConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Optional. Execution configuration for a workload.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.ExecutionConfig execution_config = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.dataproc.v1.ExecutionConfigOrBuilder getExecutionConfigOrBuilder() {
      if (executionConfigBuilder_ != null) {
        return executionConfigBuilder_.getMessageOrBuilder();
      } else {
        return executionConfig_ == null
            ? com.google.cloud.dataproc.v1.ExecutionConfig.getDefaultInstance()
            : executionConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Execution configuration for a workload.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.ExecutionConfig execution_config = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataproc.v1.ExecutionConfig,
            com.google.cloud.dataproc.v1.ExecutionConfig.Builder,
            com.google.cloud.dataproc.v1.ExecutionConfigOrBuilder>
        getExecutionConfigFieldBuilder() {
      if (executionConfigBuilder_ == null) {
        executionConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dataproc.v1.ExecutionConfig,
                com.google.cloud.dataproc.v1.ExecutionConfig.Builder,
                com.google.cloud.dataproc.v1.ExecutionConfigOrBuilder>(
                getExecutionConfig(), getParentForChildren(), isClean());
        executionConfig_ = null;
      }
      return executionConfigBuilder_;
    }

    private com.google.cloud.dataproc.v1.PeripheralsConfig peripheralsConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataproc.v1.PeripheralsConfig,
            com.google.cloud.dataproc.v1.PeripheralsConfig.Builder,
            com.google.cloud.dataproc.v1.PeripheralsConfigOrBuilder>
        peripheralsConfigBuilder_;
    /**
     *
     *
     * <pre>
     * Optional. Peripherals configuration that workload has access to.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.PeripheralsConfig peripherals_config = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return Whether the peripheralsConfig field is set.
     */
    public boolean hasPeripheralsConfig() {
      return peripheralsConfigBuilder_ != null || peripheralsConfig_ != null;
    }
    /**
     *
     *
     * <pre>
     * Optional. Peripherals configuration that workload has access to.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.PeripheralsConfig peripherals_config = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The peripheralsConfig.
     */
    public com.google.cloud.dataproc.v1.PeripheralsConfig getPeripheralsConfig() {
      if (peripheralsConfigBuilder_ == null) {
        return peripheralsConfig_ == null
            ? com.google.cloud.dataproc.v1.PeripheralsConfig.getDefaultInstance()
            : peripheralsConfig_;
      } else {
        return peripheralsConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Peripherals configuration that workload has access to.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.PeripheralsConfig peripherals_config = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setPeripheralsConfig(com.google.cloud.dataproc.v1.PeripheralsConfig value) {
      if (peripheralsConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        peripheralsConfig_ = value;
        onChanged();
      } else {
        peripheralsConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Peripherals configuration that workload has access to.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.PeripheralsConfig peripherals_config = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setPeripheralsConfig(
        com.google.cloud.dataproc.v1.PeripheralsConfig.Builder builderForValue) {
      if (peripheralsConfigBuilder_ == null) {
        peripheralsConfig_ = builderForValue.build();
        onChanged();
      } else {
        peripheralsConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Peripherals configuration that workload has access to.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.PeripheralsConfig peripherals_config = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder mergePeripheralsConfig(com.google.cloud.dataproc.v1.PeripheralsConfig value) {
      if (peripheralsConfigBuilder_ == null) {
        if (peripheralsConfig_ != null) {
          peripheralsConfig_ =
              com.google.cloud.dataproc.v1.PeripheralsConfig.newBuilder(peripheralsConfig_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          peripheralsConfig_ = value;
        }
        onChanged();
      } else {
        peripheralsConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Peripherals configuration that workload has access to.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.PeripheralsConfig peripherals_config = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder clearPeripheralsConfig() {
      if (peripheralsConfigBuilder_ == null) {
        peripheralsConfig_ = null;
        onChanged();
      } else {
        peripheralsConfig_ = null;
        peripheralsConfigBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Peripherals configuration that workload has access to.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.PeripheralsConfig peripherals_config = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.dataproc.v1.PeripheralsConfig.Builder getPeripheralsConfigBuilder() {

      onChanged();
      return getPeripheralsConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Optional. Peripherals configuration that workload has access to.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.PeripheralsConfig peripherals_config = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.dataproc.v1.PeripheralsConfigOrBuilder getPeripheralsConfigOrBuilder() {
      if (peripheralsConfigBuilder_ != null) {
        return peripheralsConfigBuilder_.getMessageOrBuilder();
      } else {
        return peripheralsConfig_ == null
            ? com.google.cloud.dataproc.v1.PeripheralsConfig.getDefaultInstance()
            : peripheralsConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Peripherals configuration that workload has access to.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.PeripheralsConfig peripherals_config = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataproc.v1.PeripheralsConfig,
            com.google.cloud.dataproc.v1.PeripheralsConfig.Builder,
            com.google.cloud.dataproc.v1.PeripheralsConfigOrBuilder>
        getPeripheralsConfigFieldBuilder() {
      if (peripheralsConfigBuilder_ == null) {
        peripheralsConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dataproc.v1.PeripheralsConfig,
                com.google.cloud.dataproc.v1.PeripheralsConfig.Builder,
                com.google.cloud.dataproc.v1.PeripheralsConfigOrBuilder>(
                getPeripheralsConfig(), getParentForChildren(), isClean());
        peripheralsConfig_ = null;
      }
      return peripheralsConfigBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1.EnvironmentConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1.EnvironmentConfig)
  private static final com.google.cloud.dataproc.v1.EnvironmentConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1.EnvironmentConfig();
  }

  public static com.google.cloud.dataproc.v1.EnvironmentConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EnvironmentConfig> PARSER =
      new com.google.protobuf.AbstractParser<EnvironmentConfig>() {
        @java.lang.Override
        public EnvironmentConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<EnvironmentConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EnvironmentConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataproc.v1.EnvironmentConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
