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

public interface CanaryDeploymentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.CanaryDeployment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The percentage based deployments that will occur as a part of a
   * `Rollout`. List is expected in ascending order and each integer n is
   * 0 &lt;= n &lt; 100.
   * </pre>
   *
   * <code>repeated int32 percentages = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return A list containing the percentages.
   */
  java.util.List<java.lang.Integer> getPercentagesList();
  /**
   *
   *
   * <pre>
   * Required. The percentage based deployments that will occur as a part of a
   * `Rollout`. List is expected in ascending order and each integer n is
   * 0 &lt;= n &lt; 100.
   * </pre>
   *
   * <code>repeated int32 percentages = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The count of percentages.
   */
  int getPercentagesCount();
  /**
   *
   *
   * <pre>
   * Required. The percentage based deployments that will occur as a part of a
   * `Rollout`. List is expected in ascending order and each integer n is
   * 0 &lt;= n &lt; 100.
   * </pre>
   *
   * <code>repeated int32 percentages = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the element to return.
   * @return The percentages at the given index.
   */
  int getPercentages(int index);

  /**
   *
   *
   * <pre>
   * Whether to run verify tests after each percentage deployment.
   * </pre>
   *
   * <code>bool verify = 2;</code>
   *
   * @return The verify.
   */
  boolean getVerify();

  /**
   *
   *
   * <pre>
   * Optional. Configuration for the predeploy job of the first phase. If this
   * is not configured, there will be no predeploy job for this phase.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.Predeploy predeploy = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the predeploy field is set.
   */
  boolean hasPredeploy();
  /**
   *
   *
   * <pre>
   * Optional. Configuration for the predeploy job of the first phase. If this
   * is not configured, there will be no predeploy job for this phase.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.Predeploy predeploy = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The predeploy.
   */
  com.google.cloud.deploy.v1.Predeploy getPredeploy();
  /**
   *
   *
   * <pre>
   * Optional. Configuration for the predeploy job of the first phase. If this
   * is not configured, there will be no predeploy job for this phase.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.Predeploy predeploy = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.deploy.v1.PredeployOrBuilder getPredeployOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Configuration for the postdeploy job of the last phase. If this
   * is not configured, there will be no postdeploy job for this phase.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.Postdeploy postdeploy = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the postdeploy field is set.
   */
  boolean hasPostdeploy();
  /**
   *
   *
   * <pre>
   * Optional. Configuration for the postdeploy job of the last phase. If this
   * is not configured, there will be no postdeploy job for this phase.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.Postdeploy postdeploy = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The postdeploy.
   */
  com.google.cloud.deploy.v1.Postdeploy getPostdeploy();
  /**
   *
   *
   * <pre>
   * Optional. Configuration for the postdeploy job of the last phase. If this
   * is not configured, there will be no postdeploy job for this phase.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.Postdeploy postdeploy = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.deploy.v1.PostdeployOrBuilder getPostdeployOrBuilder();
}
