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
// source: google/cloud/discoveryengine/v1alpha/acl_config_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.discoveryengine.v1alpha;

public interface GetAclConfigRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1alpha.GetAclConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Resource name of
   * [AclConfig][google.cloud.discoveryengine.v1alpha.AclConfig], such as
   * `projects/&#42;&#47;locations/&#42;&#47;aclConfig`.
   *
   * If the caller does not have permission to access the
   * [AclConfig][google.cloud.discoveryengine.v1alpha.AclConfig], regardless of
   * whether or not it exists, a PERMISSION_DENIED error is returned.
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
   * Required. Resource name of
   * [AclConfig][google.cloud.discoveryengine.v1alpha.AclConfig], such as
   * `projects/&#42;&#47;locations/&#42;&#47;aclConfig`.
   *
   * If the caller does not have permission to access the
   * [AclConfig][google.cloud.discoveryengine.v1alpha.AclConfig], regardless of
   * whether or not it exists, a PERMISSION_DENIED error is returned.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();
}
