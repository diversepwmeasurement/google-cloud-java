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

package com.google.cloud.apigeeregistry.v1.samples;

// [START apigeeregistry_v1_generated_registryclient_getartifact_artifactname_sync]
import com.google.cloud.apigeeregistry.v1.Artifact;
import com.google.cloud.apigeeregistry.v1.ArtifactName;
import com.google.cloud.apigeeregistry.v1.RegistryClient;

public class SyncGetArtifactArtifactname {

  public static void main(String[] args) throws Exception {
    syncGetArtifactArtifactname();
  }

  public static void syncGetArtifactArtifactname() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (RegistryClient registryClient = RegistryClient.create()) {
      ArtifactName name =
          ArtifactName.ofProjectLocationArtifactName("[PROJECT]", "[LOCATION]", "[ARTIFACT]");
      Artifact response = registryClient.getArtifact(name);
    }
  }
}
// [END apigeeregistry_v1_generated_registryclient_getartifact_artifactname_sync]