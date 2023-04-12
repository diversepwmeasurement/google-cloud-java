/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/contentwarehouse/v1/document_service_request.proto

package com.google.cloud.contentwarehouse.v1;

public interface UpdateDocumentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.UpdateDocumentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the document to update.
   * Format:
   * projects/{project_number}/locations/{location}/documents/{document_id}
   * or
   * projects/{project_number}/locations/{location}/documents/referenceId/{reference_id}.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The name of the document to update.
   * Format:
   * projects/{project_number}/locations/{location}/documents/{document_id}
   * or
   * projects/{project_number}/locations/{location}/documents/referenceId/{reference_id}.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The document to update.
   * </pre>
   *
   * <code>
   * .google.cloud.contentwarehouse.v1.Document document = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the document field is set.
   */
  boolean hasDocument();
  /**
   *
   *
   * <pre>
   * Required. The document to update.
   * </pre>
   *
   * <code>
   * .google.cloud.contentwarehouse.v1.Document document = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The document.
   */
  com.google.cloud.contentwarehouse.v1.Document getDocument();
  /**
   *
   *
   * <pre>
   * Required. The document to update.
   * </pre>
   *
   * <code>
   * .google.cloud.contentwarehouse.v1.Document document = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.contentwarehouse.v1.DocumentOrBuilder getDocumentOrBuilder();

  /**
   *
   *
   * <pre>
   * The meta information collected about the end user, used to enforce access
   * control for the service.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.RequestMetadata request_metadata = 3;</code>
   *
   * @return Whether the requestMetadata field is set.
   */
  boolean hasRequestMetadata();
  /**
   *
   *
   * <pre>
   * The meta information collected about the end user, used to enforce access
   * control for the service.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.RequestMetadata request_metadata = 3;</code>
   *
   * @return The requestMetadata.
   */
  com.google.cloud.contentwarehouse.v1.RequestMetadata getRequestMetadata();
  /**
   *
   *
   * <pre>
   * The meta information collected about the end user, used to enforce access
   * control for the service.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.RequestMetadata request_metadata = 3;</code>
   */
  com.google.cloud.contentwarehouse.v1.RequestMetadataOrBuilder getRequestMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * Request Option for processing Cloud AI Document in Document Warehouse.
   * This field offers limited support for mapping entities from Cloud AI
   * Document to Warehouse Document. Please consult with product team before
   * using this field and other available options.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.CloudAIDocumentOption cloud_ai_document_option = 5;
   * </code>
   *
   * @return Whether the cloudAiDocumentOption field is set.
   */
  boolean hasCloudAiDocumentOption();
  /**
   *
   *
   * <pre>
   * Request Option for processing Cloud AI Document in Document Warehouse.
   * This field offers limited support for mapping entities from Cloud AI
   * Document to Warehouse Document. Please consult with product team before
   * using this field and other available options.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.CloudAIDocumentOption cloud_ai_document_option = 5;
   * </code>
   *
   * @return The cloudAiDocumentOption.
   */
  com.google.cloud.contentwarehouse.v1.CloudAIDocumentOption getCloudAiDocumentOption();
  /**
   *
   *
   * <pre>
   * Request Option for processing Cloud AI Document in Document Warehouse.
   * This field offers limited support for mapping entities from Cloud AI
   * Document to Warehouse Document. Please consult with product team before
   * using this field and other available options.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.CloudAIDocumentOption cloud_ai_document_option = 5;
   * </code>
   */
  com.google.cloud.contentwarehouse.v1.CloudAIDocumentOptionOrBuilder
      getCloudAiDocumentOptionOrBuilder();

  /**
   *
   *
   * <pre>
   * Options for the update operation.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.UpdateOptions update_options = 6;</code>
   *
   * @return Whether the updateOptions field is set.
   */
  boolean hasUpdateOptions();
  /**
   *
   *
   * <pre>
   * Options for the update operation.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.UpdateOptions update_options = 6;</code>
   *
   * @return The updateOptions.
   */
  com.google.cloud.contentwarehouse.v1.UpdateOptions getUpdateOptions();
  /**
   *
   *
   * <pre>
   * Options for the update operation.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.UpdateOptions update_options = 6;</code>
   */
  com.google.cloud.contentwarehouse.v1.UpdateOptionsOrBuilder getUpdateOptionsOrBuilder();
}
