/*
 * Copyright 2024 Google LLC
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
// source: google/chat/v1/message.proto

// Protobuf Java Version: 3.25.2
package com.google.chat.v1;

/**
 *
 *
 * <pre>
 * A thread in a Google Chat space. For example usage, see
 * [Start or reply to a message
 * thread](https://developers.google.com/workspace/chat/create-messages#create-message-thread).
 *
 * If you specify a thread when creating a message, you can set the
 * [`messageReplyOption`](https://developers.google.com/workspace/chat/api/reference/rest/v1/spaces.messages/create#messagereplyoption)
 * field to determine what happens if no matching thread is found.
 * </pre>
 *
 * Protobuf type {@code google.chat.v1.Thread}
 */
public final class Thread extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.chat.v1.Thread)
    ThreadOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Thread.newBuilder() to construct.
  private Thread(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Thread() {
    name_ = "";
    threadKey_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Thread();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.chat.v1.MessageProto.internal_static_google_chat_v1_Thread_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.chat.v1.MessageProto.internal_static_google_chat_v1_Thread_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.chat.v1.Thread.class, com.google.chat.v1.Thread.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Output only. Resource name of the thread.
   *
   * Example: `spaces/{space}/threads/{thread}`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. Resource name of the thread.
   *
   * Example: `spaces/{space}/threads/{thread}`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int THREAD_KEY_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object threadKey_ = "";
  /**
   *
   *
   * <pre>
   * Optional. Input for creating or updating a thread. Otherwise, output only.
   * ID for the thread. Supports up to 4000 characters.
   *
   * This ID is unique to the Chat app that sets it. For example, if
   * multiple Chat apps create a message using the same thread key,
   * the messages are posted in different threads. To reply in a
   * thread created by a person or another Chat app, specify the thread `name`
   * field instead.
   * </pre>
   *
   * <code>string thread_key = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The threadKey.
   */
  @java.lang.Override
  public java.lang.String getThreadKey() {
    java.lang.Object ref = threadKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      threadKey_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. Input for creating or updating a thread. Otherwise, output only.
   * ID for the thread. Supports up to 4000 characters.
   *
   * This ID is unique to the Chat app that sets it. For example, if
   * multiple Chat apps create a message using the same thread key,
   * the messages are posted in different threads. To reply in a
   * thread created by a person or another Chat app, specify the thread `name`
   * field instead.
   * </pre>
   *
   * <code>string thread_key = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for threadKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getThreadKeyBytes() {
    java.lang.Object ref = threadKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      threadKey_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(threadKey_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, threadKey_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(threadKey_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, threadKey_);
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
    if (!(obj instanceof com.google.chat.v1.Thread)) {
      return super.equals(obj);
    }
    com.google.chat.v1.Thread other = (com.google.chat.v1.Thread) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getThreadKey().equals(other.getThreadKey())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + THREAD_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getThreadKey().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.chat.v1.Thread parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.chat.v1.Thread parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.chat.v1.Thread parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.chat.v1.Thread parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.chat.v1.Thread parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.chat.v1.Thread parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.chat.v1.Thread parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.chat.v1.Thread parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.chat.v1.Thread parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.chat.v1.Thread parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.chat.v1.Thread parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.chat.v1.Thread parseFrom(
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

  public static Builder newBuilder(com.google.chat.v1.Thread prototype) {
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
   * A thread in a Google Chat space. For example usage, see
   * [Start or reply to a message
   * thread](https://developers.google.com/workspace/chat/create-messages#create-message-thread).
   *
   * If you specify a thread when creating a message, you can set the
   * [`messageReplyOption`](https://developers.google.com/workspace/chat/api/reference/rest/v1/spaces.messages/create#messagereplyoption)
   * field to determine what happens if no matching thread is found.
   * </pre>
   *
   * Protobuf type {@code google.chat.v1.Thread}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.chat.v1.Thread)
      com.google.chat.v1.ThreadOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.chat.v1.MessageProto.internal_static_google_chat_v1_Thread_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.chat.v1.MessageProto
          .internal_static_google_chat_v1_Thread_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.chat.v1.Thread.class, com.google.chat.v1.Thread.Builder.class);
    }

    // Construct using com.google.chat.v1.Thread.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      threadKey_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.chat.v1.MessageProto.internal_static_google_chat_v1_Thread_descriptor;
    }

    @java.lang.Override
    public com.google.chat.v1.Thread getDefaultInstanceForType() {
      return com.google.chat.v1.Thread.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.chat.v1.Thread build() {
      com.google.chat.v1.Thread result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.chat.v1.Thread buildPartial() {
      com.google.chat.v1.Thread result = new com.google.chat.v1.Thread(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.chat.v1.Thread result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.threadKey_ = threadKey_;
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
      if (other instanceof com.google.chat.v1.Thread) {
        return mergeFrom((com.google.chat.v1.Thread) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.chat.v1.Thread other) {
      if (other == com.google.chat.v1.Thread.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getThreadKey().isEmpty()) {
        threadKey_ = other.threadKey_;
        bitField0_ |= 0x00000002;
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 26:
              {
                threadKey_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Output only. Resource name of the thread.
     *
     * Example: `spaces/{space}/threads/{thread}`
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Resource name of the thread.
     *
     * Example: `spaces/{space}/threads/{thread}`
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Resource name of the thread.
     *
     * Example: `spaces/{space}/threads/{thread}`
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Resource name of the thread.
     *
     * Example: `spaces/{space}/threads/{thread}`
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Resource name of the thread.
     *
     * Example: `spaces/{space}/threads/{thread}`
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object threadKey_ = "";
    /**
     *
     *
     * <pre>
     * Optional. Input for creating or updating a thread. Otherwise, output only.
     * ID for the thread. Supports up to 4000 characters.
     *
     * This ID is unique to the Chat app that sets it. For example, if
     * multiple Chat apps create a message using the same thread key,
     * the messages are posted in different threads. To reply in a
     * thread created by a person or another Chat app, specify the thread `name`
     * field instead.
     * </pre>
     *
     * <code>string thread_key = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The threadKey.
     */
    public java.lang.String getThreadKey() {
      java.lang.Object ref = threadKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        threadKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Input for creating or updating a thread. Otherwise, output only.
     * ID for the thread. Supports up to 4000 characters.
     *
     * This ID is unique to the Chat app that sets it. For example, if
     * multiple Chat apps create a message using the same thread key,
     * the messages are posted in different threads. To reply in a
     * thread created by a person or another Chat app, specify the thread `name`
     * field instead.
     * </pre>
     *
     * <code>string thread_key = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for threadKey.
     */
    public com.google.protobuf.ByteString getThreadKeyBytes() {
      java.lang.Object ref = threadKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        threadKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Input for creating or updating a thread. Otherwise, output only.
     * ID for the thread. Supports up to 4000 characters.
     *
     * This ID is unique to the Chat app that sets it. For example, if
     * multiple Chat apps create a message using the same thread key,
     * the messages are posted in different threads. To reply in a
     * thread created by a person or another Chat app, specify the thread `name`
     * field instead.
     * </pre>
     *
     * <code>string thread_key = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The threadKey to set.
     * @return This builder for chaining.
     */
    public Builder setThreadKey(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      threadKey_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Input for creating or updating a thread. Otherwise, output only.
     * ID for the thread. Supports up to 4000 characters.
     *
     * This ID is unique to the Chat app that sets it. For example, if
     * multiple Chat apps create a message using the same thread key,
     * the messages are posted in different threads. To reply in a
     * thread created by a person or another Chat app, specify the thread `name`
     * field instead.
     * </pre>
     *
     * <code>string thread_key = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearThreadKey() {
      threadKey_ = getDefaultInstance().getThreadKey();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Input for creating or updating a thread. Otherwise, output only.
     * ID for the thread. Supports up to 4000 characters.
     *
     * This ID is unique to the Chat app that sets it. For example, if
     * multiple Chat apps create a message using the same thread key,
     * the messages are posted in different threads. To reply in a
     * thread created by a person or another Chat app, specify the thread `name`
     * field instead.
     * </pre>
     *
     * <code>string thread_key = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for threadKey to set.
     * @return This builder for chaining.
     */
    public Builder setThreadKeyBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      threadKey_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.chat.v1.Thread)
  }

  // @@protoc_insertion_point(class_scope:google.chat.v1.Thread)
  private static final com.google.chat.v1.Thread DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.chat.v1.Thread();
  }

  public static com.google.chat.v1.Thread getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Thread> PARSER =
      new com.google.protobuf.AbstractParser<Thread>() {
        @java.lang.Override
        public Thread parsePartialFrom(
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

  public static com.google.protobuf.Parser<Thread> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Thread> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.chat.v1.Thread getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
