/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/support/v2/case.proto

package com.google.cloud.support.v2;

public interface CaseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.support.v2.Case)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name for the case.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The resource name for the case.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The short summary of the issue reported in this case.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * The short summary of the issue reported in this case.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * A broad description of the issue.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * A broad description of the issue.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * The issue classification applicable to this case.
   * </pre>
   *
   * <code>.google.cloud.support.v2.CaseClassification classification = 4;</code>
   *
   * @return Whether the classification field is set.
   */
  boolean hasClassification();
  /**
   *
   *
   * <pre>
   * The issue classification applicable to this case.
   * </pre>
   *
   * <code>.google.cloud.support.v2.CaseClassification classification = 4;</code>
   *
   * @return The classification.
   */
  com.google.cloud.support.v2.CaseClassification getClassification();
  /**
   *
   *
   * <pre>
   * The issue classification applicable to this case.
   * </pre>
   *
   * <code>.google.cloud.support.v2.CaseClassification classification = 4;</code>
   */
  com.google.cloud.support.v2.CaseClassificationOrBuilder getClassificationOrBuilder();

  /**
   *
   *
   * <pre>
   * The timezone of the user who created the support case.
   * It should be in a format IANA recognizes: https://www.iana.org/time-zones.
   * There is no additional validation done by the API.
   * </pre>
   *
   * <code>string time_zone = 8;</code>
   *
   * @return The timeZone.
   */
  java.lang.String getTimeZone();
  /**
   *
   *
   * <pre>
   * The timezone of the user who created the support case.
   * It should be in a format IANA recognizes: https://www.iana.org/time-zones.
   * There is no additional validation done by the API.
   * </pre>
   *
   * <code>string time_zone = 8;</code>
   *
   * @return The bytes for timeZone.
   */
  com.google.protobuf.ByteString getTimeZoneBytes();

  /**
   *
   *
   * <pre>
   * The email addresses to receive updates on this case.
   * </pre>
   *
   * <code>repeated string subscriber_email_addresses = 9;</code>
   *
   * @return A list containing the subscriberEmailAddresses.
   */
  java.util.List<java.lang.String> getSubscriberEmailAddressesList();
  /**
   *
   *
   * <pre>
   * The email addresses to receive updates on this case.
   * </pre>
   *
   * <code>repeated string subscriber_email_addresses = 9;</code>
   *
   * @return The count of subscriberEmailAddresses.
   */
  int getSubscriberEmailAddressesCount();
  /**
   *
   *
   * <pre>
   * The email addresses to receive updates on this case.
   * </pre>
   *
   * <code>repeated string subscriber_email_addresses = 9;</code>
   *
   * @param index The index of the element to return.
   * @return The subscriberEmailAddresses at the given index.
   */
  java.lang.String getSubscriberEmailAddresses(int index);
  /**
   *
   *
   * <pre>
   * The email addresses to receive updates on this case.
   * </pre>
   *
   * <code>repeated string subscriber_email_addresses = 9;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the subscriberEmailAddresses at the given index.
   */
  com.google.protobuf.ByteString getSubscriberEmailAddressesBytes(int index);

  /**
   *
   *
   * <pre>
   * Output only. The current status of the support case.
   * </pre>
   *
   * <code>
   * .google.cloud.support.v2.Case.State state = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The current status of the support case.
   * </pre>
   *
   * <code>
   * .google.cloud.support.v2.Case.State state = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.support.v2.Case.State getState();

  /**
   *
   *
   * <pre>
   * Output only. The time this case was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time this case was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time this case was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time this case was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time this case was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time this case was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The user who created the case.
   *
   * Note: The name and email will be obfuscated if the case was created by
   * Google Support.
   * </pre>
   *
   * <code>.google.cloud.support.v2.Actor creator = 15;</code>
   *
   * @return Whether the creator field is set.
   */
  boolean hasCreator();
  /**
   *
   *
   * <pre>
   * The user who created the case.
   *
   * Note: The name and email will be obfuscated if the case was created by
   * Google Support.
   * </pre>
   *
   * <code>.google.cloud.support.v2.Actor creator = 15;</code>
   *
   * @return The creator.
   */
  com.google.cloud.support.v2.Actor getCreator();
  /**
   *
   *
   * <pre>
   * The user who created the case.
   *
   * Note: The name and email will be obfuscated if the case was created by
   * Google Support.
   * </pre>
   *
   * <code>.google.cloud.support.v2.Actor creator = 15;</code>
   */
  com.google.cloud.support.v2.ActorOrBuilder getCreatorOrBuilder();

  /**
   *
   *
   * <pre>
   * A user-supplied email address to send case update notifications for. This
   * should only be used in BYOID flows, where we cannot infer the user's email
   * address directly from their EUCs.
   * </pre>
   *
   * <code>string contact_email = 35;</code>
   *
   * @return The contactEmail.
   */
  java.lang.String getContactEmail();
  /**
   *
   *
   * <pre>
   * A user-supplied email address to send case update notifications for. This
   * should only be used in BYOID flows, where we cannot infer the user's email
   * address directly from their EUCs.
   * </pre>
   *
   * <code>string contact_email = 35;</code>
   *
   * @return The bytes for contactEmail.
   */
  com.google.protobuf.ByteString getContactEmailBytes();

  /**
   *
   *
   * <pre>
   * Whether the case is currently escalated.
   * </pre>
   *
   * <code>bool escalated = 17;</code>
   *
   * @return The escalated.
   */
  boolean getEscalated();

  /**
   *
   *
   * <pre>
   * Whether this case was created for internal API testing and should not be
   * acted on by the support team.
   * </pre>
   *
   * <code>bool test_case = 19;</code>
   *
   * @return The testCase.
   */
  boolean getTestCase();

  /**
   *
   *
   * <pre>
   * The language the user has requested to receive support in. This should be a
   * BCP 47 language code (e.g., `"en"`, `"zh-CN"`, `"zh-TW"`, `"ja"`, `"ko"`).
   * If no language or an unsupported language is specified, this field defaults
   * to English (en).
   *
   * Language selection during case creation may affect your available support
   * options. For a list of supported languages and their support working hours,
   * see: https://cloud.google.com/support/docs/language-working-hours
   * </pre>
   *
   * <code>string language_code = 23;</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * The language the user has requested to receive support in. This should be a
   * BCP 47 language code (e.g., `"en"`, `"zh-CN"`, `"zh-TW"`, `"ja"`, `"ko"`).
   * If no language or an unsupported language is specified, this field defaults
   * to English (en).
   *
   * Language selection during case creation may affect your available support
   * options. For a list of supported languages and their support working hours,
   * see: https://cloud.google.com/support/docs/language-working-hours
   * </pre>
   *
   * <code>string language_code = 23;</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * The priority of this case.
   * </pre>
   *
   * <code>.google.cloud.support.v2.Case.Priority priority = 32;</code>
   *
   * @return The enum numeric value on the wire for priority.
   */
  int getPriorityValue();
  /**
   *
   *
   * <pre>
   * The priority of this case.
   * </pre>
   *
   * <code>.google.cloud.support.v2.Case.Priority priority = 32;</code>
   *
   * @return The priority.
   */
  com.google.cloud.support.v2.Case.Priority getPriority();
}
