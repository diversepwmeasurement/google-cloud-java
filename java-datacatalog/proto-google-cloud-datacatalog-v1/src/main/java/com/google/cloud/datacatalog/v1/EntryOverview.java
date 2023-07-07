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
// source: google/cloud/datacatalog/v1/datacatalog.proto

package com.google.cloud.datacatalog.v1;

/**
 *
 *
 * <pre>
 * Entry overview fields for rich text descriptions of entries.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1.EntryOverview}
 */
public final class EntryOverview extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1.EntryOverview)
    EntryOverviewOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use EntryOverview.newBuilder() to construct.
  private EntryOverview(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private EntryOverview() {
    overview_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new EntryOverview();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datacatalog.v1.Datacatalog
        .internal_static_google_cloud_datacatalog_v1_EntryOverview_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1.Datacatalog
        .internal_static_google_cloud_datacatalog_v1_EntryOverview_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1.EntryOverview.class,
            com.google.cloud.datacatalog.v1.EntryOverview.Builder.class);
  }

  public static final int OVERVIEW_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object overview_ = "";
  /**
   *
   *
   * <pre>
   * Entry overview with support for rich text.
   *
   * The overview must only contain Unicode characters, and should be
   * formatted using HTML.
   * The maximum length is 10 MiB as this value holds HTML descriptions
   * including encoded images. The maximum length of the text without images
   * is 100 KiB.
   * </pre>
   *
   * <code>string overview = 1;</code>
   *
   * @return The overview.
   */
  @java.lang.Override
  public java.lang.String getOverview() {
    java.lang.Object ref = overview_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      overview_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Entry overview with support for rich text.
   *
   * The overview must only contain Unicode characters, and should be
   * formatted using HTML.
   * The maximum length is 10 MiB as this value holds HTML descriptions
   * including encoded images. The maximum length of the text without images
   * is 100 KiB.
   * </pre>
   *
   * <code>string overview = 1;</code>
   *
   * @return The bytes for overview.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getOverviewBytes() {
    java.lang.Object ref = overview_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      overview_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(overview_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, overview_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(overview_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, overview_);
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
    if (!(obj instanceof com.google.cloud.datacatalog.v1.EntryOverview)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1.EntryOverview other =
        (com.google.cloud.datacatalog.v1.EntryOverview) obj;

    if (!getOverview().equals(other.getOverview())) return false;
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
    hash = (37 * hash) + OVERVIEW_FIELD_NUMBER;
    hash = (53 * hash) + getOverview().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1.EntryOverview parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.EntryOverview parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.EntryOverview parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.EntryOverview parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.EntryOverview parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.EntryOverview parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.EntryOverview parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.EntryOverview parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.EntryOverview parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.EntryOverview parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.EntryOverview parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.EntryOverview parseFrom(
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

  public static Builder newBuilder(com.google.cloud.datacatalog.v1.EntryOverview prototype) {
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
   * Entry overview fields for rich text descriptions of entries.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1.EntryOverview}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1.EntryOverview)
      com.google.cloud.datacatalog.v1.EntryOverviewOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datacatalog.v1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1_EntryOverview_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1_EntryOverview_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1.EntryOverview.class,
              com.google.cloud.datacatalog.v1.EntryOverview.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1.EntryOverview.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      overview_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datacatalog.v1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1_EntryOverview_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.EntryOverview getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1.EntryOverview.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.EntryOverview build() {
      com.google.cloud.datacatalog.v1.EntryOverview result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.EntryOverview buildPartial() {
      com.google.cloud.datacatalog.v1.EntryOverview result =
          new com.google.cloud.datacatalog.v1.EntryOverview(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.datacatalog.v1.EntryOverview result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.overview_ = overview_;
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
      if (other instanceof com.google.cloud.datacatalog.v1.EntryOverview) {
        return mergeFrom((com.google.cloud.datacatalog.v1.EntryOverview) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1.EntryOverview other) {
      if (other == com.google.cloud.datacatalog.v1.EntryOverview.getDefaultInstance()) return this;
      if (!other.getOverview().isEmpty()) {
        overview_ = other.overview_;
        bitField0_ |= 0x00000001;
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
                overview_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
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

    private java.lang.Object overview_ = "";
    /**
     *
     *
     * <pre>
     * Entry overview with support for rich text.
     *
     * The overview must only contain Unicode characters, and should be
     * formatted using HTML.
     * The maximum length is 10 MiB as this value holds HTML descriptions
     * including encoded images. The maximum length of the text without images
     * is 100 KiB.
     * </pre>
     *
     * <code>string overview = 1;</code>
     *
     * @return The overview.
     */
    public java.lang.String getOverview() {
      java.lang.Object ref = overview_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        overview_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Entry overview with support for rich text.
     *
     * The overview must only contain Unicode characters, and should be
     * formatted using HTML.
     * The maximum length is 10 MiB as this value holds HTML descriptions
     * including encoded images. The maximum length of the text without images
     * is 100 KiB.
     * </pre>
     *
     * <code>string overview = 1;</code>
     *
     * @return The bytes for overview.
     */
    public com.google.protobuf.ByteString getOverviewBytes() {
      java.lang.Object ref = overview_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        overview_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Entry overview with support for rich text.
     *
     * The overview must only contain Unicode characters, and should be
     * formatted using HTML.
     * The maximum length is 10 MiB as this value holds HTML descriptions
     * including encoded images. The maximum length of the text without images
     * is 100 KiB.
     * </pre>
     *
     * <code>string overview = 1;</code>
     *
     * @param value The overview to set.
     * @return This builder for chaining.
     */
    public Builder setOverview(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      overview_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Entry overview with support for rich text.
     *
     * The overview must only contain Unicode characters, and should be
     * formatted using HTML.
     * The maximum length is 10 MiB as this value holds HTML descriptions
     * including encoded images. The maximum length of the text without images
     * is 100 KiB.
     * </pre>
     *
     * <code>string overview = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOverview() {
      overview_ = getDefaultInstance().getOverview();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Entry overview with support for rich text.
     *
     * The overview must only contain Unicode characters, and should be
     * formatted using HTML.
     * The maximum length is 10 MiB as this value holds HTML descriptions
     * including encoded images. The maximum length of the text without images
     * is 100 KiB.
     * </pre>
     *
     * <code>string overview = 1;</code>
     *
     * @param value The bytes for overview to set.
     * @return This builder for chaining.
     */
    public Builder setOverviewBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      overview_ = value;
      bitField0_ |= 0x00000001;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1.EntryOverview)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1.EntryOverview)
  private static final com.google.cloud.datacatalog.v1.EntryOverview DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1.EntryOverview();
  }

  public static com.google.cloud.datacatalog.v1.EntryOverview getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EntryOverview> PARSER =
      new com.google.protobuf.AbstractParser<EntryOverview>() {
        @java.lang.Override
        public EntryOverview parsePartialFrom(
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

  public static com.google.protobuf.Parser<EntryOverview> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EntryOverview> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1.EntryOverview getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
