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
// source: google/cloud/dialogflow/cx/v3beta1/example.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dialogflow.cx.v3beta1;

public interface FlowInvocationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.FlowInvocation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The unique identifier of the flow.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * flows/&lt;Flow ID&gt;`.
   * </pre>
   *
   * <code>
   * string flow = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The flow.
   */
  java.lang.String getFlow();
  /**
   *
   *
   * <pre>
   * Required. The unique identifier of the flow.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * flows/&lt;Flow ID&gt;`.
   * </pre>
   *
   * <code>
   * string flow = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for flow.
   */
  com.google.protobuf.ByteString getFlowBytes();

  /**
   *
   *
   * <pre>
   * A list of input parameters for the flow invocation.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.ActionParameter input_parameters = 2;</code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3beta1.ActionParameter> getInputParametersList();
  /**
   *
   *
   * <pre>
   * A list of input parameters for the flow invocation.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.ActionParameter input_parameters = 2;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.ActionParameter getInputParameters(int index);
  /**
   *
   *
   * <pre>
   * A list of input parameters for the flow invocation.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.ActionParameter input_parameters = 2;</code>
   */
  int getInputParametersCount();
  /**
   *
   *
   * <pre>
   * A list of input parameters for the flow invocation.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.ActionParameter input_parameters = 2;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3beta1.ActionParameterOrBuilder>
      getInputParametersOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of input parameters for the flow invocation.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.ActionParameter input_parameters = 2;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.ActionParameterOrBuilder getInputParametersOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * A list of output parameters generated by the flow invocation.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.ActionParameter output_parameters = 3;
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3beta1.ActionParameter> getOutputParametersList();
  /**
   *
   *
   * <pre>
   * A list of output parameters generated by the flow invocation.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.ActionParameter output_parameters = 3;
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.ActionParameter getOutputParameters(int index);
  /**
   *
   *
   * <pre>
   * A list of output parameters generated by the flow invocation.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.ActionParameter output_parameters = 3;
   * </code>
   */
  int getOutputParametersCount();
  /**
   *
   *
   * <pre>
   * A list of output parameters generated by the flow invocation.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.ActionParameter output_parameters = 3;
   * </code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3beta1.ActionParameterOrBuilder>
      getOutputParametersOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of output parameters generated by the flow invocation.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.ActionParameter output_parameters = 3;
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.ActionParameterOrBuilder getOutputParametersOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Required. Flow invocation's output state.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.OutputState flow_state = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for flowState.
   */
  int getFlowStateValue();
  /**
   *
   *
   * <pre>
   * Required. Flow invocation's output state.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.OutputState flow_state = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The flowState.
   */
  com.google.cloud.dialogflow.cx.v3beta1.OutputState getFlowState();
}
