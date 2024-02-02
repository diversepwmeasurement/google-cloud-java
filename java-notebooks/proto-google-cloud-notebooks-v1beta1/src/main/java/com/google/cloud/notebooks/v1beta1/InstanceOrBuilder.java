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
// source: google/cloud/notebooks/v1beta1/instance.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.notebooks.v1beta1;

public interface InstanceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.notebooks.v1beta1.Instance)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The name of this notebook instance. Format:
   * `projects/{project_id}/locations/{location}/instances/{instance_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The name of this notebook instance. Format:
   * `projects/{project_id}/locations/{location}/instances/{instance_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Use a Compute Engine VM image to start the notebook instance.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1beta1.VmImage vm_image = 2;</code>
   *
   * @return Whether the vmImage field is set.
   */
  boolean hasVmImage();
  /**
   *
   *
   * <pre>
   * Use a Compute Engine VM image to start the notebook instance.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1beta1.VmImage vm_image = 2;</code>
   *
   * @return The vmImage.
   */
  com.google.cloud.notebooks.v1beta1.VmImage getVmImage();
  /**
   *
   *
   * <pre>
   * Use a Compute Engine VM image to start the notebook instance.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1beta1.VmImage vm_image = 2;</code>
   */
  com.google.cloud.notebooks.v1beta1.VmImageOrBuilder getVmImageOrBuilder();

  /**
   *
   *
   * <pre>
   * Use a container image to start the notebook instance.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1beta1.ContainerImage container_image = 3;</code>
   *
   * @return Whether the containerImage field is set.
   */
  boolean hasContainerImage();
  /**
   *
   *
   * <pre>
   * Use a container image to start the notebook instance.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1beta1.ContainerImage container_image = 3;</code>
   *
   * @return The containerImage.
   */
  com.google.cloud.notebooks.v1beta1.ContainerImage getContainerImage();
  /**
   *
   *
   * <pre>
   * Use a container image to start the notebook instance.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1beta1.ContainerImage container_image = 3;</code>
   */
  com.google.cloud.notebooks.v1beta1.ContainerImageOrBuilder getContainerImageOrBuilder();

  /**
   *
   *
   * <pre>
   * Path to a Bash script that automatically runs after a notebook instance
   * fully boots up. The path must be a URL or
   * Cloud Storage path (`gs://path-to-file/file-name`).
   * </pre>
   *
   * <code>string post_startup_script = 4;</code>
   *
   * @return The postStartupScript.
   */
  java.lang.String getPostStartupScript();
  /**
   *
   *
   * <pre>
   * Path to a Bash script that automatically runs after a notebook instance
   * fully boots up. The path must be a URL or
   * Cloud Storage path (`gs://path-to-file/file-name`).
   * </pre>
   *
   * <code>string post_startup_script = 4;</code>
   *
   * @return The bytes for postStartupScript.
   */
  com.google.protobuf.ByteString getPostStartupScriptBytes();

  /**
   *
   *
   * <pre>
   * Output only. The proxy endpoint that is used to access the Jupyter notebook.
   * </pre>
   *
   * <code>string proxy_uri = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The proxyUri.
   */
  java.lang.String getProxyUri();
  /**
   *
   *
   * <pre>
   * Output only. The proxy endpoint that is used to access the Jupyter notebook.
   * </pre>
   *
   * <code>string proxy_uri = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for proxyUri.
   */
  com.google.protobuf.ByteString getProxyUriBytes();

  /**
   *
   *
   * <pre>
   * Input only. The owner of this instance after creation. Format: `alias&#64;example.com`
   *
   * Currently supports one owner only. If not specified, all of the service
   * account users of your VM instance's service account can use
   * the instance.
   * </pre>
   *
   * <code>repeated string instance_owners = 6 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   *
   * @return A list containing the instanceOwners.
   */
  java.util.List<java.lang.String> getInstanceOwnersList();
  /**
   *
   *
   * <pre>
   * Input only. The owner of this instance after creation. Format: `alias&#64;example.com`
   *
   * Currently supports one owner only. If not specified, all of the service
   * account users of your VM instance's service account can use
   * the instance.
   * </pre>
   *
   * <code>repeated string instance_owners = 6 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   *
   * @return The count of instanceOwners.
   */
  int getInstanceOwnersCount();
  /**
   *
   *
   * <pre>
   * Input only. The owner of this instance after creation. Format: `alias&#64;example.com`
   *
   * Currently supports one owner only. If not specified, all of the service
   * account users of your VM instance's service account can use
   * the instance.
   * </pre>
   *
   * <code>repeated string instance_owners = 6 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   *
   * @param index The index of the element to return.
   * @return The instanceOwners at the given index.
   */
  java.lang.String getInstanceOwners(int index);
  /**
   *
   *
   * <pre>
   * Input only. The owner of this instance after creation. Format: `alias&#64;example.com`
   *
   * Currently supports one owner only. If not specified, all of the service
   * account users of your VM instance's service account can use
   * the instance.
   * </pre>
   *
   * <code>repeated string instance_owners = 6 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the instanceOwners at the given index.
   */
  com.google.protobuf.ByteString getInstanceOwnersBytes(int index);

  /**
   *
   *
   * <pre>
   * The service account on this instance, giving access to other Google
   * Cloud services.
   * You can use any service account within the same project, but you
   * must have the service account user permission to use the instance.
   *
   * If not specified, the [Compute Engine default service
   * account](https://cloud.google.com/compute/docs/access/service-accounts#default_service_account)
   * is used.
   * </pre>
   *
   * <code>string service_account = 7;</code>
   *
   * @return The serviceAccount.
   */
  java.lang.String getServiceAccount();
  /**
   *
   *
   * <pre>
   * The service account on this instance, giving access to other Google
   * Cloud services.
   * You can use any service account within the same project, but you
   * must have the service account user permission to use the instance.
   *
   * If not specified, the [Compute Engine default service
   * account](https://cloud.google.com/compute/docs/access/service-accounts#default_service_account)
   * is used.
   * </pre>
   *
   * <code>string service_account = 7;</code>
   *
   * @return The bytes for serviceAccount.
   */
  com.google.protobuf.ByteString getServiceAccountBytes();

  /**
   *
   *
   * <pre>
   * Required. The [Compute Engine machine
   * type](https://cloud.google.com/compute/docs/machine-types) of this
   * instance.
   * </pre>
   *
   * <code>string machine_type = 8 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The machineType.
   */
  java.lang.String getMachineType();
  /**
   *
   *
   * <pre>
   * Required. The [Compute Engine machine
   * type](https://cloud.google.com/compute/docs/machine-types) of this
   * instance.
   * </pre>
   *
   * <code>string machine_type = 8 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for machineType.
   */
  com.google.protobuf.ByteString getMachineTypeBytes();

  /**
   *
   *
   * <pre>
   * The hardware accelerator used on this instance. If you use
   * accelerators, make sure that your configuration has
   * [enough vCPUs and memory to support the `machine_type` you have
   * selected](https://cloud.google.com/compute/docs/gpus/#gpus-list).
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1beta1.Instance.AcceleratorConfig accelerator_config = 9;</code>
   *
   * @return Whether the acceleratorConfig field is set.
   */
  boolean hasAcceleratorConfig();
  /**
   *
   *
   * <pre>
   * The hardware accelerator used on this instance. If you use
   * accelerators, make sure that your configuration has
   * [enough vCPUs and memory to support the `machine_type` you have
   * selected](https://cloud.google.com/compute/docs/gpus/#gpus-list).
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1beta1.Instance.AcceleratorConfig accelerator_config = 9;</code>
   *
   * @return The acceleratorConfig.
   */
  com.google.cloud.notebooks.v1beta1.Instance.AcceleratorConfig getAcceleratorConfig();
  /**
   *
   *
   * <pre>
   * The hardware accelerator used on this instance. If you use
   * accelerators, make sure that your configuration has
   * [enough vCPUs and memory to support the `machine_type` you have
   * selected](https://cloud.google.com/compute/docs/gpus/#gpus-list).
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1beta1.Instance.AcceleratorConfig accelerator_config = 9;</code>
   */
  com.google.cloud.notebooks.v1beta1.Instance.AcceleratorConfigOrBuilder
      getAcceleratorConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The state of this instance.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1beta1.Instance.State state = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The state of this instance.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1beta1.Instance.State state = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.notebooks.v1beta1.Instance.State getState();

  /**
   *
   *
   * <pre>
   * Whether the end user authorizes Google Cloud to install GPU driver
   * on this instance.
   * If this field is empty or set to false, the GPU driver won't be installed.
   * Only applicable to instances with GPUs.
   * </pre>
   *
   * <code>bool install_gpu_driver = 11;</code>
   *
   * @return The installGpuDriver.
   */
  boolean getInstallGpuDriver();

  /**
   *
   *
   * <pre>
   * Specify a custom Cloud Storage path where the GPU driver is stored.
   * If not specified, we'll automatically choose from official GPU drivers.
   * </pre>
   *
   * <code>string custom_gpu_driver_path = 12;</code>
   *
   * @return The customGpuDriverPath.
   */
  java.lang.String getCustomGpuDriverPath();
  /**
   *
   *
   * <pre>
   * Specify a custom Cloud Storage path where the GPU driver is stored.
   * If not specified, we'll automatically choose from official GPU drivers.
   * </pre>
   *
   * <code>string custom_gpu_driver_path = 12;</code>
   *
   * @return The bytes for customGpuDriverPath.
   */
  com.google.protobuf.ByteString getCustomGpuDriverPathBytes();

  /**
   *
   *
   * <pre>
   * Input only. The type of the boot disk attached to this instance, defaults to
   * standard persistent disk (`PD_STANDARD`).
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1beta1.Instance.DiskType boot_disk_type = 13 [(.google.api.field_behavior) = INPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for bootDiskType.
   */
  int getBootDiskTypeValue();
  /**
   *
   *
   * <pre>
   * Input only. The type of the boot disk attached to this instance, defaults to
   * standard persistent disk (`PD_STANDARD`).
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1beta1.Instance.DiskType boot_disk_type = 13 [(.google.api.field_behavior) = INPUT_ONLY];
   * </code>
   *
   * @return The bootDiskType.
   */
  com.google.cloud.notebooks.v1beta1.Instance.DiskType getBootDiskType();

  /**
   *
   *
   * <pre>
   * Input only. The size of the boot disk in GB attached to this instance, up to a maximum
   * of 64000 GB (64 TB). The minimum recommended value is 100 GB. If not
   * specified, this defaults to 100.
   * </pre>
   *
   * <code>int64 boot_disk_size_gb = 14 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   *
   * @return The bootDiskSizeGb.
   */
  long getBootDiskSizeGb();

  /**
   *
   *
   * <pre>
   * Input only. The type of the data disk attached to this instance, defaults to
   * standard persistent disk (`PD_STANDARD`).
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1beta1.Instance.DiskType data_disk_type = 25 [(.google.api.field_behavior) = INPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for dataDiskType.
   */
  int getDataDiskTypeValue();
  /**
   *
   *
   * <pre>
   * Input only. The type of the data disk attached to this instance, defaults to
   * standard persistent disk (`PD_STANDARD`).
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1beta1.Instance.DiskType data_disk_type = 25 [(.google.api.field_behavior) = INPUT_ONLY];
   * </code>
   *
   * @return The dataDiskType.
   */
  com.google.cloud.notebooks.v1beta1.Instance.DiskType getDataDiskType();

  /**
   *
   *
   * <pre>
   * Input only. The size of the data disk in GB attached to this instance, up to a maximum
   * of 64000 GB (64 TB). You can choose the size of the data disk based on how
   * big your notebooks and data are. If not specified, this defaults to 100.
   * </pre>
   *
   * <code>int64 data_disk_size_gb = 26 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   *
   * @return The dataDiskSizeGb.
   */
  long getDataDiskSizeGb();

  /**
   *
   *
   * <pre>
   * Input only. If true, the data disk will not be auto deleted when deleting the instance.
   * </pre>
   *
   * <code>bool no_remove_data_disk = 27 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   *
   * @return The noRemoveDataDisk.
   */
  boolean getNoRemoveDataDisk();

  /**
   *
   *
   * <pre>
   * Input only. Disk encryption method used on the boot and data disks, defaults to GMEK.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1beta1.Instance.DiskEncryption disk_encryption = 15 [(.google.api.field_behavior) = INPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for diskEncryption.
   */
  int getDiskEncryptionValue();
  /**
   *
   *
   * <pre>
   * Input only. Disk encryption method used on the boot and data disks, defaults to GMEK.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1beta1.Instance.DiskEncryption disk_encryption = 15 [(.google.api.field_behavior) = INPUT_ONLY];
   * </code>
   *
   * @return The diskEncryption.
   */
  com.google.cloud.notebooks.v1beta1.Instance.DiskEncryption getDiskEncryption();

  /**
   *
   *
   * <pre>
   * Input only. The KMS key used to encrypt the disks, only applicable if disk_encryption
   * is CMEK.
   * Format:
   * `projects/{project_id}/locations/{location}/keyRings/{key_ring_id}/cryptoKeys/{key_id}`
   *
   * Learn more about [using your own encryption
   * keys](https://cloud.google.com/kms/docs/quickstart).
   * </pre>
   *
   * <code>string kms_key = 16 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   *
   * @return The kmsKey.
   */
  java.lang.String getKmsKey();
  /**
   *
   *
   * <pre>
   * Input only. The KMS key used to encrypt the disks, only applicable if disk_encryption
   * is CMEK.
   * Format:
   * `projects/{project_id}/locations/{location}/keyRings/{key_ring_id}/cryptoKeys/{key_id}`
   *
   * Learn more about [using your own encryption
   * keys](https://cloud.google.com/kms/docs/quickstart).
   * </pre>
   *
   * <code>string kms_key = 16 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   *
   * @return The bytes for kmsKey.
   */
  com.google.protobuf.ByteString getKmsKeyBytes();

  /**
   *
   *
   * <pre>
   * If true, no public IP will be assigned to this instance.
   * </pre>
   *
   * <code>bool no_public_ip = 17;</code>
   *
   * @return The noPublicIp.
   */
  boolean getNoPublicIp();

  /**
   *
   *
   * <pre>
   * If true, the notebook instance will not register with the proxy.
   * </pre>
   *
   * <code>bool no_proxy_access = 18;</code>
   *
   * @return The noProxyAccess.
   */
  boolean getNoProxyAccess();

  /**
   *
   *
   * <pre>
   * The name of the VPC that this instance is in.
   * Format:
   * `projects/{project_id}/global/networks/{network_id}`
   * </pre>
   *
   * <code>string network = 19;</code>
   *
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   *
   *
   * <pre>
   * The name of the VPC that this instance is in.
   * Format:
   * `projects/{project_id}/global/networks/{network_id}`
   * </pre>
   *
   * <code>string network = 19;</code>
   *
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString getNetworkBytes();

  /**
   *
   *
   * <pre>
   * The name of the subnet that this instance is in.
   * Format:
   * `projects/{project_id}/regions/{region}/subnetworks/{subnetwork_id}`
   * </pre>
   *
   * <code>string subnet = 20;</code>
   *
   * @return The subnet.
   */
  java.lang.String getSubnet();
  /**
   *
   *
   * <pre>
   * The name of the subnet that this instance is in.
   * Format:
   * `projects/{project_id}/regions/{region}/subnetworks/{subnetwork_id}`
   * </pre>
   *
   * <code>string subnet = 20;</code>
   *
   * @return The bytes for subnet.
   */
  com.google.protobuf.ByteString getSubnetBytes();

  /**
   *
   *
   * <pre>
   * Labels to apply to this instance.
   * These can be later modified by the setLabels method.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 21;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels to apply to this instance.
   * These can be later modified by the setLabels method.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 21;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Labels to apply to this instance.
   * These can be later modified by the setLabels method.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 21;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels to apply to this instance.
   * These can be later modified by the setLabels method.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 21;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Labels to apply to this instance.
   * These can be later modified by the setLabels method.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 21;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Custom metadata to apply to this instance.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 22;</code>
   */
  int getMetadataCount();
  /**
   *
   *
   * <pre>
   * Custom metadata to apply to this instance.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 22;</code>
   */
  boolean containsMetadata(java.lang.String key);
  /** Use {@link #getMetadataMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getMetadata();
  /**
   *
   *
   * <pre>
   * Custom metadata to apply to this instance.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 22;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getMetadataMap();
  /**
   *
   *
   * <pre>
   * Custom metadata to apply to this instance.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 22;</code>
   */
  /* nullable */
  java.lang.String getMetadataOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Custom metadata to apply to this instance.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 22;</code>
   */
  java.lang.String getMetadataOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. The type of vNIC to be used on this interface. This may be gVNIC or
   * VirtioNet.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1beta1.Instance.NicType nic_type = 28 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for nicType.
   */
  int getNicTypeValue();
  /**
   *
   *
   * <pre>
   * Optional. The type of vNIC to be used on this interface. This may be gVNIC or
   * VirtioNet.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1beta1.Instance.NicType nic_type = 28 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The nicType.
   */
  com.google.cloud.notebooks.v1beta1.Instance.NicType getNicType();

  /**
   *
   *
   * <pre>
   * Optional. The optional reservation affinity. Setting this field will apply
   * the specified [Zonal Compute
   * Reservation](https://cloud.google.com/compute/docs/instances/reserving-zonal-resources)
   * to this notebook instance.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1beta1.ReservationAffinity reservation_affinity = 29 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the reservationAffinity field is set.
   */
  boolean hasReservationAffinity();
  /**
   *
   *
   * <pre>
   * Optional. The optional reservation affinity. Setting this field will apply
   * the specified [Zonal Compute
   * Reservation](https://cloud.google.com/compute/docs/instances/reserving-zonal-resources)
   * to this notebook instance.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1beta1.ReservationAffinity reservation_affinity = 29 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The reservationAffinity.
   */
  com.google.cloud.notebooks.v1beta1.ReservationAffinity getReservationAffinity();
  /**
   *
   *
   * <pre>
   * Optional. The optional reservation affinity. Setting this field will apply
   * the specified [Zonal Compute
   * Reservation](https://cloud.google.com/compute/docs/instances/reserving-zonal-resources)
   * to this notebook instance.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1beta1.ReservationAffinity reservation_affinity = 29 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.notebooks.v1beta1.ReservationAffinityOrBuilder getReservationAffinityOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Flag to enable ip forwarding or not, default false/off.
   * https://cloud.google.com/vpc/docs/using-routes#canipforward
   * </pre>
   *
   * <code>bool can_ip_forward = 31 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The canIpForward.
   */
  boolean getCanIpForward();

  /**
   *
   *
   * <pre>
   * Output only. Instance creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 23 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Instance creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 23 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Instance creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 23 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Instance update time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 24 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Instance update time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 24 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Instance update time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 24 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  com.google.cloud.notebooks.v1beta1.Instance.EnvironmentCase getEnvironmentCase();
}
