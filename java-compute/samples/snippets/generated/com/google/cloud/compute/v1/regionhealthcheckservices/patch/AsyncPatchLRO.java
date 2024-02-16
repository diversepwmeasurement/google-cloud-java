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

// [START compute_v1_generated_RegionHealthCheckServices_Patch_LRO_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.compute.v1.HealthCheckService;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.PatchRegionHealthCheckServiceRequest;
import com.google.cloud.compute.v1.RegionHealthCheckServicesClient;

public class AsyncPatchLRO {

  public static void main(String[] args) throws Exception {
    asyncPatchLRO();
  }

  public static void asyncPatchLRO() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (RegionHealthCheckServicesClient regionHealthCheckServicesClient =
        RegionHealthCheckServicesClient.create()) {
      PatchRegionHealthCheckServiceRequest request =
          PatchRegionHealthCheckServiceRequest.newBuilder()
              .setHealthCheckService("healthCheckService-917902071")
              .setHealthCheckServiceResource(HealthCheckService.newBuilder().build())
              .setProject("project-309310695")
              .setRegion("region-934795532")
              .setRequestId("requestId693933066")
              .build();
      OperationFuture<Operation, Operation> future =
          regionHealthCheckServicesClient.patchOperationCallable().futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END compute_v1_generated_RegionHealthCheckServices_Patch_LRO_async]
