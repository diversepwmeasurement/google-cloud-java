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
// source: google/cloud/orchestration/airflow/service/v1/environments.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.orchestration.airflow.service.v1;

public interface EncryptionConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orchestration.airflow.service.v1.EncryptionConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Customer-managed Encryption Key available through Google's Key
   * Management Service. Cannot be updated. If not specified, Google-managed key
   * will be used.
   * </pre>
   *
   * <code>string kms_key_name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The kmsKeyName.
   */
  java.lang.String getKmsKeyName();
  /**
   *
   *
   * <pre>
   * Optional. Customer-managed Encryption Key available through Google's Key
   * Management Service. Cannot be updated. If not specified, Google-managed key
   * will be used.
   * </pre>
   *
   * <code>string kms_key_name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for kmsKeyName.
   */
  com.google.protobuf.ByteString getKmsKeyNameBytes();
}
