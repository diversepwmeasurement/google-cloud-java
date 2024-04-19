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
// source: google/monitoring/v3/service.proto

// Protobuf Java Version: 3.25.2
package com.google.monitoring.v3;

public final class ServiceMonitoringProto {
  private ServiceMonitoringProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_Service_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_Service_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_Service_Custom_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_Service_Custom_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_Service_AppEngine_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_Service_AppEngine_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_Service_CloudEndpoints_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_Service_CloudEndpoints_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_Service_ClusterIstio_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_Service_ClusterIstio_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_Service_MeshIstio_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_Service_MeshIstio_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_Service_IstioCanonicalService_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_Service_IstioCanonicalService_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_Service_CloudRun_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_Service_CloudRun_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_Service_GkeNamespace_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_Service_GkeNamespace_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_Service_GkeWorkload_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_Service_GkeWorkload_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_Service_GkeService_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_Service_GkeService_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_Service_BasicService_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_Service_BasicService_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_Service_BasicService_ServiceLabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_Service_BasicService_ServiceLabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_Service_Telemetry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_Service_Telemetry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_Service_UserLabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_Service_UserLabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ServiceLevelObjective_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ServiceLevelObjective_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ServiceLevelObjective_UserLabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ServiceLevelObjective_UserLabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ServiceLevelIndicator_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ServiceLevelIndicator_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_BasicSli_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_BasicSli_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_BasicSli_AvailabilityCriteria_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_BasicSli_AvailabilityCriteria_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_BasicSli_LatencyCriteria_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_BasicSli_LatencyCriteria_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_Range_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_Range_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_RequestBasedSli_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_RequestBasedSli_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_TimeSeriesRatio_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_TimeSeriesRatio_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_DistributionCut_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_DistributionCut_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_WindowsBasedSli_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_WindowsBasedSli_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_WindowsBasedSli_PerformanceThreshold_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_WindowsBasedSli_PerformanceThreshold_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_WindowsBasedSli_MetricRange_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_WindowsBasedSli_MetricRange_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\"google/monitoring/v3/service.proto\022\024go"
          + "ogle.monitoring.v3\032\037google/api/field_beh"
          + "avior.proto\032\031google/api/resource.proto\032\036"
          + "google/protobuf/duration.proto\032!google/t"
          + "ype/calendar_period.proto\"\224\021\n\007Service\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\010\022\024\n\014display_name\030\002 \001(\t\0226"
          + "\n\006custom\030\006 \001(\0132$.google.monitoring.v3.Se"
          + "rvice.CustomH\000\022=\n\napp_engine\030\007 \001(\0132\'.goo"
          + "gle.monitoring.v3.Service.AppEngineH\000\022G\n"
          + "\017cloud_endpoints\030\010 \001(\0132,.google.monitori"
          + "ng.v3.Service.CloudEndpointsH\000\022C\n\rcluste"
          + "r_istio\030\t \001(\0132*.google.monitoring.v3.Ser"
          + "vice.ClusterIstioH\000\022=\n\nmesh_istio\030\n \001(\0132"
          + "\'.google.monitoring.v3.Service.MeshIstio"
          + "H\000\022V\n\027istio_canonical_service\030\013 \001(\01323.go"
          + "ogle.monitoring.v3.Service.IstioCanonica"
          + "lServiceH\000\022;\n\tcloud_run\030\014 \001(\0132&.google.m"
          + "onitoring.v3.Service.CloudRunH\000\022C\n\rgke_n"
          + "amespace\030\017 \001(\0132*.google.monitoring.v3.Se"
          + "rvice.GkeNamespaceH\000\022A\n\014gke_workload\030\020 \001"
          + "(\0132).google.monitoring.v3.Service.GkeWor"
          + "kloadH\000\022?\n\013gke_service\030\021 \001(\0132(.google.mo"
          + "nitoring.v3.Service.GkeServiceH\000\022A\n\rbasi"
          + "c_service\030\023 \001(\0132*.google.monitoring.v3.S"
          + "ervice.BasicService\022:\n\ttelemetry\030\r \001(\0132\'"
          + ".google.monitoring.v3.Service.Telemetry\022"
          + "B\n\013user_labels\030\016 \003(\0132-.google.monitoring"
          + ".v3.Service.UserLabelsEntry\032\010\n\006Custom\032\036\n"
          + "\tAppEngine\022\021\n\tmodule_id\030\001 \001(\t\032!\n\016CloudEn"
          + "dpoints\022\017\n\007service\030\001 \001(\t\032g\n\014ClusterIstio"
          + "\022\020\n\010location\030\001 \001(\t\022\024\n\014cluster_name\030\002 \001(\t"
          + "\022\031\n\021service_namespace\030\003 \001(\t\022\024\n\014service_n"
          + "ame\030\004 \001(\t\032N\n\tMeshIstio\022\020\n\010mesh_uid\030\001 \001(\t"
          + "\022\031\n\021service_namespace\030\003 \001(\t\022\024\n\014service_n"
          + "ame\030\004 \001(\t\032i\n\025IstioCanonicalService\022\020\n\010me"
          + "sh_uid\030\001 \001(\t\022#\n\033canonical_service_namesp"
          + "ace\030\003 \001(\t\022\031\n\021canonical_service\030\004 \001(\t\0322\n\010"
          + "CloudRun\022\024\n\014service_name\030\001 \001(\t\022\020\n\010locati"
          + "on\030\002 \001(\t\032g\n\014GkeNamespace\022\027\n\nproject_id\030\001"
          + " \001(\tB\003\340A\003\022\020\n\010location\030\002 \001(\t\022\024\n\014cluster_n"
          + "ame\030\003 \001(\t\022\026\n\016namespace_name\030\004 \001(\t\032\254\001\n\013Gk"
          + "eWorkload\022\027\n\nproject_id\030\001 \001(\tB\003\340A\003\022\020\n\010lo"
          + "cation\030\002 \001(\t\022\024\n\014cluster_name\030\003 \001(\t\022\026\n\016na"
          + "mespace_name\030\004 \001(\t\022!\n\031top_level_controll"
          + "er_type\030\005 \001(\t\022!\n\031top_level_controller_na"
          + "me\030\006 \001(\t\032{\n\nGkeService\022\027\n\nproject_id\030\001 \001"
          + "(\tB\003\340A\003\022\020\n\010location\030\002 \001(\t\022\024\n\014cluster_nam"
          + "e\030\003 \001(\t\022\026\n\016namespace_name\030\004 \001(\t\022\024\n\014servi"
          + "ce_name\030\005 \001(\t\032\261\001\n\014BasicService\022\024\n\014servic"
          + "e_type\030\001 \001(\t\022U\n\016service_labels\030\002 \003(\0132=.g"
          + "oogle.monitoring.v3.Service.BasicService"
          + ".ServiceLabelsEntry\0324\n\022ServiceLabelsEntr"
          + "y\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\032\"\n\tTel"
          + "emetry\022\025\n\rresource_name\030\001 \001(\t\0321\n\017UserLab"
          + "elsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001"
          + ":\247\001\352A\243\001\n!monitoring.googleapis.com/Servi"
          + "ce\022%projects/{project}/services/{service"
          + "}\022/organizations/{organization}/services"
          + "/{service}\022#folders/{folder}/services/{s"
          + "ervice}\022\001*B\014\n\nidentifier\"\233\006\n\025ServiceLeve"
          + "lObjective\022\021\n\004name\030\001 \001(\tB\003\340A\010\022\024\n\014display"
          + "_name\030\013 \001(\t\022L\n\027service_level_indicator\030\003"
          + " \001(\0132+.google.monitoring.v3.ServiceLevel"
          + "Indicator\022\014\n\004goal\030\004 \001(\001\0223\n\016rolling_perio"
          + "d\030\005 \001(\0132\031.google.protobuf.DurationH\000\0226\n\017"
          + "calendar_period\030\006 \001(\0162\033.google.type.Cale"
          + "ndarPeriodH\000\022P\n\013user_labels\030\014 \003(\0132;.goog"
          + "le.monitoring.v3.ServiceLevelObjective.U"
          + "serLabelsEntry\0321\n\017UserLabelsEntry\022\013\n\003key"
          + "\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"4\n\004View\022\024\n\020VIE"
          + "W_UNSPECIFIED\020\000\022\010\n\004FULL\020\002\022\014\n\010EXPLICIT\020\001:"
          + "\312\002\352A\306\002\n/monitoring.googleapis.com/Servic"
          + "eLevelObjective\022Vprojects/{project}/serv"
          + "ices/{service}/serviceLevelObjectives/{s"
          + "ervice_level_objective}\022`organizations/{"
          + "organization}/services/{service}/service"
          + "LevelObjectives/{service_level_objective"
          + "}\022Tfolders/{folder}/services/{service}/s"
          + "erviceLevelObjectives/{service_level_obj"
          + "ective}\022\001* \001B\010\n\006period\"\324\001\n\025ServiceLevelI"
          + "ndicator\0223\n\tbasic_sli\030\004 \001(\0132\036.google.mon"
          + "itoring.v3.BasicSliH\000\022>\n\rrequest_based\030\001"
          + " \001(\0132%.google.monitoring.v3.RequestBased"
          + "SliH\000\022>\n\rwindows_based\030\002 \001(\0132%.google.mo"
          + "nitoring.v3.WindowsBasedSliH\000B\006\n\004type\"\266\002"
          + "\n\010BasicSli\022\016\n\006method\030\007 \003(\t\022\020\n\010location\030\010"
          + " \003(\t\022\017\n\007version\030\t \003(\t\022K\n\014availability\030\002 "
          + "\001(\01323.google.monitoring.v3.BasicSli.Avai"
          + "labilityCriteriaH\000\022A\n\007latency\030\003 \001(\0132..go"
          + "ogle.monitoring.v3.BasicSli.LatencyCrite"
          + "riaH\000\032\026\n\024AvailabilityCriteria\032?\n\017Latency"
          + "Criteria\022,\n\tthreshold\030\003 \001(\0132\031.google.pro"
          + "tobuf.DurationB\016\n\014sli_criteria\"!\n\005Range\022"
          + "\013\n\003min\030\001 \001(\001\022\013\n\003max\030\002 \001(\001\"\241\001\n\017RequestBas"
          + "edSli\022A\n\020good_total_ratio\030\001 \001(\0132%.google"
          + ".monitoring.v3.TimeSeriesRatioH\000\022A\n\020dist"
          + "ribution_cut\030\003 \001(\0132%.google.monitoring.v"
          + "3.DistributionCutH\000B\010\n\006method\"h\n\017TimeSer"
          + "iesRatio\022\033\n\023good_service_filter\030\004 \001(\t\022\032\n"
          + "\022bad_service_filter\030\005 \001(\t\022\034\n\024total_servi"
          + "ce_filter\030\006 \001(\t\"Z\n\017DistributionCut\022\033\n\023di"
          + "stribution_filter\030\004 \001(\t\022*\n\005range\030\005 \001(\0132\033"
          + ".google.monitoring.v3.Range\"\203\005\n\017WindowsB"
          + "asedSli\022 \n\026good_bad_metric_filter\030\005 \001(\tH"
          + "\000\022`\n\032good_total_ratio_threshold\030\002 \001(\0132:."
          + "google.monitoring.v3.WindowsBasedSli.Per"
          + "formanceThresholdH\000\022Q\n\024metric_mean_in_ra"
          + "nge\030\006 \001(\01321.google.monitoring.v3.Windows"
          + "BasedSli.MetricRangeH\000\022P\n\023metric_sum_in_"
          + "range\030\007 \001(\01321.google.monitoring.v3.Windo"
          + "wsBasedSli.MetricRangeH\000\0220\n\rwindow_perio"
          + "d\030\004 \001(\0132\031.google.protobuf.Duration\032\260\001\n\024P"
          + "erformanceThreshold\022<\n\013performance\030\001 \001(\013"
          + "2%.google.monitoring.v3.RequestBasedSliH"
          + "\000\022?\n\025basic_sli_performance\030\003 \001(\0132\036.googl"
          + "e.monitoring.v3.BasicSliH\000\022\021\n\tthreshold\030"
          + "\002 \001(\001B\006\n\004type\032N\n\013MetricRange\022\023\n\013time_ser"
          + "ies\030\001 \001(\t\022*\n\005range\030\004 \001(\0132\033.google.monito"
          + "ring.v3.RangeB\022\n\020window_criterionB\321\001\n\030co"
          + "m.google.monitoring.v3B\026ServiceMonitorin"
          + "gProtoP\001ZAcloud.google.com/go/monitoring"
          + "/apiv3/v2/monitoringpb;monitoringpb\252\002\032Go"
          + "ogle.Cloud.Monitoring.V3\312\002\032Google\\Cloud\\"
          + "Monitoring\\V3\352\002\035Google::Cloud::Monitorin"
          + "g::V3b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.type.CalendarPeriodProto.getDescriptor(),
            });
    internal_static_google_monitoring_v3_Service_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_v3_Service_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_Service_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Custom",
              "AppEngine",
              "CloudEndpoints",
              "ClusterIstio",
              "MeshIstio",
              "IstioCanonicalService",
              "CloudRun",
              "GkeNamespace",
              "GkeWorkload",
              "GkeService",
              "BasicService",
              "Telemetry",
              "UserLabels",
              "Identifier",
            });
    internal_static_google_monitoring_v3_Service_Custom_descriptor =
        internal_static_google_monitoring_v3_Service_descriptor.getNestedTypes().get(0);
    internal_static_google_monitoring_v3_Service_Custom_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_Service_Custom_descriptor,
            new java.lang.String[] {});
    internal_static_google_monitoring_v3_Service_AppEngine_descriptor =
        internal_static_google_monitoring_v3_Service_descriptor.getNestedTypes().get(1);
    internal_static_google_monitoring_v3_Service_AppEngine_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_Service_AppEngine_descriptor,
            new java.lang.String[] {
              "ModuleId",
            });
    internal_static_google_monitoring_v3_Service_CloudEndpoints_descriptor =
        internal_static_google_monitoring_v3_Service_descriptor.getNestedTypes().get(2);
    internal_static_google_monitoring_v3_Service_CloudEndpoints_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_Service_CloudEndpoints_descriptor,
            new java.lang.String[] {
              "Service",
            });
    internal_static_google_monitoring_v3_Service_ClusterIstio_descriptor =
        internal_static_google_monitoring_v3_Service_descriptor.getNestedTypes().get(3);
    internal_static_google_monitoring_v3_Service_ClusterIstio_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_Service_ClusterIstio_descriptor,
            new java.lang.String[] {
              "Location", "ClusterName", "ServiceNamespace", "ServiceName",
            });
    internal_static_google_monitoring_v3_Service_MeshIstio_descriptor =
        internal_static_google_monitoring_v3_Service_descriptor.getNestedTypes().get(4);
    internal_static_google_monitoring_v3_Service_MeshIstio_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_Service_MeshIstio_descriptor,
            new java.lang.String[] {
              "MeshUid", "ServiceNamespace", "ServiceName",
            });
    internal_static_google_monitoring_v3_Service_IstioCanonicalService_descriptor =
        internal_static_google_monitoring_v3_Service_descriptor.getNestedTypes().get(5);
    internal_static_google_monitoring_v3_Service_IstioCanonicalService_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_Service_IstioCanonicalService_descriptor,
            new java.lang.String[] {
              "MeshUid", "CanonicalServiceNamespace", "CanonicalService",
            });
    internal_static_google_monitoring_v3_Service_CloudRun_descriptor =
        internal_static_google_monitoring_v3_Service_descriptor.getNestedTypes().get(6);
    internal_static_google_monitoring_v3_Service_CloudRun_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_Service_CloudRun_descriptor,
            new java.lang.String[] {
              "ServiceName", "Location",
            });
    internal_static_google_monitoring_v3_Service_GkeNamespace_descriptor =
        internal_static_google_monitoring_v3_Service_descriptor.getNestedTypes().get(7);
    internal_static_google_monitoring_v3_Service_GkeNamespace_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_Service_GkeNamespace_descriptor,
            new java.lang.String[] {
              "ProjectId", "Location", "ClusterName", "NamespaceName",
            });
    internal_static_google_monitoring_v3_Service_GkeWorkload_descriptor =
        internal_static_google_monitoring_v3_Service_descriptor.getNestedTypes().get(8);
    internal_static_google_monitoring_v3_Service_GkeWorkload_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_Service_GkeWorkload_descriptor,
            new java.lang.String[] {
              "ProjectId",
              "Location",
              "ClusterName",
              "NamespaceName",
              "TopLevelControllerType",
              "TopLevelControllerName",
            });
    internal_static_google_monitoring_v3_Service_GkeService_descriptor =
        internal_static_google_monitoring_v3_Service_descriptor.getNestedTypes().get(9);
    internal_static_google_monitoring_v3_Service_GkeService_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_Service_GkeService_descriptor,
            new java.lang.String[] {
              "ProjectId", "Location", "ClusterName", "NamespaceName", "ServiceName",
            });
    internal_static_google_monitoring_v3_Service_BasicService_descriptor =
        internal_static_google_monitoring_v3_Service_descriptor.getNestedTypes().get(10);
    internal_static_google_monitoring_v3_Service_BasicService_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_Service_BasicService_descriptor,
            new java.lang.String[] {
              "ServiceType", "ServiceLabels",
            });
    internal_static_google_monitoring_v3_Service_BasicService_ServiceLabelsEntry_descriptor =
        internal_static_google_monitoring_v3_Service_BasicService_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_monitoring_v3_Service_BasicService_ServiceLabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_Service_BasicService_ServiceLabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_monitoring_v3_Service_Telemetry_descriptor =
        internal_static_google_monitoring_v3_Service_descriptor.getNestedTypes().get(11);
    internal_static_google_monitoring_v3_Service_Telemetry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_Service_Telemetry_descriptor,
            new java.lang.String[] {
              "ResourceName",
            });
    internal_static_google_monitoring_v3_Service_UserLabelsEntry_descriptor =
        internal_static_google_monitoring_v3_Service_descriptor.getNestedTypes().get(12);
    internal_static_google_monitoring_v3_Service_UserLabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_Service_UserLabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_monitoring_v3_ServiceLevelObjective_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_monitoring_v3_ServiceLevelObjective_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ServiceLevelObjective_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "ServiceLevelIndicator",
              "Goal",
              "RollingPeriod",
              "CalendarPeriod",
              "UserLabels",
              "Period",
            });
    internal_static_google_monitoring_v3_ServiceLevelObjective_UserLabelsEntry_descriptor =
        internal_static_google_monitoring_v3_ServiceLevelObjective_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_monitoring_v3_ServiceLevelObjective_UserLabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ServiceLevelObjective_UserLabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_monitoring_v3_ServiceLevelIndicator_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_monitoring_v3_ServiceLevelIndicator_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ServiceLevelIndicator_descriptor,
            new java.lang.String[] {
              "BasicSli", "RequestBased", "WindowsBased", "Type",
            });
    internal_static_google_monitoring_v3_BasicSli_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_monitoring_v3_BasicSli_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_BasicSli_descriptor,
            new java.lang.String[] {
              "Method", "Location", "Version", "Availability", "Latency", "SliCriteria",
            });
    internal_static_google_monitoring_v3_BasicSli_AvailabilityCriteria_descriptor =
        internal_static_google_monitoring_v3_BasicSli_descriptor.getNestedTypes().get(0);
    internal_static_google_monitoring_v3_BasicSli_AvailabilityCriteria_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_BasicSli_AvailabilityCriteria_descriptor,
            new java.lang.String[] {});
    internal_static_google_monitoring_v3_BasicSli_LatencyCriteria_descriptor =
        internal_static_google_monitoring_v3_BasicSli_descriptor.getNestedTypes().get(1);
    internal_static_google_monitoring_v3_BasicSli_LatencyCriteria_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_BasicSli_LatencyCriteria_descriptor,
            new java.lang.String[] {
              "Threshold",
            });
    internal_static_google_monitoring_v3_Range_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_monitoring_v3_Range_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_Range_descriptor,
            new java.lang.String[] {
              "Min", "Max",
            });
    internal_static_google_monitoring_v3_RequestBasedSli_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_monitoring_v3_RequestBasedSli_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_RequestBasedSli_descriptor,
            new java.lang.String[] {
              "GoodTotalRatio", "DistributionCut", "Method",
            });
    internal_static_google_monitoring_v3_TimeSeriesRatio_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_monitoring_v3_TimeSeriesRatio_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_TimeSeriesRatio_descriptor,
            new java.lang.String[] {
              "GoodServiceFilter", "BadServiceFilter", "TotalServiceFilter",
            });
    internal_static_google_monitoring_v3_DistributionCut_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_monitoring_v3_DistributionCut_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_DistributionCut_descriptor,
            new java.lang.String[] {
              "DistributionFilter", "Range",
            });
    internal_static_google_monitoring_v3_WindowsBasedSli_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_monitoring_v3_WindowsBasedSli_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_WindowsBasedSli_descriptor,
            new java.lang.String[] {
              "GoodBadMetricFilter",
              "GoodTotalRatioThreshold",
              "MetricMeanInRange",
              "MetricSumInRange",
              "WindowPeriod",
              "WindowCriterion",
            });
    internal_static_google_monitoring_v3_WindowsBasedSli_PerformanceThreshold_descriptor =
        internal_static_google_monitoring_v3_WindowsBasedSli_descriptor.getNestedTypes().get(0);
    internal_static_google_monitoring_v3_WindowsBasedSli_PerformanceThreshold_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_WindowsBasedSli_PerformanceThreshold_descriptor,
            new java.lang.String[] {
              "Performance", "BasicSliPerformance", "Threshold", "Type",
            });
    internal_static_google_monitoring_v3_WindowsBasedSli_MetricRange_descriptor =
        internal_static_google_monitoring_v3_WindowsBasedSli_descriptor.getNestedTypes().get(1);
    internal_static_google_monitoring_v3_WindowsBasedSli_MetricRange_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_WindowsBasedSli_MetricRange_descriptor,
            new java.lang.String[] {
              "TimeSeries", "Range",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.type.CalendarPeriodProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
