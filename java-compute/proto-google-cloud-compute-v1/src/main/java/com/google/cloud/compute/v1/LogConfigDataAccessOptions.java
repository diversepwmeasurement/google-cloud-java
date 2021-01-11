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
 * Write a Data Access (Gin) log
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.LogConfigDataAccessOptions}
 */
public final class LogConfigDataAccessOptions extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.LogConfigDataAccessOptions)
    LogConfigDataAccessOptionsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use LogConfigDataAccessOptions.newBuilder() to construct.
  private LogConfigDataAccessOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private LogConfigDataAccessOptions() {
    logMode_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new LogConfigDataAccessOptions();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private LogConfigDataAccessOptions(
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
          case 1075695088:
            {
              int rawValue = input.readEnum();

              logMode_ = rawValue;
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
        .internal_static_google_cloud_compute_v1_LogConfigDataAccessOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_LogConfigDataAccessOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.LogConfigDataAccessOptions.class,
            com.google.cloud.compute.v1.LogConfigDataAccessOptions.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * </pre>
   *
   * Protobuf enum {@code google.cloud.compute.v1.LogConfigDataAccessOptions.LogMode}
   */
  public enum LogMode implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_LOG_MODE = 0;</code>
     */
    UNDEFINED_LOG_MODE(0),
    /** <code>LOG_FAIL_CLOSED = 92034322;</code> */
    LOG_FAIL_CLOSED(92034322),
    /** <code>LOG_MODE_UNSPECIFIED = 88160822;</code> */
    LOG_MODE_UNSPECIFIED(88160822),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_LOG_MODE = 0;</code>
     */
    public static final int UNDEFINED_LOG_MODE_VALUE = 0;
    /** <code>LOG_FAIL_CLOSED = 92034322;</code> */
    public static final int LOG_FAIL_CLOSED_VALUE = 92034322;
    /** <code>LOG_MODE_UNSPECIFIED = 88160822;</code> */
    public static final int LOG_MODE_UNSPECIFIED_VALUE = 88160822;

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
    public static LogMode valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static LogMode forNumber(int value) {
      switch (value) {
        case 0:
          return UNDEFINED_LOG_MODE;
        case 92034322:
          return LOG_FAIL_CLOSED;
        case 88160822:
          return LOG_MODE_UNSPECIFIED;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<LogMode> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<LogMode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<LogMode>() {
          public LogMode findValueByNumber(int number) {
            return LogMode.forNumber(number);
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
      return com.google.cloud.compute.v1.LogConfigDataAccessOptions.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final LogMode[] VALUES = values();

    public static LogMode valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private LogMode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.compute.v1.LogConfigDataAccessOptions.LogMode)
  }

  public static final int LOG_MODE_FIELD_NUMBER = 134461886;
  private int logMode_;
  /**
   * <code>.google.cloud.compute.v1.LogConfigDataAccessOptions.LogMode log_mode = 134461886;</code>
   *
   * @return The enum numeric value on the wire for logMode.
   */
  @java.lang.Override
  public int getLogModeValue() {
    return logMode_;
  }
  /**
   * <code>.google.cloud.compute.v1.LogConfigDataAccessOptions.LogMode log_mode = 134461886;</code>
   *
   * @return The logMode.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.LogConfigDataAccessOptions.LogMode getLogMode() {
    @SuppressWarnings("deprecation")
    com.google.cloud.compute.v1.LogConfigDataAccessOptions.LogMode result =
        com.google.cloud.compute.v1.LogConfigDataAccessOptions.LogMode.valueOf(logMode_);
    return result == null
        ? com.google.cloud.compute.v1.LogConfigDataAccessOptions.LogMode.UNRECOGNIZED
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
    if (logMode_
        != com.google.cloud.compute.v1.LogConfigDataAccessOptions.LogMode.UNDEFINED_LOG_MODE
            .getNumber()) {
      output.writeEnum(134461886, logMode_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (logMode_
        != com.google.cloud.compute.v1.LogConfigDataAccessOptions.LogMode.UNDEFINED_LOG_MODE
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(134461886, logMode_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.LogConfigDataAccessOptions)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.LogConfigDataAccessOptions other =
        (com.google.cloud.compute.v1.LogConfigDataAccessOptions) obj;

    if (logMode_ != other.logMode_) return false;
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
    hash = (37 * hash) + LOG_MODE_FIELD_NUMBER;
    hash = (53 * hash) + logMode_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.LogConfigDataAccessOptions parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.LogConfigDataAccessOptions parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.LogConfigDataAccessOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.LogConfigDataAccessOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.LogConfigDataAccessOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.LogConfigDataAccessOptions parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.LogConfigDataAccessOptions parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.LogConfigDataAccessOptions parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.LogConfigDataAccessOptions parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.LogConfigDataAccessOptions parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.LogConfigDataAccessOptions parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.LogConfigDataAccessOptions parseFrom(
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
      com.google.cloud.compute.v1.LogConfigDataAccessOptions prototype) {
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
   * Write a Data Access (Gin) log
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.LogConfigDataAccessOptions}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.LogConfigDataAccessOptions)
      com.google.cloud.compute.v1.LogConfigDataAccessOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_LogConfigDataAccessOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_LogConfigDataAccessOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.LogConfigDataAccessOptions.class,
              com.google.cloud.compute.v1.LogConfigDataAccessOptions.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.LogConfigDataAccessOptions.newBuilder()
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
      logMode_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_LogConfigDataAccessOptions_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.LogConfigDataAccessOptions getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.LogConfigDataAccessOptions.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.LogConfigDataAccessOptions build() {
      com.google.cloud.compute.v1.LogConfigDataAccessOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.LogConfigDataAccessOptions buildPartial() {
      com.google.cloud.compute.v1.LogConfigDataAccessOptions result =
          new com.google.cloud.compute.v1.LogConfigDataAccessOptions(this);
      result.logMode_ = logMode_;
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
      if (other instanceof com.google.cloud.compute.v1.LogConfigDataAccessOptions) {
        return mergeFrom((com.google.cloud.compute.v1.LogConfigDataAccessOptions) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.LogConfigDataAccessOptions other) {
      if (other == com.google.cloud.compute.v1.LogConfigDataAccessOptions.getDefaultInstance())
        return this;
      if (other.logMode_ != 0) {
        setLogModeValue(other.getLogModeValue());
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
      com.google.cloud.compute.v1.LogConfigDataAccessOptions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.compute.v1.LogConfigDataAccessOptions) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int logMode_ = 0;
    /**
     * <code>.google.cloud.compute.v1.LogConfigDataAccessOptions.LogMode log_mode = 134461886;
     * </code>
     *
     * @return The enum numeric value on the wire for logMode.
     */
    @java.lang.Override
    public int getLogModeValue() {
      return logMode_;
    }
    /**
     * <code>.google.cloud.compute.v1.LogConfigDataAccessOptions.LogMode log_mode = 134461886;
     * </code>
     *
     * @param value The enum numeric value on the wire for logMode to set.
     * @return This builder for chaining.
     */
    public Builder setLogModeValue(int value) {

      logMode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.google.cloud.compute.v1.LogConfigDataAccessOptions.LogMode log_mode = 134461886;
     * </code>
     *
     * @return The logMode.
     */
    @java.lang.Override
    public com.google.cloud.compute.v1.LogConfigDataAccessOptions.LogMode getLogMode() {
      @SuppressWarnings("deprecation")
      com.google.cloud.compute.v1.LogConfigDataAccessOptions.LogMode result =
          com.google.cloud.compute.v1.LogConfigDataAccessOptions.LogMode.valueOf(logMode_);
      return result == null
          ? com.google.cloud.compute.v1.LogConfigDataAccessOptions.LogMode.UNRECOGNIZED
          : result;
    }
    /**
     * <code>.google.cloud.compute.v1.LogConfigDataAccessOptions.LogMode log_mode = 134461886;
     * </code>
     *
     * @param value The logMode to set.
     * @return This builder for chaining.
     */
    public Builder setLogMode(
        com.google.cloud.compute.v1.LogConfigDataAccessOptions.LogMode value) {
      if (value == null) {
        throw new NullPointerException();
      }

      logMode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.google.cloud.compute.v1.LogConfigDataAccessOptions.LogMode log_mode = 134461886;
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLogMode() {

      logMode_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.LogConfigDataAccessOptions)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.LogConfigDataAccessOptions)
  private static final com.google.cloud.compute.v1.LogConfigDataAccessOptions DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.LogConfigDataAccessOptions();
  }

  public static com.google.cloud.compute.v1.LogConfigDataAccessOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LogConfigDataAccessOptions> PARSER =
      new com.google.protobuf.AbstractParser<LogConfigDataAccessOptions>() {
        @java.lang.Override
        public LogConfigDataAccessOptions parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new LogConfigDataAccessOptions(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<LogConfigDataAccessOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LogConfigDataAccessOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.LogConfigDataAccessOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
