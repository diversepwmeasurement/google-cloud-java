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
// source: google/cloud/orchestration/airflow/service/v1beta1/image_versions.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.orchestration.airflow.service.v1beta1;

public interface ImageVersionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orchestration.airflow.service.v1beta1.ImageVersion)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The string identifier of the ImageVersion, in the form:
   * "composer-x.y.z-airflow-a.b.c"
   * </pre>
   *
   * <code>string image_version_id = 1;</code>
   *
   * @return The imageVersionId.
   */
  java.lang.String getImageVersionId();
  /**
   *
   *
   * <pre>
   * The string identifier of the ImageVersion, in the form:
   * "composer-x.y.z-airflow-a.b.c"
   * </pre>
   *
   * <code>string image_version_id = 1;</code>
   *
   * @return The bytes for imageVersionId.
   */
  com.google.protobuf.ByteString getImageVersionIdBytes();

  /**
   *
   *
   * <pre>
   * Whether this is the default ImageVersion used by Composer during
   * environment creation if no input ImageVersion is specified.
   * </pre>
   *
   * <code>bool is_default = 2;</code>
   *
   * @return The isDefault.
   */
  boolean getIsDefault();

  /**
   *
   *
   * <pre>
   * supported python versions
   * </pre>
   *
   * <code>repeated string supported_python_versions = 3;</code>
   *
   * @return A list containing the supportedPythonVersions.
   */
  java.util.List<java.lang.String> getSupportedPythonVersionsList();
  /**
   *
   *
   * <pre>
   * supported python versions
   * </pre>
   *
   * <code>repeated string supported_python_versions = 3;</code>
   *
   * @return The count of supportedPythonVersions.
   */
  int getSupportedPythonVersionsCount();
  /**
   *
   *
   * <pre>
   * supported python versions
   * </pre>
   *
   * <code>repeated string supported_python_versions = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The supportedPythonVersions at the given index.
   */
  java.lang.String getSupportedPythonVersions(int index);
  /**
   *
   *
   * <pre>
   * supported python versions
   * </pre>
   *
   * <code>repeated string supported_python_versions = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the supportedPythonVersions at the given index.
   */
  com.google.protobuf.ByteString getSupportedPythonVersionsBytes(int index);

  /**
   *
   *
   * <pre>
   * The date of the version release.
   * </pre>
   *
   * <code>.google.type.Date release_date = 4;</code>
   *
   * @return Whether the releaseDate field is set.
   */
  boolean hasReleaseDate();
  /**
   *
   *
   * <pre>
   * The date of the version release.
   * </pre>
   *
   * <code>.google.type.Date release_date = 4;</code>
   *
   * @return The releaseDate.
   */
  com.google.type.Date getReleaseDate();
  /**
   *
   *
   * <pre>
   * The date of the version release.
   * </pre>
   *
   * <code>.google.type.Date release_date = 4;</code>
   */
  com.google.type.DateOrBuilder getReleaseDateOrBuilder();

  /**
   *
   *
   * <pre>
   * Whether it is impossible to create an environment with the image version.
   * </pre>
   *
   * <code>bool creation_disabled = 5;</code>
   *
   * @return The creationDisabled.
   */
  boolean getCreationDisabled();

  /**
   *
   *
   * <pre>
   * Whether it is impossible to upgrade an environment running with the image
   * version.
   * </pre>
   *
   * <code>bool upgrade_disabled = 6;</code>
   *
   * @return The upgradeDisabled.
   */
  boolean getUpgradeDisabled();
}
