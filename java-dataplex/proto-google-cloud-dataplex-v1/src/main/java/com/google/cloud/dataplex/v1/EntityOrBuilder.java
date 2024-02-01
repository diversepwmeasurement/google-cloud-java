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
// source: google/cloud/dataplex/v1/metadata.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dataplex.v1;

public interface EntityOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.Entity)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the entity, of the form:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}/entities/{id}`.
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
   * Output only. The resource name of the entity, of the form:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}/entities/{id}`.
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
   * Optional. Display name must be shorter than or equal to 256 characters.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Optional. Display name must be shorter than or equal to 256 characters.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. User friendly longer description text. Must be shorter than or
   * equal to 1024 characters.
   * </pre>
   *
   * <code>string description = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. User friendly longer description text. Must be shorter than or
   * equal to 1024 characters.
   * </pre>
   *
   * <code>string description = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time when the entity was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the entity was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the entity was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time when the entity was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the entity was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the entity was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. A user-provided entity ID. It is mutable, and will be used as the
   * published table name. Specifying a new ID in an update entity
   * request will override the existing value.
   * The ID must contain only letters (a-z, A-Z), numbers (0-9), and
   * underscores, and consist of 256 or fewer characters.
   * </pre>
   *
   * <code>string id = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * Required. A user-provided entity ID. It is mutable, and will be used as the
   * published table name. Specifying a new ID in an update entity
   * request will override the existing value.
   * The ID must contain only letters (a-z, A-Z), numbers (0-9), and
   * underscores, and consist of 256 or fewer characters.
   * </pre>
   *
   * <code>string id = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. The etag associated with the entity, which can be retrieved with
   * a [GetEntity][] request. Required for update and delete requests.
   * </pre>
   *
   * <code>string etag = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Optional. The etag associated with the entity, which can be retrieved with
   * a [GetEntity][] request. Required for update and delete requests.
   * </pre>
   *
   * <code>string etag = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * Required. Immutable. The type of entity.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.Entity.Type type = 10 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * Required. Immutable. The type of entity.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.Entity.Type type = 10 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The type.
   */
  com.google.cloud.dataplex.v1.Entity.Type getType();

  /**
   *
   *
   * <pre>
   * Required. Immutable. The ID of the asset associated with the storage
   * location containing the entity data. The entity must be with in the same
   * zone with the asset.
   * </pre>
   *
   * <code>
   * string asset = 11 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The asset.
   */
  java.lang.String getAsset();
  /**
   *
   *
   * <pre>
   * Required. Immutable. The ID of the asset associated with the storage
   * location containing the entity data. The entity must be with in the same
   * zone with the asset.
   * </pre>
   *
   * <code>
   * string asset = 11 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The bytes for asset.
   */
  com.google.protobuf.ByteString getAssetBytes();

  /**
   *
   *
   * <pre>
   * Required. Immutable. The storage path of the entity data.
   * For Cloud Storage data, this is the fully-qualified path to the entity,
   * such as `gs://bucket/path/to/data`. For BigQuery data, this is the name of
   * the table resource, such as
   * `projects/project_id/datasets/dataset_id/tables/table_id`.
   * </pre>
   *
   * <code>
   * string data_path = 12 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The dataPath.
   */
  java.lang.String getDataPath();
  /**
   *
   *
   * <pre>
   * Required. Immutable. The storage path of the entity data.
   * For Cloud Storage data, this is the fully-qualified path to the entity,
   * such as `gs://bucket/path/to/data`. For BigQuery data, this is the name of
   * the table resource, such as
   * `projects/project_id/datasets/dataset_id/tables/table_id`.
   * </pre>
   *
   * <code>
   * string data_path = 12 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The bytes for dataPath.
   */
  com.google.protobuf.ByteString getDataPathBytes();

  /**
   *
   *
   * <pre>
   * Optional. The set of items within the data path constituting the data in
   * the entity, represented as a glob path. Example:
   * `gs://bucket/path/to/data/&#42;*&#47;&#42;.csv`.
   * </pre>
   *
   * <code>string data_path_pattern = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The dataPathPattern.
   */
  java.lang.String getDataPathPattern();
  /**
   *
   *
   * <pre>
   * Optional. The set of items within the data path constituting the data in
   * the entity, represented as a glob path. Example:
   * `gs://bucket/path/to/data/&#42;*&#47;&#42;.csv`.
   * </pre>
   *
   * <code>string data_path_pattern = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for dataPathPattern.
   */
  com.google.protobuf.ByteString getDataPathPatternBytes();

  /**
   *
   *
   * <pre>
   * Output only. The name of the associated Data Catalog entry.
   * </pre>
   *
   * <code>string catalog_entry = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The catalogEntry.
   */
  java.lang.String getCatalogEntry();
  /**
   *
   *
   * <pre>
   * Output only. The name of the associated Data Catalog entry.
   * </pre>
   *
   * <code>string catalog_entry = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for catalogEntry.
   */
  com.google.protobuf.ByteString getCatalogEntryBytes();

  /**
   *
   *
   * <pre>
   * Required. Immutable. Identifies the storage system of the entity data.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.StorageSystem system = 15 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The enum numeric value on the wire for system.
   */
  int getSystemValue();
  /**
   *
   *
   * <pre>
   * Required. Immutable. Identifies the storage system of the entity data.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.StorageSystem system = 15 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The system.
   */
  com.google.cloud.dataplex.v1.StorageSystem getSystem();

  /**
   *
   *
   * <pre>
   * Required. Identifies the storage format of the entity data.
   * It does not apply to entities with data stored in BigQuery.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.StorageFormat format = 16 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the format field is set.
   */
  boolean hasFormat();
  /**
   *
   *
   * <pre>
   * Required. Identifies the storage format of the entity data.
   * It does not apply to entities with data stored in BigQuery.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.StorageFormat format = 16 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The format.
   */
  com.google.cloud.dataplex.v1.StorageFormat getFormat();
  /**
   *
   *
   * <pre>
   * Required. Identifies the storage format of the entity data.
   * It does not apply to entities with data stored in BigQuery.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.StorageFormat format = 16 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dataplex.v1.StorageFormatOrBuilder getFormatOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Metadata stores that the entity is compatible with.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.Entity.CompatibilityStatus compatibility = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the compatibility field is set.
   */
  boolean hasCompatibility();
  /**
   *
   *
   * <pre>
   * Output only. Metadata stores that the entity is compatible with.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.Entity.CompatibilityStatus compatibility = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The compatibility.
   */
  com.google.cloud.dataplex.v1.Entity.CompatibilityStatus getCompatibility();
  /**
   *
   *
   * <pre>
   * Output only. Metadata stores that the entity is compatible with.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.Entity.CompatibilityStatus compatibility = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataplex.v1.Entity.CompatibilityStatusOrBuilder getCompatibilityOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Identifies the access mechanism to the entity. Not user
   * settable.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.StorageAccess access = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the access field is set.
   */
  boolean hasAccess();
  /**
   *
   *
   * <pre>
   * Output only. Identifies the access mechanism to the entity. Not user
   * settable.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.StorageAccess access = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The access.
   */
  com.google.cloud.dataplex.v1.StorageAccess getAccess();
  /**
   *
   *
   * <pre>
   * Output only. Identifies the access mechanism to the entity. Not user
   * settable.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.StorageAccess access = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataplex.v1.StorageAccessOrBuilder getAccessOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. System generated unique ID for the Entity. This ID will be
   * different if the Entity is deleted and re-created with the same name.
   * </pre>
   *
   * <code>string uid = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   *
   *
   * <pre>
   * Output only. System generated unique ID for the Entity. This ID will be
   * different if the Entity is deleted and re-created with the same name.
   * </pre>
   *
   * <code>string uid = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * Required. The description of the data structure and layout.
   * The schema is not included in list responses. It is only included in
   * `SCHEMA` and `FULL` entity views of a `GetEntity` response.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Schema schema = 50 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the schema field is set.
   */
  boolean hasSchema();
  /**
   *
   *
   * <pre>
   * Required. The description of the data structure and layout.
   * The schema is not included in list responses. It is only included in
   * `SCHEMA` and `FULL` entity views of a `GetEntity` response.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Schema schema = 50 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The schema.
   */
  com.google.cloud.dataplex.v1.Schema getSchema();
  /**
   *
   *
   * <pre>
   * Required. The description of the data structure and layout.
   * The schema is not included in list responses. It is only included in
   * `SCHEMA` and `FULL` entity views of a `GetEntity` response.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Schema schema = 50 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dataplex.v1.SchemaOrBuilder getSchemaOrBuilder();
}
