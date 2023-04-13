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
// source: google/cloud/bigquery/biglake/v1/metastore.proto

package com.google.cloud.bigquery.biglake.v1;

public interface TableOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.biglake.v1.Table)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Options of a Hive table.
   * </pre>
   *
   * <code>.google.cloud.bigquery.biglake.v1.HiveTableOptions hive_options = 7;</code>
   *
   * @return Whether the hiveOptions field is set.
   */
  boolean hasHiveOptions();
  /**
   *
   *
   * <pre>
   * Options of a Hive table.
   * </pre>
   *
   * <code>.google.cloud.bigquery.biglake.v1.HiveTableOptions hive_options = 7;</code>
   *
   * @return The hiveOptions.
   */
  com.google.cloud.bigquery.biglake.v1.HiveTableOptions getHiveOptions();
  /**
   *
   *
   * <pre>
   * Options of a Hive table.
   * </pre>
   *
   * <code>.google.cloud.bigquery.biglake.v1.HiveTableOptions hive_options = 7;</code>
   */
  com.google.cloud.bigquery.biglake.v1.HiveTableOptionsOrBuilder getHiveOptionsOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The resource name.
   * Format:
   * projects/{project_id_or_number}/locations/{location_id}/catalogs/{catalog_id}/databases/{database_id}/tables/{table_id}
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The resource name.
   * Format:
   * projects/{project_id_or_number}/locations/{location_id}/catalogs/{catalog_id}/databases/{database_id}/tables/{table_id}
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The creation time of the table.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The creation time of the table.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The creation time of the table.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The last modification time of the table.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last modification time of the table.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last modification time of the table.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The deletion time of the table. Only set after the table is
   * deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the deleteTime field is set.
   */
  boolean hasDeleteTime();
  /**
   *
   *
   * <pre>
   * Output only. The deletion time of the table. Only set after the table is
   * deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The deleteTime.
   */
  com.google.protobuf.Timestamp getDeleteTime();
  /**
   *
   *
   * <pre>
   * Output only. The deletion time of the table. Only set after the table is
   * deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getDeleteTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time when this table is considered expired. Only set after
   * the table is deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the expireTime field is set.
   */
  boolean hasExpireTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when this table is considered expired. Only set after
   * the table is deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The expireTime.
   */
  com.google.protobuf.Timestamp getExpireTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when this table is considered expired. Only set after
   * the table is deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getExpireTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The table type.
   * </pre>
   *
   * <code>.google.cloud.bigquery.biglake.v1.Table.Type type = 6;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * The table type.
   * </pre>
   *
   * <code>.google.cloud.bigquery.biglake.v1.Table.Type type = 6;</code>
   *
   * @return The type.
   */
  com.google.cloud.bigquery.biglake.v1.Table.Type getType();

  /**
   *
   *
   * <pre>
   * The checksum of a table object computed by the server based on the value of
   * other fields. It may be sent on update requests to ensure the client has an
   * up-to-date value before proceeding. It is only checked for update table
   * operations.
   * </pre>
   *
   * <code>string etag = 8;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * The checksum of a table object computed by the server based on the value of
   * other fields. It may be sent on update requests to ensure the client has an
   * up-to-date value before proceeding. It is only checked for update table
   * operations.
   * </pre>
   *
   * <code>string etag = 8;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  public com.google.cloud.bigquery.biglake.v1.Table.OptionsCase getOptionsCase();
}
