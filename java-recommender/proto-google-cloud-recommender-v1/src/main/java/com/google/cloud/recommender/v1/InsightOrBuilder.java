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
// source: google/cloud/recommender/v1/insight.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.recommender.v1;

public interface InsightOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recommender.v1.Insight)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of the insight.
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
   * Name of the insight.
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
   * Free-form human readable summary in English. The maximum length is 500
   * characters.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Free-form human readable summary in English. The maximum length is 500
   * characters.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Fully qualified resource names that this insight is targeting.
   * </pre>
   *
   * <code>repeated string target_resources = 9;</code>
   *
   * @return A list containing the targetResources.
   */
  java.util.List<java.lang.String> getTargetResourcesList();
  /**
   *
   *
   * <pre>
   * Fully qualified resource names that this insight is targeting.
   * </pre>
   *
   * <code>repeated string target_resources = 9;</code>
   *
   * @return The count of targetResources.
   */
  int getTargetResourcesCount();
  /**
   *
   *
   * <pre>
   * Fully qualified resource names that this insight is targeting.
   * </pre>
   *
   * <code>repeated string target_resources = 9;</code>
   *
   * @param index The index of the element to return.
   * @return The targetResources at the given index.
   */
  java.lang.String getTargetResources(int index);
  /**
   *
   *
   * <pre>
   * Fully qualified resource names that this insight is targeting.
   * </pre>
   *
   * <code>repeated string target_resources = 9;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the targetResources at the given index.
   */
  com.google.protobuf.ByteString getTargetResourcesBytes(int index);

  /**
   *
   *
   * <pre>
   * Insight subtype. Insight content schema will be stable for a given subtype.
   * </pre>
   *
   * <code>string insight_subtype = 10;</code>
   *
   * @return The insightSubtype.
   */
  java.lang.String getInsightSubtype();
  /**
   *
   *
   * <pre>
   * Insight subtype. Insight content schema will be stable for a given subtype.
   * </pre>
   *
   * <code>string insight_subtype = 10;</code>
   *
   * @return The bytes for insightSubtype.
   */
  com.google.protobuf.ByteString getInsightSubtypeBytes();

  /**
   *
   *
   * <pre>
   * A struct of custom fields to explain the insight.
   * Example: "grantedPermissionsCount": "1000"
   * </pre>
   *
   * <code>.google.protobuf.Struct content = 3;</code>
   *
   * @return Whether the content field is set.
   */
  boolean hasContent();
  /**
   *
   *
   * <pre>
   * A struct of custom fields to explain the insight.
   * Example: "grantedPermissionsCount": "1000"
   * </pre>
   *
   * <code>.google.protobuf.Struct content = 3;</code>
   *
   * @return The content.
   */
  com.google.protobuf.Struct getContent();
  /**
   *
   *
   * <pre>
   * A struct of custom fields to explain the insight.
   * Example: "grantedPermissionsCount": "1000"
   * </pre>
   *
   * <code>.google.protobuf.Struct content = 3;</code>
   */
  com.google.protobuf.StructOrBuilder getContentOrBuilder();

  /**
   *
   *
   * <pre>
   * Timestamp of the latest data used to generate the insight.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_refresh_time = 4;</code>
   *
   * @return Whether the lastRefreshTime field is set.
   */
  boolean hasLastRefreshTime();
  /**
   *
   *
   * <pre>
   * Timestamp of the latest data used to generate the insight.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_refresh_time = 4;</code>
   *
   * @return The lastRefreshTime.
   */
  com.google.protobuf.Timestamp getLastRefreshTime();
  /**
   *
   *
   * <pre>
   * Timestamp of the latest data used to generate the insight.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_refresh_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastRefreshTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Observation period that led to the insight. The source data used to
   * generate the insight ends at last_refresh_time and begins at
   * (last_refresh_time - observation_period).
   * </pre>
   *
   * <code>.google.protobuf.Duration observation_period = 5;</code>
   *
   * @return Whether the observationPeriod field is set.
   */
  boolean hasObservationPeriod();
  /**
   *
   *
   * <pre>
   * Observation period that led to the insight. The source data used to
   * generate the insight ends at last_refresh_time and begins at
   * (last_refresh_time - observation_period).
   * </pre>
   *
   * <code>.google.protobuf.Duration observation_period = 5;</code>
   *
   * @return The observationPeriod.
   */
  com.google.protobuf.Duration getObservationPeriod();
  /**
   *
   *
   * <pre>
   * Observation period that led to the insight. The source data used to
   * generate the insight ends at last_refresh_time and begins at
   * (last_refresh_time - observation_period).
   * </pre>
   *
   * <code>.google.protobuf.Duration observation_period = 5;</code>
   */
  com.google.protobuf.DurationOrBuilder getObservationPeriodOrBuilder();

  /**
   *
   *
   * <pre>
   * Information state and metadata.
   * </pre>
   *
   * <code>.google.cloud.recommender.v1.InsightStateInfo state_info = 6;</code>
   *
   * @return Whether the stateInfo field is set.
   */
  boolean hasStateInfo();
  /**
   *
   *
   * <pre>
   * Information state and metadata.
   * </pre>
   *
   * <code>.google.cloud.recommender.v1.InsightStateInfo state_info = 6;</code>
   *
   * @return The stateInfo.
   */
  com.google.cloud.recommender.v1.InsightStateInfo getStateInfo();
  /**
   *
   *
   * <pre>
   * Information state and metadata.
   * </pre>
   *
   * <code>.google.cloud.recommender.v1.InsightStateInfo state_info = 6;</code>
   */
  com.google.cloud.recommender.v1.InsightStateInfoOrBuilder getStateInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * Category being targeted by the insight.
   * </pre>
   *
   * <code>.google.cloud.recommender.v1.Insight.Category category = 7;</code>
   *
   * @return The enum numeric value on the wire for category.
   */
  int getCategoryValue();
  /**
   *
   *
   * <pre>
   * Category being targeted by the insight.
   * </pre>
   *
   * <code>.google.cloud.recommender.v1.Insight.Category category = 7;</code>
   *
   * @return The category.
   */
  com.google.cloud.recommender.v1.Insight.Category getCategory();

  /**
   *
   *
   * <pre>
   * Insight's severity.
   * </pre>
   *
   * <code>.google.cloud.recommender.v1.Insight.Severity severity = 15;</code>
   *
   * @return The enum numeric value on the wire for severity.
   */
  int getSeverityValue();
  /**
   *
   *
   * <pre>
   * Insight's severity.
   * </pre>
   *
   * <code>.google.cloud.recommender.v1.Insight.Severity severity = 15;</code>
   *
   * @return The severity.
   */
  com.google.cloud.recommender.v1.Insight.Severity getSeverity();

  /**
   *
   *
   * <pre>
   * Fingerprint of the Insight. Provides optimistic locking when updating
   * states.
   * </pre>
   *
   * <code>string etag = 11;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Fingerprint of the Insight. Provides optimistic locking when updating
   * states.
   * </pre>
   *
   * <code>string etag = 11;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * Recommendations derived from this insight.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recommender.v1.Insight.RecommendationReference associated_recommendations = 8;
   * </code>
   */
  java.util.List<com.google.cloud.recommender.v1.Insight.RecommendationReference>
      getAssociatedRecommendationsList();
  /**
   *
   *
   * <pre>
   * Recommendations derived from this insight.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recommender.v1.Insight.RecommendationReference associated_recommendations = 8;
   * </code>
   */
  com.google.cloud.recommender.v1.Insight.RecommendationReference getAssociatedRecommendations(
      int index);
  /**
   *
   *
   * <pre>
   * Recommendations derived from this insight.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recommender.v1.Insight.RecommendationReference associated_recommendations = 8;
   * </code>
   */
  int getAssociatedRecommendationsCount();
  /**
   *
   *
   * <pre>
   * Recommendations derived from this insight.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recommender.v1.Insight.RecommendationReference associated_recommendations = 8;
   * </code>
   */
  java.util.List<? extends com.google.cloud.recommender.v1.Insight.RecommendationReferenceOrBuilder>
      getAssociatedRecommendationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Recommendations derived from this insight.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recommender.v1.Insight.RecommendationReference associated_recommendations = 8;
   * </code>
   */
  com.google.cloud.recommender.v1.Insight.RecommendationReferenceOrBuilder
      getAssociatedRecommendationsOrBuilder(int index);
}
