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

public interface RetrieveLegacySecretKeyResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The secret key (also known as shared secret) authorizes communication
   * between your application backend and the reCAPTCHA Enterprise server to
   * create an assessment.
   * The secret key needs to be kept safe for security purposes.
   * </pre>
   *
   * <code>string legacy_secret_key = 1;</code>
   *
   * @return The legacySecretKey.
   */
  java.lang.String getLegacySecretKey();
  /**
   *
   *
   * <pre>
   * The secret key (also known as shared secret) authorizes communication
   * between your application backend and the reCAPTCHA Enterprise server to
   * create an assessment.
   * The secret key needs to be kept safe for security purposes.
   * </pre>
   *
   * <code>string legacy_secret_key = 1;</code>
   *
   * @return The bytes for legacySecretKey.
   */
  com.google.protobuf.ByteString getLegacySecretKeyBytes();
}
