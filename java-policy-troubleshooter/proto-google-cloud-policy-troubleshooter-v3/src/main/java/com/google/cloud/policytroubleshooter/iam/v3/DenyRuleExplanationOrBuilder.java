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
// source: google/cloud/policytroubleshooter/iam/v3/troubleshooter.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.policytroubleshooter.iam.v3;

public interface DenyRuleExplanationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Indicates whether _this rule_ denies the specified permission to
   * the specified principal for the specified resource.
   *
   * This field does _not_ indicate whether the principal is actually denied on
   * the permission for the resource. There might be another rule that overrides
   * this rule. To determine whether the principal actually has the permission,
   * use the `overall_access_state` field in the
   * [TroubleshootIamPolicyResponse][google.cloud.policytroubleshooter.iam.v3.TroubleshootIamPolicyResponse].
   * </pre>
   *
   * <code>
   * .google.cloud.policytroubleshooter.iam.v3.DenyAccessState deny_access_state = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for denyAccessState.
   */
  int getDenyAccessStateValue();
  /**
   *
   *
   * <pre>
   * Required. Indicates whether _this rule_ denies the specified permission to
   * the specified principal for the specified resource.
   *
   * This field does _not_ indicate whether the principal is actually denied on
   * the permission for the resource. There might be another rule that overrides
   * this rule. To determine whether the principal actually has the permission,
   * use the `overall_access_state` field in the
   * [TroubleshootIamPolicyResponse][google.cloud.policytroubleshooter.iam.v3.TroubleshootIamPolicyResponse].
   * </pre>
   *
   * <code>
   * .google.cloud.policytroubleshooter.iam.v3.DenyAccessState deny_access_state = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The denyAccessState.
   */
  com.google.cloud.policytroubleshooter.iam.v3.DenyAccessState getDenyAccessState();

  /**
   *
   *
   * <pre>
   * Indicates whether the permission in the request is listed as a denied
   * permission in the deny rule.
   * </pre>
   *
   * <code>
   * .google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation.AnnotatedPermissionMatching combined_denied_permission = 2;
   * </code>
   *
   * @return Whether the combinedDeniedPermission field is set.
   */
  boolean hasCombinedDeniedPermission();
  /**
   *
   *
   * <pre>
   * Indicates whether the permission in the request is listed as a denied
   * permission in the deny rule.
   * </pre>
   *
   * <code>
   * .google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation.AnnotatedPermissionMatching combined_denied_permission = 2;
   * </code>
   *
   * @return The combinedDeniedPermission.
   */
  com.google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation.AnnotatedPermissionMatching
      getCombinedDeniedPermission();
  /**
   *
   *
   * <pre>
   * Indicates whether the permission in the request is listed as a denied
   * permission in the deny rule.
   * </pre>
   *
   * <code>
   * .google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation.AnnotatedPermissionMatching combined_denied_permission = 2;
   * </code>
   */
  com.google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation
          .AnnotatedPermissionMatchingOrBuilder
      getCombinedDeniedPermissionOrBuilder();

  /**
   *
   *
   * <pre>
   * Lists all denied permissions in the deny rule and indicates whether each
   * permission matches the permission in the request.
   *
   * Each key identifies a denied permission in the rule, and each value
   * indicates whether the denied permission matches the permission in the
   * request.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation.AnnotatedPermissionMatching&gt; denied_permissions = 3;
   * </code>
   */
  int getDeniedPermissionsCount();
  /**
   *
   *
   * <pre>
   * Lists all denied permissions in the deny rule and indicates whether each
   * permission matches the permission in the request.
   *
   * Each key identifies a denied permission in the rule, and each value
   * indicates whether the denied permission matches the permission in the
   * request.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation.AnnotatedPermissionMatching&gt; denied_permissions = 3;
   * </code>
   */
  boolean containsDeniedPermissions(java.lang.String key);
  /** Use {@link #getDeniedPermissionsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<
          java.lang.String,
          com.google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation
              .AnnotatedPermissionMatching>
      getDeniedPermissions();
  /**
   *
   *
   * <pre>
   * Lists all denied permissions in the deny rule and indicates whether each
   * permission matches the permission in the request.
   *
   * Each key identifies a denied permission in the rule, and each value
   * indicates whether the denied permission matches the permission in the
   * request.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation.AnnotatedPermissionMatching&gt; denied_permissions = 3;
   * </code>
   */
  java.util.Map<
          java.lang.String,
          com.google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation
              .AnnotatedPermissionMatching>
      getDeniedPermissionsMap();
  /**
   *
   *
   * <pre>
   * Lists all denied permissions in the deny rule and indicates whether each
   * permission matches the permission in the request.
   *
   * Each key identifies a denied permission in the rule, and each value
   * indicates whether the denied permission matches the permission in the
   * request.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation.AnnotatedPermissionMatching&gt; denied_permissions = 3;
   * </code>
   */
  /* nullable */
  com.google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation.AnnotatedPermissionMatching
      getDeniedPermissionsOrDefault(
          java.lang.String key,
          /* nullable */
          com.google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation
                  .AnnotatedPermissionMatching
              defaultValue);
  /**
   *
   *
   * <pre>
   * Lists all denied permissions in the deny rule and indicates whether each
   * permission matches the permission in the request.
   *
   * Each key identifies a denied permission in the rule, and each value
   * indicates whether the denied permission matches the permission in the
   * request.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation.AnnotatedPermissionMatching&gt; denied_permissions = 3;
   * </code>
   */
  com.google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation.AnnotatedPermissionMatching
      getDeniedPermissionsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Indicates whether the permission in the request is listed as an exception
   * permission in the deny rule.
   * </pre>
   *
   * <code>
   * .google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation.AnnotatedPermissionMatching combined_exception_permission = 4;
   * </code>
   *
   * @return Whether the combinedExceptionPermission field is set.
   */
  boolean hasCombinedExceptionPermission();
  /**
   *
   *
   * <pre>
   * Indicates whether the permission in the request is listed as an exception
   * permission in the deny rule.
   * </pre>
   *
   * <code>
   * .google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation.AnnotatedPermissionMatching combined_exception_permission = 4;
   * </code>
   *
   * @return The combinedExceptionPermission.
   */
  com.google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation.AnnotatedPermissionMatching
      getCombinedExceptionPermission();
  /**
   *
   *
   * <pre>
   * Indicates whether the permission in the request is listed as an exception
   * permission in the deny rule.
   * </pre>
   *
   * <code>
   * .google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation.AnnotatedPermissionMatching combined_exception_permission = 4;
   * </code>
   */
  com.google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation
          .AnnotatedPermissionMatchingOrBuilder
      getCombinedExceptionPermissionOrBuilder();

  /**
   *
   *
   * <pre>
   * Lists all exception permissions in the deny rule and indicates whether each
   * permission matches the permission in the request.
   *
   * Each key identifies a exception permission in the rule, and each value
   * indicates whether the exception permission matches the permission in the
   * request.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation.AnnotatedPermissionMatching&gt; exception_permissions = 5;
   * </code>
   */
  int getExceptionPermissionsCount();
  /**
   *
   *
   * <pre>
   * Lists all exception permissions in the deny rule and indicates whether each
   * permission matches the permission in the request.
   *
   * Each key identifies a exception permission in the rule, and each value
   * indicates whether the exception permission matches the permission in the
   * request.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation.AnnotatedPermissionMatching&gt; exception_permissions = 5;
   * </code>
   */
  boolean containsExceptionPermissions(java.lang.String key);
  /** Use {@link #getExceptionPermissionsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<
          java.lang.String,
          com.google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation
              .AnnotatedPermissionMatching>
      getExceptionPermissions();
  /**
   *
   *
   * <pre>
   * Lists all exception permissions in the deny rule and indicates whether each
   * permission matches the permission in the request.
   *
   * Each key identifies a exception permission in the rule, and each value
   * indicates whether the exception permission matches the permission in the
   * request.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation.AnnotatedPermissionMatching&gt; exception_permissions = 5;
   * </code>
   */
  java.util.Map<
          java.lang.String,
          com.google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation
              .AnnotatedPermissionMatching>
      getExceptionPermissionsMap();
  /**
   *
   *
   * <pre>
   * Lists all exception permissions in the deny rule and indicates whether each
   * permission matches the permission in the request.
   *
   * Each key identifies a exception permission in the rule, and each value
   * indicates whether the exception permission matches the permission in the
   * request.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation.AnnotatedPermissionMatching&gt; exception_permissions = 5;
   * </code>
   */
  /* nullable */
  com.google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation.AnnotatedPermissionMatching
      getExceptionPermissionsOrDefault(
          java.lang.String key,
          /* nullable */
          com.google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation
                  .AnnotatedPermissionMatching
              defaultValue);
  /**
   *
   *
   * <pre>
   * Lists all exception permissions in the deny rule and indicates whether each
   * permission matches the permission in the request.
   *
   * Each key identifies a exception permission in the rule, and each value
   * indicates whether the exception permission matches the permission in the
   * request.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation.AnnotatedPermissionMatching&gt; exception_permissions = 5;
   * </code>
   */
  com.google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation.AnnotatedPermissionMatching
      getExceptionPermissionsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Indicates whether the principal is listed as a denied principal in the
   * deny rule, either directly or through membership in a principal set.
   * </pre>
   *
   * <code>
   * .google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation.AnnotatedDenyPrincipalMatching combined_denied_principal = 6;
   * </code>
   *
   * @return Whether the combinedDeniedPrincipal field is set.
   */
  boolean hasCombinedDeniedPrincipal();
  /**
   *
   *
   * <pre>
   * Indicates whether the principal is listed as a denied principal in the
   * deny rule, either directly or through membership in a principal set.
   * </pre>
   *
   * <code>
   * .google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation.AnnotatedDenyPrincipalMatching combined_denied_principal = 6;
   * </code>
   *
   * @return The combinedDeniedPrincipal.
   */
  com.google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation.AnnotatedDenyPrincipalMatching
      getCombinedDeniedPrincipal();
  /**
   *
   *
   * <pre>
   * Indicates whether the principal is listed as a denied principal in the
   * deny rule, either directly or through membership in a principal set.
   * </pre>
   *
   * <code>
   * .google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation.AnnotatedDenyPrincipalMatching combined_denied_principal = 6;
   * </code>
   */
  com.google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation
          .AnnotatedDenyPrincipalMatchingOrBuilder
      getCombinedDeniedPrincipalOrBuilder();

  /**
   *
   *
   * <pre>
   * Lists all denied principals in the deny rule and indicates whether each
   * principal matches the principal in the request, either directly or through
   * membership in a principal set.
   *
   * Each key identifies a denied principal in the rule, and each value
   * indicates whether the denied principal matches the principal in the
   * request.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation.AnnotatedDenyPrincipalMatching&gt; denied_principals = 7;
   * </code>
   */
  int getDeniedPrincipalsCount();
  /**
   *
   *
   * <pre>
   * Lists all denied principals in the deny rule and indicates whether each
   * principal matches the principal in the request, either directly or through
   * membership in a principal set.
   *
   * Each key identifies a denied principal in the rule, and each value
   * indicates whether the denied principal matches the principal in the
   * request.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation.AnnotatedDenyPrincipalMatching&gt; denied_principals = 7;
   * </code>
   */
  boolean containsDeniedPrincipals(java.lang.String key);
  /** Use {@link #getDeniedPrincipalsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<
          java.lang.String,
          com.google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation
              .AnnotatedDenyPrincipalMatching>
      getDeniedPrincipals();
  /**
   *
   *
   * <pre>
   * Lists all denied principals in the deny rule and indicates whether each
   * principal matches the principal in the request, either directly or through
   * membership in a principal set.
   *
   * Each key identifies a denied principal in the rule, and each value
   * indicates whether the denied principal matches the principal in the
   * request.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation.AnnotatedDenyPrincipalMatching&gt; denied_principals = 7;
   * </code>
   */
  java.util.Map<
          java.lang.String,
          com.google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation
              .AnnotatedDenyPrincipalMatching>
      getDeniedPrincipalsMap();
  /**
   *
   *
   * <pre>
   * Lists all denied principals in the deny rule and indicates whether each
   * principal matches the principal in the request, either directly or through
   * membership in a principal set.
   *
   * Each key identifies a denied principal in the rule, and each value
   * indicates whether the denied principal matches the principal in the
   * request.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation.AnnotatedDenyPrincipalMatching&gt; denied_principals = 7;
   * </code>
   */
  /* nullable */
  com.google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation.AnnotatedDenyPrincipalMatching
      getDeniedPrincipalsOrDefault(
          java.lang.String key,
          /* nullable */
          com.google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation
                  .AnnotatedDenyPrincipalMatching
              defaultValue);
  /**
   *
   *
   * <pre>
   * Lists all denied principals in the deny rule and indicates whether each
   * principal matches the principal in the request, either directly or through
   * membership in a principal set.
   *
   * Each key identifies a denied principal in the rule, and each value
   * indicates whether the denied principal matches the principal in the
   * request.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation.AnnotatedDenyPrincipalMatching&gt; denied_principals = 7;
   * </code>
   */
  com.google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation.AnnotatedDenyPrincipalMatching
      getDeniedPrincipalsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Indicates whether the principal is listed as an exception principal in the
   * deny rule, either directly or through membership in a principal set.
   * </pre>
   *
   * <code>
   * .google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation.AnnotatedDenyPrincipalMatching combined_exception_principal = 8;
   * </code>
   *
   * @return Whether the combinedExceptionPrincipal field is set.
   */
  boolean hasCombinedExceptionPrincipal();
  /**
   *
   *
   * <pre>
   * Indicates whether the principal is listed as an exception principal in the
   * deny rule, either directly or through membership in a principal set.
   * </pre>
   *
   * <code>
   * .google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation.AnnotatedDenyPrincipalMatching combined_exception_principal = 8;
   * </code>
   *
   * @return The combinedExceptionPrincipal.
   */
  com.google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation.AnnotatedDenyPrincipalMatching
      getCombinedExceptionPrincipal();
  /**
   *
   *
   * <pre>
   * Indicates whether the principal is listed as an exception principal in the
   * deny rule, either directly or through membership in a principal set.
   * </pre>
   *
   * <code>
   * .google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation.AnnotatedDenyPrincipalMatching combined_exception_principal = 8;
   * </code>
   */
  com.google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation
          .AnnotatedDenyPrincipalMatchingOrBuilder
      getCombinedExceptionPrincipalOrBuilder();

  /**
   *
   *
   * <pre>
   * Lists all exception principals in the deny rule and indicates whether each
   * principal matches the principal in the request, either directly or through
   * membership in a principal set.
   *
   * Each key identifies a exception principal in the rule, and each value
   * indicates whether the exception principal matches the principal in the
   * request.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation.AnnotatedDenyPrincipalMatching&gt; exception_principals = 9;
   * </code>
   */
  int getExceptionPrincipalsCount();
  /**
   *
   *
   * <pre>
   * Lists all exception principals in the deny rule and indicates whether each
   * principal matches the principal in the request, either directly or through
   * membership in a principal set.
   *
   * Each key identifies a exception principal in the rule, and each value
   * indicates whether the exception principal matches the principal in the
   * request.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation.AnnotatedDenyPrincipalMatching&gt; exception_principals = 9;
   * </code>
   */
  boolean containsExceptionPrincipals(java.lang.String key);
  /** Use {@link #getExceptionPrincipalsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<
          java.lang.String,
          com.google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation
              .AnnotatedDenyPrincipalMatching>
      getExceptionPrincipals();
  /**
   *
   *
   * <pre>
   * Lists all exception principals in the deny rule and indicates whether each
   * principal matches the principal in the request, either directly or through
   * membership in a principal set.
   *
   * Each key identifies a exception principal in the rule, and each value
   * indicates whether the exception principal matches the principal in the
   * request.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation.AnnotatedDenyPrincipalMatching&gt; exception_principals = 9;
   * </code>
   */
  java.util.Map<
          java.lang.String,
          com.google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation
              .AnnotatedDenyPrincipalMatching>
      getExceptionPrincipalsMap();
  /**
   *
   *
   * <pre>
   * Lists all exception principals in the deny rule and indicates whether each
   * principal matches the principal in the request, either directly or through
   * membership in a principal set.
   *
   * Each key identifies a exception principal in the rule, and each value
   * indicates whether the exception principal matches the principal in the
   * request.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation.AnnotatedDenyPrincipalMatching&gt; exception_principals = 9;
   * </code>
   */
  /* nullable */
  com.google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation.AnnotatedDenyPrincipalMatching
      getExceptionPrincipalsOrDefault(
          java.lang.String key,
          /* nullable */
          com.google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation
                  .AnnotatedDenyPrincipalMatching
              defaultValue);
  /**
   *
   *
   * <pre>
   * Lists all exception principals in the deny rule and indicates whether each
   * principal matches the principal in the request, either directly or through
   * membership in a principal set.
   *
   * Each key identifies a exception principal in the rule, and each value
   * indicates whether the exception principal matches the principal in the
   * request.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation.AnnotatedDenyPrincipalMatching&gt; exception_principals = 9;
   * </code>
   */
  com.google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation.AnnotatedDenyPrincipalMatching
      getExceptionPrincipalsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The relevance of this role binding to the overall determination for the
   * entire policy.
   * </pre>
   *
   * <code>.google.cloud.policytroubleshooter.iam.v3.HeuristicRelevance relevance = 10;</code>
   *
   * @return The enum numeric value on the wire for relevance.
   */
  int getRelevanceValue();
  /**
   *
   *
   * <pre>
   * The relevance of this role binding to the overall determination for the
   * entire policy.
   * </pre>
   *
   * <code>.google.cloud.policytroubleshooter.iam.v3.HeuristicRelevance relevance = 10;</code>
   *
   * @return The relevance.
   */
  com.google.cloud.policytroubleshooter.iam.v3.HeuristicRelevance getRelevance();

  /**
   *
   *
   * <pre>
   * A condition expression that specifies when the deny rule denies the
   * principal access.
   *
   * To learn about IAM Conditions, see
   * https://cloud.google.com/iam/help/conditions/overview.
   * </pre>
   *
   * <code>.google.type.Expr condition = 11;</code>
   *
   * @return Whether the condition field is set.
   */
  boolean hasCondition();
  /**
   *
   *
   * <pre>
   * A condition expression that specifies when the deny rule denies the
   * principal access.
   *
   * To learn about IAM Conditions, see
   * https://cloud.google.com/iam/help/conditions/overview.
   * </pre>
   *
   * <code>.google.type.Expr condition = 11;</code>
   *
   * @return The condition.
   */
  com.google.type.Expr getCondition();
  /**
   *
   *
   * <pre>
   * A condition expression that specifies when the deny rule denies the
   * principal access.
   *
   * To learn about IAM Conditions, see
   * https://cloud.google.com/iam/help/conditions/overview.
   * </pre>
   *
   * <code>.google.type.Expr condition = 11;</code>
   */
  com.google.type.ExprOrBuilder getConditionOrBuilder();

  /**
   *
   *
   * <pre>
   * Condition evaluation state for this role binding.
   * </pre>
   *
   * <code>
   * .google.cloud.policytroubleshooter.iam.v3.ConditionExplanation condition_explanation = 12;
   * </code>
   *
   * @return Whether the conditionExplanation field is set.
   */
  boolean hasConditionExplanation();
  /**
   *
   *
   * <pre>
   * Condition evaluation state for this role binding.
   * </pre>
   *
   * <code>
   * .google.cloud.policytroubleshooter.iam.v3.ConditionExplanation condition_explanation = 12;
   * </code>
   *
   * @return The conditionExplanation.
   */
  com.google.cloud.policytroubleshooter.iam.v3.ConditionExplanation getConditionExplanation();
  /**
   *
   *
   * <pre>
   * Condition evaluation state for this role binding.
   * </pre>
   *
   * <code>
   * .google.cloud.policytroubleshooter.iam.v3.ConditionExplanation condition_explanation = 12;
   * </code>
   */
  com.google.cloud.policytroubleshooter.iam.v3.ConditionExplanationOrBuilder
      getConditionExplanationOrBuilder();
}
