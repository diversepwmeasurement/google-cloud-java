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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * A request message for UrlMaps.Validate. See the method description for details.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.ValidateUrlMapRequest}
 */
public final class ValidateUrlMapRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.ValidateUrlMapRequest)
    ValidateUrlMapRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ValidateUrlMapRequest.newBuilder() to construct.
  private ValidateUrlMapRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ValidateUrlMapRequest() {
    project_ = "";
    urlMap_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ValidateUrlMapRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ValidateUrlMapRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 788681826:
            {
              java.lang.String s = input.readStringRequireUtf8();

              urlMap_ = s;
              break;
            }
          case 1019823994:
            {
              com.google.cloud.compute.v1.UrlMapsValidateRequest.Builder subBuilder = null;
              if (urlMapsValidateRequestResource_ != null) {
                subBuilder = urlMapsValidateRequestResource_.toBuilder();
              }
              urlMapsValidateRequestResource_ =
                  input.readMessage(
                      com.google.cloud.compute.v1.UrlMapsValidateRequest.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(urlMapsValidateRequestResource_);
                urlMapsValidateRequestResource_ = subBuilder.buildPartial();
              }

              break;
            }
          case 1820481738:
            {
              java.lang.String s = input.readStringRequireUtf8();

              project_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_ValidateUrlMapRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_ValidateUrlMapRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.ValidateUrlMapRequest.class,
            com.google.cloud.compute.v1.ValidateUrlMapRequest.Builder.class);
  }

  public static final int PROJECT_FIELD_NUMBER = 227560217;
  private volatile java.lang.Object project_;
  /**
   *
   *
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The project.
   */
  @java.lang.Override
  public java.lang.String getProject() {
    java.lang.Object ref = project_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      project_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for project.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getProjectBytes() {
    java.lang.Object ref = project_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      project_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int URL_MAP_FIELD_NUMBER = 98585228;
  private volatile java.lang.Object urlMap_;
  /**
   *
   *
   * <pre>
   * Name of the UrlMap resource to be validated as.
   * </pre>
   *
   * <code>string url_map = 98585228 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The urlMap.
   */
  @java.lang.Override
  public java.lang.String getUrlMap() {
    java.lang.Object ref = urlMap_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      urlMap_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Name of the UrlMap resource to be validated as.
   * </pre>
   *
   * <code>string url_map = 98585228 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for urlMap.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getUrlMapBytes() {
    java.lang.Object ref = urlMap_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      urlMap_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int URL_MAPS_VALIDATE_REQUEST_RESOURCE_FIELD_NUMBER = 127477999;
  private com.google.cloud.compute.v1.UrlMapsValidateRequest urlMapsValidateRequestResource_;
  /**
   *
   *
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.UrlMapsValidateRequest url_maps_validate_request_resource = 127477999 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the urlMapsValidateRequestResource field is set.
   */
  @java.lang.Override
  public boolean hasUrlMapsValidateRequestResource() {
    return urlMapsValidateRequestResource_ != null;
  }
  /**
   *
   *
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.UrlMapsValidateRequest url_maps_validate_request_resource = 127477999 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The urlMapsValidateRequestResource.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.UrlMapsValidateRequest getUrlMapsValidateRequestResource() {
    return urlMapsValidateRequestResource_ == null
        ? com.google.cloud.compute.v1.UrlMapsValidateRequest.getDefaultInstance()
        : urlMapsValidateRequestResource_;
  }
  /**
   *
   *
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.UrlMapsValidateRequest url_maps_validate_request_resource = 127477999 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.UrlMapsValidateRequestOrBuilder
      getUrlMapsValidateRequestResourceOrBuilder() {
    return getUrlMapsValidateRequestResource();
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
    if (!getUrlMapBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 98585228, urlMap_);
    }
    if (urlMapsValidateRequestResource_ != null) {
      output.writeMessage(127477999, getUrlMapsValidateRequestResource());
    }
    if (!getProjectBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 227560217, project_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getUrlMapBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(98585228, urlMap_);
    }
    if (urlMapsValidateRequestResource_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              127477999, getUrlMapsValidateRequestResource());
    }
    if (!getProjectBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(227560217, project_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.compute.v1.ValidateUrlMapRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.ValidateUrlMapRequest other =
        (com.google.cloud.compute.v1.ValidateUrlMapRequest) obj;

    if (!getProject().equals(other.getProject())) return false;
    if (!getUrlMap().equals(other.getUrlMap())) return false;
    if (hasUrlMapsValidateRequestResource() != other.hasUrlMapsValidateRequestResource())
      return false;
    if (hasUrlMapsValidateRequestResource()) {
      if (!getUrlMapsValidateRequestResource().equals(other.getUrlMapsValidateRequestResource()))
        return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PROJECT_FIELD_NUMBER;
    hash = (53 * hash) + getProject().hashCode();
    hash = (37 * hash) + URL_MAP_FIELD_NUMBER;
    hash = (53 * hash) + getUrlMap().hashCode();
    if (hasUrlMapsValidateRequestResource()) {
      hash = (37 * hash) + URL_MAPS_VALIDATE_REQUEST_RESOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getUrlMapsValidateRequestResource().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.ValidateUrlMapRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ValidateUrlMapRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ValidateUrlMapRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ValidateUrlMapRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ValidateUrlMapRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ValidateUrlMapRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ValidateUrlMapRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ValidateUrlMapRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ValidateUrlMapRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ValidateUrlMapRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ValidateUrlMapRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ValidateUrlMapRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.ValidateUrlMapRequest prototype) {
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
   * A request message for UrlMaps.Validate. See the method description for details.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.ValidateUrlMapRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.ValidateUrlMapRequest)
      com.google.cloud.compute.v1.ValidateUrlMapRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ValidateUrlMapRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ValidateUrlMapRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.ValidateUrlMapRequest.class,
              com.google.cloud.compute.v1.ValidateUrlMapRequest.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.ValidateUrlMapRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      project_ = "";

      urlMap_ = "";

      if (urlMapsValidateRequestResourceBuilder_ == null) {
        urlMapsValidateRequestResource_ = null;
      } else {
        urlMapsValidateRequestResource_ = null;
        urlMapsValidateRequestResourceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ValidateUrlMapRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ValidateUrlMapRequest getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.ValidateUrlMapRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ValidateUrlMapRequest build() {
      com.google.cloud.compute.v1.ValidateUrlMapRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ValidateUrlMapRequest buildPartial() {
      com.google.cloud.compute.v1.ValidateUrlMapRequest result =
          new com.google.cloud.compute.v1.ValidateUrlMapRequest(this);
      result.project_ = project_;
      result.urlMap_ = urlMap_;
      if (urlMapsValidateRequestResourceBuilder_ == null) {
        result.urlMapsValidateRequestResource_ = urlMapsValidateRequestResource_;
      } else {
        result.urlMapsValidateRequestResource_ = urlMapsValidateRequestResourceBuilder_.build();
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
      if (other instanceof com.google.cloud.compute.v1.ValidateUrlMapRequest) {
        return mergeFrom((com.google.cloud.compute.v1.ValidateUrlMapRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.ValidateUrlMapRequest other) {
      if (other == com.google.cloud.compute.v1.ValidateUrlMapRequest.getDefaultInstance())
        return this;
      if (!other.getProject().isEmpty()) {
        project_ = other.project_;
        onChanged();
      }
      if (!other.getUrlMap().isEmpty()) {
        urlMap_ = other.urlMap_;
        onChanged();
      }
      if (other.hasUrlMapsValidateRequestResource()) {
        mergeUrlMapsValidateRequestResource(other.getUrlMapsValidateRequestResource());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.compute.v1.ValidateUrlMapRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.compute.v1.ValidateUrlMapRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object project_ = "";
    /**
     *
     *
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The project.
     */
    public java.lang.String getProject() {
      java.lang.Object ref = project_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        project_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for project.
     */
    public com.google.protobuf.ByteString getProjectBytes() {
      java.lang.Object ref = project_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        project_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The project to set.
     * @return This builder for chaining.
     */
    public Builder setProject(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      project_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProject() {

      project_ = getDefaultInstance().getProject();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for project to set.
     * @return This builder for chaining.
     */
    public Builder setProjectBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      project_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object urlMap_ = "";
    /**
     *
     *
     * <pre>
     * Name of the UrlMap resource to be validated as.
     * </pre>
     *
     * <code>string url_map = 98585228 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The urlMap.
     */
    public java.lang.String getUrlMap() {
      java.lang.Object ref = urlMap_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        urlMap_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the UrlMap resource to be validated as.
     * </pre>
     *
     * <code>string url_map = 98585228 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for urlMap.
     */
    public com.google.protobuf.ByteString getUrlMapBytes() {
      java.lang.Object ref = urlMap_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        urlMap_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the UrlMap resource to be validated as.
     * </pre>
     *
     * <code>string url_map = 98585228 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The urlMap to set.
     * @return This builder for chaining.
     */
    public Builder setUrlMap(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      urlMap_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the UrlMap resource to be validated as.
     * </pre>
     *
     * <code>string url_map = 98585228 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUrlMap() {

      urlMap_ = getDefaultInstance().getUrlMap();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the UrlMap resource to be validated as.
     * </pre>
     *
     * <code>string url_map = 98585228 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for urlMap to set.
     * @return This builder for chaining.
     */
    public Builder setUrlMapBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      urlMap_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.compute.v1.UrlMapsValidateRequest urlMapsValidateRequestResource_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.UrlMapsValidateRequest,
            com.google.cloud.compute.v1.UrlMapsValidateRequest.Builder,
            com.google.cloud.compute.v1.UrlMapsValidateRequestOrBuilder>
        urlMapsValidateRequestResourceBuilder_;
    /**
     *
     *
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.UrlMapsValidateRequest url_maps_validate_request_resource = 127477999 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the urlMapsValidateRequestResource field is set.
     */
    public boolean hasUrlMapsValidateRequestResource() {
      return urlMapsValidateRequestResourceBuilder_ != null
          || urlMapsValidateRequestResource_ != null;
    }
    /**
     *
     *
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.UrlMapsValidateRequest url_maps_validate_request_resource = 127477999 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The urlMapsValidateRequestResource.
     */
    public com.google.cloud.compute.v1.UrlMapsValidateRequest getUrlMapsValidateRequestResource() {
      if (urlMapsValidateRequestResourceBuilder_ == null) {
        return urlMapsValidateRequestResource_ == null
            ? com.google.cloud.compute.v1.UrlMapsValidateRequest.getDefaultInstance()
            : urlMapsValidateRequestResource_;
      } else {
        return urlMapsValidateRequestResourceBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.UrlMapsValidateRequest url_maps_validate_request_resource = 127477999 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUrlMapsValidateRequestResource(
        com.google.cloud.compute.v1.UrlMapsValidateRequest value) {
      if (urlMapsValidateRequestResourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        urlMapsValidateRequestResource_ = value;
        onChanged();
      } else {
        urlMapsValidateRequestResourceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.UrlMapsValidateRequest url_maps_validate_request_resource = 127477999 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUrlMapsValidateRequestResource(
        com.google.cloud.compute.v1.UrlMapsValidateRequest.Builder builderForValue) {
      if (urlMapsValidateRequestResourceBuilder_ == null) {
        urlMapsValidateRequestResource_ = builderForValue.build();
        onChanged();
      } else {
        urlMapsValidateRequestResourceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.UrlMapsValidateRequest url_maps_validate_request_resource = 127477999 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeUrlMapsValidateRequestResource(
        com.google.cloud.compute.v1.UrlMapsValidateRequest value) {
      if (urlMapsValidateRequestResourceBuilder_ == null) {
        if (urlMapsValidateRequestResource_ != null) {
          urlMapsValidateRequestResource_ =
              com.google.cloud.compute.v1.UrlMapsValidateRequest.newBuilder(
                      urlMapsValidateRequestResource_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          urlMapsValidateRequestResource_ = value;
        }
        onChanged();
      } else {
        urlMapsValidateRequestResourceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.UrlMapsValidateRequest url_maps_validate_request_resource = 127477999 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearUrlMapsValidateRequestResource() {
      if (urlMapsValidateRequestResourceBuilder_ == null) {
        urlMapsValidateRequestResource_ = null;
        onChanged();
      } else {
        urlMapsValidateRequestResource_ = null;
        urlMapsValidateRequestResourceBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.UrlMapsValidateRequest url_maps_validate_request_resource = 127477999 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.compute.v1.UrlMapsValidateRequest.Builder
        getUrlMapsValidateRequestResourceBuilder() {

      onChanged();
      return getUrlMapsValidateRequestResourceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.UrlMapsValidateRequest url_maps_validate_request_resource = 127477999 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.compute.v1.UrlMapsValidateRequestOrBuilder
        getUrlMapsValidateRequestResourceOrBuilder() {
      if (urlMapsValidateRequestResourceBuilder_ != null) {
        return urlMapsValidateRequestResourceBuilder_.getMessageOrBuilder();
      } else {
        return urlMapsValidateRequestResource_ == null
            ? com.google.cloud.compute.v1.UrlMapsValidateRequest.getDefaultInstance()
            : urlMapsValidateRequestResource_;
      }
    }
    /**
     *
     *
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.UrlMapsValidateRequest url_maps_validate_request_resource = 127477999 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.UrlMapsValidateRequest,
            com.google.cloud.compute.v1.UrlMapsValidateRequest.Builder,
            com.google.cloud.compute.v1.UrlMapsValidateRequestOrBuilder>
        getUrlMapsValidateRequestResourceFieldBuilder() {
      if (urlMapsValidateRequestResourceBuilder_ == null) {
        urlMapsValidateRequestResourceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.compute.v1.UrlMapsValidateRequest,
                com.google.cloud.compute.v1.UrlMapsValidateRequest.Builder,
                com.google.cloud.compute.v1.UrlMapsValidateRequestOrBuilder>(
                getUrlMapsValidateRequestResource(), getParentForChildren(), isClean());
        urlMapsValidateRequestResource_ = null;
      }
      return urlMapsValidateRequestResourceBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.ValidateUrlMapRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.ValidateUrlMapRequest)
  private static final com.google.cloud.compute.v1.ValidateUrlMapRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.ValidateUrlMapRequest();
  }

  public static com.google.cloud.compute.v1.ValidateUrlMapRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ValidateUrlMapRequest> PARSER =
      new com.google.protobuf.AbstractParser<ValidateUrlMapRequest>() {
        @java.lang.Override
        public ValidateUrlMapRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ValidateUrlMapRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ValidateUrlMapRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ValidateUrlMapRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.ValidateUrlMapRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
