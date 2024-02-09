/*
 * Copyright 2023 Google LLC
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

package com.google.cloud.dialogflow.cx.v3beta1.samples;

// [START dialogflow_v3beta1_generated_Playbooks_Create_SetEndpoint_sync]
import com.google.cloud.dialogflow.cx.v3beta1.PlaybooksClient;
import com.google.cloud.dialogflow.cx.v3beta1.PlaybooksSettings;
import com.google.cloud.dialogflow.cx.v3beta1.myEndpoint;

public class SyncCreateSetEndpoint {

  public static void main(String[] args) throws Exception {
    syncCreateSetEndpoint();
  }

  public static void syncCreateSetEndpoint() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    PlaybooksSettings playbooksSettings =
        PlaybooksSettings.newBuilder().setEndpoint(myEndpoint).build();
    PlaybooksClient playbooksClient = PlaybooksClient.create(playbooksSettings);
  }
}
// [END dialogflow_v3beta1_generated_Playbooks_Create_SetEndpoint_sync]
