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
// source: google/cloud/resourcemanager/v3/organizations.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.resourcemanager.v3;

public interface SearchOrganizationsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.resourcemanager.v3.SearchOrganizationsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The maximum number of organizations to return in the response.
   * The server can return fewer organizations than requested. If unspecified,
   * server picks an appropriate default.
   * </pre>
   *
   * <code>int32 page_size = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. A pagination token returned from a previous call to
   * `SearchOrganizations` that indicates from where listing should continue.
   * </pre>
   *
   * <code>string page_token = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. A pagination token returned from a previous call to
   * `SearchOrganizations` that indicates from where listing should continue.
   * </pre>
   *
   * <code>string page_token = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Optional. An optional query string used to filter the Organizations to
   * return in the response. Query rules are case-insensitive.
   *
   *
   * ```
   * | Field            | Description                                |
   * |------------------|--------------------------------------------|
   * | directoryCustomerId, owner.directoryCustomerId | Filters by directory
   * customer id. |
   * | domain           | Filters by domain.                         |
   * ```
   *
   * Organizations may be queried by `directoryCustomerId` or by
   * `domain`, where the domain is a G Suite domain, for example:
   *
   * * Query `directorycustomerid:123456789` returns Organization
   * resources with `owner.directory_customer_id` equal to `123456789`.
   * * Query `domain:google.com` returns Organization resources corresponding
   * to the domain `google.com`.
   * </pre>
   *
   * <code>string query = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The query.
   */
  java.lang.String getQuery();
  /**
   *
   *
   * <pre>
   * Optional. An optional query string used to filter the Organizations to
   * return in the response. Query rules are case-insensitive.
   *
   *
   * ```
   * | Field            | Description                                |
   * |------------------|--------------------------------------------|
   * | directoryCustomerId, owner.directoryCustomerId | Filters by directory
   * customer id. |
   * | domain           | Filters by domain.                         |
   * ```
   *
   * Organizations may be queried by `directoryCustomerId` or by
   * `domain`, where the domain is a G Suite domain, for example:
   *
   * * Query `directorycustomerid:123456789` returns Organization
   * resources with `owner.directory_customer_id` equal to `123456789`.
   * * Query `domain:google.com` returns Organization resources corresponding
   * to the domain `google.com`.
   * </pre>
   *
   * <code>string query = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for query.
   */
  com.google.protobuf.ByteString getQueryBytes();
}
