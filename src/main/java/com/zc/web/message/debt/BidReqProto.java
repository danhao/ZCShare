// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: main/resources/com/zc/messages/debt/BidReq.proto

package com.zc.web.message.debt;

public final class BidReqProto {
  private BidReqProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BidReqOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional string id = 1;
    /**
     * <code>optional string id = 1;</code>
     *
     * <pre>
     * id
     * </pre>
     */
    boolean hasId();
    /**
     * <code>optional string id = 1;</code>
     *
     * <pre>
     * id
     * </pre>
     */
    java.lang.String getId();
    /**
     * <code>optional string id = 1;</code>
     *
     * <pre>
     * id
     * </pre>
     */
    com.google.protobuf.ByteString
        getIdBytes();

    // optional int32 money = 2;
    /**
     * <code>optional int32 money = 2;</code>
     *
     * <pre>
     * 投标价格
     * </pre>
     */
    boolean hasMoney();
    /**
     * <code>optional int32 money = 2;</code>
     *
     * <pre>
     * 投标价格
     * </pre>
     */
    int getMoney();

    // optional int32 rate = 3;
    /**
     * <code>optional int32 rate = 3;</code>
     *
     * <pre>
     * 代理费率
     * </pre>
     */
    boolean hasRate();
    /**
     * <code>optional int32 rate = 3;</code>
     *
     * <pre>
     * 代理费率
     * </pre>
     */
    int getRate();
  }
  /**
   * Protobuf type {@code com.zc.web.message.debt.BidReq}
   */
  public static final class BidReq extends
      com.google.protobuf.GeneratedMessage
      implements BidReqOrBuilder {
    // Use BidReq.newBuilder() to construct.
    private BidReq(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private BidReq(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final BidReq defaultInstance;
    public static BidReq getDefaultInstance() {
      return defaultInstance;
    }

    public BidReq getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private BidReq(
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
            case 16: {
              bitField0_ |= 0x00000002;
              money_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
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
      return com.zc.web.message.debt.BidReqProto.internal_static_com_zc_web_message_debt_BidReq_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.zc.web.message.debt.BidReqProto.internal_static_com_zc_web_message_debt_BidReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zc.web.message.debt.BidReqProto.BidReq.class, com.zc.web.message.debt.BidReqProto.BidReq.Builder.class);
    }

    public static com.google.protobuf.Parser<BidReq> PARSER =
        new com.google.protobuf.AbstractParser<BidReq>() {
      public BidReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BidReq(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<BidReq> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional string id = 1;
    public static final int ID_FIELD_NUMBER = 1;
    private java.lang.Object id_;
    /**
     * <code>optional string id = 1;</code>
     *
     * <pre>
     * id
     * </pre>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string id = 1;</code>
     *
     * <pre>
     * id
     * </pre>
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
     *
     * <pre>
     * id
     * </pre>
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

    // optional int32 money = 2;
    public static final int MONEY_FIELD_NUMBER = 2;
    private int money_;
    /**
     * <code>optional int32 money = 2;</code>
     *
     * <pre>
     * 投标价格
     * </pre>
     */
    public boolean hasMoney() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 money = 2;</code>
     *
     * <pre>
     * 投标价格
     * </pre>
     */
    public int getMoney() {
      return money_;
    }

    // optional int32 rate = 3;
    public static final int RATE_FIELD_NUMBER = 3;
    private int rate_;
    /**
     * <code>optional int32 rate = 3;</code>
     *
     * <pre>
     * 代理费率
     * </pre>
     */
    public boolean hasRate() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int32 rate = 3;</code>
     *
     * <pre>
     * 代理费率
     * </pre>
     */
    public int getRate() {
      return rate_;
    }

    private void initFields() {
      id_ = "";
      money_ = 0;
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
        output.writeBytes(1, getIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, money_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, rate_);
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
          .computeInt32Size(2, money_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, rate_);
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

    public static com.zc.web.message.debt.BidReqProto.BidReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zc.web.message.debt.BidReqProto.BidReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zc.web.message.debt.BidReqProto.BidReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zc.web.message.debt.BidReqProto.BidReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zc.web.message.debt.BidReqProto.BidReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.zc.web.message.debt.BidReqProto.BidReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.zc.web.message.debt.BidReqProto.BidReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.zc.web.message.debt.BidReqProto.BidReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.zc.web.message.debt.BidReqProto.BidReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.zc.web.message.debt.BidReqProto.BidReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.zc.web.message.debt.BidReqProto.BidReq prototype) {
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
     * Protobuf type {@code com.zc.web.message.debt.BidReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.zc.web.message.debt.BidReqProto.BidReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.zc.web.message.debt.BidReqProto.internal_static_com_zc_web_message_debt_BidReq_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.zc.web.message.debt.BidReqProto.internal_static_com_zc_web_message_debt_BidReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.zc.web.message.debt.BidReqProto.BidReq.class, com.zc.web.message.debt.BidReqProto.BidReq.Builder.class);
      }

      // Construct using com.zc.web.message.debt.BidReqProto.BidReq.newBuilder()
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
        money_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        rate_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.zc.web.message.debt.BidReqProto.internal_static_com_zc_web_message_debt_BidReq_descriptor;
      }

      public com.zc.web.message.debt.BidReqProto.BidReq getDefaultInstanceForType() {
        return com.zc.web.message.debt.BidReqProto.BidReq.getDefaultInstance();
      }

      public com.zc.web.message.debt.BidReqProto.BidReq build() {
        com.zc.web.message.debt.BidReqProto.BidReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.zc.web.message.debt.BidReqProto.BidReq buildPartial() {
        com.zc.web.message.debt.BidReqProto.BidReq result = new com.zc.web.message.debt.BidReqProto.BidReq(this);
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
        result.rate_ = rate_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.zc.web.message.debt.BidReqProto.BidReq) {
          return mergeFrom((com.zc.web.message.debt.BidReqProto.BidReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.zc.web.message.debt.BidReqProto.BidReq other) {
        if (other == com.zc.web.message.debt.BidReqProto.BidReq.getDefaultInstance()) return this;
        if (other.hasId()) {
          bitField0_ |= 0x00000001;
          id_ = other.id_;
          onChanged();
        }
        if (other.hasMoney()) {
          setMoney(other.getMoney());
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
        com.zc.web.message.debt.BidReqProto.BidReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.zc.web.message.debt.BidReqProto.BidReq) e.getUnfinishedMessage();
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
       *
       * <pre>
       * id
       * </pre>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string id = 1;</code>
       *
       * <pre>
       * id
       * </pre>
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
       *
       * <pre>
       * id
       * </pre>
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
       *
       * <pre>
       * id
       * </pre>
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
       *
       * <pre>
       * id
       * </pre>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = getDefaultInstance().getId();
        onChanged();
        return this;
      }
      /**
       * <code>optional string id = 1;</code>
       *
       * <pre>
       * id
       * </pre>
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

      // optional int32 money = 2;
      private int money_ ;
      /**
       * <code>optional int32 money = 2;</code>
       *
       * <pre>
       * 投标价格
       * </pre>
       */
      public boolean hasMoney() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 money = 2;</code>
       *
       * <pre>
       * 投标价格
       * </pre>
       */
      public int getMoney() {
        return money_;
      }
      /**
       * <code>optional int32 money = 2;</code>
       *
       * <pre>
       * 投标价格
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
       * 投标价格
       * </pre>
       */
      public Builder clearMoney() {
        bitField0_ = (bitField0_ & ~0x00000002);
        money_ = 0;
        onChanged();
        return this;
      }

      // optional int32 rate = 3;
      private int rate_ ;
      /**
       * <code>optional int32 rate = 3;</code>
       *
       * <pre>
       * 代理费率
       * </pre>
       */
      public boolean hasRate() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional int32 rate = 3;</code>
       *
       * <pre>
       * 代理费率
       * </pre>
       */
      public int getRate() {
        return rate_;
      }
      /**
       * <code>optional int32 rate = 3;</code>
       *
       * <pre>
       * 代理费率
       * </pre>
       */
      public Builder setRate(int value) {
        bitField0_ |= 0x00000004;
        rate_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 rate = 3;</code>
       *
       * <pre>
       * 代理费率
       * </pre>
       */
      public Builder clearRate() {
        bitField0_ = (bitField0_ & ~0x00000004);
        rate_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.zc.web.message.debt.BidReq)
    }

    static {
      defaultInstance = new BidReq(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.zc.web.message.debt.BidReq)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_zc_web_message_debt_BidReq_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_zc_web_message_debt_BidReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0main/resources/com/zc/messages/debt/Bi" +
      "dReq.proto\022\027com.zc.web.message.debt\"1\n\006B" +
      "idReq\022\n\n\002id\030\001 \001(\t\022\r\n\005money\030\002 \001(\005\022\014\n\004rate" +
      "\030\003 \001(\005B\rB\013BidReqProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_zc_web_message_debt_BidReq_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_zc_web_message_debt_BidReq_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_zc_web_message_debt_BidReq_descriptor,
              new java.lang.String[] { "Id", "Money", "Rate", });
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