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
// source: google/cloud/documentai/v1/document_processor_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.documentai.v1;

/**
 *
 *
 * <pre>
 * Response message for the
 * [ProcessDocument][google.cloud.documentai.v1.DocumentProcessorService.ProcessDocument] method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.documentai.v1.ProcessResponse}
 */
public final class ProcessResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.documentai.v1.ProcessResponse)
    ProcessResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ProcessResponse.newBuilder() to construct.
  private ProcessResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ProcessResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ProcessResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.documentai.v1.DocumentAiProcessorService
        .internal_static_google_cloud_documentai_v1_ProcessResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.documentai.v1.DocumentAiProcessorService
        .internal_static_google_cloud_documentai_v1_ProcessResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.documentai.v1.ProcessResponse.class,
            com.google.cloud.documentai.v1.ProcessResponse.Builder.class);
  }

  private int bitField0_;
  public static final int DOCUMENT_FIELD_NUMBER = 1;
  private com.google.cloud.documentai.v1.Document document_;
  /**
   *
   *
   * <pre>
   * The document payload, will populate fields based on the processor's
   * behavior.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.Document document = 1;</code>
   *
   * @return Whether the document field is set.
   */
  @java.lang.Override
  public boolean hasDocument() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The document payload, will populate fields based on the processor's
   * behavior.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.Document document = 1;</code>
   *
   * @return The document.
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1.Document getDocument() {
    return document_ == null
        ? com.google.cloud.documentai.v1.Document.getDefaultInstance()
        : document_;
  }
  /**
   *
   *
   * <pre>
   * The document payload, will populate fields based on the processor's
   * behavior.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.Document document = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1.DocumentOrBuilder getDocumentOrBuilder() {
    return document_ == null
        ? com.google.cloud.documentai.v1.Document.getDefaultInstance()
        : document_;
  }

  public static final int HUMAN_REVIEW_STATUS_FIELD_NUMBER = 3;
  private com.google.cloud.documentai.v1.HumanReviewStatus humanReviewStatus_;
  /**
   *
   *
   * <pre>
   * The status of human review on the processed document.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.HumanReviewStatus human_review_status = 3;</code>
   *
   * @return Whether the humanReviewStatus field is set.
   */
  @java.lang.Override
  public boolean hasHumanReviewStatus() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * The status of human review on the processed document.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.HumanReviewStatus human_review_status = 3;</code>
   *
   * @return The humanReviewStatus.
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1.HumanReviewStatus getHumanReviewStatus() {
    return humanReviewStatus_ == null
        ? com.google.cloud.documentai.v1.HumanReviewStatus.getDefaultInstance()
        : humanReviewStatus_;
  }
  /**
   *
   *
   * <pre>
   * The status of human review on the processed document.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.HumanReviewStatus human_review_status = 3;</code>
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1.HumanReviewStatusOrBuilder getHumanReviewStatusOrBuilder() {
    return humanReviewStatus_ == null
        ? com.google.cloud.documentai.v1.HumanReviewStatus.getDefaultInstance()
        : humanReviewStatus_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getDocument());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(3, getHumanReviewStatus());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getDocument());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getHumanReviewStatus());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.documentai.v1.ProcessResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.documentai.v1.ProcessResponse other =
        (com.google.cloud.documentai.v1.ProcessResponse) obj;

    if (hasDocument() != other.hasDocument()) return false;
    if (hasDocument()) {
      if (!getDocument().equals(other.getDocument())) return false;
    }
    if (hasHumanReviewStatus() != other.hasHumanReviewStatus()) return false;
    if (hasHumanReviewStatus()) {
      if (!getHumanReviewStatus().equals(other.getHumanReviewStatus())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasDocument()) {
      hash = (37 * hash) + DOCUMENT_FIELD_NUMBER;
      hash = (53 * hash) + getDocument().hashCode();
    }
    if (hasHumanReviewStatus()) {
      hash = (37 * hash) + HUMAN_REVIEW_STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getHumanReviewStatus().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.documentai.v1.ProcessResponse parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1.ProcessResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1.ProcessResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1.ProcessResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1.ProcessResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1.ProcessResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1.ProcessResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1.ProcessResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1.ProcessResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1.ProcessResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1.ProcessResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1.ProcessResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.documentai.v1.ProcessResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Response message for the
   * [ProcessDocument][google.cloud.documentai.v1.DocumentProcessorService.ProcessDocument] method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.documentai.v1.ProcessResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.documentai.v1.ProcessResponse)
      com.google.cloud.documentai.v1.ProcessResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.documentai.v1.DocumentAiProcessorService
          .internal_static_google_cloud_documentai_v1_ProcessResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.documentai.v1.DocumentAiProcessorService
          .internal_static_google_cloud_documentai_v1_ProcessResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.documentai.v1.ProcessResponse.class,
              com.google.cloud.documentai.v1.ProcessResponse.Builder.class);
    }

    // Construct using com.google.cloud.documentai.v1.ProcessResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getDocumentFieldBuilder();
        getHumanReviewStatusFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      document_ = null;
      if (documentBuilder_ != null) {
        documentBuilder_.dispose();
        documentBuilder_ = null;
      }
      humanReviewStatus_ = null;
      if (humanReviewStatusBuilder_ != null) {
        humanReviewStatusBuilder_.dispose();
        humanReviewStatusBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.documentai.v1.DocumentAiProcessorService
          .internal_static_google_cloud_documentai_v1_ProcessResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1.ProcessResponse getDefaultInstanceForType() {
      return com.google.cloud.documentai.v1.ProcessResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1.ProcessResponse build() {
      com.google.cloud.documentai.v1.ProcessResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1.ProcessResponse buildPartial() {
      com.google.cloud.documentai.v1.ProcessResponse result =
          new com.google.cloud.documentai.v1.ProcessResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.documentai.v1.ProcessResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.document_ = documentBuilder_ == null ? document_ : documentBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.humanReviewStatus_ =
            humanReviewStatusBuilder_ == null
                ? humanReviewStatus_
                : humanReviewStatusBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.documentai.v1.ProcessResponse) {
        return mergeFrom((com.google.cloud.documentai.v1.ProcessResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.documentai.v1.ProcessResponse other) {
      if (other == com.google.cloud.documentai.v1.ProcessResponse.getDefaultInstance()) return this;
      if (other.hasDocument()) {
        mergeDocument(other.getDocument());
      }
      if (other.hasHumanReviewStatus()) {
        mergeHumanReviewStatus(other.getHumanReviewStatus());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                input.readMessage(getDocumentFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 26:
              {
                input.readMessage(
                    getHumanReviewStatusFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 26
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private com.google.cloud.documentai.v1.Document document_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.documentai.v1.Document,
            com.google.cloud.documentai.v1.Document.Builder,
            com.google.cloud.documentai.v1.DocumentOrBuilder>
        documentBuilder_;
    /**
     *
     *
     * <pre>
     * The document payload, will populate fields based on the processor's
     * behavior.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.Document document = 1;</code>
     *
     * @return Whether the document field is set.
     */
    public boolean hasDocument() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The document payload, will populate fields based on the processor's
     * behavior.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.Document document = 1;</code>
     *
     * @return The document.
     */
    public com.google.cloud.documentai.v1.Document getDocument() {
      if (documentBuilder_ == null) {
        return document_ == null
            ? com.google.cloud.documentai.v1.Document.getDefaultInstance()
            : document_;
      } else {
        return documentBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The document payload, will populate fields based on the processor's
     * behavior.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.Document document = 1;</code>
     */
    public Builder setDocument(com.google.cloud.documentai.v1.Document value) {
      if (documentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        document_ = value;
      } else {
        documentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The document payload, will populate fields based on the processor's
     * behavior.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.Document document = 1;</code>
     */
    public Builder setDocument(com.google.cloud.documentai.v1.Document.Builder builderForValue) {
      if (documentBuilder_ == null) {
        document_ = builderForValue.build();
      } else {
        documentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The document payload, will populate fields based on the processor's
     * behavior.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.Document document = 1;</code>
     */
    public Builder mergeDocument(com.google.cloud.documentai.v1.Document value) {
      if (documentBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && document_ != null
            && document_ != com.google.cloud.documentai.v1.Document.getDefaultInstance()) {
          getDocumentBuilder().mergeFrom(value);
        } else {
          document_ = value;
        }
      } else {
        documentBuilder_.mergeFrom(value);
      }
      if (document_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The document payload, will populate fields based on the processor's
     * behavior.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.Document document = 1;</code>
     */
    public Builder clearDocument() {
      bitField0_ = (bitField0_ & ~0x00000001);
      document_ = null;
      if (documentBuilder_ != null) {
        documentBuilder_.dispose();
        documentBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The document payload, will populate fields based on the processor's
     * behavior.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.Document document = 1;</code>
     */
    public com.google.cloud.documentai.v1.Document.Builder getDocumentBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDocumentFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The document payload, will populate fields based on the processor's
     * behavior.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.Document document = 1;</code>
     */
    public com.google.cloud.documentai.v1.DocumentOrBuilder getDocumentOrBuilder() {
      if (documentBuilder_ != null) {
        return documentBuilder_.getMessageOrBuilder();
      } else {
        return document_ == null
            ? com.google.cloud.documentai.v1.Document.getDefaultInstance()
            : document_;
      }
    }
    /**
     *
     *
     * <pre>
     * The document payload, will populate fields based on the processor's
     * behavior.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.Document document = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.documentai.v1.Document,
            com.google.cloud.documentai.v1.Document.Builder,
            com.google.cloud.documentai.v1.DocumentOrBuilder>
        getDocumentFieldBuilder() {
      if (documentBuilder_ == null) {
        documentBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.documentai.v1.Document,
                com.google.cloud.documentai.v1.Document.Builder,
                com.google.cloud.documentai.v1.DocumentOrBuilder>(
                getDocument(), getParentForChildren(), isClean());
        document_ = null;
      }
      return documentBuilder_;
    }

    private com.google.cloud.documentai.v1.HumanReviewStatus humanReviewStatus_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.documentai.v1.HumanReviewStatus,
            com.google.cloud.documentai.v1.HumanReviewStatus.Builder,
            com.google.cloud.documentai.v1.HumanReviewStatusOrBuilder>
        humanReviewStatusBuilder_;
    /**
     *
     *
     * <pre>
     * The status of human review on the processed document.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.HumanReviewStatus human_review_status = 3;</code>
     *
     * @return Whether the humanReviewStatus field is set.
     */
    public boolean hasHumanReviewStatus() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * The status of human review on the processed document.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.HumanReviewStatus human_review_status = 3;</code>
     *
     * @return The humanReviewStatus.
     */
    public com.google.cloud.documentai.v1.HumanReviewStatus getHumanReviewStatus() {
      if (humanReviewStatusBuilder_ == null) {
        return humanReviewStatus_ == null
            ? com.google.cloud.documentai.v1.HumanReviewStatus.getDefaultInstance()
            : humanReviewStatus_;
      } else {
        return humanReviewStatusBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The status of human review on the processed document.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.HumanReviewStatus human_review_status = 3;</code>
     */
    public Builder setHumanReviewStatus(com.google.cloud.documentai.v1.HumanReviewStatus value) {
      if (humanReviewStatusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        humanReviewStatus_ = value;
      } else {
        humanReviewStatusBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The status of human review on the processed document.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.HumanReviewStatus human_review_status = 3;</code>
     */
    public Builder setHumanReviewStatus(
        com.google.cloud.documentai.v1.HumanReviewStatus.Builder builderForValue) {
      if (humanReviewStatusBuilder_ == null) {
        humanReviewStatus_ = builderForValue.build();
      } else {
        humanReviewStatusBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The status of human review on the processed document.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.HumanReviewStatus human_review_status = 3;</code>
     */
    public Builder mergeHumanReviewStatus(com.google.cloud.documentai.v1.HumanReviewStatus value) {
      if (humanReviewStatusBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && humanReviewStatus_ != null
            && humanReviewStatus_
                != com.google.cloud.documentai.v1.HumanReviewStatus.getDefaultInstance()) {
          getHumanReviewStatusBuilder().mergeFrom(value);
        } else {
          humanReviewStatus_ = value;
        }
      } else {
        humanReviewStatusBuilder_.mergeFrom(value);
      }
      if (humanReviewStatus_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The status of human review on the processed document.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.HumanReviewStatus human_review_status = 3;</code>
     */
    public Builder clearHumanReviewStatus() {
      bitField0_ = (bitField0_ & ~0x00000002);
      humanReviewStatus_ = null;
      if (humanReviewStatusBuilder_ != null) {
        humanReviewStatusBuilder_.dispose();
        humanReviewStatusBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The status of human review on the processed document.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.HumanReviewStatus human_review_status = 3;</code>
     */
    public com.google.cloud.documentai.v1.HumanReviewStatus.Builder getHumanReviewStatusBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getHumanReviewStatusFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The status of human review on the processed document.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.HumanReviewStatus human_review_status = 3;</code>
     */
    public com.google.cloud.documentai.v1.HumanReviewStatusOrBuilder
        getHumanReviewStatusOrBuilder() {
      if (humanReviewStatusBuilder_ != null) {
        return humanReviewStatusBuilder_.getMessageOrBuilder();
      } else {
        return humanReviewStatus_ == null
            ? com.google.cloud.documentai.v1.HumanReviewStatus.getDefaultInstance()
            : humanReviewStatus_;
      }
    }
    /**
     *
     *
     * <pre>
     * The status of human review on the processed document.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.HumanReviewStatus human_review_status = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.documentai.v1.HumanReviewStatus,
            com.google.cloud.documentai.v1.HumanReviewStatus.Builder,
            com.google.cloud.documentai.v1.HumanReviewStatusOrBuilder>
        getHumanReviewStatusFieldBuilder() {
      if (humanReviewStatusBuilder_ == null) {
        humanReviewStatusBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.documentai.v1.HumanReviewStatus,
                com.google.cloud.documentai.v1.HumanReviewStatus.Builder,
                com.google.cloud.documentai.v1.HumanReviewStatusOrBuilder>(
                getHumanReviewStatus(), getParentForChildren(), isClean());
        humanReviewStatus_ = null;
      }
      return humanReviewStatusBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.documentai.v1.ProcessResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.documentai.v1.ProcessResponse)
  private static final com.google.cloud.documentai.v1.ProcessResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.documentai.v1.ProcessResponse();
  }

  public static com.google.cloud.documentai.v1.ProcessResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProcessResponse> PARSER =
      new com.google.protobuf.AbstractParser<ProcessResponse>() {
        @java.lang.Override
        public ProcessResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<ProcessResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProcessResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.documentai.v1.ProcessResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
