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
// source: google/cloud/osconfig/v1/vulnerability.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.osconfig.v1;

public interface CVSSv3OrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.osconfig.v1.CVSSv3)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The base score is a function of the base metric scores.
   * https://www.first.org/cvss/specification-document#Base-Metrics
   * </pre>
   *
   * <code>float base_score = 1;</code>
   *
   * @return The baseScore.
   */
  float getBaseScore();

  /**
   *
   *
   * <pre>
   * The Exploitability sub-score equation is derived from the Base
   * Exploitability metrics.
   * https://www.first.org/cvss/specification-document#2-1-Exploitability-Metrics
   * </pre>
   *
   * <code>float exploitability_score = 2;</code>
   *
   * @return The exploitabilityScore.
   */
  float getExploitabilityScore();

  /**
   *
   *
   * <pre>
   * The Impact sub-score equation is derived from the Base Impact metrics.
   * </pre>
   *
   * <code>float impact_score = 3;</code>
   *
   * @return The impactScore.
   */
  float getImpactScore();

  /**
   *
   *
   * <pre>
   * This metric reflects the context by which vulnerability exploitation is
   * possible.
   * </pre>
   *
   * <code>.google.cloud.osconfig.v1.CVSSv3.AttackVector attack_vector = 5;</code>
   *
   * @return The enum numeric value on the wire for attackVector.
   */
  int getAttackVectorValue();
  /**
   *
   *
   * <pre>
   * This metric reflects the context by which vulnerability exploitation is
   * possible.
   * </pre>
   *
   * <code>.google.cloud.osconfig.v1.CVSSv3.AttackVector attack_vector = 5;</code>
   *
   * @return The attackVector.
   */
  com.google.cloud.osconfig.v1.CVSSv3.AttackVector getAttackVector();

  /**
   *
   *
   * <pre>
   * This metric describes the conditions beyond the attacker's control that
   * must exist in order to exploit the vulnerability.
   * </pre>
   *
   * <code>.google.cloud.osconfig.v1.CVSSv3.AttackComplexity attack_complexity = 6;</code>
   *
   * @return The enum numeric value on the wire for attackComplexity.
   */
  int getAttackComplexityValue();
  /**
   *
   *
   * <pre>
   * This metric describes the conditions beyond the attacker's control that
   * must exist in order to exploit the vulnerability.
   * </pre>
   *
   * <code>.google.cloud.osconfig.v1.CVSSv3.AttackComplexity attack_complexity = 6;</code>
   *
   * @return The attackComplexity.
   */
  com.google.cloud.osconfig.v1.CVSSv3.AttackComplexity getAttackComplexity();

  /**
   *
   *
   * <pre>
   * This metric describes the level of privileges an attacker must possess
   * before successfully exploiting the vulnerability.
   * </pre>
   *
   * <code>.google.cloud.osconfig.v1.CVSSv3.PrivilegesRequired privileges_required = 7;</code>
   *
   * @return The enum numeric value on the wire for privilegesRequired.
   */
  int getPrivilegesRequiredValue();
  /**
   *
   *
   * <pre>
   * This metric describes the level of privileges an attacker must possess
   * before successfully exploiting the vulnerability.
   * </pre>
   *
   * <code>.google.cloud.osconfig.v1.CVSSv3.PrivilegesRequired privileges_required = 7;</code>
   *
   * @return The privilegesRequired.
   */
  com.google.cloud.osconfig.v1.CVSSv3.PrivilegesRequired getPrivilegesRequired();

  /**
   *
   *
   * <pre>
   * This metric captures the requirement for a human user, other than the
   * attacker, to participate in the successful compromise of the vulnerable
   * component.
   * </pre>
   *
   * <code>.google.cloud.osconfig.v1.CVSSv3.UserInteraction user_interaction = 8;</code>
   *
   * @return The enum numeric value on the wire for userInteraction.
   */
  int getUserInteractionValue();
  /**
   *
   *
   * <pre>
   * This metric captures the requirement for a human user, other than the
   * attacker, to participate in the successful compromise of the vulnerable
   * component.
   * </pre>
   *
   * <code>.google.cloud.osconfig.v1.CVSSv3.UserInteraction user_interaction = 8;</code>
   *
   * @return The userInteraction.
   */
  com.google.cloud.osconfig.v1.CVSSv3.UserInteraction getUserInteraction();

  /**
   *
   *
   * <pre>
   * The Scope metric captures whether a vulnerability in one vulnerable
   * component impacts resources in components beyond its security scope.
   * </pre>
   *
   * <code>.google.cloud.osconfig.v1.CVSSv3.Scope scope = 9;</code>
   *
   * @return The enum numeric value on the wire for scope.
   */
  int getScopeValue();
  /**
   *
   *
   * <pre>
   * The Scope metric captures whether a vulnerability in one vulnerable
   * component impacts resources in components beyond its security scope.
   * </pre>
   *
   * <code>.google.cloud.osconfig.v1.CVSSv3.Scope scope = 9;</code>
   *
   * @return The scope.
   */
  com.google.cloud.osconfig.v1.CVSSv3.Scope getScope();

  /**
   *
   *
   * <pre>
   * This metric measures the impact to the confidentiality of the information
   * resources managed by a software component due to a successfully exploited
   * vulnerability.
   * </pre>
   *
   * <code>.google.cloud.osconfig.v1.CVSSv3.Impact confidentiality_impact = 10;</code>
   *
   * @return The enum numeric value on the wire for confidentialityImpact.
   */
  int getConfidentialityImpactValue();
  /**
   *
   *
   * <pre>
   * This metric measures the impact to the confidentiality of the information
   * resources managed by a software component due to a successfully exploited
   * vulnerability.
   * </pre>
   *
   * <code>.google.cloud.osconfig.v1.CVSSv3.Impact confidentiality_impact = 10;</code>
   *
   * @return The confidentialityImpact.
   */
  com.google.cloud.osconfig.v1.CVSSv3.Impact getConfidentialityImpact();

  /**
   *
   *
   * <pre>
   * This metric measures the impact to integrity of a successfully exploited
   * vulnerability.
   * </pre>
   *
   * <code>.google.cloud.osconfig.v1.CVSSv3.Impact integrity_impact = 11;</code>
   *
   * @return The enum numeric value on the wire for integrityImpact.
   */
  int getIntegrityImpactValue();
  /**
   *
   *
   * <pre>
   * This metric measures the impact to integrity of a successfully exploited
   * vulnerability.
   * </pre>
   *
   * <code>.google.cloud.osconfig.v1.CVSSv3.Impact integrity_impact = 11;</code>
   *
   * @return The integrityImpact.
   */
  com.google.cloud.osconfig.v1.CVSSv3.Impact getIntegrityImpact();

  /**
   *
   *
   * <pre>
   * This metric measures the impact to the availability of the impacted
   * component resulting from a successfully exploited vulnerability.
   * </pre>
   *
   * <code>.google.cloud.osconfig.v1.CVSSv3.Impact availability_impact = 12;</code>
   *
   * @return The enum numeric value on the wire for availabilityImpact.
   */
  int getAvailabilityImpactValue();
  /**
   *
   *
   * <pre>
   * This metric measures the impact to the availability of the impacted
   * component resulting from a successfully exploited vulnerability.
   * </pre>
   *
   * <code>.google.cloud.osconfig.v1.CVSSv3.Impact availability_impact = 12;</code>
   *
   * @return The availabilityImpact.
   */
  com.google.cloud.osconfig.v1.CVSSv3.Impact getAvailabilityImpact();
}
