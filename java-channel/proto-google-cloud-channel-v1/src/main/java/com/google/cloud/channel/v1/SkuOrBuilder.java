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
// source: google/cloud/channel/v1/products.proto

package com.google.cloud.channel.v1;

public interface SkuOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.Sku)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Resource Name of the SKU.
   * Format: products/{product_id}/skus/{sku_id}
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
   * Resource Name of the SKU.
   * Format: products/{product_id}/skus/{sku_id}
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
   * Marketing information for the SKU.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.MarketingInfo marketing_info = 2;</code>
   *
   * @return Whether the marketingInfo field is set.
   */
  boolean hasMarketingInfo();
  /**
   *
   *
   * <pre>
   * Marketing information for the SKU.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.MarketingInfo marketing_info = 2;</code>
   *
   * @return The marketingInfo.
   */
  com.google.cloud.channel.v1.MarketingInfo getMarketingInfo();
  /**
   *
   *
   * <pre>
   * Marketing information for the SKU.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.MarketingInfo marketing_info = 2;</code>
   */
  com.google.cloud.channel.v1.MarketingInfoOrBuilder getMarketingInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * Product the SKU is associated with.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Product product = 3;</code>
   *
   * @return Whether the product field is set.
   */
  boolean hasProduct();
  /**
   *
   *
   * <pre>
   * Product the SKU is associated with.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Product product = 3;</code>
   *
   * @return The product.
   */
  com.google.cloud.channel.v1.Product getProduct();
  /**
   *
   *
   * <pre>
   * Product the SKU is associated with.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Product product = 3;</code>
   */
  com.google.cloud.channel.v1.ProductOrBuilder getProductOrBuilder();
}
