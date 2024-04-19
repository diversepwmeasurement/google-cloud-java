/*
 * Copyright 2024 Google LLC
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
// source: google/cloud/documentai/v1/document_processor_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.documentai.v1;

public interface TrainProcessorVersionRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1.TrainProcessorVersionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Options to control Custom Document Extraction (CDE) Processor.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1.TrainProcessorVersionRequest.CustomDocumentExtractionOptions custom_document_extraction_options = 5;
   * </code>
   *
   * @return Whether the customDocumentExtractionOptions field is set.
   */
  boolean hasCustomDocumentExtractionOptions();
  /**
   *
   *
   * <pre>
   * Options to control Custom Document Extraction (CDE) Processor.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1.TrainProcessorVersionRequest.CustomDocumentExtractionOptions custom_document_extraction_options = 5;
   * </code>
   *
   * @return The customDocumentExtractionOptions.
   */
  com.google.cloud.documentai.v1.TrainProcessorVersionRequest.CustomDocumentExtractionOptions
      getCustomDocumentExtractionOptions();
  /**
   *
   *
   * <pre>
   * Options to control Custom Document Extraction (CDE) Processor.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1.TrainProcessorVersionRequest.CustomDocumentExtractionOptions custom_document_extraction_options = 5;
   * </code>
   */
  com.google.cloud.documentai.v1.TrainProcessorVersionRequest
          .CustomDocumentExtractionOptionsOrBuilder
      getCustomDocumentExtractionOptionsOrBuilder();

  /**
   *
   *
   * <pre>
   * Options to control foundation model tuning of a processor.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1.TrainProcessorVersionRequest.FoundationModelTuningOptions foundation_model_tuning_options = 12;
   * </code>
   *
   * @return Whether the foundationModelTuningOptions field is set.
   */
  boolean hasFoundationModelTuningOptions();
  /**
   *
   *
   * <pre>
   * Options to control foundation model tuning of a processor.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1.TrainProcessorVersionRequest.FoundationModelTuningOptions foundation_model_tuning_options = 12;
   * </code>
   *
   * @return The foundationModelTuningOptions.
   */
  com.google.cloud.documentai.v1.TrainProcessorVersionRequest.FoundationModelTuningOptions
      getFoundationModelTuningOptions();
  /**
   *
   *
   * <pre>
   * Options to control foundation model tuning of a processor.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1.TrainProcessorVersionRequest.FoundationModelTuningOptions foundation_model_tuning_options = 12;
   * </code>
   */
  com.google.cloud.documentai.v1.TrainProcessorVersionRequest.FoundationModelTuningOptionsOrBuilder
      getFoundationModelTuningOptionsOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The parent (project, location and processor) to create the new version for.
   * Format: `projects/{project}/locations/{location}/processors/{processor}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent (project, location and processor) to create the new version for.
   * Format: `projects/{project}/locations/{location}/processors/{processor}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The processor version to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1.ProcessorVersion processor_version = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the processorVersion field is set.
   */
  boolean hasProcessorVersion();
  /**
   *
   *
   * <pre>
   * Required. The processor version to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1.ProcessorVersion processor_version = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The processorVersion.
   */
  com.google.cloud.documentai.v1.ProcessorVersion getProcessorVersion();
  /**
   *
   *
   * <pre>
   * Required. The processor version to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1.ProcessorVersion processor_version = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.documentai.v1.ProcessorVersionOrBuilder getProcessorVersionOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The schema the processor version will be trained with.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1.DocumentSchema document_schema = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the documentSchema field is set.
   */
  boolean hasDocumentSchema();
  /**
   *
   *
   * <pre>
   * Optional. The schema the processor version will be trained with.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1.DocumentSchema document_schema = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The documentSchema.
   */
  com.google.cloud.documentai.v1.DocumentSchema getDocumentSchema();
  /**
   *
   *
   * <pre>
   * Optional. The schema the processor version will be trained with.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1.DocumentSchema document_schema = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.documentai.v1.DocumentSchemaOrBuilder getDocumentSchemaOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The input data used to train the [ProcessorVersion][google.cloud.documentai.v1.ProcessorVersion].
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1.TrainProcessorVersionRequest.InputData input_data = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the inputData field is set.
   */
  boolean hasInputData();
  /**
   *
   *
   * <pre>
   * Optional. The input data used to train the [ProcessorVersion][google.cloud.documentai.v1.ProcessorVersion].
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1.TrainProcessorVersionRequest.InputData input_data = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The inputData.
   */
  com.google.cloud.documentai.v1.TrainProcessorVersionRequest.InputData getInputData();
  /**
   *
   *
   * <pre>
   * Optional. The input data used to train the [ProcessorVersion][google.cloud.documentai.v1.ProcessorVersion].
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1.TrainProcessorVersionRequest.InputData input_data = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.documentai.v1.TrainProcessorVersionRequest.InputDataOrBuilder
      getInputDataOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The processor version to use as a base for training. This processor version
   * must be a child of `parent`. Format:
   * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processorVersion}`.
   * </pre>
   *
   * <code>string base_processor_version = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The baseProcessorVersion.
   */
  java.lang.String getBaseProcessorVersion();
  /**
   *
   *
   * <pre>
   * Optional. The processor version to use as a base for training. This processor version
   * must be a child of `parent`. Format:
   * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processorVersion}`.
   * </pre>
   *
   * <code>string base_processor_version = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for baseProcessorVersion.
   */
  com.google.protobuf.ByteString getBaseProcessorVersionBytes();

  com.google.cloud.documentai.v1.TrainProcessorVersionRequest.ProcessorFlagsCase
      getProcessorFlagsCase();
}
