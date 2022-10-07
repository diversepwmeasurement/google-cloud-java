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
// source: google/analytics/data/v1beta/analytics_data_api.proto

package com.google.analytics.data.v1beta;

public interface RunRealtimeReportRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1beta.RunRealtimeReportRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A Google Analytics GA4 property identifier whose events are tracked.
   * Specified in the URL path and not the body. To learn more, see [where to
   * find your Property
   * ID](https://developers.google.com/analytics/devguides/reporting/data/v1/property-id).
   * Example: properties/1234
   * </pre>
   *
   * <code>string property = 1;</code>
   *
   * @return The property.
   */
  java.lang.String getProperty();
  /**
   *
   *
   * <pre>
   * A Google Analytics GA4 property identifier whose events are tracked.
   * Specified in the URL path and not the body. To learn more, see [where to
   * find your Property
   * ID](https://developers.google.com/analytics/devguides/reporting/data/v1/property-id).
   * Example: properties/1234
   * </pre>
   *
   * <code>string property = 1;</code>
   *
   * @return The bytes for property.
   */
  com.google.protobuf.ByteString getPropertyBytes();

  /**
   *
   *
   * <pre>
   * The dimensions requested and displayed.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.Dimension dimensions = 2;</code>
   */
  java.util.List<com.google.analytics.data.v1beta.Dimension> getDimensionsList();
  /**
   *
   *
   * <pre>
   * The dimensions requested and displayed.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.Dimension dimensions = 2;</code>
   */
  com.google.analytics.data.v1beta.Dimension getDimensions(int index);
  /**
   *
   *
   * <pre>
   * The dimensions requested and displayed.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.Dimension dimensions = 2;</code>
   */
  int getDimensionsCount();
  /**
   *
   *
   * <pre>
   * The dimensions requested and displayed.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.Dimension dimensions = 2;</code>
   */
  java.util.List<? extends com.google.analytics.data.v1beta.DimensionOrBuilder>
      getDimensionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The dimensions requested and displayed.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.Dimension dimensions = 2;</code>
   */
  com.google.analytics.data.v1beta.DimensionOrBuilder getDimensionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The metrics requested and displayed.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.Metric metrics = 3;</code>
   */
  java.util.List<com.google.analytics.data.v1beta.Metric> getMetricsList();
  /**
   *
   *
   * <pre>
   * The metrics requested and displayed.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.Metric metrics = 3;</code>
   */
  com.google.analytics.data.v1beta.Metric getMetrics(int index);
  /**
   *
   *
   * <pre>
   * The metrics requested and displayed.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.Metric metrics = 3;</code>
   */
  int getMetricsCount();
  /**
   *
   *
   * <pre>
   * The metrics requested and displayed.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.Metric metrics = 3;</code>
   */
  java.util.List<? extends com.google.analytics.data.v1beta.MetricOrBuilder>
      getMetricsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The metrics requested and displayed.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.Metric metrics = 3;</code>
   */
  com.google.analytics.data.v1beta.MetricOrBuilder getMetricsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The filter clause of dimensions. Metrics cannot be used in this filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1beta.FilterExpression dimension_filter = 4;</code>
   *
   * @return Whether the dimensionFilter field is set.
   */
  boolean hasDimensionFilter();
  /**
   *
   *
   * <pre>
   * The filter clause of dimensions. Metrics cannot be used in this filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1beta.FilterExpression dimension_filter = 4;</code>
   *
   * @return The dimensionFilter.
   */
  com.google.analytics.data.v1beta.FilterExpression getDimensionFilter();
  /**
   *
   *
   * <pre>
   * The filter clause of dimensions. Metrics cannot be used in this filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1beta.FilterExpression dimension_filter = 4;</code>
   */
  com.google.analytics.data.v1beta.FilterExpressionOrBuilder getDimensionFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * The filter clause of metrics. Applied at post aggregation phase, similar to
   * SQL having-clause. Dimensions cannot be used in this filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1beta.FilterExpression metric_filter = 5;</code>
   *
   * @return Whether the metricFilter field is set.
   */
  boolean hasMetricFilter();
  /**
   *
   *
   * <pre>
   * The filter clause of metrics. Applied at post aggregation phase, similar to
   * SQL having-clause. Dimensions cannot be used in this filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1beta.FilterExpression metric_filter = 5;</code>
   *
   * @return The metricFilter.
   */
  com.google.analytics.data.v1beta.FilterExpression getMetricFilter();
  /**
   *
   *
   * <pre>
   * The filter clause of metrics. Applied at post aggregation phase, similar to
   * SQL having-clause. Dimensions cannot be used in this filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1beta.FilterExpression metric_filter = 5;</code>
   */
  com.google.analytics.data.v1beta.FilterExpressionOrBuilder getMetricFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * The number of rows to return. If unspecified, 10,000 rows are returned. The
   * API returns a maximum of 100,000 rows per request, no matter how many you
   * ask for. `limit` must be positive.
   * The API can also return fewer rows than the requested `limit`, if there
   * aren't as many dimension values as the `limit`. For instance, there are
   * fewer than 300 possible values for the dimension `country`, so when
   * reporting on only `country`, you can't get more than 300 rows, even if you
   * set `limit` to a higher value.
   * </pre>
   *
   * <code>int64 limit = 6;</code>
   *
   * @return The limit.
   */
  long getLimit();

  /**
   *
   *
   * <pre>
   * Aggregation of metrics. Aggregated metric values will be shown in rows
   * where the dimension_values are set to "RESERVED_(MetricAggregation)".
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.MetricAggregation metric_aggregations = 7;</code>
   *
   * @return A list containing the metricAggregations.
   */
  java.util.List<com.google.analytics.data.v1beta.MetricAggregation> getMetricAggregationsList();
  /**
   *
   *
   * <pre>
   * Aggregation of metrics. Aggregated metric values will be shown in rows
   * where the dimension_values are set to "RESERVED_(MetricAggregation)".
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.MetricAggregation metric_aggregations = 7;</code>
   *
   * @return The count of metricAggregations.
   */
  int getMetricAggregationsCount();
  /**
   *
   *
   * <pre>
   * Aggregation of metrics. Aggregated metric values will be shown in rows
   * where the dimension_values are set to "RESERVED_(MetricAggregation)".
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.MetricAggregation metric_aggregations = 7;</code>
   *
   * @param index The index of the element to return.
   * @return The metricAggregations at the given index.
   */
  com.google.analytics.data.v1beta.MetricAggregation getMetricAggregations(int index);
  /**
   *
   *
   * <pre>
   * Aggregation of metrics. Aggregated metric values will be shown in rows
   * where the dimension_values are set to "RESERVED_(MetricAggregation)".
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.MetricAggregation metric_aggregations = 7;</code>
   *
   * @return A list containing the enum numeric values on the wire for metricAggregations.
   */
  java.util.List<java.lang.Integer> getMetricAggregationsValueList();
  /**
   *
   *
   * <pre>
   * Aggregation of metrics. Aggregated metric values will be shown in rows
   * where the dimension_values are set to "RESERVED_(MetricAggregation)".
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.MetricAggregation metric_aggregations = 7;</code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of metricAggregations at the given index.
   */
  int getMetricAggregationsValue(int index);

  /**
   *
   *
   * <pre>
   * Specifies how rows are ordered in the response.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.OrderBy order_bys = 8;</code>
   */
  java.util.List<com.google.analytics.data.v1beta.OrderBy> getOrderBysList();
  /**
   *
   *
   * <pre>
   * Specifies how rows are ordered in the response.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.OrderBy order_bys = 8;</code>
   */
  com.google.analytics.data.v1beta.OrderBy getOrderBys(int index);
  /**
   *
   *
   * <pre>
   * Specifies how rows are ordered in the response.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.OrderBy order_bys = 8;</code>
   */
  int getOrderBysCount();
  /**
   *
   *
   * <pre>
   * Specifies how rows are ordered in the response.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.OrderBy order_bys = 8;</code>
   */
  java.util.List<? extends com.google.analytics.data.v1beta.OrderByOrBuilder>
      getOrderBysOrBuilderList();
  /**
   *
   *
   * <pre>
   * Specifies how rows are ordered in the response.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.OrderBy order_bys = 8;</code>
   */
  com.google.analytics.data.v1beta.OrderByOrBuilder getOrderBysOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Toggles whether to return the current state of this Analytics Property's
   * Realtime quota. Quota is returned in [PropertyQuota](#PropertyQuota).
   * </pre>
   *
   * <code>bool return_property_quota = 9;</code>
   *
   * @return The returnPropertyQuota.
   */
  boolean getReturnPropertyQuota();

  /**
   *
   *
   * <pre>
   * The minute ranges of event data to read. If unspecified, one minute range
   * for the last 30 minutes will be used. If multiple minute ranges are
   * requested, each response row will contain a zero based minute range index.
   * If two minute ranges overlap, the event data for the overlapping minutes is
   * included in the response rows for both minute ranges.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.MinuteRange minute_ranges = 10;</code>
   */
  java.util.List<com.google.analytics.data.v1beta.MinuteRange> getMinuteRangesList();
  /**
   *
   *
   * <pre>
   * The minute ranges of event data to read. If unspecified, one minute range
   * for the last 30 minutes will be used. If multiple minute ranges are
   * requested, each response row will contain a zero based minute range index.
   * If two minute ranges overlap, the event data for the overlapping minutes is
   * included in the response rows for both minute ranges.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.MinuteRange minute_ranges = 10;</code>
   */
  com.google.analytics.data.v1beta.MinuteRange getMinuteRanges(int index);
  /**
   *
   *
   * <pre>
   * The minute ranges of event data to read. If unspecified, one minute range
   * for the last 30 minutes will be used. If multiple minute ranges are
   * requested, each response row will contain a zero based minute range index.
   * If two minute ranges overlap, the event data for the overlapping minutes is
   * included in the response rows for both minute ranges.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.MinuteRange minute_ranges = 10;</code>
   */
  int getMinuteRangesCount();
  /**
   *
   *
   * <pre>
   * The minute ranges of event data to read. If unspecified, one minute range
   * for the last 30 minutes will be used. If multiple minute ranges are
   * requested, each response row will contain a zero based minute range index.
   * If two minute ranges overlap, the event data for the overlapping minutes is
   * included in the response rows for both minute ranges.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.MinuteRange minute_ranges = 10;</code>
   */
  java.util.List<? extends com.google.analytics.data.v1beta.MinuteRangeOrBuilder>
      getMinuteRangesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The minute ranges of event data to read. If unspecified, one minute range
   * for the last 30 minutes will be used. If multiple minute ranges are
   * requested, each response row will contain a zero based minute range index.
   * If two minute ranges overlap, the event data for the overlapping minutes is
   * included in the response rows for both minute ranges.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.MinuteRange minute_ranges = 10;</code>
   */
  com.google.analytics.data.v1beta.MinuteRangeOrBuilder getMinuteRangesOrBuilder(int index);
}
