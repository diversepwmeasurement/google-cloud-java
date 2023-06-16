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
// source: google/cloud/bigquery/migration/v2/migration_metrics.proto

package com.google.cloud.bigquery.migration.v2;

public interface TimeSeriesOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.migration.v2.TimeSeries)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the metric.
   *
   * If the metric is not known by the service yet, it will be auto-created.
   * </pre>
   *
   * <code>string metric = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The metric.
   */
  java.lang.String getMetric();
  /**
   *
   *
   * <pre>
   * Required. The name of the metric.
   *
   * If the metric is not known by the service yet, it will be auto-created.
   * </pre>
   *
   * <code>string metric = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for metric.
   */
  com.google.protobuf.ByteString getMetricBytes();

  /**
   *
   *
   * <pre>
   * Required. The value type of the time series.
   * </pre>
   *
   * <code>
   * .google.api.MetricDescriptor.ValueType value_type = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for valueType.
   */
  int getValueTypeValue();
  /**
   *
   *
   * <pre>
   * Required. The value type of the time series.
   * </pre>
   *
   * <code>
   * .google.api.MetricDescriptor.ValueType value_type = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The valueType.
   */
  com.google.api.MetricDescriptor.ValueType getValueType();

  /**
   *
   *
   * <pre>
   * Optional. The metric kind of the time series.
   *
   * If present, it must be the same as the metric kind of the associated
   * metric. If the associated metric's descriptor must be auto-created, then
   * this field specifies the metric kind of the new descriptor and must be
   * either `GAUGE` (the default) or `CUMULATIVE`.
   * </pre>
   *
   * <code>
   * .google.api.MetricDescriptor.MetricKind metric_kind = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for metricKind.
   */
  int getMetricKindValue();
  /**
   *
   *
   * <pre>
   * Optional. The metric kind of the time series.
   *
   * If present, it must be the same as the metric kind of the associated
   * metric. If the associated metric's descriptor must be auto-created, then
   * this field specifies the metric kind of the new descriptor and must be
   * either `GAUGE` (the default) or `CUMULATIVE`.
   * </pre>
   *
   * <code>
   * .google.api.MetricDescriptor.MetricKind metric_kind = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The metricKind.
   */
  com.google.api.MetricDescriptor.MetricKind getMetricKind();

  /**
   *
   *
   * <pre>
   * Required. The data points of this time series. When listing time series,
   * points are returned in reverse time order.
   *
   * When creating a time series, this field must contain exactly one point and
   * the point's type must be the same as the value type of the associated
   * metric. If the associated metric's descriptor must be auto-created, then
   * the value type of the descriptor is determined by the point's type, which
   * must be `BOOL`, `INT64`, `DOUBLE`, or `DISTRIBUTION`.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.bigquery.migration.v2.Point points = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.bigquery.migration.v2.Point> getPointsList();
  /**
   *
   *
   * <pre>
   * Required. The data points of this time series. When listing time series,
   * points are returned in reverse time order.
   *
   * When creating a time series, this field must contain exactly one point and
   * the point's type must be the same as the value type of the associated
   * metric. If the associated metric's descriptor must be auto-created, then
   * the value type of the descriptor is determined by the point's type, which
   * must be `BOOL`, `INT64`, `DOUBLE`, or `DISTRIBUTION`.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.bigquery.migration.v2.Point points = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.bigquery.migration.v2.Point getPoints(int index);
  /**
   *
   *
   * <pre>
   * Required. The data points of this time series. When listing time series,
   * points are returned in reverse time order.
   *
   * When creating a time series, this field must contain exactly one point and
   * the point's type must be the same as the value type of the associated
   * metric. If the associated metric's descriptor must be auto-created, then
   * the value type of the descriptor is determined by the point's type, which
   * must be `BOOL`, `INT64`, `DOUBLE`, or `DISTRIBUTION`.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.bigquery.migration.v2.Point points = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getPointsCount();
  /**
   *
   *
   * <pre>
   * Required. The data points of this time series. When listing time series,
   * points are returned in reverse time order.
   *
   * When creating a time series, this field must contain exactly one point and
   * the point's type must be the same as the value type of the associated
   * metric. If the associated metric's descriptor must be auto-created, then
   * the value type of the descriptor is determined by the point's type, which
   * must be `BOOL`, `INT64`, `DOUBLE`, or `DISTRIBUTION`.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.bigquery.migration.v2.Point points = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.cloud.bigquery.migration.v2.PointOrBuilder>
      getPointsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. The data points of this time series. When listing time series,
   * points are returned in reverse time order.
   *
   * When creating a time series, this field must contain exactly one point and
   * the point's type must be the same as the value type of the associated
   * metric. If the associated metric's descriptor must be auto-created, then
   * the value type of the descriptor is determined by the point's type, which
   * must be `BOOL`, `INT64`, `DOUBLE`, or `DISTRIBUTION`.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.bigquery.migration.v2.Point points = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.bigquery.migration.v2.PointOrBuilder getPointsOrBuilder(int index);
}
