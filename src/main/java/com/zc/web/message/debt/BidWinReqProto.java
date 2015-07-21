// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: main/resources/com/zc/messages/debt/BinWinReq.proto

package com.zc.web.message.debt;

public final class BidWinReqProto {
  private BidWinReqProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BidWinReqOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional string debtId = 1;
    /**
     * <code>optional string debtId = 1;</code>
     *
     * <pre>
     * 债务id
     * </pre>
     */
    boolean hasDebtId();
    /**
     * <code>optional string debtId = 1;</code>
     *
     * <pre>
     * 债务id
     * </pre>
     */
    java.lang.String getDebtId();
    /**
     * <code>optional string debtId = 1;</code>
     *
     * <pre>
     * 债务id
     * </pre>
     */
    com.google.protobuf.ByteString
        getDebtIdBytes();

    // optional string playerId = 2;
    /**
     * <code>optional string playerId = 2;</code>
     *
     * <pre>
     * 用户id
     * </pre>
     */
    boolean hasPlayerId();
    /**
     * <code>optional string playerId = 2;</code>
     *
     * <pre>
     * 用户id
     * </pre>
     */
    java.lang.String getPlayerId();
    /**
     * <code>optional string playerId = 2;</code>
     *
     * <pre>
     * 用户id
     * </pre>
     */
    com.google.protobuf.ByteString
        getPlayerIdBytes();
  }
  /**
   * Protobuf type {@code com.zc.web.message.debt.BidWinReq}
   */
  public static final class BidWinReq extends
      com.google.protobuf.GeneratedMessage
      implements BidWinReqOrBuilder {
    // Use BidWinReq.newBuilder() to construct.
    private BidWinReq(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private BidWinReq(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final BidWinReq defaultInstance;
    public static BidWinReq getDefaultInstance() {
      return defaultInstance;
    }

    public BidWinReq getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private BidWinReq(
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
              debtId_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              playerId_ = input.readBytes();
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
      return com.zc.web.message.debt.BidWinReqProto.internal_static_com_zc_web_message_debt_BidWinReq_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.zc.web.message.debt.BidWinReqProto.internal_static_com_zc_web_message_debt_BidWinReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zc.web.message.debt.BidWinReqProto.BidWinReq.class, com.zc.web.message.debt.BidWinReqProto.BidWinReq.Builder.class);
    }

    public static com.google.protobuf.Parser<BidWinReq> PARSER =
        new com.google.protobuf.AbstractParser<BidWinReq>() {
      public BidWinReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BidWinReq(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<BidWinReq> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional string debtId = 1;
    public static final int DEBTID_FIELD_NUMBER = 1;
    private java.lang.Object debtId_;
    /**
     * <code>optional string debtId = 1;</code>
     *
     * <pre>
     * 债务id
     * </pre>
     */
    public boolean hasDebtId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string debtId = 1;</code>
     *
     * <pre>
     * 债务id
     * </pre>
     */
    public java.lang.String getDebtId() {
      java.lang.Object ref = debtId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          debtId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string debtId = 1;</code>
     *
     * <pre>
     * 债务id
     * </pre>
     */
    public com.google.protobuf.ByteString
        getDebtIdBytes() {
      java.lang.Object ref = debtId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        debtId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional string playerId = 2;
    public static final int PLAYERID_FIELD_NUMBER = 2;
    private java.lang.Object playerId_;
    /**
     * <code>optional string playerId = 2;</code>
     *
     * <pre>
     * 用户id
     * </pre>
     */
    public boolean hasPlayerId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string playerId = 2;</code>
     *
     * <pre>
     * 用户id
     * </pre>
     */
    public java.lang.String getPlayerId() {
      java.lang.Object ref = playerId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          playerId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string playerId = 2;</code>
     *
     * <pre>
     * 用户id
     * </pre>
     */
    public com.google.protobuf.ByteString
        getPlayerIdBytes() {
      java.lang.Object ref = playerId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        playerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      debtId_ = "";
      playerId_ = "";
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
        output.writeBytes(1, getDebtIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getPlayerIdBytes());
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
          .computeBytesSize(1, getDebtIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getPlayerIdBytes());
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

    public static com.zc.web.message.debt.BidWinReqProto.BidWinReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zc.web.message.debt.BidWinReqProto.BidWinReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zc.web.message.debt.BidWinReqProto.BidWinReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zc.web.message.debt.BidWinReqProto.BidWinReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zc.web.message.debt.BidWinReqProto.BidWinReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.zc.web.message.debt.BidWinReqProto.BidWinReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.zc.web.message.debt.BidWinReqProto.BidWinReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.zc.web.message.debt.BidWinReqProto.BidWinReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.zc.web.message.debt.BidWinReqProto.BidWinReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.zc.web.message.debt.BidWinReqProto.BidWinReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.zc.web.message.debt.BidWinReqProto.BidWinReq prototype) {
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
     * Protobuf type {@code com.zc.web.message.debt.BidWinReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.zc.web.message.debt.BidWinReqProto.BidWinReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.zc.web.message.debt.BidWinReqProto.internal_static_com_zc_web_message_debt_BidWinReq_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.zc.web.message.debt.BidWinReqProto.internal_static_com_zc_web_message_debt_BidWinReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.zc.web.message.debt.BidWinReqProto.BidWinReq.class, com.zc.web.message.debt.BidWinReqProto.BidWinReq.Builder.class);
      }

      // Construct using com.zc.web.message.debt.BidWinReqProto.BidWinReq.newBuilder()
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
        debtId_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        playerId_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.zc.web.message.debt.BidWinReqProto.internal_static_com_zc_web_message_debt_BidWinReq_descriptor;
      }

      public com.zc.web.message.debt.BidWinReqProto.BidWinReq getDefaultInstanceForType() {
        return com.zc.web.message.debt.BidWinReqProto.BidWinReq.getDefaultInstance();
      }

      public com.zc.web.message.debt.BidWinReqProto.BidWinReq build() {
        com.zc.web.message.debt.BidWinReqProto.BidWinReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.zc.web.message.debt.BidWinReqProto.BidWinReq buildPartial() {
        com.zc.web.message.debt.BidWinReqProto.BidWinReq result = new com.zc.web.message.debt.BidWinReqProto.BidWinReq(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.debtId_ = debtId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.playerId_ = playerId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.zc.web.message.debt.BidWinReqProto.BidWinReq) {
          return mergeFrom((com.zc.web.message.debt.BidWinReqProto.BidWinReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.zc.web.message.debt.BidWinReqProto.BidWinReq other) {
        if (other == com.zc.web.message.debt.BidWinReqProto.BidWinReq.getDefaultInstance()) return this;
        if (other.hasDebtId()) {
          bitField0_ |= 0x00000001;
          debtId_ = other.debtId_;
          onChanged();
        }
        if (other.hasPlayerId()) {
          bitField0_ |= 0x00000002;
          playerId_ = other.playerId_;
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
        com.zc.web.message.debt.BidWinReqProto.BidWinReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.zc.web.message.debt.BidWinReqProto.BidWinReq) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional string debtId = 1;
      private java.lang.Object debtId_ = "";
      /**
       * <code>optional string debtId = 1;</code>
       *
       * <pre>
       * 债务id
       * </pre>
       */
      public boolean hasDebtId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string debtId = 1;</code>
       *
       * <pre>
       * 债务id
       * </pre>
       */
      public java.lang.String getDebtId() {
        java.lang.Object ref = debtId_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          debtId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string debtId = 1;</code>
       *
       * <pre>
       * 债务id
       * </pre>
       */
      public com.google.protobuf.ByteString
          getDebtIdBytes() {
        java.lang.Object ref = debtId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          debtId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string debtId = 1;</code>
       *
       * <pre>
       * 债务id
       * </pre>
       */
      public Builder setDebtId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        debtId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string debtId = 1;</code>
       *
       * <pre>
       * 债务id
       * </pre>
       */
      public Builder clearDebtId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        debtId_ = getDefaultInstance().getDebtId();
        onChanged();
        return this;
      }
      /**
       * <code>optional string debtId = 1;</code>
       *
       * <pre>
       * 债务id
       * </pre>
       */
      public Builder setDebtIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        debtId_ = value;
        onChanged();
        return this;
      }

      // optional string playerId = 2;
      private java.lang.Object playerId_ = "";
      /**
       * <code>optional string playerId = 2;</code>
       *
       * <pre>
       * 用户id
       * </pre>
       */
      public boolean hasPlayerId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string playerId = 2;</code>
       *
       * <pre>
       * 用户id
       * </pre>
       */
      public java.lang.String getPlayerId() {
        java.lang.Object ref = playerId_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          playerId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string playerId = 2;</code>
       *
       * <pre>
       * 用户id
       * </pre>
       */
      public com.google.protobuf.ByteString
          getPlayerIdBytes() {
        java.lang.Object ref = playerId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          playerId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string playerId = 2;</code>
       *
       * <pre>
       * 用户id
       * </pre>
       */
      public Builder setPlayerId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        playerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string playerId = 2;</code>
       *
       * <pre>
       * 用户id
       * </pre>
       */
      public Builder clearPlayerId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        playerId_ = getDefaultInstance().getPlayerId();
        onChanged();
        return this;
      }
      /**
       * <code>optional string playerId = 2;</code>
       *
       * <pre>
       * 用户id
       * </pre>
       */
      public Builder setPlayerIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        playerId_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.zc.web.message.debt.BidWinReq)
    }

    static {
      defaultInstance = new BidWinReq(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.zc.web.message.debt.BidWinReq)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_zc_web_message_debt_BidWinReq_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_zc_web_message_debt_BidWinReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3main/resources/com/zc/messages/debt/Bi" +
      "nWinReq.proto\022\027com.zc.web.message.debt\"-" +
      "\n\tBidWinReq\022\016\n\006debtId\030\001 \001(\t\022\020\n\010playerId\030" +
      "\002 \001(\tB\020B\016BidWinReqProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_zc_web_message_debt_BidWinReq_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_zc_web_message_debt_BidWinReq_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_zc_web_message_debt_BidWinReq_descriptor,
              new java.lang.String[] { "DebtId", "PlayerId", });
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
