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
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

package com.google.cloudbuild.v1;

/**
 *
 *
 * <pre>
 * An npm package uploaded to Artifact Registry using the NpmPackage
 * directive.
 * </pre>
 *
 * Protobuf type {@code google.devtools.cloudbuild.v1.UploadedNpmPackage}
 */
public final class UploadedNpmPackage extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.cloudbuild.v1.UploadedNpmPackage)
    UploadedNpmPackageOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UploadedNpmPackage.newBuilder() to construct.
  private UploadedNpmPackage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UploadedNpmPackage() {
    uri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UploadedNpmPackage();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloudbuild.v1.Cloudbuild
        .internal_static_google_devtools_cloudbuild_v1_UploadedNpmPackage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloudbuild.v1.Cloudbuild
        .internal_static_google_devtools_cloudbuild_v1_UploadedNpmPackage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloudbuild.v1.UploadedNpmPackage.class,
            com.google.cloudbuild.v1.UploadedNpmPackage.Builder.class);
  }

  public static final int URI_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object uri_ = "";
  /**
   *
   *
   * <pre>
   * URI of the uploaded npm package.
   * </pre>
   *
   * <code>string uri = 1;</code>
   *
   * @return The uri.
   */
  @java.lang.Override
  public java.lang.String getUri() {
    java.lang.Object ref = uri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uri_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * URI of the uploaded npm package.
   * </pre>
   *
   * <code>string uri = 1;</code>
   *
   * @return The bytes for uri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getUriBytes() {
    java.lang.Object ref = uri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      uri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILE_HASHES_FIELD_NUMBER = 2;
  private com.google.cloudbuild.v1.FileHashes fileHashes_;
  /**
   *
   *
   * <pre>
   * Hash types and values of the npm package.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.FileHashes file_hashes = 2;</code>
   *
   * @return Whether the fileHashes field is set.
   */
  @java.lang.Override
  public boolean hasFileHashes() {
    return fileHashes_ != null;
  }
  /**
   *
   *
   * <pre>
   * Hash types and values of the npm package.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.FileHashes file_hashes = 2;</code>
   *
   * @return The fileHashes.
   */
  @java.lang.Override
  public com.google.cloudbuild.v1.FileHashes getFileHashes() {
    return fileHashes_ == null
        ? com.google.cloudbuild.v1.FileHashes.getDefaultInstance()
        : fileHashes_;
  }
  /**
   *
   *
   * <pre>
   * Hash types and values of the npm package.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.FileHashes file_hashes = 2;</code>
   */
  @java.lang.Override
  public com.google.cloudbuild.v1.FileHashesOrBuilder getFileHashesOrBuilder() {
    return fileHashes_ == null
        ? com.google.cloudbuild.v1.FileHashes.getDefaultInstance()
        : fileHashes_;
  }

  public static final int PUSH_TIMING_FIELD_NUMBER = 3;
  private com.google.cloudbuild.v1.TimeSpan pushTiming_;
  /**
   *
   *
   * <pre>
   * Output only. Stores timing information for pushing the specified artifact.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v1.TimeSpan push_timing = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the pushTiming field is set.
   */
  @java.lang.Override
  public boolean hasPushTiming() {
    return pushTiming_ != null;
  }
  /**
   *
   *
   * <pre>
   * Output only. Stores timing information for pushing the specified artifact.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v1.TimeSpan push_timing = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The pushTiming.
   */
  @java.lang.Override
  public com.google.cloudbuild.v1.TimeSpan getPushTiming() {
    return pushTiming_ == null
        ? com.google.cloudbuild.v1.TimeSpan.getDefaultInstance()
        : pushTiming_;
  }
  /**
   *
   *
   * <pre>
   * Output only. Stores timing information for pushing the specified artifact.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v1.TimeSpan push_timing = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.cloudbuild.v1.TimeSpanOrBuilder getPushTimingOrBuilder() {
    return pushTiming_ == null
        ? com.google.cloudbuild.v1.TimeSpan.getDefaultInstance()
        : pushTiming_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, uri_);
    }
    if (fileHashes_ != null) {
      output.writeMessage(2, getFileHashes());
    }
    if (pushTiming_ != null) {
      output.writeMessage(3, getPushTiming());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, uri_);
    }
    if (fileHashes_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getFileHashes());
    }
    if (pushTiming_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getPushTiming());
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
    if (!(obj instanceof com.google.cloudbuild.v1.UploadedNpmPackage)) {
      return super.equals(obj);
    }
    com.google.cloudbuild.v1.UploadedNpmPackage other =
        (com.google.cloudbuild.v1.UploadedNpmPackage) obj;

    if (!getUri().equals(other.getUri())) return false;
    if (hasFileHashes() != other.hasFileHashes()) return false;
    if (hasFileHashes()) {
      if (!getFileHashes().equals(other.getFileHashes())) return false;
    }
    if (hasPushTiming() != other.hasPushTiming()) return false;
    if (hasPushTiming()) {
      if (!getPushTiming().equals(other.getPushTiming())) return false;
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
    hash = (37 * hash) + URI_FIELD_NUMBER;
    hash = (53 * hash) + getUri().hashCode();
    if (hasFileHashes()) {
      hash = (37 * hash) + FILE_HASHES_FIELD_NUMBER;
      hash = (53 * hash) + getFileHashes().hashCode();
    }
    if (hasPushTiming()) {
      hash = (37 * hash) + PUSH_TIMING_FIELD_NUMBER;
      hash = (53 * hash) + getPushTiming().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloudbuild.v1.UploadedNpmPackage parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v1.UploadedNpmPackage parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.UploadedNpmPackage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v1.UploadedNpmPackage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.UploadedNpmPackage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v1.UploadedNpmPackage parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.UploadedNpmPackage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.UploadedNpmPackage parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.UploadedNpmPackage parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.UploadedNpmPackage parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.UploadedNpmPackage parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.UploadedNpmPackage parseFrom(
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

  public static Builder newBuilder(com.google.cloudbuild.v1.UploadedNpmPackage prototype) {
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
   * An npm package uploaded to Artifact Registry using the NpmPackage
   * directive.
   * </pre>
   *
   * Protobuf type {@code google.devtools.cloudbuild.v1.UploadedNpmPackage}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.cloudbuild.v1.UploadedNpmPackage)
      com.google.cloudbuild.v1.UploadedNpmPackageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloudbuild.v1.Cloudbuild
          .internal_static_google_devtools_cloudbuild_v1_UploadedNpmPackage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloudbuild.v1.Cloudbuild
          .internal_static_google_devtools_cloudbuild_v1_UploadedNpmPackage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloudbuild.v1.UploadedNpmPackage.class,
              com.google.cloudbuild.v1.UploadedNpmPackage.Builder.class);
    }

    // Construct using com.google.cloudbuild.v1.UploadedNpmPackage.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      uri_ = "";
      fileHashes_ = null;
      if (fileHashesBuilder_ != null) {
        fileHashesBuilder_.dispose();
        fileHashesBuilder_ = null;
      }
      pushTiming_ = null;
      if (pushTimingBuilder_ != null) {
        pushTimingBuilder_.dispose();
        pushTimingBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloudbuild.v1.Cloudbuild
          .internal_static_google_devtools_cloudbuild_v1_UploadedNpmPackage_descriptor;
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.UploadedNpmPackage getDefaultInstanceForType() {
      return com.google.cloudbuild.v1.UploadedNpmPackage.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.UploadedNpmPackage build() {
      com.google.cloudbuild.v1.UploadedNpmPackage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.UploadedNpmPackage buildPartial() {
      com.google.cloudbuild.v1.UploadedNpmPackage result =
          new com.google.cloudbuild.v1.UploadedNpmPackage(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloudbuild.v1.UploadedNpmPackage result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.uri_ = uri_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.fileHashes_ = fileHashesBuilder_ == null ? fileHashes_ : fileHashesBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.pushTiming_ = pushTimingBuilder_ == null ? pushTiming_ : pushTimingBuilder_.build();
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
      if (other instanceof com.google.cloudbuild.v1.UploadedNpmPackage) {
        return mergeFrom((com.google.cloudbuild.v1.UploadedNpmPackage) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloudbuild.v1.UploadedNpmPackage other) {
      if (other == com.google.cloudbuild.v1.UploadedNpmPackage.getDefaultInstance()) return this;
      if (!other.getUri().isEmpty()) {
        uri_ = other.uri_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasFileHashes()) {
        mergeFileHashes(other.getFileHashes());
      }
      if (other.hasPushTiming()) {
        mergePushTiming(other.getPushTiming());
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
                uri_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getFileHashesFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getPushTimingFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object uri_ = "";
    /**
     *
     *
     * <pre>
     * URI of the uploaded npm package.
     * </pre>
     *
     * <code>string uri = 1;</code>
     *
     * @return The uri.
     */
    public java.lang.String getUri() {
      java.lang.Object ref = uri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * URI of the uploaded npm package.
     * </pre>
     *
     * <code>string uri = 1;</code>
     *
     * @return The bytes for uri.
     */
    public com.google.protobuf.ByteString getUriBytes() {
      java.lang.Object ref = uri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        uri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * URI of the uploaded npm package.
     * </pre>
     *
     * <code>string uri = 1;</code>
     *
     * @param value The uri to set.
     * @return This builder for chaining.
     */
    public Builder setUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      uri_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * URI of the uploaded npm package.
     * </pre>
     *
     * <code>string uri = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUri() {
      uri_ = getDefaultInstance().getUri();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * URI of the uploaded npm package.
     * </pre>
     *
     * <code>string uri = 1;</code>
     *
     * @param value The bytes for uri to set.
     * @return This builder for chaining.
     */
    public Builder setUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      uri_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloudbuild.v1.FileHashes fileHashes_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloudbuild.v1.FileHashes,
            com.google.cloudbuild.v1.FileHashes.Builder,
            com.google.cloudbuild.v1.FileHashesOrBuilder>
        fileHashesBuilder_;
    /**
     *
     *
     * <pre>
     * Hash types and values of the npm package.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.FileHashes file_hashes = 2;</code>
     *
     * @return Whether the fileHashes field is set.
     */
    public boolean hasFileHashes() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Hash types and values of the npm package.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.FileHashes file_hashes = 2;</code>
     *
     * @return The fileHashes.
     */
    public com.google.cloudbuild.v1.FileHashes getFileHashes() {
      if (fileHashesBuilder_ == null) {
        return fileHashes_ == null
            ? com.google.cloudbuild.v1.FileHashes.getDefaultInstance()
            : fileHashes_;
      } else {
        return fileHashesBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Hash types and values of the npm package.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.FileHashes file_hashes = 2;</code>
     */
    public Builder setFileHashes(com.google.cloudbuild.v1.FileHashes value) {
      if (fileHashesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fileHashes_ = value;
      } else {
        fileHashesBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Hash types and values of the npm package.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.FileHashes file_hashes = 2;</code>
     */
    public Builder setFileHashes(com.google.cloudbuild.v1.FileHashes.Builder builderForValue) {
      if (fileHashesBuilder_ == null) {
        fileHashes_ = builderForValue.build();
      } else {
        fileHashesBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Hash types and values of the npm package.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.FileHashes file_hashes = 2;</code>
     */
    public Builder mergeFileHashes(com.google.cloudbuild.v1.FileHashes value) {
      if (fileHashesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && fileHashes_ != null
            && fileHashes_ != com.google.cloudbuild.v1.FileHashes.getDefaultInstance()) {
          getFileHashesBuilder().mergeFrom(value);
        } else {
          fileHashes_ = value;
        }
      } else {
        fileHashesBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Hash types and values of the npm package.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.FileHashes file_hashes = 2;</code>
     */
    public Builder clearFileHashes() {
      bitField0_ = (bitField0_ & ~0x00000002);
      fileHashes_ = null;
      if (fileHashesBuilder_ != null) {
        fileHashesBuilder_.dispose();
        fileHashesBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Hash types and values of the npm package.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.FileHashes file_hashes = 2;</code>
     */
    public com.google.cloudbuild.v1.FileHashes.Builder getFileHashesBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getFileHashesFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Hash types and values of the npm package.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.FileHashes file_hashes = 2;</code>
     */
    public com.google.cloudbuild.v1.FileHashesOrBuilder getFileHashesOrBuilder() {
      if (fileHashesBuilder_ != null) {
        return fileHashesBuilder_.getMessageOrBuilder();
      } else {
        return fileHashes_ == null
            ? com.google.cloudbuild.v1.FileHashes.getDefaultInstance()
            : fileHashes_;
      }
    }
    /**
     *
     *
     * <pre>
     * Hash types and values of the npm package.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.FileHashes file_hashes = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloudbuild.v1.FileHashes,
            com.google.cloudbuild.v1.FileHashes.Builder,
            com.google.cloudbuild.v1.FileHashesOrBuilder>
        getFileHashesFieldBuilder() {
      if (fileHashesBuilder_ == null) {
        fileHashesBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloudbuild.v1.FileHashes,
                com.google.cloudbuild.v1.FileHashes.Builder,
                com.google.cloudbuild.v1.FileHashesOrBuilder>(
                getFileHashes(), getParentForChildren(), isClean());
        fileHashes_ = null;
      }
      return fileHashesBuilder_;
    }

    private com.google.cloudbuild.v1.TimeSpan pushTiming_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloudbuild.v1.TimeSpan,
            com.google.cloudbuild.v1.TimeSpan.Builder,
            com.google.cloudbuild.v1.TimeSpanOrBuilder>
        pushTimingBuilder_;
    /**
     *
     *
     * <pre>
     * Output only. Stores timing information for pushing the specified artifact.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v1.TimeSpan push_timing = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return Whether the pushTiming field is set.
     */
    public boolean hasPushTiming() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Output only. Stores timing information for pushing the specified artifact.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v1.TimeSpan push_timing = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The pushTiming.
     */
    public com.google.cloudbuild.v1.TimeSpan getPushTiming() {
      if (pushTimingBuilder_ == null) {
        return pushTiming_ == null
            ? com.google.cloudbuild.v1.TimeSpan.getDefaultInstance()
            : pushTiming_;
      } else {
        return pushTimingBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Stores timing information for pushing the specified artifact.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v1.TimeSpan push_timing = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setPushTiming(com.google.cloudbuild.v1.TimeSpan value) {
      if (pushTimingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pushTiming_ = value;
      } else {
        pushTimingBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Stores timing information for pushing the specified artifact.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v1.TimeSpan push_timing = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setPushTiming(com.google.cloudbuild.v1.TimeSpan.Builder builderForValue) {
      if (pushTimingBuilder_ == null) {
        pushTiming_ = builderForValue.build();
      } else {
        pushTimingBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Stores timing information for pushing the specified artifact.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v1.TimeSpan push_timing = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder mergePushTiming(com.google.cloudbuild.v1.TimeSpan value) {
      if (pushTimingBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && pushTiming_ != null
            && pushTiming_ != com.google.cloudbuild.v1.TimeSpan.getDefaultInstance()) {
          getPushTimingBuilder().mergeFrom(value);
        } else {
          pushTiming_ = value;
        }
      } else {
        pushTimingBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Stores timing information for pushing the specified artifact.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v1.TimeSpan push_timing = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder clearPushTiming() {
      bitField0_ = (bitField0_ & ~0x00000004);
      pushTiming_ = null;
      if (pushTimingBuilder_ != null) {
        pushTimingBuilder_.dispose();
        pushTimingBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Stores timing information for pushing the specified artifact.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v1.TimeSpan push_timing = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloudbuild.v1.TimeSpan.Builder getPushTimingBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getPushTimingFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Output only. Stores timing information for pushing the specified artifact.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v1.TimeSpan push_timing = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloudbuild.v1.TimeSpanOrBuilder getPushTimingOrBuilder() {
      if (pushTimingBuilder_ != null) {
        return pushTimingBuilder_.getMessageOrBuilder();
      } else {
        return pushTiming_ == null
            ? com.google.cloudbuild.v1.TimeSpan.getDefaultInstance()
            : pushTiming_;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Stores timing information for pushing the specified artifact.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v1.TimeSpan push_timing = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloudbuild.v1.TimeSpan,
            com.google.cloudbuild.v1.TimeSpan.Builder,
            com.google.cloudbuild.v1.TimeSpanOrBuilder>
        getPushTimingFieldBuilder() {
      if (pushTimingBuilder_ == null) {
        pushTimingBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloudbuild.v1.TimeSpan,
                com.google.cloudbuild.v1.TimeSpan.Builder,
                com.google.cloudbuild.v1.TimeSpanOrBuilder>(
                getPushTiming(), getParentForChildren(), isClean());
        pushTiming_ = null;
      }
      return pushTimingBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.devtools.cloudbuild.v1.UploadedNpmPackage)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.cloudbuild.v1.UploadedNpmPackage)
  private static final com.google.cloudbuild.v1.UploadedNpmPackage DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloudbuild.v1.UploadedNpmPackage();
  }

  public static com.google.cloudbuild.v1.UploadedNpmPackage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UploadedNpmPackage> PARSER =
      new com.google.protobuf.AbstractParser<UploadedNpmPackage>() {
        @java.lang.Override
        public UploadedNpmPackage parsePartialFrom(
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

  public static com.google.protobuf.Parser<UploadedNpmPackage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UploadedNpmPackage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloudbuild.v1.UploadedNpmPackage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
