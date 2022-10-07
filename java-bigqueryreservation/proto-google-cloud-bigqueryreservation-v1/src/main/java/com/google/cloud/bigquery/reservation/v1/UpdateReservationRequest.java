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
// source: google/cloud/bigquery/reservation/v1/reservation.proto

package com.google.cloud.bigquery.reservation.v1;

/**
 *
 *
 * <pre>
 * The request for [ReservationService.UpdateReservation][google.cloud.bigquery.reservation.v1.ReservationService.UpdateReservation].
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.reservation.v1.UpdateReservationRequest}
 */
public final class UpdateReservationRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.reservation.v1.UpdateReservationRequest)
    UpdateReservationRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateReservationRequest.newBuilder() to construct.
  private UpdateReservationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateReservationRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateReservationRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.reservation.v1.ReservationProto
        .internal_static_google_cloud_bigquery_reservation_v1_UpdateReservationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.reservation.v1.ReservationProto
        .internal_static_google_cloud_bigquery_reservation_v1_UpdateReservationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.reservation.v1.UpdateReservationRequest.class,
            com.google.cloud.bigquery.reservation.v1.UpdateReservationRequest.Builder.class);
  }

  public static final int RESERVATION_FIELD_NUMBER = 1;
  private com.google.cloud.bigquery.reservation.v1.Reservation reservation_;
  /**
   *
   *
   * <pre>
   * Content of the reservation to update.
   * </pre>
   *
   * <code>.google.cloud.bigquery.reservation.v1.Reservation reservation = 1;</code>
   *
   * @return Whether the reservation field is set.
   */
  @java.lang.Override
  public boolean hasReservation() {
    return reservation_ != null;
  }
  /**
   *
   *
   * <pre>
   * Content of the reservation to update.
   * </pre>
   *
   * <code>.google.cloud.bigquery.reservation.v1.Reservation reservation = 1;</code>
   *
   * @return The reservation.
   */
  @java.lang.Override
  public com.google.cloud.bigquery.reservation.v1.Reservation getReservation() {
    return reservation_ == null
        ? com.google.cloud.bigquery.reservation.v1.Reservation.getDefaultInstance()
        : reservation_;
  }
  /**
   *
   *
   * <pre>
   * Content of the reservation to update.
   * </pre>
   *
   * <code>.google.cloud.bigquery.reservation.v1.Reservation reservation = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.reservation.v1.ReservationOrBuilder getReservationOrBuilder() {
    return getReservation();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Standard field mask for the set of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * Standard field mask for the set of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * Standard field mask for the set of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
    if (reservation_ != null) {
      output.writeMessage(1, getReservation());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (reservation_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getReservation());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.bigquery.reservation.v1.UpdateReservationRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.reservation.v1.UpdateReservationRequest other =
        (com.google.cloud.bigquery.reservation.v1.UpdateReservationRequest) obj;

    if (hasReservation() != other.hasReservation()) return false;
    if (hasReservation()) {
      if (!getReservation().equals(other.getReservation())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
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
    if (hasReservation()) {
      hash = (37 * hash) + RESERVATION_FIELD_NUMBER;
      hash = (53 * hash) + getReservation().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.reservation.v1.UpdateReservationRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.reservation.v1.UpdateReservationRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.reservation.v1.UpdateReservationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.reservation.v1.UpdateReservationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.reservation.v1.UpdateReservationRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.reservation.v1.UpdateReservationRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.reservation.v1.UpdateReservationRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.reservation.v1.UpdateReservationRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.reservation.v1.UpdateReservationRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.reservation.v1.UpdateReservationRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.reservation.v1.UpdateReservationRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.reservation.v1.UpdateReservationRequest parseFrom(
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
      com.google.cloud.bigquery.reservation.v1.UpdateReservationRequest prototype) {
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
   * The request for [ReservationService.UpdateReservation][google.cloud.bigquery.reservation.v1.ReservationService.UpdateReservation].
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.reservation.v1.UpdateReservationRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.reservation.v1.UpdateReservationRequest)
      com.google.cloud.bigquery.reservation.v1.UpdateReservationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.reservation.v1.ReservationProto
          .internal_static_google_cloud_bigquery_reservation_v1_UpdateReservationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.reservation.v1.ReservationProto
          .internal_static_google_cloud_bigquery_reservation_v1_UpdateReservationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.reservation.v1.UpdateReservationRequest.class,
              com.google.cloud.bigquery.reservation.v1.UpdateReservationRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.bigquery.reservation.v1.UpdateReservationRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (reservationBuilder_ == null) {
        reservation_ = null;
      } else {
        reservation_ = null;
        reservationBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.reservation.v1.ReservationProto
          .internal_static_google_cloud_bigquery_reservation_v1_UpdateReservationRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.reservation.v1.UpdateReservationRequest
        getDefaultInstanceForType() {
      return com.google.cloud.bigquery.reservation.v1.UpdateReservationRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.reservation.v1.UpdateReservationRequest build() {
      com.google.cloud.bigquery.reservation.v1.UpdateReservationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.reservation.v1.UpdateReservationRequest buildPartial() {
      com.google.cloud.bigquery.reservation.v1.UpdateReservationRequest result =
          new com.google.cloud.bigquery.reservation.v1.UpdateReservationRequest(this);
      if (reservationBuilder_ == null) {
        result.reservation_ = reservation_;
      } else {
        result.reservation_ = reservationBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
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
      if (other instanceof com.google.cloud.bigquery.reservation.v1.UpdateReservationRequest) {
        return mergeFrom((com.google.cloud.bigquery.reservation.v1.UpdateReservationRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.bigquery.reservation.v1.UpdateReservationRequest other) {
      if (other
          == com.google.cloud.bigquery.reservation.v1.UpdateReservationRequest.getDefaultInstance())
        return this;
      if (other.hasReservation()) {
        mergeReservation(other.getReservation());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
                input.readMessage(getReservationFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);

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

    private com.google.cloud.bigquery.reservation.v1.Reservation reservation_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.reservation.v1.Reservation,
            com.google.cloud.bigquery.reservation.v1.Reservation.Builder,
            com.google.cloud.bigquery.reservation.v1.ReservationOrBuilder>
        reservationBuilder_;
    /**
     *
     *
     * <pre>
     * Content of the reservation to update.
     * </pre>
     *
     * <code>.google.cloud.bigquery.reservation.v1.Reservation reservation = 1;</code>
     *
     * @return Whether the reservation field is set.
     */
    public boolean hasReservation() {
      return reservationBuilder_ != null || reservation_ != null;
    }
    /**
     *
     *
     * <pre>
     * Content of the reservation to update.
     * </pre>
     *
     * <code>.google.cloud.bigquery.reservation.v1.Reservation reservation = 1;</code>
     *
     * @return The reservation.
     */
    public com.google.cloud.bigquery.reservation.v1.Reservation getReservation() {
      if (reservationBuilder_ == null) {
        return reservation_ == null
            ? com.google.cloud.bigquery.reservation.v1.Reservation.getDefaultInstance()
            : reservation_;
      } else {
        return reservationBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Content of the reservation to update.
     * </pre>
     *
     * <code>.google.cloud.bigquery.reservation.v1.Reservation reservation = 1;</code>
     */
    public Builder setReservation(com.google.cloud.bigquery.reservation.v1.Reservation value) {
      if (reservationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        reservation_ = value;
        onChanged();
      } else {
        reservationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Content of the reservation to update.
     * </pre>
     *
     * <code>.google.cloud.bigquery.reservation.v1.Reservation reservation = 1;</code>
     */
    public Builder setReservation(
        com.google.cloud.bigquery.reservation.v1.Reservation.Builder builderForValue) {
      if (reservationBuilder_ == null) {
        reservation_ = builderForValue.build();
        onChanged();
      } else {
        reservationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Content of the reservation to update.
     * </pre>
     *
     * <code>.google.cloud.bigquery.reservation.v1.Reservation reservation = 1;</code>
     */
    public Builder mergeReservation(com.google.cloud.bigquery.reservation.v1.Reservation value) {
      if (reservationBuilder_ == null) {
        if (reservation_ != null) {
          reservation_ =
              com.google.cloud.bigquery.reservation.v1.Reservation.newBuilder(reservation_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          reservation_ = value;
        }
        onChanged();
      } else {
        reservationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Content of the reservation to update.
     * </pre>
     *
     * <code>.google.cloud.bigquery.reservation.v1.Reservation reservation = 1;</code>
     */
    public Builder clearReservation() {
      if (reservationBuilder_ == null) {
        reservation_ = null;
        onChanged();
      } else {
        reservation_ = null;
        reservationBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Content of the reservation to update.
     * </pre>
     *
     * <code>.google.cloud.bigquery.reservation.v1.Reservation reservation = 1;</code>
     */
    public com.google.cloud.bigquery.reservation.v1.Reservation.Builder getReservationBuilder() {

      onChanged();
      return getReservationFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Content of the reservation to update.
     * </pre>
     *
     * <code>.google.cloud.bigquery.reservation.v1.Reservation reservation = 1;</code>
     */
    public com.google.cloud.bigquery.reservation.v1.ReservationOrBuilder getReservationOrBuilder() {
      if (reservationBuilder_ != null) {
        return reservationBuilder_.getMessageOrBuilder();
      } else {
        return reservation_ == null
            ? com.google.cloud.bigquery.reservation.v1.Reservation.getDefaultInstance()
            : reservation_;
      }
    }
    /**
     *
     *
     * <pre>
     * Content of the reservation to update.
     * </pre>
     *
     * <code>.google.cloud.bigquery.reservation.v1.Reservation reservation = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.reservation.v1.Reservation,
            com.google.cloud.bigquery.reservation.v1.Reservation.Builder,
            com.google.cloud.bigquery.reservation.v1.ReservationOrBuilder>
        getReservationFieldBuilder() {
      if (reservationBuilder_ == null) {
        reservationBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.bigquery.reservation.v1.Reservation,
                com.google.cloud.bigquery.reservation.v1.Reservation.Builder,
                com.google.cloud.bigquery.reservation.v1.ReservationOrBuilder>(
                getReservation(), getParentForChildren(), isClean());
        reservation_ = null;
      }
      return reservationBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * Standard field mask for the set of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     *
     *
     * <pre>
     * Standard field mask for the set of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Standard field mask for the set of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Standard field mask for the set of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Standard field mask for the set of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
              com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Standard field mask for the set of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Standard field mask for the set of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {

      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Standard field mask for the set of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * Standard field mask for the set of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.reservation.v1.UpdateReservationRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.reservation.v1.UpdateReservationRequest)
  private static final com.google.cloud.bigquery.reservation.v1.UpdateReservationRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.reservation.v1.UpdateReservationRequest();
  }

  public static com.google.cloud.bigquery.reservation.v1.UpdateReservationRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateReservationRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateReservationRequest>() {
        @java.lang.Override
        public UpdateReservationRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateReservationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateReservationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.reservation.v1.UpdateReservationRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
