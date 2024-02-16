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

// [START container_v1_generated_ClusterManager_SetLocations_StringListstring_sync]
import com.google.cloud.container.v1.ClusterManagerClient;
import com.google.container.v1.Operation;
import java.util.ArrayList;
import java.util.List;

public class SyncSetLocationsStringListstring {

  public static void main(String[] args) throws Exception {
    syncSetLocationsStringListstring();
  }

  public static void syncSetLocationsStringListstring() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
      String name = "name3373707";
      List<String> locations = new ArrayList<>();
      Operation response = clusterManagerClient.setLocations(name, locations);
    }
  }
}
// [END container_v1_generated_ClusterManager_SetLocations_StringListstring_sync]
