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
// source: google/cloud/billing/v1/cloud_catalog.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.billing.v1;

public final class CloudCatalogProto {
  private CloudCatalogProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_v1_Service_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_v1_Service_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_v1_Sku_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_v1_Sku_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_v1_Category_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_v1_Category_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_v1_PricingInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_v1_PricingInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_v1_PricingExpression_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_v1_PricingExpression_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_v1_PricingExpression_TierRate_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_v1_PricingExpression_TierRate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_v1_AggregationInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_v1_AggregationInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_v1_GeoTaxonomy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_v1_GeoTaxonomy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_v1_ListServicesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_v1_ListServicesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_v1_ListServicesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_v1_ListServicesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_v1_ListSkusRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_v1_ListSkusRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_v1_ListSkusResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_v1_ListSkusResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/billing/v1/cloud_catalog."
          + "proto\022\027google.cloud.billing.v1\032\034google/a"
          + "pi/annotations.proto\032\027google/api/client."
          + "proto\032\037google/api/field_behavior.proto\032\031"
          + "google/api/resource.proto\032\037google/protob"
          + "uf/timestamp.proto\032\027google/type/money.pr"
          + "oto\"\235\001\n\007Service\022\014\n\004name\030\001 \001(\t\022\022\n\nservice"
          + "_id\030\002 \001(\t\022\024\n\014display_name\030\003 \001(\t\022\034\n\024busin"
          + "ess_entity_name\030\004 \001(\t:<\352A9\n#cloudbilling"
          + ".googleapis.com/Service\022\022services/{servi"
          + "ce}\"\342\002\n\003Sku\022\014\n\004name\030\001 \001(\t\022\016\n\006sku_id\030\002 \001("
          + "\t\022\023\n\013description\030\003 \001(\t\0223\n\010category\030\004 \001(\013"
          + "2!.google.cloud.billing.v1.Category\022\027\n\017s"
          + "ervice_regions\030\005 \003(\t\022:\n\014pricing_info\030\006 \003"
          + "(\0132$.google.cloud.billing.v1.PricingInfo"
          + "\022\035\n\025service_provider_name\030\007 \001(\t\022:\n\014geo_t"
          + "axonomy\030\010 \001(\0132$.google.cloud.billing.v1."
          + "GeoTaxonomy:C\352A@\n\037cloudbilling.googleapi"
          + "s.com/Sku\022\035services/{service}/skus/{sku}"
          + "\"m\n\010Category\022\034\n\024service_display_name\030\001 \001"
          + "(\t\022\027\n\017resource_family\030\002 \001(\t\022\026\n\016resource_"
          + "group\030\003 \001(\t\022\022\n\nusage_type\030\004 \001(\t\"\200\002\n\013Pric"
          + "ingInfo\0222\n\016effective_time\030\001 \001(\0132\032.google"
          + ".protobuf.Timestamp\022\017\n\007summary\030\002 \001(\t\022F\n\022"
          + "pricing_expression\030\003 \001(\0132*.google.cloud."
          + "billing.v1.PricingExpression\022B\n\020aggregat"
          + "ion_info\030\004 \001(\0132(.google.cloud.billing.v1"
          + ".AggregationInfo\022 \n\030currency_conversion_"
          + "rate\030\005 \001(\001\"\323\002\n\021PricingExpression\022\022\n\nusag"
          + "e_unit\030\001 \001(\t\022\030\n\020display_quantity\030\002 \001(\001\022I"
          + "\n\014tiered_rates\030\003 \003(\01323.google.cloud.bill"
          + "ing.v1.PricingExpression.TierRate\022\036\n\026usa"
          + "ge_unit_description\030\004 \001(\t\022\021\n\tbase_unit\030\005"
          + " \001(\t\022\035\n\025base_unit_description\030\006 \001(\t\022#\n\033b"
          + "ase_unit_conversion_factor\030\007 \001(\001\032N\n\010Tier"
          + "Rate\022\032\n\022start_usage_amount\030\001 \001(\001\022&\n\nunit"
          + "_price\030\002 \001(\0132\022.google.type.Money\"\204\003\n\017Agg"
          + "regationInfo\022T\n\021aggregation_level\030\001 \001(\0162"
          + "9.google.cloud.billing.v1.AggregationInf"
          + "o.AggregationLevel\022Z\n\024aggregation_interv"
          + "al\030\002 \001(\0162<.google.cloud.billing.v1.Aggre"
          + "gationInfo.AggregationInterval\022\031\n\021aggreg"
          + "ation_count\030\003 \001(\005\"O\n\020AggregationLevel\022!\n"
          + "\035AGGREGATION_LEVEL_UNSPECIFIED\020\000\022\013\n\007ACCO"
          + "UNT\020\001\022\013\n\007PROJECT\020\002\"S\n\023AggregationInterva"
          + "l\022$\n AGGREGATION_INTERVAL_UNSPECIFIED\020\000\022"
          + "\t\n\005DAILY\020\001\022\013\n\007MONTHLY\020\002\"\243\001\n\013GeoTaxonomy\022"
          + "7\n\004type\030\001 \001(\0162).google.cloud.billing.v1."
          + "GeoTaxonomy.Type\022\017\n\007regions\030\002 \003(\t\"J\n\004Typ"
          + "e\022\024\n\020TYPE_UNSPECIFIED\020\000\022\n\n\006GLOBAL\020\001\022\014\n\010R"
          + "EGIONAL\020\002\022\022\n\016MULTI_REGIONAL\020\003\"<\n\023ListSer"
          + "vicesRequest\022\021\n\tpage_size\030\001 \001(\005\022\022\n\npage_"
          + "token\030\002 \001(\t\"c\n\024ListServicesResponse\0222\n\010s"
          + "ervices\030\001 \003(\0132 .google.cloud.billing.v1."
          + "Service\022\027\n\017next_page_token\030\002 \001(\t\"\352\001\n\017Lis"
          + "tSkusRequest\022;\n\006parent\030\001 \001(\tB+\340A\002\372A%\n#cl"
          + "oudbilling.googleapis.com/Service\022.\n\nsta"
          + "rt_time\030\002 \001(\0132\032.google.protobuf.Timestam"
          + "p\022,\n\010end_time\030\003 \001(\0132\032.google.protobuf.Ti"
          + "mestamp\022\025\n\rcurrency_code\030\004 \001(\t\022\021\n\tpage_s"
          + "ize\030\005 \001(\005\022\022\n\npage_token\030\006 \001(\t\"W\n\020ListSku"
          + "sResponse\022*\n\004skus\030\001 \003(\0132\034.google.cloud.b"
          + "illing.v1.Sku\022\027\n\017next_page_token\030\002 \001(\t2\336"
          + "\003\n\014CloudCatalog\022\204\001\n\014ListServices\022,.googl"
          + "e.cloud.billing.v1.ListServicesRequest\032-"
          + ".google.cloud.billing.v1.ListServicesRes"
          + "ponse\"\027\332A\000\202\323\344\223\002\016\022\014/v1/services\022\216\001\n\010ListS"
          + "kus\022(.google.cloud.billing.v1.ListSkusRe"
          + "quest\032).google.cloud.billing.v1.ListSkus"
          + "Response\"-\332A\006parent\202\323\344\223\002\036\022\034/v1/{parent=s"
          + "ervices/*}/skus\032\265\001\312A\033cloudbilling.google"
          + "apis.com\322A\223\001https://www.googleapis.com/a"
          + "uth/cloud-billing,https://www.googleapis"
          + ".com/auth/cloud-billing.readonly,https:/"
          + "/www.googleapis.com/auth/cloud-platformB"
          + "\215\001\n\033com.google.cloud.billing.v1B\021CloudCa"
          + "talogProtoP\001Z5cloud.google.com/go/billin"
          + "g/apiv1/billingpb;billingpb\242\002\007CLDCTLG\252\002\027"
          + "Google.Cloud.Billing.V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.type.MoneyProto.getDescriptor(),
            });
    internal_static_google_cloud_billing_v1_Service_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_billing_v1_Service_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_v1_Service_descriptor,
            new java.lang.String[] {
              "Name", "ServiceId", "DisplayName", "BusinessEntityName",
            });
    internal_static_google_cloud_billing_v1_Sku_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_billing_v1_Sku_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_v1_Sku_descriptor,
            new java.lang.String[] {
              "Name",
              "SkuId",
              "Description",
              "Category",
              "ServiceRegions",
              "PricingInfo",
              "ServiceProviderName",
              "GeoTaxonomy",
            });
    internal_static_google_cloud_billing_v1_Category_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_billing_v1_Category_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_v1_Category_descriptor,
            new java.lang.String[] {
              "ServiceDisplayName", "ResourceFamily", "ResourceGroup", "UsageType",
            });
    internal_static_google_cloud_billing_v1_PricingInfo_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_billing_v1_PricingInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_v1_PricingInfo_descriptor,
            new java.lang.String[] {
              "EffectiveTime",
              "Summary",
              "PricingExpression",
              "AggregationInfo",
              "CurrencyConversionRate",
            });
    internal_static_google_cloud_billing_v1_PricingExpression_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_billing_v1_PricingExpression_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_v1_PricingExpression_descriptor,
            new java.lang.String[] {
              "UsageUnit",
              "DisplayQuantity",
              "TieredRates",
              "UsageUnitDescription",
              "BaseUnit",
              "BaseUnitDescription",
              "BaseUnitConversionFactor",
            });
    internal_static_google_cloud_billing_v1_PricingExpression_TierRate_descriptor =
        internal_static_google_cloud_billing_v1_PricingExpression_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_billing_v1_PricingExpression_TierRate_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_v1_PricingExpression_TierRate_descriptor,
            new java.lang.String[] {
              "StartUsageAmount", "UnitPrice",
            });
    internal_static_google_cloud_billing_v1_AggregationInfo_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_billing_v1_AggregationInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_v1_AggregationInfo_descriptor,
            new java.lang.String[] {
              "AggregationLevel", "AggregationInterval", "AggregationCount",
            });
    internal_static_google_cloud_billing_v1_GeoTaxonomy_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_billing_v1_GeoTaxonomy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_v1_GeoTaxonomy_descriptor,
            new java.lang.String[] {
              "Type", "Regions",
            });
    internal_static_google_cloud_billing_v1_ListServicesRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_billing_v1_ListServicesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_v1_ListServicesRequest_descriptor,
            new java.lang.String[] {
              "PageSize", "PageToken",
            });
    internal_static_google_cloud_billing_v1_ListServicesResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_billing_v1_ListServicesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_v1_ListServicesResponse_descriptor,
            new java.lang.String[] {
              "Services", "NextPageToken",
            });
    internal_static_google_cloud_billing_v1_ListSkusRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_billing_v1_ListSkusRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_v1_ListSkusRequest_descriptor,
            new java.lang.String[] {
              "Parent", "StartTime", "EndTime", "CurrencyCode", "PageSize", "PageToken",
            });
    internal_static_google_cloud_billing_v1_ListSkusResponse_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_billing_v1_ListSkusResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_v1_ListSkusResponse_descriptor,
            new java.lang.String[] {
              "Skus", "NextPageToken",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.type.MoneyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
