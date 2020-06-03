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
// source: google/cloud/accessapproval/v1/accessapproval.proto

package com.google.cloud.accessapproval.v1;

/**
 *
 *
 * <pre>
 * Response to listing of ApprovalRequest objects.
 * </pre>
 *
 * Protobuf type {@code google.cloud.accessapproval.v1.ListApprovalRequestsResponse}
 */
public final class ListApprovalRequestsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.accessapproval.v1.ListApprovalRequestsResponse)
    ListApprovalRequestsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListApprovalRequestsResponse.newBuilder() to construct.
  private ListApprovalRequestsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListApprovalRequestsResponse() {
    approvalRequests_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListApprovalRequestsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListApprovalRequestsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                approvalRequests_ =
                    new java.util.ArrayList<com.google.cloud.accessapproval.v1.ApprovalRequest>();
                mutable_bitField0_ |= 0x00000001;
              }
              approvalRequests_.add(
                  input.readMessage(
                      com.google.cloud.accessapproval.v1.ApprovalRequest.parser(),
                      extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        approvalRequests_ = java.util.Collections.unmodifiableList(approvalRequests_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.accessapproval.v1.AccessApprovalProto
        .internal_static_google_cloud_accessapproval_v1_ListApprovalRequestsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.accessapproval.v1.AccessApprovalProto
        .internal_static_google_cloud_accessapproval_v1_ListApprovalRequestsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse.class,
            com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse.Builder.class);
  }

  public static final int APPROVAL_REQUESTS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.accessapproval.v1.ApprovalRequest> approvalRequests_;
  /**
   *
   *
   * <pre>
   * Approval request details.
   * </pre>
   *
   * <code>repeated .google.cloud.accessapproval.v1.ApprovalRequest approval_requests = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.accessapproval.v1.ApprovalRequest>
      getApprovalRequestsList() {
    return approvalRequests_;
  }
  /**
   *
   *
   * <pre>
   * Approval request details.
   * </pre>
   *
   * <code>repeated .google.cloud.accessapproval.v1.ApprovalRequest approval_requests = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.accessapproval.v1.ApprovalRequestOrBuilder>
      getApprovalRequestsOrBuilderList() {
    return approvalRequests_;
  }
  /**
   *
   *
   * <pre>
   * Approval request details.
   * </pre>
   *
   * <code>repeated .google.cloud.accessapproval.v1.ApprovalRequest approval_requests = 1;</code>
   */
  @java.lang.Override
  public int getApprovalRequestsCount() {
    return approvalRequests_.size();
  }
  /**
   *
   *
   * <pre>
   * Approval request details.
   * </pre>
   *
   * <code>repeated .google.cloud.accessapproval.v1.ApprovalRequest approval_requests = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.accessapproval.v1.ApprovalRequest getApprovalRequests(int index) {
    return approvalRequests_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Approval request details.
   * </pre>
   *
   * <code>repeated .google.cloud.accessapproval.v1.ApprovalRequest approval_requests = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.accessapproval.v1.ApprovalRequestOrBuilder getApprovalRequestsOrBuilder(
      int index) {
    return approvalRequests_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < approvalRequests_.size(); i++) {
      output.writeMessage(1, approvalRequests_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < approvalRequests_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, approvalRequests_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse other =
        (com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse) obj;

    if (!getApprovalRequestsList().equals(other.getApprovalRequestsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getApprovalRequestsCount() > 0) {
      hash = (37 * hash) + APPROVAL_REQUESTS_FIELD_NUMBER;
      hash = (53 * hash) + getApprovalRequestsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse parseFrom(
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
      com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse prototype) {
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
   * Response to listing of ApprovalRequest objects.
   * </pre>
   *
   * Protobuf type {@code google.cloud.accessapproval.v1.ListApprovalRequestsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.accessapproval.v1.ListApprovalRequestsResponse)
      com.google.cloud.accessapproval.v1.ListApprovalRequestsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.accessapproval.v1.AccessApprovalProto
          .internal_static_google_cloud_accessapproval_v1_ListApprovalRequestsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.accessapproval.v1.AccessApprovalProto
          .internal_static_google_cloud_accessapproval_v1_ListApprovalRequestsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse.class,
              com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse.Builder.class);
    }

    // Construct using com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getApprovalRequestsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (approvalRequestsBuilder_ == null) {
        approvalRequests_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        approvalRequestsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.accessapproval.v1.AccessApprovalProto
          .internal_static_google_cloud_accessapproval_v1_ListApprovalRequestsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse build() {
      com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse buildPartial() {
      com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse result =
          new com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse(this);
      int from_bitField0_ = bitField0_;
      if (approvalRequestsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          approvalRequests_ = java.util.Collections.unmodifiableList(approvalRequests_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.approvalRequests_ = approvalRequests_;
      } else {
        result.approvalRequests_ = approvalRequestsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse) {
        return mergeFrom((com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse other) {
      if (other
          == com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse.getDefaultInstance())
        return this;
      if (approvalRequestsBuilder_ == null) {
        if (!other.approvalRequests_.isEmpty()) {
          if (approvalRequests_.isEmpty()) {
            approvalRequests_ = other.approvalRequests_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureApprovalRequestsIsMutable();
            approvalRequests_.addAll(other.approvalRequests_);
          }
          onChanged();
        }
      } else {
        if (!other.approvalRequests_.isEmpty()) {
          if (approvalRequestsBuilder_.isEmpty()) {
            approvalRequestsBuilder_.dispose();
            approvalRequestsBuilder_ = null;
            approvalRequests_ = other.approvalRequests_;
            bitField0_ = (bitField0_ & ~0x00000001);
            approvalRequestsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getApprovalRequestsFieldBuilder()
                    : null;
          } else {
            approvalRequestsBuilder_.addAllMessages(other.approvalRequests_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
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
      com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.accessapproval.v1.ApprovalRequest> approvalRequests_ =
        java.util.Collections.emptyList();

    private void ensureApprovalRequestsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        approvalRequests_ =
            new java.util.ArrayList<com.google.cloud.accessapproval.v1.ApprovalRequest>(
                approvalRequests_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.accessapproval.v1.ApprovalRequest,
            com.google.cloud.accessapproval.v1.ApprovalRequest.Builder,
            com.google.cloud.accessapproval.v1.ApprovalRequestOrBuilder>
        approvalRequestsBuilder_;

    /**
     *
     *
     * <pre>
     * Approval request details.
     * </pre>
     *
     * <code>repeated .google.cloud.accessapproval.v1.ApprovalRequest approval_requests = 1;</code>
     */
    public java.util.List<com.google.cloud.accessapproval.v1.ApprovalRequest>
        getApprovalRequestsList() {
      if (approvalRequestsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(approvalRequests_);
      } else {
        return approvalRequestsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Approval request details.
     * </pre>
     *
     * <code>repeated .google.cloud.accessapproval.v1.ApprovalRequest approval_requests = 1;</code>
     */
    public int getApprovalRequestsCount() {
      if (approvalRequestsBuilder_ == null) {
        return approvalRequests_.size();
      } else {
        return approvalRequestsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Approval request details.
     * </pre>
     *
     * <code>repeated .google.cloud.accessapproval.v1.ApprovalRequest approval_requests = 1;</code>
     */
    public com.google.cloud.accessapproval.v1.ApprovalRequest getApprovalRequests(int index) {
      if (approvalRequestsBuilder_ == null) {
        return approvalRequests_.get(index);
      } else {
        return approvalRequestsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Approval request details.
     * </pre>
     *
     * <code>repeated .google.cloud.accessapproval.v1.ApprovalRequest approval_requests = 1;</code>
     */
    public Builder setApprovalRequests(
        int index, com.google.cloud.accessapproval.v1.ApprovalRequest value) {
      if (approvalRequestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureApprovalRequestsIsMutable();
        approvalRequests_.set(index, value);
        onChanged();
      } else {
        approvalRequestsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Approval request details.
     * </pre>
     *
     * <code>repeated .google.cloud.accessapproval.v1.ApprovalRequest approval_requests = 1;</code>
     */
    public Builder setApprovalRequests(
        int index, com.google.cloud.accessapproval.v1.ApprovalRequest.Builder builderForValue) {
      if (approvalRequestsBuilder_ == null) {
        ensureApprovalRequestsIsMutable();
        approvalRequests_.set(index, builderForValue.build());
        onChanged();
      } else {
        approvalRequestsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Approval request details.
     * </pre>
     *
     * <code>repeated .google.cloud.accessapproval.v1.ApprovalRequest approval_requests = 1;</code>
     */
    public Builder addApprovalRequests(com.google.cloud.accessapproval.v1.ApprovalRequest value) {
      if (approvalRequestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureApprovalRequestsIsMutable();
        approvalRequests_.add(value);
        onChanged();
      } else {
        approvalRequestsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Approval request details.
     * </pre>
     *
     * <code>repeated .google.cloud.accessapproval.v1.ApprovalRequest approval_requests = 1;</code>
     */
    public Builder addApprovalRequests(
        int index, com.google.cloud.accessapproval.v1.ApprovalRequest value) {
      if (approvalRequestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureApprovalRequestsIsMutable();
        approvalRequests_.add(index, value);
        onChanged();
      } else {
        approvalRequestsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Approval request details.
     * </pre>
     *
     * <code>repeated .google.cloud.accessapproval.v1.ApprovalRequest approval_requests = 1;</code>
     */
    public Builder addApprovalRequests(
        com.google.cloud.accessapproval.v1.ApprovalRequest.Builder builderForValue) {
      if (approvalRequestsBuilder_ == null) {
        ensureApprovalRequestsIsMutable();
        approvalRequests_.add(builderForValue.build());
        onChanged();
      } else {
        approvalRequestsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Approval request details.
     * </pre>
     *
     * <code>repeated .google.cloud.accessapproval.v1.ApprovalRequest approval_requests = 1;</code>
     */
    public Builder addApprovalRequests(
        int index, com.google.cloud.accessapproval.v1.ApprovalRequest.Builder builderForValue) {
      if (approvalRequestsBuilder_ == null) {
        ensureApprovalRequestsIsMutable();
        approvalRequests_.add(index, builderForValue.build());
        onChanged();
      } else {
        approvalRequestsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Approval request details.
     * </pre>
     *
     * <code>repeated .google.cloud.accessapproval.v1.ApprovalRequest approval_requests = 1;</code>
     */
    public Builder addAllApprovalRequests(
        java.lang.Iterable<? extends com.google.cloud.accessapproval.v1.ApprovalRequest> values) {
      if (approvalRequestsBuilder_ == null) {
        ensureApprovalRequestsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, approvalRequests_);
        onChanged();
      } else {
        approvalRequestsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Approval request details.
     * </pre>
     *
     * <code>repeated .google.cloud.accessapproval.v1.ApprovalRequest approval_requests = 1;</code>
     */
    public Builder clearApprovalRequests() {
      if (approvalRequestsBuilder_ == null) {
        approvalRequests_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        approvalRequestsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Approval request details.
     * </pre>
     *
     * <code>repeated .google.cloud.accessapproval.v1.ApprovalRequest approval_requests = 1;</code>
     */
    public Builder removeApprovalRequests(int index) {
      if (approvalRequestsBuilder_ == null) {
        ensureApprovalRequestsIsMutable();
        approvalRequests_.remove(index);
        onChanged();
      } else {
        approvalRequestsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Approval request details.
     * </pre>
     *
     * <code>repeated .google.cloud.accessapproval.v1.ApprovalRequest approval_requests = 1;</code>
     */
    public com.google.cloud.accessapproval.v1.ApprovalRequest.Builder getApprovalRequestsBuilder(
        int index) {
      return getApprovalRequestsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Approval request details.
     * </pre>
     *
     * <code>repeated .google.cloud.accessapproval.v1.ApprovalRequest approval_requests = 1;</code>
     */
    public com.google.cloud.accessapproval.v1.ApprovalRequestOrBuilder getApprovalRequestsOrBuilder(
        int index) {
      if (approvalRequestsBuilder_ == null) {
        return approvalRequests_.get(index);
      } else {
        return approvalRequestsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Approval request details.
     * </pre>
     *
     * <code>repeated .google.cloud.accessapproval.v1.ApprovalRequest approval_requests = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.accessapproval.v1.ApprovalRequestOrBuilder>
        getApprovalRequestsOrBuilderList() {
      if (approvalRequestsBuilder_ != null) {
        return approvalRequestsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(approvalRequests_);
      }
    }
    /**
     *
     *
     * <pre>
     * Approval request details.
     * </pre>
     *
     * <code>repeated .google.cloud.accessapproval.v1.ApprovalRequest approval_requests = 1;</code>
     */
    public com.google.cloud.accessapproval.v1.ApprovalRequest.Builder addApprovalRequestsBuilder() {
      return getApprovalRequestsFieldBuilder()
          .addBuilder(com.google.cloud.accessapproval.v1.ApprovalRequest.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Approval request details.
     * </pre>
     *
     * <code>repeated .google.cloud.accessapproval.v1.ApprovalRequest approval_requests = 1;</code>
     */
    public com.google.cloud.accessapproval.v1.ApprovalRequest.Builder addApprovalRequestsBuilder(
        int index) {
      return getApprovalRequestsFieldBuilder()
          .addBuilder(
              index, com.google.cloud.accessapproval.v1.ApprovalRequest.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Approval request details.
     * </pre>
     *
     * <code>repeated .google.cloud.accessapproval.v1.ApprovalRequest approval_requests = 1;</code>
     */
    public java.util.List<com.google.cloud.accessapproval.v1.ApprovalRequest.Builder>
        getApprovalRequestsBuilderList() {
      return getApprovalRequestsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.accessapproval.v1.ApprovalRequest,
            com.google.cloud.accessapproval.v1.ApprovalRequest.Builder,
            com.google.cloud.accessapproval.v1.ApprovalRequestOrBuilder>
        getApprovalRequestsFieldBuilder() {
      if (approvalRequestsBuilder_ == null) {
        approvalRequestsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.accessapproval.v1.ApprovalRequest,
                com.google.cloud.accessapproval.v1.ApprovalRequest.Builder,
                com.google.cloud.accessapproval.v1.ApprovalRequestOrBuilder>(
                approvalRequests_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        approvalRequests_ = null;
      }
      return approvalRequestsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.accessapproval.v1.ListApprovalRequestsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.accessapproval.v1.ListApprovalRequestsResponse)
  private static final com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse();
  }

  public static com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListApprovalRequestsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListApprovalRequestsResponse>() {
        @java.lang.Override
        public ListApprovalRequestsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListApprovalRequestsResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListApprovalRequestsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListApprovalRequestsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
