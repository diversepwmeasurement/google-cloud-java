/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudbuild/v2/repositories.proto

package com.google.cloudbuild.v2;

public interface GitHubEnterpriseConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v2.GitHubEnterpriseConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The URI of the GitHub Enterprise host this connection is for.
   * </pre>
   *
   * <code>string host_uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The hostUri.
   */
  java.lang.String getHostUri();
  /**
   *
   *
   * <pre>
   * Required. The URI of the GitHub Enterprise host this connection is for.
   * </pre>
   *
   * <code>string host_uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for hostUri.
   */
  com.google.protobuf.ByteString getHostUriBytes();

  /**
   *
   *
   * <pre>
   * Required. API Key used for authentication of webhook events.
   * </pre>
   *
   * <code>string api_key = 12 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The apiKey.
   */
  java.lang.String getApiKey();
  /**
   *
   *
   * <pre>
   * Required. API Key used for authentication of webhook events.
   * </pre>
   *
   * <code>string api_key = 12 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for apiKey.
   */
  com.google.protobuf.ByteString getApiKeyBytes();

  /**
   *
   *
   * <pre>
   * Id of the GitHub App created from the manifest.
   * </pre>
   *
   * <code>int64 app_id = 2;</code>
   *
   * @return The appId.
   */
  long getAppId();

  /**
   *
   *
   * <pre>
   * The URL-friendly name of the GitHub App.
   * </pre>
   *
   * <code>string app_slug = 13;</code>
   *
   * @return The appSlug.
   */
  java.lang.String getAppSlug();
  /**
   *
   *
   * <pre>
   * The URL-friendly name of the GitHub App.
   * </pre>
   *
   * <code>string app_slug = 13;</code>
   *
   * @return The bytes for appSlug.
   */
  com.google.protobuf.ByteString getAppSlugBytes();

  /**
   *
   *
   * <pre>
   * SecretManager resource containing the private key of the GitHub App,
   * formatted as `projects/&#42;&#47;secrets/&#42;&#47;versions/&#42;`.
   * </pre>
   *
   * <code>string private_key_secret_version = 4 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The privateKeySecretVersion.
   */
  java.lang.String getPrivateKeySecretVersion();
  /**
   *
   *
   * <pre>
   * SecretManager resource containing the private key of the GitHub App,
   * formatted as `projects/&#42;&#47;secrets/&#42;&#47;versions/&#42;`.
   * </pre>
   *
   * <code>string private_key_secret_version = 4 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for privateKeySecretVersion.
   */
  com.google.protobuf.ByteString getPrivateKeySecretVersionBytes();

  /**
   *
   *
   * <pre>
   * SecretManager resource containing the webhook secret of the GitHub App,
   * formatted as `projects/&#42;&#47;secrets/&#42;&#47;versions/&#42;`.
   * </pre>
   *
   * <code>string webhook_secret_secret_version = 5 [(.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The webhookSecretSecretVersion.
   */
  java.lang.String getWebhookSecretSecretVersion();
  /**
   *
   *
   * <pre>
   * SecretManager resource containing the webhook secret of the GitHub App,
   * formatted as `projects/&#42;&#47;secrets/&#42;&#47;versions/&#42;`.
   * </pre>
   *
   * <code>string webhook_secret_secret_version = 5 [(.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for webhookSecretSecretVersion.
   */
  com.google.protobuf.ByteString getWebhookSecretSecretVersionBytes();

  /**
   *
   *
   * <pre>
   * ID of the installation of the GitHub App.
   * </pre>
   *
   * <code>int64 app_installation_id = 9;</code>
   *
   * @return The appInstallationId.
   */
  long getAppInstallationId();

  /**
   *
   *
   * <pre>
   * Configuration for using Service Directory to privately connect to a GitHub
   * Enterprise server. This should only be set if the GitHub Enterprise server
   * is hosted on-premises and not reachable by public internet. If this field
   * is left empty, calls to the GitHub Enterprise server will be made over the
   * public internet.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v2.ServiceDirectoryConfig service_directory_config = 10;
   * </code>
   *
   * @return Whether the serviceDirectoryConfig field is set.
   */
  boolean hasServiceDirectoryConfig();
  /**
   *
   *
   * <pre>
   * Configuration for using Service Directory to privately connect to a GitHub
   * Enterprise server. This should only be set if the GitHub Enterprise server
   * is hosted on-premises and not reachable by public internet. If this field
   * is left empty, calls to the GitHub Enterprise server will be made over the
   * public internet.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v2.ServiceDirectoryConfig service_directory_config = 10;
   * </code>
   *
   * @return The serviceDirectoryConfig.
   */
  com.google.cloudbuild.v2.ServiceDirectoryConfig getServiceDirectoryConfig();
  /**
   *
   *
   * <pre>
   * Configuration for using Service Directory to privately connect to a GitHub
   * Enterprise server. This should only be set if the GitHub Enterprise server
   * is hosted on-premises and not reachable by public internet. If this field
   * is left empty, calls to the GitHub Enterprise server will be made over the
   * public internet.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v2.ServiceDirectoryConfig service_directory_config = 10;
   * </code>
   */
  com.google.cloudbuild.v2.ServiceDirectoryConfigOrBuilder getServiceDirectoryConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * SSL certificate to use for requests to GitHub Enterprise.
   * </pre>
   *
   * <code>string ssl_ca = 11;</code>
   *
   * @return The sslCa.
   */
  java.lang.String getSslCa();
  /**
   *
   *
   * <pre>
   * SSL certificate to use for requests to GitHub Enterprise.
   * </pre>
   *
   * <code>string ssl_ca = 11;</code>
   *
   * @return The bytes for sslCa.
   */
  com.google.protobuf.ByteString getSslCaBytes();

  /**
   *
   *
   * <pre>
   * Output only. GitHub Enterprise version installed at the host_uri.
   * </pre>
   *
   * <code>string server_version = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The serverVersion.
   */
  java.lang.String getServerVersion();
  /**
   *
   *
   * <pre>
   * Output only. GitHub Enterprise version installed at the host_uri.
   * </pre>
   *
   * <code>string server_version = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for serverVersion.
   */
  com.google.protobuf.ByteString getServerVersionBytes();
}
