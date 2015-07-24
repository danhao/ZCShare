// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: main/resources/com/zc/messages/player/AlertMsg.proto

package com.zc.web.message.player;

public final class AlertMsgProto {
  private AlertMsgProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface AlertMsgOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional int64 id = 1;
    /**
     * <code>optional int64 id = 1;</code>
     *
     * <pre>
     *id
     * </pre>
     */
    boolean hasId();
    /**
     * <code>optional int64 id = 1;</code>
     *
     * <pre>
     *id
     * </pre>
     */
    long getId();

    // optional int32 money = 2;
    /**
     * <code>optional int32 money = 2;</code>
     *
     * <pre>
     * 金额
     * </pre>
     */
    boolean hasMoney();
    /**
     * <code>optional int32 money = 2;</code>
     *
     * <pre>
     * 金额
     * </pre>
     */
    int getMoney();

    // optional string location = 3;
    /**
     * <code>optional string location = 3;</code>
     *
     * <pre>
     * 地点
     * </pre>
     */
    boolean hasLocation();
    /**
     * <code>optional string location = 3;</code>
     *
     * <pre>
     * 地点
     * </pre>
     */
    java.lang.String getLocation();
    /**
     * <code>optional string location = 3;</code>
     *
     * <pre>
     * 地点
     * </pre>
     */
    com.google.protobuf.ByteString
        getLocationBytes();

