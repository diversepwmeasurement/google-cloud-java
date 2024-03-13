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
// source: google/cloud/discoveryengine/v1alpha/estimate_billing_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.discoveryengine.v1alpha;

public interface EstimateDataSizeRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1alpha.EstimateDataSizeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Website data.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.EstimateDataSizeRequest.WebsiteDataSource website_data_source = 2;
   * </code>
   *
   * @return Whether the websiteDataSource field is set.
   */
  boolean hasWebsiteDataSource();
  /**
   *
   *
   * <pre>
   * Website data.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.EstimateDataSizeRequest.WebsiteDataSource website_data_source = 2;
   * </code>
   *
   * @return The websiteDataSource.
   */
  com.google.cloud.discoveryengine.v1alpha.EstimateDataSizeRequest.WebsiteDataSource
      getWebsiteDataSource();
  /**
   *
   *
   * <pre>
   * Website data.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.EstimateDataSizeRequest.WebsiteDataSource website_data_source = 2;
   * </code>
   */
  com.google.cloud.discoveryengine.v1alpha.EstimateDataSizeRequest.WebsiteDataSourceOrBuilder
      getWebsiteDataSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Structured or unstructured data.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.EstimateDataSizeRequest.FileDataSource file_data_source = 3;
   * </code>
   *
   * @return Whether the fileDataSource field is set.
   */
  boolean hasFileDataSource();
  /**
   *
   *
   * <pre>
   * Structured or unstructured data.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.EstimateDataSizeRequest.FileDataSource file_data_source = 3;
   * </code>
   *
   * @return The fileDataSource.
   */
  com.google.cloud.discoveryengine.v1alpha.EstimateDataSizeRequest.FileDataSource
      getFileDataSource();
  /**
   *
   *
   * <pre>
   * Structured or unstructured data.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.EstimateDataSizeRequest.FileDataSource file_data_source = 3;
   * </code>
   */
  com.google.cloud.discoveryengine.v1alpha.EstimateDataSizeRequest.FileDataSourceOrBuilder
      getFileDataSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Full resource name of the location, such as
   * `projects/{project}/locations/{location}`.
   * </pre>
   *
   * <code>
   * string location = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The location.
   */
  java.lang.String getLocation();
  /**
   *
   *
   * <pre>
   * Required. Full resource name of the location, such as
   * `projects/{project}/locations/{location}`.
   * </pre>
   *
   * <code>
   * string location = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString getLocationBytes();

  com.google.cloud.discoveryengine.v1alpha.EstimateDataSizeRequest.DataSourceCase
      getDataSourceCase();
}
