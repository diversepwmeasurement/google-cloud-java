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

package com.google.cloud.websecurityscanner.v1.samples;

// [START websecurityscanner_v1_generated_websecurityscannerclient_listfindings_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.websecurityscanner.v1.Finding;
import com.google.cloud.websecurityscanner.v1.ListFindingsRequest;
import com.google.cloud.websecurityscanner.v1.WebSecurityScannerClient;

public class AsyncListFindings {

  public static void main(String[] args) throws Exception {
    asyncListFindings();
  }

  public static void asyncListFindings() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
      ListFindingsRequest request =
          ListFindingsRequest.newBuilder()
              .setParent("parent-995424086")
              .setFilter("filter-1274492040")
              .setPageToken("pageToken873572522")
              .setPageSize(883849137)
              .build();
      ApiFuture<Finding> future =
          webSecurityScannerClient.listFindingsPagedCallable().futureCall(request);
      // Do something.
      for (Finding element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END websecurityscanner_v1_generated_websecurityscannerclient_listfindings_async]