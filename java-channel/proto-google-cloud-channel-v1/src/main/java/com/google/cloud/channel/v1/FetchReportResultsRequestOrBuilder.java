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
// source: google/cloud/channel/v1/reports_service.proto

package com.google.cloud.channel.v1;

public interface FetchReportResultsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.FetchReportResultsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The report job created by
   * [CloudChannelReportsService.RunReportJob][google.cloud.channel.v1.CloudChannelReportsService.RunReportJob].
   * Report_job uses the format:
   * accounts/{account_id}/reportJobs/{report_job_id}
   * </pre>
   *
   * <code>
   * string report_job = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The reportJob.
   */
  java.lang.String getReportJob();
  /**
   *
   *
   * <pre>
   * Required. The report job created by
   * [CloudChannelReportsService.RunReportJob][google.cloud.channel.v1.CloudChannelReportsService.RunReportJob].
   * Report_job uses the format:
   * accounts/{account_id}/reportJobs/{report_job_id}
   * </pre>
   *
   * <code>
   * string report_job = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for reportJob.
   */
  com.google.protobuf.ByteString getReportJobBytes();

  /**
   *
   *
   * <pre>
   * Optional. Requested page size of the report. The server may return fewer
   * results than requested. If you don't specify a page size, the server uses a
   * sensible default (may change over time).
   *
   * The maximum value is 30,000; the server will change larger values to
   * 30,000.
   * </pre>
   *
   * <code>int32 page_size = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. A token that specifies a page of results beyond the first page.
   * Obtained through
   * [FetchReportResultsResponse.next_page_token][google.cloud.channel.v1.FetchReportResultsResponse.next_page_token]
   * of the previous
   * [CloudChannelReportsService.FetchReportResults][google.cloud.channel.v1.CloudChannelReportsService.FetchReportResults]
   * call.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. A token that specifies a page of results beyond the first page.
   * Obtained through
   * [FetchReportResultsResponse.next_page_token][google.cloud.channel.v1.FetchReportResultsResponse.next_page_token]
   * of the previous
   * [CloudChannelReportsService.FetchReportResults][google.cloud.channel.v1.CloudChannelReportsService.FetchReportResults]
   * call.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Optional. List of keys specifying which report partitions to return.
   * If empty, returns all partitions.
   * </pre>
   *
   * <code>repeated string partition_keys = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the partitionKeys.
   */
  java.util.List<java.lang.String> getPartitionKeysList();
  /**
   *
   *
   * <pre>
   * Optional. List of keys specifying which report partitions to return.
   * If empty, returns all partitions.
   * </pre>
   *
   * <code>repeated string partition_keys = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of partitionKeys.
   */
  int getPartitionKeysCount();
  /**
   *
   *
   * <pre>
   * Optional. List of keys specifying which report partitions to return.
   * If empty, returns all partitions.
   * </pre>
   *
   * <code>repeated string partition_keys = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The partitionKeys at the given index.
   */
  java.lang.String getPartitionKeys(int index);
  /**
   *
   *
   * <pre>
   * Optional. List of keys specifying which report partitions to return.
   * If empty, returns all partitions.
   * </pre>
   *
   * <code>repeated string partition_keys = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the partitionKeys at the given index.
   */
  com.google.protobuf.ByteString getPartitionKeysBytes(int index);
}
