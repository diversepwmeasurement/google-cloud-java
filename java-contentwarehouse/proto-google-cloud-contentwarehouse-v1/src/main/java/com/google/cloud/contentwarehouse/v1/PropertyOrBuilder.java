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
// source: google/cloud/contentwarehouse/v1/document.proto

package com.google.cloud.contentwarehouse.v1;

public interface PropertyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.Property)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Must match the name of a PropertyDefinition in the
   * DocumentSchema.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. Must match the name of a PropertyDefinition in the
   * DocumentSchema.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Integer property values.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.IntegerArray integer_values = 2;</code>
   *
   * @return Whether the integerValues field is set.
   */
  boolean hasIntegerValues();
  /**
   *
   *
   * <pre>
   * Integer property values.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.IntegerArray integer_values = 2;</code>
   *
   * @return The integerValues.
   */
  com.google.cloud.contentwarehouse.v1.IntegerArray getIntegerValues();
  /**
   *
   *
   * <pre>
   * Integer property values.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.IntegerArray integer_values = 2;</code>
   */
  com.google.cloud.contentwarehouse.v1.IntegerArrayOrBuilder getIntegerValuesOrBuilder();

  /**
   *
   *
   * <pre>
   * Float property values.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.FloatArray float_values = 3;</code>
   *
   * @return Whether the floatValues field is set.
   */
  boolean hasFloatValues();
  /**
   *
   *
   * <pre>
   * Float property values.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.FloatArray float_values = 3;</code>
   *
   * @return The floatValues.
   */
  com.google.cloud.contentwarehouse.v1.FloatArray getFloatValues();
  /**
   *
   *
   * <pre>
   * Float property values.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.FloatArray float_values = 3;</code>
   */
  com.google.cloud.contentwarehouse.v1.FloatArrayOrBuilder getFloatValuesOrBuilder();

  /**
   *
   *
   * <pre>
   * String/text property values.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.TextArray text_values = 4;</code>
   *
   * @return Whether the textValues field is set.
   */
  boolean hasTextValues();
  /**
   *
   *
   * <pre>
   * String/text property values.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.TextArray text_values = 4;</code>
   *
   * @return The textValues.
   */
  com.google.cloud.contentwarehouse.v1.TextArray getTextValues();
  /**
   *
   *
   * <pre>
   * String/text property values.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.TextArray text_values = 4;</code>
   */
  com.google.cloud.contentwarehouse.v1.TextArrayOrBuilder getTextValuesOrBuilder();

  /**
   *
   *
   * <pre>
   * Enum property values.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.EnumArray enum_values = 5;</code>
   *
   * @return Whether the enumValues field is set.
   */
  boolean hasEnumValues();
  /**
   *
   *
   * <pre>
   * Enum property values.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.EnumArray enum_values = 5;</code>
   *
   * @return The enumValues.
   */
  com.google.cloud.contentwarehouse.v1.EnumArray getEnumValues();
  /**
   *
   *
   * <pre>
   * Enum property values.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.EnumArray enum_values = 5;</code>
   */
  com.google.cloud.contentwarehouse.v1.EnumArrayOrBuilder getEnumValuesOrBuilder();

  /**
   *
   *
   * <pre>
   * Nested structured data property values.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.PropertyArray property_values = 6;</code>
   *
   * @return Whether the propertyValues field is set.
   */
  boolean hasPropertyValues();
  /**
   *
   *
   * <pre>
   * Nested structured data property values.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.PropertyArray property_values = 6;</code>
   *
   * @return The propertyValues.
   */
  com.google.cloud.contentwarehouse.v1.PropertyArray getPropertyValues();
  /**
   *
   *
   * <pre>
   * Nested structured data property values.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.PropertyArray property_values = 6;</code>
   */
  com.google.cloud.contentwarehouse.v1.PropertyArrayOrBuilder getPropertyValuesOrBuilder();

  /**
   *
   *
   * <pre>
   * Date time property values.
   * It is not supported by CMEK compliant deployment.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.DateTimeArray date_time_values = 7;</code>
   *
   * @return Whether the dateTimeValues field is set.
   */
  boolean hasDateTimeValues();
  /**
   *
   *
   * <pre>
   * Date time property values.
   * It is not supported by CMEK compliant deployment.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.DateTimeArray date_time_values = 7;</code>
   *
   * @return The dateTimeValues.
   */
  com.google.cloud.contentwarehouse.v1.DateTimeArray getDateTimeValues();
  /**
   *
   *
   * <pre>
   * Date time property values.
   * It is not supported by CMEK compliant deployment.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.DateTimeArray date_time_values = 7;</code>
   */
  com.google.cloud.contentwarehouse.v1.DateTimeArrayOrBuilder getDateTimeValuesOrBuilder();

  /**
   *
   *
   * <pre>
   * Map property values.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.MapProperty map_property = 8;</code>
   *
   * @return Whether the mapProperty field is set.
   */
  boolean hasMapProperty();
  /**
   *
   *
   * <pre>
   * Map property values.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.MapProperty map_property = 8;</code>
   *
   * @return The mapProperty.
   */
  com.google.cloud.contentwarehouse.v1.MapProperty getMapProperty();
  /**
   *
   *
   * <pre>
   * Map property values.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.MapProperty map_property = 8;</code>
   */
  com.google.cloud.contentwarehouse.v1.MapPropertyOrBuilder getMapPropertyOrBuilder();

  /**
   *
   *
   * <pre>
   * Timestamp property values.
   * It is not supported by CMEK compliant deployment.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.TimestampArray timestamp_values = 9;</code>
   *
   * @return Whether the timestampValues field is set.
   */
  boolean hasTimestampValues();
  /**
   *
   *
   * <pre>
   * Timestamp property values.
   * It is not supported by CMEK compliant deployment.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.TimestampArray timestamp_values = 9;</code>
   *
   * @return The timestampValues.
   */
  com.google.cloud.contentwarehouse.v1.TimestampArray getTimestampValues();
  /**
   *
   *
   * <pre>
   * Timestamp property values.
   * It is not supported by CMEK compliant deployment.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.TimestampArray timestamp_values = 9;</code>
   */
  com.google.cloud.contentwarehouse.v1.TimestampArrayOrBuilder getTimestampValuesOrBuilder();

  public com.google.cloud.contentwarehouse.v1.Property.ValuesCase getValuesCase();
}
