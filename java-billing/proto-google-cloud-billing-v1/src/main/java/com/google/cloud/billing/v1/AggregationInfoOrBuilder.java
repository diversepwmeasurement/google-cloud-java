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
// source: google/cloud/billing/v1/cloud_catalog.proto

package com.google.cloud.billing.v1;

public interface AggregationInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.billing.v1.AggregationInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.cloud.billing.v1.AggregationInfo.AggregationLevel aggregation_level = 1;</code>
   *
   * @return The enum numeric value on the wire for aggregationLevel.
   */
  int getAggregationLevelValue();
  /**
   * <code>.google.cloud.billing.v1.AggregationInfo.AggregationLevel aggregation_level = 1;</code>
   *
   * @return The aggregationLevel.
   */
  com.google.cloud.billing.v1.AggregationInfo.AggregationLevel getAggregationLevel();

  /**
   * <code>.google.cloud.billing.v1.AggregationInfo.AggregationInterval aggregation_interval = 2;
   * </code>
   *
   * @return The enum numeric value on the wire for aggregationInterval.
   */
  int getAggregationIntervalValue();
  /**
   * <code>.google.cloud.billing.v1.AggregationInfo.AggregationInterval aggregation_interval = 2;
   * </code>
   *
   * @return The aggregationInterval.
   */
  com.google.cloud.billing.v1.AggregationInfo.AggregationInterval getAggregationInterval();

  /**
   *
   *
   * <pre>
   * The number of intervals to aggregate over.
   * Example: If aggregation_level is "DAILY" and aggregation_count is 14,
   * aggregation will be over 14 days.
   * </pre>
   *
   * <code>int32 aggregation_count = 3;</code>
   *
   * @return The aggregationCount.
   */
  int getAggregationCount();
}
