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
// source: google/chat/v1/message.proto

// Protobuf Java Version: 3.25.2
package com.google.chat.v1;

/**
 *
 *
 * <pre>
 * Contains a
 * [dialog](https://developers.google.com/workspace/chat/dialogs) and request
 * status code.
 * </pre>
 *
 * Protobuf type {@code google.chat.v1.DialogAction}
 */
public final class DialogAction extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.chat.v1.DialogAction)
    DialogActionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DialogAction.newBuilder() to construct.
  private DialogAction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DialogAction() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DialogAction();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.chat.v1.MessageProto.internal_static_google_chat_v1_DialogAction_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.chat.v1.MessageProto
        .internal_static_google_chat_v1_DialogAction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.chat.v1.DialogAction.class, com.google.chat.v1.DialogAction.Builder.class);
  }

  private int bitField0_;
  private int actionCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object action_;

  public enum ActionCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    DIALOG(1),
    ACTION_NOT_SET(0);
    private final int value;

    private ActionCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ActionCase valueOf(int value) {
      return forNumber(value);
    }

    public static ActionCase forNumber(int value) {
      switch (value) {
        case 1:
          return DIALOG;
        case 0:
          return ACTION_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public ActionCase getActionCase() {
    return ActionCase.forNumber(actionCase_);
  }

  public static final int DIALOG_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * Input only.
   * [Dialog](https://developers.google.com/workspace/chat/dialogs) for the
   * request.
   * </pre>
   *
   * <code>.google.chat.v1.Dialog dialog = 1 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   *
   * @return Whether the dialog field is set.
   */
  @java.lang.Override
  public boolean hasDialog() {
    return actionCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * Input only.
   * [Dialog](https://developers.google.com/workspace/chat/dialogs) for the
   * request.
   * </pre>
   *
   * <code>.google.chat.v1.Dialog dialog = 1 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   *
   * @return The dialog.
   */
  @java.lang.Override
  public com.google.chat.v1.Dialog getDialog() {
    if (actionCase_ == 1) {
      return (com.google.chat.v1.Dialog) action_;
    }
    return com.google.chat.v1.Dialog.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Input only.
   * [Dialog](https://developers.google.com/workspace/chat/dialogs) for the
   * request.
   * </pre>
   *
   * <code>.google.chat.v1.Dialog dialog = 1 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   */
  @java.lang.Override
  public com.google.chat.v1.DialogOrBuilder getDialogOrBuilder() {
    if (actionCase_ == 1) {
      return (com.google.chat.v1.Dialog) action_;
    }
    return com.google.chat.v1.Dialog.getDefaultInstance();
  }

  public static final int ACTION_STATUS_FIELD_NUMBER = 2;
  private com.google.chat.v1.ActionStatus actionStatus_;
  /**
   *
   *
   * <pre>
   * Input only. Status for a request to either invoke or submit a
   * [dialog](https://developers.google.com/workspace/chat/dialogs). Displays
   * a status and message to users, if necessary.
   * For example, in case of an error or success.
   * </pre>
   *
   * <code>
   * .google.chat.v1.ActionStatus action_status = 2 [(.google.api.field_behavior) = INPUT_ONLY];
   * </code>
   *
   * @return Whether the actionStatus field is set.
   */
  @java.lang.Override
  public boolean hasActionStatus() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Input only. Status for a request to either invoke or submit a
   * [dialog](https://developers.google.com/workspace/chat/dialogs). Displays
   * a status and message to users, if necessary.
   * For example, in case of an error or success.
   * </pre>
   *
   * <code>
   * .google.chat.v1.ActionStatus action_status = 2 [(.google.api.field_behavior) = INPUT_ONLY];
   * </code>
   *
   * @return The actionStatus.
   */
  @java.lang.Override
  public com.google.chat.v1.ActionStatus getActionStatus() {
    return actionStatus_ == null
        ? com.google.chat.v1.ActionStatus.getDefaultInstance()
        : actionStatus_;
  }
  /**
   *
   *
   * <pre>
   * Input only. Status for a request to either invoke or submit a
   * [dialog](https://developers.google.com/workspace/chat/dialogs). Displays
   * a status and message to users, if necessary.
   * For example, in case of an error or success.
   * </pre>
   *
   * <code>
   * .google.chat.v1.ActionStatus action_status = 2 [(.google.api.field_behavior) = INPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.chat.v1.ActionStatusOrBuilder getActionStatusOrBuilder() {
    return actionStatus_ == null
        ? com.google.chat.v1.ActionStatus.getDefaultInstance()
        : actionStatus_;
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
    if (actionCase_ == 1) {
      output.writeMessage(1, (com.google.chat.v1.Dialog) action_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getActionStatus());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (actionCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (com.google.chat.v1.Dialog) action_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getActionStatus());
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
    if (!(obj instanceof com.google.chat.v1.DialogAction)) {
      return super.equals(obj);
    }
    com.google.chat.v1.DialogAction other = (com.google.chat.v1.DialogAction) obj;

    if (hasActionStatus() != other.hasActionStatus()) return false;
    if (hasActionStatus()) {
      if (!getActionStatus().equals(other.getActionStatus())) return false;
    }
    if (!getActionCase().equals(other.getActionCase())) return false;
    switch (actionCase_) {
      case 1:
        if (!getDialog().equals(other.getDialog())) return false;
        break;
      case 0:
      default:
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
    if (hasActionStatus()) {
      hash = (37 * hash) + ACTION_STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getActionStatus().hashCode();
    }
    switch (actionCase_) {
      case 1:
        hash = (37 * hash) + DIALOG_FIELD_NUMBER;
        hash = (53 * hash) + getDialog().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.chat.v1.DialogAction parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.chat.v1.DialogAction parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.chat.v1.DialogAction parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.chat.v1.DialogAction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.chat.v1.DialogAction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.chat.v1.DialogAction parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.chat.v1.DialogAction parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.chat.v1.DialogAction parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.chat.v1.DialogAction parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.chat.v1.DialogAction parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.chat.v1.DialogAction parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.chat.v1.DialogAction parseFrom(
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

  public static Builder newBuilder(com.google.chat.v1.DialogAction prototype) {
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
   * Contains a
   * [dialog](https://developers.google.com/workspace/chat/dialogs) and request
   * status code.
   * </pre>
   *
   * Protobuf type {@code google.chat.v1.DialogAction}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.chat.v1.DialogAction)
      com.google.chat.v1.DialogActionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.chat.v1.MessageProto.internal_static_google_chat_v1_DialogAction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.chat.v1.MessageProto
          .internal_static_google_chat_v1_DialogAction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.chat.v1.DialogAction.class, com.google.chat.v1.DialogAction.Builder.class);
    }

    // Construct using com.google.chat.v1.DialogAction.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getActionStatusFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (dialogBuilder_ != null) {
        dialogBuilder_.clear();
      }
      actionStatus_ = null;
      if (actionStatusBuilder_ != null) {
        actionStatusBuilder_.dispose();
        actionStatusBuilder_ = null;
      }
      actionCase_ = 0;
      action_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.chat.v1.MessageProto.internal_static_google_chat_v1_DialogAction_descriptor;
    }

    @java.lang.Override
    public com.google.chat.v1.DialogAction getDefaultInstanceForType() {
      return com.google.chat.v1.DialogAction.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.chat.v1.DialogAction build() {
      com.google.chat.v1.DialogAction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.chat.v1.DialogAction buildPartial() {
      com.google.chat.v1.DialogAction result = new com.google.chat.v1.DialogAction(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.chat.v1.DialogAction result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.actionStatus_ =
            actionStatusBuilder_ == null ? actionStatus_ : actionStatusBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    private void buildPartialOneofs(com.google.chat.v1.DialogAction result) {
      result.actionCase_ = actionCase_;
      result.action_ = this.action_;
      if (actionCase_ == 1 && dialogBuilder_ != null) {
        result.action_ = dialogBuilder_.build();
      }
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
      if (other instanceof com.google.chat.v1.DialogAction) {
        return mergeFrom((com.google.chat.v1.DialogAction) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.chat.v1.DialogAction other) {
      if (other == com.google.chat.v1.DialogAction.getDefaultInstance()) return this;
      if (other.hasActionStatus()) {
        mergeActionStatus(other.getActionStatus());
      }
      switch (other.getActionCase()) {
        case DIALOG:
          {
            mergeDialog(other.getDialog());
            break;
          }
        case ACTION_NOT_SET:
          {
            break;
          }
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
                input.readMessage(getDialogFieldBuilder().getBuilder(), extensionRegistry);
                actionCase_ = 1;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getActionStatusFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private int actionCase_ = 0;
    private java.lang.Object action_;

    public ActionCase getActionCase() {
      return ActionCase.forNumber(actionCase_);
    }

    public Builder clearAction() {
      actionCase_ = 0;
      action_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.chat.v1.Dialog,
            com.google.chat.v1.Dialog.Builder,
            com.google.chat.v1.DialogOrBuilder>
        dialogBuilder_;
    /**
     *
     *
     * <pre>
     * Input only.
     * [Dialog](https://developers.google.com/workspace/chat/dialogs) for the
     * request.
     * </pre>
     *
     * <code>.google.chat.v1.Dialog dialog = 1 [(.google.api.field_behavior) = INPUT_ONLY];</code>
     *
     * @return Whether the dialog field is set.
     */
    @java.lang.Override
    public boolean hasDialog() {
      return actionCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * Input only.
     * [Dialog](https://developers.google.com/workspace/chat/dialogs) for the
     * request.
     * </pre>
     *
     * <code>.google.chat.v1.Dialog dialog = 1 [(.google.api.field_behavior) = INPUT_ONLY];</code>
     *
     * @return The dialog.
     */
    @java.lang.Override
    public com.google.chat.v1.Dialog getDialog() {
      if (dialogBuilder_ == null) {
        if (actionCase_ == 1) {
          return (com.google.chat.v1.Dialog) action_;
        }
        return com.google.chat.v1.Dialog.getDefaultInstance();
      } else {
        if (actionCase_ == 1) {
          return dialogBuilder_.getMessage();
        }
        return com.google.chat.v1.Dialog.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Input only.
     * [Dialog](https://developers.google.com/workspace/chat/dialogs) for the
     * request.
     * </pre>
     *
     * <code>.google.chat.v1.Dialog dialog = 1 [(.google.api.field_behavior) = INPUT_ONLY];</code>
     */
    public Builder setDialog(com.google.chat.v1.Dialog value) {
      if (dialogBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        action_ = value;
        onChanged();
      } else {
        dialogBuilder_.setMessage(value);
      }
      actionCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Input only.
     * [Dialog](https://developers.google.com/workspace/chat/dialogs) for the
     * request.
     * </pre>
     *
     * <code>.google.chat.v1.Dialog dialog = 1 [(.google.api.field_behavior) = INPUT_ONLY];</code>
     */
    public Builder setDialog(com.google.chat.v1.Dialog.Builder builderForValue) {
      if (dialogBuilder_ == null) {
        action_ = builderForValue.build();
        onChanged();
      } else {
        dialogBuilder_.setMessage(builderForValue.build());
      }
      actionCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Input only.
     * [Dialog](https://developers.google.com/workspace/chat/dialogs) for the
     * request.
     * </pre>
     *
     * <code>.google.chat.v1.Dialog dialog = 1 [(.google.api.field_behavior) = INPUT_ONLY];</code>
     */
    public Builder mergeDialog(com.google.chat.v1.Dialog value) {
      if (dialogBuilder_ == null) {
        if (actionCase_ == 1 && action_ != com.google.chat.v1.Dialog.getDefaultInstance()) {
          action_ =
              com.google.chat.v1.Dialog.newBuilder((com.google.chat.v1.Dialog) action_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          action_ = value;
        }
        onChanged();
      } else {
        if (actionCase_ == 1) {
          dialogBuilder_.mergeFrom(value);
        } else {
          dialogBuilder_.setMessage(value);
        }
      }
      actionCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Input only.
     * [Dialog](https://developers.google.com/workspace/chat/dialogs) for the
     * request.
     * </pre>
     *
     * <code>.google.chat.v1.Dialog dialog = 1 [(.google.api.field_behavior) = INPUT_ONLY];</code>
     */
    public Builder clearDialog() {
      if (dialogBuilder_ == null) {
        if (actionCase_ == 1) {
          actionCase_ = 0;
          action_ = null;
          onChanged();
        }
      } else {
        if (actionCase_ == 1) {
          actionCase_ = 0;
          action_ = null;
        }
        dialogBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Input only.
     * [Dialog](https://developers.google.com/workspace/chat/dialogs) for the
     * request.
     * </pre>
     *
     * <code>.google.chat.v1.Dialog dialog = 1 [(.google.api.field_behavior) = INPUT_ONLY];</code>
     */
    public com.google.chat.v1.Dialog.Builder getDialogBuilder() {
      return getDialogFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Input only.
     * [Dialog](https://developers.google.com/workspace/chat/dialogs) for the
     * request.
     * </pre>
     *
     * <code>.google.chat.v1.Dialog dialog = 1 [(.google.api.field_behavior) = INPUT_ONLY];</code>
     */
    @java.lang.Override
    public com.google.chat.v1.DialogOrBuilder getDialogOrBuilder() {
      if ((actionCase_ == 1) && (dialogBuilder_ != null)) {
        return dialogBuilder_.getMessageOrBuilder();
      } else {
        if (actionCase_ == 1) {
          return (com.google.chat.v1.Dialog) action_;
        }
        return com.google.chat.v1.Dialog.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Input only.
     * [Dialog](https://developers.google.com/workspace/chat/dialogs) for the
     * request.
     * </pre>
     *
     * <code>.google.chat.v1.Dialog dialog = 1 [(.google.api.field_behavior) = INPUT_ONLY];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.chat.v1.Dialog,
            com.google.chat.v1.Dialog.Builder,
            com.google.chat.v1.DialogOrBuilder>
        getDialogFieldBuilder() {
      if (dialogBuilder_ == null) {
        if (!(actionCase_ == 1)) {
          action_ = com.google.chat.v1.Dialog.getDefaultInstance();
        }
        dialogBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.chat.v1.Dialog,
                com.google.chat.v1.Dialog.Builder,
                com.google.chat.v1.DialogOrBuilder>(
                (com.google.chat.v1.Dialog) action_, getParentForChildren(), isClean());
        action_ = null;
      }
      actionCase_ = 1;
      onChanged();
      return dialogBuilder_;
    }

    private com.google.chat.v1.ActionStatus actionStatus_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.chat.v1.ActionStatus,
            com.google.chat.v1.ActionStatus.Builder,
            com.google.chat.v1.ActionStatusOrBuilder>
        actionStatusBuilder_;
    /**
     *
     *
     * <pre>
     * Input only. Status for a request to either invoke or submit a
     * [dialog](https://developers.google.com/workspace/chat/dialogs). Displays
     * a status and message to users, if necessary.
     * For example, in case of an error or success.
     * </pre>
     *
     * <code>
     * .google.chat.v1.ActionStatus action_status = 2 [(.google.api.field_behavior) = INPUT_ONLY];
     * </code>
     *
     * @return Whether the actionStatus field is set.
     */
    public boolean hasActionStatus() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Input only. Status for a request to either invoke or submit a
     * [dialog](https://developers.google.com/workspace/chat/dialogs). Displays
     * a status and message to users, if necessary.
     * For example, in case of an error or success.
     * </pre>
     *
     * <code>
     * .google.chat.v1.ActionStatus action_status = 2 [(.google.api.field_behavior) = INPUT_ONLY];
     * </code>
     *
     * @return The actionStatus.
     */
    public com.google.chat.v1.ActionStatus getActionStatus() {
      if (actionStatusBuilder_ == null) {
        return actionStatus_ == null
            ? com.google.chat.v1.ActionStatus.getDefaultInstance()
            : actionStatus_;
      } else {
        return actionStatusBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Input only. Status for a request to either invoke or submit a
     * [dialog](https://developers.google.com/workspace/chat/dialogs). Displays
     * a status and message to users, if necessary.
     * For example, in case of an error or success.
     * </pre>
     *
     * <code>
     * .google.chat.v1.ActionStatus action_status = 2 [(.google.api.field_behavior) = INPUT_ONLY];
     * </code>
     */
    public Builder setActionStatus(com.google.chat.v1.ActionStatus value) {
      if (actionStatusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        actionStatus_ = value;
      } else {
        actionStatusBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Input only. Status for a request to either invoke or submit a
     * [dialog](https://developers.google.com/workspace/chat/dialogs). Displays
     * a status and message to users, if necessary.
     * For example, in case of an error or success.
     * </pre>
     *
     * <code>
     * .google.chat.v1.ActionStatus action_status = 2 [(.google.api.field_behavior) = INPUT_ONLY];
     * </code>
     */
    public Builder setActionStatus(com.google.chat.v1.ActionStatus.Builder builderForValue) {
      if (actionStatusBuilder_ == null) {
        actionStatus_ = builderForValue.build();
      } else {
        actionStatusBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Input only. Status for a request to either invoke or submit a
     * [dialog](https://developers.google.com/workspace/chat/dialogs). Displays
     * a status and message to users, if necessary.
     * For example, in case of an error or success.
     * </pre>
     *
     * <code>
     * .google.chat.v1.ActionStatus action_status = 2 [(.google.api.field_behavior) = INPUT_ONLY];
     * </code>
     */
    public Builder mergeActionStatus(com.google.chat.v1.ActionStatus value) {
      if (actionStatusBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && actionStatus_ != null
            && actionStatus_ != com.google.chat.v1.ActionStatus.getDefaultInstance()) {
          getActionStatusBuilder().mergeFrom(value);
        } else {
          actionStatus_ = value;
        }
      } else {
        actionStatusBuilder_.mergeFrom(value);
      }
      if (actionStatus_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Input only. Status for a request to either invoke or submit a
     * [dialog](https://developers.google.com/workspace/chat/dialogs). Displays
     * a status and message to users, if necessary.
     * For example, in case of an error or success.
     * </pre>
     *
     * <code>
     * .google.chat.v1.ActionStatus action_status = 2 [(.google.api.field_behavior) = INPUT_ONLY];
     * </code>
     */
    public Builder clearActionStatus() {
      bitField0_ = (bitField0_ & ~0x00000002);
      actionStatus_ = null;
      if (actionStatusBuilder_ != null) {
        actionStatusBuilder_.dispose();
        actionStatusBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Input only. Status for a request to either invoke or submit a
     * [dialog](https://developers.google.com/workspace/chat/dialogs). Displays
     * a status and message to users, if necessary.
     * For example, in case of an error or success.
     * </pre>
     *
     * <code>
     * .google.chat.v1.ActionStatus action_status = 2 [(.google.api.field_behavior) = INPUT_ONLY];
     * </code>
     */
    public com.google.chat.v1.ActionStatus.Builder getActionStatusBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getActionStatusFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Input only. Status for a request to either invoke or submit a
     * [dialog](https://developers.google.com/workspace/chat/dialogs). Displays
     * a status and message to users, if necessary.
     * For example, in case of an error or success.
     * </pre>
     *
     * <code>
     * .google.chat.v1.ActionStatus action_status = 2 [(.google.api.field_behavior) = INPUT_ONLY];
     * </code>
     */
    public com.google.chat.v1.ActionStatusOrBuilder getActionStatusOrBuilder() {
      if (actionStatusBuilder_ != null) {
        return actionStatusBuilder_.getMessageOrBuilder();
      } else {
        return actionStatus_ == null
            ? com.google.chat.v1.ActionStatus.getDefaultInstance()
            : actionStatus_;
      }
    }
    /**
     *
     *
     * <pre>
     * Input only. Status for a request to either invoke or submit a
     * [dialog](https://developers.google.com/workspace/chat/dialogs). Displays
     * a status and message to users, if necessary.
     * For example, in case of an error or success.
     * </pre>
     *
     * <code>
     * .google.chat.v1.ActionStatus action_status = 2 [(.google.api.field_behavior) = INPUT_ONLY];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.chat.v1.ActionStatus,
            com.google.chat.v1.ActionStatus.Builder,
            com.google.chat.v1.ActionStatusOrBuilder>
        getActionStatusFieldBuilder() {
      if (actionStatusBuilder_ == null) {
        actionStatusBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.chat.v1.ActionStatus,
                com.google.chat.v1.ActionStatus.Builder,
                com.google.chat.v1.ActionStatusOrBuilder>(
                getActionStatus(), getParentForChildren(), isClean());
        actionStatus_ = null;
      }
      return actionStatusBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.chat.v1.DialogAction)
  }

  // @@protoc_insertion_point(class_scope:google.chat.v1.DialogAction)
  private static final com.google.chat.v1.DialogAction DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.chat.v1.DialogAction();
  }

  public static com.google.chat.v1.DialogAction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DialogAction> PARSER =
      new com.google.protobuf.AbstractParser<DialogAction>() {
        @java.lang.Override
        public DialogAction parsePartialFrom(
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

  public static com.google.protobuf.Parser<DialogAction> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DialogAction> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.chat.v1.DialogAction getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
