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
// source: google/cloud/contentwarehouse/v1/document_link_service.proto

package com.google.cloud.contentwarehouse.v1;

public final class DocumentLinkServiceProto {
  private DocumentLinkServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_ListLinkedTargetsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_ListLinkedTargetsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_ListLinkedTargetsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_ListLinkedTargetsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_ListLinkedSourcesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_ListLinkedSourcesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_ListLinkedSourcesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_ListLinkedSourcesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_DocumentLink_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_DocumentLink_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_CreateDocumentLinkRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_CreateDocumentLinkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_DeleteDocumentLinkRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_DeleteDocumentLinkRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n<google/cloud/contentwarehouse/v1/docum"
          + "ent_link_service.proto\022 google.cloud.con"
          + "tentwarehouse.v1\032\034google/api/annotations"
          + ".proto\032\027google/api/client.proto\032\037google/"
          + "api/field_behavior.proto\032\031google/api/res"
          + "ource.proto\032-google/cloud/contentwarehou"
          + "se/v1/common.proto\032/google/cloud/content"
          + "warehouse/v1/document.proto\032\033google/prot"
          + "obuf/empty.proto\032\037google/protobuf/timest"
          + "amp.proto\"|\n\031ListLinkedTargetsResponse\022F"
          + "\n\016document_links\030\001 \003(\0132..google.cloud.co"
          + "ntentwarehouse.v1.DocumentLink\022\027\n\017next_p"
          + "age_token\030\002 \001(\t\"\251\001\n\030ListLinkedTargetsReq"
          + "uest\022@\n\006parent\030\001 \001(\tB0\340A\002\372A*\n(contentwar"
          + "ehouse.googleapis.com/Document\022K\n\020reques"
          + "t_metadata\030\002 \001(\01321.google.cloud.contentw"
          + "arehouse.v1.RequestMetadata\"|\n\031ListLinke"
          + "dSourcesResponse\022F\n\016document_links\030\001 \003(\013"
          + "2..google.cloud.contentwarehouse.v1.Docu"
          + "mentLink\022\027\n\017next_page_token\030\002 \001(\t\"\320\001\n\030Li"
          + "stLinkedSourcesRequest\022@\n\006parent\030\001 \001(\tB0"
          + "\340A\002\372A*\n(contentwarehouse.googleapis.com/"
          + "Document\022\021\n\tpage_size\030\003 \001(\005\022\022\n\npage_toke"
          + "n\030\004 \001(\t\022K\n\020request_metadata\030\002 \001(\01321.goog"
          + "le.cloud.contentwarehouse.v1.RequestMeta"
          + "data\"\341\004\n\014DocumentLink\022\014\n\004name\030\001 \001(\t\022V\n\031s"
          + "ource_document_reference\030\002 \001(\01323.google."
          + "cloud.contentwarehouse.v1.DocumentRefere"
          + "nce\022V\n\031target_document_reference\030\003 \001(\01323"
          + ".google.cloud.contentwarehouse.v1.Docume"
          + "ntReference\022\023\n\013description\030\004 \001(\t\0224\n\013upda"
          + "te_time\030\005 \001(\0132\032.google.protobuf.Timestam"
          + "pB\003\340A\003\0224\n\013create_time\030\006 \001(\0132\032.google.pro"
          + "tobuf.TimestampB\003\340A\003\022C\n\005state\030\007 \001(\01624.go"
          + "ogle.cloud.contentwarehouse.v1.DocumentL"
          + "ink.State\"<\n\005State\022\025\n\021STATE_UNSPECIFIED\020"
          + "\000\022\n\n\006ACTIVE\020\001\022\020\n\014SOFT_DELETED\020\002:\216\001\352A\212\001\n,"
          + "contentwarehouse.googleapis.com/Document"
          + "Link\022Zprojects/{project}/locations/{loca"
          + "tion}/documents/{document}/documentLinks"
          + "/{document_link}\"\366\001\n\031CreateDocumentLinkR"
          + "equest\022@\n\006parent\030\001 \001(\tB0\340A\002\372A*\n(contentw"
          + "arehouse.googleapis.com/Document\022J\n\rdocu"
          + "ment_link\030\002 \001(\0132..google.cloud.contentwa"
          + "rehouse.v1.DocumentLinkB\003\340A\002\022K\n\020request_"
          + "metadata\030\003 \001(\01321.google.cloud.contentwar"
          + "ehouse.v1.RequestMetadata\"\254\001\n\031DeleteDocu"
          + "mentLinkRequest\022B\n\004name\030\001 \001(\tB4\340A\002\372A.\n,c"
          + "ontentwarehouse.googleapis.com/DocumentL"
          + "ink\022K\n\020request_metadata\030\002 \001(\01321.google.c"
          + "loud.contentwarehouse.v1.RequestMetadata"
          + "2\327\007\n\023DocumentLinkService\022\337\001\n\021ListLinkedT"
          + "argets\022:.google.cloud.contentwarehouse.v"
          + "1.ListLinkedTargetsRequest\032;.google.clou"
          + "d.contentwarehouse.v1.ListLinkedTargetsR"
          + "esponse\"Q\202\323\344\223\002B\"=/v1/{parent=projects/*/"
          + "locations/*/documents/*}/linkedTargets:\001"
          + "*\332A\006parent\022\337\001\n\021ListLinkedSources\022:.googl"
          + "e.cloud.contentwarehouse.v1.ListLinkedSo"
          + "urcesRequest\032;.google.cloud.contentwareh"
          + "ouse.v1.ListLinkedSourcesResponse\"Q\202\323\344\223\002"
          + "B\"=/v1/{parent=projects/*/locations/*/do"
          + "cuments/*}/linkedSources:\001*\332A\006parent\022\342\001\n"
          + "\022CreateDocumentLink\022;.google.cloud.conte"
          + "ntwarehouse.v1.CreateDocumentLinkRequest"
          + "\032..google.cloud.contentwarehouse.v1.Docu"
          + "mentLink\"_\202\323\344\223\002B\"=/v1/{parent=projects/*"
          + "/locations/*/documents/*}/documentLinks:"
          + "\001*\332A\024parent,document_link\022\301\001\n\022DeleteDocu"
          + "mentLink\022;.google.cloud.contentwarehouse"
          + ".v1.DeleteDocumentLinkRequest\032\026.google.p"
          + "rotobuf.Empty\"V\202\323\344\223\002I\"D/v1/{name=project"
          + "s/*/locations/*/documents/*/documentLink"
          + "s/*}:delete:\001*\332A\004name\032S\312A\037contentwarehou"
          + "se.googleapis.com\322A.https://www.googleap"
          + "is.com/auth/cloud-platformB\200\002\n$com.googl"
          + "e.cloud.contentwarehouse.v1B\030DocumentLin"
          + "kServiceProtoP\001ZPcloud.google.com/go/con"
          + "tentwarehouse/apiv1/contentwarehousepb;c"
          + "ontentwarehousepb\252\002 Google.Cloud.Content"
          + "Warehouse.V1\312\002 Google\\Cloud\\ContentWareh"
          + "ouse\\V1\352\002#Google::Cloud::ContentWarehous"
          + "e::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.contentwarehouse.v1.CommonProto.getDescriptor(),
              com.google.cloud.contentwarehouse.v1.DocumentProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_contentwarehouse_v1_ListLinkedTargetsResponse_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_contentwarehouse_v1_ListLinkedTargetsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_ListLinkedTargetsResponse_descriptor,
            new java.lang.String[] {
              "DocumentLinks", "NextPageToken",
            });
    internal_static_google_cloud_contentwarehouse_v1_ListLinkedTargetsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_contentwarehouse_v1_ListLinkedTargetsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_ListLinkedTargetsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "RequestMetadata",
            });
    internal_static_google_cloud_contentwarehouse_v1_ListLinkedSourcesResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_contentwarehouse_v1_ListLinkedSourcesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_ListLinkedSourcesResponse_descriptor,
            new java.lang.String[] {
              "DocumentLinks", "NextPageToken",
            });
    internal_static_google_cloud_contentwarehouse_v1_ListLinkedSourcesRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_contentwarehouse_v1_ListLinkedSourcesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_ListLinkedSourcesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "RequestMetadata",
            });
    internal_static_google_cloud_contentwarehouse_v1_DocumentLink_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_contentwarehouse_v1_DocumentLink_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_DocumentLink_descriptor,
            new java.lang.String[] {
              "Name",
              "SourceDocumentReference",
              "TargetDocumentReference",
              "Description",
              "UpdateTime",
              "CreateTime",
              "State",
            });
    internal_static_google_cloud_contentwarehouse_v1_CreateDocumentLinkRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_contentwarehouse_v1_CreateDocumentLinkRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_CreateDocumentLinkRequest_descriptor,
            new java.lang.String[] {
              "Parent", "DocumentLink", "RequestMetadata",
            });
    internal_static_google_cloud_contentwarehouse_v1_DeleteDocumentLinkRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_contentwarehouse_v1_DeleteDocumentLinkRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_DeleteDocumentLinkRequest_descriptor,
            new java.lang.String[] {
              "Name", "RequestMetadata",
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
    com.google.cloud.contentwarehouse.v1.CommonProto.getDescriptor();
    com.google.cloud.contentwarehouse.v1.DocumentProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
