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
// source: google/cloud/osconfig/v1/osconfig_zonal_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.osconfig.v1;

public final class OsConfigZonalServiceProto {
  private OsConfigZonalServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/osconfig/v1/osconfig_zona"
          + "l_service.proto\022\030google.cloud.osconfig.v"
          + "1\032\034google/api/annotations.proto\032\027google/"
          + "api/client.proto\032(google/cloud/osconfig/"
          + "v1/inventory.proto\032;google/cloud/osconfi"
          + "g/v1/os_policy_assignment_reports.proto\032"
          + "4google/cloud/osconfig/v1/os_policy_assi"
          + "gnments.proto\032,google/cloud/osconfig/v1/"
          + "vulnerability.proto\032#google/longrunning/"
          + "operations.proto2\254\027\n\024OsConfigZonalServic"
          + "e\022\276\002\n\030CreateOSPolicyAssignment\0229.google."
          + "cloud.osconfig.v1.CreateOSPolicyAssignme"
          + "ntRequest\032\035.google.longrunning.Operation"
          + "\"\307\001\312A9\n\022OSPolicyAssignment\022#OSPolicyAssi"
          + "gnmentOperationMetadata\332A3parent,os_poli"
          + "cy_assignment,os_policy_assignment_id\202\323\344"
          + "\223\002O\"7/v1/{parent=projects/*/locations/*}"
          + "/osPolicyAssignments:\024os_policy_assignme"
          + "nt\022\300\002\n\030UpdateOSPolicyAssignment\0229.google"
          + ".cloud.osconfig.v1.UpdateOSPolicyAssignm"
          + "entRequest\032\035.google.longrunning.Operatio"
          + "n\"\311\001\312A9\n\022OSPolicyAssignment\022#OSPolicyAss"
          + "ignmentOperationMetadata\332A os_policy_ass"
          + "ignment,update_mask\202\323\344\223\002d2L/v1/{os_polic"
          + "y_assignment.name=projects/*/locations/*"
          + "/osPolicyAssignments/*}:\024os_policy_assig"
          + "nment\022\305\001\n\025GetOSPolicyAssignment\0226.google"
          + ".cloud.osconfig.v1.GetOSPolicyAssignment"
          + "Request\032,.google.cloud.osconfig.v1.OSPol"
          + "icyAssignment\"F\332A\004name\202\323\344\223\0029\0227/v1/{name="
          + "projects/*/locations/*/osPolicyAssignmen"
          + "ts/*}\022\330\001\n\027ListOSPolicyAssignments\0228.goog"
          + "le.cloud.osconfig.v1.ListOSPolicyAssignm"
          + "entsRequest\0329.google.cloud.osconfig.v1.L"
          + "istOSPolicyAssignmentsResponse\"H\332A\006paren"
          + "t\202\323\344\223\0029\0227/v1/{parent=projects/*/location"
          + "s/*}/osPolicyAssignments\022\374\001\n\037ListOSPolic"
          + "yAssignmentRevisions\022@.google.cloud.osco"
          + "nfig.v1.ListOSPolicyAssignmentRevisionsR"
          + "equest\032A.google.cloud.osconfig.v1.ListOS"
          + "PolicyAssignmentRevisionsResponse\"T\332A\004na"
          + "me\202\323\344\223\002G\022E/v1/{name=projects/*/locations"
          + "/*/osPolicyAssignments/*}:listRevisions\022"
          + "\374\001\n\030DeleteOSPolicyAssignment\0229.google.cl"
          + "oud.osconfig.v1.DeleteOSPolicyAssignment"
          + "Request\032\035.google.longrunning.Operation\"\205"
          + "\001\312A<\n\025google.protobuf.Empty\022#OSPolicyAss"
          + "ignmentOperationMetadata\332A\004name\202\323\344\223\0029*7/"
          + "v1/{name=projects/*/locations/*/osPolicy"
          + "Assignments/*}\022\352\001\n\033GetOSPolicyAssignment"
          + "Report\022<.google.cloud.osconfig.v1.GetOSP"
          + "olicyAssignmentReportRequest\0322.google.cl"
          + "oud.osconfig.v1.OSPolicyAssignmentReport"
          + "\"Y\332A\004name\202\323\344\223\002L\022J/v1/{name=projects/*/lo"
          + "cations/*/instances/*/osPolicyAssignment"
          + "s/*/report}\022\200\002\n\035ListOSPolicyAssignmentRe"
          + "ports\022>.google.cloud.osconfig.v1.ListOSP"
          + "olicyAssignmentReportsRequest\032?.google.c"
          + "loud.osconfig.v1.ListOSPolicyAssignmentR"
          + "eportsResponse\"^\332A\006parent\202\323\344\223\002O\022M/v1/{pa"
          + "rent=projects/*/locations/*/instances/*/"
          + "osPolicyAssignments/*}/reports\022\252\001\n\014GetIn"
          + "ventory\022-.google.cloud.osconfig.v1.GetIn"
          + "ventoryRequest\032#.google.cloud.osconfig.v"
          + "1.Inventory\"F\332A\004name\202\323\344\223\0029\0227/v1/{name=pr"
          + "ojects/*/locations/*/instances/*/invento"
          + "ry}\022\304\001\n\017ListInventories\0220.google.cloud.o"
          + "sconfig.v1.ListInventoriesRequest\0321.goog"
          + "le.cloud.osconfig.v1.ListInventoriesResp"
          + "onse\"L\332A\006parent\202\323\344\223\002=\022;/v1/{parent=proje"
          + "cts/*/locations/*/instances/*}/inventori"
          + "es\022\322\001\n\026GetVulnerabilityReport\0227.google.c"
          + "loud.osconfig.v1.GetVulnerabilityReportR"
          + "equest\032-.google.cloud.osconfig.v1.Vulner"
          + "abilityReport\"P\332A\004name\202\323\344\223\002C\022A/v1/{name="
          + "projects/*/locations/*/instances/*/vulne"
          + "rabilityReport}\022\350\001\n\030ListVulnerabilityRep"
          + "orts\0229.google.cloud.osconfig.v1.ListVuln"
          + "erabilityReportsRequest\032:.google.cloud.o"
          + "sconfig.v1.ListVulnerabilityReportsRespo"
          + "nse\"U\332A\006parent\202\323\344\223\002F\022D/v1/{parent=projec"
          + "ts/*/locations/*/instances/*}/vulnerabil"
          + "ityReports\032K\312A\027osconfig.googleapis.com\322A"
          + ".https://www.googleapis.com/auth/cloud-p"
          + "latformB\311\001\n\034com.google.cloud.osconfig.v1"
          + "B\031OsConfigZonalServiceProtoP\001Z8cloud.goo"
          + "gle.com/go/osconfig/apiv1/osconfigpb;osc"
          + "onfigpb\252\002\030Google.Cloud.OsConfig.V1\312\002\030Goo"
          + "gle\\Cloud\\OsConfig\\V1\352\002\033Google::Cloud::O"
          + "sConfig::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.cloud.osconfig.v1.Inventories.getDescriptor(),
              com.google.cloud.osconfig.v1.OSPolicyAssignmentReportsProto.getDescriptor(),
              com.google.cloud.osconfig.v1.OsPolicyAssignmentsProto.getDescriptor(),
              com.google.cloud.osconfig.v1.VulnerabilityProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.cloud.osconfig.v1.Inventories.getDescriptor();
    com.google.cloud.osconfig.v1.OSPolicyAssignmentReportsProto.getDescriptor();
    com.google.cloud.osconfig.v1.OsPolicyAssignmentsProto.getDescriptor();
    com.google.cloud.osconfig.v1.VulnerabilityProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
