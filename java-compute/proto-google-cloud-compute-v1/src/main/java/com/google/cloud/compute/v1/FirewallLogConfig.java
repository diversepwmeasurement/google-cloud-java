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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * The available logging options for a firewall rule.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.FirewallLogConfig}
 */
public final class FirewallLogConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.FirewallLogConfig)
    FirewallLogConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use FirewallLogConfig.newBuilder() to construct.
  private FirewallLogConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FirewallLogConfig() {
    metadata_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FirewallLogConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private FirewallLogConfig(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 346631192:
            {
              enable_ = input.readBool();
              break;
            }
          case 694933880:
            {
              int rawValue = input.readEnum();

              metadata_ = rawValue;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_FirewallLogConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_FirewallLogConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.FirewallLogConfig.class,
            com.google.cloud.compute.v1.FirewallLogConfig.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * This field can only be specified for a particular firewall rule if logging is enabled for that rule. This field denotes whether to include or exclude metadata for firewall logs.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.compute.v1.FirewallLogConfig.Metadata}
   */
  public enum Metadata implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_METADATA = 0;</code>
     */
    UNDEFINED_METADATA(0),
    /** <code>EXCLUDE_ALL_METADATA = 66084498;</code> */
    EXCLUDE_ALL_METADATA(66084498),
    /** <code>INCLUDE_ALL_METADATA = 164619908;</code> */
    INCLUDE_ALL_METADATA(164619908),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_METADATA = 0;</code>
     */
    public static final int UNDEFINED_METADATA_VALUE = 0;
    /** <code>EXCLUDE_ALL_METADATA = 66084498;</code> */
    public static final int EXCLUDE_ALL_METADATA_VALUE = 66084498;
    /** <code>INCLUDE_ALL_METADATA = 164619908;</code> */
    public static final int INCLUDE_ALL_METADATA_VALUE = 164619908;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Metadata valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Metadata forNumber(int value) {
      switch (value) {
        case 0:
          return UNDEFINED_METADATA;
        case 66084498:
          return EXCLUDE_ALL_METADATA;
        case 164619908:
          return INCLUDE_ALL_METADATA;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Metadata> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Metadata> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Metadata>() {
          public Metadata findValueByNumber(int number) {
            return Metadata.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.compute.v1.FirewallLogConfig.getDescriptor().getEnumTypes().get(0);
    }

    private static final Metadata[] VALUES = values();

    public static Metadata valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Metadata(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.compute.v1.FirewallLogConfig.Metadata)
  }

  public static final int ENABLE_FIELD_NUMBER = 43328899;
  private boolean enable_;
  /**
   *
   *
   * <pre>
   * This field denotes whether to enable logging for a particular firewall rule.
   * </pre>
   *
   * <code>bool enable = 43328899;</code>
   *
   * @return The enable.
   */
  @java.lang.Override
  public boolean getEnable() {
    return enable_;
  }

  public static final int METADATA_FIELD_NUMBER = 86866735;
  private int metadata_;
  /**
   *
   *
   * <pre>
   * This field can only be specified for a particular firewall rule if logging is enabled for that rule. This field denotes whether to include or exclude metadata for firewall logs.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.FirewallLogConfig.Metadata metadata = 86866735;</code>
   *
   * @return The enum numeric value on the wire for metadata.
   */
  @java.lang.Override
  public int getMetadataValue() {
    return metadata_;
  }
  /**
   *
   *
   * <pre>
   * This field can only be specified for a particular firewall rule if logging is enabled for that rule. This field denotes whether to include or exclude metadata for firewall logs.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.FirewallLogConfig.Metadata metadata = 86866735;</code>
   *
   * @return The metadata.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.FirewallLogConfig.Metadata getMetadata() {
    @SuppressWarnings("deprecation")
    com.google.cloud.compute.v1.FirewallLogConfig.Metadata result =
        com.google.cloud.compute.v1.FirewallLogConfig.Metadata.valueOf(metadata_);
    return result == null
        ? com.google.cloud.compute.v1.FirewallLogConfig.Metadata.UNRECOGNIZED
        : result;
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
    if (enable_ != false) {
      output.writeBool(43328899, enable_);
    }
    if (metadata_
        != com.google.cloud.compute.v1.FirewallLogConfig.Metadata.UNDEFINED_METADATA.getNumber()) {
      output.writeEnum(86866735, metadata_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enable_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(43328899, enable_);
    }
    if (metadata_
        != com.google.cloud.compute.v1.FirewallLogConfig.Metadata.UNDEFINED_METADATA.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(86866735, metadata_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.FirewallLogConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.FirewallLogConfig other =
        (com.google.cloud.compute.v1.FirewallLogConfig) obj;

    if (getEnable() != other.getEnable()) return false;
    if (metadata_ != other.metadata_) return false;
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
    hash = (37 * hash) + ENABLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEnable());
    hash = (37 * hash) + METADATA_FIELD_NUMBER;
    hash = (53 * hash) + metadata_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.FirewallLogConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.FirewallLogConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.FirewallLogConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.FirewallLogConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.FirewallLogConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.FirewallLogConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.FirewallLogConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.FirewallLogConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.FirewallLogConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.FirewallLogConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.FirewallLogConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.FirewallLogConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.FirewallLogConfig prototype) {
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
   * The available logging options for a firewall rule.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.FirewallLogConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.FirewallLogConfig)
      com.google.cloud.compute.v1.FirewallLogConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_FirewallLogConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_FirewallLogConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.FirewallLogConfig.class,
              com.google.cloud.compute.v1.FirewallLogConfig.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.FirewallLogConfig.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      enable_ = false;

      metadata_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_FirewallLogConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.FirewallLogConfig getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.FirewallLogConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.FirewallLogConfig build() {
      com.google.cloud.compute.v1.FirewallLogConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.FirewallLogConfig buildPartial() {
      com.google.cloud.compute.v1.FirewallLogConfig result =
          new com.google.cloud.compute.v1.FirewallLogConfig(this);
      result.enable_ = enable_;
      result.metadata_ = metadata_;
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
      if (other instanceof com.google.cloud.compute.v1.FirewallLogConfig) {
        return mergeFrom((com.google.cloud.compute.v1.FirewallLogConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.FirewallLogConfig other) {
      if (other == com.google.cloud.compute.v1.FirewallLogConfig.getDefaultInstance()) return this;
      if (other.getEnable() != false) {
        setEnable(other.getEnable());
      }
      if (other.metadata_ != 0) {
        setMetadataValue(other.getMetadataValue());
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
      com.google.cloud.compute.v1.FirewallLogConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.compute.v1.FirewallLogConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean enable_;
    /**
     *
     *
     * <pre>
     * This field denotes whether to enable logging for a particular firewall rule.
     * </pre>
     *
     * <code>bool enable = 43328899;</code>
     *
     * @return The enable.
     */
    @java.lang.Override
    public boolean getEnable() {
      return enable_;
    }
    /**
     *
     *
     * <pre>
     * This field denotes whether to enable logging for a particular firewall rule.
     * </pre>
     *
     * <code>bool enable = 43328899;</code>
     *
     * @param value The enable to set.
     * @return This builder for chaining.
     */
    public Builder setEnable(boolean value) {

      enable_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * This field denotes whether to enable logging for a particular firewall rule.
     * </pre>
     *
     * <code>bool enable = 43328899;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnable() {

      enable_ = false;
      onChanged();
      return this;
    }

    private int metadata_ = 0;
    /**
     *
     *
     * <pre>
     * This field can only be specified for a particular firewall rule if logging is enabled for that rule. This field denotes whether to include or exclude metadata for firewall logs.
     * </pre>
     *
     * <code>.google.cloud.compute.v1.FirewallLogConfig.Metadata metadata = 86866735;</code>
     *
     * @return The enum numeric value on the wire for metadata.
     */
    @java.lang.Override
    public int getMetadataValue() {
      return metadata_;
    }
    /**
     *
     *
     * <pre>
     * This field can only be specified for a particular firewall rule if logging is enabled for that rule. This field denotes whether to include or exclude metadata for firewall logs.
     * </pre>
     *
     * <code>.google.cloud.compute.v1.FirewallLogConfig.Metadata metadata = 86866735;</code>
     *
     * @param value The enum numeric value on the wire for metadata to set.
     * @return This builder for chaining.
     */
    public Builder setMetadataValue(int value) {

      metadata_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * This field can only be specified for a particular firewall rule if logging is enabled for that rule. This field denotes whether to include or exclude metadata for firewall logs.
     * </pre>
     *
     * <code>.google.cloud.compute.v1.FirewallLogConfig.Metadata metadata = 86866735;</code>
     *
     * @return The metadata.
     */
    @java.lang.Override
    public com.google.cloud.compute.v1.FirewallLogConfig.Metadata getMetadata() {
      @SuppressWarnings("deprecation")
      com.google.cloud.compute.v1.FirewallLogConfig.Metadata result =
          com.google.cloud.compute.v1.FirewallLogConfig.Metadata.valueOf(metadata_);
      return result == null
          ? com.google.cloud.compute.v1.FirewallLogConfig.Metadata.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * This field can only be specified for a particular firewall rule if logging is enabled for that rule. This field denotes whether to include or exclude metadata for firewall logs.
     * </pre>
     *
     * <code>.google.cloud.compute.v1.FirewallLogConfig.Metadata metadata = 86866735;</code>
     *
     * @param value The metadata to set.
     * @return This builder for chaining.
     */
    public Builder setMetadata(com.google.cloud.compute.v1.FirewallLogConfig.Metadata value) {
      if (value == null) {
        throw new NullPointerException();
      }

      metadata_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * This field can only be specified for a particular firewall rule if logging is enabled for that rule. This field denotes whether to include or exclude metadata for firewall logs.
     * </pre>
     *
     * <code>.google.cloud.compute.v1.FirewallLogConfig.Metadata metadata = 86866735;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMetadata() {

      metadata_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.FirewallLogConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.FirewallLogConfig)
  private static final com.google.cloud.compute.v1.FirewallLogConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.FirewallLogConfig();
  }

  public static com.google.cloud.compute.v1.FirewallLogConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FirewallLogConfig> PARSER =
      new com.google.protobuf.AbstractParser<FirewallLogConfig>() {
        @java.lang.Override
        public FirewallLogConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new FirewallLogConfig(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<FirewallLogConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FirewallLogConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.FirewallLogConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
