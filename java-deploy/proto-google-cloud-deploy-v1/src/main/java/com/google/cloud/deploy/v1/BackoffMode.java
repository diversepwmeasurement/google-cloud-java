/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/deploy/v1/cloud_deploy.proto

package com.google.cloud.deploy.v1;

/**
 *
 *
 * <pre>
 * The pattern of how wait time is increased.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.deploy.v1.BackoffMode}
 */
public enum BackoffMode implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * No WaitMode is specified.
   * </pre>
   *
   * <code>BACKOFF_MODE_UNSPECIFIED = 0;</code>
   */
  BACKOFF_MODE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Increases the wait time linearly.
   * </pre>
   *
   * <code>BACKOFF_MODE_LINEAR = 1;</code>
   */
  BACKOFF_MODE_LINEAR(1),
  /**
   *
   *
   * <pre>
   * Increases the wait time exponentially.
   * </pre>
   *
   * <code>BACKOFF_MODE_EXPONENTIAL = 2;</code>
   */
  BACKOFF_MODE_EXPONENTIAL(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * No WaitMode is specified.
   * </pre>
   *
   * <code>BACKOFF_MODE_UNSPECIFIED = 0;</code>
   */
  public static final int BACKOFF_MODE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Increases the wait time linearly.
   * </pre>
   *
   * <code>BACKOFF_MODE_LINEAR = 1;</code>
   */
  public static final int BACKOFF_MODE_LINEAR_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Increases the wait time exponentially.
   * </pre>
   *
   * <code>BACKOFF_MODE_EXPONENTIAL = 2;</code>
   */
  public static final int BACKOFF_MODE_EXPONENTIAL_VALUE = 2;

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
  public static BackoffMode valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static BackoffMode forNumber(int value) {
    switch (value) {
      case 0:
        return BACKOFF_MODE_UNSPECIFIED;
      case 1:
        return BACKOFF_MODE_LINEAR;
      case 2:
        return BACKOFF_MODE_EXPONENTIAL;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<BackoffMode> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<BackoffMode> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<BackoffMode>() {
        public BackoffMode findValueByNumber(int number) {
          return BackoffMode.forNumber(number);
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
    return com.google.cloud.deploy.v1.CloudDeployProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final BackoffMode[] VALUES = values();

  public static BackoffMode valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private BackoffMode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.deploy.v1.BackoffMode)
}
