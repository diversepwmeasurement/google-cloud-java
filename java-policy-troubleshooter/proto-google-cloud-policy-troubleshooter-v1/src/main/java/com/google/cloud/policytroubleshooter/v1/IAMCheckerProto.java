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
// source: google/cloud/policytroubleshooter/v1/checker.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.policytroubleshooter.v1;

public final class IAMCheckerProto {
  private IAMCheckerProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_policytroubleshooter_v1_TroubleshootIamPolicyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_policytroubleshooter_v1_TroubleshootIamPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_policytroubleshooter_v1_TroubleshootIamPolicyResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_policytroubleshooter_v1_TroubleshootIamPolicyResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n2google/cloud/policytroubleshooter/v1/c"
          + "hecker.proto\022$google.cloud.policytrouble"
          + "shooter.v1\0327google/cloud/policytroublesh"
          + "ooter/v1/explanations.proto\032\034google/api/"
          + "annotations.proto\032\027google/api/client.pro"
          + "to\032\027google/rpc/status.proto\"g\n\034Troublesh"
          + "ootIamPolicyRequest\022G\n\014access_tuple\030\001 \001("
          + "\01321.google.cloud.policytroubleshooter.v1"
          + ".AccessTuple\"\331\001\n\035TroubleshootIamPolicyRe"
          + "sponse\022A\n\006access\030\001 \001(\01621.google.cloud.po"
          + "licytroubleshooter.v1.AccessState\022Q\n\022exp"
          + "lained_policies\030\002 \003(\01325.google.cloud.pol"
          + "icytroubleshooter.v1.ExplainedPolicy\022\"\n\006"
          + "errors\030\003 \003(\0132\022.google.rpc.Status2\251\002\n\nIam"
          + "Checker\022\301\001\n\025TroubleshootIamPolicy\022B.goog"
          + "le.cloud.policytroubleshooter.v1.Trouble"
          + "shootIamPolicyRequest\032C.google.cloud.pol"
          + "icytroubleshooter.v1.TroubleshootIamPoli"
          + "cyResponse\"\037\202\323\344\223\002\031\"\024/v1/iam:troubleshoot"
          + ":\001*\032W\312A#policytroubleshooter.googleapis."
          + "com\322A.https://www.googleapis.com/auth/cl"
          + "oud-platformB\226\002\n(com.google.cloud.policy"
          + "troubleshooter.v1B\017IAMCheckerProtoP\001Z\\cl"
          + "oud.google.com/go/policytroubleshooter/a"
          + "piv1/policytroubleshooterpb;policytroubl"
          + "eshooterpb\370\001\001\252\002$Google.Cloud.PolicyTroub"
          + "leshooter.V1\312\002$Google\\Cloud\\PolicyTroubl"
          + "eshooter\\V1\352\002\'Google::Cloud::PolicyTroub"
          + "leshooter::V1P\000b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              google.cloud.policytroubleshooter.v1.Explanations.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_policytroubleshooter_v1_TroubleshootIamPolicyRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_policytroubleshooter_v1_TroubleshootIamPolicyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_policytroubleshooter_v1_TroubleshootIamPolicyRequest_descriptor,
            new java.lang.String[] {
              "AccessTuple",
            });
    internal_static_google_cloud_policytroubleshooter_v1_TroubleshootIamPolicyResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_policytroubleshooter_v1_TroubleshootIamPolicyResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_policytroubleshooter_v1_TroubleshootIamPolicyResponse_descriptor,
            new java.lang.String[] {
              "Access", "ExplainedPolicies", "Errors",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    google.cloud.policytroubleshooter.v1.Explanations.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
