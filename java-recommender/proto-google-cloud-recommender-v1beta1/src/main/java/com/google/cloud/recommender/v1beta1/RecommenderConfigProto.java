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
// source: google/cloud/recommender/v1beta1/recommender_config.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.recommender.v1beta1;

public final class RecommenderConfigProto {
  private RecommenderConfigProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1beta1_RecommenderConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1beta1_RecommenderConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1beta1_RecommenderConfig_AnnotationsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1beta1_RecommenderConfig_AnnotationsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1beta1_RecommenderGenerationConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1beta1_RecommenderGenerationConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n9google/cloud/recommender/v1beta1/recom"
          + "mender_config.proto\022 google.cloud.recomm"
          + "ender.v1beta1\032\037google/api/field_behavior"
          + ".proto\032\031google/api/resource.proto\032\034googl"
          + "e/protobuf/struct.proto\032\037google/protobuf"
          + "/timestamp.proto\"\334\004\n\021RecommenderConfig\022\014"
          + "\n\004name\030\001 \001(\t\022d\n\035recommender_generation_c"
          + "onfig\030\002 \001(\0132=.google.cloud.recommender.v"
          + "1beta1.RecommenderGenerationConfig\022\014\n\004et"
          + "ag\030\003 \001(\t\022/\n\013update_time\030\004 \001(\0132\032.google.p"
          + "rotobuf.Timestamp\022\032\n\013revision_id\030\005 \001(\tB\005"
          + "\342A\002\005\003\022Y\n\013annotations\030\006 \003(\0132D.google.clou"
          + "d.recommender.v1beta1.RecommenderConfig."
          + "AnnotationsEntry\022\024\n\014display_name\030\007 \001(\t\0322"
          + "\n\020AnnotationsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value"
          + "\030\002 \001(\t:\0028\001:\322\001\352A\316\001\n,recommender.googleapi"
          + "s.com/RecommenderConfig\022Iprojects/{proje"
          + "ct}/locations/{location}/recommenders/{r"
          + "ecommender}/config\022Sorganizations/{organ"
          + "ization}/locations/{location}/recommende"
          + "rs/{recommender}/config\"F\n\033RecommenderGe"
          + "nerationConfig\022\'\n\006params\030\001 \001(\0132\027.google."
          + "protobuf.StructB\262\001\n$com.google.cloud.rec"
          + "ommender.v1beta1B\026RecommenderConfigProto"
          + "P\001ZFcloud.google.com/go/recommender/apiv"
          + "1beta1/recommenderpb;recommenderpb\242\002\004CRE"
          + "C\252\002 Google.Cloud.Recommender.V1Beta1b\006pr"
          + "oto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_recommender_v1beta1_RecommenderConfig_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_recommender_v1beta1_RecommenderConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1beta1_RecommenderConfig_descriptor,
            new java.lang.String[] {
              "Name",
              "RecommenderGenerationConfig",
              "Etag",
              "UpdateTime",
              "RevisionId",
              "Annotations",
              "DisplayName",
            });
    internal_static_google_cloud_recommender_v1beta1_RecommenderConfig_AnnotationsEntry_descriptor =
        internal_static_google_cloud_recommender_v1beta1_RecommenderConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_recommender_v1beta1_RecommenderConfig_AnnotationsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1beta1_RecommenderConfig_AnnotationsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_recommender_v1beta1_RecommenderGenerationConfig_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_recommender_v1beta1_RecommenderGenerationConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1beta1_RecommenderGenerationConfig_descriptor,
            new java.lang.String[] {
              "Params",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
