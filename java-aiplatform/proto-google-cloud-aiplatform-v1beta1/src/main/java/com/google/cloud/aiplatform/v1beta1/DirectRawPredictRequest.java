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
// source: google/cloud/aiplatform/v1beta1/prediction_service.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Request message for
 * [PredictionService.DirectRawPredict][google.cloud.aiplatform.v1beta1.PredictionService.DirectRawPredict].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.DirectRawPredictRequest}
 */
public final class DirectRawPredictRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.DirectRawPredictRequest)
    DirectRawPredictRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DirectRawPredictRequest.newBuilder() to construct.
  private DirectRawPredictRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DirectRawPredictRequest() {
    endpoint_ = "";
    methodName_ = "";
    input_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DirectRawPredictRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.PredictionServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_DirectRawPredictRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.PredictionServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_DirectRawPredictRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.DirectRawPredictRequest.class,
            com.google.cloud.aiplatform.v1beta1.DirectRawPredictRequest.Builder.class);
  }

  public static final int ENDPOINT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object endpoint_ = "";
  /**
   *
   *
   * <pre>
   * Required. The name of the Endpoint requested to serve the prediction.
   * Format:
   * `projects/{project}/locations/{location}/endpoints/{endpoint}`
   * </pre>
   *
   * <code>
   * string endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The endpoint.
   */
  @java.lang.Override
  public java.lang.String getEndpoint() {
    java.lang.Object ref = endpoint_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      endpoint_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The name of the Endpoint requested to serve the prediction.
   * Format:
   * `projects/{project}/locations/{location}/endpoints/{endpoint}`
   * </pre>
   *
   * <code>
   * string endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for endpoint.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEndpointBytes() {
    java.lang.Object ref = endpoint_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      endpoint_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int METHOD_NAME_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object methodName_ = "";
  /**
   *
   *
   * <pre>
   * Fully qualified name of the API method being invoked to perform
   * predictions.
   *
   * Format:
   * `/namespace.Service/Method/`
   * Example:
   * `/tensorflow.serving.PredictionService/Predict`
   * </pre>
   *
   * <code>string method_name = 2;</code>
   *
   * @return The methodName.
   */
  @java.lang.Override
  public java.lang.String getMethodName() {
    java.lang.Object ref = methodName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      methodName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Fully qualified name of the API method being invoked to perform
   * predictions.
   *
   * Format:
   * `/namespace.Service/Method/`
   * Example:
   * `/tensorflow.serving.PredictionService/Predict`
   * </pre>
   *
   * <code>string method_name = 2;</code>
   *
   * @return The bytes for methodName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMethodNameBytes() {
    java.lang.Object ref = methodName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      methodName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INPUT_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString input_ = com.google.protobuf.ByteString.EMPTY;
  /**
   *
   *
   * <pre>
   * The prediction input.
   * </pre>
   *
   * <code>bytes input = 3;</code>
   *
   * @return The input.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getInput() {
    return input_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(endpoint_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, endpoint_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(methodName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, methodName_);
    }
    if (!input_.isEmpty()) {
      output.writeBytes(3, input_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(endpoint_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, endpoint_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(methodName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, methodName_);
    }
    if (!input_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(3, input_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.DirectRawPredictRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.DirectRawPredictRequest other =
        (com.google.cloud.aiplatform.v1beta1.DirectRawPredictRequest) obj;

    if (!getEndpoint().equals(other.getEndpoint())) return false;
    if (!getMethodName().equals(other.getMethodName())) return false;
    if (!getInput().equals(other.getInput())) return false;
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
    hash = (37 * hash) + ENDPOINT_FIELD_NUMBER;
    hash = (53 * hash) + getEndpoint().hashCode();
    hash = (37 * hash) + METHOD_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getMethodName().hashCode();
    hash = (37 * hash) + INPUT_FIELD_NUMBER;
    hash = (53 * hash) + getInput().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.DirectRawPredictRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.DirectRawPredictRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.DirectRawPredictRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.DirectRawPredictRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.DirectRawPredictRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.DirectRawPredictRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.DirectRawPredictRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.DirectRawPredictRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.DirectRawPredictRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.DirectRawPredictRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.DirectRawPredictRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.DirectRawPredictRequest parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.DirectRawPredictRequest prototype) {
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
   * [PredictionService.DirectRawPredict][google.cloud.aiplatform.v1beta1.PredictionService.DirectRawPredict].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.DirectRawPredictRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.DirectRawPredictRequest)
      com.google.cloud.aiplatform.v1beta1.DirectRawPredictRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.PredictionServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_DirectRawPredictRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.PredictionServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_DirectRawPredictRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.DirectRawPredictRequest.class,
              com.google.cloud.aiplatform.v1beta1.DirectRawPredictRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.DirectRawPredictRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      endpoint_ = "";
      methodName_ = "";
      input_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.PredictionServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_DirectRawPredictRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.DirectRawPredictRequest getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.DirectRawPredictRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.DirectRawPredictRequest build() {
      com.google.cloud.aiplatform.v1beta1.DirectRawPredictRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.DirectRawPredictRequest buildPartial() {
      com.google.cloud.aiplatform.v1beta1.DirectRawPredictRequest result =
          new com.google.cloud.aiplatform.v1beta1.DirectRawPredictRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.DirectRawPredictRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.endpoint_ = endpoint_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.methodName_ = methodName_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.input_ = input_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.DirectRawPredictRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.DirectRawPredictRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.DirectRawPredictRequest other) {
      if (other == com.google.cloud.aiplatform.v1beta1.DirectRawPredictRequest.getDefaultInstance())
        return this;
      if (!other.getEndpoint().isEmpty()) {
        endpoint_ = other.endpoint_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getMethodName().isEmpty()) {
        methodName_ = other.methodName_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getInput() != com.google.protobuf.ByteString.EMPTY) {
        setInput(other.getInput());
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
                endpoint_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                methodName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input_ = input.readBytes();
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

    private java.lang.Object endpoint_ = "";
    /**
     *
     *
     * <pre>
     * Required. The name of the Endpoint requested to serve the prediction.
     * Format:
     * `projects/{project}/locations/{location}/endpoints/{endpoint}`
     * </pre>
     *
     * <code>
     * string endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The endpoint.
     */
    public java.lang.String getEndpoint() {
      java.lang.Object ref = endpoint_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        endpoint_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the Endpoint requested to serve the prediction.
     * Format:
     * `projects/{project}/locations/{location}/endpoints/{endpoint}`
     * </pre>
     *
     * <code>
     * string endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for endpoint.
     */
    public com.google.protobuf.ByteString getEndpointBytes() {
      java.lang.Object ref = endpoint_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        endpoint_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the Endpoint requested to serve the prediction.
     * Format:
     * `projects/{project}/locations/{location}/endpoints/{endpoint}`
     * </pre>
     *
     * <code>
     * string endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The endpoint to set.
     * @return This builder for chaining.
     */
    public Builder setEndpoint(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      endpoint_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the Endpoint requested to serve the prediction.
     * Format:
     * `projects/{project}/locations/{location}/endpoints/{endpoint}`
     * </pre>
     *
     * <code>
     * string endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEndpoint() {
      endpoint_ = getDefaultInstance().getEndpoint();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the Endpoint requested to serve the prediction.
     * Format:
     * `projects/{project}/locations/{location}/endpoints/{endpoint}`
     * </pre>
     *
     * <code>
     * string endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for endpoint to set.
     * @return This builder for chaining.
     */
    public Builder setEndpointBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      endpoint_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object methodName_ = "";
    /**
     *
     *
     * <pre>
     * Fully qualified name of the API method being invoked to perform
     * predictions.
     *
     * Format:
     * `/namespace.Service/Method/`
     * Example:
     * `/tensorflow.serving.PredictionService/Predict`
     * </pre>
     *
     * <code>string method_name = 2;</code>
     *
     * @return The methodName.
     */
    public java.lang.String getMethodName() {
      java.lang.Object ref = methodName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        methodName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Fully qualified name of the API method being invoked to perform
     * predictions.
     *
     * Format:
     * `/namespace.Service/Method/`
     * Example:
     * `/tensorflow.serving.PredictionService/Predict`
     * </pre>
     *
     * <code>string method_name = 2;</code>
     *
     * @return The bytes for methodName.
     */
    public com.google.protobuf.ByteString getMethodNameBytes() {
      java.lang.Object ref = methodName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        methodName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Fully qualified name of the API method being invoked to perform
     * predictions.
     *
     * Format:
     * `/namespace.Service/Method/`
     * Example:
     * `/tensorflow.serving.PredictionService/Predict`
     * </pre>
     *
     * <code>string method_name = 2;</code>
     *
     * @param value The methodName to set.
     * @return This builder for chaining.
     */
    public Builder setMethodName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      methodName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Fully qualified name of the API method being invoked to perform
     * predictions.
     *
     * Format:
     * `/namespace.Service/Method/`
     * Example:
     * `/tensorflow.serving.PredictionService/Predict`
     * </pre>
     *
     * <code>string method_name = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMethodName() {
      methodName_ = getDefaultInstance().getMethodName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Fully qualified name of the API method being invoked to perform
     * predictions.
     *
     * Format:
     * `/namespace.Service/Method/`
     * Example:
     * `/tensorflow.serving.PredictionService/Predict`
     * </pre>
     *
     * <code>string method_name = 2;</code>
     *
     * @param value The bytes for methodName to set.
     * @return This builder for chaining.
     */
    public Builder setMethodNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      methodName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString input_ = com.google.protobuf.ByteString.EMPTY;
    /**
     *
     *
     * <pre>
     * The prediction input.
     * </pre>
     *
     * <code>bytes input = 3;</code>
     *
     * @return The input.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getInput() {
      return input_;
    }
    /**
     *
     *
     * <pre>
     * The prediction input.
     * </pre>
     *
     * <code>bytes input = 3;</code>
     *
     * @param value The input to set.
     * @return This builder for chaining.
     */
    public Builder setInput(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      input_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The prediction input.
     * </pre>
     *
     * <code>bytes input = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearInput() {
      bitField0_ = (bitField0_ & ~0x00000004);
      input_ = getDefaultInstance().getInput();
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.DirectRawPredictRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.DirectRawPredictRequest)
  private static final com.google.cloud.aiplatform.v1beta1.DirectRawPredictRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.DirectRawPredictRequest();
  }

  public static com.google.cloud.aiplatform.v1beta1.DirectRawPredictRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DirectRawPredictRequest> PARSER =
      new com.google.protobuf.AbstractParser<DirectRawPredictRequest>() {
        @java.lang.Override
        public DirectRawPredictRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<DirectRawPredictRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DirectRawPredictRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.DirectRawPredictRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
