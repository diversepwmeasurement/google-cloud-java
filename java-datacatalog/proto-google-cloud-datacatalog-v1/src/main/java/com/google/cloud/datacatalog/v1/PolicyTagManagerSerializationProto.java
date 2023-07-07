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
// source: google/cloud/datacatalog/v1/policytagmanagerserialization.proto

package com.google.cloud.datacatalog.v1;

public final class PolicyTagManagerSerializationProto {
  private PolicyTagManagerSerializationProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_SerializedTaxonomy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_SerializedTaxonomy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_SerializedPolicyTag_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_SerializedPolicyTag_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_ReplaceTaxonomyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_ReplaceTaxonomyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_ImportTaxonomiesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_ImportTaxonomiesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_InlineSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_InlineSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_CrossRegionalSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_CrossRegionalSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_ImportTaxonomiesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_ImportTaxonomiesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_ExportTaxonomiesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_ExportTaxonomiesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_ExportTaxonomiesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_ExportTaxonomiesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n?google/cloud/datacatalog/v1/policytagm"
          + "anagerserialization.proto\022\033google.cloud."
          + "datacatalog.v1\032\034google/api/annotations.p"
          + "roto\032\027google/api/client.proto\032\037google/ap"
          + "i/field_behavior.proto\032\031google/api/resou"
          + "rce.proto\0322google/cloud/datacatalog/v1/p"
          + "olicytagmanager.proto\"\336\001\n\022SerializedTaxo"
          + "nomy\022\032\n\014display_name\030\001 \001(\tB\004\342A\001\002\022\023\n\013desc"
          + "ription\030\002 \001(\t\022E\n\013policy_tags\030\003 \003(\01320.goo"
          + "gle.cloud.datacatalog.v1.SerializedPolic"
          + "yTag\022P\n\026activated_policy_types\030\004 \003(\01620.g"
          + "oogle.cloud.datacatalog.v1.Taxonomy.Poli"
          + "cyType\"\247\001\n\023SerializedPolicyTag\022\022\n\npolicy"
          + "_tag\030\001 \001(\t\022\032\n\014display_name\030\002 \001(\tB\004\342A\001\002\022\023"
          + "\n\013description\030\003 \001(\t\022K\n\021child_policy_tags"
          + "\030\004 \003(\01320.google.cloud.datacatalog.v1.Ser"
          + "ializedPolicyTag\"\250\001\n\026ReplaceTaxonomyRequ"
          + "est\022:\n\004name\030\001 \001(\tB,\342A\001\002\372A%\n#datacatalog."
          + "googleapis.com/Taxonomy\022R\n\023serialized_ta"
          + "xonomy\030\002 \001(\0132/.google.cloud.datacatalog."
          + "v1.SerializedTaxonomyB\004\342A\001\002\"\370\001\n\027ImportTa"
          + "xonomiesRequest\022<\n\006parent\030\001 \001(\tB,\342A\001\002\372A%"
          + "\022#datacatalog.googleapis.com/Taxonomy\022B\n"
          + "\rinline_source\030\002 \001(\0132).google.cloud.data"
          + "catalog.v1.InlineSourceH\000\022Q\n\025cross_regio"
          + "nal_source\030\003 \001(\01320.google.cloud.datacata"
          + "log.v1.CrossRegionalSourceH\000B\010\n\006source\"Y"
          + "\n\014InlineSource\022I\n\ntaxonomies\030\001 \003(\0132/.goo"
          + "gle.cloud.datacatalog.v1.SerializedTaxon"
          + "omyB\004\342A\001\002\"U\n\023CrossRegionalSource\022>\n\010taxo"
          + "nomy\030\001 \001(\tB,\342A\001\002\372A%\n#datacatalog.googlea"
          + "pis.com/Taxonomy\"U\n\030ImportTaxonomiesResp"
          + "onse\0229\n\ntaxonomies\030\001 \003(\0132%.google.cloud."
          + "datacatalog.v1.Taxonomy\"\311\001\n\027ExportTaxono"
          + "miesRequest\022<\n\006parent\030\001 \001(\tB,\342A\001\002\372A%\022#da"
          + "tacatalog.googleapis.com/Taxonomy\022@\n\ntax"
          + "onomies\030\002 \003(\tB,\342A\001\002\372A%\n#datacatalog.goog"
          + "leapis.com/Taxonomy\022\037\n\025serialized_taxono"
          + "mies\030\003 \001(\010H\000B\r\n\013destination\"_\n\030ExportTax"
          + "onomiesResponse\022C\n\ntaxonomies\030\001 \003(\0132/.go"
          + "ogle.cloud.datacatalog.v1.SerializedTaxo"
          + "nomy2\247\005\n\035PolicyTagManagerSerialization\022\260"
          + "\001\n\017ReplaceTaxonomy\0223.google.cloud.dataca"
          + "talog.v1.ReplaceTaxonomyRequest\032%.google"
          + ".cloud.datacatalog.v1.Taxonomy\"A\202\323\344\223\002;\"6"
          + "/v1/{name=projects/*/locations/*/taxonom"
          + "ies/*}:replace:\001*\022\301\001\n\020ImportTaxonomies\0224"
          + ".google.cloud.datacatalog.v1.ImportTaxon"
          + "omiesRequest\0325.google.cloud.datacatalog."
          + "v1.ImportTaxonomiesResponse\"@\202\323\344\223\002:\"5/v1"
          + "/{parent=projects/*/locations/*}/taxonom"
          + "ies:import:\001*\022\276\001\n\020ExportTaxonomies\0224.goo"
          + "gle.cloud.datacatalog.v1.ExportTaxonomie"
          + "sRequest\0325.google.cloud.datacatalog.v1.E"
          + "xportTaxonomiesResponse\"=\202\323\344\223\0027\0225/v1/{pa"
          + "rent=projects/*/locations/*}/taxonomies:"
          + "export\032N\312A\032datacatalog.googleapis.com\322A."
          + "https://www.googleapis.com/auth/cloud-pl"
          + "atformB\352\001\n\037com.google.cloud.datacatalog."
          + "v1B\"PolicyTagManagerSerializationProtoP\001"
          + "ZAcloud.google.com/go/datacatalog/apiv1/"
          + "datacatalogpb;datacatalogpb\370\001\001\252\002\033Google."
          + "Cloud.DataCatalog.V1\312\002\033Google\\Cloud\\Data"
          + "Catalog\\V1\352\002\036Google::Cloud::DataCatalog:"
          + ":V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.datacatalog.v1.PolicyTagManagerProto.getDescriptor(),
            });
    internal_static_google_cloud_datacatalog_v1_SerializedTaxonomy_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_datacatalog_v1_SerializedTaxonomy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_SerializedTaxonomy_descriptor,
            new java.lang.String[] {
              "DisplayName", "Description", "PolicyTags", "ActivatedPolicyTypes",
            });
    internal_static_google_cloud_datacatalog_v1_SerializedPolicyTag_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_datacatalog_v1_SerializedPolicyTag_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_SerializedPolicyTag_descriptor,
            new java.lang.String[] {
              "PolicyTag", "DisplayName", "Description", "ChildPolicyTags",
            });
    internal_static_google_cloud_datacatalog_v1_ReplaceTaxonomyRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_datacatalog_v1_ReplaceTaxonomyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_ReplaceTaxonomyRequest_descriptor,
            new java.lang.String[] {
              "Name", "SerializedTaxonomy",
            });
    internal_static_google_cloud_datacatalog_v1_ImportTaxonomiesRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_datacatalog_v1_ImportTaxonomiesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_ImportTaxonomiesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "InlineSource", "CrossRegionalSource", "Source",
            });
    internal_static_google_cloud_datacatalog_v1_InlineSource_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_datacatalog_v1_InlineSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_InlineSource_descriptor,
            new java.lang.String[] {
              "Taxonomies",
            });
    internal_static_google_cloud_datacatalog_v1_CrossRegionalSource_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_datacatalog_v1_CrossRegionalSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_CrossRegionalSource_descriptor,
            new java.lang.String[] {
              "Taxonomy",
            });
    internal_static_google_cloud_datacatalog_v1_ImportTaxonomiesResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_datacatalog_v1_ImportTaxonomiesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_ImportTaxonomiesResponse_descriptor,
            new java.lang.String[] {
              "Taxonomies",
            });
    internal_static_google_cloud_datacatalog_v1_ExportTaxonomiesRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_datacatalog_v1_ExportTaxonomiesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_ExportTaxonomiesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Taxonomies", "SerializedTaxonomies", "Destination",
            });
    internal_static_google_cloud_datacatalog_v1_ExportTaxonomiesResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_datacatalog_v1_ExportTaxonomiesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_ExportTaxonomiesResponse_descriptor,
            new java.lang.String[] {
              "Taxonomies",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.datacatalog.v1.PolicyTagManagerProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
