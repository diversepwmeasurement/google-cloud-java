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

public interface SetAclRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.SetAclRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. REQUIRED: The resource for which the policy is being requested.
   * Format for document:
   * projects/{project_number}/locations/{location}/documents/{document_id}.
   * Format for collection:
   * projects/{project_number}/locations/{location}/collections/{collection_id}.
   * Format for project: projects/{project_number}.
   * </pre>
   *
   * <code>string resource = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The resource.
   */
  java.lang.String getResource();
  /**
   *
   *
   * <pre>
   * Required. REQUIRED: The resource for which the policy is being requested.
   * Format for document:
   * projects/{project_number}/locations/{location}/documents/{document_id}.
   * Format for collection:
   * projects/{project_number}/locations/{location}/collections/{collection_id}.
   * Format for project: projects/{project_number}.
   * </pre>
   *
   * <code>string resource = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for resource.
   */
  com.google.protobuf.ByteString getResourceBytes();

  /**
   *
   *
   * <pre>
   * Required. REQUIRED: The complete policy to be applied to the `resource`.
   * The size of the policy is limited to a few 10s of KB. This refers to an
   * Identity and Access (IAM) policy, which specifies access controls for the
   * Document.
   * You can set ACL with condition for projects only.
   * Supported operators are: `=`, `!=`, `&lt;`, `&lt;=`, `&gt;`, and `&gt;=` where
   * the left of the operator is `DocumentSchemaId` or property name and the
   * right of the operator is a number or a quoted string. You must escape
   * backslash (&#92;&#92;) and quote (&#92;") characters.
   * Boolean expressions (AND/OR) are supported up to 3 levels of nesting (for
   * example, "((A AND B AND C) OR D) AND E"), a maximum of 10 comparisons are
   * allowed in the expression. The expression must be &lt; 6000 bytes in length.
   * Sample condition:
   *     `"DocumentSchemaId = &#92;"some schema id&#92;" OR SchemaId.floatPropertyName
   *     &gt;= 10"`
   * </pre>
   *
   * <code>.google.iam.v1.Policy policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the policy field is set.
   */
  boolean hasPolicy();
  /**
   *
   *
   * <pre>
   * Required. REQUIRED: The complete policy to be applied to the `resource`.
   * The size of the policy is limited to a few 10s of KB. This refers to an
   * Identity and Access (IAM) policy, which specifies access controls for the
   * Document.
   * You can set ACL with condition for projects only.
   * Supported operators are: `=`, `!=`, `&lt;`, `&lt;=`, `&gt;`, and `&gt;=` where
   * the left of the operator is `DocumentSchemaId` or property name and the
   * right of the operator is a number or a quoted string. You must escape
   * backslash (&#92;&#92;) and quote (&#92;") characters.
   * Boolean expressions (AND/OR) are supported up to 3 levels of nesting (for
   * example, "((A AND B AND C) OR D) AND E"), a maximum of 10 comparisons are
   * allowed in the expression. The expression must be &lt; 6000 bytes in length.
   * Sample condition:
   *     `"DocumentSchemaId = &#92;"some schema id&#92;" OR SchemaId.floatPropertyName
   *     &gt;= 10"`
   * </pre>
   *
   * <code>.google.iam.v1.Policy policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The policy.
   */
  com.google.iam.v1.Policy getPolicy();
  /**
   *
   *
   * <pre>
   * Required. REQUIRED: The complete policy to be applied to the `resource`.
   * The size of the policy is limited to a few 10s of KB. This refers to an
   * Identity and Access (IAM) policy, which specifies access controls for the
   * Document.
   * You can set ACL with condition for projects only.
   * Supported operators are: `=`, `!=`, `&lt;`, `&lt;=`, `&gt;`, and `&gt;=` where
   * the left of the operator is `DocumentSchemaId` or property name and the
   * right of the operator is a number or a quoted string. You must escape
   * backslash (&#92;&#92;) and quote (&#92;") characters.
   * Boolean expressions (AND/OR) are supported up to 3 levels of nesting (for
   * example, "((A AND B AND C) OR D) AND E"), a maximum of 10 comparisons are
   * allowed in the expression. The expression must be &lt; 6000 bytes in length.
   * Sample condition:
   *     `"DocumentSchemaId = &#92;"some schema id&#92;" OR SchemaId.floatPropertyName
   *     &gt;= 10"`
   * </pre>
   *
   * <code>.google.iam.v1.Policy policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.iam.v1.PolicyOrBuilder getPolicyOrBuilder();

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
   * For Set Project ACL only. Authorization check for end user will be ignored
   * when project_owner=true.
   * </pre>
   *
   * <code>bool project_owner = 4;</code>
   *
   * @return The projectOwner.
   */
  boolean getProjectOwner();
}
