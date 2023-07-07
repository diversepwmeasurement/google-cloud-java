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
// source: google/cloud/datacatalog/v1/policytagmanager.proto

package com.google.cloud.datacatalog.v1;

/**
 *
 *
 * <pre>
 * Request message for
 * [UpdateTaxonomy][google.cloud.datacatalog.v1.PolicyTagManager.UpdateTaxonomy].
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1.UpdateTaxonomyRequest}
 */
public final class UpdateTaxonomyRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1.UpdateTaxonomyRequest)
    UpdateTaxonomyRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateTaxonomyRequest.newBuilder() to construct.
  private UpdateTaxonomyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateTaxonomyRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateTaxonomyRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datacatalog.v1.PolicyTagManagerProto
        .internal_static_google_cloud_datacatalog_v1_UpdateTaxonomyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1.PolicyTagManagerProto
        .internal_static_google_cloud_datacatalog_v1_UpdateTaxonomyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1.UpdateTaxonomyRequest.class,
            com.google.cloud.datacatalog.v1.UpdateTaxonomyRequest.Builder.class);
  }

  public static final int TAXONOMY_FIELD_NUMBER = 1;
  private com.google.cloud.datacatalog.v1.Taxonomy taxonomy_;
  /**
   *
   *
   * <pre>
   * The taxonomy to update. You can update only its description, display name,
   * and activated policy types.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.Taxonomy taxonomy = 1;</code>
   *
   * @return Whether the taxonomy field is set.
   */
  @java.lang.Override
  public boolean hasTaxonomy() {
    return taxonomy_ != null;
  }
  /**
   *
   *
   * <pre>
   * The taxonomy to update. You can update only its description, display name,
   * and activated policy types.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.Taxonomy taxonomy = 1;</code>
   *
   * @return The taxonomy.
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.Taxonomy getTaxonomy() {
    return taxonomy_ == null
        ? com.google.cloud.datacatalog.v1.Taxonomy.getDefaultInstance()
        : taxonomy_;
  }
  /**
   *
   *
   * <pre>
   * The taxonomy to update. You can update only its description, display name,
   * and activated policy types.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.Taxonomy taxonomy = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.TaxonomyOrBuilder getTaxonomyOrBuilder() {
    return taxonomy_ == null
        ? com.google.cloud.datacatalog.v1.Taxonomy.getDefaultInstance()
        : taxonomy_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Specifies fields to update. If not set, defaults to all fields you can
   * update.
   *
   * For more information, see [FieldMask]
   * (https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask).
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * Specifies fields to update. If not set, defaults to all fields you can
   * update.
   *
   * For more information, see [FieldMask]
   * (https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask).
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * Specifies fields to update. If not set, defaults to all fields you can
   * update.
   *
   * For more information, see [FieldMask]
   * (https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask).
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
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
    if (taxonomy_ != null) {
      output.writeMessage(1, getTaxonomy());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (taxonomy_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getTaxonomy());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.datacatalog.v1.UpdateTaxonomyRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1.UpdateTaxonomyRequest other =
        (com.google.cloud.datacatalog.v1.UpdateTaxonomyRequest) obj;

    if (hasTaxonomy() != other.hasTaxonomy()) return false;
    if (hasTaxonomy()) {
      if (!getTaxonomy().equals(other.getTaxonomy())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
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
    if (hasTaxonomy()) {
      hash = (37 * hash) + TAXONOMY_FIELD_NUMBER;
      hash = (53 * hash) + getTaxonomy().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1.UpdateTaxonomyRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.UpdateTaxonomyRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.UpdateTaxonomyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.UpdateTaxonomyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.UpdateTaxonomyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.UpdateTaxonomyRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.UpdateTaxonomyRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.UpdateTaxonomyRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.UpdateTaxonomyRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.UpdateTaxonomyRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.UpdateTaxonomyRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.UpdateTaxonomyRequest parseFrom(
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
      com.google.cloud.datacatalog.v1.UpdateTaxonomyRequest prototype) {
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
   * [UpdateTaxonomy][google.cloud.datacatalog.v1.PolicyTagManager.UpdateTaxonomy].
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1.UpdateTaxonomyRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1.UpdateTaxonomyRequest)
      com.google.cloud.datacatalog.v1.UpdateTaxonomyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datacatalog.v1.PolicyTagManagerProto
          .internal_static_google_cloud_datacatalog_v1_UpdateTaxonomyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1.PolicyTagManagerProto
          .internal_static_google_cloud_datacatalog_v1_UpdateTaxonomyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1.UpdateTaxonomyRequest.class,
              com.google.cloud.datacatalog.v1.UpdateTaxonomyRequest.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1.UpdateTaxonomyRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      taxonomy_ = null;
      if (taxonomyBuilder_ != null) {
        taxonomyBuilder_.dispose();
        taxonomyBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datacatalog.v1.PolicyTagManagerProto
          .internal_static_google_cloud_datacatalog_v1_UpdateTaxonomyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.UpdateTaxonomyRequest getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1.UpdateTaxonomyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.UpdateTaxonomyRequest build() {
      com.google.cloud.datacatalog.v1.UpdateTaxonomyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.UpdateTaxonomyRequest buildPartial() {
      com.google.cloud.datacatalog.v1.UpdateTaxonomyRequest result =
          new com.google.cloud.datacatalog.v1.UpdateTaxonomyRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.datacatalog.v1.UpdateTaxonomyRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.taxonomy_ = taxonomyBuilder_ == null ? taxonomy_ : taxonomyBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
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
      if (other instanceof com.google.cloud.datacatalog.v1.UpdateTaxonomyRequest) {
        return mergeFrom((com.google.cloud.datacatalog.v1.UpdateTaxonomyRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1.UpdateTaxonomyRequest other) {
      if (other == com.google.cloud.datacatalog.v1.UpdateTaxonomyRequest.getDefaultInstance())
        return this;
      if (other.hasTaxonomy()) {
        mergeTaxonomy(other.getTaxonomy());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
                input.readMessage(getTaxonomyFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.cloud.datacatalog.v1.Taxonomy taxonomy_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.v1.Taxonomy,
            com.google.cloud.datacatalog.v1.Taxonomy.Builder,
            com.google.cloud.datacatalog.v1.TaxonomyOrBuilder>
        taxonomyBuilder_;
    /**
     *
     *
     * <pre>
     * The taxonomy to update. You can update only its description, display name,
     * and activated policy types.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.Taxonomy taxonomy = 1;</code>
     *
     * @return Whether the taxonomy field is set.
     */
    public boolean hasTaxonomy() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The taxonomy to update. You can update only its description, display name,
     * and activated policy types.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.Taxonomy taxonomy = 1;</code>
     *
     * @return The taxonomy.
     */
    public com.google.cloud.datacatalog.v1.Taxonomy getTaxonomy() {
      if (taxonomyBuilder_ == null) {
        return taxonomy_ == null
            ? com.google.cloud.datacatalog.v1.Taxonomy.getDefaultInstance()
            : taxonomy_;
      } else {
        return taxonomyBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The taxonomy to update. You can update only its description, display name,
     * and activated policy types.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.Taxonomy taxonomy = 1;</code>
     */
    public Builder setTaxonomy(com.google.cloud.datacatalog.v1.Taxonomy value) {
      if (taxonomyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        taxonomy_ = value;
      } else {
        taxonomyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The taxonomy to update. You can update only its description, display name,
     * and activated policy types.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.Taxonomy taxonomy = 1;</code>
     */
    public Builder setTaxonomy(com.google.cloud.datacatalog.v1.Taxonomy.Builder builderForValue) {
      if (taxonomyBuilder_ == null) {
        taxonomy_ = builderForValue.build();
      } else {
        taxonomyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The taxonomy to update. You can update only its description, display name,
     * and activated policy types.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.Taxonomy taxonomy = 1;</code>
     */
    public Builder mergeTaxonomy(com.google.cloud.datacatalog.v1.Taxonomy value) {
      if (taxonomyBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && taxonomy_ != null
            && taxonomy_ != com.google.cloud.datacatalog.v1.Taxonomy.getDefaultInstance()) {
          getTaxonomyBuilder().mergeFrom(value);
        } else {
          taxonomy_ = value;
        }
      } else {
        taxonomyBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The taxonomy to update. You can update only its description, display name,
     * and activated policy types.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.Taxonomy taxonomy = 1;</code>
     */
    public Builder clearTaxonomy() {
      bitField0_ = (bitField0_ & ~0x00000001);
      taxonomy_ = null;
      if (taxonomyBuilder_ != null) {
        taxonomyBuilder_.dispose();
        taxonomyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The taxonomy to update. You can update only its description, display name,
     * and activated policy types.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.Taxonomy taxonomy = 1;</code>
     */
    public com.google.cloud.datacatalog.v1.Taxonomy.Builder getTaxonomyBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTaxonomyFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The taxonomy to update. You can update only its description, display name,
     * and activated policy types.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.Taxonomy taxonomy = 1;</code>
     */
    public com.google.cloud.datacatalog.v1.TaxonomyOrBuilder getTaxonomyOrBuilder() {
      if (taxonomyBuilder_ != null) {
        return taxonomyBuilder_.getMessageOrBuilder();
      } else {
        return taxonomy_ == null
            ? com.google.cloud.datacatalog.v1.Taxonomy.getDefaultInstance()
            : taxonomy_;
      }
    }
    /**
     *
     *
     * <pre>
     * The taxonomy to update. You can update only its description, display name,
     * and activated policy types.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.Taxonomy taxonomy = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.v1.Taxonomy,
            com.google.cloud.datacatalog.v1.Taxonomy.Builder,
            com.google.cloud.datacatalog.v1.TaxonomyOrBuilder>
        getTaxonomyFieldBuilder() {
      if (taxonomyBuilder_ == null) {
        taxonomyBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.datacatalog.v1.Taxonomy,
                com.google.cloud.datacatalog.v1.Taxonomy.Builder,
                com.google.cloud.datacatalog.v1.TaxonomyOrBuilder>(
                getTaxonomy(), getParentForChildren(), isClean());
        taxonomy_ = null;
      }
      return taxonomyBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * Specifies fields to update. If not set, defaults to all fields you can
     * update.
     *
     * For more information, see [FieldMask]
     * (https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask).
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Specifies fields to update. If not set, defaults to all fields you can
     * update.
     *
     * For more information, see [FieldMask]
     * (https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask).
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Specifies fields to update. If not set, defaults to all fields you can
     * update.
     *
     * For more information, see [FieldMask]
     * (https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask).
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies fields to update. If not set, defaults to all fields you can
     * update.
     *
     * For more information, see [FieldMask]
     * (https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask).
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies fields to update. If not set, defaults to all fields you can
     * update.
     *
     * For more information, see [FieldMask]
     * (https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask).
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && updateMask_ != null
            && updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies fields to update. If not set, defaults to all fields you can
     * update.
     *
     * For more information, see [FieldMask]
     * (https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask).
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies fields to update. If not set, defaults to all fields you can
     * update.
     *
     * For more information, see [FieldMask]
     * (https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask).
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Specifies fields to update. If not set, defaults to all fields you can
     * update.
     *
     * For more information, see [FieldMask]
     * (https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask).
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * Specifies fields to update. If not set, defaults to all fields you can
     * update.
     *
     * For more information, see [FieldMask]
     * (https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask).
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1.UpdateTaxonomyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1.UpdateTaxonomyRequest)
  private static final com.google.cloud.datacatalog.v1.UpdateTaxonomyRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1.UpdateTaxonomyRequest();
  }

  public static com.google.cloud.datacatalog.v1.UpdateTaxonomyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateTaxonomyRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateTaxonomyRequest>() {
        @java.lang.Override
        public UpdateTaxonomyRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateTaxonomyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateTaxonomyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1.UpdateTaxonomyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
