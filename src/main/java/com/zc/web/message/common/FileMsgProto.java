// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: main/resources/com/zc/messages/common/ContactMsg.proto

package com.zc.web.message.common;

public final class FileMsgProto {
  private FileMsgProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface FileMsgOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional string id = 1;
    /**
     * <code>optional string id = 1;</code>
     */
    boolean hasId();
    /**
     * <code>optional string id = 1;</code>
     */
    java.lang.String getId();
    /**
     * <code>optional string id = 1;</code>
     */
    com.google.protobuf.ByteString
        getIdBytes();

    // optional string name = 2;
    /**
     * <code>optional string name = 2;</code>
     */
    boolean hasName();
    /**
     * <code>optional string name = 2;</code>
     */
    java.lang.String getName();
    /**
     * <code>optional string name = 2;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    // optional string url = 3;
    /**
     * <code>optional string url = 3;</code>
     *
     * <pre>
     * 可下载地址，上传时不需要设置
     * </pre>
     */
    boolean hasUrl();
    /**
     * <code>optional string url = 3;</code>
     *
     * <pre>
     * 可下载地址，上传时不需要设置
     * </pre>
     */
    java.lang.String getUrl();
    /**
     * <code>optional string url = 3;</code>
     *
     * <pre>
     * 可下载地址，上传时不需要设置
     * </pre>
     */
    com.google.protobuf.ByteString
        getUrlBytes();

    // optional int32 state = 4;
    /**
     * <code>optional int32 state = 4;</code>
     *
     * <pre>
     * 0：处理中；1：已处理
     * </pre>
     */
    boolean hasState();
    /**
     * <code>optional int32 state = 4;</code>
     *
     * <pre>
     * 0：处理中；1：已处理
     * </pre>
     */
    int getState();

