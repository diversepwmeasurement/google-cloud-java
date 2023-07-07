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
// source: google/cloud/datacatalog/v1/datacatalog.proto

package com.google.cloud.datacatalog.v1;

public interface GetEntryGroupRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.GetEntryGroupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the entry group to get.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The name of the entry group to get.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The fields to return. If empty or omitted, all fields are returned.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 2;</code>
   *
   * @return Whether the readMask field is set.
   */
  boolean hasReadMask();
  /**
   *
   *
   * <pre>
   * The fields to return. If empty or omitted, all fields are returned.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 2;</code>
   *
   * @return The readMask.
   */
  com.google.protobuf.FieldMask getReadMask();
  /**
   *
   *
   * <pre>
   * The fields to return. If empty or omitted, all fields are returned.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getReadMaskOrBuilder();
}
