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

public interface PlaybookInvocationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.PlaybookInvocation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The unique identifier of the playbook.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/playbooks/&lt;Playbook ID&gt;`.
   * </pre>
   *
   * <code>
   * string playbook = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The playbook.
   */
  java.lang.String getPlaybook();
  /**
   *
   *
   * <pre>
   * Required. The unique identifier of the playbook.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/playbooks/&lt;Playbook ID&gt;`.
   * </pre>
   *
   * <code>
   * string playbook = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for playbook.
   */
  com.google.protobuf.ByteString getPlaybookBytes();

  /**
   *
   *
   * <pre>
   * Optional. Input of the child playbook invocation.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.PlaybookInput playbook_input = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the playbookInput field is set.
   */
  boolean hasPlaybookInput();
  /**
   *
   *
   * <pre>
   * Optional. Input of the child playbook invocation.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.PlaybookInput playbook_input = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The playbookInput.
   */
  com.google.cloud.dialogflow.cx.v3beta1.PlaybookInput getPlaybookInput();
  /**
   *
   *
   * <pre>
   * Optional. Input of the child playbook invocation.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.PlaybookInput playbook_input = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.PlaybookInputOrBuilder getPlaybookInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Output of the child playbook invocation.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.PlaybookOutput playbook_output = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the playbookOutput field is set.
   */
  boolean hasPlaybookOutput();
  /**
   *
   *
   * <pre>
   * Optional. Output of the child playbook invocation.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.PlaybookOutput playbook_output = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The playbookOutput.
   */
  com.google.cloud.dialogflow.cx.v3beta1.PlaybookOutput getPlaybookOutput();
  /**
   *
   *
   * <pre>
   * Optional. Output of the child playbook invocation.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.PlaybookOutput playbook_output = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.PlaybookOutputOrBuilder getPlaybookOutputOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Playbook invocation's output state.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.OutputState playbook_state = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for playbookState.
   */
  int getPlaybookStateValue();
  /**
   *
   *
   * <pre>
   * Required. Playbook invocation's output state.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.OutputState playbook_state = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The playbookState.
   */
  com.google.cloud.dialogflow.cx.v3beta1.OutputState getPlaybookState();
}
