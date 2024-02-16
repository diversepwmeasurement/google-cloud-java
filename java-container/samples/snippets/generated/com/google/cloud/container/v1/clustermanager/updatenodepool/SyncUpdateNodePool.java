/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.container.v1.samples;

// [START container_v1_generated_ClusterManager_UpdateNodePool_sync]
import com.google.cloud.container.v1.ClusterManagerClient;
import com.google.container.v1.ConfidentialNodes;
import com.google.container.v1.FastSocket;
import com.google.container.v1.GcfsConfig;
import com.google.container.v1.LinuxNodeConfig;
import com.google.container.v1.NetworkTags;
import com.google.container.v1.NodeKubeletConfig;
import com.google.container.v1.NodeLabels;
import com.google.container.v1.NodeNetworkConfig;
import com.google.container.v1.NodePool;
import com.google.container.v1.NodePoolLoggingConfig;
import com.google.container.v1.NodeTaints;
import com.google.container.v1.Operation;
import com.google.container.v1.ResourceLabels;
import com.google.container.v1.ResourceManagerTags;
import com.google.container.v1.UpdateNodePoolRequest;
import com.google.container.v1.VirtualNIC;
import com.google.container.v1.WindowsNodeConfig;
import com.google.container.v1.WorkloadMetadataConfig;
import java.util.ArrayList;

public class SyncUpdateNodePool {

  public static void main(String[] args) throws Exception {
    syncUpdateNodePool();
  }

  public static void syncUpdateNodePool() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
      UpdateNodePoolRequest request =
          UpdateNodePoolRequest.newBuilder()
              .setProjectId("projectId-894832108")
              .setZone("zone3744684")
              .setClusterId("clusterId561939637")
              .setNodePoolId("nodePoolId1121557241")
              .setNodeVersion("nodeVersion1155309686")
              .setImageType("imageType-878147787")
              .setName("name3373707")
              .addAllLocations(new ArrayList<String>())
              .setWorkloadMetadataConfig(WorkloadMetadataConfig.newBuilder().build())
              .setUpgradeSettings(NodePool.UpgradeSettings.newBuilder().build())
              .setTags(NetworkTags.newBuilder().build())
              .setTaints(NodeTaints.newBuilder().build())
              .setLabels(NodeLabels.newBuilder().build())
              .setLinuxNodeConfig(LinuxNodeConfig.newBuilder().build())
              .setKubeletConfig(NodeKubeletConfig.newBuilder().build())
              .setNodeNetworkConfig(NodeNetworkConfig.newBuilder().build())
              .setGcfsConfig(GcfsConfig.newBuilder().build())
              .setConfidentialNodes(ConfidentialNodes.newBuilder().build())
              .setGvnic(VirtualNIC.newBuilder().build())
              .setEtag("etag3123477")
              .setFastSocket(FastSocket.newBuilder().build())
              .setLoggingConfig(NodePoolLoggingConfig.newBuilder().build())
              .setResourceLabels(ResourceLabels.newBuilder().build())
              .setWindowsNodeConfig(WindowsNodeConfig.newBuilder().build())
              .setMachineType("machineType-218117087")
              .setDiskType("diskType279771767")
              .setDiskSizeGb(-757478089)
              .setResourceManagerTags(ResourceManagerTags.newBuilder().build())
              .build();
      Operation response = clusterManagerClient.updateNodePool(request);
    }
  }
}
// [END container_v1_generated_ClusterManager_UpdateNodePool_sync]
