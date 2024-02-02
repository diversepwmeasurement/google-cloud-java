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
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

// Protobuf Java Version: 3.25.2
package com.google.recaptchaenterprise.v1;

public interface MetricsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recaptchaenterprise.v1.Metrics)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Identifier. The name of the metrics, in the format
   * `projects/{project}/keys/{key}/metrics`.
   * </pre>
   *
   * <code>
   * string name = 4 [(.google.api.field_behavior) = IDENTIFIER, (.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. Identifier. The name of the metrics, in the format
   * `projects/{project}/keys/{key}/metrics`.
   * </pre>
   *
   * <code>
   * string name = 4 [(.google.api.field_behavior) = IDENTIFIER, (.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Inclusive start time aligned to a day (UTC).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * Inclusive start time aligned to a day (UTC).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * Inclusive start time aligned to a day (UTC).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Metrics will be continuous and in order by dates, and in the granularity
   * of day. All Key types should have score-based data.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1.ScoreMetrics score_metrics = 2;</code>
   */
  java.util.List<com.google.recaptchaenterprise.v1.ScoreMetrics> getScoreMetricsList();
  /**
   *
   *
   * <pre>
   * Metrics will be continuous and in order by dates, and in the granularity
   * of day. All Key types should have score-based data.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1.ScoreMetrics score_metrics = 2;</code>
   */
  com.google.recaptchaenterprise.v1.ScoreMetrics getScoreMetrics(int index);
  /**
   *
   *
   * <pre>
   * Metrics will be continuous and in order by dates, and in the granularity
   * of day. All Key types should have score-based data.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1.ScoreMetrics score_metrics = 2;</code>
   */
  int getScoreMetricsCount();
  /**
   *
   *
   * <pre>
   * Metrics will be continuous and in order by dates, and in the granularity
   * of day. All Key types should have score-based data.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1.ScoreMetrics score_metrics = 2;</code>
   */
  java.util.List<? extends com.google.recaptchaenterprise.v1.ScoreMetricsOrBuilder>
      getScoreMetricsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Metrics will be continuous and in order by dates, and in the granularity
   * of day. All Key types should have score-based data.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1.ScoreMetrics score_metrics = 2;</code>
   */
  com.google.recaptchaenterprise.v1.ScoreMetricsOrBuilder getScoreMetricsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Metrics will be continuous and in order by dates, and in the granularity
   * of day. Only challenge-based keys (CHECKBOX, INVISIBLE), will have
   * challenge-based data.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1.ChallengeMetrics challenge_metrics = 3;
   * </code>
   */
  java.util.List<com.google.recaptchaenterprise.v1.ChallengeMetrics> getChallengeMetricsList();
  /**
   *
   *
   * <pre>
   * Metrics will be continuous and in order by dates, and in the granularity
   * of day. Only challenge-based keys (CHECKBOX, INVISIBLE), will have
   * challenge-based data.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1.ChallengeMetrics challenge_metrics = 3;
   * </code>
   */
  com.google.recaptchaenterprise.v1.ChallengeMetrics getChallengeMetrics(int index);
  /**
   *
   *
   * <pre>
   * Metrics will be continuous and in order by dates, and in the granularity
   * of day. Only challenge-based keys (CHECKBOX, INVISIBLE), will have
   * challenge-based data.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1.ChallengeMetrics challenge_metrics = 3;
   * </code>
   */
  int getChallengeMetricsCount();
  /**
   *
   *
   * <pre>
   * Metrics will be continuous and in order by dates, and in the granularity
   * of day. Only challenge-based keys (CHECKBOX, INVISIBLE), will have
   * challenge-based data.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1.ChallengeMetrics challenge_metrics = 3;
   * </code>
   */
  java.util.List<? extends com.google.recaptchaenterprise.v1.ChallengeMetricsOrBuilder>
      getChallengeMetricsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Metrics will be continuous and in order by dates, and in the granularity
   * of day. Only challenge-based keys (CHECKBOX, INVISIBLE), will have
   * challenge-based data.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1.ChallengeMetrics challenge_metrics = 3;
   * </code>
   */
  com.google.recaptchaenterprise.v1.ChallengeMetricsOrBuilder getChallengeMetricsOrBuilder(
      int index);
}
