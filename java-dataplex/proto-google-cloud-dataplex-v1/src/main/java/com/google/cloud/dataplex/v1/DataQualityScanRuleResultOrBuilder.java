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
// source: google/cloud/dataplex/v1/logs.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dataplex.v1;

public interface DataQualityScanRuleResultOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.DataQualityScanRuleResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier of the specific data scan job this log entry is for.
   * </pre>
   *
   * <code>string job_id = 1;</code>
   *
   * @return The jobId.
   */
  java.lang.String getJobId();
  /**
   *
   *
   * <pre>
   * Identifier of the specific data scan job this log entry is for.
   * </pre>
   *
   * <code>string job_id = 1;</code>
   *
   * @return The bytes for jobId.
   */
  com.google.protobuf.ByteString getJobIdBytes();

  /**
   *
   *
   * <pre>
   * The data source of the data scan (e.g. BigQuery table name).
   * </pre>
   *
   * <code>string data_source = 2;</code>
   *
   * @return The dataSource.
   */
  java.lang.String getDataSource();
  /**
   *
   *
   * <pre>
   * The data source of the data scan (e.g. BigQuery table name).
   * </pre>
   *
   * <code>string data_source = 2;</code>
   *
   * @return The bytes for dataSource.
   */
  com.google.protobuf.ByteString getDataSourceBytes();

  /**
   *
   *
   * <pre>
   * The column which this rule is evaluated against.
   * </pre>
   *
   * <code>string column = 3;</code>
   *
   * @return The column.
   */
  java.lang.String getColumn();
  /**
   *
   *
   * <pre>
   * The column which this rule is evaluated against.
   * </pre>
   *
   * <code>string column = 3;</code>
   *
   * @return The bytes for column.
   */
  com.google.protobuf.ByteString getColumnBytes();

  /**
   *
   *
   * <pre>
   * The name of the data quality rule.
   * </pre>
   *
   * <code>string rule_name = 4;</code>
   *
   * @return The ruleName.
   */
  java.lang.String getRuleName();
  /**
   *
   *
   * <pre>
   * The name of the data quality rule.
   * </pre>
   *
   * <code>string rule_name = 4;</code>
   *
   * @return The bytes for ruleName.
   */
  com.google.protobuf.ByteString getRuleNameBytes();

  /**
   *
   *
   * <pre>
   * The type of the data quality rule.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataQualityScanRuleResult.RuleType rule_type = 5;</code>
   *
   * @return The enum numeric value on the wire for ruleType.
   */
  int getRuleTypeValue();
  /**
   *
   *
   * <pre>
   * The type of the data quality rule.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataQualityScanRuleResult.RuleType rule_type = 5;</code>
   *
   * @return The ruleType.
   */
  com.google.cloud.dataplex.v1.DataQualityScanRuleResult.RuleType getRuleType();

  /**
   *
   *
   * <pre>
   * The evaluation type of the data quality rule.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataQualityScanRuleResult.EvaluationType evalution_type = 6;
   * </code>
   *
   * @return The enum numeric value on the wire for evalutionType.
   */
  int getEvalutionTypeValue();
  /**
   *
   *
   * <pre>
   * The evaluation type of the data quality rule.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataQualityScanRuleResult.EvaluationType evalution_type = 6;
   * </code>
   *
   * @return The evalutionType.
   */
  com.google.cloud.dataplex.v1.DataQualityScanRuleResult.EvaluationType getEvalutionType();

  /**
   *
   *
   * <pre>
   * The dimension of the data quality rule.
   * </pre>
   *
   * <code>string rule_dimension = 7;</code>
   *
   * @return The ruleDimension.
   */
  java.lang.String getRuleDimension();
  /**
   *
   *
   * <pre>
   * The dimension of the data quality rule.
   * </pre>
   *
   * <code>string rule_dimension = 7;</code>
   *
   * @return The bytes for ruleDimension.
   */
  com.google.protobuf.ByteString getRuleDimensionBytes();

  /**
   *
   *
   * <pre>
   * The passing threshold ([0.0, 100.0]) of the data quality rule.
   * </pre>
   *
   * <code>double threshold_percent = 8;</code>
   *
   * @return The thresholdPercent.
   */
  double getThresholdPercent();

  /**
   *
   *
   * <pre>
   * The result of the data quality rule.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataQualityScanRuleResult.Result result = 9;</code>
   *
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   *
   *
   * <pre>
   * The result of the data quality rule.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataQualityScanRuleResult.Result result = 9;</code>
   *
   * @return The result.
   */
  com.google.cloud.dataplex.v1.DataQualityScanRuleResult.Result getResult();

  /**
   *
   *
   * <pre>
   * The number of rows evaluated against the data quality rule.
   * This field is only valid for rules of PER_ROW evaluation type.
   * </pre>
   *
   * <code>int64 evaluated_row_count = 10;</code>
   *
   * @return The evaluatedRowCount.
   */
  long getEvaluatedRowCount();

  /**
   *
   *
   * <pre>
   * The number of rows which passed a rule evaluation.
   * This field is only valid for rules of PER_ROW evaluation type.
   * </pre>
   *
   * <code>int64 passed_row_count = 11;</code>
   *
   * @return The passedRowCount.
   */
  long getPassedRowCount();

  /**
   *
   *
   * <pre>
   * The number of rows with null values in the specified column.
   * </pre>
   *
   * <code>int64 null_row_count = 12;</code>
   *
   * @return The nullRowCount.
   */
  long getNullRowCount();
}
