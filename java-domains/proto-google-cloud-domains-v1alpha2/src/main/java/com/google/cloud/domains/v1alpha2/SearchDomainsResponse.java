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
// source: google/cloud/domains/v1alpha2/domains.proto

package com.google.cloud.domains.v1alpha2;

/**
 *
 *
 * <pre>
 * Response for the `SearchDomains` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.domains.v1alpha2.SearchDomainsResponse}
 */
public final class SearchDomainsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.domains.v1alpha2.SearchDomainsResponse)
    SearchDomainsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SearchDomainsResponse.newBuilder() to construct.
  private SearchDomainsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SearchDomainsResponse() {
    registerParameters_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SearchDomainsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.domains.v1alpha2.DomainsProto
        .internal_static_google_cloud_domains_v1alpha2_SearchDomainsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.domains.v1alpha2.DomainsProto
        .internal_static_google_cloud_domains_v1alpha2_SearchDomainsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.domains.v1alpha2.SearchDomainsResponse.class,
            com.google.cloud.domains.v1alpha2.SearchDomainsResponse.Builder.class);
  }

  public static final int REGISTER_PARAMETERS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.domains.v1alpha2.RegisterParameters> registerParameters_;
  /**
   *
   *
   * <pre>
   * Results of the domain name search.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1alpha2.RegisterParameters register_parameters = 1;
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.domains.v1alpha2.RegisterParameters>
      getRegisterParametersList() {
    return registerParameters_;
  }
  /**
   *
   *
   * <pre>
   * Results of the domain name search.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1alpha2.RegisterParameters register_parameters = 1;
   * </code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.domains.v1alpha2.RegisterParametersOrBuilder>
      getRegisterParametersOrBuilderList() {
    return registerParameters_;
  }
  /**
   *
   *
   * <pre>
   * Results of the domain name search.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1alpha2.RegisterParameters register_parameters = 1;
   * </code>
   */
  @java.lang.Override
  public int getRegisterParametersCount() {
    return registerParameters_.size();
  }
  /**
   *
   *
   * <pre>
   * Results of the domain name search.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1alpha2.RegisterParameters register_parameters = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.domains.v1alpha2.RegisterParameters getRegisterParameters(int index) {
    return registerParameters_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Results of the domain name search.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1alpha2.RegisterParameters register_parameters = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.domains.v1alpha2.RegisterParametersOrBuilder
      getRegisterParametersOrBuilder(int index) {
    return registerParameters_.get(index);
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
    for (int i = 0; i < registerParameters_.size(); i++) {
      output.writeMessage(1, registerParameters_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < registerParameters_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, registerParameters_.get(i));
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
    if (!(obj instanceof com.google.cloud.domains.v1alpha2.SearchDomainsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.domains.v1alpha2.SearchDomainsResponse other =
        (com.google.cloud.domains.v1alpha2.SearchDomainsResponse) obj;

    if (!getRegisterParametersList().equals(other.getRegisterParametersList())) return false;
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
    if (getRegisterParametersCount() > 0) {
      hash = (37 * hash) + REGISTER_PARAMETERS_FIELD_NUMBER;
      hash = (53 * hash) + getRegisterParametersList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.domains.v1alpha2.SearchDomainsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.domains.v1alpha2.SearchDomainsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.domains.v1alpha2.SearchDomainsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.domains.v1alpha2.SearchDomainsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.domains.v1alpha2.SearchDomainsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.domains.v1alpha2.SearchDomainsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.domains.v1alpha2.SearchDomainsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.domains.v1alpha2.SearchDomainsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.domains.v1alpha2.SearchDomainsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.domains.v1alpha2.SearchDomainsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.domains.v1alpha2.SearchDomainsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.domains.v1alpha2.SearchDomainsResponse parseFrom(
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
      com.google.cloud.domains.v1alpha2.SearchDomainsResponse prototype) {
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
   * Response for the `SearchDomains` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.domains.v1alpha2.SearchDomainsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.domains.v1alpha2.SearchDomainsResponse)
      com.google.cloud.domains.v1alpha2.SearchDomainsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.domains.v1alpha2.DomainsProto
          .internal_static_google_cloud_domains_v1alpha2_SearchDomainsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.domains.v1alpha2.DomainsProto
          .internal_static_google_cloud_domains_v1alpha2_SearchDomainsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.domains.v1alpha2.SearchDomainsResponse.class,
              com.google.cloud.domains.v1alpha2.SearchDomainsResponse.Builder.class);
    }

    // Construct using com.google.cloud.domains.v1alpha2.SearchDomainsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (registerParametersBuilder_ == null) {
        registerParameters_ = java.util.Collections.emptyList();
      } else {
        registerParameters_ = null;
        registerParametersBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.domains.v1alpha2.DomainsProto
          .internal_static_google_cloud_domains_v1alpha2_SearchDomainsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.domains.v1alpha2.SearchDomainsResponse getDefaultInstanceForType() {
      return com.google.cloud.domains.v1alpha2.SearchDomainsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.domains.v1alpha2.SearchDomainsResponse build() {
      com.google.cloud.domains.v1alpha2.SearchDomainsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.domains.v1alpha2.SearchDomainsResponse buildPartial() {
      com.google.cloud.domains.v1alpha2.SearchDomainsResponse result =
          new com.google.cloud.domains.v1alpha2.SearchDomainsResponse(this);
      int from_bitField0_ = bitField0_;
      if (registerParametersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          registerParameters_ = java.util.Collections.unmodifiableList(registerParameters_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.registerParameters_ = registerParameters_;
      } else {
        result.registerParameters_ = registerParametersBuilder_.build();
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
      if (other instanceof com.google.cloud.domains.v1alpha2.SearchDomainsResponse) {
        return mergeFrom((com.google.cloud.domains.v1alpha2.SearchDomainsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.domains.v1alpha2.SearchDomainsResponse other) {
      if (other == com.google.cloud.domains.v1alpha2.SearchDomainsResponse.getDefaultInstance())
        return this;
      if (registerParametersBuilder_ == null) {
        if (!other.registerParameters_.isEmpty()) {
          if (registerParameters_.isEmpty()) {
            registerParameters_ = other.registerParameters_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRegisterParametersIsMutable();
            registerParameters_.addAll(other.registerParameters_);
          }
          onChanged();
        }
      } else {
        if (!other.registerParameters_.isEmpty()) {
          if (registerParametersBuilder_.isEmpty()) {
            registerParametersBuilder_.dispose();
            registerParametersBuilder_ = null;
            registerParameters_ = other.registerParameters_;
            bitField0_ = (bitField0_ & ~0x00000001);
            registerParametersBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getRegisterParametersFieldBuilder()
                    : null;
          } else {
            registerParametersBuilder_.addAllMessages(other.registerParameters_);
          }
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
                com.google.cloud.domains.v1alpha2.RegisterParameters m =
                    input.readMessage(
                        com.google.cloud.domains.v1alpha2.RegisterParameters.parser(),
                        extensionRegistry);
                if (registerParametersBuilder_ == null) {
                  ensureRegisterParametersIsMutable();
                  registerParameters_.add(m);
                } else {
                  registerParametersBuilder_.addMessage(m);
                }
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

    private java.util.List<com.google.cloud.domains.v1alpha2.RegisterParameters>
        registerParameters_ = java.util.Collections.emptyList();

    private void ensureRegisterParametersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        registerParameters_ =
            new java.util.ArrayList<com.google.cloud.domains.v1alpha2.RegisterParameters>(
                registerParameters_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.domains.v1alpha2.RegisterParameters,
            com.google.cloud.domains.v1alpha2.RegisterParameters.Builder,
            com.google.cloud.domains.v1alpha2.RegisterParametersOrBuilder>
        registerParametersBuilder_;

    /**
     *
     *
     * <pre>
     * Results of the domain name search.
     * </pre>
     *
     * <code>repeated .google.cloud.domains.v1alpha2.RegisterParameters register_parameters = 1;
     * </code>
     */
    public java.util.List<com.google.cloud.domains.v1alpha2.RegisterParameters>
        getRegisterParametersList() {
      if (registerParametersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(registerParameters_);
      } else {
        return registerParametersBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Results of the domain name search.
     * </pre>
     *
     * <code>repeated .google.cloud.domains.v1alpha2.RegisterParameters register_parameters = 1;
     * </code>
     */
    public int getRegisterParametersCount() {
      if (registerParametersBuilder_ == null) {
        return registerParameters_.size();
      } else {
        return registerParametersBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Results of the domain name search.
     * </pre>
     *
     * <code>repeated .google.cloud.domains.v1alpha2.RegisterParameters register_parameters = 1;
     * </code>
     */
    public com.google.cloud.domains.v1alpha2.RegisterParameters getRegisterParameters(int index) {
      if (registerParametersBuilder_ == null) {
        return registerParameters_.get(index);
      } else {
        return registerParametersBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Results of the domain name search.
     * </pre>
     *
     * <code>repeated .google.cloud.domains.v1alpha2.RegisterParameters register_parameters = 1;
     * </code>
     */
    public Builder setRegisterParameters(
        int index, com.google.cloud.domains.v1alpha2.RegisterParameters value) {
      if (registerParametersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRegisterParametersIsMutable();
        registerParameters_.set(index, value);
        onChanged();
      } else {
        registerParametersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Results of the domain name search.
     * </pre>
     *
     * <code>repeated .google.cloud.domains.v1alpha2.RegisterParameters register_parameters = 1;
     * </code>
     */
    public Builder setRegisterParameters(
        int index, com.google.cloud.domains.v1alpha2.RegisterParameters.Builder builderForValue) {
      if (registerParametersBuilder_ == null) {
        ensureRegisterParametersIsMutable();
        registerParameters_.set(index, builderForValue.build());
        onChanged();
      } else {
        registerParametersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Results of the domain name search.
     * </pre>
     *
     * <code>repeated .google.cloud.domains.v1alpha2.RegisterParameters register_parameters = 1;
     * </code>
     */
    public Builder addRegisterParameters(
        com.google.cloud.domains.v1alpha2.RegisterParameters value) {
      if (registerParametersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRegisterParametersIsMutable();
        registerParameters_.add(value);
        onChanged();
      } else {
        registerParametersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Results of the domain name search.
     * </pre>
     *
     * <code>repeated .google.cloud.domains.v1alpha2.RegisterParameters register_parameters = 1;
     * </code>
     */
    public Builder addRegisterParameters(
        int index, com.google.cloud.domains.v1alpha2.RegisterParameters value) {
      if (registerParametersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRegisterParametersIsMutable();
        registerParameters_.add(index, value);
        onChanged();
      } else {
        registerParametersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Results of the domain name search.
     * </pre>
     *
     * <code>repeated .google.cloud.domains.v1alpha2.RegisterParameters register_parameters = 1;
     * </code>
     */
    public Builder addRegisterParameters(
        com.google.cloud.domains.v1alpha2.RegisterParameters.Builder builderForValue) {
      if (registerParametersBuilder_ == null) {
        ensureRegisterParametersIsMutable();
        registerParameters_.add(builderForValue.build());
        onChanged();
      } else {
        registerParametersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Results of the domain name search.
     * </pre>
     *
     * <code>repeated .google.cloud.domains.v1alpha2.RegisterParameters register_parameters = 1;
     * </code>
     */
    public Builder addRegisterParameters(
        int index, com.google.cloud.domains.v1alpha2.RegisterParameters.Builder builderForValue) {
      if (registerParametersBuilder_ == null) {
        ensureRegisterParametersIsMutable();
        registerParameters_.add(index, builderForValue.build());
        onChanged();
      } else {
        registerParametersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Results of the domain name search.
     * </pre>
     *
     * <code>repeated .google.cloud.domains.v1alpha2.RegisterParameters register_parameters = 1;
     * </code>
     */
    public Builder addAllRegisterParameters(
        java.lang.Iterable<? extends com.google.cloud.domains.v1alpha2.RegisterParameters> values) {
      if (registerParametersBuilder_ == null) {
        ensureRegisterParametersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, registerParameters_);
        onChanged();
      } else {
        registerParametersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Results of the domain name search.
     * </pre>
     *
     * <code>repeated .google.cloud.domains.v1alpha2.RegisterParameters register_parameters = 1;
     * </code>
     */
    public Builder clearRegisterParameters() {
      if (registerParametersBuilder_ == null) {
        registerParameters_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        registerParametersBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Results of the domain name search.
     * </pre>
     *
     * <code>repeated .google.cloud.domains.v1alpha2.RegisterParameters register_parameters = 1;
     * </code>
     */
    public Builder removeRegisterParameters(int index) {
      if (registerParametersBuilder_ == null) {
        ensureRegisterParametersIsMutable();
        registerParameters_.remove(index);
        onChanged();
      } else {
        registerParametersBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Results of the domain name search.
     * </pre>
     *
     * <code>repeated .google.cloud.domains.v1alpha2.RegisterParameters register_parameters = 1;
     * </code>
     */
    public com.google.cloud.domains.v1alpha2.RegisterParameters.Builder
        getRegisterParametersBuilder(int index) {
      return getRegisterParametersFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Results of the domain name search.
     * </pre>
     *
     * <code>repeated .google.cloud.domains.v1alpha2.RegisterParameters register_parameters = 1;
     * </code>
     */
    public com.google.cloud.domains.v1alpha2.RegisterParametersOrBuilder
        getRegisterParametersOrBuilder(int index) {
      if (registerParametersBuilder_ == null) {
        return registerParameters_.get(index);
      } else {
        return registerParametersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Results of the domain name search.
     * </pre>
     *
     * <code>repeated .google.cloud.domains.v1alpha2.RegisterParameters register_parameters = 1;
     * </code>
     */
    public java.util.List<? extends com.google.cloud.domains.v1alpha2.RegisterParametersOrBuilder>
        getRegisterParametersOrBuilderList() {
      if (registerParametersBuilder_ != null) {
        return registerParametersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(registerParameters_);
      }
    }
    /**
     *
     *
     * <pre>
     * Results of the domain name search.
     * </pre>
     *
     * <code>repeated .google.cloud.domains.v1alpha2.RegisterParameters register_parameters = 1;
     * </code>
     */
    public com.google.cloud.domains.v1alpha2.RegisterParameters.Builder
        addRegisterParametersBuilder() {
      return getRegisterParametersFieldBuilder()
          .addBuilder(com.google.cloud.domains.v1alpha2.RegisterParameters.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Results of the domain name search.
     * </pre>
     *
     * <code>repeated .google.cloud.domains.v1alpha2.RegisterParameters register_parameters = 1;
     * </code>
     */
    public com.google.cloud.domains.v1alpha2.RegisterParameters.Builder
        addRegisterParametersBuilder(int index) {
      return getRegisterParametersFieldBuilder()
          .addBuilder(
              index, com.google.cloud.domains.v1alpha2.RegisterParameters.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Results of the domain name search.
     * </pre>
     *
     * <code>repeated .google.cloud.domains.v1alpha2.RegisterParameters register_parameters = 1;
     * </code>
     */
    public java.util.List<com.google.cloud.domains.v1alpha2.RegisterParameters.Builder>
        getRegisterParametersBuilderList() {
      return getRegisterParametersFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.domains.v1alpha2.RegisterParameters,
            com.google.cloud.domains.v1alpha2.RegisterParameters.Builder,
            com.google.cloud.domains.v1alpha2.RegisterParametersOrBuilder>
        getRegisterParametersFieldBuilder() {
      if (registerParametersBuilder_ == null) {
        registerParametersBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.domains.v1alpha2.RegisterParameters,
                com.google.cloud.domains.v1alpha2.RegisterParameters.Builder,
                com.google.cloud.domains.v1alpha2.RegisterParametersOrBuilder>(
                registerParameters_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        registerParameters_ = null;
      }
      return registerParametersBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.domains.v1alpha2.SearchDomainsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.domains.v1alpha2.SearchDomainsResponse)
  private static final com.google.cloud.domains.v1alpha2.SearchDomainsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.domains.v1alpha2.SearchDomainsResponse();
  }

  public static com.google.cloud.domains.v1alpha2.SearchDomainsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchDomainsResponse> PARSER =
      new com.google.protobuf.AbstractParser<SearchDomainsResponse>() {
        @java.lang.Override
        public SearchDomainsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<SearchDomainsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchDomainsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.domains.v1alpha2.SearchDomainsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
