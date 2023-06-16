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
// source: google/cloud/beyondcorp/clientgateways/v1/client_gateways_service.proto

package com.google.cloud.beyondcorp.clientgateways.v1;

public interface ClientGatewayOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.beyondcorp.clientgateways.v1.ClientGateway)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. name of resource. The name is ignored during creation.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. name of resource. The name is ignored during creation.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. [Output only] Create time stamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. [Output only] Create time stamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. [Output only] Create time stamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. [Output only] Update time stamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. [Output only] Update time stamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. [Output only] Update time stamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The operational state of the gateway.
   * </pre>
   *
   * <code>
   * .google.cloud.beyondcorp.clientgateways.v1.ClientGateway.State state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The operational state of the gateway.
   * </pre>
   *
   * <code>
   * .google.cloud.beyondcorp.clientgateways.v1.ClientGateway.State state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.beyondcorp.clientgateways.v1.ClientGateway.State getState();

  /**
   *
   *
   * <pre>
   * Output only. A unique identifier for the instance generated by the system.
   * </pre>
   *
   * <code>string id = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * Output only. A unique identifier for the instance generated by the system.
   * </pre>
   *
   * <code>string id = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. The client connector service name that the client gateway is
   * associated to. Client Connector Services, named as follows:
   *   `projects/{project_id}/locations/{location_id}/client_connector_services/{client_connector_service_id}`.
   * </pre>
   *
   * <code>string client_connector_service = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The clientConnectorService.
   */
  java.lang.String getClientConnectorService();
  /**
   *
   *
   * <pre>
   * Output only. The client connector service name that the client gateway is
   * associated to. Client Connector Services, named as follows:
   *   `projects/{project_id}/locations/{location_id}/client_connector_services/{client_connector_service_id}`.
   * </pre>
   *
   * <code>string client_connector_service = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for clientConnectorService.
   */
  com.google.protobuf.ByteString getClientConnectorServiceBytes();
}
