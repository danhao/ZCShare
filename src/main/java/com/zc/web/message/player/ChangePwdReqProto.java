// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: main/resources/com/zc/messages/player/ChangePwdReq.proto

package com.zc.web.message.player;

public final class ChangePwdReqProto {
  private ChangePwdReqProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ChangePwdReqOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional string email = 1;
    /**
     * <code>optional string email = 1;</code>
     */
    boolean hasEmail();
    /**
     * <code>optional string email = 1;</code>
     */
    java.lang.String getEmail();
    /**
     * <code>optional string email = 1;</code>
     */
    com.google.protobuf.ByteString
        getEmailBytes();

    // optional string mobile = 2;
    /**
     * <code>optional string mobile = 2;</code>
     */
    boolean hasMobile();
    /**
     * <code>optional string mobile = 2;</code>
     */
    java.lang.String getMobile();
    /**
     * <code>optional string mobile = 2;</code>
     */
    com.google.protobuf.ByteString
        getMobileBytes();

    // optional int32 code = 3;
    /**
     * <code>optional int32 code = 3;</code>
     *
     * <pre>
     * 验证时需要传
     * </pre>
     */
    boolean hasCode();
    /**
     * <code>optional int32 code = 3;</code>
     *
     * <pre>
     * 验证时需要传
     * </pre>
     */
    int getCode();

