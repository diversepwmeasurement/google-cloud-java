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
// source: google/cloud/recaptchaenterprise/v1beta1/recaptchaenterprise.proto

// Protobuf Java Version: 3.25.2
package com.google.recaptchaenterprise.v1beta1;

public interface AssessmentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recaptchaenterprise.v1beta1.Assessment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name for the Assessment in the format
   * `projects/{project_number}/assessments/{assessment_id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The resource name for the Assessment in the format
   * `projects/{project_number}/assessments/{assessment_id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The event being assessed.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1beta1.Event event = 2;</code>
   *
   * @return Whether the event field is set.
   */
  boolean hasEvent();
  /**
   *
   *
   * <pre>
   * The event being assessed.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1beta1.Event event = 2;</code>
   *
   * @return The event.
   */
  com.google.recaptchaenterprise.v1beta1.Event getEvent();
  /**
   *
   *
   * <pre>
   * The event being assessed.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1beta1.Event event = 2;</code>
   */
  com.google.recaptchaenterprise.v1beta1.EventOrBuilder getEventOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Legitimate event score from 0.0 to 1.0.
   * (1.0 means very likely legitimate traffic while 0.0 means very likely
   * non-legitimate traffic).
   * </pre>
   *
   * <code>float score = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The score.
   */
  float getScore();

  /**
   *
   *
   * <pre>
   * Output only. Properties of the provided event token.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1beta1.TokenProperties token_properties = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the tokenProperties field is set.
   */
  boolean hasTokenProperties();
  /**
   *
   *
   * <pre>
   * Output only. Properties of the provided event token.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1beta1.TokenProperties token_properties = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The tokenProperties.
   */
  com.google.recaptchaenterprise.v1beta1.TokenProperties getTokenProperties();
  /**
   *
   *
   * <pre>
   * Output only. Properties of the provided event token.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1beta1.TokenProperties token_properties = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.recaptchaenterprise.v1beta1.TokenPropertiesOrBuilder getTokenPropertiesOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Reasons contributing to the risk analysis verdict.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recaptchaenterprise.v1beta1.Assessment.ClassificationReason reasons = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the reasons.
   */
  java.util.List<com.google.recaptchaenterprise.v1beta1.Assessment.ClassificationReason>
      getReasonsList();
  /**
   *
   *
   * <pre>
   * Output only. Reasons contributing to the risk analysis verdict.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recaptchaenterprise.v1beta1.Assessment.ClassificationReason reasons = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The count of reasons.
   */
  int getReasonsCount();
  /**
   *
   *
   * <pre>
   * Output only. Reasons contributing to the risk analysis verdict.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recaptchaenterprise.v1beta1.Assessment.ClassificationReason reasons = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The reasons at the given index.
   */
  com.google.recaptchaenterprise.v1beta1.Assessment.ClassificationReason getReasons(int index);
  /**
   *
   *
   * <pre>
   * Output only. Reasons contributing to the risk analysis verdict.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recaptchaenterprise.v1beta1.Assessment.ClassificationReason reasons = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for reasons.
   */
  java.util.List<java.lang.Integer> getReasonsValueList();
  /**
   *
   *
   * <pre>
   * Output only. Reasons contributing to the risk analysis verdict.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recaptchaenterprise.v1beta1.Assessment.ClassificationReason reasons = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of reasons at the given index.
   */
  int getReasonsValue(int index);

  /**
   *
   *
   * <pre>
   * Information about the user's credentials used to check for leaks.
   * This feature is part of the Early Access Program (EAP). Exercise caution,
   * and do not deploy integrations based on this feature in a production
   * environment.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1beta1.PasswordLeakVerification password_leak_verification = 7;
   * </code>
   *
   * @return Whether the passwordLeakVerification field is set.
   */
  boolean hasPasswordLeakVerification();
  /**
   *
   *
   * <pre>
   * Information about the user's credentials used to check for leaks.
   * This feature is part of the Early Access Program (EAP). Exercise caution,
   * and do not deploy integrations based on this feature in a production
   * environment.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1beta1.PasswordLeakVerification password_leak_verification = 7;
   * </code>
   *
   * @return The passwordLeakVerification.
   */
  com.google.recaptchaenterprise.v1beta1.PasswordLeakVerification getPasswordLeakVerification();
  /**
   *
   *
   * <pre>
   * Information about the user's credentials used to check for leaks.
   * This feature is part of the Early Access Program (EAP). Exercise caution,
   * and do not deploy integrations based on this feature in a production
   * environment.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1beta1.PasswordLeakVerification password_leak_verification = 7;
   * </code>
   */
  com.google.recaptchaenterprise.v1beta1.PasswordLeakVerificationOrBuilder
      getPasswordLeakVerificationOrBuilder();

  /**
   *
   *
   * <pre>
   * Assessment returned by account defender when a hashed_account_id is
   * provided.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1beta1.AccountDefenderAssessment account_defender_assessment = 8;
   * </code>
   *
   * @return Whether the accountDefenderAssessment field is set.
   */
  boolean hasAccountDefenderAssessment();
  /**
   *
   *
   * <pre>
   * Assessment returned by account defender when a hashed_account_id is
   * provided.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1beta1.AccountDefenderAssessment account_defender_assessment = 8;
   * </code>
   *
   * @return The accountDefenderAssessment.
   */
  com.google.recaptchaenterprise.v1beta1.AccountDefenderAssessment getAccountDefenderAssessment();
  /**
   *
   *
   * <pre>
   * Assessment returned by account defender when a hashed_account_id is
   * provided.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1beta1.AccountDefenderAssessment account_defender_assessment = 8;
   * </code>
   */
  com.google.recaptchaenterprise.v1beta1.AccountDefenderAssessmentOrBuilder
      getAccountDefenderAssessmentOrBuilder();

  /**
   *
   *
   * <pre>
   * Assessment returned by Fraud Prevention when TransactionData is provided.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1beta1.FraudPreventionAssessment fraud_prevention_assessment = 11;
   * </code>
   *
   * @return Whether the fraudPreventionAssessment field is set.
   */
  boolean hasFraudPreventionAssessment();
  /**
   *
   *
   * <pre>
   * Assessment returned by Fraud Prevention when TransactionData is provided.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1beta1.FraudPreventionAssessment fraud_prevention_assessment = 11;
   * </code>
   *
   * @return The fraudPreventionAssessment.
   */
  com.google.recaptchaenterprise.v1beta1.FraudPreventionAssessment getFraudPreventionAssessment();
  /**
   *
   *
   * <pre>
   * Assessment returned by Fraud Prevention when TransactionData is provided.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1beta1.FraudPreventionAssessment fraud_prevention_assessment = 11;
   * </code>
   */
  com.google.recaptchaenterprise.v1beta1.FraudPreventionAssessmentOrBuilder
      getFraudPreventionAssessmentOrBuilder();
}
