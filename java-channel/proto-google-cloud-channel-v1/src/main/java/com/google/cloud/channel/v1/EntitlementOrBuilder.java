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
// source: google/cloud/channel/v1/entitlements.proto

package com.google.cloud.channel.v1;

public interface EntitlementOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.Entitlement)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Resource name of an entitlement in the form:
   * accounts/{account_id}/customers/{customer_id}/entitlements/{entitlement_id}.
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
   * Output only. Resource name of an entitlement in the form:
   * accounts/{account_id}/customers/{customer_id}/entitlements/{entitlement_id}.
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
   * Output only. The time at which the entitlement is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which the entitlement is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which the entitlement is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time at which the entitlement is updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which the entitlement is updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which the entitlement is updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The offer resource name for which the entitlement is to be
   * created. Takes the form: accounts/{account_id}/offers/{offer_id}.
   * </pre>
   *
   * <code>
   * string offer = 8 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The offer.
   */
  java.lang.String getOffer();
  /**
   *
   *
   * <pre>
   * Required. The offer resource name for which the entitlement is to be
   * created. Takes the form: accounts/{account_id}/offers/{offer_id}.
   * </pre>
   *
   * <code>
   * string offer = 8 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for offer.
   */
  com.google.protobuf.ByteString getOfferBytes();

  /**
   *
   *
   * <pre>
   * Commitment settings for a commitment-based Offer.
   * Required for commitment based offers.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.CommitmentSettings commitment_settings = 12;</code>
   *
   * @return Whether the commitmentSettings field is set.
   */
  boolean hasCommitmentSettings();
  /**
   *
   *
   * <pre>
   * Commitment settings for a commitment-based Offer.
   * Required for commitment based offers.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.CommitmentSettings commitment_settings = 12;</code>
   *
   * @return The commitmentSettings.
   */
  com.google.cloud.channel.v1.CommitmentSettings getCommitmentSettings();
  /**
   *
   *
   * <pre>
   * Commitment settings for a commitment-based Offer.
   * Required for commitment based offers.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.CommitmentSettings commitment_settings = 12;</code>
   */
  com.google.cloud.channel.v1.CommitmentSettingsOrBuilder getCommitmentSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Current provisioning state of the entitlement.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.Entitlement.ProvisioningState provisioning_state = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for provisioningState.
   */
  int getProvisioningStateValue();
  /**
   *
   *
   * <pre>
   * Output only. Current provisioning state of the entitlement.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.Entitlement.ProvisioningState provisioning_state = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The provisioningState.
   */
  com.google.cloud.channel.v1.Entitlement.ProvisioningState getProvisioningState();

  /**
   *
   *
   * <pre>
   * Output only. Service provisioning details for the entitlement.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.ProvisionedService provisioned_service = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the provisionedService field is set.
   */
  boolean hasProvisionedService();
  /**
   *
   *
   * <pre>
   * Output only. Service provisioning details for the entitlement.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.ProvisionedService provisioned_service = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The provisionedService.
   */
  com.google.cloud.channel.v1.ProvisionedService getProvisionedService();
  /**
   *
   *
   * <pre>
   * Output only. Service provisioning details for the entitlement.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.ProvisionedService provisioned_service = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.channel.v1.ProvisionedServiceOrBuilder getProvisionedServiceOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Enumerable of all current suspension reasons for an
   * entitlement.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.channel.v1.Entitlement.SuspensionReason suspension_reasons = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the suspensionReasons.
   */
  java.util.List<com.google.cloud.channel.v1.Entitlement.SuspensionReason>
      getSuspensionReasonsList();
  /**
   *
   *
   * <pre>
   * Output only. Enumerable of all current suspension reasons for an
   * entitlement.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.channel.v1.Entitlement.SuspensionReason suspension_reasons = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The count of suspensionReasons.
   */
  int getSuspensionReasonsCount();
  /**
   *
   *
   * <pre>
   * Output only. Enumerable of all current suspension reasons for an
   * entitlement.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.channel.v1.Entitlement.SuspensionReason suspension_reasons = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The suspensionReasons at the given index.
   */
  com.google.cloud.channel.v1.Entitlement.SuspensionReason getSuspensionReasons(int index);
  /**
   *
   *
   * <pre>
   * Output only. Enumerable of all current suspension reasons for an
   * entitlement.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.channel.v1.Entitlement.SuspensionReason suspension_reasons = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for suspensionReasons.
   */
  java.util.List<java.lang.Integer> getSuspensionReasonsValueList();
  /**
   *
   *
   * <pre>
   * Output only. Enumerable of all current suspension reasons for an
   * entitlement.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.channel.v1.Entitlement.SuspensionReason suspension_reasons = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of suspensionReasons at the given index.
   */
  int getSuspensionReasonsValue(int index);

  /**
   *
   *
   * <pre>
   * Optional. This purchase order (PO) information is for resellers to use for
   * their company tracking usage. If a purchaseOrderId value is given, it
   * appears in the API responses and shows up in the invoice. The property
   * accepts up to 80 plain text characters. This is only supported for Google
   * Workspace entitlements.
   * </pre>
   *
   * <code>string purchase_order_id = 19 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The purchaseOrderId.
   */
  java.lang.String getPurchaseOrderId();
  /**
   *
   *
   * <pre>
   * Optional. This purchase order (PO) information is for resellers to use for
   * their company tracking usage. If a purchaseOrderId value is given, it
   * appears in the API responses and shows up in the invoice. The property
   * accepts up to 80 plain text characters. This is only supported for Google
   * Workspace entitlements.
   * </pre>
   *
   * <code>string purchase_order_id = 19 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for purchaseOrderId.
   */
  com.google.protobuf.ByteString getPurchaseOrderIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. Settings for trial offers.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.TrialSettings trial_settings = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the trialSettings field is set.
   */
  boolean hasTrialSettings();
  /**
   *
   *
   * <pre>
   * Output only. Settings for trial offers.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.TrialSettings trial_settings = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The trialSettings.
   */
  com.google.cloud.channel.v1.TrialSettings getTrialSettings();
  /**
   *
   *
   * <pre>
   * Output only. Settings for trial offers.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.TrialSettings trial_settings = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.channel.v1.TrialSettingsOrBuilder getTrialSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * Association information to other entitlements.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.AssociationInfo association_info = 23;</code>
   *
   * @return Whether the associationInfo field is set.
   */
  boolean hasAssociationInfo();
  /**
   *
   *
   * <pre>
   * Association information to other entitlements.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.AssociationInfo association_info = 23;</code>
   *
   * @return The associationInfo.
   */
  com.google.cloud.channel.v1.AssociationInfo getAssociationInfo();
  /**
   *
   *
   * <pre>
   * Association information to other entitlements.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.AssociationInfo association_info = 23;</code>
   */
  com.google.cloud.channel.v1.AssociationInfoOrBuilder getAssociationInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * Extended entitlement parameters. When creating an entitlement, valid
   * parameter names and values are defined in the
   * [Offer.parameter_definitions][google.cloud.channel.v1.Offer.parameter_definitions].
   * For Google Workspace, the following Parameters may be accepted as input:
   * - max_units: The maximum assignable units for a flexible offer
   * OR
   * - num_units: The total commitment for commitment-based offers
   * The response may additionally include the following output-only Parameters:
   * - assigned_units: The number of licenses assigned to users.
   * For GCP billing subaccounts, the following Parameter may be accepted as
   * input:
   * - display_name: The display name of the billing subaccount.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Parameter parameters = 26;</code>
   */
  java.util.List<com.google.cloud.channel.v1.Parameter> getParametersList();
  /**
   *
   *
   * <pre>
   * Extended entitlement parameters. When creating an entitlement, valid
   * parameter names and values are defined in the
   * [Offer.parameter_definitions][google.cloud.channel.v1.Offer.parameter_definitions].
   * For Google Workspace, the following Parameters may be accepted as input:
   * - max_units: The maximum assignable units for a flexible offer
   * OR
   * - num_units: The total commitment for commitment-based offers
   * The response may additionally include the following output-only Parameters:
   * - assigned_units: The number of licenses assigned to users.
   * For GCP billing subaccounts, the following Parameter may be accepted as
   * input:
   * - display_name: The display name of the billing subaccount.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Parameter parameters = 26;</code>
   */
  com.google.cloud.channel.v1.Parameter getParameters(int index);
  /**
   *
   *
   * <pre>
   * Extended entitlement parameters. When creating an entitlement, valid
   * parameter names and values are defined in the
   * [Offer.parameter_definitions][google.cloud.channel.v1.Offer.parameter_definitions].
   * For Google Workspace, the following Parameters may be accepted as input:
   * - max_units: The maximum assignable units for a flexible offer
   * OR
   * - num_units: The total commitment for commitment-based offers
   * The response may additionally include the following output-only Parameters:
   * - assigned_units: The number of licenses assigned to users.
   * For GCP billing subaccounts, the following Parameter may be accepted as
   * input:
   * - display_name: The display name of the billing subaccount.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Parameter parameters = 26;</code>
   */
  int getParametersCount();
  /**
   *
   *
   * <pre>
   * Extended entitlement parameters. When creating an entitlement, valid
   * parameter names and values are defined in the
   * [Offer.parameter_definitions][google.cloud.channel.v1.Offer.parameter_definitions].
   * For Google Workspace, the following Parameters may be accepted as input:
   * - max_units: The maximum assignable units for a flexible offer
   * OR
   * - num_units: The total commitment for commitment-based offers
   * The response may additionally include the following output-only Parameters:
   * - assigned_units: The number of licenses assigned to users.
   * For GCP billing subaccounts, the following Parameter may be accepted as
   * input:
   * - display_name: The display name of the billing subaccount.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Parameter parameters = 26;</code>
   */
  java.util.List<? extends com.google.cloud.channel.v1.ParameterOrBuilder>
      getParametersOrBuilderList();
  /**
   *
   *
   * <pre>
   * Extended entitlement parameters. When creating an entitlement, valid
   * parameter names and values are defined in the
   * [Offer.parameter_definitions][google.cloud.channel.v1.Offer.parameter_definitions].
   * For Google Workspace, the following Parameters may be accepted as input:
   * - max_units: The maximum assignable units for a flexible offer
   * OR
   * - num_units: The total commitment for commitment-based offers
   * The response may additionally include the following output-only Parameters:
   * - assigned_units: The number of licenses assigned to users.
   * For GCP billing subaccounts, the following Parameter may be accepted as
   * input:
   * - display_name: The display name of the billing subaccount.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Parameter parameters = 26;</code>
   */
  com.google.cloud.channel.v1.ParameterOrBuilder getParametersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. The billing account resource name that is used to pay for this
   * entitlement.
   * </pre>
   *
   * <code>string billing_account = 28 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The billingAccount.
   */
  java.lang.String getBillingAccount();
  /**
   *
   *
   * <pre>
   * Optional. The billing account resource name that is used to pay for this
   * entitlement.
   * </pre>
   *
   * <code>string billing_account = 28 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for billingAccount.
   */
  com.google.protobuf.ByteString getBillingAccountBytes();
}
