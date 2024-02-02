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
// source: google/cloud/recommender/v1beta1/recommender_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.recommender.v1beta1;

public interface MarkInsightAcceptedRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recommender.v1beta1.MarkInsightAcceptedRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Name of the insight.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. Name of the insight.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. State properties user wish to include with this state.  Full
   * replace of the current state_metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; state_metadata = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getStateMetadataCount();
  /**
   *
   *
   * <pre>
   * Optional. State properties user wish to include with this state.  Full
   * replace of the current state_metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; state_metadata = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  boolean containsStateMetadata(java.lang.String key);
  /** Use {@link #getStateMetadataMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getStateMetadata();
  /**
   *
   *
   * <pre>
   * Optional. State properties user wish to include with this state.  Full
   * replace of the current state_metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; state_metadata = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.Map<java.lang.String, java.lang.String> getStateMetadataMap();
  /**
   *
   *
   * <pre>
   * Optional. State properties user wish to include with this state.  Full
   * replace of the current state_metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; state_metadata = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
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
   * Optional. State properties user wish to include with this state.  Full
   * replace of the current state_metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; state_metadata = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.lang.String getStateMetadataOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Required. Fingerprint of the Insight. Provides optimistic locking.
   * </pre>
   *
   * <code>string etag = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Required. Fingerprint of the Insight. Provides optimistic locking.
   * </pre>
   *
   * <code>string etag = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();
}
