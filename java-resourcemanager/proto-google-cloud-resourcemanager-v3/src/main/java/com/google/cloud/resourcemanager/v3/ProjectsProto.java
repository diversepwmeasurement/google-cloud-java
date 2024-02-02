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
// source: google/cloud/resourcemanager/v3/projects.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.resourcemanager.v3;

public final class ProjectsProto {
  private ProjectsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_Project_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_Project_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_Project_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_Project_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_GetProjectRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_GetProjectRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_ListProjectsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_ListProjectsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_ListProjectsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_ListProjectsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_SearchProjectsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_SearchProjectsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_SearchProjectsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_SearchProjectsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_CreateProjectRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_CreateProjectRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_CreateProjectMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_CreateProjectMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_UpdateProjectRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_UpdateProjectRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_UpdateProjectMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_UpdateProjectMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_MoveProjectRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_MoveProjectRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_MoveProjectMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_MoveProjectMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_DeleteProjectRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_DeleteProjectRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_DeleteProjectMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_DeleteProjectMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_UndeleteProjectRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_UndeleteProjectRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_UndeleteProjectMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_UndeleteProjectMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.google/cloud/resourcemanager/v3/projec"
          + "ts.proto\022\037google.cloud.resourcemanager.v"
          + "3\032\034google/api/annotations.proto\032\027google/"
          + "api/client.proto\032\037google/api/field_behav"
          + "ior.proto\032\031google/api/resource.proto\032\036go"
          + "ogle/iam/v1/iam_policy.proto\032\032google/iam"
          + "/v1/policy.proto\032#google/longrunning/ope"
          + "rations.proto\032 google/protobuf/field_mas"
          + "k.proto\032\037google/protobuf/timestamp.proto"
          + "\"\355\004\n\007Project\022\022\n\004name\030\001 \001(\tB\004\342A\001\003\022\024\n\006pare"
          + "nt\030\002 \001(\tB\004\342A\001\001\022\030\n\nproject_id\030\003 \001(\tB\004\342A\001\005"
          + "\022C\n\005state\030\004 \001(\0162..google.cloud.resourcem"
          + "anager.v3.Project.StateB\004\342A\001\003\022\032\n\014display"
          + "_name\030\005 \001(\tB\004\342A\001\001\0225\n\013create_time\030\006 \001(\0132\032"
          + ".google.protobuf.TimestampB\004\342A\001\003\0225\n\013upda"
          + "te_time\030\007 \001(\0132\032.google.protobuf.Timestam"
          + "pB\004\342A\001\003\0225\n\013delete_time\030\010 \001(\0132\032.google.pr"
          + "otobuf.TimestampB\004\342A\001\003\022\022\n\004etag\030\t \001(\tB\004\342A"
          + "\001\003\022J\n\006labels\030\n \003(\01324.google.cloud.resour"
          + "cemanager.v3.Project.LabelsEntryB\004\342A\001\001\032-"
          + "\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001("
          + "\t:\0028\001\"@\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\n\n"
          + "\006ACTIVE\020\001\022\024\n\020DELETE_REQUESTED\020\002:G\352AD\n+cl"
          + "oudresourcemanager.googleapis.com/Projec"
          + "t\022\022projects/{project}R\001\001\"W\n\021GetProjectRe"
          + "quest\022B\n\004name\030\001 \001(\tB4\342A\001\002\372A-\n+cloudresou"
          + "rcemanager.googleapis.com/Project\"\200\001\n\023Li"
          + "stProjectsRequest\022\032\n\006parent\030\001 \001(\tB\n\342A\001\002\372"
          + "A\003\022\001*\022\030\n\npage_token\030\002 \001(\tB\004\342A\001\001\022\027\n\tpage_"
          + "size\030\003 \001(\005B\004\342A\001\001\022\032\n\014show_deleted\030\004 \001(\010B\004"
          + "\342A\001\001\"k\n\024ListProjectsResponse\022:\n\010projects"
          + "\030\001 \003(\0132(.google.cloud.resourcemanager.v3"
          + ".Project\022\027\n\017next_page_token\030\002 \001(\t\"_\n\025Sea"
          + "rchProjectsRequest\022\023\n\005query\030\001 \001(\tB\004\342A\001\001\022"
          + "\030\n\npage_token\030\002 \001(\tB\004\342A\001\001\022\027\n\tpage_size\030\003"
          + " \001(\005B\004\342A\001\001\"m\n\026SearchProjectsResponse\022:\n\010"
          + "projects\030\001 \003(\0132(.google.cloud.resourcema"
          + "nager.v3.Project\022\027\n\017next_page_token\030\002 \001("
          + "\t\"W\n\024CreateProjectRequest\022?\n\007project\030\001 \001"
          + "(\0132(.google.cloud.resourcemanager.v3.Pro"
          + "jectB\004\342A\001\002\"i\n\025CreateProjectMetadata\022/\n\013c"
          + "reate_time\030\001 \001(\0132\032.google.protobuf.Times"
          + "tamp\022\020\n\010gettable\030\002 \001(\010\022\r\n\005ready\030\003 \001(\010\"\216\001"
          + "\n\024UpdateProjectRequest\022?\n\007project\030\001 \001(\0132"
          + "(.google.cloud.resourcemanager.v3.Projec"
          + "tB\004\342A\001\002\0225\n\013update_mask\030\002 \001(\0132\032.google.pr"
          + "otobuf.FieldMaskB\004\342A\001\001\"\027\n\025UpdateProjectM"
          + "etadata\"\200\001\n\022MoveProjectRequest\022B\n\004name\030\001"
          + " \001(\tB4\342A\001\002\372A-\n+cloudresourcemanager.goog"
          + "leapis.com/Project\022&\n\022destination_parent"
          + "\030\002 \001(\tB\n\342A\001\002\372A\003\022\001*\"\025\n\023MoveProjectMetadat"
          + "a\"Z\n\024DeleteProjectRequest\022B\n\004name\030\001 \001(\tB"
          + "4\342A\001\002\372A-\n+cloudresourcemanager.googleapi"
          + "s.com/Project\"\027\n\025DeleteProjectMetadata\"\\"
          + "\n\026UndeleteProjectRequest\022B\n\004name\030\001 \001(\tB4"
          + "\342A\001\002\372A-\n+cloudresourcemanager.googleapis"
          + ".com/Project\"\031\n\027UndeleteProjectMetadata2"
          + "\217\020\n\010Projects\022\220\001\n\nGetProject\0222.google.clo"
          + "ud.resourcemanager.v3.GetProjectRequest\032"
          + "(.google.cloud.resourcemanager.v3.Projec"
          + "t\"$\332A\004name\202\323\344\223\002\027\022\025/v3/{name=projects/*}\022"
          + "\232\001\n\014ListProjects\0224.google.cloud.resource"
          + "manager.v3.ListProjectsRequest\0325.google."
          + "cloud.resourcemanager.v3.ListProjectsRes"
          + "ponse\"\035\332A\006parent\202\323\344\223\002\016\022\014/v3/projects\022\246\001\n"
          + "\016SearchProjects\0226.google.cloud.resourcem"
          + "anager.v3.SearchProjectsRequest\0327.google"
          + ".cloud.resourcemanager.v3.SearchProjects"
          + "Response\"#\332A\005query\202\323\344\223\002\025\022\023/v3/projects:s"
          + "earch\022\261\001\n\rCreateProject\0225.google.cloud.r"
          + "esourcemanager.v3.CreateProjectRequest\032\035"
          + ".google.longrunning.Operation\"J\312A \n\007Proj"
          + "ect\022\025CreateProjectMetadata\332A\007project\202\323\344\223"
          + "\002\027\"\014/v3/projects:\007project\022\316\001\n\rUpdateProj"
          + "ect\0225.google.cloud.resourcemanager.v3.Up"
          + "dateProjectRequest\032\035.google.longrunning."
          + "Operation\"g\312A \n\007Project\022\025UpdateProjectMe"
          + "tadata\332A\023project,update_mask\202\323\344\223\002(2\035/v3/"
          + "{project.name=projects/*}:\007project\022\304\001\n\013M"
          + "oveProject\0223.google.cloud.resourcemanage"
          + "r.v3.MoveProjectRequest\032\035.google.longrun"
          + "ning.Operation\"a\312A\036\n\007Project\022\023MoveProjec"
          + "tMetadata\332A\030name, destination_parent\202\323\344\223"
          + "\002\037\"\032/v3/{name=projects/*}:move:\001*\022\256\001\n\rDe"
          + "leteProject\0225.google.cloud.resourcemanag"
          + "er.v3.DeleteProjectRequest\032\035.google.long"
          + "running.Operation\"G\312A \n\007Project\022\025DeleteP"
          + "rojectMetadata\332A\004name\202\323\344\223\002\027*\025/v3/{name=p"
          + "rojects/*}\022\300\001\n\017UndeleteProject\0227.google."
          + "cloud.resourcemanager.v3.UndeleteProject"
          + "Request\032\035.google.longrunning.Operation\"U"
          + "\312A\"\n\007Project\022\027UndeleteProjectMetadata\332A\004"
          + "name\202\323\344\223\002#\"\036/v3/{name=projects/*}:undele"
          + "te:\001*\022\207\001\n\014GetIamPolicy\022\".google.iam.v1.G"
          + "etIamPolicyRequest\032\025.google.iam.v1.Polic"
          + "y\"<\332A\010resource\202\323\344\223\002+\"&/v3/{resource=proj"
          + "ects/*}:getIamPolicy:\001*\022\217\001\n\014SetIamPolicy"
          + "\022\".google.iam.v1.SetIamPolicyRequest\032\025.g"
          + "oogle.iam.v1.Policy\"D\332A\020resource, policy"
          + "\202\323\344\223\002+\"&/v3/{resource=projects/*}:setIam"
          + "Policy:\001*\022\272\001\n\022TestIamPermissions\022(.googl"
          + "e.iam.v1.TestIamPermissionsRequest\032).goo"
          + "gle.iam.v1.TestIamPermissionsResponse\"O\332"
          + "A\025resource, permissions\202\323\344\223\0021\",/v3/{reso"
          + "urce=projects/*}:testIamPermissions:\001*\032\220"
          + "\001\312A#cloudresourcemanager.googleapis.com\322"
          + "Aghttps://www.googleapis.com/auth/cloud-"
          + "platform,https://www.googleapis.com/auth"
          + "/cloud-platform.read-onlyB\356\001\n#com.google"
          + ".cloud.resourcemanager.v3B\rProjectsProto"
          + "P\001ZMcloud.google.com/go/resourcemanager/"
          + "apiv3/resourcemanagerpb;resourcemanagerp"
          + "b\252\002\037Google.Cloud.ResourceManager.V3\312\002\037Go"
          + "ogle\\Cloud\\ResourceManager\\V3\352\002\"Google::"
          + "Cloud::ResourceManager::V3b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.iam.v1.IamPolicyProto.getDescriptor(),
              com.google.iam.v1.PolicyProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_resourcemanager_v3_Project_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_resourcemanager_v3_Project_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_Project_descriptor,
            new java.lang.String[] {
              "Name",
              "Parent",
              "ProjectId",
              "State",
              "DisplayName",
              "CreateTime",
              "UpdateTime",
              "DeleteTime",
              "Etag",
              "Labels",
            });
    internal_static_google_cloud_resourcemanager_v3_Project_LabelsEntry_descriptor =
        internal_static_google_cloud_resourcemanager_v3_Project_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_resourcemanager_v3_Project_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_Project_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_resourcemanager_v3_GetProjectRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_resourcemanager_v3_GetProjectRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_GetProjectRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_resourcemanager_v3_ListProjectsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_resourcemanager_v3_ListProjectsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_ListProjectsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageToken", "PageSize", "ShowDeleted",
            });
    internal_static_google_cloud_resourcemanager_v3_ListProjectsResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_resourcemanager_v3_ListProjectsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_ListProjectsResponse_descriptor,
            new java.lang.String[] {
              "Projects", "NextPageToken",
            });
    internal_static_google_cloud_resourcemanager_v3_SearchProjectsRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_resourcemanager_v3_SearchProjectsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_SearchProjectsRequest_descriptor,
            new java.lang.String[] {
              "Query", "PageToken", "PageSize",
            });
    internal_static_google_cloud_resourcemanager_v3_SearchProjectsResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_resourcemanager_v3_SearchProjectsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_SearchProjectsResponse_descriptor,
            new java.lang.String[] {
              "Projects", "NextPageToken",
            });
    internal_static_google_cloud_resourcemanager_v3_CreateProjectRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_resourcemanager_v3_CreateProjectRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_CreateProjectRequest_descriptor,
            new java.lang.String[] {
              "Project",
            });
    internal_static_google_cloud_resourcemanager_v3_CreateProjectMetadata_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_resourcemanager_v3_CreateProjectMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_CreateProjectMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime", "Gettable", "Ready",
            });
    internal_static_google_cloud_resourcemanager_v3_UpdateProjectRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_resourcemanager_v3_UpdateProjectRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_UpdateProjectRequest_descriptor,
            new java.lang.String[] {
              "Project", "UpdateMask",
            });
    internal_static_google_cloud_resourcemanager_v3_UpdateProjectMetadata_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_resourcemanager_v3_UpdateProjectMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_UpdateProjectMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_resourcemanager_v3_MoveProjectRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_resourcemanager_v3_MoveProjectRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_MoveProjectRequest_descriptor,
            new java.lang.String[] {
              "Name", "DestinationParent",
            });
    internal_static_google_cloud_resourcemanager_v3_MoveProjectMetadata_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_resourcemanager_v3_MoveProjectMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_MoveProjectMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_resourcemanager_v3_DeleteProjectRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_resourcemanager_v3_DeleteProjectRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_DeleteProjectRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_resourcemanager_v3_DeleteProjectMetadata_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_resourcemanager_v3_DeleteProjectMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_DeleteProjectMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_resourcemanager_v3_UndeleteProjectRequest_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_resourcemanager_v3_UndeleteProjectRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_UndeleteProjectRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_resourcemanager_v3_UndeleteProjectMetadata_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_resourcemanager_v3_UndeleteProjectMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_UndeleteProjectMetadata_descriptor,
            new java.lang.String[] {});
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.iam.v1.IamPolicyProto.getDescriptor();
    com.google.iam.v1.PolicyProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
