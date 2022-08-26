/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/channel/v1/entitlements.proto

package com.google.cloud.channel.v1;

public interface CommitmentSettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.CommitmentSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Commitment start timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * Output only. Commitment start timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * Output only. Commitment start timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Commitment end timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * Output only. Commitment end timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * Output only. Commitment end timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Renewal settings applicable for a commitment-based Offer.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.RenewalSettings renewal_settings = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the renewalSettings field is set.
   */
  boolean hasRenewalSettings();
  /**
   *
   *
   * <pre>
   * Optional. Renewal settings applicable for a commitment-based Offer.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.RenewalSettings renewal_settings = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The renewalSettings.
   */
  com.google.cloud.channel.v1.RenewalSettings getRenewalSettings();
  /**
   *
   *
   * <pre>
   * Optional. Renewal settings applicable for a commitment-based Offer.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.RenewalSettings renewal_settings = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.channel.v1.RenewalSettingsOrBuilder getRenewalSettingsOrBuilder();
}