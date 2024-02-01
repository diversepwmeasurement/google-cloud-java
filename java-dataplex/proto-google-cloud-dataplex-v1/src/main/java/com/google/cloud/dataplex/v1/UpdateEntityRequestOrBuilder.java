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
// source: google/cloud/dataplex/v1/metadata.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dataplex.v1;

public interface UpdateEntityRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.UpdateEntityRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Update description.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Entity entity = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the entity field is set.
   */
  boolean hasEntity();
  /**
   *
   *
   * <pre>
   * Required. Update description.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Entity entity = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The entity.
   */
  com.google.cloud.dataplex.v1.Entity getEntity();
  /**
   *
   *
   * <pre>
   * Required. Update description.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Entity entity = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dataplex.v1.EntityOrBuilder getEntityOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Only validate the request, but do not perform mutations.
   * The default is false.
   * </pre>
   *
   * <code>bool validate_only = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
