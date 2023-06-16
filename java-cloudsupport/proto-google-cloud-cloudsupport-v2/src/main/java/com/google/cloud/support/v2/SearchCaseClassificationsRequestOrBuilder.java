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
// source: google/cloud/support/v2/case_service.proto

package com.google.cloud.support.v2;

public interface SearchCaseClassificationsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.support.v2.SearchCaseClassificationsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * An expression written in the Google Cloud filter language. If non-empty,
   * then only cases whose fields match the filter are returned. If empty, then
   * no messages are filtered out.
   * </pre>
   *
   * <code>string query = 1;</code>
   *
   * @return The query.
   */
  java.lang.String getQuery();
  /**
   *
   *
   * <pre>
   * An expression written in the Google Cloud filter language. If non-empty,
   * then only cases whose fields match the filter are returned. If empty, then
   * no messages are filtered out.
   * </pre>
   *
   * <code>string query = 1;</code>
   *
   * @return The bytes for query.
   */
  com.google.protobuf.ByteString getQueryBytes();

  /**
   *
   *
   * <pre>
   * The maximum number of cases fetched with each request.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * A token identifying the page of results to return. If unspecified, the
   * first page is retrieved.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * A token identifying the page of results to return. If unspecified, the
   * first page is retrieved.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
