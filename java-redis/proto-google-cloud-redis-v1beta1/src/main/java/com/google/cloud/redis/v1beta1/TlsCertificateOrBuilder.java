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
// source: google/cloud/redis/v1beta1/cloud_redis.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.redis.v1beta1;

public interface TlsCertificateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.redis.v1beta1.TlsCertificate)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Serial number, as extracted from the certificate.
   * </pre>
   *
   * <code>string serial_number = 1;</code>
   *
   * @return The serialNumber.
   */
  java.lang.String getSerialNumber();
  /**
   *
   *
   * <pre>
   * Serial number, as extracted from the certificate.
   * </pre>
   *
   * <code>string serial_number = 1;</code>
   *
   * @return The bytes for serialNumber.
   */
  com.google.protobuf.ByteString getSerialNumberBytes();

  /**
   *
   *
   * <pre>
   * PEM representation.
   * </pre>
   *
   * <code>string cert = 2;</code>
   *
   * @return The cert.
   */
  java.lang.String getCert();
  /**
   *
   *
   * <pre>
   * PEM representation.
   * </pre>
   *
   * <code>string cert = 2;</code>
   *
   * @return The bytes for cert.
   */
  com.google.protobuf.ByteString getCertBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time when the certificate was created in [RFC
   * 3339](https://tools.ietf.org/html/rfc3339) format, for example
   * `2020-05-18T00:00:00.094Z`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the certificate was created in [RFC
   * 3339](https://tools.ietf.org/html/rfc3339) format, for example
   * `2020-05-18T00:00:00.094Z`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the certificate was created in [RFC
   * 3339](https://tools.ietf.org/html/rfc3339) format, for example
   * `2020-05-18T00:00:00.094Z`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time when the certificate expires in [RFC
   * 3339](https://tools.ietf.org/html/rfc3339) format, for example
   * `2020-05-18T00:00:00.094Z`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the expireTime field is set.
   */
  boolean hasExpireTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the certificate expires in [RFC
   * 3339](https://tools.ietf.org/html/rfc3339) format, for example
   * `2020-05-18T00:00:00.094Z`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The expireTime.
   */
  com.google.protobuf.Timestamp getExpireTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the certificate expires in [RFC
   * 3339](https://tools.ietf.org/html/rfc3339) format, for example
   * `2020-05-18T00:00:00.094Z`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getExpireTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Sha1 Fingerprint of the certificate.
   * </pre>
   *
   * <code>string sha1_fingerprint = 5;</code>
   *
   * @return The sha1Fingerprint.
   */
  java.lang.String getSha1Fingerprint();
  /**
   *
   *
   * <pre>
   * Sha1 Fingerprint of the certificate.
   * </pre>
   *
   * <code>string sha1_fingerprint = 5;</code>
   *
   * @return The bytes for sha1Fingerprint.
   */
  com.google.protobuf.ByteString getSha1FingerprintBytes();
}
