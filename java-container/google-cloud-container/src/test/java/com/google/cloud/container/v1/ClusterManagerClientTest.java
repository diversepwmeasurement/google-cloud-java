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
package com.google.cloud.container.v1;

import static com.google.cloud.container.v1.ClusterManagerClient.ListUsableSubnetworksPagedResponse;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.common.collect.Lists;
import com.google.container.v1.AddonsConfig;
import com.google.container.v1.CancelOperationRequest;
import com.google.container.v1.Cluster;
import com.google.container.v1.ClusterUpdate;
import com.google.container.v1.CompleteIPRotationRequest;
import com.google.container.v1.CreateClusterRequest;
import com.google.container.v1.CreateNodePoolRequest;
import com.google.container.v1.DeleteClusterRequest;
import com.google.container.v1.DeleteNodePoolRequest;
import com.google.container.v1.GetClusterRequest;
import com.google.container.v1.GetNodePoolRequest;
import com.google.container.v1.GetOperationRequest;
import com.google.container.v1.GetServerConfigRequest;
import com.google.container.v1.ListClustersRequest;
import com.google.container.v1.ListClustersResponse;
import com.google.container.v1.ListNodePoolsRequest;
import com.google.container.v1.ListNodePoolsResponse;
import com.google.container.v1.ListOperationsRequest;
import com.google.container.v1.ListOperationsResponse;
import com.google.container.v1.ListUsableSubnetworksRequest;
import com.google.container.v1.ListUsableSubnetworksResponse;
import com.google.container.v1.MaintenancePolicy;
import com.google.container.v1.MasterAuth;
import com.google.container.v1.NetworkPolicy;
import com.google.container.v1.NodeManagement;
import com.google.container.v1.NodePool;
import com.google.container.v1.NodePoolAutoscaling;
import com.google.container.v1.Operation;
import com.google.container.v1.RollbackNodePoolUpgradeRequest;
import com.google.container.v1.ServerConfig;
import com.google.container.v1.SetAddonsConfigRequest;
import com.google.container.v1.SetLabelsRequest;
import com.google.container.v1.SetLegacyAbacRequest;
import com.google.container.v1.SetLocationsRequest;
import com.google.container.v1.SetLoggingServiceRequest;
import com.google.container.v1.SetMaintenancePolicyRequest;
import com.google.container.v1.SetMasterAuthRequest;
import com.google.container.v1.SetMonitoringServiceRequest;
import com.google.container.v1.SetNetworkPolicyRequest;
import com.google.container.v1.SetNodePoolAutoscalingRequest;
import com.google.container.v1.SetNodePoolManagementRequest;
import com.google.container.v1.SetNodePoolSizeRequest;
import com.google.container.v1.StartIPRotationRequest;
import com.google.container.v1.UpdateClusterRequest;
import com.google.container.v1.UpdateMasterRequest;
import com.google.container.v1.UpdateNodePoolRequest;
import com.google.container.v1.UsableSubnetwork;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Empty;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@javax.annotation.Generated("by GAPIC")
public class ClusterManagerClientTest {
  private static MockClusterManager mockClusterManager;
  private static MockServiceHelper serviceHelper;
  private ClusterManagerClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockClusterManager = new MockClusterManager();
    serviceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockClusterManager));
    serviceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    serviceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    serviceHelper.reset();
    channelProvider = serviceHelper.createChannelProvider();
    ClusterManagerSettings settings =
        ClusterManagerSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = ClusterManagerClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void deleteClusterTest() {
    String name = "name3373707";
    String zone2 = "zone2-696322977";
    String detail = "detail-1335224239";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String targetLink = "targetLink-2084812312";
    String location = "location1901043637";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    Operation expectedResponse =
        Operation.newBuilder()
            .setName(name)
            .setZone(zone2)
            .setDetail(detail)
            .setStatusMessage(statusMessage)
            .setSelfLink(selfLink)
            .setTargetLink(targetLink)
            .setLocation(location)
            .setStartTime(startTime)
            .setEndTime(endTime)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";
    String clusterId = "clusterId240280960";

    Operation actualResponse = client.deleteCluster(projectId, zone, clusterId);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteClusterRequest actualRequest = (DeleteClusterRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertEquals(clusterId, actualRequest.getClusterId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void deleteClusterExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";
      String clusterId = "clusterId240280960";

      client.deleteCluster(projectId, zone, clusterId);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteClusterTest2() {
    String name = "name3373707";
    String zone2 = "zone2-696322977";
    String detail = "detail-1335224239";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String targetLink = "targetLink-2084812312";
    String location = "location1901043637";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    Operation expectedResponse =
        Operation.newBuilder()
            .setName(name)
            .setZone(zone2)
            .setDetail(detail)
            .setStatusMessage(statusMessage)
            .setSelfLink(selfLink)
            .setTargetLink(targetLink)
            .setLocation(location)
            .setStartTime(startTime)
            .setEndTime(endTime)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";
    String clusterId = "clusterId240280960";

    Operation actualResponse = client.deleteCluster(projectId, zone, clusterId);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteClusterRequest actualRequest = (DeleteClusterRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertEquals(clusterId, actualRequest.getClusterId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void deleteClusterExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";
      String clusterId = "clusterId240280960";

      client.deleteCluster(projectId, zone, clusterId);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteNodePoolTest() {
    String name = "name3373707";
    String zone2 = "zone2-696322977";
    String detail = "detail-1335224239";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String targetLink = "targetLink-2084812312";
    String location = "location1901043637";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    Operation expectedResponse =
        Operation.newBuilder()
            .setName(name)
            .setZone(zone2)
            .setDetail(detail)
            .setStatusMessage(statusMessage)
            .setSelfLink(selfLink)
            .setTargetLink(targetLink)
            .setLocation(location)
            .setStartTime(startTime)
            .setEndTime(endTime)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";
    String clusterId = "clusterId240280960";
    String nodePoolId = "nodePoolId1043384033";

    Operation actualResponse = client.deleteNodePool(projectId, zone, clusterId, nodePoolId);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteNodePoolRequest actualRequest = (DeleteNodePoolRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertEquals(clusterId, actualRequest.getClusterId());
    Assert.assertEquals(nodePoolId, actualRequest.getNodePoolId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void deleteNodePoolExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";
      String clusterId = "clusterId240280960";
      String nodePoolId = "nodePoolId1043384033";

      client.deleteNodePool(projectId, zone, clusterId, nodePoolId);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteNodePoolTest2() {
    String name = "name3373707";
    String zone2 = "zone2-696322977";
    String detail = "detail-1335224239";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String targetLink = "targetLink-2084812312";
    String location = "location1901043637";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    Operation expectedResponse =
        Operation.newBuilder()
            .setName(name)
            .setZone(zone2)
            .setDetail(detail)
            .setStatusMessage(statusMessage)
            .setSelfLink(selfLink)
            .setTargetLink(targetLink)
            .setLocation(location)
            .setStartTime(startTime)
            .setEndTime(endTime)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";
    String clusterId = "clusterId240280960";
    String nodePoolId = "nodePoolId1043384033";

    Operation actualResponse = client.deleteNodePool(projectId, zone, clusterId, nodePoolId);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteNodePoolRequest actualRequest = (DeleteNodePoolRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertEquals(clusterId, actualRequest.getClusterId());
    Assert.assertEquals(nodePoolId, actualRequest.getNodePoolId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void deleteNodePoolExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";
      String clusterId = "clusterId240280960";
      String nodePoolId = "nodePoolId1043384033";

      client.deleteNodePool(projectId, zone, clusterId, nodePoolId);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listClustersTest() {
    ListClustersResponse expectedResponse = ListClustersResponse.newBuilder().build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";

    ListClustersResponse actualResponse = client.listClusters(projectId, zone);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListClustersRequest actualRequest = (ListClustersRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void listClustersExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";

      client.listClusters(projectId, zone);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listClustersTest2() {
    ListClustersResponse expectedResponse = ListClustersResponse.newBuilder().build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";

    ListClustersResponse actualResponse = client.listClusters(projectId, zone);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListClustersRequest actualRequest = (ListClustersRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void listClustersExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";

      client.listClusters(projectId, zone);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getClusterTest() {
    String name = "name3373707";
    String description = "description-1724546052";
    int initialNodeCount = 1682564205;
    String loggingService = "loggingService-1700501035";
    String monitoringService = "monitoringService1469270462";
    String network = "network1843485230";
    String clusterIpv4Cidr = "clusterIpv4Cidr-141875831";
    String subnetwork = "subnetwork-1302785042";
    boolean enableKubernetesAlpha = false;
    String labelFingerprint = "labelFingerprint714995737";
    String selfLink = "selfLink-1691268851";
    String zone2 = "zone2-696322977";
    String endpoint = "endpoint1741102485";
    String initialClusterVersion = "initialClusterVersion-276373352";
    String currentMasterVersion = "currentMasterVersion-920953983";
    String currentNodeVersion = "currentNodeVersion-407476063";
    String createTime = "createTime-493574096";
    String statusMessage = "statusMessage-239442758";
    int nodeIpv4CidrSize = 1181176815;
    String servicesIpv4Cidr = "servicesIpv4Cidr1966438125";
    int currentNodeCount = 178977560;
    String expireTime = "expireTime-96179731";
    String location = "location1901043637";
    boolean enableTpu = false;
    String tpuIpv4CidrBlock = "tpuIpv4CidrBlock1137906646";
    Cluster expectedResponse =
        Cluster.newBuilder()
            .setName(name)
            .setDescription(description)
            .setInitialNodeCount(initialNodeCount)
            .setLoggingService(loggingService)
            .setMonitoringService(monitoringService)
            .setNetwork(network)
            .setClusterIpv4Cidr(clusterIpv4Cidr)
            .setSubnetwork(subnetwork)
            .setEnableKubernetesAlpha(enableKubernetesAlpha)
            .setLabelFingerprint(labelFingerprint)
            .setSelfLink(selfLink)
            .setZone(zone2)
            .setEndpoint(endpoint)
            .setInitialClusterVersion(initialClusterVersion)
            .setCurrentMasterVersion(currentMasterVersion)
            .setCurrentNodeVersion(currentNodeVersion)
            .setCreateTime(createTime)
            .setStatusMessage(statusMessage)
            .setNodeIpv4CidrSize(nodeIpv4CidrSize)
            .setServicesIpv4Cidr(servicesIpv4Cidr)
            .setCurrentNodeCount(currentNodeCount)
            .setExpireTime(expireTime)
            .setLocation(location)
            .setEnableTpu(enableTpu)
            .setTpuIpv4CidrBlock(tpuIpv4CidrBlock)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";
    String clusterId = "clusterId240280960";

    Cluster actualResponse = client.getCluster(projectId, zone, clusterId);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetClusterRequest actualRequest = (GetClusterRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertEquals(clusterId, actualRequest.getClusterId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void getClusterExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";
      String clusterId = "clusterId240280960";

      client.getCluster(projectId, zone, clusterId);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getClusterTest2() {
    String name = "name3373707";
    String description = "description-1724546052";
    int initialNodeCount = 1682564205;
    String loggingService = "loggingService-1700501035";
    String monitoringService = "monitoringService1469270462";
    String network = "network1843485230";
    String clusterIpv4Cidr = "clusterIpv4Cidr-141875831";
    String subnetwork = "subnetwork-1302785042";
    boolean enableKubernetesAlpha = false;
    String labelFingerprint = "labelFingerprint714995737";
    String selfLink = "selfLink-1691268851";
    String zone2 = "zone2-696322977";
    String endpoint = "endpoint1741102485";
    String initialClusterVersion = "initialClusterVersion-276373352";
    String currentMasterVersion = "currentMasterVersion-920953983";
    String currentNodeVersion = "currentNodeVersion-407476063";
    String createTime = "createTime-493574096";
    String statusMessage = "statusMessage-239442758";
    int nodeIpv4CidrSize = 1181176815;
    String servicesIpv4Cidr = "servicesIpv4Cidr1966438125";
    int currentNodeCount = 178977560;
    String expireTime = "expireTime-96179731";
    String location = "location1901043637";
    boolean enableTpu = false;
    String tpuIpv4CidrBlock = "tpuIpv4CidrBlock1137906646";
    Cluster expectedResponse =
        Cluster.newBuilder()
            .setName(name)
            .setDescription(description)
            .setInitialNodeCount(initialNodeCount)
            .setLoggingService(loggingService)
            .setMonitoringService(monitoringService)
            .setNetwork(network)
            .setClusterIpv4Cidr(clusterIpv4Cidr)
            .setSubnetwork(subnetwork)
            .setEnableKubernetesAlpha(enableKubernetesAlpha)
            .setLabelFingerprint(labelFingerprint)
            .setSelfLink(selfLink)
            .setZone(zone2)
            .setEndpoint(endpoint)
            .setInitialClusterVersion(initialClusterVersion)
            .setCurrentMasterVersion(currentMasterVersion)
            .setCurrentNodeVersion(currentNodeVersion)
            .setCreateTime(createTime)
            .setStatusMessage(statusMessage)
            .setNodeIpv4CidrSize(nodeIpv4CidrSize)
            .setServicesIpv4Cidr(servicesIpv4Cidr)
            .setCurrentNodeCount(currentNodeCount)
            .setExpireTime(expireTime)
            .setLocation(location)
            .setEnableTpu(enableTpu)
            .setTpuIpv4CidrBlock(tpuIpv4CidrBlock)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";
    String clusterId = "clusterId240280960";

    Cluster actualResponse = client.getCluster(projectId, zone, clusterId);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetClusterRequest actualRequest = (GetClusterRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertEquals(clusterId, actualRequest.getClusterId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void getClusterExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";
      String clusterId = "clusterId240280960";

      client.getCluster(projectId, zone, clusterId);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void createClusterTest() {
    String name = "name3373707";
    String zone2 = "zone2-696322977";
    String detail = "detail-1335224239";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String targetLink = "targetLink-2084812312";
    String location = "location1901043637";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    Operation expectedResponse =
        Operation.newBuilder()
            .setName(name)
            .setZone(zone2)
            .setDetail(detail)
            .setStatusMessage(statusMessage)
            .setSelfLink(selfLink)
            .setTargetLink(targetLink)
            .setLocation(location)
            .setStartTime(startTime)
            .setEndTime(endTime)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";
    Cluster cluster = Cluster.newBuilder().build();

    Operation actualResponse = client.createCluster(projectId, zone, cluster);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateClusterRequest actualRequest = (CreateClusterRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertEquals(cluster, actualRequest.getCluster());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void createClusterExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";
      Cluster cluster = Cluster.newBuilder().build();

      client.createCluster(projectId, zone, cluster);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void createClusterTest2() {
    String name = "name3373707";
    String zone2 = "zone2-696322977";
    String detail = "detail-1335224239";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String targetLink = "targetLink-2084812312";
    String location = "location1901043637";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    Operation expectedResponse =
        Operation.newBuilder()
            .setName(name)
            .setZone(zone2)
            .setDetail(detail)
            .setStatusMessage(statusMessage)
            .setSelfLink(selfLink)
            .setTargetLink(targetLink)
            .setLocation(location)
            .setStartTime(startTime)
            .setEndTime(endTime)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";
    Cluster cluster = Cluster.newBuilder().build();

    Operation actualResponse = client.createCluster(projectId, zone, cluster);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateClusterRequest actualRequest = (CreateClusterRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertEquals(cluster, actualRequest.getCluster());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void createClusterExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";
      Cluster cluster = Cluster.newBuilder().build();

      client.createCluster(projectId, zone, cluster);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void updateClusterTest() {
    String name = "name3373707";
    String zone2 = "zone2-696322977";
    String detail = "detail-1335224239";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String targetLink = "targetLink-2084812312";
    String location = "location1901043637";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    Operation expectedResponse =
        Operation.newBuilder()
            .setName(name)
            .setZone(zone2)
            .setDetail(detail)
            .setStatusMessage(statusMessage)
            .setSelfLink(selfLink)
            .setTargetLink(targetLink)
            .setLocation(location)
            .setStartTime(startTime)
            .setEndTime(endTime)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";
    String clusterId = "clusterId240280960";
    ClusterUpdate update = ClusterUpdate.newBuilder().build();

    Operation actualResponse = client.updateCluster(projectId, zone, clusterId, update);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateClusterRequest actualRequest = (UpdateClusterRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertEquals(clusterId, actualRequest.getClusterId());
    Assert.assertEquals(update, actualRequest.getUpdate());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void updateClusterExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";
      String clusterId = "clusterId240280960";
      ClusterUpdate update = ClusterUpdate.newBuilder().build();

      client.updateCluster(projectId, zone, clusterId, update);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void updateClusterTest2() {
    String name = "name3373707";
    String zone2 = "zone2-696322977";
    String detail = "detail-1335224239";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String targetLink = "targetLink-2084812312";
    String location = "location1901043637";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    Operation expectedResponse =
        Operation.newBuilder()
            .setName(name)
            .setZone(zone2)
            .setDetail(detail)
            .setStatusMessage(statusMessage)
            .setSelfLink(selfLink)
            .setTargetLink(targetLink)
            .setLocation(location)
            .setStartTime(startTime)
            .setEndTime(endTime)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";
    String clusterId = "clusterId240280960";
    ClusterUpdate update = ClusterUpdate.newBuilder().build();

    Operation actualResponse = client.updateCluster(projectId, zone, clusterId, update);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateClusterRequest actualRequest = (UpdateClusterRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertEquals(clusterId, actualRequest.getClusterId());
    Assert.assertEquals(update, actualRequest.getUpdate());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void updateClusterExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";
      String clusterId = "clusterId240280960";
      ClusterUpdate update = ClusterUpdate.newBuilder().build();

      client.updateCluster(projectId, zone, clusterId, update);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void updateNodePoolTest() {
    String name = "name3373707";
    String zone = "zone3744684";
    String detail = "detail-1335224239";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String targetLink = "targetLink-2084812312";
    String location = "location1901043637";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    Operation expectedResponse =
        Operation.newBuilder()
            .setName(name)
            .setZone(zone)
            .setDetail(detail)
            .setStatusMessage(statusMessage)
            .setSelfLink(selfLink)
            .setTargetLink(targetLink)
            .setLocation(location)
            .setStartTime(startTime)
            .setEndTime(endTime)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    String nodeVersion = "nodeVersion1790136219";
    String imageType = "imageType-1442758754";
    UpdateNodePoolRequest request =
        UpdateNodePoolRequest.newBuilder()
            .setNodeVersion(nodeVersion)
            .setImageType(imageType)
            .build();

    Operation actualResponse = client.updateNodePool(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateNodePoolRequest actualRequest = (UpdateNodePoolRequest) actualRequests.get(0);

    Assert.assertEquals(nodeVersion, actualRequest.getNodeVersion());
    Assert.assertEquals(imageType, actualRequest.getImageType());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void updateNodePoolExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String nodeVersion = "nodeVersion1790136219";
      String imageType = "imageType-1442758754";
      UpdateNodePoolRequest request =
          UpdateNodePoolRequest.newBuilder()
              .setNodeVersion(nodeVersion)
              .setImageType(imageType)
              .build();

      client.updateNodePool(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setNodePoolAutoscalingTest() {
    String name = "name3373707";
    String zone = "zone3744684";
    String detail = "detail-1335224239";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String targetLink = "targetLink-2084812312";
    String location = "location1901043637";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    Operation expectedResponse =
        Operation.newBuilder()
            .setName(name)
            .setZone(zone)
            .setDetail(detail)
            .setStatusMessage(statusMessage)
            .setSelfLink(selfLink)
            .setTargetLink(targetLink)
            .setLocation(location)
            .setStartTime(startTime)
            .setEndTime(endTime)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    NodePoolAutoscaling autoscaling = NodePoolAutoscaling.newBuilder().build();
    SetNodePoolAutoscalingRequest request =
        SetNodePoolAutoscalingRequest.newBuilder().setAutoscaling(autoscaling).build();

    Operation actualResponse = client.setNodePoolAutoscaling(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetNodePoolAutoscalingRequest actualRequest =
        (SetNodePoolAutoscalingRequest) actualRequests.get(0);

    Assert.assertEquals(autoscaling, actualRequest.getAutoscaling());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void setNodePoolAutoscalingExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      NodePoolAutoscaling autoscaling = NodePoolAutoscaling.newBuilder().build();
      SetNodePoolAutoscalingRequest request =
          SetNodePoolAutoscalingRequest.newBuilder().setAutoscaling(autoscaling).build();

      client.setNodePoolAutoscaling(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setLoggingServiceTest() {
    String name = "name3373707";
    String zone2 = "zone2-696322977";
    String detail = "detail-1335224239";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String targetLink = "targetLink-2084812312";
    String location = "location1901043637";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    Operation expectedResponse =
        Operation.newBuilder()
            .setName(name)
            .setZone(zone2)
            .setDetail(detail)
            .setStatusMessage(statusMessage)
            .setSelfLink(selfLink)
            .setTargetLink(targetLink)
            .setLocation(location)
            .setStartTime(startTime)
            .setEndTime(endTime)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";
    String clusterId = "clusterId240280960";
    String loggingService = "loggingService-1700501035";

    Operation actualResponse = client.setLoggingService(projectId, zone, clusterId, loggingService);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetLoggingServiceRequest actualRequest = (SetLoggingServiceRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertEquals(clusterId, actualRequest.getClusterId());
    Assert.assertEquals(loggingService, actualRequest.getLoggingService());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void setLoggingServiceExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";
      String clusterId = "clusterId240280960";
      String loggingService = "loggingService-1700501035";

      client.setLoggingService(projectId, zone, clusterId, loggingService);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setLoggingServiceTest2() {
    String name = "name3373707";
    String zone2 = "zone2-696322977";
    String detail = "detail-1335224239";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String targetLink = "targetLink-2084812312";
    String location = "location1901043637";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    Operation expectedResponse =
        Operation.newBuilder()
            .setName(name)
            .setZone(zone2)
            .setDetail(detail)
            .setStatusMessage(statusMessage)
            .setSelfLink(selfLink)
            .setTargetLink(targetLink)
            .setLocation(location)
            .setStartTime(startTime)
            .setEndTime(endTime)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";
    String clusterId = "clusterId240280960";
    String loggingService = "loggingService-1700501035";

    Operation actualResponse = client.setLoggingService(projectId, zone, clusterId, loggingService);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetLoggingServiceRequest actualRequest = (SetLoggingServiceRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertEquals(clusterId, actualRequest.getClusterId());
    Assert.assertEquals(loggingService, actualRequest.getLoggingService());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void setLoggingServiceExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";
      String clusterId = "clusterId240280960";
      String loggingService = "loggingService-1700501035";

      client.setLoggingService(projectId, zone, clusterId, loggingService);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setMonitoringServiceTest() {
    String name = "name3373707";
    String zone2 = "zone2-696322977";
    String detail = "detail-1335224239";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String targetLink = "targetLink-2084812312";
    String location = "location1901043637";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    Operation expectedResponse =
        Operation.newBuilder()
            .setName(name)
            .setZone(zone2)
            .setDetail(detail)
            .setStatusMessage(statusMessage)
            .setSelfLink(selfLink)
            .setTargetLink(targetLink)
            .setLocation(location)
            .setStartTime(startTime)
            .setEndTime(endTime)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";
    String clusterId = "clusterId240280960";
    String monitoringService = "monitoringService1469270462";

    Operation actualResponse =
        client.setMonitoringService(projectId, zone, clusterId, monitoringService);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetMonitoringServiceRequest actualRequest = (SetMonitoringServiceRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertEquals(clusterId, actualRequest.getClusterId());
    Assert.assertEquals(monitoringService, actualRequest.getMonitoringService());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void setMonitoringServiceExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";
      String clusterId = "clusterId240280960";
      String monitoringService = "monitoringService1469270462";

      client.setMonitoringService(projectId, zone, clusterId, monitoringService);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setMonitoringServiceTest2() {
    String name = "name3373707";
    String zone2 = "zone2-696322977";
    String detail = "detail-1335224239";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String targetLink = "targetLink-2084812312";
    String location = "location1901043637";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    Operation expectedResponse =
        Operation.newBuilder()
            .setName(name)
            .setZone(zone2)
            .setDetail(detail)
            .setStatusMessage(statusMessage)
            .setSelfLink(selfLink)
            .setTargetLink(targetLink)
            .setLocation(location)
            .setStartTime(startTime)
            .setEndTime(endTime)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";
    String clusterId = "clusterId240280960";
    String monitoringService = "monitoringService1469270462";

    Operation actualResponse =
        client.setMonitoringService(projectId, zone, clusterId, monitoringService);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetMonitoringServiceRequest actualRequest = (SetMonitoringServiceRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertEquals(clusterId, actualRequest.getClusterId());
    Assert.assertEquals(monitoringService, actualRequest.getMonitoringService());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void setMonitoringServiceExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";
      String clusterId = "clusterId240280960";
      String monitoringService = "monitoringService1469270462";

      client.setMonitoringService(projectId, zone, clusterId, monitoringService);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setAddonsConfigTest() {
    String name = "name3373707";
    String zone2 = "zone2-696322977";
    String detail = "detail-1335224239";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String targetLink = "targetLink-2084812312";
    String location = "location1901043637";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    Operation expectedResponse =
        Operation.newBuilder()
            .setName(name)
            .setZone(zone2)
            .setDetail(detail)
            .setStatusMessage(statusMessage)
            .setSelfLink(selfLink)
            .setTargetLink(targetLink)
            .setLocation(location)
            .setStartTime(startTime)
            .setEndTime(endTime)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";
    String clusterId = "clusterId240280960";
    AddonsConfig addonsConfig = AddonsConfig.newBuilder().build();

    Operation actualResponse = client.setAddonsConfig(projectId, zone, clusterId, addonsConfig);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetAddonsConfigRequest actualRequest = (SetAddonsConfigRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertEquals(clusterId, actualRequest.getClusterId());
    Assert.assertEquals(addonsConfig, actualRequest.getAddonsConfig());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void setAddonsConfigExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";
      String clusterId = "clusterId240280960";
      AddonsConfig addonsConfig = AddonsConfig.newBuilder().build();

      client.setAddonsConfig(projectId, zone, clusterId, addonsConfig);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setAddonsConfigTest2() {
    String name = "name3373707";
    String zone2 = "zone2-696322977";
    String detail = "detail-1335224239";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String targetLink = "targetLink-2084812312";
    String location = "location1901043637";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    Operation expectedResponse =
        Operation.newBuilder()
            .setName(name)
            .setZone(zone2)
            .setDetail(detail)
            .setStatusMessage(statusMessage)
            .setSelfLink(selfLink)
            .setTargetLink(targetLink)
            .setLocation(location)
            .setStartTime(startTime)
            .setEndTime(endTime)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";
    String clusterId = "clusterId240280960";
    AddonsConfig addonsConfig = AddonsConfig.newBuilder().build();

    Operation actualResponse = client.setAddonsConfig(projectId, zone, clusterId, addonsConfig);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetAddonsConfigRequest actualRequest = (SetAddonsConfigRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertEquals(clusterId, actualRequest.getClusterId());
    Assert.assertEquals(addonsConfig, actualRequest.getAddonsConfig());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void setAddonsConfigExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";
      String clusterId = "clusterId240280960";
      AddonsConfig addonsConfig = AddonsConfig.newBuilder().build();

      client.setAddonsConfig(projectId, zone, clusterId, addonsConfig);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setLocationsTest() {
    String name = "name3373707";
    String zone2 = "zone2-696322977";
    String detail = "detail-1335224239";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String targetLink = "targetLink-2084812312";
    String location = "location1901043637";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    Operation expectedResponse =
        Operation.newBuilder()
            .setName(name)
            .setZone(zone2)
            .setDetail(detail)
            .setStatusMessage(statusMessage)
            .setSelfLink(selfLink)
            .setTargetLink(targetLink)
            .setLocation(location)
            .setStartTime(startTime)
            .setEndTime(endTime)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";
    String clusterId = "clusterId240280960";
    List<String> locations = new ArrayList<>();

    Operation actualResponse = client.setLocations(projectId, zone, clusterId, locations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetLocationsRequest actualRequest = (SetLocationsRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertEquals(clusterId, actualRequest.getClusterId());
    Assert.assertEquals(locations, actualRequest.getLocationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void setLocationsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";
      String clusterId = "clusterId240280960";
      List<String> locations = new ArrayList<>();

      client.setLocations(projectId, zone, clusterId, locations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setLocationsTest2() {
    String name = "name3373707";
    String zone2 = "zone2-696322977";
    String detail = "detail-1335224239";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String targetLink = "targetLink-2084812312";
    String location = "location1901043637";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    Operation expectedResponse =
        Operation.newBuilder()
            .setName(name)
            .setZone(zone2)
            .setDetail(detail)
            .setStatusMessage(statusMessage)
            .setSelfLink(selfLink)
            .setTargetLink(targetLink)
            .setLocation(location)
            .setStartTime(startTime)
            .setEndTime(endTime)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";
    String clusterId = "clusterId240280960";
    List<String> locations = new ArrayList<>();

    Operation actualResponse = client.setLocations(projectId, zone, clusterId, locations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetLocationsRequest actualRequest = (SetLocationsRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertEquals(clusterId, actualRequest.getClusterId());
    Assert.assertEquals(locations, actualRequest.getLocationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void setLocationsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";
      String clusterId = "clusterId240280960";
      List<String> locations = new ArrayList<>();

      client.setLocations(projectId, zone, clusterId, locations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void updateMasterTest() {
    String name = "name3373707";
    String zone2 = "zone2-696322977";
    String detail = "detail-1335224239";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String targetLink = "targetLink-2084812312";
    String location = "location1901043637";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    Operation expectedResponse =
        Operation.newBuilder()
            .setName(name)
            .setZone(zone2)
            .setDetail(detail)
            .setStatusMessage(statusMessage)
            .setSelfLink(selfLink)
            .setTargetLink(targetLink)
            .setLocation(location)
            .setStartTime(startTime)
            .setEndTime(endTime)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";
    String clusterId = "clusterId240280960";
    String masterVersion = "masterVersion-2139460613";

    Operation actualResponse = client.updateMaster(projectId, zone, clusterId, masterVersion);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateMasterRequest actualRequest = (UpdateMasterRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertEquals(clusterId, actualRequest.getClusterId());
    Assert.assertEquals(masterVersion, actualRequest.getMasterVersion());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void updateMasterExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";
      String clusterId = "clusterId240280960";
      String masterVersion = "masterVersion-2139460613";

      client.updateMaster(projectId, zone, clusterId, masterVersion);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void updateMasterTest2() {
    String name = "name3373707";
    String zone2 = "zone2-696322977";
    String detail = "detail-1335224239";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String targetLink = "targetLink-2084812312";
    String location = "location1901043637";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    Operation expectedResponse =
        Operation.newBuilder()
            .setName(name)
            .setZone(zone2)
            .setDetail(detail)
            .setStatusMessage(statusMessage)
            .setSelfLink(selfLink)
            .setTargetLink(targetLink)
            .setLocation(location)
            .setStartTime(startTime)
            .setEndTime(endTime)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";
    String clusterId = "clusterId240280960";
    String masterVersion = "masterVersion-2139460613";

    Operation actualResponse = client.updateMaster(projectId, zone, clusterId, masterVersion);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateMasterRequest actualRequest = (UpdateMasterRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertEquals(clusterId, actualRequest.getClusterId());
    Assert.assertEquals(masterVersion, actualRequest.getMasterVersion());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void updateMasterExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";
      String clusterId = "clusterId240280960";
      String masterVersion = "masterVersion-2139460613";

      client.updateMaster(projectId, zone, clusterId, masterVersion);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setMasterAuthTest() {
    String name = "name3373707";
    String zone = "zone3744684";
    String detail = "detail-1335224239";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String targetLink = "targetLink-2084812312";
    String location = "location1901043637";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    Operation expectedResponse =
        Operation.newBuilder()
            .setName(name)
            .setZone(zone)
            .setDetail(detail)
            .setStatusMessage(statusMessage)
            .setSelfLink(selfLink)
            .setTargetLink(targetLink)
            .setLocation(location)
            .setStartTime(startTime)
            .setEndTime(endTime)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    SetMasterAuthRequest.Action action = SetMasterAuthRequest.Action.UNKNOWN;
    MasterAuth update = MasterAuth.newBuilder().build();
    SetMasterAuthRequest request =
        SetMasterAuthRequest.newBuilder().setAction(action).setUpdate(update).build();

    Operation actualResponse = client.setMasterAuth(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetMasterAuthRequest actualRequest = (SetMasterAuthRequest) actualRequests.get(0);

    Assert.assertEquals(action, actualRequest.getAction());
    Assert.assertEquals(update, actualRequest.getUpdate());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void setMasterAuthExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      SetMasterAuthRequest.Action action = SetMasterAuthRequest.Action.UNKNOWN;
      MasterAuth update = MasterAuth.newBuilder().build();
      SetMasterAuthRequest request =
          SetMasterAuthRequest.newBuilder().setAction(action).setUpdate(update).build();

      client.setMasterAuth(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listOperationsTest() {
    ListOperationsResponse expectedResponse = ListOperationsResponse.newBuilder().build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";

    ListOperationsResponse actualResponse = client.listOperations(projectId, zone);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListOperationsRequest actualRequest = (ListOperationsRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void listOperationsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";

      client.listOperations(projectId, zone);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getOperationTest() {
    String name = "name3373707";
    String zone2 = "zone2-696322977";
    String detail = "detail-1335224239";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String targetLink = "targetLink-2084812312";
    String location = "location1901043637";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    Operation expectedResponse =
        Operation.newBuilder()
            .setName(name)
            .setZone(zone2)
            .setDetail(detail)
            .setStatusMessage(statusMessage)
            .setSelfLink(selfLink)
            .setTargetLink(targetLink)
            .setLocation(location)
            .setStartTime(startTime)
            .setEndTime(endTime)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";
    String operationId = "operationId-274116877";

    Operation actualResponse = client.getOperation(projectId, zone, operationId);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetOperationRequest actualRequest = (GetOperationRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertEquals(operationId, actualRequest.getOperationId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void getOperationExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";
      String operationId = "operationId-274116877";

      client.getOperation(projectId, zone, operationId);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void cancelOperationTest() {
    Empty expectedResponse = Empty.newBuilder().build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";
    String operationId = "operationId-274116877";

    client.cancelOperation(projectId, zone, operationId);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CancelOperationRequest actualRequest = (CancelOperationRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertEquals(operationId, actualRequest.getOperationId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void cancelOperationExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";
      String operationId = "operationId-274116877";

      client.cancelOperation(projectId, zone, operationId);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void cancelOperationTest2() {
    Empty expectedResponse = Empty.newBuilder().build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";
    String operationId = "operationId-274116877";

    client.cancelOperation(projectId, zone, operationId);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CancelOperationRequest actualRequest = (CancelOperationRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertEquals(operationId, actualRequest.getOperationId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void cancelOperationExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";
      String operationId = "operationId-274116877";

      client.cancelOperation(projectId, zone, operationId);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getServerConfigTest() {
    String defaultClusterVersion = "defaultClusterVersion111003029";
    String defaultImageType = "defaultImageType-918225828";
    ServerConfig expectedResponse =
        ServerConfig.newBuilder()
            .setDefaultClusterVersion(defaultClusterVersion)
            .setDefaultImageType(defaultImageType)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";

    ServerConfig actualResponse = client.getServerConfig(projectId, zone);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetServerConfigRequest actualRequest = (GetServerConfigRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void getServerConfigExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";

      client.getServerConfig(projectId, zone);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getServerConfigTest2() {
    String defaultClusterVersion = "defaultClusterVersion111003029";
    String defaultImageType = "defaultImageType-918225828";
    ServerConfig expectedResponse =
        ServerConfig.newBuilder()
            .setDefaultClusterVersion(defaultClusterVersion)
            .setDefaultImageType(defaultImageType)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";

    ServerConfig actualResponse = client.getServerConfig(projectId, zone);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetServerConfigRequest actualRequest = (GetServerConfigRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void getServerConfigExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";

      client.getServerConfig(projectId, zone);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listNodePoolsTest() {
    ListNodePoolsResponse expectedResponse = ListNodePoolsResponse.newBuilder().build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";
    String clusterId = "clusterId240280960";

    ListNodePoolsResponse actualResponse = client.listNodePools(projectId, zone, clusterId);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListNodePoolsRequest actualRequest = (ListNodePoolsRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertEquals(clusterId, actualRequest.getClusterId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void listNodePoolsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";
      String clusterId = "clusterId240280960";

      client.listNodePools(projectId, zone, clusterId);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listNodePoolsTest2() {
    ListNodePoolsResponse expectedResponse = ListNodePoolsResponse.newBuilder().build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";
    String clusterId = "clusterId240280960";

    ListNodePoolsResponse actualResponse = client.listNodePools(projectId, zone, clusterId);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListNodePoolsRequest actualRequest = (ListNodePoolsRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertEquals(clusterId, actualRequest.getClusterId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void listNodePoolsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";
      String clusterId = "clusterId240280960";

      client.listNodePools(projectId, zone, clusterId);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getNodePoolTest() {
    String name = "name3373707";
    int initialNodeCount = 1682564205;
    String selfLink = "selfLink-1691268851";
    String version = "version351608024";
    String statusMessage = "statusMessage-239442758";
    int podIpv4CidrSize = 1098768716;
    NodePool expectedResponse =
        NodePool.newBuilder()
            .setName(name)
            .setInitialNodeCount(initialNodeCount)
            .setSelfLink(selfLink)
            .setVersion(version)
            .setStatusMessage(statusMessage)
            .setPodIpv4CidrSize(podIpv4CidrSize)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";
    String clusterId = "clusterId240280960";
    String nodePoolId = "nodePoolId1043384033";

    NodePool actualResponse = client.getNodePool(projectId, zone, clusterId, nodePoolId);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetNodePoolRequest actualRequest = (GetNodePoolRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertEquals(clusterId, actualRequest.getClusterId());
    Assert.assertEquals(nodePoolId, actualRequest.getNodePoolId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void getNodePoolExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";
      String clusterId = "clusterId240280960";
      String nodePoolId = "nodePoolId1043384033";

      client.getNodePool(projectId, zone, clusterId, nodePoolId);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getNodePoolTest2() {
    String name = "name3373707";
    int initialNodeCount = 1682564205;
    String selfLink = "selfLink-1691268851";
    String version = "version351608024";
    String statusMessage = "statusMessage-239442758";
    int podIpv4CidrSize = 1098768716;
    NodePool expectedResponse =
        NodePool.newBuilder()
            .setName(name)
            .setInitialNodeCount(initialNodeCount)
            .setSelfLink(selfLink)
            .setVersion(version)
            .setStatusMessage(statusMessage)
            .setPodIpv4CidrSize(podIpv4CidrSize)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";
    String clusterId = "clusterId240280960";
    String nodePoolId = "nodePoolId1043384033";

    NodePool actualResponse = client.getNodePool(projectId, zone, clusterId, nodePoolId);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetNodePoolRequest actualRequest = (GetNodePoolRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertEquals(clusterId, actualRequest.getClusterId());
    Assert.assertEquals(nodePoolId, actualRequest.getNodePoolId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void getNodePoolExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";
      String clusterId = "clusterId240280960";
      String nodePoolId = "nodePoolId1043384033";

      client.getNodePool(projectId, zone, clusterId, nodePoolId);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void createNodePoolTest() {
    String name = "name3373707";
    String zone2 = "zone2-696322977";
    String detail = "detail-1335224239";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String targetLink = "targetLink-2084812312";
    String location = "location1901043637";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    Operation expectedResponse =
        Operation.newBuilder()
            .setName(name)
            .setZone(zone2)
            .setDetail(detail)
            .setStatusMessage(statusMessage)
            .setSelfLink(selfLink)
            .setTargetLink(targetLink)
            .setLocation(location)
            .setStartTime(startTime)
            .setEndTime(endTime)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";
    String clusterId = "clusterId240280960";
    NodePool nodePool = NodePool.newBuilder().build();

    Operation actualResponse = client.createNodePool(projectId, zone, clusterId, nodePool);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateNodePoolRequest actualRequest = (CreateNodePoolRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertEquals(clusterId, actualRequest.getClusterId());
    Assert.assertEquals(nodePool, actualRequest.getNodePool());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void createNodePoolExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";
      String clusterId = "clusterId240280960";
      NodePool nodePool = NodePool.newBuilder().build();

      client.createNodePool(projectId, zone, clusterId, nodePool);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void createNodePoolTest2() {
    String name = "name3373707";
    String zone2 = "zone2-696322977";
    String detail = "detail-1335224239";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String targetLink = "targetLink-2084812312";
    String location = "location1901043637";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    Operation expectedResponse =
        Operation.newBuilder()
            .setName(name)
            .setZone(zone2)
            .setDetail(detail)
            .setStatusMessage(statusMessage)
            .setSelfLink(selfLink)
            .setTargetLink(targetLink)
            .setLocation(location)
            .setStartTime(startTime)
            .setEndTime(endTime)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";
    String clusterId = "clusterId240280960";
    NodePool nodePool = NodePool.newBuilder().build();

    Operation actualResponse = client.createNodePool(projectId, zone, clusterId, nodePool);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateNodePoolRequest actualRequest = (CreateNodePoolRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertEquals(clusterId, actualRequest.getClusterId());
    Assert.assertEquals(nodePool, actualRequest.getNodePool());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void createNodePoolExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";
      String clusterId = "clusterId240280960";
      NodePool nodePool = NodePool.newBuilder().build();

      client.createNodePool(projectId, zone, clusterId, nodePool);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void rollbackNodePoolUpgradeTest() {
    String name = "name3373707";
    String zone2 = "zone2-696322977";
    String detail = "detail-1335224239";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String targetLink = "targetLink-2084812312";
    String location = "location1901043637";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    Operation expectedResponse =
        Operation.newBuilder()
            .setName(name)
            .setZone(zone2)
            .setDetail(detail)
            .setStatusMessage(statusMessage)
            .setSelfLink(selfLink)
            .setTargetLink(targetLink)
            .setLocation(location)
            .setStartTime(startTime)
            .setEndTime(endTime)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";
    String clusterId = "clusterId240280960";
    String nodePoolId = "nodePoolId1043384033";

    Operation actualResponse =
        client.rollbackNodePoolUpgrade(projectId, zone, clusterId, nodePoolId);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    RollbackNodePoolUpgradeRequest actualRequest =
        (RollbackNodePoolUpgradeRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertEquals(clusterId, actualRequest.getClusterId());
    Assert.assertEquals(nodePoolId, actualRequest.getNodePoolId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void rollbackNodePoolUpgradeExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";
      String clusterId = "clusterId240280960";
      String nodePoolId = "nodePoolId1043384033";

      client.rollbackNodePoolUpgrade(projectId, zone, clusterId, nodePoolId);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void rollbackNodePoolUpgradeTest2() {
    String name = "name3373707";
    String zone2 = "zone2-696322977";
    String detail = "detail-1335224239";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String targetLink = "targetLink-2084812312";
    String location = "location1901043637";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    Operation expectedResponse =
        Operation.newBuilder()
            .setName(name)
            .setZone(zone2)
            .setDetail(detail)
            .setStatusMessage(statusMessage)
            .setSelfLink(selfLink)
            .setTargetLink(targetLink)
            .setLocation(location)
            .setStartTime(startTime)
            .setEndTime(endTime)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";
    String clusterId = "clusterId240280960";
    String nodePoolId = "nodePoolId1043384033";

    Operation actualResponse =
        client.rollbackNodePoolUpgrade(projectId, zone, clusterId, nodePoolId);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    RollbackNodePoolUpgradeRequest actualRequest =
        (RollbackNodePoolUpgradeRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertEquals(clusterId, actualRequest.getClusterId());
    Assert.assertEquals(nodePoolId, actualRequest.getNodePoolId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void rollbackNodePoolUpgradeExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";
      String clusterId = "clusterId240280960";
      String nodePoolId = "nodePoolId1043384033";

      client.rollbackNodePoolUpgrade(projectId, zone, clusterId, nodePoolId);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setNodePoolManagementTest() {
    String name = "name3373707";
    String zone = "zone3744684";
    String detail = "detail-1335224239";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String targetLink = "targetLink-2084812312";
    String location = "location1901043637";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    Operation expectedResponse =
        Operation.newBuilder()
            .setName(name)
            .setZone(zone)
            .setDetail(detail)
            .setStatusMessage(statusMessage)
            .setSelfLink(selfLink)
            .setTargetLink(targetLink)
            .setLocation(location)
            .setStartTime(startTime)
            .setEndTime(endTime)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    NodeManagement management = NodeManagement.newBuilder().build();
    SetNodePoolManagementRequest request =
        SetNodePoolManagementRequest.newBuilder().setManagement(management).build();

    Operation actualResponse = client.setNodePoolManagement(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetNodePoolManagementRequest actualRequest =
        (SetNodePoolManagementRequest) actualRequests.get(0);

    Assert.assertEquals(management, actualRequest.getManagement());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void setNodePoolManagementExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      NodeManagement management = NodeManagement.newBuilder().build();
      SetNodePoolManagementRequest request =
          SetNodePoolManagementRequest.newBuilder().setManagement(management).build();

      client.setNodePoolManagement(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setLabelsTest() {
    String name = "name3373707";
    String zone = "zone3744684";
    String detail = "detail-1335224239";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String targetLink = "targetLink-2084812312";
    String location = "location1901043637";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    Operation expectedResponse =
        Operation.newBuilder()
            .setName(name)
            .setZone(zone)
            .setDetail(detail)
            .setStatusMessage(statusMessage)
            .setSelfLink(selfLink)
            .setTargetLink(targetLink)
            .setLocation(location)
            .setStartTime(startTime)
            .setEndTime(endTime)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    Map<String, String> resourceLabels = new HashMap<>();
    String labelFingerprint = "labelFingerprint714995737";
    SetLabelsRequest request =
        SetLabelsRequest.newBuilder()
            .putAllResourceLabels(resourceLabels)
            .setLabelFingerprint(labelFingerprint)
            .build();

    Operation actualResponse = client.setLabels(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetLabelsRequest actualRequest = (SetLabelsRequest) actualRequests.get(0);

    Assert.assertEquals(resourceLabels, actualRequest.getResourceLabelsMap());
    Assert.assertEquals(labelFingerprint, actualRequest.getLabelFingerprint());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void setLabelsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      Map<String, String> resourceLabels = new HashMap<>();
      String labelFingerprint = "labelFingerprint714995737";
      SetLabelsRequest request =
          SetLabelsRequest.newBuilder()
              .putAllResourceLabels(resourceLabels)
              .setLabelFingerprint(labelFingerprint)
              .build();

      client.setLabels(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setLegacyAbacTest() {
    String name = "name3373707";
    String zone2 = "zone2-696322977";
    String detail = "detail-1335224239";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String targetLink = "targetLink-2084812312";
    String location = "location1901043637";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    Operation expectedResponse =
        Operation.newBuilder()
            .setName(name)
            .setZone(zone2)
            .setDetail(detail)
            .setStatusMessage(statusMessage)
            .setSelfLink(selfLink)
            .setTargetLink(targetLink)
            .setLocation(location)
            .setStartTime(startTime)
            .setEndTime(endTime)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";
    String clusterId = "clusterId240280960";
    boolean enabled = false;

    Operation actualResponse = client.setLegacyAbac(projectId, zone, clusterId, enabled);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetLegacyAbacRequest actualRequest = (SetLegacyAbacRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertEquals(clusterId, actualRequest.getClusterId());
    Assert.assertEquals(enabled, actualRequest.getEnabled());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void setLegacyAbacExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";
      String clusterId = "clusterId240280960";
      boolean enabled = false;

      client.setLegacyAbac(projectId, zone, clusterId, enabled);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setLegacyAbacTest2() {
    String name = "name3373707";
    String zone2 = "zone2-696322977";
    String detail = "detail-1335224239";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String targetLink = "targetLink-2084812312";
    String location = "location1901043637";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    Operation expectedResponse =
        Operation.newBuilder()
            .setName(name)
            .setZone(zone2)
            .setDetail(detail)
            .setStatusMessage(statusMessage)
            .setSelfLink(selfLink)
            .setTargetLink(targetLink)
            .setLocation(location)
            .setStartTime(startTime)
            .setEndTime(endTime)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";
    String clusterId = "clusterId240280960";
    boolean enabled = false;

    Operation actualResponse = client.setLegacyAbac(projectId, zone, clusterId, enabled);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetLegacyAbacRequest actualRequest = (SetLegacyAbacRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertEquals(clusterId, actualRequest.getClusterId());
    Assert.assertEquals(enabled, actualRequest.getEnabled());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void setLegacyAbacExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";
      String clusterId = "clusterId240280960";
      boolean enabled = false;

      client.setLegacyAbac(projectId, zone, clusterId, enabled);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void startIPRotationTest() {
    String name = "name3373707";
    String zone2 = "zone2-696322977";
    String detail = "detail-1335224239";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String targetLink = "targetLink-2084812312";
    String location = "location1901043637";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    Operation expectedResponse =
        Operation.newBuilder()
            .setName(name)
            .setZone(zone2)
            .setDetail(detail)
            .setStatusMessage(statusMessage)
            .setSelfLink(selfLink)
            .setTargetLink(targetLink)
            .setLocation(location)
            .setStartTime(startTime)
            .setEndTime(endTime)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";
    String clusterId = "clusterId240280960";

    Operation actualResponse = client.startIPRotation(projectId, zone, clusterId);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    StartIPRotationRequest actualRequest = (StartIPRotationRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertEquals(clusterId, actualRequest.getClusterId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void startIPRotationExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";
      String clusterId = "clusterId240280960";

      client.startIPRotation(projectId, zone, clusterId);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void startIPRotationTest2() {
    String name = "name3373707";
    String zone2 = "zone2-696322977";
    String detail = "detail-1335224239";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String targetLink = "targetLink-2084812312";
    String location = "location1901043637";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    Operation expectedResponse =
        Operation.newBuilder()
            .setName(name)
            .setZone(zone2)
            .setDetail(detail)
            .setStatusMessage(statusMessage)
            .setSelfLink(selfLink)
            .setTargetLink(targetLink)
            .setLocation(location)
            .setStartTime(startTime)
            .setEndTime(endTime)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";
    String clusterId = "clusterId240280960";

    Operation actualResponse = client.startIPRotation(projectId, zone, clusterId);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    StartIPRotationRequest actualRequest = (StartIPRotationRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertEquals(clusterId, actualRequest.getClusterId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void startIPRotationExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";
      String clusterId = "clusterId240280960";

      client.startIPRotation(projectId, zone, clusterId);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void completeIPRotationTest() {
    String name = "name3373707";
    String zone2 = "zone2-696322977";
    String detail = "detail-1335224239";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String targetLink = "targetLink-2084812312";
    String location = "location1901043637";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    Operation expectedResponse =
        Operation.newBuilder()
            .setName(name)
            .setZone(zone2)
            .setDetail(detail)
            .setStatusMessage(statusMessage)
            .setSelfLink(selfLink)
            .setTargetLink(targetLink)
            .setLocation(location)
            .setStartTime(startTime)
            .setEndTime(endTime)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";
    String clusterId = "clusterId240280960";

    Operation actualResponse = client.completeIPRotation(projectId, zone, clusterId);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CompleteIPRotationRequest actualRequest = (CompleteIPRotationRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertEquals(clusterId, actualRequest.getClusterId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void completeIPRotationExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";
      String clusterId = "clusterId240280960";

      client.completeIPRotation(projectId, zone, clusterId);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void completeIPRotationTest2() {
    String name = "name3373707";
    String zone2 = "zone2-696322977";
    String detail = "detail-1335224239";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String targetLink = "targetLink-2084812312";
    String location = "location1901043637";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    Operation expectedResponse =
        Operation.newBuilder()
            .setName(name)
            .setZone(zone2)
            .setDetail(detail)
            .setStatusMessage(statusMessage)
            .setSelfLink(selfLink)
            .setTargetLink(targetLink)
            .setLocation(location)
            .setStartTime(startTime)
            .setEndTime(endTime)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";
    String clusterId = "clusterId240280960";

    Operation actualResponse = client.completeIPRotation(projectId, zone, clusterId);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CompleteIPRotationRequest actualRequest = (CompleteIPRotationRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertEquals(clusterId, actualRequest.getClusterId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void completeIPRotationExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";
      String clusterId = "clusterId240280960";

      client.completeIPRotation(projectId, zone, clusterId);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setNodePoolSizeTest() {
    String name = "name3373707";
    String zone = "zone3744684";
    String detail = "detail-1335224239";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String targetLink = "targetLink-2084812312";
    String location = "location1901043637";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    Operation expectedResponse =
        Operation.newBuilder()
            .setName(name)
            .setZone(zone)
            .setDetail(detail)
            .setStatusMessage(statusMessage)
            .setSelfLink(selfLink)
            .setTargetLink(targetLink)
            .setLocation(location)
            .setStartTime(startTime)
            .setEndTime(endTime)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    int nodeCount = 1539922066;
    SetNodePoolSizeRequest request =
        SetNodePoolSizeRequest.newBuilder().setNodeCount(nodeCount).build();

    Operation actualResponse = client.setNodePoolSize(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetNodePoolSizeRequest actualRequest = (SetNodePoolSizeRequest) actualRequests.get(0);

    Assert.assertEquals(nodeCount, actualRequest.getNodeCount());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void setNodePoolSizeExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      int nodeCount = 1539922066;
      SetNodePoolSizeRequest request =
          SetNodePoolSizeRequest.newBuilder().setNodeCount(nodeCount).build();

      client.setNodePoolSize(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setNetworkPolicyTest() {
    String name = "name3373707";
    String zone2 = "zone2-696322977";
    String detail = "detail-1335224239";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String targetLink = "targetLink-2084812312";
    String location = "location1901043637";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    Operation expectedResponse =
        Operation.newBuilder()
            .setName(name)
            .setZone(zone2)
            .setDetail(detail)
            .setStatusMessage(statusMessage)
            .setSelfLink(selfLink)
            .setTargetLink(targetLink)
            .setLocation(location)
            .setStartTime(startTime)
            .setEndTime(endTime)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";
    String clusterId = "clusterId240280960";
    NetworkPolicy networkPolicy = NetworkPolicy.newBuilder().build();

    Operation actualResponse = client.setNetworkPolicy(projectId, zone, clusterId, networkPolicy);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetNetworkPolicyRequest actualRequest = (SetNetworkPolicyRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertEquals(clusterId, actualRequest.getClusterId());
    Assert.assertEquals(networkPolicy, actualRequest.getNetworkPolicy());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void setNetworkPolicyExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";
      String clusterId = "clusterId240280960";
      NetworkPolicy networkPolicy = NetworkPolicy.newBuilder().build();

      client.setNetworkPolicy(projectId, zone, clusterId, networkPolicy);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setNetworkPolicyTest2() {
    String name = "name3373707";
    String zone2 = "zone2-696322977";
    String detail = "detail-1335224239";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String targetLink = "targetLink-2084812312";
    String location = "location1901043637";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    Operation expectedResponse =
        Operation.newBuilder()
            .setName(name)
            .setZone(zone2)
            .setDetail(detail)
            .setStatusMessage(statusMessage)
            .setSelfLink(selfLink)
            .setTargetLink(targetLink)
            .setLocation(location)
            .setStartTime(startTime)
            .setEndTime(endTime)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";
    String clusterId = "clusterId240280960";
    NetworkPolicy networkPolicy = NetworkPolicy.newBuilder().build();

    Operation actualResponse = client.setNetworkPolicy(projectId, zone, clusterId, networkPolicy);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetNetworkPolicyRequest actualRequest = (SetNetworkPolicyRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertEquals(clusterId, actualRequest.getClusterId());
    Assert.assertEquals(networkPolicy, actualRequest.getNetworkPolicy());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void setNetworkPolicyExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";
      String clusterId = "clusterId240280960";
      NetworkPolicy networkPolicy = NetworkPolicy.newBuilder().build();

      client.setNetworkPolicy(projectId, zone, clusterId, networkPolicy);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setMaintenancePolicyTest() {
    String name = "name3373707";
    String zone2 = "zone2-696322977";
    String detail = "detail-1335224239";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String targetLink = "targetLink-2084812312";
    String location = "location1901043637";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    Operation expectedResponse =
        Operation.newBuilder()
            .setName(name)
            .setZone(zone2)
            .setDetail(detail)
            .setStatusMessage(statusMessage)
            .setSelfLink(selfLink)
            .setTargetLink(targetLink)
            .setLocation(location)
            .setStartTime(startTime)
            .setEndTime(endTime)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";
    String clusterId = "clusterId240280960";
    MaintenancePolicy maintenancePolicy = MaintenancePolicy.newBuilder().build();

    Operation actualResponse =
        client.setMaintenancePolicy(projectId, zone, clusterId, maintenancePolicy);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetMaintenancePolicyRequest actualRequest = (SetMaintenancePolicyRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertEquals(clusterId, actualRequest.getClusterId());
    Assert.assertEquals(maintenancePolicy, actualRequest.getMaintenancePolicy());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void setMaintenancePolicyExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";
      String clusterId = "clusterId240280960";
      MaintenancePolicy maintenancePolicy = MaintenancePolicy.newBuilder().build();

      client.setMaintenancePolicy(projectId, zone, clusterId, maintenancePolicy);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setMaintenancePolicyTest2() {
    String name = "name3373707";
    String zone2 = "zone2-696322977";
    String detail = "detail-1335224239";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String targetLink = "targetLink-2084812312";
    String location = "location1901043637";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    Operation expectedResponse =
        Operation.newBuilder()
            .setName(name)
            .setZone(zone2)
            .setDetail(detail)
            .setStatusMessage(statusMessage)
            .setSelfLink(selfLink)
            .setTargetLink(targetLink)
            .setLocation(location)
            .setStartTime(startTime)
            .setEndTime(endTime)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    String projectId = "projectId-1969970175";
    String zone = "zone3744684";
    String clusterId = "clusterId240280960";
    MaintenancePolicy maintenancePolicy = MaintenancePolicy.newBuilder().build();

    Operation actualResponse =
        client.setMaintenancePolicy(projectId, zone, clusterId, maintenancePolicy);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetMaintenancePolicyRequest actualRequest = (SetMaintenancePolicyRequest) actualRequests.get(0);

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertEquals(clusterId, actualRequest.getClusterId());
    Assert.assertEquals(maintenancePolicy, actualRequest.getMaintenancePolicy());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void setMaintenancePolicyExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      String projectId = "projectId-1969970175";
      String zone = "zone3744684";
      String clusterId = "clusterId240280960";
      MaintenancePolicy maintenancePolicy = MaintenancePolicy.newBuilder().build();

      client.setMaintenancePolicy(projectId, zone, clusterId, maintenancePolicy);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listUsableSubnetworksTest() {
    String nextPageToken = "";
    UsableSubnetwork subnetworksElement = UsableSubnetwork.newBuilder().build();
    List<UsableSubnetwork> subnetworks = Arrays.asList(subnetworksElement);
    ListUsableSubnetworksResponse expectedResponse =
        ListUsableSubnetworksResponse.newBuilder()
            .setNextPageToken(nextPageToken)
            .addAllSubnetworks(subnetworks)
            .build();
    mockClusterManager.addResponse(expectedResponse);

    ListUsableSubnetworksRequest request = ListUsableSubnetworksRequest.newBuilder().build();

    ListUsableSubnetworksPagedResponse pagedListResponse = client.listUsableSubnetworks(request);

    List<UsableSubnetwork> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getSubnetworksList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockClusterManager.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListUsableSubnetworksRequest actualRequest =
        (ListUsableSubnetworksRequest) actualRequests.get(0);

    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void listUsableSubnetworksExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockClusterManager.addException(exception);

    try {
      ListUsableSubnetworksRequest request = ListUsableSubnetworksRequest.newBuilder().build();

      client.listUsableSubnetworks(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }
}
