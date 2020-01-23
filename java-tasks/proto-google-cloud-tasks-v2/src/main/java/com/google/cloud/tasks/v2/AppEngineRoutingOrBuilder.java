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
// source: google/cloud/tasks/v2/target.proto

package com.google.cloud.tasks.v2;

public interface AppEngineRoutingOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tasks.v2.AppEngineRouting)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * App service.
   * By default, the task is sent to the service which is the default
   * service when the task is attempted.
   * For some queues or tasks which were created using the App Engine
   * Task Queue API, [host][google.cloud.tasks.v2.AppEngineRouting.host] is not parsable
   * into [service][google.cloud.tasks.v2.AppEngineRouting.service],
   * [version][google.cloud.tasks.v2.AppEngineRouting.version], and
   * [instance][google.cloud.tasks.v2.AppEngineRouting.instance]. For example, some tasks
   * which were created using the App Engine SDK use a custom domain
   * name; custom domains are not parsed by Cloud Tasks. If
   * [host][google.cloud.tasks.v2.AppEngineRouting.host] is not parsable, then
   * [service][google.cloud.tasks.v2.AppEngineRouting.service],
   * [version][google.cloud.tasks.v2.AppEngineRouting.version], and
   * [instance][google.cloud.tasks.v2.AppEngineRouting.instance] are the empty string.
   * </pre>
   *
   * <code>string service = 1;</code>
   *
   * @return The service.
   */
  java.lang.String getService();
  /**
   *
   *
   * <pre>
   * App service.
   * By default, the task is sent to the service which is the default
   * service when the task is attempted.
   * For some queues or tasks which were created using the App Engine
   * Task Queue API, [host][google.cloud.tasks.v2.AppEngineRouting.host] is not parsable
   * into [service][google.cloud.tasks.v2.AppEngineRouting.service],
   * [version][google.cloud.tasks.v2.AppEngineRouting.version], and
   * [instance][google.cloud.tasks.v2.AppEngineRouting.instance]. For example, some tasks
   * which were created using the App Engine SDK use a custom domain
   * name; custom domains are not parsed by Cloud Tasks. If
   * [host][google.cloud.tasks.v2.AppEngineRouting.host] is not parsable, then
   * [service][google.cloud.tasks.v2.AppEngineRouting.service],
   * [version][google.cloud.tasks.v2.AppEngineRouting.version], and
   * [instance][google.cloud.tasks.v2.AppEngineRouting.instance] are the empty string.
   * </pre>
   *
   * <code>string service = 1;</code>
   *
   * @return The bytes for service.
   */
  com.google.protobuf.ByteString getServiceBytes();

  /**
   *
   *
   * <pre>
   * App version.
   * By default, the task is sent to the version which is the default
   * version when the task is attempted.
   * For some queues or tasks which were created using the App Engine
   * Task Queue API, [host][google.cloud.tasks.v2.AppEngineRouting.host] is not parsable
   * into [service][google.cloud.tasks.v2.AppEngineRouting.service],
   * [version][google.cloud.tasks.v2.AppEngineRouting.version], and
   * [instance][google.cloud.tasks.v2.AppEngineRouting.instance]. For example, some tasks
   * which were created using the App Engine SDK use a custom domain
   * name; custom domains are not parsed by Cloud Tasks. If
   * [host][google.cloud.tasks.v2.AppEngineRouting.host] is not parsable, then
   * [service][google.cloud.tasks.v2.AppEngineRouting.service],
   * [version][google.cloud.tasks.v2.AppEngineRouting.version], and
   * [instance][google.cloud.tasks.v2.AppEngineRouting.instance] are the empty string.
   * </pre>
   *
   * <code>string version = 2;</code>
   *
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   *
   *
   * <pre>
   * App version.
   * By default, the task is sent to the version which is the default
   * version when the task is attempted.
   * For some queues or tasks which were created using the App Engine
   * Task Queue API, [host][google.cloud.tasks.v2.AppEngineRouting.host] is not parsable
   * into [service][google.cloud.tasks.v2.AppEngineRouting.service],
   * [version][google.cloud.tasks.v2.AppEngineRouting.version], and
   * [instance][google.cloud.tasks.v2.AppEngineRouting.instance]. For example, some tasks
   * which were created using the App Engine SDK use a custom domain
   * name; custom domains are not parsed by Cloud Tasks. If
   * [host][google.cloud.tasks.v2.AppEngineRouting.host] is not parsable, then
   * [service][google.cloud.tasks.v2.AppEngineRouting.service],
   * [version][google.cloud.tasks.v2.AppEngineRouting.version], and
   * [instance][google.cloud.tasks.v2.AppEngineRouting.instance] are the empty string.
   * </pre>
   *
   * <code>string version = 2;</code>
   *
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString getVersionBytes();

  /**
   *
   *
   * <pre>
   * App instance.
   * By default, the task is sent to an instance which is available when
   * the task is attempted.
   * Requests can only be sent to a specific instance if
   * [manual scaling is used in App Engine
   * Standard](https://cloud.google.com/appengine/docs/python/an-overview-of-app-engine?hl=en_US#scaling_types_and_instance_classes).
   * App Engine Flex does not support instances. For more information, see
   * [App Engine Standard request
   * routing](https://cloud.google.com/appengine/docs/standard/python/how-requests-are-routed)
   * and [App Engine Flex request
   * routing](https://cloud.google.com/appengine/docs/flexible/python/how-requests-are-routed).
   * </pre>
   *
   * <code>string instance = 3;</code>
   *
   * @return The instance.
   */
  java.lang.String getInstance();
  /**
   *
   *
   * <pre>
   * App instance.
   * By default, the task is sent to an instance which is available when
   * the task is attempted.
   * Requests can only be sent to a specific instance if
   * [manual scaling is used in App Engine
   * Standard](https://cloud.google.com/appengine/docs/python/an-overview-of-app-engine?hl=en_US#scaling_types_and_instance_classes).
   * App Engine Flex does not support instances. For more information, see
   * [App Engine Standard request
   * routing](https://cloud.google.com/appengine/docs/standard/python/how-requests-are-routed)
   * and [App Engine Flex request
   * routing](https://cloud.google.com/appengine/docs/flexible/python/how-requests-are-routed).
   * </pre>
   *
   * <code>string instance = 3;</code>
   *
   * @return The bytes for instance.
   */
  com.google.protobuf.ByteString getInstanceBytes();

  /**
   *
   *
   * <pre>
   * Output only. The host that the task is sent to.
   * The host is constructed from the domain name of the app associated with
   * the queue's project ID (for example &lt;app-id&gt;.appspot.com), and the
   * [service][google.cloud.tasks.v2.AppEngineRouting.service], [version][google.cloud.tasks.v2.AppEngineRouting.version],
   * and [instance][google.cloud.tasks.v2.AppEngineRouting.instance]. Tasks which were created using
   * the App Engine SDK might have a custom domain name.
   * For more information, see
   * [How Requests are
   * Routed](https://cloud.google.com/appengine/docs/standard/python/how-requests-are-routed).
   * </pre>
   *
   * <code>string host = 4;</code>
   *
   * @return The host.
   */
  java.lang.String getHost();
  /**
   *
   *
   * <pre>
   * Output only. The host that the task is sent to.
   * The host is constructed from the domain name of the app associated with
   * the queue's project ID (for example &lt;app-id&gt;.appspot.com), and the
   * [service][google.cloud.tasks.v2.AppEngineRouting.service], [version][google.cloud.tasks.v2.AppEngineRouting.version],
   * and [instance][google.cloud.tasks.v2.AppEngineRouting.instance]. Tasks which were created using
   * the App Engine SDK might have a custom domain name.
   * For more information, see
   * [How Requests are
   * Routed](https://cloud.google.com/appengine/docs/standard/python/how-requests-are-routed).
   * </pre>
   *
   * <code>string host = 4;</code>
   *
   * @return The bytes for host.
   */
  com.google.protobuf.ByteString getHostBytes();
}