    // optional int32 rate = 4;
    /**
     * <code>optional int32 rate = 4;</code>
     *
     * <pre>
     * 费率
     * </pre>
     */
    boolean hasRate();
    /**
     * <code>optional int32 rate = 4;</code>
     *
     * <pre>
     * 费率
     * </pre>
     */
    int getRate();
  }
  /**
   * Protobuf type {@code com.zc.web.message.player.AlertMsg}
   */
  public static final class AlertMsg extends
      com.google.protobuf.GeneratedMessage
      implements AlertMsgOrBuilder {
    // Use AlertMsg.newBuilder() to construct.
    private AlertMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private AlertMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final AlertMsg defaultInstance;
    public static AlertMsg getDefaultInstance() {
      return defaultInstance;
    }

    public AlertMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private AlertMsg(
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
              id_ = input.readInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              money_ = input.readInt32();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              location_ = input.readBytes();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              rate_ = input.readInt32();
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
      return com.zc.web.message.player.AlertMsgProto.internal_static_com_zc_web_message_player_AlertMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.zc.web.message.player.AlertMsgProto.internal_static_com_zc_web_message_player_AlertMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zc.web.message.player.AlertMsgProto.AlertMsg.class, com.zc.web.message.player.AlertMsgProto.AlertMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<AlertMsg> PARSER =
        new com.google.protobuf.AbstractParser<AlertMsg>() {
      public AlertMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AlertMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<AlertMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional int64 id = 1;
    public static final int ID_FIELD_NUMBER = 1;
    private long id_;
    /**
     * <code>optional int64 id = 1;</code>
     *
     * <pre>
     *id
     * </pre>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int64 id = 1;</code>
     *
     * <pre>
     *id
     * </pre>
     */
    public long getId() {
      return id_;
    }

    // optional int32 money = 2;
    public static final int MONEY_FIELD_NUMBER = 2;
    private int money_;
    /**
     * <code>optional int32 money = 2;</code>
     *
     * <pre>
     * 金额
     * </pre>
     */
    public boolean hasMoney() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 money = 2;</code>
     *
     * <pre>
     * 金额
     * </pre>
     */
    public int getMoney() {
      return money_;
    }

    // optional string location = 3;
    public static final int LOCATION_FIELD_NUMBER = 3;
    private java.lang.Object location_;
    /**
     * <code>optional string location = 3;</code>
     *
     * <pre>
     * 地点
     * </pre>
     */
    public boolean hasLocation() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string location = 3;</code>
     *
     * <pre>
     * 地点
     * </pre>
     */
    public java.lang.String getLocation() {
      java.lang.Object ref = location_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          location_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string location = 3;</code>
     *
     * <pre>
     * 地点
     * </pre>
     */
    public com.google.protobuf.ByteString
        getLocationBytes() {
      java.lang.Object ref = location_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        location_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional int32 rate = 4;
    public static final int RATE_FIELD_NUMBER = 4;
    private int rate_;
    /**
     * <code>optional int32 rate = 4;</code>
     *
     * <pre>
     * 费率
     * </pre>
     */
    public boolean hasRate() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional int32 rate = 4;</code>
     *
     * <pre>
     * 费率
     * </pre>
     */
    public int getRate() {
      return rate_;
    }

    private void initFields() {
      id_ = 0L;
      money_ = 0;
      location_ = "";
      rate_ = 0;
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
        output.writeInt64(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, money_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getLocationBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, rate_);
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
          .computeInt64Size(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, money_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getLocationBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, rate_);
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

    public static com.zc.web.message.player.AlertMsgProto.AlertMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zc.web.message.player.AlertMsgProto.AlertMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zc.web.message.player.AlertMsgProto.AlertMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zc.web.message.player.AlertMsgProto.AlertMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zc.web.message.player.AlertMsgProto.AlertMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.zc.web.message.player.AlertMsgProto.AlertMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.zc.web.message.player.AlertMsgProto.AlertMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.zc.web.message.player.AlertMsgProto.AlertMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.zc.web.message.player.AlertMsgProto.AlertMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.zc.web.message.player.AlertMsgProto.AlertMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.zc.web.message.player.AlertMsgProto.AlertMsg prototype) {
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
     * Protobuf type {@code com.zc.web.message.player.AlertMsg}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.zc.web.message.player.AlertMsgProto.AlertMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.zc.web.message.player.AlertMsgProto.internal_static_com_zc_web_message_player_AlertMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.zc.web.message.player.AlertMsgProto.internal_static_com_zc_web_message_player_AlertMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.zc.web.message.player.AlertMsgProto.AlertMsg.class, com.zc.web.message.player.AlertMsgProto.AlertMsg.Builder.class);
      }

      // Construct using com.zc.web.message.player.AlertMsgProto.AlertMsg.newBuilder()
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
        id_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        money_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        location_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        rate_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.zc.web.message.player.AlertMsgProto.internal_static_com_zc_web_message_player_AlertMsg_descriptor;
      }

      public com.zc.web.message.player.AlertMsgProto.AlertMsg getDefaultInstanceForType() {
        return com.zc.web.message.player.AlertMsgProto.AlertMsg.getDefaultInstance();
      }

      public com.zc.web.message.player.AlertMsgProto.AlertMsg build() {
        com.zc.web.message.player.AlertMsgProto.AlertMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.zc.web.message.player.AlertMsgProto.AlertMsg buildPartial() {
        com.zc.web.message.player.AlertMsgProto.AlertMsg result = new com.zc.web.message.player.AlertMsgProto.AlertMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.money_ = money_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.location_ = location_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.rate_ = rate_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.zc.web.message.player.AlertMsgProto.AlertMsg) {
          return mergeFrom((com.zc.web.message.player.AlertMsgProto.AlertMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.zc.web.message.player.AlertMsgProto.AlertMsg other) {
        if (other == com.zc.web.message.player.AlertMsgProto.AlertMsg.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasMoney()) {
          setMoney(other.getMoney());
        }
        if (other.hasLocation()) {
          bitField0_ |= 0x00000004;
          location_ = other.location_;
          onChanged();
        }
        if (other.hasRate()) {
          setRate(other.getRate());
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
        com.zc.web.message.player.AlertMsgProto.AlertMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.zc.web.message.player.AlertMsgProto.AlertMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional int64 id = 1;
      private long id_ ;
      /**
       * <code>optional int64 id = 1;</code>
       *
       * <pre>
       *id
       * </pre>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int64 id = 1;</code>
       *
       * <pre>
       *id
       * </pre>
       */
      public long getId() {
        return id_;
      }
      /**
       * <code>optional int64 id = 1;</code>
       *
       * <pre>
       *id
       * </pre>
       */
      public Builder setId(long value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 id = 1;</code>
       *
       * <pre>
       *id
       * </pre>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0L;
        onChanged();
        return this;
      }

      // optional int32 money = 2;
      private int money_ ;
      /**
       * <code>optional int32 money = 2;</code>
       *
       * <pre>
       * 金额
       * </pre>
       */
      public boolean hasMoney() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 money = 2;</code>
       *
       * <pre>
       * 金额
       * </pre>
       */
      public int getMoney() {
        return money_;
      }
      /**
       * <code>optional int32 money = 2;</code>
       *
       * <pre>
       * 金额
       * </pre>
       */
      public Builder setMoney(int value) {
        bitField0_ |= 0x00000002;
        money_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 money = 2;</code>
       *
       * <pre>
       * 金额
       * </pre>
       */
      public Builder clearMoney() {
        bitField0_ = (bitField0_ & ~0x00000002);
        money_ = 0;
        onChanged();
        return this;
      }

      // optional string location = 3;
      private java.lang.Object location_ = "";
      /**
       * <code>optional string location = 3;</code>
       *
       * <pre>
       * 地点
       * </pre>
       */
      public boolean hasLocation() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string location = 3;</code>
       *
       * <pre>
       * 地点
       * </pre>
       */
      public java.lang.String getLocation() {
        java.lang.Object ref = location_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          location_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string location = 3;</code>
       *
       * <pre>
       * 地点
       * </pre>
       */
      public com.google.protobuf.ByteString
          getLocationBytes() {
        java.lang.Object ref = location_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          location_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string location = 3;</code>
       *
       * <pre>
       * 地点
       * </pre>
       */
      public Builder setLocation(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        location_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string location = 3;</code>
       *
       * <pre>
       * 地点
       * </pre>
       */
      public Builder clearLocation() {
        bitField0_ = (bitField0_ & ~0x00000004);
        location_ = getDefaultInstance().getLocation();
        onChanged();
        return this;
      }
      /**
       * <code>optional string location = 3;</code>
       *
       * <pre>
       * 地点
       * </pre>
       */
      public Builder setLocationBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        location_ = value;
        onChanged();
        return this;
      }

      // optional int32 rate = 4;
      private int rate_ ;
      /**
       * <code>optional int32 rate = 4;</code>
       *
       * <pre>
       * 费率
       * </pre>
       */
      public boolean hasRate() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional int32 rate = 4;</code>
       *
       * <pre>
       * 费率
       * </pre>
       */
      public int getRate() {
        return rate_;
      }
      /**
       * <code>optional int32 rate = 4;</code>
       *
       * <pre>
       * 费率
       * </pre>
       */
      public Builder setRate(int value) {
        bitField0_ |= 0x00000008;
        rate_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 rate = 4;</code>
       *
       * <pre>
       * 费率
       * </pre>
       */
      public Builder clearRate() {
        bitField0_ = (bitField0_ & ~0x00000008);
        rate_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.zc.web.message.player.AlertMsg)
    }

    static {
      defaultInstance = new AlertMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.zc.web.message.player.AlertMsg)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_zc_web_message_player_AlertMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_zc_web_message_player_AlertMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4main/resources/com/zc/messages/player/" +
      "AlertMsg.proto\022\031com.zc.web.message.playe" +
      "r\"E\n\010AlertMsg\022\n\n\002id\030\001 \001(\003\022\r\n\005money\030\002 \001(\005" +
      "\022\020\n\010location\030\003 \001(\t\022\014\n\004rate\030\004 \001(\005B\017B\rAler" +
      "tMsgProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_zc_web_message_player_AlertMsg_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_zc_web_message_player_AlertMsg_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_zc_web_message_player_AlertMsg_descriptor,
              new java.lang.String[] { "Id", "Money", "Location", "Rate", });
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