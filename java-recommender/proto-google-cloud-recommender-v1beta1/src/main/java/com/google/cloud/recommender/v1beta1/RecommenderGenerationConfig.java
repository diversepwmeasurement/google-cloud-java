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
// source: google/cloud/recommender/v1beta1/recommender_config.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.recommender.v1beta1;

/**
 *
 *
 * <pre>
 * A Configuration to customize the generation of recommendations.
 * Eg, customizing the lookback period considered when generating a
 * recommendation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.recommender.v1beta1.RecommenderGenerationConfig}
 */
public final class RecommenderGenerationConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.recommender.v1beta1.RecommenderGenerationConfig)
    RecommenderGenerationConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RecommenderGenerationConfig.newBuilder() to construct.
  private RecommenderGenerationConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RecommenderGenerationConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RecommenderGenerationConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.recommender.v1beta1.RecommenderConfigProto
        .internal_static_google_cloud_recommender_v1beta1_RecommenderGenerationConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.recommender.v1beta1.RecommenderConfigProto
        .internal_static_google_cloud_recommender_v1beta1_RecommenderGenerationConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.recommender.v1beta1.RecommenderGenerationConfig.class,
            com.google.cloud.recommender.v1beta1.RecommenderGenerationConfig.Builder.class);
  }

  private int bitField0_;
  public static final int PARAMS_FIELD_NUMBER = 1;
  private com.google.protobuf.Struct params_;
  /**
   *
   *
   * <pre>
   * Parameters for this RecommenderGenerationConfig. These configs can be used
   * by or are applied to all subtypes.
   * </pre>
   *
   * <code>.google.protobuf.Struct params = 1;</code>
   *
   * @return Whether the params field is set.
   */
  @java.lang.Override
  public boolean hasParams() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Parameters for this RecommenderGenerationConfig. These configs can be used
   * by or are applied to all subtypes.
   * </pre>
   *
   * <code>.google.protobuf.Struct params = 1;</code>
   *
   * @return The params.
   */
  @java.lang.Override
  public com.google.protobuf.Struct getParams() {
    return params_ == null ? com.google.protobuf.Struct.getDefaultInstance() : params_;
  }
  /**
   *
   *
   * <pre>
   * Parameters for this RecommenderGenerationConfig. These configs can be used
   * by or are applied to all subtypes.
   * </pre>
   *
   * <code>.google.protobuf.Struct params = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StructOrBuilder getParamsOrBuilder() {
    return params_ == null ? com.google.protobuf.Struct.getDefaultInstance() : params_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getParams());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getParams());
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
    if (!(obj instanceof com.google.cloud.recommender.v1beta1.RecommenderGenerationConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.recommender.v1beta1.RecommenderGenerationConfig other =
        (com.google.cloud.recommender.v1beta1.RecommenderGenerationConfig) obj;

    if (hasParams() != other.hasParams()) return false;
    if (hasParams()) {
      if (!getParams().equals(other.getParams())) return false;
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
    if (hasParams()) {
      hash = (37 * hash) + PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + getParams().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.recommender.v1beta1.RecommenderGenerationConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommender.v1beta1.RecommenderGenerationConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1beta1.RecommenderGenerationConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommender.v1beta1.RecommenderGenerationConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1beta1.RecommenderGenerationConfig parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommender.v1beta1.RecommenderGenerationConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1beta1.RecommenderGenerationConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommender.v1beta1.RecommenderGenerationConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1beta1.RecommenderGenerationConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommender.v1beta1.RecommenderGenerationConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1beta1.RecommenderGenerationConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommender.v1beta1.RecommenderGenerationConfig parseFrom(
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
      com.google.cloud.recommender.v1beta1.RecommenderGenerationConfig prototype) {
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
   * A Configuration to customize the generation of recommendations.
   * Eg, customizing the lookback period considered when generating a
   * recommendation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.recommender.v1beta1.RecommenderGenerationConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recommender.v1beta1.RecommenderGenerationConfig)
      com.google.cloud.recommender.v1beta1.RecommenderGenerationConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.recommender.v1beta1.RecommenderConfigProto
          .internal_static_google_cloud_recommender_v1beta1_RecommenderGenerationConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.recommender.v1beta1.RecommenderConfigProto
          .internal_static_google_cloud_recommender_v1beta1_RecommenderGenerationConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.recommender.v1beta1.RecommenderGenerationConfig.class,
              com.google.cloud.recommender.v1beta1.RecommenderGenerationConfig.Builder.class);
    }

    // Construct using com.google.cloud.recommender.v1beta1.RecommenderGenerationConfig.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getParamsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      params_ = null;
      if (paramsBuilder_ != null) {
        paramsBuilder_.dispose();
        paramsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.recommender.v1beta1.RecommenderConfigProto
          .internal_static_google_cloud_recommender_v1beta1_RecommenderGenerationConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.recommender.v1beta1.RecommenderGenerationConfig
        getDefaultInstanceForType() {
      return com.google.cloud.recommender.v1beta1.RecommenderGenerationConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.recommender.v1beta1.RecommenderGenerationConfig build() {
      com.google.cloud.recommender.v1beta1.RecommenderGenerationConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.recommender.v1beta1.RecommenderGenerationConfig buildPartial() {
      com.google.cloud.recommender.v1beta1.RecommenderGenerationConfig result =
          new com.google.cloud.recommender.v1beta1.RecommenderGenerationConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.recommender.v1beta1.RecommenderGenerationConfig result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.params_ = paramsBuilder_ == null ? params_ : paramsBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.recommender.v1beta1.RecommenderGenerationConfig) {
        return mergeFrom((com.google.cloud.recommender.v1beta1.RecommenderGenerationConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.recommender.v1beta1.RecommenderGenerationConfig other) {
      if (other
          == com.google.cloud.recommender.v1beta1.RecommenderGenerationConfig.getDefaultInstance())
        return this;
      if (other.hasParams()) {
        mergeParams(other.getParams());
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
                input.readMessage(getParamsFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.protobuf.Struct params_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Struct,
            com.google.protobuf.Struct.Builder,
            com.google.protobuf.StructOrBuilder>
        paramsBuilder_;
    /**
     *
     *
     * <pre>
     * Parameters for this RecommenderGenerationConfig. These configs can be used
     * by or are applied to all subtypes.
     * </pre>
     *
     * <code>.google.protobuf.Struct params = 1;</code>
     *
     * @return Whether the params field is set.
     */
    public boolean hasParams() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Parameters for this RecommenderGenerationConfig. These configs can be used
     * by or are applied to all subtypes.
     * </pre>
     *
     * <code>.google.protobuf.Struct params = 1;</code>
     *
     * @return The params.
     */
    public com.google.protobuf.Struct getParams() {
      if (paramsBuilder_ == null) {
        return params_ == null ? com.google.protobuf.Struct.getDefaultInstance() : params_;
      } else {
        return paramsBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Parameters for this RecommenderGenerationConfig. These configs can be used
     * by or are applied to all subtypes.
     * </pre>
     *
     * <code>.google.protobuf.Struct params = 1;</code>
     */
    public Builder setParams(com.google.protobuf.Struct value) {
      if (paramsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        params_ = value;
      } else {
        paramsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Parameters for this RecommenderGenerationConfig. These configs can be used
     * by or are applied to all subtypes.
     * </pre>
     *
     * <code>.google.protobuf.Struct params = 1;</code>
     */
    public Builder setParams(com.google.protobuf.Struct.Builder builderForValue) {
      if (paramsBuilder_ == null) {
        params_ = builderForValue.build();
      } else {
        paramsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Parameters for this RecommenderGenerationConfig. These configs can be used
     * by or are applied to all subtypes.
     * </pre>
     *
     * <code>.google.protobuf.Struct params = 1;</code>
     */
    public Builder mergeParams(com.google.protobuf.Struct value) {
      if (paramsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && params_ != null
            && params_ != com.google.protobuf.Struct.getDefaultInstance()) {
          getParamsBuilder().mergeFrom(value);
        } else {
          params_ = value;
        }
      } else {
        paramsBuilder_.mergeFrom(value);
      }
      if (params_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Parameters for this RecommenderGenerationConfig. These configs can be used
     * by or are applied to all subtypes.
     * </pre>
     *
     * <code>.google.protobuf.Struct params = 1;</code>
     */
    public Builder clearParams() {
      bitField0_ = (bitField0_ & ~0x00000001);
      params_ = null;
      if (paramsBuilder_ != null) {
        paramsBuilder_.dispose();
        paramsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Parameters for this RecommenderGenerationConfig. These configs can be used
     * by or are applied to all subtypes.
     * </pre>
     *
     * <code>.google.protobuf.Struct params = 1;</code>
     */
    public com.google.protobuf.Struct.Builder getParamsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getParamsFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Parameters for this RecommenderGenerationConfig. These configs can be used
     * by or are applied to all subtypes.
     * </pre>
     *
     * <code>.google.protobuf.Struct params = 1;</code>
     */
    public com.google.protobuf.StructOrBuilder getParamsOrBuilder() {
      if (paramsBuilder_ != null) {
        return paramsBuilder_.getMessageOrBuilder();
      } else {
        return params_ == null ? com.google.protobuf.Struct.getDefaultInstance() : params_;
      }
    }
    /**
     *
     *
     * <pre>
     * Parameters for this RecommenderGenerationConfig. These configs can be used
     * by or are applied to all subtypes.
     * </pre>
     *
     * <code>.google.protobuf.Struct params = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Struct,
            com.google.protobuf.Struct.Builder,
            com.google.protobuf.StructOrBuilder>
        getParamsFieldBuilder() {
      if (paramsBuilder_ == null) {
        paramsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Struct,
                com.google.protobuf.Struct.Builder,
                com.google.protobuf.StructOrBuilder>(
                getParams(), getParentForChildren(), isClean());
        params_ = null;
      }
      return paramsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.recommender.v1beta1.RecommenderGenerationConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recommender.v1beta1.RecommenderGenerationConfig)
  private static final com.google.cloud.recommender.v1beta1.RecommenderGenerationConfig
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.recommender.v1beta1.RecommenderGenerationConfig();
  }

  public static com.google.cloud.recommender.v1beta1.RecommenderGenerationConfig
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RecommenderGenerationConfig> PARSER =
      new com.google.protobuf.AbstractParser<RecommenderGenerationConfig>() {
        @java.lang.Override
        public RecommenderGenerationConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<RecommenderGenerationConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RecommenderGenerationConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.recommender.v1beta1.RecommenderGenerationConfig
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