    // optional string passwd = 4;
    /**
     * <code>optional string passwd = 4;</code>
     *
     * <pre>
     * 重置密码需要传
     * </pre>
     */
    boolean hasPasswd();
    /**
     * <code>optional string passwd = 4;</code>
     *
     * <pre>
     * 重置密码需要传
     * </pre>
     */
    java.lang.String getPasswd();
    /**
     * <code>optional string passwd = 4;</code>
     *
     * <pre>
     * 重置密码需要传
     * </pre>
     */
    com.google.protobuf.ByteString
        getPasswdBytes();
  }
  /**
   * Protobuf type {@code com.zc.web.message.player.ChangePwdReq}
   */
  public static final class ChangePwdReq extends
      com.google.protobuf.GeneratedMessage
      implements ChangePwdReqOrBuilder {
    // Use ChangePwdReq.newBuilder() to construct.
    private ChangePwdReq(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ChangePwdReq(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ChangePwdReq defaultInstance;
    public static ChangePwdReq getDefaultInstance() {
      return defaultInstance;
    }

    public ChangePwdReq getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ChangePwdReq(
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
            case 10: {
              bitField0_ |= 0x00000001;
              email_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              mobile_ = input.readBytes();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              code_ = input.readInt32();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              passwd_ = input.readBytes();
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
      return com.zc.web.message.player.ChangePwdReqProto.internal_static_com_zc_web_message_player_ChangePwdReq_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.zc.web.message.player.ChangePwdReqProto.internal_static_com_zc_web_message_player_ChangePwdReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zc.web.message.player.ChangePwdReqProto.ChangePwdReq.class, com.zc.web.message.player.ChangePwdReqProto.ChangePwdReq.Builder.class);
    }

    public static com.google.protobuf.Parser<ChangePwdReq> PARSER =
        new com.google.protobuf.AbstractParser<ChangePwdReq>() {
      public ChangePwdReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChangePwdReq(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ChangePwdReq> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional string email = 1;
    public static final int EMAIL_FIELD_NUMBER = 1;
    private java.lang.Object email_;
    /**
     * <code>optional string email = 1;</code>
     */
    public boolean hasEmail() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string email = 1;</code>
     */
    public java.lang.String getEmail() {
      java.lang.Object ref = email_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          email_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string email = 1;</code>
     */
    public com.google.protobuf.ByteString
        getEmailBytes() {
      java.lang.Object ref = email_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        email_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional string mobile = 2;
    public static final int MOBILE_FIELD_NUMBER = 2;
    private java.lang.Object mobile_;
    /**
     * <code>optional string mobile = 2;</code>
     */
    public boolean hasMobile() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string mobile = 2;</code>
     */
    public java.lang.String getMobile() {
      java.lang.Object ref = mobile_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          mobile_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string mobile = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMobileBytes() {
      java.lang.Object ref = mobile_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mobile_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional int32 code = 3;
    public static final int CODE_FIELD_NUMBER = 3;
    private int code_;
    /**
     * <code>optional int32 code = 3;</code>
     *
     * <pre>
     * 验证时需要传
     * </pre>
     */
    public boolean hasCode() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int32 code = 3;</code>
     *
     * <pre>
     * 验证时需要传
     * </pre>
     */
    public int getCode() {
      return code_;
    }

    // optional string passwd = 4;
    public static final int PASSWD_FIELD_NUMBER = 4;
    private java.lang.Object passwd_;
    /**
     * <code>optional string passwd = 4;</code>
     *
     * <pre>
     * 重置密码需要传
     * </pre>
     */
    public boolean hasPasswd() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional string passwd = 4;</code>
     *
     * <pre>
     * 重置密码需要传
     * </pre>
     */
    public java.lang.String getPasswd() {
      java.lang.Object ref = passwd_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          passwd_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string passwd = 4;</code>
     *
     * <pre>
     * 重置密码需要传
     * </pre>
     */
    public com.google.protobuf.ByteString
        getPasswdBytes() {
      java.lang.Object ref = passwd_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        passwd_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      email_ = "";
      mobile_ = "";
      code_ = 0;
      passwd_ = "";
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
        output.writeBytes(1, getEmailBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getMobileBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, code_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getPasswdBytes());
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
          .computeBytesSize(1, getEmailBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getMobileBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, code_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getPasswdBytes());
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

    public static com.zc.web.message.player.ChangePwdReqProto.ChangePwdReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zc.web.message.player.ChangePwdReqProto.ChangePwdReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zc.web.message.player.ChangePwdReqProto.ChangePwdReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zc.web.message.player.ChangePwdReqProto.ChangePwdReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zc.web.message.player.ChangePwdReqProto.ChangePwdReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.zc.web.message.player.ChangePwdReqProto.ChangePwdReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.zc.web.message.player.ChangePwdReqProto.ChangePwdReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.zc.web.message.player.ChangePwdReqProto.ChangePwdReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.zc.web.message.player.ChangePwdReqProto.ChangePwdReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.zc.web.message.player.ChangePwdReqProto.ChangePwdReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.zc.web.message.player.ChangePwdReqProto.ChangePwdReq prototype) {
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
     * Protobuf type {@code com.zc.web.message.player.ChangePwdReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.zc.web.message.player.ChangePwdReqProto.ChangePwdReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.zc.web.message.player.ChangePwdReqProto.internal_static_com_zc_web_message_player_ChangePwdReq_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.zc.web.message.player.ChangePwdReqProto.internal_static_com_zc_web_message_player_ChangePwdReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.zc.web.message.player.ChangePwdReqProto.ChangePwdReq.class, com.zc.web.message.player.ChangePwdReqProto.ChangePwdReq.Builder.class);
      }

      // Construct using com.zc.web.message.player.ChangePwdReqProto.ChangePwdReq.newBuilder()
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
        email_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        mobile_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        code_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        passwd_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.zc.web.message.player.ChangePwdReqProto.internal_static_com_zc_web_message_player_ChangePwdReq_descriptor;
      }

      public com.zc.web.message.player.ChangePwdReqProto.ChangePwdReq getDefaultInstanceForType() {
        return com.zc.web.message.player.ChangePwdReqProto.ChangePwdReq.getDefaultInstance();
      }

      public com.zc.web.message.player.ChangePwdReqProto.ChangePwdReq build() {
        com.zc.web.message.player.ChangePwdReqProto.ChangePwdReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.zc.web.message.player.ChangePwdReqProto.ChangePwdReq buildPartial() {
        com.zc.web.message.player.ChangePwdReqProto.ChangePwdReq result = new com.zc.web.message.player.ChangePwdReqProto.ChangePwdReq(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.email_ = email_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.mobile_ = mobile_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.code_ = code_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.passwd_ = passwd_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.zc.web.message.player.ChangePwdReqProto.ChangePwdReq) {
          return mergeFrom((com.zc.web.message.player.ChangePwdReqProto.ChangePwdReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.zc.web.message.player.ChangePwdReqProto.ChangePwdReq other) {
        if (other == com.zc.web.message.player.ChangePwdReqProto.ChangePwdReq.getDefaultInstance()) return this;
        if (other.hasEmail()) {
          bitField0_ |= 0x00000001;
          email_ = other.email_;
          onChanged();
        }
        if (other.hasMobile()) {
          bitField0_ |= 0x00000002;
          mobile_ = other.mobile_;
          onChanged();
        }
        if (other.hasCode()) {
          setCode(other.getCode());
        }
        if (other.hasPasswd()) {
          bitField0_ |= 0x00000008;
          passwd_ = other.passwd_;
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
        com.zc.web.message.player.ChangePwdReqProto.ChangePwdReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.zc.web.message.player.ChangePwdReqProto.ChangePwdReq) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional string email = 1;
      private java.lang.Object email_ = "";
      /**
       * <code>optional string email = 1;</code>
       */
      public boolean hasEmail() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string email = 1;</code>
       */
      public java.lang.String getEmail() {
        java.lang.Object ref = email_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          email_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string email = 1;</code>
       */
      public com.google.protobuf.ByteString
          getEmailBytes() {
        java.lang.Object ref = email_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          email_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string email = 1;</code>
       */
      public Builder setEmail(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        email_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string email = 1;</code>
       */
      public Builder clearEmail() {
        bitField0_ = (bitField0_ & ~0x00000001);
        email_ = getDefaultInstance().getEmail();
        onChanged();
        return this;
      }
      /**
       * <code>optional string email = 1;</code>
       */
      public Builder setEmailBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        email_ = value;
        onChanged();
        return this;
      }

      // optional string mobile = 2;
      private java.lang.Object mobile_ = "";
      /**
       * <code>optional string mobile = 2;</code>
       */
      public boolean hasMobile() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string mobile = 2;</code>
       */
      public java.lang.String getMobile() {
        java.lang.Object ref = mobile_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          mobile_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string mobile = 2;</code>
       */
      public com.google.protobuf.ByteString
          getMobileBytes() {
        java.lang.Object ref = mobile_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          mobile_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string mobile = 2;</code>
       */
      public Builder setMobile(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        mobile_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string mobile = 2;</code>
       */
      public Builder clearMobile() {
        bitField0_ = (bitField0_ & ~0x00000002);
        mobile_ = getDefaultInstance().getMobile();
        onChanged();
        return this;
      }
      /**
       * <code>optional string mobile = 2;</code>
       */
      public Builder setMobileBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        mobile_ = value;
        onChanged();
        return this;
      }

      // optional int32 code = 3;
      private int code_ ;
      /**
       * <code>optional int32 code = 3;</code>
       *
       * <pre>
       * 验证时需要传
       * </pre>
       */
      public boolean hasCode() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional int32 code = 3;</code>
       *
       * <pre>
       * 验证时需要传
       * </pre>
       */
      public int getCode() {
        return code_;
      }
      /**
       * <code>optional int32 code = 3;</code>
       *
       * <pre>
       * 验证时需要传
       * </pre>
       */
      public Builder setCode(int value) {
        bitField0_ |= 0x00000004;
        code_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 code = 3;</code>
       *
       * <pre>
       * 验证时需要传
       * </pre>
       */
      public Builder clearCode() {
        bitField0_ = (bitField0_ & ~0x00000004);
        code_ = 0;
        onChanged();
        return this;
      }

      // optional string passwd = 4;
      private java.lang.Object passwd_ = "";
      /**
       * <code>optional string passwd = 4;</code>
       *
       * <pre>
       * 重置密码需要传
       * </pre>
       */
      public boolean hasPasswd() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional string passwd = 4;</code>
       *
       * <pre>
       * 重置密码需要传
       * </pre>
       */
      public java.lang.String getPasswd() {
        java.lang.Object ref = passwd_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          passwd_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string passwd = 4;</code>
       *
       * <pre>
       * 重置密码需要传
       * </pre>
       */
      public com.google.protobuf.ByteString
          getPasswdBytes() {
        java.lang.Object ref = passwd_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          passwd_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string passwd = 4;</code>
       *
       * <pre>
       * 重置密码需要传
       * </pre>
       */
      public Builder setPasswd(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        passwd_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string passwd = 4;</code>
       *
       * <pre>
       * 重置密码需要传
       * </pre>
       */
      public Builder clearPasswd() {
        bitField0_ = (bitField0_ & ~0x00000008);
        passwd_ = getDefaultInstance().getPasswd();
        onChanged();
        return this;
      }
      /**
       * <code>optional string passwd = 4;</code>
       *
       * <pre>
       * 重置密码需要传
       * </pre>
       */
      public Builder setPasswdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        passwd_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.zc.web.message.player.ChangePwdReq)
    }

    static {
      defaultInstance = new ChangePwdReq(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.zc.web.message.player.ChangePwdReq)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_zc_web_message_player_ChangePwdReq_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_zc_web_message_player_ChangePwdReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8main/resources/com/zc/messages/player/" +
      "ChangePwdReq.proto\022\031com.zc.web.message.p" +
      "layer\"K\n\014ChangePwdReq\022\r\n\005email\030\001 \001(\t\022\016\n\006" +
      "mobile\030\002 \001(\t\022\014\n\004code\030\003 \001(\005\022\016\n\006passwd\030\004 \001" +
      "(\tB\023B\021ChangePwdReqProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_zc_web_message_player_ChangePwdReq_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_zc_web_message_player_ChangePwdReq_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_zc_web_message_player_ChangePwdReq_descriptor,
              new java.lang.String[] { "Email", "Mobile", "Code", "Passwd", });
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
