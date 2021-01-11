/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface NetworkEndpointGroupCloudRunOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.NetworkEndpointGroupCloudRun)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Cloud Run service is the main resource of Cloud Run.
   * The service must be 1-63 characters long, and comply with RFC1035.
   * Example value: "run-service".
   * </pre>
   *
   * <code>string service = 105105077;</code>
   *
   * @return The service.
   */
  java.lang.String getService();
  /**
   *
   *
   * <pre>
   * Cloud Run service is the main resource of Cloud Run.
   * The service must be 1-63 characters long, and comply with RFC1035.
   * Example value: "run-service".
   * </pre>
   *
   * <code>string service = 105105077;</code>
   *
   * @return The bytes for service.
   */
  com.google.protobuf.ByteString getServiceBytes();

  /**
   *
   *
   * <pre>
   * Optional Cloud Run tag represents the "named-revision" to provide additional fine-grained traffic routing information.
   * The tag must be 1-63 characters long, and comply with RFC1035.
   * Example value: "revision-0010".
   * </pre>
   *
   * <code>string tag = 114586;</code>
   *
   * @return The tag.
   */
  java.lang.String getTag();
  /**
   *
   *
   * <pre>
   * Optional Cloud Run tag represents the "named-revision" to provide additional fine-grained traffic routing information.
   * The tag must be 1-63 characters long, and comply with RFC1035.
   * Example value: "revision-0010".
   * </pre>
   *
   * <code>string tag = 114586;</code>
   *
   * @return The bytes for tag.
   */
  com.google.protobuf.ByteString getTagBytes();

  /**
   *
   *
   * <pre>
   * A template to parse service and tag fields from a request URL. URL mask allows for routing to multiple Run services without having to create multiple network endpoint groups and backend services.
   * For example, request URLs "foo1.domain.com/bar1" and "foo1.domain.com/bar2" can be backed by the same Serverless Network Endpoint Group (NEG) with URL mask ".domain.com/". The URL mask will parse them to { service="bar1", tag="foo1" } and { service="bar2", tag="foo2" } respectively.
   * </pre>
   *
   * <code>string url_mask = 103352252;</code>
   *
   * @return The urlMask.
   */
  java.lang.String getUrlMask();
  /**
   *
   *
   * <pre>
   * A template to parse service and tag fields from a request URL. URL mask allows for routing to multiple Run services without having to create multiple network endpoint groups and backend services.
   * For example, request URLs "foo1.domain.com/bar1" and "foo1.domain.com/bar2" can be backed by the same Serverless Network Endpoint Group (NEG) with URL mask ".domain.com/". The URL mask will parse them to { service="bar1", tag="foo1" } and { service="bar2", tag="foo2" } respectively.
   * </pre>
   *
   * <code>string url_mask = 103352252;</code>
   *
   * @return The bytes for urlMask.
   */
  com.google.protobuf.ByteString getUrlMaskBytes();
}
