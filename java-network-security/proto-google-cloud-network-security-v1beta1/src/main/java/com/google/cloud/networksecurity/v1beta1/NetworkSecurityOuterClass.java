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
// source: google/cloud/networksecurity/v1beta1/network_security.proto

package com.google.cloud.networksecurity.v1beta1;

public final class NetworkSecurityOuterClass {
  private NetworkSecurityOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n;google/cloud/networksecurity/v1beta1/n"
          + "etwork_security.proto\022$google.cloud.netw"
          + "orksecurity.v1beta1\032\034google/api/annotati"
          + "ons.proto\032\027google/api/client.proto\032?goog"
          + "le/cloud/networksecurity/v1beta1/authori"
          + "zation_policy.proto\032<google/cloud/networ"
          + "ksecurity/v1beta1/client_tls_policy.prot"
          + "o\032<google/cloud/networksecurity/v1beta1/"
          + "server_tls_policy.proto\032#google/longrunn"
          + "ing/operations.proto2\216 \n\017NetworkSecurity"
          + "\022\375\001\n\031ListAuthorizationPolicies\022F.google."
          + "cloud.networksecurity.v1beta1.ListAuthor"
          + "izationPoliciesRequest\032G.google.cloud.ne"
          + "tworksecurity.v1beta1.ListAuthorizationP"
          + "oliciesResponse\"O\202\323\344\223\002@\022>/v1beta1/{paren"
          + "t=projects/*/locations/*}/authorizationP"
          + "olicies\332A\006parent\022\347\001\n\026GetAuthorizationPol"
          + "icy\022C.google.cloud.networksecurity.v1bet"
          + "a1.GetAuthorizationPolicyRequest\0329.googl"
          + "e.cloud.networksecurity.v1beta1.Authoriz"
          + "ationPolicy\"M\202\323\344\223\002@\022>/v1beta1/{name=proj"
          + "ects/*/locations/*/authorizationPolicies"
          + "/*}\332A\004name\022\302\002\n\031CreateAuthorizationPolicy"
          + "\022F.google.cloud.networksecurity.v1beta1."
          + "CreateAuthorizationPolicyRequest\032\035.googl"
          + "e.longrunning.Operation\"\275\001\202\323\344\223\002V\">/v1bet"
          + "a1/{parent=projects/*/locations/*}/autho"
          + "rizationPolicies:\024authorization_policy\332A"
          + "3parent,authorization_policy,authorizati"
          + "on_policy_id\312A(\n\023AuthorizationPolicy\022\021Op"
          + "erationMetadata\022\304\002\n\031UpdateAuthorizationP"
          + "olicy\022F.google.cloud.networksecurity.v1b"
          + "eta1.UpdateAuthorizationPolicyRequest\032\035."
          + "google.longrunning.Operation\"\277\001\202\323\344\223\002k2S/"
          + "v1beta1/{authorization_policy.name=proje"
          + "cts/*/locations/*/authorizationPolicies/"
          + "*}:\024authorization_policy\332A authorization"
          + "_policy,update_mask\312A(\n\023AuthorizationPol"
          + "icy\022\021OperationMetadata\022\376\001\n\031DeleteAuthori"
          + "zationPolicy\022F.google.cloud.networksecur"
          + "ity.v1beta1.DeleteAuthorizationPolicyReq"
          + "uest\032\035.google.longrunning.Operation\"z\202\323\344"
          + "\223\002@*>/v1beta1/{name=projects/*/locations"
          + "/*/authorizationPolicies/*}\332A\004name\312A*\n\025g"
          + "oogle.protobuf.Empty\022\021OperationMetadata\022"
          + "\355\001\n\025ListServerTlsPolicies\022B.google.cloud"
          + ".networksecurity.v1beta1.ListServerTlsPo"
          + "liciesRequest\032C.google.cloud.networksecu"
          + "rity.v1beta1.ListServerTlsPoliciesRespon"
          + "se\"K\202\323\344\223\002<\022:/v1beta1/{parent=projects/*/"
          + "locations/*}/serverTlsPolicies\332A\006parent\022"
          + "\327\001\n\022GetServerTlsPolicy\022?.google.cloud.ne"
          + "tworksecurity.v1beta1.GetServerTlsPolicy"
          + "Request\0325.google.cloud.networksecurity.v"
          + "1beta1.ServerTlsPolicy\"I\202\323\344\223\002<\022:/v1beta1"
          + "/{name=projects/*/locations/*/serverTlsP"
          + "olicies/*}\332A\004name\022\251\002\n\025CreateServerTlsPol"
          + "icy\022B.google.cloud.networksecurity.v1bet"
          + "a1.CreateServerTlsPolicyRequest\032\035.google"
          + ".longrunning.Operation\"\254\001\202\323\344\223\002O\":/v1beta"
          + "1/{parent=projects/*/locations/*}/server"
          + "TlsPolicies:\021server_tls_policy\332A-parent,"
          + "server_tls_policy,server_tls_policy_id\312A"
          + "$\n\017ServerTlsPolicy\022\021OperationMetadata\022\253\002"
          + "\n\025UpdateServerTlsPolicy\022B.google.cloud.n"
          + "etworksecurity.v1beta1.UpdateServerTlsPo"
          + "licyRequest\032\035.google.longrunning.Operati"
          + "on\"\256\001\202\323\344\223\002a2L/v1beta1/{server_tls_policy"
          + ".name=projects/*/locations/*/serverTlsPo"
          + "licies/*}:\021server_tls_policy\332A\035server_tl"
          + "s_policy,update_mask\312A$\n\017ServerTlsPolicy"
          + "\022\021OperationMetadata\022\362\001\n\025DeleteServerTlsP"
          + "olicy\022B.google.cloud.networksecurity.v1b"
          + "eta1.DeleteServerTlsPolicyRequest\032\035.goog"
          + "le.longrunning.Operation\"v\202\323\344\223\002<*:/v1bet"
          + "a1/{name=projects/*/locations/*/serverTl"
          + "sPolicies/*}\332A\004name\312A*\n\025google.protobuf."
          + "Empty\022\021OperationMetadata\022\355\001\n\025ListClientT"
          + "lsPolicies\022B.google.cloud.networksecurit"
          + "y.v1beta1.ListClientTlsPoliciesRequest\032C"
          + ".google.cloud.networksecurity.v1beta1.Li"
          + "stClientTlsPoliciesResponse\"K\202\323\344\223\002<\022:/v1"
          + "beta1/{parent=projects/*/locations/*}/cl"
          + "ientTlsPolicies\332A\006parent\022\327\001\n\022GetClientTl"
          + "sPolicy\022?.google.cloud.networksecurity.v"
          + "1beta1.GetClientTlsPolicyRequest\0325.googl"
          + "e.cloud.networksecurity.v1beta1.ClientTl"
          + "sPolicy\"I\202\323\344\223\002<\022:/v1beta1/{name=projects"
          + "/*/locations/*/clientTlsPolicies/*}\332A\004na"
          + "me\022\251\002\n\025CreateClientTlsPolicy\022B.google.cl"
          + "oud.networksecurity.v1beta1.CreateClient"
          + "TlsPolicyRequest\032\035.google.longrunning.Op"
          + "eration\"\254\001\202\323\344\223\002O\":/v1beta1/{parent=proje"
          + "cts/*/locations/*}/clientTlsPolicies:\021cl"
          + "ient_tls_policy\332A-parent,client_tls_poli"
          + "cy,client_tls_policy_id\312A$\n\017ClientTlsPol"
          + "icy\022\021OperationMetadata\022\253\002\n\025UpdateClientT"
          + "lsPolicy\022B.google.cloud.networksecurity."
          + "v1beta1.UpdateClientTlsPolicyRequest\032\035.g"
          + "oogle.longrunning.Operation\"\256\001\202\323\344\223\002a2L/v"
          + "1beta1/{client_tls_policy.name=projects/"
          + "*/locations/*/clientTlsPolicies/*}:\021clie"
          + "nt_tls_policy\332A\035client_tls_policy,update"
          + "_mask\312A$\n\017ClientTlsPolicy\022\021OperationMeta"
          + "data\022\362\001\n\025DeleteClientTlsPolicy\022B.google."
          + "cloud.networksecurity.v1beta1.DeleteClie"
          + "ntTlsPolicyRequest\032\035.google.longrunning."
          + "Operation\"v\202\323\344\223\002<*:/v1beta1/{name=projec"
          + "ts/*/locations/*/clientTlsPolicies/*}\332A\004"
          + "name\312A*\n\025google.protobuf.Empty\022\021Operatio"
          + "nMetadata\032R\312A\036networksecurity.googleapis"
          + ".com\322A.https://www.googleapis.com/auth/c"
          + "loud-platformB\371\001\n(com.google.cloud.netwo"
          + "rksecurity.v1beta1P\001ZSgoogle.golang.org/"
          + "genproto/googleapis/cloud/networksecurit"
          + "y/v1beta1;networksecurity\252\002$Google.Cloud"
          + ".NetworkSecurity.V1Beta1\312\002$Google\\Cloud\\"
          + "NetworkSecurity\\V1beta1\352\002\'Google::Cloud:"
          + ":NetworkSecurity::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.cloud.networksecurity.v1beta1.AuthorizationPolicyOuterClass
                  .getDescriptor(),
              com.google.cloud.networksecurity.v1beta1.ClientTlsPolicyOuterClass.getDescriptor(),
              com.google.cloud.networksecurity.v1beta1.ServerTlsPolicyOuterClass.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.cloud.networksecurity.v1beta1.AuthorizationPolicyOuterClass.getDescriptor();
    com.google.cloud.networksecurity.v1beta1.ClientTlsPolicyOuterClass.getDescriptor();
    com.google.cloud.networksecurity.v1beta1.ServerTlsPolicyOuterClass.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
