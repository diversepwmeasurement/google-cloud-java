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

package com.google.cloud.memcache.v1beta2.stub.samples;

// [START memcache_v1beta2_generated_cloudmemcachestubsettings_getinstance_sync]
import com.google.cloud.memcache.v1beta2.stub.CloudMemcacheStubSettings;
import java.time.Duration;

public class SyncGetInstance {

  public static void main(String[] args) throws Exception {
    syncGetInstance();
  }

  public static void syncGetInstance() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    CloudMemcacheStubSettings.Builder cloudMemcacheSettingsBuilder =
        CloudMemcacheStubSettings.newBuilder();
    cloudMemcacheSettingsBuilder
        .getInstanceSettings()
        .setRetrySettings(
            cloudMemcacheSettingsBuilder
                .getInstanceSettings()
                .getRetrySettings()
                .toBuilder()
                .setTotalTimeout(Duration.ofSeconds(30))
                .build());
    CloudMemcacheStubSettings cloudMemcacheSettings = cloudMemcacheSettingsBuilder.build();
  }
}
// [END memcache_v1beta2_generated_cloudmemcachestubsettings_getinstance_sync]