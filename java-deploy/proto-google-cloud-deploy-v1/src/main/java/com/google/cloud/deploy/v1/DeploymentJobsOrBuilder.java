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

public interface DeploymentJobsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.DeploymentJobs)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The deploy Job. This is the deploy job in the phase.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.Job deploy_job = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the deployJob field is set.
   */
  boolean hasDeployJob();
  /**
   *
   *
   * <pre>
   * Output only. The deploy Job. This is the deploy job in the phase.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.Job deploy_job = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The deployJob.
   */
  com.google.cloud.deploy.v1.Job getDeployJob();
  /**
   *
   *
   * <pre>
   * Output only. The deploy Job. This is the deploy job in the phase.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.Job deploy_job = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.deploy.v1.JobOrBuilder getDeployJobOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The verify Job. Runs after a deploy if the deploy succeeds.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.Job verify_job = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the verifyJob field is set.
   */
  boolean hasVerifyJob();
  /**
   *
   *
   * <pre>
   * Output only. The verify Job. Runs after a deploy if the deploy succeeds.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.Job verify_job = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The verifyJob.
   */
  com.google.cloud.deploy.v1.Job getVerifyJob();
  /**
   *
   *
   * <pre>
   * Output only. The verify Job. Runs after a deploy if the deploy succeeds.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.Job verify_job = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.deploy.v1.JobOrBuilder getVerifyJobOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The predeploy Job, which is the first job on the phase.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.Job predeploy_job = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the predeployJob field is set.
   */
  boolean hasPredeployJob();
  /**
   *
   *
   * <pre>
   * Output only. The predeploy Job, which is the first job on the phase.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.Job predeploy_job = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The predeployJob.
   */
  com.google.cloud.deploy.v1.Job getPredeployJob();
  /**
   *
   *
   * <pre>
   * Output only. The predeploy Job, which is the first job on the phase.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.Job predeploy_job = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.deploy.v1.JobOrBuilder getPredeployJobOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The postdeploy Job, which is the last job on the phase.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.Job postdeploy_job = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the postdeployJob field is set.
   */
  boolean hasPostdeployJob();
  /**
   *
   *
   * <pre>
   * Output only. The postdeploy Job, which is the last job on the phase.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.Job postdeploy_job = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The postdeployJob.
   */
  com.google.cloud.deploy.v1.Job getPostdeployJob();
  /**
   *
   *
   * <pre>
   * Output only. The postdeploy Job, which is the last job on the phase.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.Job postdeploy_job = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.deploy.v1.JobOrBuilder getPostdeployJobOrBuilder();
}
