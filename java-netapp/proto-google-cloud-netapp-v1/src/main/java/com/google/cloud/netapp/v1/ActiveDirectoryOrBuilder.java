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
// source: google/cloud/netapp/v1/active_directory.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.netapp.v1;

public interface ActiveDirectoryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.netapp.v1.ActiveDirectory)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. The resource name of the active directory.
   * Format:
   * `projects/{project_number}/locations/{location_id}/activeDirectories/{active_directory_id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Identifier. The resource name of the active directory.
   * Format:
   * `projects/{project_number}/locations/{location_id}/activeDirectories/{active_directory_id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Create time of the active directory.
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
   * Output only. Create time of the active directory.
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
   * Output only. Create time of the active directory.
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
   * Output only. The state of the AD.
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.ActiveDirectory.State state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The state of the AD.
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.ActiveDirectory.State state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.netapp.v1.ActiveDirectory.State getState();

  /**
   *
   *
   * <pre>
   * Required. Name of the Active Directory domain
   * </pre>
   *
   * <code>string domain = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The domain.
   */
  java.lang.String getDomain();
  /**
   *
   *
   * <pre>
   * Required. Name of the Active Directory domain
   * </pre>
   *
   * <code>string domain = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for domain.
   */
  com.google.protobuf.ByteString getDomainBytes();

  /**
   *
   *
   * <pre>
   * The Active Directory site the service will limit Domain Controller
   * discovery too.
   * </pre>
   *
   * <code>string site = 5;</code>
   *
   * @return The site.
   */
  java.lang.String getSite();
  /**
   *
   *
   * <pre>
   * The Active Directory site the service will limit Domain Controller
   * discovery too.
   * </pre>
   *
   * <code>string site = 5;</code>
   *
   * @return The bytes for site.
   */
  com.google.protobuf.ByteString getSiteBytes();

  /**
   *
   *
   * <pre>
   * Required. Comma separated list of DNS server IP addresses for the Active
   * Directory domain.
   * </pre>
   *
   * <code>string dns = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The dns.
   */
  java.lang.String getDns();
  /**
   *
   *
   * <pre>
   * Required. Comma separated list of DNS server IP addresses for the Active
   * Directory domain.
   * </pre>
   *
   * <code>string dns = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for dns.
   */
  com.google.protobuf.ByteString getDnsBytes();

  /**
   *
   *
   * <pre>
   * Required. NetBIOSPrefix is used as a prefix for SMB server name.
   * </pre>
   *
   * <code>string net_bios_prefix = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The netBiosPrefix.
   */
  java.lang.String getNetBiosPrefix();
  /**
   *
   *
   * <pre>
   * Required. NetBIOSPrefix is used as a prefix for SMB server name.
   * </pre>
   *
   * <code>string net_bios_prefix = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for netBiosPrefix.
   */
  com.google.protobuf.ByteString getNetBiosPrefixBytes();

  /**
   *
   *
   * <pre>
   * The Organizational Unit (OU) within the Windows Active Directory the user
   * belongs to.
   * </pre>
   *
   * <code>string organizational_unit = 8;</code>
   *
   * @return The organizationalUnit.
   */
  java.lang.String getOrganizationalUnit();
  /**
   *
   *
   * <pre>
   * The Organizational Unit (OU) within the Windows Active Directory the user
   * belongs to.
   * </pre>
   *
   * <code>string organizational_unit = 8;</code>
   *
   * @return The bytes for organizationalUnit.
   */
  com.google.protobuf.ByteString getOrganizationalUnitBytes();

  /**
   *
   *
   * <pre>
   * If enabled, AES encryption will be enabled for SMB communication.
   * </pre>
   *
   * <code>bool aes_encryption = 9;</code>
   *
   * @return The aesEncryption.
   */
  boolean getAesEncryption();

  /**
   *
   *
   * <pre>
   * Required. Username of the Active Directory domain administrator.
   * </pre>
   *
   * <code>string username = 10 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The username.
   */
  java.lang.String getUsername();
  /**
   *
   *
   * <pre>
   * Required. Username of the Active Directory domain administrator.
   * </pre>
   *
   * <code>string username = 10 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for username.
   */
  com.google.protobuf.ByteString getUsernameBytes();

  /**
   *
   *
   * <pre>
   * Required. Password of the Active Directory domain administrator.
   * </pre>
   *
   * <code>string password = 11 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The password.
   */
  java.lang.String getPassword();
  /**
   *
   *
   * <pre>
   * Required. Password of the Active Directory domain administrator.
   * </pre>
   *
   * <code>string password = 11 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for password.
   */
  com.google.protobuf.ByteString getPasswordBytes();

  /**
   *
   *
   * <pre>
   * Optional. Users to be added to the Built-in Backup Operator active
   * directory group.
   * </pre>
   *
   * <code>repeated string backup_operators = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the backupOperators.
   */
  java.util.List<java.lang.String> getBackupOperatorsList();
  /**
   *
   *
   * <pre>
   * Optional. Users to be added to the Built-in Backup Operator active
   * directory group.
   * </pre>
   *
   * <code>repeated string backup_operators = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of backupOperators.
   */
  int getBackupOperatorsCount();
  /**
   *
   *
   * <pre>
   * Optional. Users to be added to the Built-in Backup Operator active
   * directory group.
   * </pre>
   *
   * <code>repeated string backup_operators = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The backupOperators at the given index.
   */
  java.lang.String getBackupOperators(int index);
  /**
   *
   *
   * <pre>
   * Optional. Users to be added to the Built-in Backup Operator active
   * directory group.
   * </pre>
   *
   * <code>repeated string backup_operators = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the backupOperators at the given index.
   */
  com.google.protobuf.ByteString getBackupOperatorsBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. Domain users to be given the SeSecurityPrivilege.
   * </pre>
   *
   * <code>repeated string security_operators = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the securityOperators.
   */
  java.util.List<java.lang.String> getSecurityOperatorsList();
  /**
   *
   *
   * <pre>
   * Optional. Domain users to be given the SeSecurityPrivilege.
   * </pre>
   *
   * <code>repeated string security_operators = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of securityOperators.
   */
  int getSecurityOperatorsCount();
  /**
   *
   *
   * <pre>
   * Optional. Domain users to be given the SeSecurityPrivilege.
   * </pre>
   *
   * <code>repeated string security_operators = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The securityOperators at the given index.
   */
  java.lang.String getSecurityOperators(int index);
  /**
   *
   *
   * <pre>
   * Optional. Domain users to be given the SeSecurityPrivilege.
   * </pre>
   *
   * <code>repeated string security_operators = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the securityOperators at the given index.
   */
  com.google.protobuf.ByteString getSecurityOperatorsBytes(int index);

  /**
   *
   *
   * <pre>
   * Name of the active directory machine. This optional parameter is used only
   * while creating kerberos volume
   * </pre>
   *
   * <code>string kdc_hostname = 14;</code>
   *
   * @return The kdcHostname.
   */
  java.lang.String getKdcHostname();
  /**
   *
   *
   * <pre>
   * Name of the active directory machine. This optional parameter is used only
   * while creating kerberos volume
   * </pre>
   *
   * <code>string kdc_hostname = 14;</code>
   *
   * @return The bytes for kdcHostname.
   */
  com.google.protobuf.ByteString getKdcHostnameBytes();

  /**
   *
   *
   * <pre>
   * KDC server IP address for the active directory machine.
   * </pre>
   *
   * <code>string kdc_ip = 15;</code>
   *
   * @return The kdcIp.
   */
  java.lang.String getKdcIp();
  /**
   *
   *
   * <pre>
   * KDC server IP address for the active directory machine.
   * </pre>
   *
   * <code>string kdc_ip = 15;</code>
   *
   * @return The bytes for kdcIp.
   */
  com.google.protobuf.ByteString getKdcIpBytes();

  /**
   *
   *
   * <pre>
   * If enabled, will allow access to local users and LDAP users. If access is
   * needed for only LDAP users, it has to be disabled.
   * </pre>
   *
   * <code>bool nfs_users_with_ldap = 16;</code>
   *
   * @return The nfsUsersWithLdap.
   */
  boolean getNfsUsersWithLdap();

  /**
   *
   *
   * <pre>
   * Description of the active directory.
   * </pre>
   *
   * <code>string description = 17;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Description of the active directory.
   * </pre>
   *
   * <code>string description = 17;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Specifies whether or not the LDAP traffic needs to be signed.
   * </pre>
   *
   * <code>bool ldap_signing = 18;</code>
   *
   * @return The ldapSigning.
   */
  boolean getLdapSigning();

  /**
   *
   *
   * <pre>
   * If enabled, traffic between the SMB server to Domain Controller (DC) will
   * be encrypted.
   * </pre>
   *
   * <code>bool encrypt_dc_connections = 19;</code>
   *
   * @return The encryptDcConnections.
   */
  boolean getEncryptDcConnections();

  /**
   *
   *
   * <pre>
   * Labels for the active directory.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 20;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels for the active directory.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 20;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Labels for the active directory.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 20;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels for the active directory.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 20;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Labels for the active directory.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 20;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. The state details of the Active Directory.
   * </pre>
   *
   * <code>string state_details = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The stateDetails.
   */
  java.lang.String getStateDetails();
  /**
   *
   *
   * <pre>
   * Output only. The state details of the Active Directory.
   * </pre>
   *
   * <code>string state_details = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for stateDetails.
   */
  com.google.protobuf.ByteString getStateDetailsBytes();
}
