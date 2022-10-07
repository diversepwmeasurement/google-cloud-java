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
// source: google/cloud/datacatalog/v1beta1/policytagmanagerserialization.proto

package com.google.cloud.datacatalog.v1beta1;

/**
 *
 *
 * <pre>
 * Request message for
 * [ImportTaxonomies][google.cloud.datacatalog.v1beta1.PolicyTagManagerSerialization.ImportTaxonomies].
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1beta1.ImportTaxonomiesRequest}
 */
public final class ImportTaxonomiesRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1beta1.ImportTaxonomiesRequest)
    ImportTaxonomiesRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ImportTaxonomiesRequest.newBuilder() to construct.
  private ImportTaxonomiesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ImportTaxonomiesRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ImportTaxonomiesRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datacatalog.v1beta1.PolicyTagManagerSerializationProto
        .internal_static_google_cloud_datacatalog_v1beta1_ImportTaxonomiesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1beta1.PolicyTagManagerSerializationProto
        .internal_static_google_cloud_datacatalog_v1beta1_ImportTaxonomiesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1beta1.ImportTaxonomiesRequest.class,
            com.google.cloud.datacatalog.v1beta1.ImportTaxonomiesRequest.Builder.class);
  }

  private int sourceCase_ = 0;
  private java.lang.Object source_;

  public enum SourceCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    INLINE_SOURCE(2),
    SOURCE_NOT_SET(0);
    private final int value;

    private SourceCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SourceCase valueOf(int value) {
      return forNumber(value);
    }

    public static SourceCase forNumber(int value) {
      switch (value) {
        case 2:
          return INLINE_SOURCE;
        case 0:
          return SOURCE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public SourceCase getSourceCase() {
    return SourceCase.forNumber(sourceCase_);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. Resource name of project that the newly created taxonomies will
   * belong to.
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
   * Required. Resource name of project that the newly created taxonomies will
   * belong to.
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

  public static final int INLINE_SOURCE_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * Inline source used for taxonomies import
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.InlineSource inline_source = 2;</code>
   *
   * @return Whether the inlineSource field is set.
   */
  @java.lang.Override
  public boolean hasInlineSource() {
    return sourceCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * Inline source used for taxonomies import
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.InlineSource inline_source = 2;</code>
   *
   * @return The inlineSource.
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1beta1.InlineSource getInlineSource() {
    if (sourceCase_ == 2) {
      return (com.google.cloud.datacatalog.v1beta1.InlineSource) source_;
    }
    return com.google.cloud.datacatalog.v1beta1.InlineSource.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Inline source used for taxonomies import
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.InlineSource inline_source = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1beta1.InlineSourceOrBuilder getInlineSourceOrBuilder() {
    if (sourceCase_ == 2) {
      return (com.google.cloud.datacatalog.v1beta1.InlineSource) source_;
    }
    return com.google.cloud.datacatalog.v1beta1.InlineSource.getDefaultInstance();
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
    if (sourceCase_ == 2) {
      output.writeMessage(2, (com.google.cloud.datacatalog.v1beta1.InlineSource) source_);
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
    if (sourceCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, (com.google.cloud.datacatalog.v1beta1.InlineSource) source_);
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
    if (!(obj instanceof com.google.cloud.datacatalog.v1beta1.ImportTaxonomiesRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1beta1.ImportTaxonomiesRequest other =
        (com.google.cloud.datacatalog.v1beta1.ImportTaxonomiesRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getSourceCase().equals(other.getSourceCase())) return false;
    switch (sourceCase_) {
      case 2:
        if (!getInlineSource().equals(other.getInlineSource())) return false;
        break;
      case 0:
      default:
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
    switch (sourceCase_) {
      case 2:
        hash = (37 * hash) + INLINE_SOURCE_FIELD_NUMBER;
        hash = (53 * hash) + getInlineSource().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1beta1.ImportTaxonomiesRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1beta1.ImportTaxonomiesRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.ImportTaxonomiesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1beta1.ImportTaxonomiesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.ImportTaxonomiesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1beta1.ImportTaxonomiesRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.ImportTaxonomiesRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1beta1.ImportTaxonomiesRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.ImportTaxonomiesRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1beta1.ImportTaxonomiesRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.ImportTaxonomiesRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1beta1.ImportTaxonomiesRequest parseFrom(
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
      com.google.cloud.datacatalog.v1beta1.ImportTaxonomiesRequest prototype) {
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
   * [ImportTaxonomies][google.cloud.datacatalog.v1beta1.PolicyTagManagerSerialization.ImportTaxonomies].
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1beta1.ImportTaxonomiesRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1beta1.ImportTaxonomiesRequest)
      com.google.cloud.datacatalog.v1beta1.ImportTaxonomiesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datacatalog.v1beta1.PolicyTagManagerSerializationProto
          .internal_static_google_cloud_datacatalog_v1beta1_ImportTaxonomiesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1beta1.PolicyTagManagerSerializationProto
          .internal_static_google_cloud_datacatalog_v1beta1_ImportTaxonomiesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1beta1.ImportTaxonomiesRequest.class,
              com.google.cloud.datacatalog.v1beta1.ImportTaxonomiesRequest.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1beta1.ImportTaxonomiesRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (inlineSourceBuilder_ != null) {
        inlineSourceBuilder_.clear();
      }
      sourceCase_ = 0;
      source_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datacatalog.v1beta1.PolicyTagManagerSerializationProto
          .internal_static_google_cloud_datacatalog_v1beta1_ImportTaxonomiesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.ImportTaxonomiesRequest
        getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1beta1.ImportTaxonomiesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.ImportTaxonomiesRequest build() {
      com.google.cloud.datacatalog.v1beta1.ImportTaxonomiesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.ImportTaxonomiesRequest buildPartial() {
      com.google.cloud.datacatalog.v1beta1.ImportTaxonomiesRequest result =
          new com.google.cloud.datacatalog.v1beta1.ImportTaxonomiesRequest(this);
      result.parent_ = parent_;
      if (sourceCase_ == 2) {
        if (inlineSourceBuilder_ == null) {
          result.source_ = source_;
        } else {
          result.source_ = inlineSourceBuilder_.build();
        }
      }
      result.sourceCase_ = sourceCase_;
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
      if (other instanceof com.google.cloud.datacatalog.v1beta1.ImportTaxonomiesRequest) {
        return mergeFrom((com.google.cloud.datacatalog.v1beta1.ImportTaxonomiesRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1beta1.ImportTaxonomiesRequest other) {
      if (other
          == com.google.cloud.datacatalog.v1beta1.ImportTaxonomiesRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      switch (other.getSourceCase()) {
        case INLINE_SOURCE:
          {
            mergeInlineSource(other.getInlineSource());
            break;
          }
        case SOURCE_NOT_SET:
          {
            break;
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
                parent_ = input.readStringRequireUtf8();

                break;
              } // case 10
            case 18:
              {
                input.readMessage(getInlineSourceFieldBuilder().getBuilder(), extensionRegistry);
                sourceCase_ = 2;
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

    private int sourceCase_ = 0;
    private java.lang.Object source_;

    public SourceCase getSourceCase() {
      return SourceCase.forNumber(sourceCase_);
    }

    public Builder clearSource() {
      sourceCase_ = 0;
      source_ = null;
      onChanged();
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. Resource name of project that the newly created taxonomies will
     * belong to.
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
     * Required. Resource name of project that the newly created taxonomies will
     * belong to.
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
     * Required. Resource name of project that the newly created taxonomies will
     * belong to.
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
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Resource name of project that the newly created taxonomies will
     * belong to.
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
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Resource name of project that the newly created taxonomies will
     * belong to.
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
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.v1beta1.InlineSource,
            com.google.cloud.datacatalog.v1beta1.InlineSource.Builder,
            com.google.cloud.datacatalog.v1beta1.InlineSourceOrBuilder>
        inlineSourceBuilder_;
    /**
     *
     *
     * <pre>
     * Inline source used for taxonomies import
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.InlineSource inline_source = 2;</code>
     *
     * @return Whether the inlineSource field is set.
     */
    @java.lang.Override
    public boolean hasInlineSource() {
      return sourceCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * Inline source used for taxonomies import
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.InlineSource inline_source = 2;</code>
     *
     * @return The inlineSource.
     */
    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.InlineSource getInlineSource() {
      if (inlineSourceBuilder_ == null) {
        if (sourceCase_ == 2) {
          return (com.google.cloud.datacatalog.v1beta1.InlineSource) source_;
        }
        return com.google.cloud.datacatalog.v1beta1.InlineSource.getDefaultInstance();
      } else {
        if (sourceCase_ == 2) {
          return inlineSourceBuilder_.getMessage();
        }
        return com.google.cloud.datacatalog.v1beta1.InlineSource.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Inline source used for taxonomies import
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.InlineSource inline_source = 2;</code>
     */
    public Builder setInlineSource(com.google.cloud.datacatalog.v1beta1.InlineSource value) {
      if (inlineSourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        source_ = value;
        onChanged();
      } else {
        inlineSourceBuilder_.setMessage(value);
      }
      sourceCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Inline source used for taxonomies import
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.InlineSource inline_source = 2;</code>
     */
    public Builder setInlineSource(
        com.google.cloud.datacatalog.v1beta1.InlineSource.Builder builderForValue) {
      if (inlineSourceBuilder_ == null) {
        source_ = builderForValue.build();
        onChanged();
      } else {
        inlineSourceBuilder_.setMessage(builderForValue.build());
      }
      sourceCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Inline source used for taxonomies import
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.InlineSource inline_source = 2;</code>
     */
    public Builder mergeInlineSource(com.google.cloud.datacatalog.v1beta1.InlineSource value) {
      if (inlineSourceBuilder_ == null) {
        if (sourceCase_ == 2
            && source_ != com.google.cloud.datacatalog.v1beta1.InlineSource.getDefaultInstance()) {
          source_ =
              com.google.cloud.datacatalog.v1beta1.InlineSource.newBuilder(
                      (com.google.cloud.datacatalog.v1beta1.InlineSource) source_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          source_ = value;
        }
        onChanged();
      } else {
        if (sourceCase_ == 2) {
          inlineSourceBuilder_.mergeFrom(value);
        } else {
          inlineSourceBuilder_.setMessage(value);
        }
      }
      sourceCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Inline source used for taxonomies import
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.InlineSource inline_source = 2;</code>
     */
    public Builder clearInlineSource() {
      if (inlineSourceBuilder_ == null) {
        if (sourceCase_ == 2) {
          sourceCase_ = 0;
          source_ = null;
          onChanged();
        }
      } else {
        if (sourceCase_ == 2) {
          sourceCase_ = 0;
          source_ = null;
        }
        inlineSourceBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Inline source used for taxonomies import
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.InlineSource inline_source = 2;</code>
     */
    public com.google.cloud.datacatalog.v1beta1.InlineSource.Builder getInlineSourceBuilder() {
      return getInlineSourceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Inline source used for taxonomies import
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.InlineSource inline_source = 2;</code>
     */
    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.InlineSourceOrBuilder getInlineSourceOrBuilder() {
      if ((sourceCase_ == 2) && (inlineSourceBuilder_ != null)) {
        return inlineSourceBuilder_.getMessageOrBuilder();
      } else {
        if (sourceCase_ == 2) {
          return (com.google.cloud.datacatalog.v1beta1.InlineSource) source_;
        }
        return com.google.cloud.datacatalog.v1beta1.InlineSource.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Inline source used for taxonomies import
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.InlineSource inline_source = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.v1beta1.InlineSource,
            com.google.cloud.datacatalog.v1beta1.InlineSource.Builder,
            com.google.cloud.datacatalog.v1beta1.InlineSourceOrBuilder>
        getInlineSourceFieldBuilder() {
      if (inlineSourceBuilder_ == null) {
        if (!(sourceCase_ == 2)) {
          source_ = com.google.cloud.datacatalog.v1beta1.InlineSource.getDefaultInstance();
        }
        inlineSourceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.datacatalog.v1beta1.InlineSource,
                com.google.cloud.datacatalog.v1beta1.InlineSource.Builder,
                com.google.cloud.datacatalog.v1beta1.InlineSourceOrBuilder>(
                (com.google.cloud.datacatalog.v1beta1.InlineSource) source_,
                getParentForChildren(),
                isClean());
        source_ = null;
      }
      sourceCase_ = 2;
      onChanged();
      ;
      return inlineSourceBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1beta1.ImportTaxonomiesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1beta1.ImportTaxonomiesRequest)
  private static final com.google.cloud.datacatalog.v1beta1.ImportTaxonomiesRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1beta1.ImportTaxonomiesRequest();
  }

  public static com.google.cloud.datacatalog.v1beta1.ImportTaxonomiesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImportTaxonomiesRequest> PARSER =
      new com.google.protobuf.AbstractParser<ImportTaxonomiesRequest>() {
        @java.lang.Override
        public ImportTaxonomiesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ImportTaxonomiesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImportTaxonomiesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1beta1.ImportTaxonomiesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
