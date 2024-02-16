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

package com.google.cloud.dialogflow.v2.samples;

// [START dialogflow_v2_generated_Fulfillments_GetFulfillment_sync]
import com.google.cloud.dialogflow.v2.Fulfillment;
import com.google.cloud.dialogflow.v2.FulfillmentName;
import com.google.cloud.dialogflow.v2.FulfillmentsClient;
import com.google.cloud.dialogflow.v2.GetFulfillmentRequest;

public class SyncGetFulfillment {

  public static void main(String[] args) throws Exception {
    syncGetFulfillment();
  }

  public static void syncGetFulfillment() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (FulfillmentsClient fulfillmentsClient = FulfillmentsClient.create()) {
      GetFulfillmentRequest request =
          GetFulfillmentRequest.newBuilder()
              .setName(FulfillmentName.ofProjectName("[PROJECT]").toString())
              .build();
      Fulfillment response = fulfillmentsClient.getFulfillment(request);
    }
  }
}
// [END dialogflow_v2_generated_Fulfillments_GetFulfillment_sync]
