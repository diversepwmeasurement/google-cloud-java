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
// source: google/cloud/oslogin/v1/oslogin.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.oslogin.v1;

public interface ImportSshPublicKeyRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.oslogin.v1.ImportSshPublicKeyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The unique ID for the user in format `users/{user}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The unique ID for the user in format `users/{user}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Optional. The SSH public key and expiration time.
   * </pre>
   *
   * <code>
   * .google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the sshPublicKey field is set.
   */
  boolean hasSshPublicKey();
  /**
   *
   *
   * <pre>
   * Optional. The SSH public key and expiration time.
   * </pre>
   *
   * <code>
   * .google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The sshPublicKey.
   */
  com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey getSshPublicKey();
  /**
   *
   *
   * <pre>
   * Optional. The SSH public key and expiration time.
   * </pre>
   *
   * <code>
   * .google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.oslogin.common.OsLoginProto.SshPublicKeyOrBuilder getSshPublicKeyOrBuilder();

  /**
   *
   *
   * <pre>
   * The project ID of the Google Cloud Platform project.
   * </pre>
   *
   * <code>string project_id = 3;</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * The project ID of the Google Cloud Platform project.
   * </pre>
   *
   * <code>string project_id = 3;</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. The regions to which to assert that the key was written.
   * If unspecified, defaults to all regions.
   * Regions are listed at https://cloud.google.com/about/locations#region.
   * </pre>
   *
   * <code>repeated string regions = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the regions.
   */
  java.util.List<java.lang.String> getRegionsList();
  /**
   *
   *
   * <pre>
   * Optional. The regions to which to assert that the key was written.
   * If unspecified, defaults to all regions.
   * Regions are listed at https://cloud.google.com/about/locations#region.
   * </pre>
   *
   * <code>repeated string regions = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of regions.
   */
  int getRegionsCount();
  /**
   *
   *
   * <pre>
   * Optional. The regions to which to assert that the key was written.
   * If unspecified, defaults to all regions.
   * Regions are listed at https://cloud.google.com/about/locations#region.
   * </pre>
   *
   * <code>repeated string regions = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The regions at the given index.
   */
  java.lang.String getRegions(int index);
  /**
   *
   *
   * <pre>
   * Optional. The regions to which to assert that the key was written.
   * If unspecified, defaults to all regions.
   * Regions are listed at https://cloud.google.com/about/locations#region.
   * </pre>
   *
   * <code>repeated string regions = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the regions at the given index.
   */
  com.google.protobuf.ByteString getRegionsBytes(int index);
}
