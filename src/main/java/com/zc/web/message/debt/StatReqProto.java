// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: main/resources/com/zc/messages/debt/StatReq.proto

package com.zc.web.message.debt;

public final class StatReqProto {
  private StatReqProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface StatReqOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional int32 state = 1;
    /**
     * <code>optional int32 state = 1;</code>
     *
     * <pre>
     * 3已成交；4已完成；
     * </pre>
     */
    boolean hasState();
    /**
     * <code>optional int32 state = 1;</code>
     *
     * <pre>
     * 3已成交；4已完成；
     * </pre>
     */
    int getState();

    // optional int32 receiveTimeFrom = 2;
    /**
     * <code>optional int32 receiveTimeFrom = 2;</code>
     *
     * <pre>
     * 获单时间（起）
     * </pre>
     */
    boolean hasReceiveTimeFrom();
    /**
     * <code>optional int32 receiveTimeFrom = 2;</code>
     *
     * <pre>
     * 获单时间（起）
     * </pre>
     */
    int getReceiveTimeFrom();

    // optional int32 receiveTimeTo = 3;
    /**
     * <code>optional int32 receiveTimeTo = 3;</code>
     *
     * <pre>
     * 获单时间（止）
     * </pre>
     */
    boolean hasReceiveTimeTo();
    /**
     * <code>optional int32 receiveTimeTo = 3;</code>
     *
     * <pre>
     * 获单时间（止）
     * </pre>
     */
    int getReceiveTimeTo();
  }
  /**
   * Protobuf type {@code com.zc.web.message.debt.StatReq}
   */
  public static final class StatReq extends
      com.google.protobuf.GeneratedMessage
      implements StatReqOrBuilder {
    // Use StatReq.newBuilder() to construct.
    private StatReq(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private StatReq(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final StatReq defaultInstance;
    public static StatReq getDefaultInstance() {
      return defaultInstance;
    }

    public StatReq getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private StatReq(
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
              state_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              receiveTimeFrom_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              receiveTimeTo_ = input.readInt32();
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
      return com.zc.web.message.debt.StatReqProto.internal_static_com_zc_web_message_debt_StatReq_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.zc.web.message.debt.StatReqProto.internal_static_com_zc_web_message_debt_StatReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zc.web.message.debt.StatReqProto.StatReq.class, com.zc.web.message.debt.StatReqProto.StatReq.Builder.class);
    }

    public static com.google.protobuf.Parser<StatReq> PARSER =
        new com.google.protobuf.AbstractParser<StatReq>() {
      public StatReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new StatReq(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<StatReq> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional int32 state = 1;
    public static final int STATE_FIELD_NUMBER = 1;
    private int state_;
    /**
     * <code>optional int32 state = 1;</code>
     *
     * <pre>
     * 3已成交；4已完成；
     * </pre>
     */
    public boolean hasState() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 state = 1;</code>
     *
     * <pre>
     * 3已成交；4已完成；
     * </pre>
     */
    public int getState() {
      return state_;
    }

    // optional int32 receiveTimeFrom = 2;
    public static final int RECEIVETIMEFROM_FIELD_NUMBER = 2;
    private int receiveTimeFrom_;
    /**
     * <code>optional int32 receiveTimeFrom = 2;</code>
     *
     * <pre>
     * 获单时间（起）
     * </pre>
     */
    public boolean hasReceiveTimeFrom() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 receiveTimeFrom = 2;</code>
     *
     * <pre>
     * 获单时间（起）
     * </pre>
     */
    public int getReceiveTimeFrom() {
      return receiveTimeFrom_;
    }

    // optional int32 receiveTimeTo = 3;
    public static final int RECEIVETIMETO_FIELD_NUMBER = 3;
    private int receiveTimeTo_;
    /**
     * <code>optional int32 receiveTimeTo = 3;</code>
     *
     * <pre>
     * 获单时间（止）
     * </pre>
     */
    public boolean hasReceiveTimeTo() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int32 receiveTimeTo = 3;</code>
     *
     * <pre>
     * 获单时间（止）
     * </pre>
     */
    public int getReceiveTimeTo() {
      return receiveTimeTo_;
    }

    private void initFields() {
      state_ = 0;
      receiveTimeFrom_ = 0;
      receiveTimeTo_ = 0;
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
        output.writeInt32(1, state_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, receiveTimeFrom_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, receiveTimeTo_);
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
          .computeInt32Size(1, state_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, receiveTimeFrom_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, receiveTimeTo_);
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

    public static com.zc.web.message.debt.StatReqProto.StatReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zc.web.message.debt.StatReqProto.StatReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zc.web.message.debt.StatReqProto.StatReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zc.web.message.debt.StatReqProto.StatReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zc.web.message.debt.StatReqProto.StatReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.zc.web.message.debt.StatReqProto.StatReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.zc.web.message.debt.StatReqProto.StatReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.zc.web.message.debt.StatReqProto.StatReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.zc.web.message.debt.StatReqProto.StatReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.zc.web.message.debt.StatReqProto.StatReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.zc.web.message.debt.StatReqProto.StatReq prototype) {
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
     * Protobuf type {@code com.zc.web.message.debt.StatReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.zc.web.message.debt.StatReqProto.StatReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.zc.web.message.debt.StatReqProto.internal_static_com_zc_web_message_debt_StatReq_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.zc.web.message.debt.StatReqProto.internal_static_com_zc_web_message_debt_StatReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.zc.web.message.debt.StatReqProto.StatReq.class, com.zc.web.message.debt.StatReqProto.StatReq.Builder.class);
      }

      // Construct using com.zc.web.message.debt.StatReqProto.StatReq.newBuilder()
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
        state_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        receiveTimeFrom_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        receiveTimeTo_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.zc.web.message.debt.StatReqProto.internal_static_com_zc_web_message_debt_StatReq_descriptor;
      }

      public com.zc.web.message.debt.StatReqProto.StatReq getDefaultInstanceForType() {
        return com.zc.web.message.debt.StatReqProto.StatReq.getDefaultInstance();
      }

      public com.zc.web.message.debt.StatReqProto.StatReq build() {
        com.zc.web.message.debt.StatReqProto.StatReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.zc.web.message.debt.StatReqProto.StatReq buildPartial() {
        com.zc.web.message.debt.StatReqProto.StatReq result = new com.zc.web.message.debt.StatReqProto.StatReq(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.state_ = state_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.receiveTimeFrom_ = receiveTimeFrom_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.receiveTimeTo_ = receiveTimeTo_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.zc.web.message.debt.StatReqProto.StatReq) {
          return mergeFrom((com.zc.web.message.debt.StatReqProto.StatReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.zc.web.message.debt.StatReqProto.StatReq other) {
        if (other == com.zc.web.message.debt.StatReqProto.StatReq.getDefaultInstance()) return this;
        if (other.hasState()) {
          setState(other.getState());
        }
        if (other.hasReceiveTimeFrom()) {
          setReceiveTimeFrom(other.getReceiveTimeFrom());
        }
        if (other.hasReceiveTimeTo()) {
          setReceiveTimeTo(other.getReceiveTimeTo());
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
        com.zc.web.message.debt.StatReqProto.StatReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.zc.web.message.debt.StatReqProto.StatReq) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional int32 state = 1;
      private int state_ ;
      /**
       * <code>optional int32 state = 1;</code>
       *
       * <pre>
       * 3已成交；4已完成；
       * </pre>
       */
      public boolean hasState() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 state = 1;</code>
       *
       * <pre>
       * 3已成交；4已完成；
       * </pre>
       */
      public int getState() {
        return state_;
      }
      /**
       * <code>optional int32 state = 1;</code>
       *
       * <pre>
       * 3已成交；4已完成；
       * </pre>
       */
      public Builder setState(int value) {
        bitField0_ |= 0x00000001;
        state_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 state = 1;</code>
       *
       * <pre>
       * 3已成交；4已完成；
       * </pre>
       */
      public Builder clearState() {
        bitField0_ = (bitField0_ & ~0x00000001);
        state_ = 0;
        onChanged();
        return this;
      }

      // optional int32 receiveTimeFrom = 2;
      private int receiveTimeFrom_ ;
      /**
       * <code>optional int32 receiveTimeFrom = 2;</code>
       *
       * <pre>
       * 获单时间（起）
       * </pre>
       */
      public boolean hasReceiveTimeFrom() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 receiveTimeFrom = 2;</code>
       *
       * <pre>
       * 获单时间（起）
       * </pre>
       */
      public int getReceiveTimeFrom() {
        return receiveTimeFrom_;
      }
      /**
       * <code>optional int32 receiveTimeFrom = 2;</code>
       *
       * <pre>
       * 获单时间（起）
       * </pre>
       */
      public Builder setReceiveTimeFrom(int value) {
        bitField0_ |= 0x00000002;
        receiveTimeFrom_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 receiveTimeFrom = 2;</code>
       *
       * <pre>
       * 获单时间（起）
       * </pre>
       */
      public Builder clearReceiveTimeFrom() {
        bitField0_ = (bitField0_ & ~0x00000002);
        receiveTimeFrom_ = 0;
        onChanged();
        return this;
      }

      // optional int32 receiveTimeTo = 3;
      private int receiveTimeTo_ ;
      /**
       * <code>optional int32 receiveTimeTo = 3;</code>
       *
       * <pre>
       * 获单时间（止）
       * </pre>
       */
      public boolean hasReceiveTimeTo() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional int32 receiveTimeTo = 3;</code>
       *
       * <pre>
       * 获单时间（止）
       * </pre>
       */
      public int getReceiveTimeTo() {
        return receiveTimeTo_;
      }
      /**
       * <code>optional int32 receiveTimeTo = 3;</code>
       *
       * <pre>
       * 获单时间（止）
       * </pre>
       */
      public Builder setReceiveTimeTo(int value) {
        bitField0_ |= 0x00000004;
        receiveTimeTo_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 receiveTimeTo = 3;</code>
       *
       * <pre>
       * 获单时间（止）
       * </pre>
       */
      public Builder clearReceiveTimeTo() {
        bitField0_ = (bitField0_ & ~0x00000004);
        receiveTimeTo_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.zc.web.message.debt.StatReq)
    }

    static {
      defaultInstance = new StatReq(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.zc.web.message.debt.StatReq)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_zc_web_message_debt_StatReq_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_zc_web_message_debt_StatReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1main/resources/com/zc/messages/debt/St" +
      "atReq.proto\022\027com.zc.web.message.debt\"H\n\007" +
      "StatReq\022\r\n\005state\030\001 \001(\005\022\027\n\017receiveTimeFro" +
      "m\030\002 \001(\005\022\025\n\rreceiveTimeTo\030\003 \001(\005B\016B\014StatRe" +
      "qProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_zc_web_message_debt_StatReq_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_zc_web_message_debt_StatReq_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_zc_web_message_debt_StatReq_descriptor,
              new java.lang.String[] { "State", "ReceiveTimeFrom", "ReceiveTimeTo", });
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
