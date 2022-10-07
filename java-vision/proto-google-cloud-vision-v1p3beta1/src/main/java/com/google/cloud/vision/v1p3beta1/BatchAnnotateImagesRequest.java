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
// source: google/cloud/vision/v1p3beta1/image_annotator.proto

package com.google.cloud.vision.v1p3beta1;

/**
 *
 *
 * <pre>
 * Multiple image annotation requests are batched into a single service call.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vision.v1p3beta1.BatchAnnotateImagesRequest}
 */
public final class BatchAnnotateImagesRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.vision.v1p3beta1.BatchAnnotateImagesRequest)
    BatchAnnotateImagesRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BatchAnnotateImagesRequest.newBuilder() to construct.
  private BatchAnnotateImagesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BatchAnnotateImagesRequest() {
    requests_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BatchAnnotateImagesRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.vision.v1p3beta1.ImageAnnotatorProto
        .internal_static_google_cloud_vision_v1p3beta1_BatchAnnotateImagesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vision.v1p3beta1.ImageAnnotatorProto
        .internal_static_google_cloud_vision_v1p3beta1_BatchAnnotateImagesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vision.v1p3beta1.BatchAnnotateImagesRequest.class,
            com.google.cloud.vision.v1p3beta1.BatchAnnotateImagesRequest.Builder.class);
  }

  public static final int REQUESTS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.vision.v1p3beta1.AnnotateImageRequest> requests_;
  /**
   *
   *
   * <pre>
   * Individual image annotation requests for this batch.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vision.v1p3beta1.AnnotateImageRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.vision.v1p3beta1.AnnotateImageRequest> getRequestsList() {
    return requests_;
  }
  /**
   *
   *
   * <pre>
   * Individual image annotation requests for this batch.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vision.v1p3beta1.AnnotateImageRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.vision.v1p3beta1.AnnotateImageRequestOrBuilder>
      getRequestsOrBuilderList() {
    return requests_;
  }
  /**
   *
   *
   * <pre>
   * Individual image annotation requests for this batch.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vision.v1p3beta1.AnnotateImageRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public int getRequestsCount() {
    return requests_.size();
  }
  /**
   *
   *
   * <pre>
   * Individual image annotation requests for this batch.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vision.v1p3beta1.AnnotateImageRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.vision.v1p3beta1.AnnotateImageRequest getRequests(int index) {
    return requests_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Individual image annotation requests for this batch.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vision.v1p3beta1.AnnotateImageRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.vision.v1p3beta1.AnnotateImageRequestOrBuilder getRequestsOrBuilder(
      int index) {
    return requests_.get(index);
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
    for (int i = 0; i < requests_.size(); i++) {
      output.writeMessage(1, requests_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < requests_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, requests_.get(i));
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
    if (!(obj instanceof com.google.cloud.vision.v1p3beta1.BatchAnnotateImagesRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.vision.v1p3beta1.BatchAnnotateImagesRequest other =
        (com.google.cloud.vision.v1p3beta1.BatchAnnotateImagesRequest) obj;

    if (!getRequestsList().equals(other.getRequestsList())) return false;
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
    if (getRequestsCount() > 0) {
      hash = (37 * hash) + REQUESTS_FIELD_NUMBER;
      hash = (53 * hash) + getRequestsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vision.v1p3beta1.BatchAnnotateImagesRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p3beta1.BatchAnnotateImagesRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p3beta1.BatchAnnotateImagesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p3beta1.BatchAnnotateImagesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p3beta1.BatchAnnotateImagesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p3beta1.BatchAnnotateImagesRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p3beta1.BatchAnnotateImagesRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p3beta1.BatchAnnotateImagesRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p3beta1.BatchAnnotateImagesRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p3beta1.BatchAnnotateImagesRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p3beta1.BatchAnnotateImagesRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p3beta1.BatchAnnotateImagesRequest parseFrom(
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
      com.google.cloud.vision.v1p3beta1.BatchAnnotateImagesRequest prototype) {
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
   * Multiple image annotation requests are batched into a single service call.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vision.v1p3beta1.BatchAnnotateImagesRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vision.v1p3beta1.BatchAnnotateImagesRequest)
      com.google.cloud.vision.v1p3beta1.BatchAnnotateImagesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.vision.v1p3beta1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1p3beta1_BatchAnnotateImagesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vision.v1p3beta1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1p3beta1_BatchAnnotateImagesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vision.v1p3beta1.BatchAnnotateImagesRequest.class,
              com.google.cloud.vision.v1p3beta1.BatchAnnotateImagesRequest.Builder.class);
    }

    // Construct using com.google.cloud.vision.v1p3beta1.BatchAnnotateImagesRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (requestsBuilder_ == null) {
        requests_ = java.util.Collections.emptyList();
      } else {
        requests_ = null;
        requestsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.vision.v1p3beta1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1p3beta1_BatchAnnotateImagesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p3beta1.BatchAnnotateImagesRequest
        getDefaultInstanceForType() {
      return com.google.cloud.vision.v1p3beta1.BatchAnnotateImagesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p3beta1.BatchAnnotateImagesRequest build() {
      com.google.cloud.vision.v1p3beta1.BatchAnnotateImagesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p3beta1.BatchAnnotateImagesRequest buildPartial() {
      com.google.cloud.vision.v1p3beta1.BatchAnnotateImagesRequest result =
          new com.google.cloud.vision.v1p3beta1.BatchAnnotateImagesRequest(this);
      int from_bitField0_ = bitField0_;
      if (requestsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          requests_ = java.util.Collections.unmodifiableList(requests_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.requests_ = requests_;
      } else {
        result.requests_ = requestsBuilder_.build();
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
      if (other instanceof com.google.cloud.vision.v1p3beta1.BatchAnnotateImagesRequest) {
        return mergeFrom((com.google.cloud.vision.v1p3beta1.BatchAnnotateImagesRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vision.v1p3beta1.BatchAnnotateImagesRequest other) {
      if (other
          == com.google.cloud.vision.v1p3beta1.BatchAnnotateImagesRequest.getDefaultInstance())
        return this;
      if (requestsBuilder_ == null) {
        if (!other.requests_.isEmpty()) {
          if (requests_.isEmpty()) {
            requests_ = other.requests_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRequestsIsMutable();
            requests_.addAll(other.requests_);
          }
          onChanged();
        }
      } else {
        if (!other.requests_.isEmpty()) {
          if (requestsBuilder_.isEmpty()) {
            requestsBuilder_.dispose();
            requestsBuilder_ = null;
            requests_ = other.requests_;
            bitField0_ = (bitField0_ & ~0x00000001);
            requestsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getRequestsFieldBuilder()
                    : null;
          } else {
            requestsBuilder_.addAllMessages(other.requests_);
          }
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
                com.google.cloud.vision.v1p3beta1.AnnotateImageRequest m =
                    input.readMessage(
                        com.google.cloud.vision.v1p3beta1.AnnotateImageRequest.parser(),
                        extensionRegistry);
                if (requestsBuilder_ == null) {
                  ensureRequestsIsMutable();
                  requests_.add(m);
                } else {
                  requestsBuilder_.addMessage(m);
                }
                break;
              } // case 10
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

    private java.util.List<com.google.cloud.vision.v1p3beta1.AnnotateImageRequest> requests_ =
        java.util.Collections.emptyList();

    private void ensureRequestsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        requests_ =
            new java.util.ArrayList<com.google.cloud.vision.v1p3beta1.AnnotateImageRequest>(
                requests_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.vision.v1p3beta1.AnnotateImageRequest,
            com.google.cloud.vision.v1p3beta1.AnnotateImageRequest.Builder,
            com.google.cloud.vision.v1p3beta1.AnnotateImageRequestOrBuilder>
        requestsBuilder_;

    /**
     *
     *
     * <pre>
     * Individual image annotation requests for this batch.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vision.v1p3beta1.AnnotateImageRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public java.util.List<com.google.cloud.vision.v1p3beta1.AnnotateImageRequest>
        getRequestsList() {
      if (requestsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(requests_);
      } else {
        return requestsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Individual image annotation requests for this batch.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vision.v1p3beta1.AnnotateImageRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public int getRequestsCount() {
      if (requestsBuilder_ == null) {
        return requests_.size();
      } else {
        return requestsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Individual image annotation requests for this batch.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vision.v1p3beta1.AnnotateImageRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.vision.v1p3beta1.AnnotateImageRequest getRequests(int index) {
      if (requestsBuilder_ == null) {
        return requests_.get(index);
      } else {
        return requestsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Individual image annotation requests for this batch.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vision.v1p3beta1.AnnotateImageRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setRequests(
        int index, com.google.cloud.vision.v1p3beta1.AnnotateImageRequest value) {
      if (requestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequestsIsMutable();
        requests_.set(index, value);
        onChanged();
      } else {
        requestsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual image annotation requests for this batch.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vision.v1p3beta1.AnnotateImageRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setRequests(
        int index, com.google.cloud.vision.v1p3beta1.AnnotateImageRequest.Builder builderForValue) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        requests_.set(index, builderForValue.build());
        onChanged();
      } else {
        requestsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual image annotation requests for this batch.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vision.v1p3beta1.AnnotateImageRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addRequests(com.google.cloud.vision.v1p3beta1.AnnotateImageRequest value) {
      if (requestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequestsIsMutable();
        requests_.add(value);
        onChanged();
      } else {
        requestsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual image annotation requests for this batch.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vision.v1p3beta1.AnnotateImageRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addRequests(
        int index, com.google.cloud.vision.v1p3beta1.AnnotateImageRequest value) {
      if (requestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequestsIsMutable();
        requests_.add(index, value);
        onChanged();
      } else {
        requestsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual image annotation requests for this batch.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vision.v1p3beta1.AnnotateImageRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addRequests(
        com.google.cloud.vision.v1p3beta1.AnnotateImageRequest.Builder builderForValue) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        requests_.add(builderForValue.build());
        onChanged();
      } else {
        requestsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual image annotation requests for this batch.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vision.v1p3beta1.AnnotateImageRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addRequests(
        int index, com.google.cloud.vision.v1p3beta1.AnnotateImageRequest.Builder builderForValue) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        requests_.add(index, builderForValue.build());
        onChanged();
      } else {
        requestsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual image annotation requests for this batch.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vision.v1p3beta1.AnnotateImageRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addAllRequests(
        java.lang.Iterable<? extends com.google.cloud.vision.v1p3beta1.AnnotateImageRequest>
            values) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, requests_);
        onChanged();
      } else {
        requestsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual image annotation requests for this batch.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vision.v1p3beta1.AnnotateImageRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearRequests() {
      if (requestsBuilder_ == null) {
        requests_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        requestsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual image annotation requests for this batch.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vision.v1p3beta1.AnnotateImageRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder removeRequests(int index) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        requests_.remove(index);
        onChanged();
      } else {
        requestsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual image annotation requests for this batch.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vision.v1p3beta1.AnnotateImageRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.vision.v1p3beta1.AnnotateImageRequest.Builder getRequestsBuilder(
        int index) {
      return getRequestsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Individual image annotation requests for this batch.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vision.v1p3beta1.AnnotateImageRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.vision.v1p3beta1.AnnotateImageRequestOrBuilder getRequestsOrBuilder(
        int index) {
      if (requestsBuilder_ == null) {
        return requests_.get(index);
      } else {
        return requestsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Individual image annotation requests for this batch.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vision.v1p3beta1.AnnotateImageRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public java.util.List<? extends com.google.cloud.vision.v1p3beta1.AnnotateImageRequestOrBuilder>
        getRequestsOrBuilderList() {
      if (requestsBuilder_ != null) {
        return requestsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(requests_);
      }
    }
    /**
     *
     *
     * <pre>
     * Individual image annotation requests for this batch.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vision.v1p3beta1.AnnotateImageRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.vision.v1p3beta1.AnnotateImageRequest.Builder addRequestsBuilder() {
      return getRequestsFieldBuilder()
          .addBuilder(com.google.cloud.vision.v1p3beta1.AnnotateImageRequest.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Individual image annotation requests for this batch.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vision.v1p3beta1.AnnotateImageRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.vision.v1p3beta1.AnnotateImageRequest.Builder addRequestsBuilder(
        int index) {
      return getRequestsFieldBuilder()
          .addBuilder(
              index, com.google.cloud.vision.v1p3beta1.AnnotateImageRequest.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Individual image annotation requests for this batch.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vision.v1p3beta1.AnnotateImageRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public java.util.List<com.google.cloud.vision.v1p3beta1.AnnotateImageRequest.Builder>
        getRequestsBuilderList() {
      return getRequestsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.vision.v1p3beta1.AnnotateImageRequest,
            com.google.cloud.vision.v1p3beta1.AnnotateImageRequest.Builder,
            com.google.cloud.vision.v1p3beta1.AnnotateImageRequestOrBuilder>
        getRequestsFieldBuilder() {
      if (requestsBuilder_ == null) {
        requestsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.vision.v1p3beta1.AnnotateImageRequest,
                com.google.cloud.vision.v1p3beta1.AnnotateImageRequest.Builder,
                com.google.cloud.vision.v1p3beta1.AnnotateImageRequestOrBuilder>(
                requests_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        requests_ = null;
      }
      return requestsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.vision.v1p3beta1.BatchAnnotateImagesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vision.v1p3beta1.BatchAnnotateImagesRequest)
  private static final com.google.cloud.vision.v1p3beta1.BatchAnnotateImagesRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.vision.v1p3beta1.BatchAnnotateImagesRequest();
  }

  public static com.google.cloud.vision.v1p3beta1.BatchAnnotateImagesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchAnnotateImagesRequest> PARSER =
      new com.google.protobuf.AbstractParser<BatchAnnotateImagesRequest>() {
        @java.lang.Override
        public BatchAnnotateImagesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<BatchAnnotateImagesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchAnnotateImagesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vision.v1p3beta1.BatchAnnotateImagesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
