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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface AcceleratorsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.Accelerators)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Number of accelerator cards exposed to the guest.
   * </pre>
   *
   * <code>int32 guest_accelerator_count = 210643860;</code>
   *
   * @return The guestAcceleratorCount.
   */
  int getGuestAcceleratorCount();

  /**
   *
   *
   * <pre>
   * The accelerator type resource name, not a full URL, e.g. 'nvidia-tesla-k80'.
   * </pre>
   *
   * <code>string guest_accelerator_type = 24629269;</code>
   *
   * @return The guestAcceleratorType.
   */
  java.lang.String getGuestAcceleratorType();
  /**
   *
   *
   * <pre>
   * The accelerator type resource name, not a full URL, e.g. 'nvidia-tesla-k80'.
   * </pre>
   *
   * <code>string guest_accelerator_type = 24629269;</code>
   *
   * @return The bytes for guestAcceleratorType.
   */
  com.google.protobuf.ByteString getGuestAcceleratorTypeBytes();
}
