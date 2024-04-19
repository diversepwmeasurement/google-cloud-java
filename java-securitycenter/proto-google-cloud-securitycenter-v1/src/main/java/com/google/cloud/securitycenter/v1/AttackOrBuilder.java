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
// source: google/cloud/securitycenter/v1/cloud_armor.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.securitycenter.v1;

public interface AttackOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1.Attack)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Total PPS (packets per second) volume of attack.
   * </pre>
   *
   * <code>int32 volume_pps = 1;</code>
   *
   * @return The volumePps.
   */
  int getVolumePps();

  /**
   *
   *
   * <pre>
   * Total BPS (bytes per second) volume of attack.
   * </pre>
   *
   * <code>int32 volume_bps = 2;</code>
   *
   * @return The volumeBps.
   */
  int getVolumeBps();

  /**
   *
   *
   * <pre>
   * Type of attack, for example, ‘SYN-flood’, ‘NTP-udp’, or ‘CHARGEN-udp’.
   * </pre>
   *
   * <code>string classification = 3;</code>
   *
   * @return The classification.
   */
  java.lang.String getClassification();
  /**
   *
   *
   * <pre>
   * Type of attack, for example, ‘SYN-flood’, ‘NTP-udp’, or ‘CHARGEN-udp’.
   * </pre>
   *
   * <code>string classification = 3;</code>
   *
   * @return The bytes for classification.
   */
  com.google.protobuf.ByteString getClassificationBytes();
}
