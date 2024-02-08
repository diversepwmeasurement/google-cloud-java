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
// source: google/cloud/baremetalsolution/v2/baremetalsolution.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.baremetalsolution.v2;

public final class BareMetalSolutionProto {
  private BareMetalSolutionProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_OperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_ResetInstanceResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_ResetInstanceResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n9google/cloud/baremetalsolution/v2/bare"
          + "metalsolution.proto\022!google.cloud.bareme"
          + "talsolution.v2\032\034google/api/annotations.p"
          + "roto\032\027google/api/client.proto\032\037google/ap"
          + "i/field_behavior.proto\0320google/cloud/bar"
          + "emetalsolution/v2/instance.proto\032+google"
          + "/cloud/baremetalsolution/v2/lun.proto\032/g"
          + "oogle/cloud/baremetalsolution/v2/network"
          + ".proto\0321google/cloud/baremetalsolution/v"
          + "2/nfs_share.proto\032/google/cloud/baremeta"
          + "lsolution/v2/osimage.proto\0324google/cloud"
          + "/baremetalsolution/v2/provisioning.proto"
          + "\032/google/cloud/baremetalsolution/v2/ssh_"
          + "key.proto\032.google/cloud/baremetalsolutio"
          + "n/v2/volume.proto\0327google/cloud/baremeta"
          + "lsolution/v2/volume_snapshot.proto\032#goog"
          + "le/longrunning/operations.proto\032\033google/"
          + "protobuf/empty.proto\032\037google/protobuf/ti"
          + "mestamp.proto\"\200\002\n\021OperationMetadata\0224\n\013c"
          + "reate_time\030\001 \001(\0132\032.google.protobuf.Times"
          + "tampB\003\340A\003\0221\n\010end_time\030\002 \001(\0132\032.google.pro"
          + "tobuf.TimestampB\003\340A\003\022\023\n\006target\030\003 \001(\tB\003\340A"
          + "\003\022\021\n\004verb\030\004 \001(\tB\003\340A\003\022\033\n\016status_message\030\005"
          + " \001(\tB\003\340A\003\022#\n\026requested_cancellation\030\006 \001("
          + "\010B\003\340A\003\022\030\n\013api_version\030\007 \001(\tB\003\340A\003\"\027\n\025Rese"
          + "tInstanceResponse2\272K\n\021BareMetalSolution\022"
          + "\302\001\n\rListInstances\0227.google.cloud.baremet"
          + "alsolution.v2.ListInstancesRequest\0328.goo"
          + "gle.cloud.baremetalsolution.v2.ListInsta"
          + "ncesResponse\">\332A\006parent\202\323\344\223\002/\022-/v2/{pare"
          + "nt=projects/*/locations/*}/instances\022\257\001\n"
          + "\013GetInstance\0225.google.cloud.baremetalsol"
          + "ution.v2.GetInstanceRequest\032+.google.clo"
          + "ud.baremetalsolution.v2.Instance\"<\332A\004nam"
          + "e\202\323\344\223\002/\022-/v2/{name=projects/*/locations/"
          + "*/instances/*}\022\352\001\n\016UpdateInstance\0228.goog"
          + "le.cloud.baremetalsolution.v2.UpdateInst"
          + "anceRequest\032\035.google.longrunning.Operati"
          + "on\"\177\312A\035\n\010Instance\022\021OperationMetadata\332A\024i"
          + "nstance,update_mask\202\323\344\223\002B26/v2/{instance"
          + ".name=projects/*/locations/*/instances/*"
          + "}:\010instance\022\317\001\n\016RenameInstance\0228.google."
          + "cloud.baremetalsolution.v2.RenameInstanc"
          + "eRequest\032+.google.cloud.baremetalsolutio"
          + "n.v2.Instance\"V\332A\024name,new_instance_id\202\323"
          + "\344\223\0029\"4/v2/{name=projects/*/locations/*/i"
          + "nstances/*}:rename:\001*\022\333\001\n\rResetInstance\022"
          + "7.google.cloud.baremetalsolution.v2.Rese"
          + "tInstanceRequest\032\035.google.longrunning.Op"
          + "eration\"r\312A*\n\025ResetInstanceResponse\022\021Ope"
          + "rationMetadata\332A\004name\202\323\344\223\0028\"3/v2/{name=p"
          + "rojects/*/locations/*/instances/*}:reset"
          + ":\001*\022\333\001\n\rStartInstance\0227.google.cloud.bar"
          + "emetalsolution.v2.StartInstanceRequest\032\035"
          + ".google.longrunning.Operation\"r\312A*\n\025Star"
          + "tInstanceResponse\022\021OperationMetadata\332A\004n"
          + "ame\202\323\344\223\0028\"3/v2/{name=projects/*/location"
          + "s/*/instances/*}:start:\001*\022\327\001\n\014StopInstan"
          + "ce\0226.google.cloud.baremetalsolution.v2.S"
          + "topInstanceRequest\032\035.google.longrunning."
          + "Operation\"p\312A)\n\024StopInstanceResponse\022\021Op"
          + "erationMetadata\332A\004name\202\323\344\223\0027\"2/v2/{name="
          + "projects/*/locations/*/instances/*}:stop"
          + ":\001*\022\250\002\n\036EnableInteractiveSerialConsole\022H"
          + ".google.cloud.baremetalsolution.v2.Enabl"
          + "eInteractiveSerialConsoleRequest\032\035.googl"
          + "e.longrunning.Operation\"\234\001\312A;\n&EnableInt"
          + "eractiveSerialConsoleResponse\022\021Operation"
          + "Metadata\332A\004name\202\323\344\223\002Q\"L/v2/{name=project"
          + "s/*/locations/*/instances/*}:enableInter"
          + "activeSerialConsole:\001*\022\254\002\n\037DisableIntera"
          + "ctiveSerialConsole\022I.google.cloud.bareme"
          + "talsolution.v2.DisableInteractiveSerialC"
          + "onsoleRequest\032\035.google.longrunning.Opera"
          + "tion\"\236\001\312A<\n\'DisableInteractiveSerialCons"
          + "oleResponse\022\021OperationMetadata\332A\004name\202\323\344"
          + "\223\002R\"M/v2/{name=projects/*/locations/*/in"
          + "stances/*}:disableInteractiveSerialConso"
          + "le:\001*\022\326\001\n\tDetachLun\0223.google.cloud.barem"
          + "etalsolution.v2.DetachLunRequest\032\035.googl"
          + "e.longrunning.Operation\"u\312A\035\n\010Instance\022\021"
          + "OperationMetadata\332A\014instance,lun\202\323\344\223\002@\";"
          + "/v2/{instance=projects/*/locations/*/ins"
          + "tances/*}:detachLun:\001*\022\272\001\n\013ListSSHKeys\0225"
          + ".google.cloud.baremetalsolution.v2.ListS"
          + "SHKeysRequest\0326.google.cloud.baremetalso"
          + "lution.v2.ListSSHKeysResponse\"<\332A\006parent"
          + "\202\323\344\223\002-\022+/v2/{parent=projects/*/locations"
          + "/*}/sshKeys\022\313\001\n\014CreateSSHKey\0226.google.cl"
          + "oud.baremetalsolution.v2.CreateSSHKeyReq"
          + "uest\032).google.cloud.baremetalsolution.v2"
          + ".SSHKey\"X\332A\031parent,ssh_key,ssh_key_id\202\323\344"
          + "\223\0026\"+/v2/{parent=projects/*/locations/*}"
          + "/sshKeys:\007ssh_key\022\232\001\n\014DeleteSSHKey\0226.goo"
          + "gle.cloud.baremetalsolution.v2.DeleteSSH"
          + "KeyRequest\032\026.google.protobuf.Empty\":\332A\004n"
          + "ame\202\323\344\223\002-*+/v2/{name=projects/*/location"
          + "s/*/sshKeys/*}\022\272\001\n\013ListVolumes\0225.google."
          + "cloud.baremetalsolution.v2.ListVolumesRe"
          + "quest\0326.google.cloud.baremetalsolution.v"
          + "2.ListVolumesResponse\"<\332A\006parent\202\323\344\223\002-\022+"
          + "/v2/{parent=projects/*/locations/*}/volu"
          + "mes\022\247\001\n\tGetVolume\0223.google.cloud.baremet"
          + "alsolution.v2.GetVolumeRequest\032).google."
          + "cloud.baremetalsolution.v2.Volume\":\332A\004na"
          + "me\202\323\344\223\002-\022+/v2/{name=projects/*/locations"
          + "/*/volumes/*}\022\334\001\n\014UpdateVolume\0226.google."
          + "cloud.baremetalsolution.v2.UpdateVolumeR"
          + "equest\032\035.google.longrunning.Operation\"u\312"
          + "A\033\n\006Volume\022\021OperationMetadata\332A\022volume,u"
          + "pdate_mask\202\323\344\223\002<22/v2/{volume.name=proje"
          + "cts/*/locations/*/volumes/*}:\006volume\022\305\001\n"
          + "\014RenameVolume\0226.google.cloud.baremetalso"
          + "lution.v2.RenameVolumeRequest\032).google.c"
          + "loud.baremetalsolution.v2.Volume\"R\332A\022nam"
          + "e,new_volume_id\202\323\344\223\0027\"2/v2/{name=project"
          + "s/*/locations/*/volumes/*}:rename:\001*\022\325\001\n"
          + "\013EvictVolume\0225.google.cloud.baremetalsol"
          + "ution.v2.EvictVolumeRequest\032\035.google.lon"
          + "grunning.Operation\"p\312A*\n\025google.protobuf"
          + ".Empty\022\021OperationMetadata\332A\004name\202\323\344\223\0026\"1"
          + "/v2/{name=projects/*/locations/*/volumes"
          + "/*}:evict:\001*\022\326\001\n\014ResizeVolume\0226.google.c"
          + "loud.baremetalsolution.v2.ResizeVolumeRe"
          + "quest\032\035.google.longrunning.Operation\"o\312A"
          + "\033\n\006Volume\022\021OperationMetadata\332A\017volume,si"
          + "ze_gib\202\323\344\223\0029\"4/v2/{volume=projects/*/loc"
          + "ations/*/volumes/*}:resize:\001*\022\276\001\n\014ListNe"
          + "tworks\0226.google.cloud.baremetalsolution."
          + "v2.ListNetworksRequest\0327.google.cloud.ba"
          + "remetalsolution.v2.ListNetworksResponse\""
          + "=\332A\006parent\202\323\344\223\002.\022,/v2/{parent=projects/*"
          + "/locations/*}/networks\022\337\001\n\020ListNetworkUs"
          + "age\022:.google.cloud.baremetalsolution.v2."
          + "ListNetworkUsageRequest\032;.google.cloud.b"
          + "aremetalsolution.v2.ListNetworkUsageResp"
          + "onse\"R\332A\010location\202\323\344\223\002A\022?/v2/{location=p"
          + "rojects/*/locations/*}/networks:listNetw"
          + "orkUsage\022\253\001\n\nGetNetwork\0224.google.cloud.b"
          + "aremetalsolution.v2.GetNetworkRequest\032*."
          + "google.cloud.baremetalsolution.v2.Networ"
          + "k\";\332A\004name\202\323\344\223\002.\022,/v2/{name=projects/*/l"
          + "ocations/*/networks/*}\022\343\001\n\rUpdateNetwork"
          + "\0227.google.cloud.baremetalsolution.v2.Upd"
          + "ateNetworkRequest\032\035.google.longrunning.O"
          + "peration\"z\312A\034\n\007Network\022\021OperationMetadat"
          + "a\332A\023network,update_mask\202\323\344\223\002?24/v2/{netw"
          + "ork.name=projects/*/locations/*/networks"
          + "/*}:\007network\022\364\001\n\024CreateVolumeSnapshot\022>."
          + "google.cloud.baremetalsolution.v2.Create"
          + "VolumeSnapshotRequest\0321.google.cloud.bar"
          + "emetalsolution.v2.VolumeSnapshot\"i\332A\026par"
          + "ent,volume_snapshot\202\323\344\223\002J\"7/v2/{parent=p"
          + "rojects/*/locations/*/volumes/*}/snapsho"
          + "ts:\017volume_snapshot\022\225\002\n\025RestoreVolumeSna"
          + "pshot\022?.google.cloud.baremetalsolution.v"
          + "2.RestoreVolumeSnapshotRequest\032\035.google."
          + "longrunning.Operation\"\233\001\312A#\n\016VolumeSnaps"
          + "hot\022\021OperationMetadata\332A\017volume_snapshot"
          + "\202\323\344\223\002]\"X/v2/{volume_snapshot=projects/*/"
          + "locations/*/volumes/*/snapshots/*}:resto"
          + "reVolumeSnapshot:\001*\022\266\001\n\024DeleteVolumeSnap"
          + "shot\022>.google.cloud.baremetalsolution.v2"
          + ".DeleteVolumeSnapshotRequest\032\026.google.pr"
          + "otobuf.Empty\"F\332A\004name\202\323\344\223\0029*7/v2/{name=p"
          + "rojects/*/locations/*/volumes/*/snapshot"
          + "s/*}\022\313\001\n\021GetVolumeSnapshot\022;.google.clou"
          + "d.baremetalsolution.v2.GetVolumeSnapshot"
          + "Request\0321.google.cloud.baremetalsolution"
          + ".v2.VolumeSnapshot\"F\332A\004name\202\323\344\223\0029\0227/v2/{"
          + "name=projects/*/locations/*/volumes/*/sn"
          + "apshots/*}\022\336\001\n\023ListVolumeSnapshots\022=.goo"
          + "gle.cloud.baremetalsolution.v2.ListVolum"
          + "eSnapshotsRequest\032>.google.cloud.baremet"
          + "alsolution.v2.ListVolumeSnapshotsRespons"
          + "e\"H\332A\006parent\202\323\344\223\0029\0227/v2/{parent=projects"
          + "/*/locations/*/volumes/*}/snapshots\022\245\001\n\006"
          + "GetLun\0220.google.cloud.baremetalsolution."
          + "v2.GetLunRequest\032&.google.cloud.baremeta"
          + "lsolution.v2.Lun\"A\332A\004name\202\323\344\223\0024\0222/v2/{na"
          + "me=projects/*/locations/*/volumes/*/luns"
          + "/*}\022\270\001\n\010ListLuns\0222.google.cloud.baremeta"
          + "lsolution.v2.ListLunsRequest\0323.google.cl"
          + "oud.baremetalsolution.v2.ListLunsRespons"
          + "e\"C\332A\006parent\202\323\344\223\0024\0222/v2/{parent=projects"
          + "/*/locations/*/volumes/*}/luns\022\326\001\n\010Evict"
          + "Lun\0222.google.cloud.baremetalsolution.v2."
          + "EvictLunRequest\032\035.google.longrunning.Ope"
          + "ration\"w\312A*\n\025google.protobuf.Empty\022\021Oper"
          + "ationMetadata\332A\004name\202\323\344\223\002=\"8/v2/{name=pr"
          + "ojects/*/locations/*/volumes/*/luns/*}:e"
          + "vict:\001*\022\257\001\n\013GetNfsShare\0225.google.cloud.b"
          + "aremetalsolution.v2.GetNfsShareRequest\032+"
          + ".google.cloud.baremetalsolution.v2.NfsSh"
          + "are\"<\332A\004name\202\323\344\223\002/\022-/v2/{name=projects/*"
          + "/locations/*/nfsShares/*}\022\302\001\n\rListNfsSha"
          + "res\0227.google.cloud.baremetalsolution.v2."
          + "ListNfsSharesRequest\0328.google.cloud.bare"
          + "metalsolution.v2.ListNfsSharesResponse\">"
          + "\332A\006parent\202\323\344\223\002/\022-/v2/{parent=projects/*/"
          + "locations/*}/nfsShares\022\356\001\n\016UpdateNfsShar"
          + "e\0228.google.cloud.baremetalsolution.v2.Up"
          + "dateNfsShareRequest\032\035.google.longrunning"
          + ".Operation\"\202\001\312A\035\n\010NfsShare\022\021OperationMet"
          + "adata\332A\025nfs_share,update_mask\202\323\344\223\002D27/v2"
          + "/{nfs_share.name=projects/*/locations/*/"
          + "nfsShares/*}:\tnfs_share\022\336\001\n\016CreateNfsSha"
          + "re\0228.google.cloud.baremetalsolution.v2.C"
          + "reateNfsShareRequest\032\035.google.longrunnin"
          + "g.Operation\"s\312A\035\n\010NfsShare\022\021OperationMet"
          + "adata\332A\020parent,nfs_share\202\323\344\223\002:\"-/v2/{par"
          + "ent=projects/*/locations/*}/nfsShares:\tn"
          + "fs_share\022\317\001\n\016RenameNfsShare\0228.google.clo"
          + "ud.baremetalsolution.v2.RenameNfsShareRe"
          + "quest\032+.google.cloud.baremetalsolution.v"
          + "2.NfsShare\"V\332A\024name,new_nfsshare_id\202\323\344\223\002"
          + "9\"4/v2/{name=projects/*/locations/*/nfsS"
          + "hares/*}:rename:\001*\022\324\001\n\016DeleteNfsShare\0228."
          + "google.cloud.baremetalsolution.v2.Delete"
          + "NfsShareRequest\032\035.google.longrunning.Ope"
          + "ration\"i\312A*\n\025google.protobuf.Empty\022\021Oper"
          + "ationMetadata\332A\004name\202\323\344\223\002/*-/v2/{name=pr"
          + "ojects/*/locations/*/nfsShares/*}\022\346\001\n\026Li"
          + "stProvisioningQuotas\022@.google.cloud.bare"
          + "metalsolution.v2.ListProvisioningQuotasR"
          + "equest\032A.google.cloud.baremetalsolution."
          + "v2.ListProvisioningQuotasResponse\"G\332A\006pa"
          + "rent\202\323\344\223\0028\0226/v2/{parent=projects/*/locat"
          + "ions/*}/provisioningQuotas\022\213\002\n\030SubmitPro"
          + "visioningConfig\022B.google.cloud.baremetal"
          + "solution.v2.SubmitProvisioningConfigRequ"
          + "est\032C.google.cloud.baremetalsolution.v2."
          + "SubmitProvisioningConfigResponse\"f\332A\032par"
          + "ent,provisioning_config\202\323\344\223\002C\">/v2/{pare"
          + "nt=projects/*/locations/*}/provisioningC"
          + "onfigs:submit:\001*\022\327\001\n\025GetProvisioningConf"
          + "ig\022?.google.cloud.baremetalsolution.v2.G"
          + "etProvisioningConfigRequest\0325.google.clo"
          + "ud.baremetalsolution.v2.ProvisioningConf"
          + "ig\"F\332A\004name\202\323\344\223\0029\0227/v2/{name=projects/*/"
          + "locations/*/provisioningConfigs/*}\022\210\002\n\030C"
          + "reateProvisioningConfig\022B.google.cloud.b"
          + "aremetalsolution.v2.CreateProvisioningCo"
          + "nfigRequest\0325.google.cloud.baremetalsolu"
          + "tion.v2.ProvisioningConfig\"q\332A\032parent,pr"
          + "ovisioning_config\202\323\344\223\002N\"7/v2/{parent=pro"
          + "jects/*/locations/*}/provisioningConfigs"
          + ":\023provisioning_config\022\242\002\n\030UpdateProvisio"
          + "ningConfig\022B.google.cloud.baremetalsolut"
          + "ion.v2.UpdateProvisioningConfigRequest\0325"
          + ".google.cloud.baremetalsolution.v2.Provi"
          + "sioningConfig\"\212\001\332A\037provisioning_config,u"
          + "pdate_mask\202\323\344\223\002b2K/v2/{provisioning_conf"
          + "ig.name=projects/*/locations/*/provision"
          + "ingConfigs/*}:\023provisioning_config\022\312\001\n\rR"
          + "enameNetwork\0227.google.cloud.baremetalsol"
          + "ution.v2.RenameNetworkRequest\032*.google.c"
          + "loud.baremetalsolution.v2.Network\"T\332A\023na"
          + "me,new_network_id\202\323\344\223\0028\"3/v2/{name=proje"
          + "cts/*/locations/*/networks/*}:rename:\001*\022"
          + "\276\001\n\014ListOSImages\0226.google.cloud.baremeta"
          + "lsolution.v2.ListOSImagesRequest\0327.googl"
          + "e.cloud.baremetalsolution.v2.ListOSImage"
          + "sResponse\"=\332A\006parent\202\323\344\223\002.\022,/v2/{parent="
          + "projects/*/locations/*}/osImages\032T\312A bar"
          + "emetalsolution.googleapis.com\322A.https://"
          + "www.googleapis.com/auth/cloud-platformB\205"
          + "\002\n%com.google.cloud.baremetalsolution.v2"
          + "B\026BareMetalSolutionProtoP\001ZScloud.google"
          + ".com/go/baremetalsolution/apiv2/baremeta"
          + "lsolutionpb;baremetalsolutionpb\252\002!Google"
          + ".Cloud.BareMetalSolution.V2\312\002!Google\\Clo"
          + "ud\\BareMetalSolution\\V2\352\002$Google::Cloud:"
          + ":BareMetalSolution::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.cloud.baremetalsolution.v2.InstanceProto.getDescriptor(),
              com.google.cloud.baremetalsolution.v2.LunProto.getDescriptor(),
              com.google.cloud.baremetalsolution.v2.NetworkProto.getDescriptor(),
              com.google.cloud.baremetalsolution.v2.NfsShareProto.getDescriptor(),
              com.google.cloud.baremetalsolution.v2.OsImageProto.getDescriptor(),
              com.google.cloud.baremetalsolution.v2.ProvisioningProto.getDescriptor(),
              com.google.cloud.baremetalsolution.v2.SshKeyProto.getDescriptor(),
              com.google.cloud.baremetalsolution.v2.VolumeProto.getDescriptor(),
              com.google.cloud.baremetalsolution.v2.VolumeSnapshotProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_baremetalsolution_v2_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_baremetalsolution_v2_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_OperationMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime",
              "EndTime",
              "Target",
              "Verb",
              "StatusMessage",
              "RequestedCancellation",
              "ApiVersion",
            });
    internal_static_google_cloud_baremetalsolution_v2_ResetInstanceResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_baremetalsolution_v2_ResetInstanceResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_ResetInstanceResponse_descriptor,
            new java.lang.String[] {});
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.baremetalsolution.v2.InstanceProto.getDescriptor();
    com.google.cloud.baremetalsolution.v2.LunProto.getDescriptor();
    com.google.cloud.baremetalsolution.v2.NetworkProto.getDescriptor();
    com.google.cloud.baremetalsolution.v2.NfsShareProto.getDescriptor();
    com.google.cloud.baremetalsolution.v2.OsImageProto.getDescriptor();
    com.google.cloud.baremetalsolution.v2.ProvisioningProto.getDescriptor();
    com.google.cloud.baremetalsolution.v2.SshKeyProto.getDescriptor();
    com.google.cloud.baremetalsolution.v2.VolumeProto.getDescriptor();
    com.google.cloud.baremetalsolution.v2.VolumeSnapshotProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
