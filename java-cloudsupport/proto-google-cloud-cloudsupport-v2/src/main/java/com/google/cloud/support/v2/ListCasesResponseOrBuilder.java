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

public interface ListCasesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.support.v2.ListCasesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of cases associated with the Google Cloud Resource, after any
   * filters have been applied.
   * </pre>
   *
   * <code>repeated .google.cloud.support.v2.Case cases = 1;</code>
   */
  java.util.List<com.google.cloud.support.v2.Case> getCasesList();
  /**
   *
   *
   * <pre>
   * The list of cases associated with the Google Cloud Resource, after any
   * filters have been applied.
   * </pre>
   *
   * <code>repeated .google.cloud.support.v2.Case cases = 1;</code>
   */
  com.google.cloud.support.v2.Case getCases(int index);
  /**
   *
   *
   * <pre>
   * The list of cases associated with the Google Cloud Resource, after any
   * filters have been applied.
   * </pre>
   *
   * <code>repeated .google.cloud.support.v2.Case cases = 1;</code>
   */
  int getCasesCount();
  /**
   *
   *
   * <pre>
   * The list of cases associated with the Google Cloud Resource, after any
   * filters have been applied.
   * </pre>
   *
   * <code>repeated .google.cloud.support.v2.Case cases = 1;</code>
   */
  java.util.List<? extends com.google.cloud.support.v2.CaseOrBuilder> getCasesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of cases associated with the Google Cloud Resource, after any
   * filters have been applied.
   * </pre>
   *
   * <code>repeated .google.cloud.support.v2.Case cases = 1;</code>
   */
  com.google.cloud.support.v2.CaseOrBuilder getCasesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results. This should be set in the
   * `page_token` field of the subsequent `ListCasesRequest` message that is
   * issued. If unspecified, there are no more results to retrieve.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results. This should be set in the
   * `page_token` field of the subsequent `ListCasesRequest` message that is
   * issued. If unspecified, there are no more results to retrieve.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
