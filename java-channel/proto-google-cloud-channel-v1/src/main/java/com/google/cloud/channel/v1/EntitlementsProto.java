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
// source: google/cloud/channel/v1/entitlements.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.channel.v1;

public final class EntitlementsProto {
  private EntitlementsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_Entitlement_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_Entitlement_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_Parameter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_Parameter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_AssociationInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_AssociationInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_ProvisionedService_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_ProvisionedService_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_CommitmentSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_CommitmentSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_RenewalSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_RenewalSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_TrialSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_TrialSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_TransferableSku_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_TransferableSku_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_TransferEligibility_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_TransferEligibility_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n*google/cloud/channel/v1/entitlements.p"
          + "roto\022\027google.cloud.channel.v1\032\037google/ap"
          + "i/field_behavior.proto\032\031google/api/resou"
          + "rce.proto\032$google/cloud/channel/v1/commo"
          + "n.proto\032$google/cloud/channel/v1/offers."
          + "proto\032&google/cloud/channel/v1/products."
          + "proto\032\037google/protobuf/timestamp.proto\"\373"
          + "\010\n\013Entitlement\022\021\n\004name\030\001 \001(\tB\003\340A\003\0224\n\013cre"
          + "ate_time\030\005 \001(\0132\032.google.protobuf.Timesta"
          + "mpB\003\340A\003\0224\n\013update_time\030\006 \001(\0132\032.google.pr"
          + "otobuf.TimestampB\003\340A\003\0228\n\005offer\030\010 \001(\tB)\340A"
          + "\002\372A#\n!cloudchannel.googleapis.com/Offer\022"
          + "H\n\023commitment_settings\030\014 \001(\0132+.google.cl"
          + "oud.channel.v1.CommitmentSettings\022W\n\022pro"
          + "visioning_state\030\r \001(\01626.google.cloud.cha"
          + "nnel.v1.Entitlement.ProvisioningStateB\003\340"
          + "A\003\022M\n\023provisioned_service\030\020 \001(\0132+.google"
          + ".cloud.channel.v1.ProvisionedServiceB\003\340A"
          + "\003\022V\n\022suspension_reasons\030\022 \003(\01625.google.c"
          + "loud.channel.v1.Entitlement.SuspensionRe"
          + "asonB\003\340A\003\022\036\n\021purchase_order_id\030\023 \001(\tB\003\340A"
          + "\001\022C\n\016trial_settings\030\025 \001(\0132&.google.cloud"
          + ".channel.v1.TrialSettingsB\003\340A\003\022B\n\020associ"
          + "ation_info\030\027 \001(\0132(.google.cloud.channel."
          + "v1.AssociationInfo\0226\n\nparameters\030\032 \003(\0132\""
          + ".google.cloud.channel.v1.Parameter\022\034\n\017bi"
          + "lling_account\030\034 \001(\tB\003\340A\001\"R\n\021Provisioning"
          + "State\022\"\n\036PROVISIONING_STATE_UNSPECIFIED\020"
          + "\000\022\n\n\006ACTIVE\020\001\022\r\n\tSUSPENDED\020\005\"\243\001\n\020Suspens"
          + "ionReason\022!\n\035SUSPENSION_REASON_UNSPECIFI"
          + "ED\020\000\022\026\n\022RESELLER_INITIATED\020\001\022\017\n\013TRIAL_EN"
          + "DED\020\002\022\034\n\030RENEWAL_WITH_TYPE_CANCEL\020\003\022\032\n\026P"
          + "ENDING_TOS_ACCEPTANCE\020\004\022\t\n\005OTHER\020d:p\352Am\n"
          + "\'cloudchannel.googleapis.com/Entitlement"
          + "\022Baccounts/{account}/customers/{customer"
          + "}/entitlements/{entitlement}\"_\n\tParamete"
          + "r\022\014\n\004name\030\001 \001(\t\022-\n\005value\030\002 \001(\0132\036.google."
          + "cloud.channel.v1.Value\022\025\n\010editable\030\003 \001(\010"
          + "B\003\340A\003\"Y\n\017AssociationInfo\022F\n\020base_entitle"
          + "ment\030\001 \001(\tB,\372A)\n\'cloudchannel.googleapis"
          + ".com/Entitlement\"`\n\022ProvisionedService\022\034"
          + "\n\017provisioning_id\030\001 \001(\tB\003\340A\003\022\027\n\nproduct_"
          + "id\030\002 \001(\tB\003\340A\003\022\023\n\006sku_id\030\003 \001(\tB\003\340A\003\"\305\001\n\022C"
          + "ommitmentSettings\0223\n\nstart_time\030\001 \001(\0132\032."
          + "google.protobuf.TimestampB\003\340A\003\0221\n\010end_ti"
          + "me\030\002 \001(\0132\032.google.protobuf.TimestampB\003\340A"
          + "\003\022G\n\020renewal_settings\030\004 \001(\0132(.google.clo"
          + "ud.channel.v1.RenewalSettingsB\003\340A\001\"\270\001\n\017R"
          + "enewalSettings\022\026\n\016enable_renewal\030\001 \001(\010\022\031"
          + "\n\021resize_unit_count\030\002 \001(\010\022:\n\014payment_pla"
          + "n\030\005 \001(\0162$.google.cloud.channel.v1.Paymen"
          + "tPlan\0226\n\rpayment_cycle\030\006 \001(\0132\037.google.cl"
          + "oud.channel.v1.Period\"L\n\rTrialSettings\022\r"
          + "\n\005trial\030\001 \001(\010\022,\n\010end_time\030\002 \001(\0132\032.google"
          + ".protobuf.Timestamp\"\277\001\n\017TransferableSku\022"
          + "J\n\024transfer_eligibility\030\t \001(\0132,.google.c"
          + "loud.channel.v1.TransferEligibility\022)\n\003s"
          + "ku\030\013 \001(\0132\034.google.cloud.channel.v1.Sku\0225"
          + "\n\nlegacy_sku\030\014 \001(\0132\034.google.cloud.channe"
          + "l.v1.SkuB\003\340A\001\"\246\002\n\023TransferEligibility\022\023\n"
          + "\013is_eligible\030\001 \001(\010\022\023\n\013description\030\002 \001(\t\022"
          + "Q\n\024ineligibility_reason\030\003 \001(\01623.google.c"
          + "loud.channel.v1.TransferEligibility.Reas"
          + "on\"\221\001\n\006Reason\022\026\n\022REASON_UNSPECIFIED\020\000\022\032\n"
          + "\026PENDING_TOS_ACCEPTANCE\020\001\022\024\n\020SKU_NOT_ELI"
          + "GIBLE\020\002\022\021\n\rSKU_SUSPENDED\020\003\022*\n&CHANNEL_PA"
          + "RTNER_NOT_AUTHORIZED_FOR_SKU\020\004Bi\n\033com.go"
          + "ogle.cloud.channel.v1B\021EntitlementsProto"
          + "P\001Z5cloud.google.com/go/channel/apiv1/ch"
          + "annelpb;channelpbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.channel.v1.CommonProto.getDescriptor(),
              com.google.cloud.channel.v1.OffersProto.getDescriptor(),
              com.google.cloud.channel.v1.ProductsProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_channel_v1_Entitlement_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_channel_v1_Entitlement_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_Entitlement_descriptor,
            new java.lang.String[] {
              "Name",
              "CreateTime",
              "UpdateTime",
              "Offer",
              "CommitmentSettings",
              "ProvisioningState",
              "ProvisionedService",
              "SuspensionReasons",
              "PurchaseOrderId",
              "TrialSettings",
              "AssociationInfo",
              "Parameters",
              "BillingAccount",
            });
    internal_static_google_cloud_channel_v1_Parameter_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_channel_v1_Parameter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_Parameter_descriptor,
            new java.lang.String[] {
              "Name", "Value", "Editable",
            });
    internal_static_google_cloud_channel_v1_AssociationInfo_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_channel_v1_AssociationInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_AssociationInfo_descriptor,
            new java.lang.String[] {
              "BaseEntitlement",
            });
    internal_static_google_cloud_channel_v1_ProvisionedService_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_channel_v1_ProvisionedService_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_ProvisionedService_descriptor,
            new java.lang.String[] {
              "ProvisioningId", "ProductId", "SkuId",
            });
    internal_static_google_cloud_channel_v1_CommitmentSettings_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_channel_v1_CommitmentSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_CommitmentSettings_descriptor,
            new java.lang.String[] {
              "StartTime", "EndTime", "RenewalSettings",
            });
    internal_static_google_cloud_channel_v1_RenewalSettings_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_channel_v1_RenewalSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_RenewalSettings_descriptor,
            new java.lang.String[] {
              "EnableRenewal", "ResizeUnitCount", "PaymentPlan", "PaymentCycle",
            });
    internal_static_google_cloud_channel_v1_TrialSettings_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_channel_v1_TrialSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_TrialSettings_descriptor,
            new java.lang.String[] {
              "Trial", "EndTime",
            });
    internal_static_google_cloud_channel_v1_TransferableSku_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_channel_v1_TransferableSku_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_TransferableSku_descriptor,
            new java.lang.String[] {
              "TransferEligibility", "Sku", "LegacySku",
            });
    internal_static_google_cloud_channel_v1_TransferEligibility_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_channel_v1_TransferEligibility_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_TransferEligibility_descriptor,
            new java.lang.String[] {
              "IsEligible", "Description", "IneligibilityReason",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.channel.v1.CommonProto.getDescriptor();
    com.google.cloud.channel.v1.OffersProto.getDescriptor();
    com.google.cloud.channel.v1.ProductsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
