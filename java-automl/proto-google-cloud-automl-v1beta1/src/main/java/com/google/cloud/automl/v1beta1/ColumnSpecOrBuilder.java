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
// source: google/cloud/automl/v1beta1/column_spec.proto

package com.google.cloud.automl.v1beta1;

public interface ColumnSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.ColumnSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the column specs.
   * Form:
   * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/tableSpecs/{table_spec_id}/columnSpecs/{column_spec_id}`
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
   * Output only. The resource name of the column specs.
   * Form:
   * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/tableSpecs/{table_spec_id}/columnSpecs/{column_spec_id}`
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
   * The data type of elements stored in the column.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.DataType data_type = 2;</code>
   *
   * @return Whether the dataType field is set.
   */
  boolean hasDataType();
  /**
   *
   *
   * <pre>
   * The data type of elements stored in the column.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.DataType data_type = 2;</code>
   *
   * @return The dataType.
   */
  com.google.cloud.automl.v1beta1.DataType getDataType();
  /**
   *
   *
   * <pre>
   * The data type of elements stored in the column.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.DataType data_type = 2;</code>
   */
  com.google.cloud.automl.v1beta1.DataTypeOrBuilder getDataTypeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The name of the column to show in the interface. The name can
   * be up to 100 characters long and can consist only of ASCII Latin letters
   * A-Z and a-z, ASCII digits 0-9, underscores(_), and forward slashes(/), and
   * must start with a letter or a digit.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Output only. The name of the column to show in the interface. The name can
   * be up to 100 characters long and can consist only of ASCII Latin letters
   * A-Z and a-z, ASCII digits 0-9, underscores(_), and forward slashes(/), and
   * must start with a letter or a digit.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Stats of the series of values in the column.
   * This field may be stale, see the ancestor's
   * Dataset.tables_dataset_metadata.stats_update_time field
   * for the timestamp at which these stats were last updated.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.DataStats data_stats = 4;</code>
   *
   * @return Whether the dataStats field is set.
   */
  boolean hasDataStats();
  /**
   *
   *
   * <pre>
   * Output only. Stats of the series of values in the column.
   * This field may be stale, see the ancestor's
   * Dataset.tables_dataset_metadata.stats_update_time field
   * for the timestamp at which these stats were last updated.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.DataStats data_stats = 4;</code>
   *
   * @return The dataStats.
   */
  com.google.cloud.automl.v1beta1.DataStats getDataStats();
  /**
   *
   *
   * <pre>
   * Output only. Stats of the series of values in the column.
   * This field may be stale, see the ancestor's
   * Dataset.tables_dataset_metadata.stats_update_time field
   * for the timestamp at which these stats were last updated.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.DataStats data_stats = 4;</code>
   */
  com.google.cloud.automl.v1beta1.DataStatsOrBuilder getDataStatsOrBuilder();

  /**
   *
   *
   * <pre>
   * Deprecated.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.automl.v1beta1.ColumnSpec.CorrelatedColumn top_correlated_columns = 5;
   * </code>
   */
  java.util.List<com.google.cloud.automl.v1beta1.ColumnSpec.CorrelatedColumn>
      getTopCorrelatedColumnsList();
  /**
   *
   *
   * <pre>
   * Deprecated.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.automl.v1beta1.ColumnSpec.CorrelatedColumn top_correlated_columns = 5;
   * </code>
   */
  com.google.cloud.automl.v1beta1.ColumnSpec.CorrelatedColumn getTopCorrelatedColumns(int index);
  /**
   *
   *
   * <pre>
   * Deprecated.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.automl.v1beta1.ColumnSpec.CorrelatedColumn top_correlated_columns = 5;
   * </code>
   */
  int getTopCorrelatedColumnsCount();
  /**
   *
   *
   * <pre>
   * Deprecated.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.automl.v1beta1.ColumnSpec.CorrelatedColumn top_correlated_columns = 5;
   * </code>
   */
  java.util.List<? extends com.google.cloud.automl.v1beta1.ColumnSpec.CorrelatedColumnOrBuilder>
      getTopCorrelatedColumnsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Deprecated.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.automl.v1beta1.ColumnSpec.CorrelatedColumn top_correlated_columns = 5;
   * </code>
   */
  com.google.cloud.automl.v1beta1.ColumnSpec.CorrelatedColumnOrBuilder
      getTopCorrelatedColumnsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Used to perform consistent read-modify-write updates. If not set, a blind
   * "overwrite" update happens.
   * </pre>
   *
   * <code>string etag = 6;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Used to perform consistent read-modify-write updates. If not set, a blind
   * "overwrite" update happens.
   * </pre>
   *
   * <code>string etag = 6;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();
}