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
// source: google/cloud/commerce/consumer/procurement/v1alpha1/order.proto

package com.google.cloud.commerce.consumer.procurement.v1alpha1;

/**
 *
 *
 * <pre>
 * Subscription information.
 * </pre>
 *
 * Protobuf type {@code google.cloud.commerce.consumer.procurement.v1alpha1.Subscription}
 */
public final class Subscription extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.commerce.consumer.procurement.v1alpha1.Subscription)
    SubscriptionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Subscription.newBuilder() to construct.
  private Subscription(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Subscription() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Subscription();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Subscription(
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
          case 10:
            {
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (endTime_ != null) {
                subBuilder = endTime_.toBuilder();
              }
              endTime_ =
                  input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(endTime_);
                endTime_ = subBuilder.buildPartial();
              }

              break;
            }
          case 16:
            {
              autoRenewalEnabled_ = input.readBool();
              break;
            }
          case 26:
            {
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (startTime_ != null) {
                subBuilder = startTime_.toBuilder();
              }
              startTime_ =
                  input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(startTime_);
                startTime_ = subBuilder.buildPartial();
              }

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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.commerce.consumer.procurement.v1alpha1.OrderOuterClass
        .internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_Subscription_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.commerce.consumer.procurement.v1alpha1.OrderOuterClass
        .internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_Subscription_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.commerce.consumer.procurement.v1alpha1.Subscription.class,
            com.google.cloud.commerce.consumer.procurement.v1alpha1.Subscription.Builder.class);
  }

  public static final int START_TIME_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp startTime_;
  /**
   *
   *
   * <pre>
   * The timestamp when the subscription begins, if applicable.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3;</code>
   *
   * @return Whether the startTime field is set.
   */
  @java.lang.Override
  public boolean hasStartTime() {
    return startTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * The timestamp when the subscription begins, if applicable.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3;</code>
   *
   * @return The startTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getStartTime() {
    return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
  }
  /**
   *
   *
   * <pre>
   * The timestamp when the subscription begins, if applicable.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder() {
    return getStartTime();
  }

  public static final int END_TIME_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp endTime_;
  /**
   *
   *
   * <pre>
   * The timestamp when the subscription ends, if applicable.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 1;</code>
   *
   * @return Whether the endTime field is set.
   */
  @java.lang.Override
  public boolean hasEndTime() {
    return endTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * The timestamp when the subscription ends, if applicable.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 1;</code>
   *
   * @return The endTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getEndTime() {
    return endTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : endTime_;
  }
  /**
   *
   *
   * <pre>
   * The timestamp when the subscription ends, if applicable.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder() {
    return getEndTime();
  }

  public static final int AUTO_RENEWAL_ENABLED_FIELD_NUMBER = 2;
  private boolean autoRenewalEnabled_;
  /**
   *
   *
   * <pre>
   * Whether auto renewal is enabled by user choice on current subscription.
   * This field indicates order/subscription status after pending plan change is
   * cancelled or rejected.
   * </pre>
   *
   * <code>bool auto_renewal_enabled = 2;</code>
   *
   * @return The autoRenewalEnabled.
   */
  @java.lang.Override
  public boolean getAutoRenewalEnabled() {
    return autoRenewalEnabled_;
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
    if (endTime_ != null) {
      output.writeMessage(1, getEndTime());
    }
    if (autoRenewalEnabled_ != false) {
      output.writeBool(2, autoRenewalEnabled_);
    }
    if (startTime_ != null) {
      output.writeMessage(3, getStartTime());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (endTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getEndTime());
    }
    if (autoRenewalEnabled_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, autoRenewalEnabled_);
    }
    if (startTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getStartTime());
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
    if (!(obj instanceof com.google.cloud.commerce.consumer.procurement.v1alpha1.Subscription)) {
      return super.equals(obj);
    }
    com.google.cloud.commerce.consumer.procurement.v1alpha1.Subscription other =
        (com.google.cloud.commerce.consumer.procurement.v1alpha1.Subscription) obj;

    if (hasStartTime() != other.hasStartTime()) return false;
    if (hasStartTime()) {
      if (!getStartTime().equals(other.getStartTime())) return false;
    }
    if (hasEndTime() != other.hasEndTime()) return false;
    if (hasEndTime()) {
      if (!getEndTime().equals(other.getEndTime())) return false;
    }
    if (getAutoRenewalEnabled() != other.getAutoRenewalEnabled()) return false;
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
    if (hasStartTime()) {
      hash = (37 * hash) + START_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getStartTime().hashCode();
    }
    if (hasEndTime()) {
      hash = (37 * hash) + END_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getEndTime().hashCode();
    }
    hash = (37 * hash) + AUTO_RENEWAL_ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getAutoRenewalEnabled());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.commerce.consumer.procurement.v1alpha1.Subscription parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.commerce.consumer.procurement.v1alpha1.Subscription parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.commerce.consumer.procurement.v1alpha1.Subscription parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.commerce.consumer.procurement.v1alpha1.Subscription parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.commerce.consumer.procurement.v1alpha1.Subscription parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.commerce.consumer.procurement.v1alpha1.Subscription parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.commerce.consumer.procurement.v1alpha1.Subscription parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.commerce.consumer.procurement.v1alpha1.Subscription parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.commerce.consumer.procurement.v1alpha1.Subscription
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.commerce.consumer.procurement.v1alpha1.Subscription
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.commerce.consumer.procurement.v1alpha1.Subscription parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.commerce.consumer.procurement.v1alpha1.Subscription parseFrom(
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
      com.google.cloud.commerce.consumer.procurement.v1alpha1.Subscription prototype) {
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
   * Subscription information.
   * </pre>
   *
   * Protobuf type {@code google.cloud.commerce.consumer.procurement.v1alpha1.Subscription}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.commerce.consumer.procurement.v1alpha1.Subscription)
      com.google.cloud.commerce.consumer.procurement.v1alpha1.SubscriptionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.commerce.consumer.procurement.v1alpha1.OrderOuterClass
          .internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_Subscription_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.commerce.consumer.procurement.v1alpha1.OrderOuterClass
          .internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_Subscription_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.commerce.consumer.procurement.v1alpha1.Subscription.class,
              com.google.cloud.commerce.consumer.procurement.v1alpha1.Subscription.Builder.class);
    }

    // Construct using
    // com.google.cloud.commerce.consumer.procurement.v1alpha1.Subscription.newBuilder()
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
      if (startTimeBuilder_ == null) {
        startTime_ = null;
      } else {
        startTime_ = null;
        startTimeBuilder_ = null;
      }
      if (endTimeBuilder_ == null) {
        endTime_ = null;
      } else {
        endTime_ = null;
        endTimeBuilder_ = null;
      }
      autoRenewalEnabled_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.commerce.consumer.procurement.v1alpha1.OrderOuterClass
          .internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_Subscription_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.commerce.consumer.procurement.v1alpha1.Subscription
        getDefaultInstanceForType() {
      return com.google.cloud.commerce.consumer.procurement.v1alpha1.Subscription
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.commerce.consumer.procurement.v1alpha1.Subscription build() {
      com.google.cloud.commerce.consumer.procurement.v1alpha1.Subscription result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.commerce.consumer.procurement.v1alpha1.Subscription buildPartial() {
      com.google.cloud.commerce.consumer.procurement.v1alpha1.Subscription result =
          new com.google.cloud.commerce.consumer.procurement.v1alpha1.Subscription(this);
      if (startTimeBuilder_ == null) {
        result.startTime_ = startTime_;
      } else {
        result.startTime_ = startTimeBuilder_.build();
      }
      if (endTimeBuilder_ == null) {
        result.endTime_ = endTime_;
      } else {
        result.endTime_ = endTimeBuilder_.build();
      }
      result.autoRenewalEnabled_ = autoRenewalEnabled_;
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
      if (other instanceof com.google.cloud.commerce.consumer.procurement.v1alpha1.Subscription) {
        return mergeFrom(
            (com.google.cloud.commerce.consumer.procurement.v1alpha1.Subscription) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.commerce.consumer.procurement.v1alpha1.Subscription other) {
      if (other
          == com.google.cloud.commerce.consumer.procurement.v1alpha1.Subscription
              .getDefaultInstance()) return this;
      if (other.hasStartTime()) {
        mergeStartTime(other.getStartTime());
      }
      if (other.hasEndTime()) {
        mergeEndTime(other.getEndTime());
      }
      if (other.getAutoRenewalEnabled() != false) {
        setAutoRenewalEnabled(other.getAutoRenewalEnabled());
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
      com.google.cloud.commerce.consumer.procurement.v1alpha1.Subscription parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.commerce.consumer.procurement.v1alpha1.Subscription)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Timestamp startTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        startTimeBuilder_;
    /**
     *
     *
     * <pre>
     * The timestamp when the subscription begins, if applicable.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     *
     * @return Whether the startTime field is set.
     */
    public boolean hasStartTime() {
      return startTimeBuilder_ != null || startTime_ != null;
    }
    /**
     *
     *
     * <pre>
     * The timestamp when the subscription begins, if applicable.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     *
     * @return The startTime.
     */
    public com.google.protobuf.Timestamp getStartTime() {
      if (startTimeBuilder_ == null) {
        return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
      } else {
        return startTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The timestamp when the subscription begins, if applicable.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     */
    public Builder setStartTime(com.google.protobuf.Timestamp value) {
      if (startTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        startTime_ = value;
        onChanged();
      } else {
        startTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The timestamp when the subscription begins, if applicable.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     */
    public Builder setStartTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (startTimeBuilder_ == null) {
        startTime_ = builderForValue.build();
        onChanged();
      } else {
        startTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The timestamp when the subscription begins, if applicable.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     */
    public Builder mergeStartTime(com.google.protobuf.Timestamp value) {
      if (startTimeBuilder_ == null) {
        if (startTime_ != null) {
          startTime_ =
              com.google.protobuf.Timestamp.newBuilder(startTime_).mergeFrom(value).buildPartial();
        } else {
          startTime_ = value;
        }
        onChanged();
      } else {
        startTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The timestamp when the subscription begins, if applicable.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     */
    public Builder clearStartTime() {
      if (startTimeBuilder_ == null) {
        startTime_ = null;
        onChanged();
      } else {
        startTime_ = null;
        startTimeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The timestamp when the subscription begins, if applicable.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     */
    public com.google.protobuf.Timestamp.Builder getStartTimeBuilder() {

      onChanged();
      return getStartTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The timestamp when the subscription begins, if applicable.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder() {
      if (startTimeBuilder_ != null) {
        return startTimeBuilder_.getMessageOrBuilder();
      } else {
        return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * The timestamp when the subscription begins, if applicable.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getStartTimeFieldBuilder() {
      if (startTimeBuilder_ == null) {
        startTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getStartTime(), getParentForChildren(), isClean());
        startTime_ = null;
      }
      return startTimeBuilder_;
    }

    private com.google.protobuf.Timestamp endTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        endTimeBuilder_;
    /**
     *
     *
     * <pre>
     * The timestamp when the subscription ends, if applicable.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 1;</code>
     *
     * @return Whether the endTime field is set.
     */
    public boolean hasEndTime() {
      return endTimeBuilder_ != null || endTime_ != null;
    }
    /**
     *
     *
     * <pre>
     * The timestamp when the subscription ends, if applicable.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 1;</code>
     *
     * @return The endTime.
     */
    public com.google.protobuf.Timestamp getEndTime() {
      if (endTimeBuilder_ == null) {
        return endTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : endTime_;
      } else {
        return endTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The timestamp when the subscription ends, if applicable.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 1;</code>
     */
    public Builder setEndTime(com.google.protobuf.Timestamp value) {
      if (endTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        endTime_ = value;
        onChanged();
      } else {
        endTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The timestamp when the subscription ends, if applicable.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 1;</code>
     */
    public Builder setEndTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (endTimeBuilder_ == null) {
        endTime_ = builderForValue.build();
        onChanged();
      } else {
        endTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The timestamp when the subscription ends, if applicable.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 1;</code>
     */
    public Builder mergeEndTime(com.google.protobuf.Timestamp value) {
      if (endTimeBuilder_ == null) {
        if (endTime_ != null) {
          endTime_ =
              com.google.protobuf.Timestamp.newBuilder(endTime_).mergeFrom(value).buildPartial();
        } else {
          endTime_ = value;
        }
        onChanged();
      } else {
        endTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The timestamp when the subscription ends, if applicable.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 1;</code>
     */
    public Builder clearEndTime() {
      if (endTimeBuilder_ == null) {
        endTime_ = null;
        onChanged();
      } else {
        endTime_ = null;
        endTimeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The timestamp when the subscription ends, if applicable.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 1;</code>
     */
    public com.google.protobuf.Timestamp.Builder getEndTimeBuilder() {

      onChanged();
      return getEndTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The timestamp when the subscription ends, if applicable.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 1;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder() {
      if (endTimeBuilder_ != null) {
        return endTimeBuilder_.getMessageOrBuilder();
      } else {
        return endTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : endTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * The timestamp when the subscription ends, if applicable.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getEndTimeFieldBuilder() {
      if (endTimeBuilder_ == null) {
        endTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getEndTime(), getParentForChildren(), isClean());
        endTime_ = null;
      }
      return endTimeBuilder_;
    }

    private boolean autoRenewalEnabled_;
    /**
     *
     *
     * <pre>
     * Whether auto renewal is enabled by user choice on current subscription.
     * This field indicates order/subscription status after pending plan change is
     * cancelled or rejected.
     * </pre>
     *
     * <code>bool auto_renewal_enabled = 2;</code>
     *
     * @return The autoRenewalEnabled.
     */
    @java.lang.Override
    public boolean getAutoRenewalEnabled() {
      return autoRenewalEnabled_;
    }
    /**
     *
     *
     * <pre>
     * Whether auto renewal is enabled by user choice on current subscription.
     * This field indicates order/subscription status after pending plan change is
     * cancelled or rejected.
     * </pre>
     *
     * <code>bool auto_renewal_enabled = 2;</code>
     *
     * @param value The autoRenewalEnabled to set.
     * @return This builder for chaining.
     */
    public Builder setAutoRenewalEnabled(boolean value) {

      autoRenewalEnabled_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Whether auto renewal is enabled by user choice on current subscription.
     * This field indicates order/subscription status after pending plan change is
     * cancelled or rejected.
     * </pre>
     *
     * <code>bool auto_renewal_enabled = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAutoRenewalEnabled() {

      autoRenewalEnabled_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.commerce.consumer.procurement.v1alpha1.Subscription)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.commerce.consumer.procurement.v1alpha1.Subscription)
  private static final com.google.cloud.commerce.consumer.procurement.v1alpha1.Subscription
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.commerce.consumer.procurement.v1alpha1.Subscription();
  }

  public static com.google.cloud.commerce.consumer.procurement.v1alpha1.Subscription
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Subscription> PARSER =
      new com.google.protobuf.AbstractParser<Subscription>() {
        @java.lang.Override
        public Subscription parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Subscription(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Subscription> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Subscription> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.commerce.consumer.procurement.v1alpha1.Subscription
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}