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

public interface CloudArmorOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1.CloudArmor)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Information about the [Google Cloud Armor security
   * policy](https://cloud.google.com/armor/docs/security-policy-overview)
   * relevant to the finding.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.SecurityPolicy security_policy = 1;</code>
   *
   * @return Whether the securityPolicy field is set.
   */
  boolean hasSecurityPolicy();
  /**
   *
   *
   * <pre>
   * Information about the [Google Cloud Armor security
   * policy](https://cloud.google.com/armor/docs/security-policy-overview)
   * relevant to the finding.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.SecurityPolicy security_policy = 1;</code>
   *
   * @return The securityPolicy.
   */
  com.google.cloud.securitycenter.v1.SecurityPolicy getSecurityPolicy();
  /**
   *
   *
   * <pre>
   * Information about the [Google Cloud Armor security
   * policy](https://cloud.google.com/armor/docs/security-policy-overview)
   * relevant to the finding.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.SecurityPolicy security_policy = 1;</code>
   */
  com.google.cloud.securitycenter.v1.SecurityPolicyOrBuilder getSecurityPolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * Information about incoming requests evaluated by [Google Cloud Armor
   * security
   * policies](https://cloud.google.com/armor/docs/security-policy-overview).
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Requests requests = 2;</code>
   *
   * @return Whether the requests field is set.
   */
  boolean hasRequests();
  /**
   *
   *
   * <pre>
   * Information about incoming requests evaluated by [Google Cloud Armor
   * security
   * policies](https://cloud.google.com/armor/docs/security-policy-overview).
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Requests requests = 2;</code>
   *
   * @return The requests.
   */
  com.google.cloud.securitycenter.v1.Requests getRequests();
  /**
   *
   *
   * <pre>
   * Information about incoming requests evaluated by [Google Cloud Armor
   * security
   * policies](https://cloud.google.com/armor/docs/security-policy-overview).
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Requests requests = 2;</code>
   */
  com.google.cloud.securitycenter.v1.RequestsOrBuilder getRequestsOrBuilder();

  /**
   *
   *
   * <pre>
   * Information about potential Layer 7 DDoS attacks identified by [Google
   * Cloud Armor Adaptive
   * Protection](https://cloud.google.com/armor/docs/adaptive-protection-overview).
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.AdaptiveProtection adaptive_protection = 3;</code>
   *
   * @return Whether the adaptiveProtection field is set.
   */
  boolean hasAdaptiveProtection();
  /**
   *
   *
   * <pre>
   * Information about potential Layer 7 DDoS attacks identified by [Google
   * Cloud Armor Adaptive
   * Protection](https://cloud.google.com/armor/docs/adaptive-protection-overview).
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.AdaptiveProtection adaptive_protection = 3;</code>
   *
   * @return The adaptiveProtection.
   */
  com.google.cloud.securitycenter.v1.AdaptiveProtection getAdaptiveProtection();
  /**
   *
   *
   * <pre>
   * Information about potential Layer 7 DDoS attacks identified by [Google
   * Cloud Armor Adaptive
   * Protection](https://cloud.google.com/armor/docs/adaptive-protection-overview).
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.AdaptiveProtection adaptive_protection = 3;</code>
   */
  com.google.cloud.securitycenter.v1.AdaptiveProtectionOrBuilder getAdaptiveProtectionOrBuilder();

  /**
   *
   *
   * <pre>
   * Information about DDoS attack volume and classification.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Attack attack = 4;</code>
   *
   * @return Whether the attack field is set.
   */
  boolean hasAttack();
  /**
   *
   *
   * <pre>
   * Information about DDoS attack volume and classification.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Attack attack = 4;</code>
   *
   * @return The attack.
   */
  com.google.cloud.securitycenter.v1.Attack getAttack();
  /**
   *
   *
   * <pre>
   * Information about DDoS attack volume and classification.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Attack attack = 4;</code>
   */
  com.google.cloud.securitycenter.v1.AttackOrBuilder getAttackOrBuilder();

  /**
   *
   *
   * <pre>
   * Distinguish between volumetric &amp; protocol DDoS attack and
   * application layer attacks. For example, “L3_4” for Layer 3 and Layer 4 DDoS
   * attacks, or “L_7” for Layer 7 DDoS attacks.
   * </pre>
   *
   * <code>string threat_vector = 5;</code>
   *
   * @return The threatVector.
   */
  java.lang.String getThreatVector();
  /**
   *
   *
   * <pre>
   * Distinguish between volumetric &amp; protocol DDoS attack and
   * application layer attacks. For example, “L3_4” for Layer 3 and Layer 4 DDoS
   * attacks, or “L_7” for Layer 7 DDoS attacks.
   * </pre>
   *
   * <code>string threat_vector = 5;</code>
   *
   * @return The bytes for threatVector.
   */
  com.google.protobuf.ByteString getThreatVectorBytes();

  /**
   *
   *
   * <pre>
   * Duration of attack from the start until the current moment (updated every 5
   * minutes).
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 6;</code>
   *
   * @return Whether the duration field is set.
   */
  boolean hasDuration();
  /**
   *
   *
   * <pre>
   * Duration of attack from the start until the current moment (updated every 5
   * minutes).
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 6;</code>
   *
   * @return The duration.
   */
  com.google.protobuf.Duration getDuration();
  /**
   *
   *
   * <pre>
   * Duration of attack from the start until the current moment (updated every 5
   * minutes).
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 6;</code>
   */
  com.google.protobuf.DurationOrBuilder getDurationOrBuilder();
}
