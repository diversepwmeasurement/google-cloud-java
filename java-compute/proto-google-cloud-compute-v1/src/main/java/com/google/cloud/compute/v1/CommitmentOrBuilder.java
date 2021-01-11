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

public interface CommitmentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.Commitment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The category of the commitment. Category MACHINE specifies commitments composed of machine resources such as VCPU or MEMORY, listed in resources. Category LICENSE specifies commitments composed of software licenses, listed in licenseResources. Note that only MACHINE commitments should have a Type specified.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Commitment.Category category = 50511102;</code>
   *
   * @return The enum numeric value on the wire for category.
   */
  int getCategoryValue();
  /**
   *
   *
   * <pre>
   * The category of the commitment. Category MACHINE specifies commitments composed of machine resources such as VCPU or MEMORY, listed in resources. Category LICENSE specifies commitments composed of software licenses, listed in licenseResources. Note that only MACHINE commitments should have a Type specified.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Commitment.Category category = 50511102;</code>
   *
   * @return The category.
   */
  com.google.cloud.compute.v1.Commitment.Category getCategory();

  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>string creation_timestamp = 30525366;</code>
   *
   * @return The creationTimestamp.
   */
  java.lang.String getCreationTimestamp();
  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>string creation_timestamp = 30525366;</code>
   *
   * @return The bytes for creationTimestamp.
   */
  com.google.protobuf.ByteString getCreationTimestampBytes();

  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>string description = 154502140;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>string description = 154502140;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Commitment end time in RFC3339 text format.
   * </pre>
   *
   * <code>string end_timestamp = 199661234;</code>
   *
   * @return The endTimestamp.
   */
  java.lang.String getEndTimestamp();
  /**
   *
   *
   * <pre>
   * [Output Only] Commitment end time in RFC3339 text format.
   * </pre>
   *
   * <code>string end_timestamp = 199661234;</code>
   *
   * @return The bytes for endTimestamp.
   */
  com.google.protobuf.ByteString getEndTimestampBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>string id = 3355;</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>string id = 3355;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#commitment for commitments.
   * </pre>
   *
   * <code>string kind = 3292052;</code>
   *
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#commitment for commitments.
   * </pre>
   *
   * <code>string kind = 3292052;</code>
   *
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString getKindBytes();

  /**
   *
   *
   * <pre>
   * The license specification required as part of a license commitment.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.LicenseResourceCommitment license_resource = 169519692;</code>
   *
   * @return Whether the licenseResource field is set.
   */
  boolean hasLicenseResource();
  /**
   *
   *
   * <pre>
   * The license specification required as part of a license commitment.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.LicenseResourceCommitment license_resource = 169519692;</code>
   *
   * @return The licenseResource.
   */
  com.google.cloud.compute.v1.LicenseResourceCommitment getLicenseResource();
  /**
   *
   *
   * <pre>
   * The license specification required as part of a license commitment.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.LicenseResourceCommitment license_resource = 169519692;</code>
   */
  com.google.cloud.compute.v1.LicenseResourceCommitmentOrBuilder getLicenseResourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>string name = 3373707;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>string name = 3373707;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The plan for this commitment, which determines duration and discount rate. The currently supported plans are TWELVE_MONTH (1 year), and THIRTY_SIX_MONTH (3 years).
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Commitment.Plan plan = 3443497;</code>
   *
   * @return The enum numeric value on the wire for plan.
   */
  int getPlanValue();
  /**
   *
   *
   * <pre>
   * The plan for this commitment, which determines duration and discount rate. The currently supported plans are TWELVE_MONTH (1 year), and THIRTY_SIX_MONTH (3 years).
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Commitment.Plan plan = 3443497;</code>
   *
   * @return The plan.
   */
  com.google.cloud.compute.v1.Commitment.Plan getPlan();

  /**
   *
   *
   * <pre>
   * [Output Only] URL of the region where this commitment may be used.
   * </pre>
   *
   * <code>string region = 138946292;</code>
   *
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   *
   *
   * <pre>
   * [Output Only] URL of the region where this commitment may be used.
   * </pre>
   *
   * <code>string region = 138946292;</code>
   *
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString getRegionBytes();

  /**
   *
   *
   * <pre>
   * List of reservations in this commitment.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Reservation reservations = 131282471;</code>
   */
  java.util.List<com.google.cloud.compute.v1.Reservation> getReservationsList();
  /**
   *
   *
   * <pre>
   * List of reservations in this commitment.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Reservation reservations = 131282471;</code>
   */
  com.google.cloud.compute.v1.Reservation getReservations(int index);
  /**
   *
   *
   * <pre>
   * List of reservations in this commitment.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Reservation reservations = 131282471;</code>
   */
  int getReservationsCount();
  /**
   *
   *
   * <pre>
   * List of reservations in this commitment.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Reservation reservations = 131282471;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.ReservationOrBuilder>
      getReservationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of reservations in this commitment.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Reservation reservations = 131282471;</code>
   */
  com.google.cloud.compute.v1.ReservationOrBuilder getReservationsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A list of commitment amounts for particular resources. Note that VCPU and MEMORY resource commitments must occur together.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.ResourceCommitment resources = 164412965;</code>
   */
  java.util.List<com.google.cloud.compute.v1.ResourceCommitment> getResourcesList();
  /**
   *
   *
   * <pre>
   * A list of commitment amounts for particular resources. Note that VCPU and MEMORY resource commitments must occur together.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.ResourceCommitment resources = 164412965;</code>
   */
  com.google.cloud.compute.v1.ResourceCommitment getResources(int index);
  /**
   *
   *
   * <pre>
   * A list of commitment amounts for particular resources. Note that VCPU and MEMORY resource commitments must occur together.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.ResourceCommitment resources = 164412965;</code>
   */
  int getResourcesCount();
  /**
   *
   *
   * <pre>
   * A list of commitment amounts for particular resources. Note that VCPU and MEMORY resource commitments must occur together.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.ResourceCommitment resources = 164412965;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.ResourceCommitmentOrBuilder>
      getResourcesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of commitment amounts for particular resources. Note that VCPU and MEMORY resource commitments must occur together.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.ResourceCommitment resources = 164412965;</code>
   */
  com.google.cloud.compute.v1.ResourceCommitmentOrBuilder getResourcesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>string self_link = 187779341;</code>
   *
   * @return The selfLink.
   */
  java.lang.String getSelfLink();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>string self_link = 187779341;</code>
   *
   * @return The bytes for selfLink.
   */
  com.google.protobuf.ByteString getSelfLinkBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Commitment start time in RFC3339 text format.
   * </pre>
   *
   * <code>string start_timestamp = 83645817;</code>
   *
   * @return The startTimestamp.
   */
  java.lang.String getStartTimestamp();
  /**
   *
   *
   * <pre>
   * [Output Only] Commitment start time in RFC3339 text format.
   * </pre>
   *
   * <code>string start_timestamp = 83645817;</code>
   *
   * @return The bytes for startTimestamp.
   */
  com.google.protobuf.ByteString getStartTimestampBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Status of the commitment with regards to eventual expiration (each commitment has an end date defined). One of the following values: NOT_YET_ACTIVE, ACTIVE, EXPIRED.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Commitment.Status status = 181260274;</code>
   *
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   *
   *
   * <pre>
   * [Output Only] Status of the commitment with regards to eventual expiration (each commitment has an end date defined). One of the following values: NOT_YET_ACTIVE, ACTIVE, EXPIRED.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Commitment.Status status = 181260274;</code>
   *
   * @return The status.
   */
  com.google.cloud.compute.v1.Commitment.Status getStatus();

  /**
   *
   *
   * <pre>
   * [Output Only] An optional, human-readable explanation of the status.
   * </pre>
   *
   * <code>string status_message = 28992698;</code>
   *
   * @return The statusMessage.
   */
  java.lang.String getStatusMessage();
  /**
   *
   *
   * <pre>
   * [Output Only] An optional, human-readable explanation of the status.
   * </pre>
   *
   * <code>string status_message = 28992698;</code>
   *
   * @return The bytes for statusMessage.
   */
  com.google.protobuf.ByteString getStatusMessageBytes();
}
