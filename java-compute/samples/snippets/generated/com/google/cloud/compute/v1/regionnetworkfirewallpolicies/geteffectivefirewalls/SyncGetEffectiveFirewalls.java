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

package com.google.cloud.compute.v1.samples;

// [START compute_v1_generated_RegionNetworkFirewallPolicies_GetEffectiveFirewalls_sync]
import com.google.cloud.compute.v1.GetEffectiveFirewallsRegionNetworkFirewallPolicyRequest;
import com.google.cloud.compute.v1.RegionNetworkFirewallPoliciesClient;
import com.google.cloud.compute.v1.RegionNetworkFirewallPoliciesGetEffectiveFirewallsResponse;

public class SyncGetEffectiveFirewalls {

  public static void main(String[] args) throws Exception {
    syncGetEffectiveFirewalls();
  }

  public static void syncGetEffectiveFirewalls() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (RegionNetworkFirewallPoliciesClient regionNetworkFirewallPoliciesClient =
        RegionNetworkFirewallPoliciesClient.create()) {
      GetEffectiveFirewallsRegionNetworkFirewallPolicyRequest request =
          GetEffectiveFirewallsRegionNetworkFirewallPolicyRequest.newBuilder()
              .setNetwork("network1843485230")
              .setProject("project-309310695")
              .setRegion("region-934795532")
              .build();
      RegionNetworkFirewallPoliciesGetEffectiveFirewallsResponse response =
          regionNetworkFirewallPoliciesClient.getEffectiveFirewalls(request);
    }
  }
}
// [END compute_v1_generated_RegionNetworkFirewallPolicies_GetEffectiveFirewalls_sync]
