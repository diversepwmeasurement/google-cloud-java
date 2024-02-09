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

public interface ExampleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.Example)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The unique identifier of the playbook example.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/playbooks/&lt;Playbook ID&gt;/examples/&lt;Example ID&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The unique identifier of the playbook example.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/playbooks/&lt;Playbook ID&gt;/examples/&lt;Example ID&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The input to the playbook in the example.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.PlaybookInput playbook_input = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the playbookInput field is set.
   */
  boolean hasPlaybookInput();
  /**
   *
   *
   * <pre>
   * Optional. The input to the playbook in the example.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.PlaybookInput playbook_input = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The playbookInput.
   */
  com.google.cloud.dialogflow.cx.v3beta1.PlaybookInput getPlaybookInput();
  /**
   *
   *
   * <pre>
   * Optional. The input to the playbook in the example.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.PlaybookInput playbook_input = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.PlaybookInputOrBuilder getPlaybookInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The output of the playbook in the example.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.PlaybookOutput playbook_output = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the playbookOutput field is set.
   */
  boolean hasPlaybookOutput();
  /**
   *
   *
   * <pre>
   * Optional. The output of the playbook in the example.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.PlaybookOutput playbook_output = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The playbookOutput.
   */
  com.google.cloud.dialogflow.cx.v3beta1.PlaybookOutput getPlaybookOutput();
  /**
   *
   *
   * <pre>
   * Optional. The output of the playbook in the example.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.PlaybookOutput playbook_output = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.PlaybookOutputOrBuilder getPlaybookOutputOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The ordered list of actions performed by the end user and the
   * Dialogflow agent.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.Action actions = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3beta1.Action> getActionsList();
  /**
   *
   *
   * <pre>
   * Required. The ordered list of actions performed by the end user and the
   * Dialogflow agent.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.Action actions = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.Action getActions(int index);
  /**
   *
   *
   * <pre>
   * Required. The ordered list of actions performed by the end user and the
   * Dialogflow agent.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.Action actions = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getActionsCount();
  /**
   *
   *
   * <pre>
   * Required. The ordered list of actions performed by the end user and the
   * Dialogflow agent.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.Action actions = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3beta1.ActionOrBuilder>
      getActionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. The ordered list of actions performed by the end user and the
   * Dialogflow agent.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.Action actions = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.ActionOrBuilder getActionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Required. The display name of the example.
   * </pre>
   *
   * <code>string display_name = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. The display name of the example.
   * </pre>
   *
   * <code>string display_name = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The high level concise description of the example. The max number
   * of characters is 200.
   * </pre>
   *
   * <code>string description = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. The high level concise description of the example. The max number
   * of characters is 200.
   * </pre>
   *
   * <code>string description = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. Estimated number of tokes current example takes when sent to
   * the LLM.
   * </pre>
   *
   * <code>int64 token_count = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The tokenCount.
   */
  long getTokenCount();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp of initial example creation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp of initial example creation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp of initial example creation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Last time the example was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Last time the example was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Last time the example was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Example's output state.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.OutputState conversation_state = 12 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for conversationState.
   */
  int getConversationStateValue();
  /**
   *
   *
   * <pre>
   * Required. Example's output state.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.OutputState conversation_state = 12 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The conversationState.
   */
  com.google.cloud.dialogflow.cx.v3beta1.OutputState getConversationState();

  /**
   *
   *
   * <pre>
   * Optional. The language code of the example.
   * If not specified, the agent's default language is used.
   * Note: languages must be enabled in the agent before they can be used.
   * </pre>
   *
   * <code>string language_code = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * Optional. The language code of the example.
   * If not specified, the agent's default language is used.
   * Note: languages must be enabled in the agent before they can be used.
   * </pre>
   *
   * <code>string language_code = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();
}
