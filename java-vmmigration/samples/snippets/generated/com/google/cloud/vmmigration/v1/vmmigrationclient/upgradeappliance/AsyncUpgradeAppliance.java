/*
 * Copyright 2022 Google LLC
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

package com.google.cloud.vmmigration.v1.samples;

// [START vmmigration_v1_generated_vmmigrationclient_upgradeappliance_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.vmmigration.v1.DatacenterConnectorName;
import com.google.cloud.vmmigration.v1.UpgradeApplianceRequest;
import com.google.cloud.vmmigration.v1.VmMigrationClient;
import com.google.longrunning.Operation;

public class AsyncUpgradeAppliance {

  public static void main(String[] args) throws Exception {
    asyncUpgradeAppliance();
  }

  public static void asyncUpgradeAppliance() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (VmMigrationClient vmMigrationClient = VmMigrationClient.create()) {
      UpgradeApplianceRequest request =
          UpgradeApplianceRequest.newBuilder()
              .setDatacenterConnector(
                  DatacenterConnectorName.of(
                          "[PROJECT]", "[LOCATION]", "[SOURCE]", "[DATACENTER_CONNECTOR]")
                      .toString())
              .setRequestId("requestId693933066")
              .build();
      ApiFuture<Operation> future =
          vmMigrationClient.upgradeApplianceCallable().futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END vmmigration_v1_generated_vmmigrationclient_upgradeappliance_async]