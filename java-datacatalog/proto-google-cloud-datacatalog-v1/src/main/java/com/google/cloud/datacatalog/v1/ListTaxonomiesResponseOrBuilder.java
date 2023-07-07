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
// source: google/cloud/datacatalog/v1/policytagmanager.proto

package com.google.cloud.datacatalog.v1;

public interface ListTaxonomiesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.ListTaxonomiesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Taxonomies that the project contains.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.Taxonomy taxonomies = 1;</code>
   */
  java.util.List<com.google.cloud.datacatalog.v1.Taxonomy> getTaxonomiesList();
  /**
   *
   *
   * <pre>
   * Taxonomies that the project contains.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.Taxonomy taxonomies = 1;</code>
   */
  com.google.cloud.datacatalog.v1.Taxonomy getTaxonomies(int index);
  /**
   *
   *
   * <pre>
   * Taxonomies that the project contains.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.Taxonomy taxonomies = 1;</code>
   */
  int getTaxonomiesCount();
  /**
   *
   *
   * <pre>
   * Taxonomies that the project contains.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.Taxonomy taxonomies = 1;</code>
   */
  java.util.List<? extends com.google.cloud.datacatalog.v1.TaxonomyOrBuilder>
      getTaxonomiesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Taxonomies that the project contains.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.Taxonomy taxonomies = 1;</code>
   */
  com.google.cloud.datacatalog.v1.TaxonomyOrBuilder getTaxonomiesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Pagination token of the next results page. Empty if there are no
   * more results in the list.
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
   * Pagination token of the next results page. Empty if there are no
   * more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
