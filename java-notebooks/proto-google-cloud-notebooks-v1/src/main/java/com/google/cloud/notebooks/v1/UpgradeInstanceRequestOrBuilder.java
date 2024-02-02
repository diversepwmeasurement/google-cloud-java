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
// source: google/cloud/notebooks/v1/service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.notebooks.v1;

public interface UpgradeInstanceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.notebooks.v1.UpgradeInstanceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Format:
   * `projects/{project_id}/locations/{location}/instances/{instance_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. Format:
   * `projects/{project_id}/locations/{location}/instances/{instance_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The optional UpgradeType. Setting this field will search for additional
   * compute images to upgrade this instance.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1.UpgradeType type = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * Optional. The optional UpgradeType. Setting this field will search for additional
   * compute images to upgrade this instance.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1.UpgradeType type = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The type.
   */
  com.google.cloud.notebooks.v1.UpgradeType getType();
}
