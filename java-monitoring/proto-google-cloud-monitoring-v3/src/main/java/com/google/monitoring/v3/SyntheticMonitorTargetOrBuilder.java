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
// source: google/monitoring/v3/uptime.proto

// Protobuf Java Version: 3.25.2
package com.google.monitoring.v3;

public interface SyntheticMonitorTargetOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.SyntheticMonitorTarget)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Target a Synthetic Monitor GCFv2 instance.
   * </pre>
   *
   * <code>.google.monitoring.v3.SyntheticMonitorTarget.CloudFunctionV2Target cloud_function_v2 = 1;
   * </code>
   *
   * @return Whether the cloudFunctionV2 field is set.
   */
  boolean hasCloudFunctionV2();
  /**
   *
   *
   * <pre>
   * Target a Synthetic Monitor GCFv2 instance.
   * </pre>
   *
   * <code>.google.monitoring.v3.SyntheticMonitorTarget.CloudFunctionV2Target cloud_function_v2 = 1;
   * </code>
   *
   * @return The cloudFunctionV2.
   */
  com.google.monitoring.v3.SyntheticMonitorTarget.CloudFunctionV2Target getCloudFunctionV2();
  /**
   *
   *
   * <pre>
   * Target a Synthetic Monitor GCFv2 instance.
   * </pre>
   *
   * <code>.google.monitoring.v3.SyntheticMonitorTarget.CloudFunctionV2Target cloud_function_v2 = 1;
   * </code>
   */
  com.google.monitoring.v3.SyntheticMonitorTarget.CloudFunctionV2TargetOrBuilder
      getCloudFunctionV2OrBuilder();

  com.google.monitoring.v3.SyntheticMonitorTarget.TargetCase getTargetCase();
}