    // optional int32 createTime = 5;
    /**
     * <code>optional int32 createTime = 5;</code>
     *
     * <pre>
     * 上传时间
     * </pre>
     */
    boolean hasCreateTime();
    /**
     * <code>optional int32 createTime = 5;</code>
     *
     * <pre>
     * 上传时间
     * </pre>
     */
    int getCreateTime();
  }
  /**
   * Protobuf type {@code com.zc.web.message.common.FileMsg}
   */
  public static final class FileMsg extends
      com.google.protobuf.GeneratedMessage
      implements FileMsgOrBuilder {
    // Use FileMsg.newBuilder() to construct.
    private FileMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private FileMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final FileMsg defaultInstance;
    public static FileMsg getDefaultInstance() {
      return defaultInstance;
    }

    public FileMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private FileMsg(
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
              id_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              name_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              url_ = input.readBytes();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              state_ = input.readInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              createTime_ = input.readInt32();
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
      return com.zc.web.message.common.FileMsgProto.internal_static_com_zc_web_message_common_FileMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.zc.web.message.common.FileMsgProto.internal_static_com_zc_web_message_common_FileMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zc.web.message.common.FileMsgProto.FileMsg.class, com.zc.web.message.common.FileMsgProto.FileMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<FileMsg> PARSER =
        new com.google.protobuf.AbstractParser<FileMsg>() {
      public FileMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FileMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<FileMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional string id = 1;
    public static final int ID_FIELD_NUMBER = 1;
    private java.lang.Object id_;
    /**
     * <code>optional string id = 1;</code>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string id = 1;</code>
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          id_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional string name = 2;
    public static final int NAME_FIELD_NUMBER = 2;
    private java.lang.Object name_;
    /**
     * <code>optional string name = 2;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional string url = 3;
    public static final int URL_FIELD_NUMBER = 3;
    private java.lang.Object url_;
    /**
     * <code>optional string url = 3;</code>
     *
     * <pre>
     * 可下载地址，上传时不需要设置
     * </pre>
     */
    public boolean hasUrl() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string url = 3;</code>
     *
     * <pre>
     * 可下载地址，上传时不需要设置
     * </pre>
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          url_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string url = 3;</code>
     *
     * <pre>
     * 可下载地址，上传时不需要设置
     * </pre>
     */
    public com.google.protobuf.ByteString
        getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional int32 state = 4;
    public static final int STATE_FIELD_NUMBER = 4;
    private int state_;
    /**
     * <code>optional int32 state = 4;</code>
     *
     * <pre>
     * 0：处理中；1：已处理
     * </pre>
     */
    public boolean hasState() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional int32 state = 4;</code>
     *
     * <pre>
     * 0：处理中；1：已处理
     * </pre>
     */
    public int getState() {
      return state_;
    }

    // optional int32 createTime = 5;
    public static final int CREATETIME_FIELD_NUMBER = 5;
    private int createTime_;
    /**
     * <code>optional int32 createTime = 5;</code>
     *
     * <pre>
     * 上传时间
     * </pre>
     */
    public boolean hasCreateTime() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional int32 createTime = 5;</code>
     *
     * <pre>
     * 上传时间
     * </pre>
     */
    public int getCreateTime() {
      return createTime_;
    }

    private void initFields() {
      id_ = "";
      name_ = "";
      url_ = "";
      state_ = 0;
      createTime_ = 0;
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
        output.writeBytes(1, getIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getNameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getUrlBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, state_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(5, createTime_);
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
          .computeBytesSize(1, getIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getNameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getUrlBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, state_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, createTime_);
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

    public static com.zc.web.message.common.FileMsgProto.FileMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zc.web.message.common.FileMsgProto.FileMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zc.web.message.common.FileMsgProto.FileMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zc.web.message.common.FileMsgProto.FileMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zc.web.message.common.FileMsgProto.FileMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.zc.web.message.common.FileMsgProto.FileMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.zc.web.message.common.FileMsgProto.FileMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.zc.web.message.common.FileMsgProto.FileMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.zc.web.message.common.FileMsgProto.FileMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.zc.web.message.common.FileMsgProto.FileMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.zc.web.message.common.FileMsgProto.FileMsg prototype) {
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
     * Protobuf type {@code com.zc.web.message.common.FileMsg}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.zc.web.message.common.FileMsgProto.FileMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.zc.web.message.common.FileMsgProto.internal_static_com_zc_web_message_common_FileMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.zc.web.message.common.FileMsgProto.internal_static_com_zc_web_message_common_FileMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.zc.web.message.common.FileMsgProto.FileMsg.class, com.zc.web.message.common.FileMsgProto.FileMsg.Builder.class);
      }

      // Construct using com.zc.web.message.common.FileMsgProto.FileMsg.newBuilder()
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
        id_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        url_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        state_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        createTime_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.zc.web.message.common.FileMsgProto.internal_static_com_zc_web_message_common_FileMsg_descriptor;
      }

      public com.zc.web.message.common.FileMsgProto.FileMsg getDefaultInstanceForType() {
        return com.zc.web.message.common.FileMsgProto.FileMsg.getDefaultInstance();
      }

      public com.zc.web.message.common.FileMsgProto.FileMsg build() {
        com.zc.web.message.common.FileMsgProto.FileMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.zc.web.message.common.FileMsgProto.FileMsg buildPartial() {
        com.zc.web.message.common.FileMsgProto.FileMsg result = new com.zc.web.message.common.FileMsgProto.FileMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.url_ = url_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.state_ = state_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.createTime_ = createTime_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.zc.web.message.common.FileMsgProto.FileMsg) {
          return mergeFrom((com.zc.web.message.common.FileMsgProto.FileMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.zc.web.message.common.FileMsgProto.FileMsg other) {
        if (other == com.zc.web.message.common.FileMsgProto.FileMsg.getDefaultInstance()) return this;
        if (other.hasId()) {
          bitField0_ |= 0x00000001;
          id_ = other.id_;
          onChanged();
        }
        if (other.hasName()) {
          bitField0_ |= 0x00000002;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasUrl()) {
          bitField0_ |= 0x00000004;
          url_ = other.url_;
          onChanged();
        }
        if (other.hasState()) {
          setState(other.getState());
        }
        if (other.hasCreateTime()) {
          setCreateTime(other.getCreateTime());
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
        com.zc.web.message.common.FileMsgProto.FileMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.zc.web.message.common.FileMsgProto.FileMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional string id = 1;
      private java.lang.Object id_ = "";
      /**
       * <code>optional string id = 1;</code>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string id = 1;</code>
       */
      public java.lang.String getId() {
        java.lang.Object ref = id_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          id_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string id = 1;</code>
       */
      public com.google.protobuf.ByteString
          getIdBytes() {
        java.lang.Object ref = id_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          id_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string id = 1;</code>
       */
      public Builder setId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string id = 1;</code>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = getDefaultInstance().getId();
        onChanged();
        return this;
      }
      /**
       * <code>optional string id = 1;</code>
       */
      public Builder setIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }

      // optional string name = 2;
      private java.lang.Object name_ = "";
      /**
       * <code>optional string name = 2;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string name = 2;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string name = 2;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string name = 2;</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 2;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 2;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        name_ = value;
        onChanged();
        return this;
      }

      // optional string url = 3;
      private java.lang.Object url_ = "";
      /**
       * <code>optional string url = 3;</code>
       *
       * <pre>
       * 可下载地址，上传时不需要设置
       * </pre>
       */
      public boolean hasUrl() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string url = 3;</code>
       *
       * <pre>
       * 可下载地址，上传时不需要设置
       * </pre>
       */
      public java.lang.String getUrl() {
        java.lang.Object ref = url_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          url_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string url = 3;</code>
       *
       * <pre>
       * 可下载地址，上传时不需要设置
       * </pre>
       */
      public com.google.protobuf.ByteString
          getUrlBytes() {
        java.lang.Object ref = url_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          url_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string url = 3;</code>
       *
       * <pre>
       * 可下载地址，上传时不需要设置
       * </pre>
       */
      public Builder setUrl(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        url_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string url = 3;</code>
       *
       * <pre>
       * 可下载地址，上传时不需要设置
       * </pre>
       */
      public Builder clearUrl() {
        bitField0_ = (bitField0_ & ~0x00000004);
        url_ = getDefaultInstance().getUrl();
        onChanged();
        return this;
      }
      /**
       * <code>optional string url = 3;</code>
       *
       * <pre>
       * 可下载地址，上传时不需要设置
       * </pre>
       */
      public Builder setUrlBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        url_ = value;
        onChanged();
        return this;
      }

      // optional int32 state = 4;
      private int state_ ;
      /**
       * <code>optional int32 state = 4;</code>
       *
       * <pre>
       * 0：处理中；1：已处理
       * </pre>
       */
      public boolean hasState() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional int32 state = 4;</code>
       *
       * <pre>
       * 0：处理中；1：已处理
       * </pre>
       */
      public int getState() {
        return state_;
      }
      /**
       * <code>optional int32 state = 4;</code>
       *
       * <pre>
       * 0：处理中；1：已处理
       * </pre>
       */
      public Builder setState(int value) {
        bitField0_ |= 0x00000008;
        state_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 state = 4;</code>
       *
       * <pre>
       * 0：处理中；1：已处理
       * </pre>
       */
      public Builder clearState() {
        bitField0_ = (bitField0_ & ~0x00000008);
        state_ = 0;
        onChanged();
        return this;
      }

      // optional int32 createTime = 5;
      private int createTime_ ;
      /**
       * <code>optional int32 createTime = 5;</code>
       *
       * <pre>
       * 上传时间
       * </pre>
       */
      public boolean hasCreateTime() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional int32 createTime = 5;</code>
       *
       * <pre>
       * 上传时间
       * </pre>
       */
      public int getCreateTime() {
        return createTime_;
      }
      /**
       * <code>optional int32 createTime = 5;</code>
       *
       * <pre>
       * 上传时间
       * </pre>
       */
      public Builder setCreateTime(int value) {
        bitField0_ |= 0x00000010;
        createTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 createTime = 5;</code>
       *
       * <pre>
       * 上传时间
       * </pre>
       */
      public Builder clearCreateTime() {
        bitField0_ = (bitField0_ & ~0x00000010);
        createTime_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.zc.web.message.common.FileMsg)
    }

    static {
      defaultInstance = new FileMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.zc.web.message.common.FileMsg)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_zc_web_message_common_FileMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_zc_web_message_common_FileMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6main/resources/com/zc/messages/common/" +
      "ContactMsg.proto\022\031com.zc.web.message.com" +
      "mon\"S\n\007FileMsg\022\n\n\002id\030\001 \001(\t\022\014\n\004name\030\002 \001(\t" +
      "\022\013\n\003url\030\003 \001(\t\022\r\n\005state\030\004 \001(\005\022\022\n\ncreateTi" +
      "me\030\005 \001(\005B\016B\014FileMsgProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_zc_web_message_common_FileMsg_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_zc_web_message_common_FileMsg_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_zc_web_message_common_FileMsg_descriptor,
              new java.lang.String[] { "Id", "Name", "Url", "State", "CreateTime", });
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
