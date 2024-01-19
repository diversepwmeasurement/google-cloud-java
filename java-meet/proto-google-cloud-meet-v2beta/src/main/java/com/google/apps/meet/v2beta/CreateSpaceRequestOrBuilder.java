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
// source: google/apps/meet/v2beta/service.proto

package com.google.apps.meet.v2beta;

public interface CreateSpaceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.apps.meet.v2beta.CreateSpaceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Space to be created. As of May 2023, the input space can be empty. Later on
   * the input space can be non-empty when space configuration is introduced.
   * </pre>
   *
   * <code>.google.apps.meet.v2beta.Space space = 1;</code>
   *
   * @return Whether the space field is set.
   */
  boolean hasSpace();
  /**
   *
   *
   * <pre>
   * Space to be created. As of May 2023, the input space can be empty. Later on
   * the input space can be non-empty when space configuration is introduced.
   * </pre>
   *
   * <code>.google.apps.meet.v2beta.Space space = 1;</code>
   *
   * @return The space.
   */
  com.google.apps.meet.v2beta.Space getSpace();
  /**
   *
   *
   * <pre>
   * Space to be created. As of May 2023, the input space can be empty. Later on
   * the input space can be non-empty when space configuration is introduced.
   * </pre>
   *
   * <code>.google.apps.meet.v2beta.Space space = 1;</code>
   */
  com.google.apps.meet.v2beta.SpaceOrBuilder getSpaceOrBuilder();
}
