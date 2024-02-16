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

// [START compute_v1_generated_Images_SetLabels_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.compute.v1.GlobalSetLabelsRequest;
import com.google.cloud.compute.v1.ImagesClient;
import com.google.cloud.compute.v1.SetLabelsImageRequest;
import com.google.longrunning.Operation;

public class AsyncSetLabels {

  public static void main(String[] args) throws Exception {
    asyncSetLabels();
  }

  public static void asyncSetLabels() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ImagesClient imagesClient = ImagesClient.create()) {
      SetLabelsImageRequest request =
          SetLabelsImageRequest.newBuilder()
              .setGlobalSetLabelsRequestResource(GlobalSetLabelsRequest.newBuilder().build())
              .setProject("project-309310695")
              .setResource("resource-341064690")
              .build();
      ApiFuture<Operation> future = imagesClient.setLabelsCallable().futureCall(request);
      // Do something.
      com.google.cloud.compute.v1.Operation response = future.get();
    }
  }
}
// [END compute_v1_generated_Images_SetLabels_async]
