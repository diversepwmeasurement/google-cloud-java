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
// source: google/cloud/bigquery/dataexchange/v1beta1/dataexchange.proto

package com.google.cloud.bigquery.dataexchange.v1beta1;

/**
 *
 *
 * <pre>
 * Message for requesting the list of data exchanges from projects in an
 * organization and location.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.dataexchange.v1beta1.ListOrgDataExchangesRequest}
 */
public final class ListOrgDataExchangesRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.dataexchange.v1beta1.ListOrgDataExchangesRequest)
    ListOrgDataExchangesRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListOrgDataExchangesRequest.newBuilder() to construct.
  private ListOrgDataExchangesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListOrgDataExchangesRequest() {
    organization_ = "";
    pageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListOrgDataExchangesRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.dataexchange.v1beta1.DataExchangeProto
        .internal_static_google_cloud_bigquery_dataexchange_v1beta1_ListOrgDataExchangesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.dataexchange.v1beta1.DataExchangeProto
        .internal_static_google_cloud_bigquery_dataexchange_v1beta1_ListOrgDataExchangesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.dataexchange.v1beta1.ListOrgDataExchangesRequest.class,
            com.google.cloud.bigquery.dataexchange.v1beta1.ListOrgDataExchangesRequest.Builder
                .class);
  }

  public static final int ORGANIZATION_FIELD_NUMBER = 1;
  private volatile java.lang.Object organization_;
  /**
   *
   *
   * <pre>
   * Required. The organization resource path of the projects containing DataExchanges.
   * e.g. `organizations/myorg/locations/US`.
   * </pre>
   *
   * <code>string organization = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The organization.
   */
  @java.lang.Override
  public java.lang.String getOrganization() {
    java.lang.Object ref = organization_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      organization_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The organization resource path of the projects containing DataExchanges.
   * e.g. `organizations/myorg/locations/US`.
   * </pre>
   *
   * <code>string organization = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for organization.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getOrganizationBytes() {
    java.lang.Object ref = organization_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      organization_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAGE_SIZE_FIELD_NUMBER = 2;
  private int pageSize_;
  /**
   *
   *
   * <pre>
   * The maximum number of results to return in a single response page. Leverage
   * the page tokens to iterate through the entire collection.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   *
   * @return The pageSize.
   */
  @java.lang.Override
  public int getPageSize() {
    return pageSize_;
  }

  public static final int PAGE_TOKEN_FIELD_NUMBER = 3;
  private volatile java.lang.Object pageToken_;
  /**
   *
   *
   * <pre>
   * Page token, returned by a previous call, to request the next page of
   * results.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The pageToken.
   */
  @java.lang.Override
  public java.lang.String getPageToken() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Page token, returned by a previous call, to request the next page of
   * results.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The bytes for pageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPageTokenBytes() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      pageToken_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(organization_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, organization_);
    }
    if (pageSize_ != 0) {
      output.writeInt32(2, pageSize_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, pageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(organization_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, organization_);
    }
    if (pageSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, pageSize_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, pageToken_);
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
    if (!(obj
        instanceof com.google.cloud.bigquery.dataexchange.v1beta1.ListOrgDataExchangesRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.dataexchange.v1beta1.ListOrgDataExchangesRequest other =
        (com.google.cloud.bigquery.dataexchange.v1beta1.ListOrgDataExchangesRequest) obj;

    if (!getOrganization().equals(other.getOrganization())) return false;
    if (getPageSize() != other.getPageSize()) return false;
    if (!getPageToken().equals(other.getPageToken())) return false;
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
    hash = (37 * hash) + ORGANIZATION_FIELD_NUMBER;
    hash = (53 * hash) + getOrganization().hashCode();
    hash = (37 * hash) + PAGE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getPageSize();
    hash = (37 * hash) + PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.ListOrgDataExchangesRequest
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.ListOrgDataExchangesRequest
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.ListOrgDataExchangesRequest
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.ListOrgDataExchangesRequest
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.ListOrgDataExchangesRequest
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.ListOrgDataExchangesRequest
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.ListOrgDataExchangesRequest
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.ListOrgDataExchangesRequest
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.ListOrgDataExchangesRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.ListOrgDataExchangesRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.ListOrgDataExchangesRequest
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.ListOrgDataExchangesRequest
      parseFrom(
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
      com.google.cloud.bigquery.dataexchange.v1beta1.ListOrgDataExchangesRequest prototype) {
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
   * Message for requesting the list of data exchanges from projects in an
   * organization and location.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.dataexchange.v1beta1.ListOrgDataExchangesRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.dataexchange.v1beta1.ListOrgDataExchangesRequest)
      com.google.cloud.bigquery.dataexchange.v1beta1.ListOrgDataExchangesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.dataexchange.v1beta1.DataExchangeProto
          .internal_static_google_cloud_bigquery_dataexchange_v1beta1_ListOrgDataExchangesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.dataexchange.v1beta1.DataExchangeProto
          .internal_static_google_cloud_bigquery_dataexchange_v1beta1_ListOrgDataExchangesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.dataexchange.v1beta1.ListOrgDataExchangesRequest.class,
              com.google.cloud.bigquery.dataexchange.v1beta1.ListOrgDataExchangesRequest.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.bigquery.dataexchange.v1beta1.ListOrgDataExchangesRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      organization_ = "";

      pageSize_ = 0;

      pageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.dataexchange.v1beta1.DataExchangeProto
          .internal_static_google_cloud_bigquery_dataexchange_v1beta1_ListOrgDataExchangesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.dataexchange.v1beta1.ListOrgDataExchangesRequest
        getDefaultInstanceForType() {
      return com.google.cloud.bigquery.dataexchange.v1beta1.ListOrgDataExchangesRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.dataexchange.v1beta1.ListOrgDataExchangesRequest build() {
      com.google.cloud.bigquery.dataexchange.v1beta1.ListOrgDataExchangesRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.dataexchange.v1beta1.ListOrgDataExchangesRequest
        buildPartial() {
      com.google.cloud.bigquery.dataexchange.v1beta1.ListOrgDataExchangesRequest result =
          new com.google.cloud.bigquery.dataexchange.v1beta1.ListOrgDataExchangesRequest(this);
      result.organization_ = organization_;
      result.pageSize_ = pageSize_;
      result.pageToken_ = pageToken_;
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
      if (other
          instanceof com.google.cloud.bigquery.dataexchange.v1beta1.ListOrgDataExchangesRequest) {
        return mergeFrom(
            (com.google.cloud.bigquery.dataexchange.v1beta1.ListOrgDataExchangesRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.bigquery.dataexchange.v1beta1.ListOrgDataExchangesRequest other) {
      if (other
          == com.google.cloud.bigquery.dataexchange.v1beta1.ListOrgDataExchangesRequest
              .getDefaultInstance()) return this;
      if (!other.getOrganization().isEmpty()) {
        organization_ = other.organization_;
        onChanged();
      }
      if (other.getPageSize() != 0) {
        setPageSize(other.getPageSize());
      }
      if (!other.getPageToken().isEmpty()) {
        pageToken_ = other.pageToken_;
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
                organization_ = input.readStringRequireUtf8();

                break;
              } // case 10
            case 16:
              {
                pageSize_ = input.readInt32();

                break;
              } // case 16
            case 26:
              {
                pageToken_ = input.readStringRequireUtf8();

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

    private java.lang.Object organization_ = "";
    /**
     *
     *
     * <pre>
     * Required. The organization resource path of the projects containing DataExchanges.
     * e.g. `organizations/myorg/locations/US`.
     * </pre>
     *
     * <code>string organization = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The organization.
     */
    public java.lang.String getOrganization() {
      java.lang.Object ref = organization_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        organization_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The organization resource path of the projects containing DataExchanges.
     * e.g. `organizations/myorg/locations/US`.
     * </pre>
     *
     * <code>string organization = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for organization.
     */
    public com.google.protobuf.ByteString getOrganizationBytes() {
      java.lang.Object ref = organization_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        organization_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The organization resource path of the projects containing DataExchanges.
     * e.g. `organizations/myorg/locations/US`.
     * </pre>
     *
     * <code>string organization = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The organization to set.
     * @return This builder for chaining.
     */
    public Builder setOrganization(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      organization_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The organization resource path of the projects containing DataExchanges.
     * e.g. `organizations/myorg/locations/US`.
     * </pre>
     *
     * <code>string organization = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOrganization() {

      organization_ = getDefaultInstance().getOrganization();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The organization resource path of the projects containing DataExchanges.
     * e.g. `organizations/myorg/locations/US`.
     * </pre>
     *
     * <code>string organization = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for organization to set.
     * @return This builder for chaining.
     */
    public Builder setOrganizationBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      organization_ = value;
      onChanged();
      return this;
    }

    private int pageSize_;
    /**
     *
     *
     * <pre>
     * The maximum number of results to return in a single response page. Leverage
     * the page tokens to iterate through the entire collection.
     * </pre>
     *
     * <code>int32 page_size = 2;</code>
     *
     * @return The pageSize.
     */
    @java.lang.Override
    public int getPageSize() {
      return pageSize_;
    }
    /**
     *
     *
     * <pre>
     * The maximum number of results to return in a single response page. Leverage
     * the page tokens to iterate through the entire collection.
     * </pre>
     *
     * <code>int32 page_size = 2;</code>
     *
     * @param value The pageSize to set.
     * @return This builder for chaining.
     */
    public Builder setPageSize(int value) {

      pageSize_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The maximum number of results to return in a single response page. Leverage
     * the page tokens to iterate through the entire collection.
     * </pre>
     *
     * <code>int32 page_size = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPageSize() {

      pageSize_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object pageToken_ = "";
    /**
     *
     *
     * <pre>
     * Page token, returned by a previous call, to request the next page of
     * results.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     *
     * @return The pageToken.
     */
    public java.lang.String getPageToken() {
      java.lang.Object ref = pageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Page token, returned by a previous call, to request the next page of
     * results.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     *
     * @return The bytes for pageToken.
     */
    public com.google.protobuf.ByteString getPageTokenBytes() {
      java.lang.Object ref = pageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        pageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Page token, returned by a previous call, to request the next page of
     * results.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     *
     * @param value The pageToken to set.
     * @return This builder for chaining.
     */
    public Builder setPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      pageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Page token, returned by a previous call, to request the next page of
     * results.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPageToken() {

      pageToken_ = getDefaultInstance().getPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Page token, returned by a previous call, to request the next page of
     * results.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     *
     * @param value The bytes for pageToken to set.
     * @return This builder for chaining.
     */
    public Builder setPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      pageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.dataexchange.v1beta1.ListOrgDataExchangesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.dataexchange.v1beta1.ListOrgDataExchangesRequest)
  private static final com.google.cloud.bigquery.dataexchange.v1beta1.ListOrgDataExchangesRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.bigquery.dataexchange.v1beta1.ListOrgDataExchangesRequest();
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.ListOrgDataExchangesRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListOrgDataExchangesRequest> PARSER =
      new com.google.protobuf.AbstractParser<ListOrgDataExchangesRequest>() {
        @java.lang.Override
        public ListOrgDataExchangesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListOrgDataExchangesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListOrgDataExchangesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.dataexchange.v1beta1.ListOrgDataExchangesRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
