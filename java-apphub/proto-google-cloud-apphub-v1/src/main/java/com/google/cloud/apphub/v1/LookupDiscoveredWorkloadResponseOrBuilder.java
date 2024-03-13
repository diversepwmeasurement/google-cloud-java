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
// source: google/cloud/apphub/v1/apphub_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.apphub.v1;

public interface LookupDiscoveredWorkloadResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.apphub.v1.LookupDiscoveredWorkloadResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Discovered Workload if exists, empty otherwise.
   * </pre>
   *
   * <code>.google.cloud.apphub.v1.DiscoveredWorkload discovered_workload = 1;</code>
   *
   * @return Whether the discoveredWorkload field is set.
   */
  boolean hasDiscoveredWorkload();
  /**
   *
   *
   * <pre>
   * Discovered Workload if exists, empty otherwise.
   * </pre>
   *
   * <code>.google.cloud.apphub.v1.DiscoveredWorkload discovered_workload = 1;</code>
   *
   * @return The discoveredWorkload.
   */
  com.google.cloud.apphub.v1.DiscoveredWorkload getDiscoveredWorkload();
  /**
   *
   *
   * <pre>
   * Discovered Workload if exists, empty otherwise.
   * </pre>
   *
   * <code>.google.cloud.apphub.v1.DiscoveredWorkload discovered_workload = 1;</code>
   */
  com.google.cloud.apphub.v1.DiscoveredWorkloadOrBuilder getDiscoveredWorkloadOrBuilder();
}
