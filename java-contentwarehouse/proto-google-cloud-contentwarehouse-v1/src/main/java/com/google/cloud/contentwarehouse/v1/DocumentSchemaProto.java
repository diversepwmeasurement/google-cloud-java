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
// source: google/cloud/contentwarehouse/v1/document_schema.proto

package com.google.cloud.contentwarehouse.v1;

public final class DocumentSchemaProto {
  private DocumentSchemaProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_DocumentSchema_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_DocumentSchema_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_PropertyDefinition_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_PropertyDefinition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_PropertyDefinition_SchemaSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_PropertyDefinition_SchemaSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_IntegerTypeOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_IntegerTypeOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_FloatTypeOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_FloatTypeOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_TextTypeOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_TextTypeOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_DateTimeTypeOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_DateTimeTypeOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_MapTypeOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_MapTypeOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_TimestampTypeOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_TimestampTypeOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_PropertyTypeOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_PropertyTypeOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_EnumTypeOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_EnumTypeOptions_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n6google/cloud/contentwarehouse/v1/docum"
          + "ent_schema.proto\022 google.cloud.contentwa"
          + "rehouse.v1\032\037google/api/field_behavior.pr"
          + "oto\032\031google/api/resource.proto\032\037google/p"
          + "rotobuf/timestamp.proto\"\252\003\n\016DocumentSche"
          + "ma\022\014\n\004name\030\001 \001(\t\022\031\n\014display_name\030\002 \001(\tB\003"
          + "\340A\002\022R\n\024property_definitions\030\003 \003(\01324.goog"
          + "le.cloud.contentwarehouse.v1.PropertyDef"
          + "inition\022\032\n\022document_is_folder\030\004 \001(\010\0224\n\013u"
          + "pdate_time\030\005 \001(\0132\032.google.protobuf.Times"
          + "tampB\003\340A\003\0224\n\013create_time\030\006 \001(\0132\032.google."
          + "protobuf.TimestampB\003\340A\003\022\023\n\013description\030\007"
          + " \001(\t:~\352A{\n.contentwarehouse.googleapis.c"
          + "om/DocumentSchema\022Iprojects/{project}/lo"
          + "cations/{location}/documentSchemas/{docu"
          + "ment_schema}\"\335\t\n\022PropertyDefinition\022\021\n\004n"
          + "ame\030\001 \001(\tB\003\340A\002\022\024\n\014display_name\030\014 \001(\t\022\025\n\r"
          + "is_repeatable\030\002 \001(\010\022\025\n\ris_filterable\030\003 \001"
          + "(\010\022\025\n\ris_searchable\030\004 \001(\010\022\023\n\013is_metadata"
          + "\030\005 \001(\010\022\023\n\013is_required\030\016 \001(\010\022f\n\024retrieval"
          + "_importance\030\022 \001(\0162H.google.cloud.content"
          + "warehouse.v1.PropertyDefinition.Retrieva"
          + "lImportance\022T\n\024integer_type_options\030\007 \001("
          + "\01324.google.cloud.contentwarehouse.v1.Int"
          + "egerTypeOptionsH\000\022P\n\022float_type_options\030"
          + "\010 \001(\01322.google.cloud.contentwarehouse.v1"
          + ".FloatTypeOptionsH\000\022N\n\021text_type_options"
          + "\030\t \001(\01321.google.cloud.contentwarehouse.v"
          + "1.TextTypeOptionsH\000\022V\n\025property_type_opt"
          + "ions\030\n \001(\01325.google.cloud.contentwarehou"
          + "se.v1.PropertyTypeOptionsH\000\022N\n\021enum_type"
          + "_options\030\013 \001(\01321.google.cloud.contentwar"
          + "ehouse.v1.EnumTypeOptionsH\000\022W\n\026date_time"
          + "_type_options\030\r \001(\01325.google.cloud.conte"
          + "ntwarehouse.v1.DateTimeTypeOptionsH\000\022L\n\020"
          + "map_type_options\030\017 \001(\01320.google.cloud.co"
          + "ntentwarehouse.v1.MapTypeOptionsH\000\022X\n\026ti"
          + "mestamp_type_options\030\020 \001(\01326.google.clou"
          + "d.contentwarehouse.v1.TimestampTypeOptio"
          + "nsH\000\022Y\n\016schema_sources\030\023 \003(\0132A.google.cl"
          + "oud.contentwarehouse.v1.PropertyDefiniti"
          + "on.SchemaSource\0324\n\014SchemaSource\022\014\n\004name\030"
          + "\001 \001(\t\022\026\n\016processor_type\030\002 \001(\t\"\177\n\023Retriev"
          + "alImportance\022$\n RETRIEVAL_IMPORTANCE_UNS"
          + "PECIFIED\020\000\022\013\n\007HIGHEST\020\001\022\n\n\006HIGHER\020\002\022\010\n\004H"
          + "IGH\020\003\022\n\n\006MEDIUM\020\004\022\007\n\003LOW\020\005\022\n\n\006LOWEST\020\006B\024"
          + "\n\022value_type_options\"\024\n\022IntegerTypeOptio"
          + "ns\"\022\n\020FloatTypeOptions\"\021\n\017TextTypeOption"
          + "s\"\025\n\023DateTimeTypeOptions\"\020\n\016MapTypeOptio"
          + "ns\"\026\n\024TimestampTypeOptions\"n\n\023PropertyTy"
          + "peOptions\022W\n\024property_definitions\030\001 \003(\0132"
          + "4.google.cloud.contentwarehouse.v1.Prope"
          + "rtyDefinitionB\003\340A\002\"R\n\017EnumTypeOptions\022\034\n"
          + "\017possible_values\030\001 \003(\tB\003\340A\002\022!\n\031validatio"
          + "n_check_disabled\030\002 \001(\010B\373\001\n$com.google.cl"
          + "oud.contentwarehouse.v1B\023DocumentSchemaP"
          + "rotoP\001ZPcloud.google.com/go/contentwareh"
          + "ouse/apiv1/contentwarehousepb;contentwar"
          + "ehousepb\252\002 Google.Cloud.ContentWarehouse"
          + ".V1\312\002 Google\\Cloud\\ContentWarehouse\\V1\352\002"
          + "#Google::Cloud::ContentWarehouse::V1b\006pr"
          + "oto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_contentwarehouse_v1_DocumentSchema_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_contentwarehouse_v1_DocumentSchema_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_DocumentSchema_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "PropertyDefinitions",
              "DocumentIsFolder",
              "UpdateTime",
              "CreateTime",
              "Description",
            });
    internal_static_google_cloud_contentwarehouse_v1_PropertyDefinition_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_contentwarehouse_v1_PropertyDefinition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_PropertyDefinition_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "IsRepeatable",
              "IsFilterable",
              "IsSearchable",
              "IsMetadata",
              "IsRequired",
              "RetrievalImportance",
              "IntegerTypeOptions",
              "FloatTypeOptions",
              "TextTypeOptions",
              "PropertyTypeOptions",
              "EnumTypeOptions",
              "DateTimeTypeOptions",
              "MapTypeOptions",
              "TimestampTypeOptions",
              "SchemaSources",
              "ValueTypeOptions",
            });
    internal_static_google_cloud_contentwarehouse_v1_PropertyDefinition_SchemaSource_descriptor =
        internal_static_google_cloud_contentwarehouse_v1_PropertyDefinition_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_contentwarehouse_v1_PropertyDefinition_SchemaSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_PropertyDefinition_SchemaSource_descriptor,
            new java.lang.String[] {
              "Name", "ProcessorType",
            });
    internal_static_google_cloud_contentwarehouse_v1_IntegerTypeOptions_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_contentwarehouse_v1_IntegerTypeOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_IntegerTypeOptions_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_contentwarehouse_v1_FloatTypeOptions_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_contentwarehouse_v1_FloatTypeOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_FloatTypeOptions_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_contentwarehouse_v1_TextTypeOptions_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_contentwarehouse_v1_TextTypeOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_TextTypeOptions_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_contentwarehouse_v1_DateTimeTypeOptions_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_contentwarehouse_v1_DateTimeTypeOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_DateTimeTypeOptions_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_contentwarehouse_v1_MapTypeOptions_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_contentwarehouse_v1_MapTypeOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_MapTypeOptions_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_contentwarehouse_v1_TimestampTypeOptions_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_contentwarehouse_v1_TimestampTypeOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_TimestampTypeOptions_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_contentwarehouse_v1_PropertyTypeOptions_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_contentwarehouse_v1_PropertyTypeOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_PropertyTypeOptions_descriptor,
            new java.lang.String[] {
              "PropertyDefinitions",
            });
    internal_static_google_cloud_contentwarehouse_v1_EnumTypeOptions_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_contentwarehouse_v1_EnumTypeOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_EnumTypeOptions_descriptor,
            new java.lang.String[] {
              "PossibleValues", "ValidationCheckDisabled",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
