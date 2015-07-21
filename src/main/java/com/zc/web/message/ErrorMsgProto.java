// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: main/resources/com/zc/messages/ErrorMsg.proto

package com.zc.web.message;

public final class ErrorMsgProto {
  private ErrorMsgProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ErrorMsgOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional int32 code = 1;
    /**
     * <code>optional int32 code = 1;</code>
     *
     * <pre>
     *错误码
     * </pre>
     */
    boolean hasCode();
    /**
     * <code>optional int32 code = 1;</code>
     *
     * <pre>
     *错误码
     * </pre>
     */
    int getCode();

    // optional string text = 2;
    /**
     * <code>optional string text = 2;</code>
     *
     * <pre>
     *错误信息
     * </pre>
     */
    boolean hasText();
    /**
     * <code>optional string text = 2;</code>
     *
     * <pre>
     *错误信息
     * </pre>
     */
    java.lang.String getText();
    /**
     * <code>optional string text = 2;</code>
     *
     * <pre>
     *错误信息
     * </pre>
     */
    com.google.protobuf.ByteString
        getTextBytes();

    // optional string extraData = 3;
    /**
     * <code>optional string extraData = 3;</code>
     *
     * <pre>
     *额外数据
     * </pre>
     */
    boolean hasExtraData();
    /**
     * <code>optional string extraData = 3;</code>
     *
     * <pre>
     *额外数据
     * </pre>
     */
    java.lang.String getExtraData();
    /**
     * <code>optional string extraData = 3;</code>
     *
     * <pre>
     *额外数据
     * </pre>
     */
    com.google.protobuf.ByteString
        getExtraDataBytes();
  }
  /**
   * Protobuf type {@code com.zc.web.message.ErrorMsg}
   */
  public static final class ErrorMsg extends
      com.google.protobuf.GeneratedMessage
      implements ErrorMsgOrBuilder {
    // Use ErrorMsg.newBuilder() to construct.
    private ErrorMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ErrorMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ErrorMsg defaultInstance;
    public static ErrorMsg getDefaultInstance() {
      return defaultInstance;
    }

    public ErrorMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ErrorMsg(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              code_ = input.readInt32();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              text_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              extraData_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.zc.web.message.ErrorMsgProto.internal_static_com_zc_web_message_ErrorMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.zc.web.message.ErrorMsgProto.internal_static_com_zc_web_message_ErrorMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zc.web.message.ErrorMsgProto.ErrorMsg.class, com.zc.web.message.ErrorMsgProto.ErrorMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<ErrorMsg> PARSER =
        new com.google.protobuf.AbstractParser<ErrorMsg>() {
      public ErrorMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ErrorMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ErrorMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional int32 code = 1;
    public static final int CODE_FIELD_NUMBER = 1;
    private int code_;
    /**
     * <code>optional int32 code = 1;</code>
     *
     * <pre>
     *错误码
     * </pre>
     */
    public boolean hasCode() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 code = 1;</code>
     *
     * <pre>
     *错误码
     * </pre>
     */
    public int getCode() {
      return code_;
    }

    // optional string text = 2;
    public static final int TEXT_FIELD_NUMBER = 2;
    private java.lang.Object text_;
    /**
     * <code>optional string text = 2;</code>
     *
     * <pre>
     *错误信息
     * </pre>
     */
    public boolean hasText() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string text = 2;</code>
     *
     * <pre>
     *错误信息
     * </pre>
     */
    public java.lang.String getText() {
      java.lang.Object ref = text_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          text_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string text = 2;</code>
     *
     * <pre>
     *错误信息
     * </pre>
     */
    public com.google.protobuf.ByteString
        getTextBytes() {
      java.lang.Object ref = text_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        text_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional string extraData = 3;
    public static final int EXTRADATA_FIELD_NUMBER = 3;
    private java.lang.Object extraData_;
    /**
     * <code>optional string extraData = 3;</code>
     *
     * <pre>
     *额外数据
     * </pre>
     */
    public boolean hasExtraData() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string extraData = 3;</code>
     *
     * <pre>
     *额外数据
     * </pre>
     */
    public java.lang.String getExtraData() {
      java.lang.Object ref = extraData_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          extraData_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string extraData = 3;</code>
     *
     * <pre>
     *额外数据
     * </pre>
     */
    public com.google.protobuf.ByteString
        getExtraDataBytes() {
      java.lang.Object ref = extraData_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        extraData_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      code_ = 0;
      text_ = "";
      extraData_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, code_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getTextBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getExtraDataBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, code_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getTextBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getExtraDataBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.zc.web.message.ErrorMsgProto.ErrorMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zc.web.message.ErrorMsgProto.ErrorMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zc.web.message.ErrorMsgProto.ErrorMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zc.web.message.ErrorMsgProto.ErrorMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zc.web.message.ErrorMsgProto.ErrorMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.zc.web.message.ErrorMsgProto.ErrorMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.zc.web.message.ErrorMsgProto.ErrorMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.zc.web.message.ErrorMsgProto.ErrorMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.zc.web.message.ErrorMsgProto.ErrorMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.zc.web.message.ErrorMsgProto.ErrorMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.zc.web.message.ErrorMsgProto.ErrorMsg prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.zc.web.message.ErrorMsg}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.zc.web.message.ErrorMsgProto.ErrorMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.zc.web.message.ErrorMsgProto.internal_static_com_zc_web_message_ErrorMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.zc.web.message.ErrorMsgProto.internal_static_com_zc_web_message_ErrorMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.zc.web.message.ErrorMsgProto.ErrorMsg.class, com.zc.web.message.ErrorMsgProto.ErrorMsg.Builder.class);
      }

      // Construct using com.zc.web.message.ErrorMsgProto.ErrorMsg.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        code_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        text_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        extraData_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.zc.web.message.ErrorMsgProto.internal_static_com_zc_web_message_ErrorMsg_descriptor;
      }

      public com.zc.web.message.ErrorMsgProto.ErrorMsg getDefaultInstanceForType() {
        return com.zc.web.message.ErrorMsgProto.ErrorMsg.getDefaultInstance();
      }

      public com.zc.web.message.ErrorMsgProto.ErrorMsg build() {
        com.zc.web.message.ErrorMsgProto.ErrorMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.zc.web.message.ErrorMsgProto.ErrorMsg buildPartial() {
        com.zc.web.message.ErrorMsgProto.ErrorMsg result = new com.zc.web.message.ErrorMsgProto.ErrorMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.code_ = code_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.text_ = text_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.extraData_ = extraData_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.zc.web.message.ErrorMsgProto.ErrorMsg) {
          return mergeFrom((com.zc.web.message.ErrorMsgProto.ErrorMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.zc.web.message.ErrorMsgProto.ErrorMsg other) {
        if (other == com.zc.web.message.ErrorMsgProto.ErrorMsg.getDefaultInstance()) return this;
        if (other.hasCode()) {
          setCode(other.getCode());
        }
        if (other.hasText()) {
          bitField0_ |= 0x00000002;
          text_ = other.text_;
          onChanged();
        }
        if (other.hasExtraData()) {
          bitField0_ |= 0x00000004;
          extraData_ = other.extraData_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.zc.web.message.ErrorMsgProto.ErrorMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.zc.web.message.ErrorMsgProto.ErrorMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional int32 code = 1;
      private int code_ ;
      /**
       * <code>optional int32 code = 1;</code>
       *
       * <pre>
       *错误码
       * </pre>
       */
      public boolean hasCode() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 code = 1;</code>
       *
       * <pre>
       *错误码
       * </pre>
       */
      public int getCode() {
        return code_;
      }
      /**
       * <code>optional int32 code = 1;</code>
       *
       * <pre>
       *错误码
       * </pre>
       */
      public Builder setCode(int value) {
        bitField0_ |= 0x00000001;
        code_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 code = 1;</code>
       *
       * <pre>
       *错误码
       * </pre>
       */
      public Builder clearCode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        code_ = 0;
        onChanged();
        return this;
      }

      // optional string text = 2;
      private java.lang.Object text_ = "";
      /**
       * <code>optional string text = 2;</code>
       *
       * <pre>
       *错误信息
       * </pre>
       */
      public boolean hasText() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string text = 2;</code>
       *
       * <pre>
       *错误信息
       * </pre>
       */
      public java.lang.String getText() {
        java.lang.Object ref = text_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          text_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string text = 2;</code>
       *
       * <pre>
       *错误信息
       * </pre>
       */
      public com.google.protobuf.ByteString
          getTextBytes() {
        java.lang.Object ref = text_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          text_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string text = 2;</code>
       *
       * <pre>
       *错误信息
       * </pre>
       */
      public Builder setText(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        text_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string text = 2;</code>
       *
       * <pre>
       *错误信息
       * </pre>
       */
      public Builder clearText() {
        bitField0_ = (bitField0_ & ~0x00000002);
        text_ = getDefaultInstance().getText();
        onChanged();
        return this;
      }
      /**
       * <code>optional string text = 2;</code>
       *
       * <pre>
       *错误信息
       * </pre>
       */
      public Builder setTextBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        text_ = value;
        onChanged();
        return this;
      }

      // optional string extraData = 3;
      private java.lang.Object extraData_ = "";
      /**
       * <code>optional string extraData = 3;</code>
       *
       * <pre>
       *额外数据
       * </pre>
       */
      public boolean hasExtraData() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string extraData = 3;</code>
       *
       * <pre>
       *额外数据
       * </pre>
       */
      public java.lang.String getExtraData() {
        java.lang.Object ref = extraData_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          extraData_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string extraData = 3;</code>
       *
       * <pre>
       *额外数据
       * </pre>
       */
      public com.google.protobuf.ByteString
          getExtraDataBytes() {
        java.lang.Object ref = extraData_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          extraData_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string extraData = 3;</code>
       *
       * <pre>
       *额外数据
       * </pre>
       */
      public Builder setExtraData(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        extraData_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string extraData = 3;</code>
       *
       * <pre>
       *额外数据
       * </pre>
       */
      public Builder clearExtraData() {
        bitField0_ = (bitField0_ & ~0x00000004);
        extraData_ = getDefaultInstance().getExtraData();
        onChanged();
        return this;
      }
      /**
       * <code>optional string extraData = 3;</code>
       *
       * <pre>
       *额外数据
       * </pre>
       */
      public Builder setExtraDataBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        extraData_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.zc.web.message.ErrorMsg)
    }

    static {
      defaultInstance = new ErrorMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.zc.web.message.ErrorMsg)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_zc_web_message_ErrorMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_zc_web_message_ErrorMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-main/resources/com/zc/messages/ErrorMs" +
      "g.proto\022\022com.zc.web.message\"9\n\010ErrorMsg\022" +
      "\014\n\004code\030\001 \001(\005\022\014\n\004text\030\002 \001(\t\022\021\n\textraData" +
      "\030\003 \001(\tB\017B\rErrorMsgProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_zc_web_message_ErrorMsg_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_zc_web_message_ErrorMsg_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_zc_web_message_ErrorMsg_descriptor,
              new java.lang.String[] { "Code", "Text", "ExtraData", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
