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
// source: google/chat/v1/space.proto

// Protobuf Java Version: 3.25.2
package com.google.chat.v1;

public interface UpdateSpaceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.chat.v1.UpdateSpaceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Space with fields to be updated. `Space.name` must be
   * populated in the form of `spaces/{space}`. Only fields
   * specified by `update_mask` are updated.
   * </pre>
   *
   * <code>.google.chat.v1.Space space = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the space field is set.
   */
  boolean hasSpace();
  /**
   *
   *
   * <pre>
   * Required. Space with fields to be updated. `Space.name` must be
   * populated in the form of `spaces/{space}`. Only fields
   * specified by `update_mask` are updated.
   * </pre>
   *
   * <code>.google.chat.v1.Space space = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The space.
   */
  com.google.chat.v1.Space getSpace();
  /**
   *
   *
   * <pre>
   * Required. Space with fields to be updated. `Space.name` must be
   * populated in the form of `spaces/{space}`. Only fields
   * specified by `update_mask` are updated.
   * </pre>
   *
   * <code>.google.chat.v1.Space space = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.chat.v1.SpaceOrBuilder getSpaceOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The updated field paths, comma separated if there are
   * multiple.
   *
   * Currently supported field paths:
   *
   * - `display_name` (Only supports changing the display name of a space with
   * the `SPACE` type, or when also including the `space_type` mask to change a
   * `GROUP_CHAT` space type to `SPACE`. Trying to update the display name of a
   * `GROUP_CHAT` or a `DIRECT_MESSAGE` space results in an invalid argument
   * error. If you receive the error message `ALREADY_EXISTS` when updating the
   * `displayName`, try a different `displayName`. An existing space within the
   * Google Workspace organization might already use this display name.)
   *
   * - `space_type` (Only supports changing a `GROUP_CHAT` space type to
   * `SPACE`. Include `display_name` together
   * with `space_type` in the update mask and ensure that the specified space
   * has a non-empty display name and the `SPACE` space type. Including the
   * `space_type` mask and the `SPACE` type in the specified space when updating
   * the display name is optional if the existing space already has the `SPACE`
   * type. Trying to update the space type in other ways results in an invalid
   * argument error).
   *
   * - `space_details`
   *
   * - `space_history_state` (Supports [turning history on or off for the
   * space](https://support.google.com/chat/answer/7664687) if [the organization
   * allows users to change their history
   * setting](https://support.google.com/a/answer/7664184).
   * Warning: mutually exclusive with all other field paths.)
   *
   * - Developer Preview: `access_settings.audience` (Supports changing the
   * [access setting](https://support.google.com/chat/answer/11971020) of a
   * space. If no audience is specified in the access setting, the space's
   * access setting is updated to restricted. Warning: mutually exclusive with
   * all other field paths.)
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The updated field paths, comma separated if there are
   * multiple.
   *
   * Currently supported field paths:
   *
   * - `display_name` (Only supports changing the display name of a space with
   * the `SPACE` type, or when also including the `space_type` mask to change a
   * `GROUP_CHAT` space type to `SPACE`. Trying to update the display name of a
   * `GROUP_CHAT` or a `DIRECT_MESSAGE` space results in an invalid argument
   * error. If you receive the error message `ALREADY_EXISTS` when updating the
   * `displayName`, try a different `displayName`. An existing space within the
   * Google Workspace organization might already use this display name.)
   *
   * - `space_type` (Only supports changing a `GROUP_CHAT` space type to
   * `SPACE`. Include `display_name` together
   * with `space_type` in the update mask and ensure that the specified space
   * has a non-empty display name and the `SPACE` space type. Including the
   * `space_type` mask and the `SPACE` type in the specified space when updating
   * the display name is optional if the existing space already has the `SPACE`
   * type. Trying to update the space type in other ways results in an invalid
   * argument error).
   *
   * - `space_details`
   *
   * - `space_history_state` (Supports [turning history on or off for the
   * space](https://support.google.com/chat/answer/7664687) if [the organization
   * allows users to change their history
   * setting](https://support.google.com/a/answer/7664184).
   * Warning: mutually exclusive with all other field paths.)
   *
   * - Developer Preview: `access_settings.audience` (Supports changing the
   * [access setting](https://support.google.com/chat/answer/11971020) of a
   * space. If no audience is specified in the access setting, the space's
   * access setting is updated to restricted. Warning: mutually exclusive with
   * all other field paths.)
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The updated field paths, comma separated if there are
   * multiple.
   *
   * Currently supported field paths:
   *
   * - `display_name` (Only supports changing the display name of a space with
   * the `SPACE` type, or when also including the `space_type` mask to change a
   * `GROUP_CHAT` space type to `SPACE`. Trying to update the display name of a
   * `GROUP_CHAT` or a `DIRECT_MESSAGE` space results in an invalid argument
   * error. If you receive the error message `ALREADY_EXISTS` when updating the
   * `displayName`, try a different `displayName`. An existing space within the
   * Google Workspace organization might already use this display name.)
   *
   * - `space_type` (Only supports changing a `GROUP_CHAT` space type to
   * `SPACE`. Include `display_name` together
   * with `space_type` in the update mask and ensure that the specified space
   * has a non-empty display name and the `SPACE` space type. Including the
   * `space_type` mask and the `SPACE` type in the specified space when updating
   * the display name is optional if the existing space already has the `SPACE`
   * type. Trying to update the space type in other ways results in an invalid
   * argument error).
   *
   * - `space_details`
   *
   * - `space_history_state` (Supports [turning history on or off for the
   * space](https://support.google.com/chat/answer/7664687) if [the organization
   * allows users to change their history
   * setting](https://support.google.com/a/answer/7664184).
   * Warning: mutually exclusive with all other field paths.)
   *
   * - Developer Preview: `access_settings.audience` (Supports changing the
   * [access setting](https://support.google.com/chat/answer/11971020) of a
   * space. If no audience is specified in the access setting, the space's
   * access setting is updated to restricted. Warning: mutually exclusive with
   * all other field paths.)
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
