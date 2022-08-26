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

package com.google.cloud.recommender.v1.samples;

// [START
// recommender_v1_generated_recommenderclient_markinsightaccepted_stringmapstringstringstring_sync]
import com.google.cloud.recommender.v1.Insight;
import com.google.cloud.recommender.v1.InsightName;
import com.google.cloud.recommender.v1.RecommenderClient;
import java.util.HashMap;
import java.util.Map;

public class SyncMarkInsightAcceptedStringMapstringstringString {

  public static void main(String[] args) throws Exception {
    syncMarkInsightAcceptedStringMapstringstringString();
  }

  public static void syncMarkInsightAcceptedStringMapstringstringString() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (RecommenderClient recommenderClient = RecommenderClient.create()) {
      String name =
          InsightName.ofProjectLocationInsightTypeInsightName(
                  "[PROJECT]", "[LOCATION]", "[INSIGHT_TYPE]", "[INSIGHT]")
              .toString();
      Map<String, String> stateMetadata = new HashMap<>();
      String etag = "etag3123477";
      Insight response = recommenderClient.markInsightAccepted(name, stateMetadata, etag);
    }
  }
}
// [END
// recommender_v1_generated_recommenderclient_markinsightaccepted_stringmapstringstringstring_sync]