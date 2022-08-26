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
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

package com.google.cloudbuild.v1;

public interface PullRequestFilterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v1.PullRequestFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Regex of branches to match.
   * The syntax of the regular expressions accepted is the syntax accepted by
   * RE2 and described at https://github.com/google/re2/wiki/Syntax
   * </pre>
   *
   * <code>string branch = 2;</code>
   *
   * @return Whether the branch field is set.
   */
  boolean hasBranch();
  /**
   *
   *
   * <pre>
   * Regex of branches to match.
   * The syntax of the regular expressions accepted is the syntax accepted by
   * RE2 and described at https://github.com/google/re2/wiki/Syntax
   * </pre>
   *
   * <code>string branch = 2;</code>
   *
   * @return The branch.
   */
  java.lang.String getBranch();
  /**
   *
   *
   * <pre>
   * Regex of branches to match.
   * The syntax of the regular expressions accepted is the syntax accepted by
   * RE2 and described at https://github.com/google/re2/wiki/Syntax
   * </pre>
   *
   * <code>string branch = 2;</code>
   *
   * @return The bytes for branch.
   */
  com.google.protobuf.ByteString getBranchBytes();

  /**
   *
   *
   * <pre>
   * Configure builds to run whether a repository owner or collaborator need to
   * comment `/gcbrun`.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.PullRequestFilter.CommentControl comment_control = 5;
   * </code>
   *
   * @return The enum numeric value on the wire for commentControl.
   */
  int getCommentControlValue();
  /**
   *
   *
   * <pre>
   * Configure builds to run whether a repository owner or collaborator need to
   * comment `/gcbrun`.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.PullRequestFilter.CommentControl comment_control = 5;
   * </code>
   *
   * @return The commentControl.
   */
  com.google.cloudbuild.v1.PullRequestFilter.CommentControl getCommentControl();

  /**
   *
   *
   * <pre>
   * If true, branches that do NOT match the git_ref will trigger a build.
   * </pre>
   *
   * <code>bool invert_regex = 6;</code>
   *
   * @return The invertRegex.
   */
  boolean getInvertRegex();

  public com.google.cloudbuild.v1.PullRequestFilter.GitRefCase getGitRefCase();
}