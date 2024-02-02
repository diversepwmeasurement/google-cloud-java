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
// source: google/cloud/recommender/v1/recommendation.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.recommender.v1;

public interface RecommendationStateInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recommender.v1.RecommendationStateInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The state of the recommendation, Eg ACTIVE, SUCCEEDED, FAILED.
   * </pre>
   *
   * <code>.google.cloud.recommender.v1.RecommendationStateInfo.State state = 1;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * The state of the recommendation, Eg ACTIVE, SUCCEEDED, FAILED.
   * </pre>
   *
   * <code>.google.cloud.recommender.v1.RecommendationStateInfo.State state = 1;</code>
   *
   * @return The state.
   */
  com.google.cloud.recommender.v1.RecommendationStateInfo.State getState();

  /**
   *
   *
   * <pre>
   * A map of metadata for the state, provided by user or automations systems.
   * </pre>
   *
   * <code>map&lt;string, string&gt; state_metadata = 2;</code>
   */
  int getStateMetadataCount();
  /**
   *
   *
   * <pre>
   * A map of metadata for the state, provided by user or automations systems.
   * </pre>
   *
   * <code>map&lt;string, string&gt; state_metadata = 2;</code>
   */
  boolean containsStateMetadata(java.lang.String key);
  /** Use {@link #getStateMetadataMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getStateMetadata();
  /**
   *
   *
   * <pre>
   * A map of metadata for the state, provided by user or automations systems.
   * </pre>
   *
   * <code>map&lt;string, string&gt; state_metadata = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getStateMetadataMap();
  /**
   *
   *
   * <pre>
   * A map of metadata for the state, provided by user or automations systems.
   * </pre>
   *
   * <code>map&lt;string, string&gt; state_metadata = 2;</code>
   */
  /* nullable */
  java.lang.String getStateMetadataOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * A map of metadata for the state, provided by user or automations systems.
   * </pre>
   *
   * <code>map&lt;string, string&gt; state_metadata = 2;</code>
   */
  java.lang.String getStateMetadataOrThrow(java.lang.String key);
}
