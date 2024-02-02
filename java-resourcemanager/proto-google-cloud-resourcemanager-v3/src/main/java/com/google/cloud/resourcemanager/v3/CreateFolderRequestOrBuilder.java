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
// source: google/cloud/resourcemanager/v3/folders.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.resourcemanager.v3;

public interface CreateFolderRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.resourcemanager.v3.CreateFolderRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The folder being created, only the display name and parent will
   * be consulted. All other fields will be ignored.
   * </pre>
   *
   * <code>
   * .google.cloud.resourcemanager.v3.Folder folder = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the folder field is set.
   */
  boolean hasFolder();
  /**
   *
   *
   * <pre>
   * Required. The folder being created, only the display name and parent will
   * be consulted. All other fields will be ignored.
   * </pre>
   *
   * <code>
   * .google.cloud.resourcemanager.v3.Folder folder = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The folder.
   */
  com.google.cloud.resourcemanager.v3.Folder getFolder();
  /**
   *
   *
   * <pre>
   * Required. The folder being created, only the display name and parent will
   * be consulted. All other fields will be ignored.
   * </pre>
   *
   * <code>
   * .google.cloud.resourcemanager.v3.Folder folder = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.resourcemanager.v3.FolderOrBuilder getFolderOrBuilder();
}
