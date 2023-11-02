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

public interface PromoteReleaseOperationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.PromoteReleaseOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The ID of the target that represents the promotion stage to
   * which the release will be promoted. The value of this field is the last
   * segment of a target name.
   * </pre>
   *
   * <code>string target_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The targetId.
   */
  java.lang.String getTargetId();
  /**
   *
   *
   * <pre>
   * Output only. The ID of the target that represents the promotion stage to
   * which the release will be promoted. The value of this field is the last
   * segment of a target name.
   * </pre>
   *
   * <code>string target_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for targetId.
   */
  com.google.protobuf.ByteString getTargetIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. How long the operation will be paused.
   * </pre>
   *
   * <code>.google.protobuf.Duration wait = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the wait field is set.
   */
  boolean hasWait();
  /**
   *
   *
   * <pre>
   * Output only. How long the operation will be paused.
   * </pre>
   *
   * <code>.google.protobuf.Duration wait = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The wait.
   */
  com.google.protobuf.Duration getWait();
  /**
   *
   *
   * <pre>
   * Output only. How long the operation will be paused.
   * </pre>
   *
   * <code>.google.protobuf.Duration wait = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.DurationOrBuilder getWaitOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The name of the rollout that initiates the `AutomationRun`.
   * </pre>
   *
   * <code>string rollout = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The rollout.
   */
  java.lang.String getRollout();
  /**
   *
   *
   * <pre>
   * Output only. The name of the rollout that initiates the `AutomationRun`.
   * </pre>
   *
   * <code>string rollout = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for rollout.
   */
  com.google.protobuf.ByteString getRolloutBytes();

  /**
   *
   *
   * <pre>
   * Output only. The starting phase of the rollout created by this operation.
   * </pre>
   *
   * <code>string phase = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The phase.
   */
  java.lang.String getPhase();
  /**
   *
   *
   * <pre>
   * Output only. The starting phase of the rollout created by this operation.
   * </pre>
   *
   * <code>string phase = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for phase.
   */
  com.google.protobuf.ByteString getPhaseBytes();
}
