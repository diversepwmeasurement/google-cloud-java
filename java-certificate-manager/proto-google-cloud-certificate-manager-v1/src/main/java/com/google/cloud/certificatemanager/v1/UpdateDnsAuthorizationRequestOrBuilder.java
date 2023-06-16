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
// source: google/cloud/certificatemanager/v1/certificate_manager.proto

package com.google.cloud.certificatemanager.v1;

public interface UpdateDnsAuthorizationRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. A definition of the dns authorization to update.
   * </pre>
   *
   * <code>
   * .google.cloud.certificatemanager.v1.DnsAuthorization dns_authorization = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the dnsAuthorization field is set.
   */
  boolean hasDnsAuthorization();
  /**
   *
   *
   * <pre>
   * Required. A definition of the dns authorization to update.
   * </pre>
   *
   * <code>
   * .google.cloud.certificatemanager.v1.DnsAuthorization dns_authorization = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The dnsAuthorization.
   */
  com.google.cloud.certificatemanager.v1.DnsAuthorization getDnsAuthorization();
  /**
   *
   *
   * <pre>
   * Required. A definition of the dns authorization to update.
   * </pre>
   *
   * <code>
   * .google.cloud.certificatemanager.v1.DnsAuthorization dns_authorization = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.certificatemanager.v1.DnsAuthorizationOrBuilder getDnsAuthorizationOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The update mask applies to the resource. For the `FieldMask`
   * definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The update mask applies to the resource. For the `FieldMask`
   * definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The update mask applies to the resource. For the `FieldMask`
   * definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
