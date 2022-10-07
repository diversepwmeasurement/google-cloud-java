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
// source: google/cloud/resourcemanager/v3/folders.proto

package com.google.cloud.resourcemanager.v3;

/**
 *
 *
 * <pre>
 * The response message for searching folders.
 * </pre>
 *
 * Protobuf type {@code google.cloud.resourcemanager.v3.SearchFoldersResponse}
 */
public final class SearchFoldersResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.resourcemanager.v3.SearchFoldersResponse)
    SearchFoldersResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SearchFoldersResponse.newBuilder() to construct.
  private SearchFoldersResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SearchFoldersResponse() {
    folders_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SearchFoldersResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.resourcemanager.v3.FoldersProto
        .internal_static_google_cloud_resourcemanager_v3_SearchFoldersResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.resourcemanager.v3.FoldersProto
        .internal_static_google_cloud_resourcemanager_v3_SearchFoldersResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.resourcemanager.v3.SearchFoldersResponse.class,
            com.google.cloud.resourcemanager.v3.SearchFoldersResponse.Builder.class);
  }

  public static final int FOLDERS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.resourcemanager.v3.Folder> folders_;
  /**
   *
   *
   * <pre>
   * A possibly paginated folder search results.
   * the specified parent resource.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.Folder folders = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.resourcemanager.v3.Folder> getFoldersList() {
    return folders_;
  }
  /**
   *
   *
   * <pre>
   * A possibly paginated folder search results.
   * the specified parent resource.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.Folder folders = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.resourcemanager.v3.FolderOrBuilder>
      getFoldersOrBuilderList() {
    return folders_;
  }
  /**
   *
   *
   * <pre>
   * A possibly paginated folder search results.
   * the specified parent resource.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.Folder folders = 1;</code>
   */
  @java.lang.Override
  public int getFoldersCount() {
    return folders_.size();
  }
  /**
   *
   *
   * <pre>
   * A possibly paginated folder search results.
   * the specified parent resource.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.Folder folders = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.resourcemanager.v3.Folder getFolders(int index) {
    return folders_.get(index);
  }
  /**
   *
   *
   * <pre>
   * A possibly paginated folder search results.
   * the specified parent resource.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.Folder folders = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.resourcemanager.v3.FolderOrBuilder getFoldersOrBuilder(int index) {
    return folders_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * A pagination token returned from a previous call to `SearchFolders`
   * that indicates from where searching should continue.
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
   * A pagination token returned from a previous call to `SearchFolders`
   * that indicates from where searching should continue.
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
    for (int i = 0; i < folders_.size(); i++) {
      output.writeMessage(1, folders_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < folders_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, folders_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.resourcemanager.v3.SearchFoldersResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.resourcemanager.v3.SearchFoldersResponse other =
        (com.google.cloud.resourcemanager.v3.SearchFoldersResponse) obj;

    if (!getFoldersList().equals(other.getFoldersList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getFoldersCount() > 0) {
      hash = (37 * hash) + FOLDERS_FIELD_NUMBER;
      hash = (53 * hash) + getFoldersList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.resourcemanager.v3.SearchFoldersResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.resourcemanager.v3.SearchFoldersResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.resourcemanager.v3.SearchFoldersResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.resourcemanager.v3.SearchFoldersResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.resourcemanager.v3.SearchFoldersResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.resourcemanager.v3.SearchFoldersResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.resourcemanager.v3.SearchFoldersResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.resourcemanager.v3.SearchFoldersResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.resourcemanager.v3.SearchFoldersResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.resourcemanager.v3.SearchFoldersResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.resourcemanager.v3.SearchFoldersResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.resourcemanager.v3.SearchFoldersResponse parseFrom(
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
      com.google.cloud.resourcemanager.v3.SearchFoldersResponse prototype) {
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
   * The response message for searching folders.
   * </pre>
   *
   * Protobuf type {@code google.cloud.resourcemanager.v3.SearchFoldersResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.resourcemanager.v3.SearchFoldersResponse)
      com.google.cloud.resourcemanager.v3.SearchFoldersResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.resourcemanager.v3.FoldersProto
          .internal_static_google_cloud_resourcemanager_v3_SearchFoldersResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.resourcemanager.v3.FoldersProto
          .internal_static_google_cloud_resourcemanager_v3_SearchFoldersResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.resourcemanager.v3.SearchFoldersResponse.class,
              com.google.cloud.resourcemanager.v3.SearchFoldersResponse.Builder.class);
    }

    // Construct using com.google.cloud.resourcemanager.v3.SearchFoldersResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (foldersBuilder_ == null) {
        folders_ = java.util.Collections.emptyList();
      } else {
        folders_ = null;
        foldersBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.resourcemanager.v3.FoldersProto
          .internal_static_google_cloud_resourcemanager_v3_SearchFoldersResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.resourcemanager.v3.SearchFoldersResponse getDefaultInstanceForType() {
      return com.google.cloud.resourcemanager.v3.SearchFoldersResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.resourcemanager.v3.SearchFoldersResponse build() {
      com.google.cloud.resourcemanager.v3.SearchFoldersResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.resourcemanager.v3.SearchFoldersResponse buildPartial() {
      com.google.cloud.resourcemanager.v3.SearchFoldersResponse result =
          new com.google.cloud.resourcemanager.v3.SearchFoldersResponse(this);
      int from_bitField0_ = bitField0_;
      if (foldersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          folders_ = java.util.Collections.unmodifiableList(folders_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.folders_ = folders_;
      } else {
        result.folders_ = foldersBuilder_.build();
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
      if (other instanceof com.google.cloud.resourcemanager.v3.SearchFoldersResponse) {
        return mergeFrom((com.google.cloud.resourcemanager.v3.SearchFoldersResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.resourcemanager.v3.SearchFoldersResponse other) {
      if (other == com.google.cloud.resourcemanager.v3.SearchFoldersResponse.getDefaultInstance())
        return this;
      if (foldersBuilder_ == null) {
        if (!other.folders_.isEmpty()) {
          if (folders_.isEmpty()) {
            folders_ = other.folders_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFoldersIsMutable();
            folders_.addAll(other.folders_);
          }
          onChanged();
        }
      } else {
        if (!other.folders_.isEmpty()) {
          if (foldersBuilder_.isEmpty()) {
            foldersBuilder_.dispose();
            foldersBuilder_ = null;
            folders_ = other.folders_;
            bitField0_ = (bitField0_ & ~0x00000001);
            foldersBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getFoldersFieldBuilder()
                    : null;
          } else {
            foldersBuilder_.addAllMessages(other.folders_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
                com.google.cloud.resourcemanager.v3.Folder m =
                    input.readMessage(
                        com.google.cloud.resourcemanager.v3.Folder.parser(), extensionRegistry);
                if (foldersBuilder_ == null) {
                  ensureFoldersIsMutable();
                  folders_.add(m);
                } else {
                  foldersBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();

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

    private java.util.List<com.google.cloud.resourcemanager.v3.Folder> folders_ =
        java.util.Collections.emptyList();

    private void ensureFoldersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        folders_ = new java.util.ArrayList<com.google.cloud.resourcemanager.v3.Folder>(folders_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.resourcemanager.v3.Folder,
            com.google.cloud.resourcemanager.v3.Folder.Builder,
            com.google.cloud.resourcemanager.v3.FolderOrBuilder>
        foldersBuilder_;

    /**
     *
     *
     * <pre>
     * A possibly paginated folder search results.
     * the specified parent resource.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.Folder folders = 1;</code>
     */
    public java.util.List<com.google.cloud.resourcemanager.v3.Folder> getFoldersList() {
      if (foldersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(folders_);
      } else {
        return foldersBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * A possibly paginated folder search results.
     * the specified parent resource.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.Folder folders = 1;</code>
     */
    public int getFoldersCount() {
      if (foldersBuilder_ == null) {
        return folders_.size();
      } else {
        return foldersBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * A possibly paginated folder search results.
     * the specified parent resource.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.Folder folders = 1;</code>
     */
    public com.google.cloud.resourcemanager.v3.Folder getFolders(int index) {
      if (foldersBuilder_ == null) {
        return folders_.get(index);
      } else {
        return foldersBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A possibly paginated folder search results.
     * the specified parent resource.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.Folder folders = 1;</code>
     */
    public Builder setFolders(int index, com.google.cloud.resourcemanager.v3.Folder value) {
      if (foldersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFoldersIsMutable();
        folders_.set(index, value);
        onChanged();
      } else {
        foldersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A possibly paginated folder search results.
     * the specified parent resource.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.Folder folders = 1;</code>
     */
    public Builder setFolders(
        int index, com.google.cloud.resourcemanager.v3.Folder.Builder builderForValue) {
      if (foldersBuilder_ == null) {
        ensureFoldersIsMutable();
        folders_.set(index, builderForValue.build());
        onChanged();
      } else {
        foldersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A possibly paginated folder search results.
     * the specified parent resource.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.Folder folders = 1;</code>
     */
    public Builder addFolders(com.google.cloud.resourcemanager.v3.Folder value) {
      if (foldersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFoldersIsMutable();
        folders_.add(value);
        onChanged();
      } else {
        foldersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A possibly paginated folder search results.
     * the specified parent resource.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.Folder folders = 1;</code>
     */
    public Builder addFolders(int index, com.google.cloud.resourcemanager.v3.Folder value) {
      if (foldersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFoldersIsMutable();
        folders_.add(index, value);
        onChanged();
      } else {
        foldersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A possibly paginated folder search results.
     * the specified parent resource.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.Folder folders = 1;</code>
     */
    public Builder addFolders(com.google.cloud.resourcemanager.v3.Folder.Builder builderForValue) {
      if (foldersBuilder_ == null) {
        ensureFoldersIsMutable();
        folders_.add(builderForValue.build());
        onChanged();
      } else {
        foldersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A possibly paginated folder search results.
     * the specified parent resource.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.Folder folders = 1;</code>
     */
    public Builder addFolders(
        int index, com.google.cloud.resourcemanager.v3.Folder.Builder builderForValue) {
      if (foldersBuilder_ == null) {
        ensureFoldersIsMutable();
        folders_.add(index, builderForValue.build());
        onChanged();
      } else {
        foldersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A possibly paginated folder search results.
     * the specified parent resource.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.Folder folders = 1;</code>
     */
    public Builder addAllFolders(
        java.lang.Iterable<? extends com.google.cloud.resourcemanager.v3.Folder> values) {
      if (foldersBuilder_ == null) {
        ensureFoldersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, folders_);
        onChanged();
      } else {
        foldersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A possibly paginated folder search results.
     * the specified parent resource.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.Folder folders = 1;</code>
     */
    public Builder clearFolders() {
      if (foldersBuilder_ == null) {
        folders_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        foldersBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A possibly paginated folder search results.
     * the specified parent resource.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.Folder folders = 1;</code>
     */
    public Builder removeFolders(int index) {
      if (foldersBuilder_ == null) {
        ensureFoldersIsMutable();
        folders_.remove(index);
        onChanged();
      } else {
        foldersBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A possibly paginated folder search results.
     * the specified parent resource.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.Folder folders = 1;</code>
     */
    public com.google.cloud.resourcemanager.v3.Folder.Builder getFoldersBuilder(int index) {
      return getFoldersFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * A possibly paginated folder search results.
     * the specified parent resource.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.Folder folders = 1;</code>
     */
    public com.google.cloud.resourcemanager.v3.FolderOrBuilder getFoldersOrBuilder(int index) {
      if (foldersBuilder_ == null) {
        return folders_.get(index);
      } else {
        return foldersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A possibly paginated folder search results.
     * the specified parent resource.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.Folder folders = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.resourcemanager.v3.FolderOrBuilder>
        getFoldersOrBuilderList() {
      if (foldersBuilder_ != null) {
        return foldersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(folders_);
      }
    }
    /**
     *
     *
     * <pre>
     * A possibly paginated folder search results.
     * the specified parent resource.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.Folder folders = 1;</code>
     */
    public com.google.cloud.resourcemanager.v3.Folder.Builder addFoldersBuilder() {
      return getFoldersFieldBuilder()
          .addBuilder(com.google.cloud.resourcemanager.v3.Folder.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A possibly paginated folder search results.
     * the specified parent resource.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.Folder folders = 1;</code>
     */
    public com.google.cloud.resourcemanager.v3.Folder.Builder addFoldersBuilder(int index) {
      return getFoldersFieldBuilder()
          .addBuilder(index, com.google.cloud.resourcemanager.v3.Folder.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A possibly paginated folder search results.
     * the specified parent resource.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.Folder folders = 1;</code>
     */
    public java.util.List<com.google.cloud.resourcemanager.v3.Folder.Builder>
        getFoldersBuilderList() {
      return getFoldersFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.resourcemanager.v3.Folder,
            com.google.cloud.resourcemanager.v3.Folder.Builder,
            com.google.cloud.resourcemanager.v3.FolderOrBuilder>
        getFoldersFieldBuilder() {
      if (foldersBuilder_ == null) {
        foldersBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.resourcemanager.v3.Folder,
                com.google.cloud.resourcemanager.v3.Folder.Builder,
                com.google.cloud.resourcemanager.v3.FolderOrBuilder>(
                folders_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        folders_ = null;
      }
      return foldersBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A pagination token returned from a previous call to `SearchFolders`
     * that indicates from where searching should continue.
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
     * A pagination token returned from a previous call to `SearchFolders`
     * that indicates from where searching should continue.
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
     * A pagination token returned from a previous call to `SearchFolders`
     * that indicates from where searching should continue.
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
     * A pagination token returned from a previous call to `SearchFolders`
     * that indicates from where searching should continue.
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
     * A pagination token returned from a previous call to `SearchFolders`
     * that indicates from where searching should continue.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.resourcemanager.v3.SearchFoldersResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.resourcemanager.v3.SearchFoldersResponse)
  private static final com.google.cloud.resourcemanager.v3.SearchFoldersResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.resourcemanager.v3.SearchFoldersResponse();
  }

  public static com.google.cloud.resourcemanager.v3.SearchFoldersResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchFoldersResponse> PARSER =
      new com.google.protobuf.AbstractParser<SearchFoldersResponse>() {
        @java.lang.Override
        public SearchFoldersResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<SearchFoldersResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchFoldersResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.resourcemanager.v3.SearchFoldersResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
