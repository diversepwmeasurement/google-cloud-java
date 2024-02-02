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
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

// Protobuf Java Version: 3.25.2
package com.google.recaptchaenterprise.v1;

public interface AndroidKeySettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recaptchaenterprise.v1.AndroidKeySettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. If set to true, allowed_package_names are not enforced.
   * </pre>
   *
   * <code>bool allow_all_package_names = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The allowAllPackageNames.
   */
  boolean getAllowAllPackageNames();

  /**
   *
   *
   * <pre>
   * Optional. Android package names of apps allowed to use the key.
   * Example: 'com.companyname.appname'
   * </pre>
   *
   * <code>repeated string allowed_package_names = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return A list containing the allowedPackageNames.
   */
  java.util.List<java.lang.String> getAllowedPackageNamesList();
  /**
   *
   *
   * <pre>
   * Optional. Android package names of apps allowed to use the key.
   * Example: 'com.companyname.appname'
   * </pre>
   *
   * <code>repeated string allowed_package_names = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The count of allowedPackageNames.
   */
  int getAllowedPackageNamesCount();
  /**
   *
   *
   * <pre>
   * Optional. Android package names of apps allowed to use the key.
   * Example: 'com.companyname.appname'
   * </pre>
   *
   * <code>repeated string allowed_package_names = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The allowedPackageNames at the given index.
   */
  java.lang.String getAllowedPackageNames(int index);
  /**
   *
   *
   * <pre>
   * Optional. Android package names of apps allowed to use the key.
   * Example: 'com.companyname.appname'
   * </pre>
   *
   * <code>repeated string allowed_package_names = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the allowedPackageNames at the given index.
   */
  com.google.protobuf.ByteString getAllowedPackageNamesBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. Set to true for keys that are used in an Android application that
   * is available for download in app stores in addition to the Google Play
   * Store.
   * </pre>
   *
   * <code>
   * bool support_non_google_app_store_distribution = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The supportNonGoogleAppStoreDistribution.
   */
  boolean getSupportNonGoogleAppStoreDistribution();
}
