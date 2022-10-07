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
// source: google/cloud/talent/v4/event_service.proto

package com.google.cloud.talent.v4;

/**
 *
 *
 * <pre>
 * The report event request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.talent.v4.CreateClientEventRequest}
 */
public final class CreateClientEventRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.talent.v4.CreateClientEventRequest)
    CreateClientEventRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateClientEventRequest.newBuilder() to construct.
  private CreateClientEventRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateClientEventRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateClientEventRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.talent.v4.EventServiceProto
        .internal_static_google_cloud_talent_v4_CreateClientEventRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.talent.v4.EventServiceProto
        .internal_static_google_cloud_talent_v4_CreateClientEventRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.talent.v4.CreateClientEventRequest.class,
            com.google.cloud.talent.v4.CreateClientEventRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. Resource name of the tenant under which the event is created.
   * The format is "projects/{project_id}/tenants/{tenant_id}", for example,
   * "projects/foo/tenants/bar".
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
   * Required. Resource name of the tenant under which the event is created.
   * The format is "projects/{project_id}/tenants/{tenant_id}", for example,
   * "projects/foo/tenants/bar".
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

  public static final int CLIENT_EVENT_FIELD_NUMBER = 2;
  private com.google.cloud.talent.v4.ClientEvent clientEvent_;
  /**
   *
   *
   * <pre>
   * Required. Events issued when end user interacts with customer's application that
   * uses Cloud Talent Solution.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4.ClientEvent client_event = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the clientEvent field is set.
   */
  @java.lang.Override
  public boolean hasClientEvent() {
    return clientEvent_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. Events issued when end user interacts with customer's application that
   * uses Cloud Talent Solution.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4.ClientEvent client_event = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The clientEvent.
   */
  @java.lang.Override
  public com.google.cloud.talent.v4.ClientEvent getClientEvent() {
    return clientEvent_ == null
        ? com.google.cloud.talent.v4.ClientEvent.getDefaultInstance()
        : clientEvent_;
  }
  /**
   *
   *
   * <pre>
   * Required. Events issued when end user interacts with customer's application that
   * uses Cloud Talent Solution.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4.ClientEvent client_event = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.talent.v4.ClientEventOrBuilder getClientEventOrBuilder() {
    return getClientEvent();
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
    if (clientEvent_ != null) {
      output.writeMessage(2, getClientEvent());
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
    if (clientEvent_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getClientEvent());
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
    if (!(obj instanceof com.google.cloud.talent.v4.CreateClientEventRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.talent.v4.CreateClientEventRequest other =
        (com.google.cloud.talent.v4.CreateClientEventRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasClientEvent() != other.hasClientEvent()) return false;
    if (hasClientEvent()) {
      if (!getClientEvent().equals(other.getClientEvent())) return false;
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
    if (hasClientEvent()) {
      hash = (37 * hash) + CLIENT_EVENT_FIELD_NUMBER;
      hash = (53 * hash) + getClientEvent().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.talent.v4.CreateClientEventRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4.CreateClientEventRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4.CreateClientEventRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4.CreateClientEventRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4.CreateClientEventRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4.CreateClientEventRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4.CreateClientEventRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4.CreateClientEventRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4.CreateClientEventRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4.CreateClientEventRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4.CreateClientEventRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4.CreateClientEventRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.talent.v4.CreateClientEventRequest prototype) {
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
   * The report event request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.talent.v4.CreateClientEventRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.talent.v4.CreateClientEventRequest)
      com.google.cloud.talent.v4.CreateClientEventRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.talent.v4.EventServiceProto
          .internal_static_google_cloud_talent_v4_CreateClientEventRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.talent.v4.EventServiceProto
          .internal_static_google_cloud_talent_v4_CreateClientEventRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.talent.v4.CreateClientEventRequest.class,
              com.google.cloud.talent.v4.CreateClientEventRequest.Builder.class);
    }

    // Construct using com.google.cloud.talent.v4.CreateClientEventRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (clientEventBuilder_ == null) {
        clientEvent_ = null;
      } else {
        clientEvent_ = null;
        clientEventBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.talent.v4.EventServiceProto
          .internal_static_google_cloud_talent_v4_CreateClientEventRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4.CreateClientEventRequest getDefaultInstanceForType() {
      return com.google.cloud.talent.v4.CreateClientEventRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.talent.v4.CreateClientEventRequest build() {
      com.google.cloud.talent.v4.CreateClientEventRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4.CreateClientEventRequest buildPartial() {
      com.google.cloud.talent.v4.CreateClientEventRequest result =
          new com.google.cloud.talent.v4.CreateClientEventRequest(this);
      result.parent_ = parent_;
      if (clientEventBuilder_ == null) {
        result.clientEvent_ = clientEvent_;
      } else {
        result.clientEvent_ = clientEventBuilder_.build();
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
      if (other instanceof com.google.cloud.talent.v4.CreateClientEventRequest) {
        return mergeFrom((com.google.cloud.talent.v4.CreateClientEventRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.talent.v4.CreateClientEventRequest other) {
      if (other == com.google.cloud.talent.v4.CreateClientEventRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasClientEvent()) {
        mergeClientEvent(other.getClientEvent());
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
                input.readMessage(getClientEventFieldBuilder().getBuilder(), extensionRegistry);

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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. Resource name of the tenant under which the event is created.
     * The format is "projects/{project_id}/tenants/{tenant_id}", for example,
     * "projects/foo/tenants/bar".
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
     * Required. Resource name of the tenant under which the event is created.
     * The format is "projects/{project_id}/tenants/{tenant_id}", for example,
     * "projects/foo/tenants/bar".
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
     * Required. Resource name of the tenant under which the event is created.
     * The format is "projects/{project_id}/tenants/{tenant_id}", for example,
     * "projects/foo/tenants/bar".
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
     * Required. Resource name of the tenant under which the event is created.
     * The format is "projects/{project_id}/tenants/{tenant_id}", for example,
     * "projects/foo/tenants/bar".
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
     * Required. Resource name of the tenant under which the event is created.
     * The format is "projects/{project_id}/tenants/{tenant_id}", for example,
     * "projects/foo/tenants/bar".
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

    private com.google.cloud.talent.v4.ClientEvent clientEvent_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.talent.v4.ClientEvent,
            com.google.cloud.talent.v4.ClientEvent.Builder,
            com.google.cloud.talent.v4.ClientEventOrBuilder>
        clientEventBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Events issued when end user interacts with customer's application that
     * uses Cloud Talent Solution.
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4.ClientEvent client_event = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the clientEvent field is set.
     */
    public boolean hasClientEvent() {
      return clientEventBuilder_ != null || clientEvent_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. Events issued when end user interacts with customer's application that
     * uses Cloud Talent Solution.
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4.ClientEvent client_event = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The clientEvent.
     */
    public com.google.cloud.talent.v4.ClientEvent getClientEvent() {
      if (clientEventBuilder_ == null) {
        return clientEvent_ == null
            ? com.google.cloud.talent.v4.ClientEvent.getDefaultInstance()
            : clientEvent_;
      } else {
        return clientEventBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Events issued when end user interacts with customer's application that
     * uses Cloud Talent Solution.
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4.ClientEvent client_event = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setClientEvent(com.google.cloud.talent.v4.ClientEvent value) {
      if (clientEventBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        clientEvent_ = value;
        onChanged();
      } else {
        clientEventBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Events issued when end user interacts with customer's application that
     * uses Cloud Talent Solution.
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4.ClientEvent client_event = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setClientEvent(com.google.cloud.talent.v4.ClientEvent.Builder builderForValue) {
      if (clientEventBuilder_ == null) {
        clientEvent_ = builderForValue.build();
        onChanged();
      } else {
        clientEventBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Events issued when end user interacts with customer's application that
     * uses Cloud Talent Solution.
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4.ClientEvent client_event = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeClientEvent(com.google.cloud.talent.v4.ClientEvent value) {
      if (clientEventBuilder_ == null) {
        if (clientEvent_ != null) {
          clientEvent_ =
              com.google.cloud.talent.v4.ClientEvent.newBuilder(clientEvent_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          clientEvent_ = value;
        }
        onChanged();
      } else {
        clientEventBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Events issued when end user interacts with customer's application that
     * uses Cloud Talent Solution.
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4.ClientEvent client_event = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearClientEvent() {
      if (clientEventBuilder_ == null) {
        clientEvent_ = null;
        onChanged();
      } else {
        clientEvent_ = null;
        clientEventBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Events issued when end user interacts with customer's application that
     * uses Cloud Talent Solution.
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4.ClientEvent client_event = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.talent.v4.ClientEvent.Builder getClientEventBuilder() {

      onChanged();
      return getClientEventFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Events issued when end user interacts with customer's application that
     * uses Cloud Talent Solution.
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4.ClientEvent client_event = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.talent.v4.ClientEventOrBuilder getClientEventOrBuilder() {
      if (clientEventBuilder_ != null) {
        return clientEventBuilder_.getMessageOrBuilder();
      } else {
        return clientEvent_ == null
            ? com.google.cloud.talent.v4.ClientEvent.getDefaultInstance()
            : clientEvent_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Events issued when end user interacts with customer's application that
     * uses Cloud Talent Solution.
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4.ClientEvent client_event = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.talent.v4.ClientEvent,
            com.google.cloud.talent.v4.ClientEvent.Builder,
            com.google.cloud.talent.v4.ClientEventOrBuilder>
        getClientEventFieldBuilder() {
      if (clientEventBuilder_ == null) {
        clientEventBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.talent.v4.ClientEvent,
                com.google.cloud.talent.v4.ClientEvent.Builder,
                com.google.cloud.talent.v4.ClientEventOrBuilder>(
                getClientEvent(), getParentForChildren(), isClean());
        clientEvent_ = null;
      }
      return clientEventBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.talent.v4.CreateClientEventRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.talent.v4.CreateClientEventRequest)
  private static final com.google.cloud.talent.v4.CreateClientEventRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.talent.v4.CreateClientEventRequest();
  }

  public static com.google.cloud.talent.v4.CreateClientEventRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateClientEventRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateClientEventRequest>() {
        @java.lang.Override
        public CreateClientEventRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateClientEventRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateClientEventRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.talent.v4.CreateClientEventRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
