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
// source: google/cloud/orgpolicy/v2/orgpolicy.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.orgpolicy.v2;

public interface AlternatePolicySpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orgpolicy.v2.AlternatePolicySpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Reference to the launch that will be used while audit logging and to
   * control the launch.
   * Should be set only in the alternate policy.
   * </pre>
   *
   * <code>string launch = 1;</code>
   *
   * @return The launch.
   */
  java.lang.String getLaunch();
  /**
   *
   *
   * <pre>
   * Reference to the launch that will be used while audit logging and to
   * control the launch.
   * Should be set only in the alternate policy.
   * </pre>
   *
   * <code>string launch = 1;</code>
   *
   * @return The bytes for launch.
   */
  com.google.protobuf.ByteString getLaunchBytes();

  /**
   *
   *
   * <pre>
   * Specify constraint for configurations of Google Cloud resources.
   * </pre>
   *
   * <code>.google.cloud.orgpolicy.v2.PolicySpec spec = 2;</code>
   *
   * @return Whether the spec field is set.
   */
  boolean hasSpec();
  /**
   *
   *
   * <pre>
   * Specify constraint for configurations of Google Cloud resources.
   * </pre>
   *
   * <code>.google.cloud.orgpolicy.v2.PolicySpec spec = 2;</code>
   *
   * @return The spec.
   */
  com.google.cloud.orgpolicy.v2.PolicySpec getSpec();
  /**
   *
   *
   * <pre>
   * Specify constraint for configurations of Google Cloud resources.
   * </pre>
   *
   * <code>.google.cloud.orgpolicy.v2.PolicySpec spec = 2;</code>
   */
  com.google.cloud.orgpolicy.v2.PolicySpecOrBuilder getSpecOrBuilder();
}
