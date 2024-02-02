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
// source: google/cloud/privatecatalog/v1beta1/private_catalog.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.privatecatalog.v1beta1;

public interface SearchVersionsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.privatecatalog.v1beta1.SearchVersionsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the resource context. See [SearchCatalogsRequest.resource][google.cloud.privatecatalog.v1beta1.SearchCatalogsRequest.resource]
   * for details.
   * </pre>
   *
   * <code>string resource = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The resource.
   */
  java.lang.String getResource();
  /**
   *
   *
   * <pre>
   * Required. The name of the resource context. See [SearchCatalogsRequest.resource][google.cloud.privatecatalog.v1beta1.SearchCatalogsRequest.resource]
   * for details.
   * </pre>
   *
   * <code>string resource = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for resource.
   */
  com.google.protobuf.ByteString getResourceBytes();

  /**
   *
   *
   * <pre>
   * Required. The query to filter the versions.
   *
   * The supported queries are:
   * * List versions under a product:
   * `parent=catalogs/{catalog}/products/{product}`
   * * Get a version by name:
   * `name=catalogs/{catalog}/products/{product}/versions/{version}`
   * </pre>
   *
   * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The query.
   */
  java.lang.String getQuery();
  /**
   *
   *
   * <pre>
   * Required. The query to filter the versions.
   *
   * The supported queries are:
   * * List versions under a product:
   * `parent=catalogs/{catalog}/products/{product}`
   * * Get a version by name:
   * `name=catalogs/{catalog}/products/{product}/versions/{version}`
   * </pre>
   *
   * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for query.
   */
  com.google.protobuf.ByteString getQueryBytes();

  /**
   *
   *
   * <pre>
   * The maximum number of entries that are requested.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * A pagination token returned from a previous call to SearchVersions
   * that indicates where this listing should continue from.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * A pagination token returned from a previous call to SearchVersions
   * that indicates where this listing should continue from.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
