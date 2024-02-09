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
// source: google/cloud/dialogflow/cx/v3beta1/example.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dialogflow.cx.v3beta1;

/**
 *
 *
 * <pre>
 * Output state.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.dialogflow.cx.v3beta1.OutputState}
 */
public enum OutputState implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unspecified output.
   * </pre>
   *
   * <code>OUTPUT_STATE_UNSPECIFIED = 0;</code>
   */
  OUTPUT_STATE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Succeeded.
   * </pre>
   *
   * <code>OUTPUT_STATE_OK = 1;</code>
   */
  OUTPUT_STATE_OK(1),
  /**
   *
   *
   * <pre>
   * Cancelled.
   * </pre>
   *
   * <code>OUTPUT_STATE_CANCELLED = 2;</code>
   */
  OUTPUT_STATE_CANCELLED(2),
  /**
   *
   *
   * <pre>
   * Failed.
   * </pre>
   *
   * <code>OUTPUT_STATE_FAILED = 3;</code>
   */
  OUTPUT_STATE_FAILED(3),
  /**
   *
   *
   * <pre>
   * Escalated.
   * </pre>
   *
   * <code>OUTPUT_STATE_ESCALATED = 4;</code>
   */
  OUTPUT_STATE_ESCALATED(4),
  /**
   *
   *
   * <pre>
   * Pending.
   * </pre>
   *
   * <code>OUTPUT_STATE_PENDING = 5;</code>
   */
  OUTPUT_STATE_PENDING(5),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unspecified output.
   * </pre>
   *
   * <code>OUTPUT_STATE_UNSPECIFIED = 0;</code>
   */
  public static final int OUTPUT_STATE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Succeeded.
   * </pre>
   *
   * <code>OUTPUT_STATE_OK = 1;</code>
   */
  public static final int OUTPUT_STATE_OK_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Cancelled.
   * </pre>
   *
   * <code>OUTPUT_STATE_CANCELLED = 2;</code>
   */
  public static final int OUTPUT_STATE_CANCELLED_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Failed.
   * </pre>
   *
   * <code>OUTPUT_STATE_FAILED = 3;</code>
   */
  public static final int OUTPUT_STATE_FAILED_VALUE = 3;
  /**
   *
   *
   * <pre>
   * Escalated.
   * </pre>
   *
   * <code>OUTPUT_STATE_ESCALATED = 4;</code>
   */
  public static final int OUTPUT_STATE_ESCALATED_VALUE = 4;
  /**
   *
   *
   * <pre>
   * Pending.
   * </pre>
   *
   * <code>OUTPUT_STATE_PENDING = 5;</code>
   */
  public static final int OUTPUT_STATE_PENDING_VALUE = 5;

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
  public static OutputState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static OutputState forNumber(int value) {
    switch (value) {
      case 0:
        return OUTPUT_STATE_UNSPECIFIED;
      case 1:
        return OUTPUT_STATE_OK;
      case 2:
        return OUTPUT_STATE_CANCELLED;
      case 3:
        return OUTPUT_STATE_FAILED;
      case 4:
        return OUTPUT_STATE_ESCALATED;
      case 5:
        return OUTPUT_STATE_PENDING;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OutputState> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<OutputState> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<OutputState>() {
        public OutputState findValueByNumber(int number) {
          return OutputState.forNumber(number);
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
    return com.google.cloud.dialogflow.cx.v3beta1.ExampleProto.getDescriptor()
        .getEnumTypes()
        .get(0);
  }

  private static final OutputState[] VALUES = values();

  public static OutputState valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private OutputState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.dialogflow.cx.v3beta1.OutputState)
}
