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
// source: google/maps/addressvalidation/v1/address_validation_service.proto

// Protobuf Java Version: 3.25.2
package com.google.maps.addressvalidation.v1;

public interface ValidateAddressRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.addressvalidation.v1.ValidateAddressRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The address being validated. Unformatted addresses should be
   * submitted via [`address_lines`][google.type.PostalAddress.address_lines].
   *
   * The total length of the fields in this input must not exceed 280
   * characters.
   *
   * Supported regions can be found
   * [here](https://developers.google.com/maps/documentation/address-validation/coverage).
   *
   * The [language_code][google.type.PostalAddress.language_code] value in the
   * input address is reserved for future uses and is ignored today. The
   * validated address result will be populated based on the preferred language
   * for the given address, as identified by the system.
   *
   * The Address Validation API ignores the values in
   * [recipients][google.type.PostalAddress.recipients] and
   * [organization][google.type.PostalAddress.organization]. Any values in those
   * fields will be discarded and not returned. Please do not set them.
   * </pre>
   *
   * <code>.google.type.PostalAddress address = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the address field is set.
   */
  boolean hasAddress();
  /**
   *
   *
   * <pre>
   * Required. The address being validated. Unformatted addresses should be
   * submitted via [`address_lines`][google.type.PostalAddress.address_lines].
   *
   * The total length of the fields in this input must not exceed 280
   * characters.
   *
   * Supported regions can be found
   * [here](https://developers.google.com/maps/documentation/address-validation/coverage).
   *
   * The [language_code][google.type.PostalAddress.language_code] value in the
   * input address is reserved for future uses and is ignored today. The
   * validated address result will be populated based on the preferred language
   * for the given address, as identified by the system.
   *
   * The Address Validation API ignores the values in
   * [recipients][google.type.PostalAddress.recipients] and
   * [organization][google.type.PostalAddress.organization]. Any values in those
   * fields will be discarded and not returned. Please do not set them.
   * </pre>
   *
   * <code>.google.type.PostalAddress address = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The address.
   */
  com.google.type.PostalAddress getAddress();
  /**
   *
   *
   * <pre>
   * Required. The address being validated. Unformatted addresses should be
   * submitted via [`address_lines`][google.type.PostalAddress.address_lines].
   *
   * The total length of the fields in this input must not exceed 280
   * characters.
   *
   * Supported regions can be found
   * [here](https://developers.google.com/maps/documentation/address-validation/coverage).
   *
   * The [language_code][google.type.PostalAddress.language_code] value in the
   * input address is reserved for future uses and is ignored today. The
   * validated address result will be populated based on the preferred language
   * for the given address, as identified by the system.
   *
   * The Address Validation API ignores the values in
   * [recipients][google.type.PostalAddress.recipients] and
   * [organization][google.type.PostalAddress.organization]. Any values in those
   * fields will be discarded and not returned. Please do not set them.
   * </pre>
   *
   * <code>.google.type.PostalAddress address = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.type.PostalAddressOrBuilder getAddressOrBuilder();

  /**
   *
   *
   * <pre>
   * This field must be empty for the first address validation request. If
   * more requests are necessary to fully validate a single address (for
   * example if the changes the user makes after the initial validation need to
   * be re-validated), then each followup request must populate this field with
   * the
   * [response_id][google.maps.addressvalidation.v1.ValidateAddressResponse.response_id]
   * from the very first response in the validation sequence.
   * </pre>
   *
   * <code>string previous_response_id = 2;</code>
   *
   * @return The previousResponseId.
   */
  java.lang.String getPreviousResponseId();
  /**
   *
   *
   * <pre>
   * This field must be empty for the first address validation request. If
   * more requests are necessary to fully validate a single address (for
   * example if the changes the user makes after the initial validation need to
   * be re-validated), then each followup request must populate this field with
   * the
   * [response_id][google.maps.addressvalidation.v1.ValidateAddressResponse.response_id]
   * from the very first response in the validation sequence.
   * </pre>
   *
   * <code>string previous_response_id = 2;</code>
   *
   * @return The bytes for previousResponseId.
   */
  com.google.protobuf.ByteString getPreviousResponseIdBytes();

  /**
   *
   *
   * <pre>
   * Enables USPS CASS compatible mode. This affects _only_ the
   * [google.maps.addressvalidation.v1.ValidationResult.usps_data] field of
   * [google.maps.addressvalidation.v1.ValidationResult]. Note: for USPS CASS
   * enabled requests for addresses in Puerto Rico, a
   * [google.type.PostalAddress.region_code] of the `address` must be provided
   * as "PR", or an [google.type.PostalAddress.administrative_area] of the
   * `address` must be provided as "Puerto Rico" (case-insensitive) or "PR".
   *
   * It's recommended to use a componentized `address`, or alternatively specify
   * at least two [google.type.PostalAddress.address_lines] where the first line
   * contains the street number and name and the second line contains the city,
   * state, and zip code.
   * </pre>
   *
   * <code>bool enable_usps_cass = 3;</code>
   *
   * @return The enableUspsCass.
   */
  boolean getEnableUspsCass();

  /**
   *
   *
   * <pre>
   * Optional. A string which identifies an Autocomplete session for billing
   * purposes. Must be a URL and filename safe base64 string with at most 36
   * ASCII characters in length. Otherwise an INVALID_ARGUMENT error is
   * returned.
   *
   * The session begins when the user starts typing a query, and concludes when
   * they select a place and a call to Place Details or Address Validation is
   * made. Each session can have multiple autocomplete queries, followed by one
   * Place Details or Address Validation request. The credentials used for each
   * request within a session must belong to the same Google Cloud Console
   * project. Once a session has concluded, the token is no longer valid; your
   * app must generate a fresh token for each session. If the `session_token`
   * parameter is omitted, or if you reuse a session token, the session is
   * charged as if no session token was provided (each request is billed
   * separately).
   *
   * Note: Address Validation can only be used in sessions with the
   * Autocomplete (New) API, not the old Autocomplete API. See
   * https://developers.google.com/maps/documentation/places/web-service/session-pricing
   * for more details.
   * </pre>
   *
   * <code>string session_token = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The sessionToken.
   */
  java.lang.String getSessionToken();
  /**
   *
   *
   * <pre>
   * Optional. A string which identifies an Autocomplete session for billing
   * purposes. Must be a URL and filename safe base64 string with at most 36
   * ASCII characters in length. Otherwise an INVALID_ARGUMENT error is
   * returned.
   *
   * The session begins when the user starts typing a query, and concludes when
   * they select a place and a call to Place Details or Address Validation is
   * made. Each session can have multiple autocomplete queries, followed by one
   * Place Details or Address Validation request. The credentials used for each
   * request within a session must belong to the same Google Cloud Console
   * project. Once a session has concluded, the token is no longer valid; your
   * app must generate a fresh token for each session. If the `session_token`
   * parameter is omitted, or if you reuse a session token, the session is
   * charged as if no session token was provided (each request is billed
   * separately).
   *
   * Note: Address Validation can only be used in sessions with the
   * Autocomplete (New) API, not the old Autocomplete API. See
   * https://developers.google.com/maps/documentation/places/web-service/session-pricing
   * for more details.
   * </pre>
   *
   * <code>string session_token = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for sessionToken.
   */
  com.google.protobuf.ByteString getSessionTokenBytes();
}
