// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: main/resources/com/zc/messages/DataMsg.proto

package com.zc.web.message;

public final class DataMsgProto {
  private DataMsgProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface DataMsgOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional int32 now = 1;
    /**
     * <code>optional int32 now = 1;</code>
     *
     * <pre>
     *服务器时间
     * </pre>
     */
    boolean hasNow();
    /**
     * <code>optional int32 now = 1;</code>
     *
     * <pre>
     *服务器时间
     * </pre>
     */
    int getNow();

    // optional .com.zc.web.message.player.PlayerMsg player = 2;
    /**
     * <code>optional .com.zc.web.message.player.PlayerMsg player = 2;</code>
     *
     * <pre>
     *玩家数据
     * </pre>
     */
    boolean hasPlayer();
    /**
     * <code>optional .com.zc.web.message.player.PlayerMsg player = 2;</code>
     *
     * <pre>
     *玩家数据
     * </pre>
     */
    com.zc.web.message.player.PlayerMsgProto.PlayerMsg getPlayer();
    /**
     * <code>optional .com.zc.web.message.player.PlayerMsg player = 2;</code>
     *
     * <pre>
     *玩家数据
     * </pre>
     */
    com.zc.web.message.player.PlayerMsgProto.PlayerMsgOrBuilder getPlayerOrBuilder();
  }
  /**
   * Protobuf type {@code com.zc.web.message.DataMsg}
   */
  public static final class DataMsg extends
      com.google.protobuf.GeneratedMessage
      implements DataMsgOrBuilder {
    // Use DataMsg.newBuilder() to construct.
    private DataMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private DataMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final DataMsg defaultInstance;
    public static DataMsg getDefaultInstance() {
      return defaultInstance;
    }

    public DataMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private DataMsg(
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
              now_ = input.readInt32();
              break;
            }
            case 18: {
              com.zc.web.message.player.PlayerMsgProto.PlayerMsg.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                subBuilder = player_.toBuilder();
              }
              player_ = input.readMessage(com.zc.web.message.player.PlayerMsgProto.PlayerMsg.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(player_);
                player_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
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
      return com.zc.web.message.DataMsgProto.internal_static_com_zc_web_message_DataMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.zc.web.message.DataMsgProto.internal_static_com_zc_web_message_DataMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zc.web.message.DataMsgProto.DataMsg.class, com.zc.web.message.DataMsgProto.DataMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<DataMsg> PARSER =
        new com.google.protobuf.AbstractParser<DataMsg>() {
      public DataMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DataMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<DataMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional int32 now = 1;
    public static final int NOW_FIELD_NUMBER = 1;
    private int now_;
    /**
     * <code>optional int32 now = 1;</code>
     *
     * <pre>
     *服务器时间
     * </pre>
     */
    public boolean hasNow() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 now = 1;</code>
     *
     * <pre>
     *服务器时间
     * </pre>
     */
    public int getNow() {
      return now_;
    }

    // optional .com.zc.web.message.player.PlayerMsg player = 2;
    public static final int PLAYER_FIELD_NUMBER = 2;
    private com.zc.web.message.player.PlayerMsgProto.PlayerMsg player_;
    /**
     * <code>optional .com.zc.web.message.player.PlayerMsg player = 2;</code>
     *
     * <pre>
     *玩家数据
     * </pre>
     */
    public boolean hasPlayer() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .com.zc.web.message.player.PlayerMsg player = 2;</code>
     *
     * <pre>
     *玩家数据
     * </pre>
     */
    public com.zc.web.message.player.PlayerMsgProto.PlayerMsg getPlayer() {
      return player_;
    }
    /**
     * <code>optional .com.zc.web.message.player.PlayerMsg player = 2;</code>
     *
     * <pre>
     *玩家数据
     * </pre>
     */
    public com.zc.web.message.player.PlayerMsgProto.PlayerMsgOrBuilder getPlayerOrBuilder() {
      return player_;
    }

    private void initFields() {
      now_ = 0;
      player_ = com.zc.web.message.player.PlayerMsgProto.PlayerMsg.getDefaultInstance();
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
        output.writeInt32(1, now_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, player_);
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
          .computeInt32Size(1, now_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, player_);
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

    public static com.zc.web.message.DataMsgProto.DataMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zc.web.message.DataMsgProto.DataMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zc.web.message.DataMsgProto.DataMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zc.web.message.DataMsgProto.DataMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zc.web.message.DataMsgProto.DataMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.zc.web.message.DataMsgProto.DataMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.zc.web.message.DataMsgProto.DataMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.zc.web.message.DataMsgProto.DataMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.zc.web.message.DataMsgProto.DataMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.zc.web.message.DataMsgProto.DataMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.zc.web.message.DataMsgProto.DataMsg prototype) {
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
     * Protobuf type {@code com.zc.web.message.DataMsg}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.zc.web.message.DataMsgProto.DataMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.zc.web.message.DataMsgProto.internal_static_com_zc_web_message_DataMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.zc.web.message.DataMsgProto.internal_static_com_zc_web_message_DataMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.zc.web.message.DataMsgProto.DataMsg.class, com.zc.web.message.DataMsgProto.DataMsg.Builder.class);
      }

      // Construct using com.zc.web.message.DataMsgProto.DataMsg.newBuilder()
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
          getPlayerFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        now_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (playerBuilder_ == null) {
          player_ = com.zc.web.message.player.PlayerMsgProto.PlayerMsg.getDefaultInstance();
        } else {
          playerBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.zc.web.message.DataMsgProto.internal_static_com_zc_web_message_DataMsg_descriptor;
      }

      public com.zc.web.message.DataMsgProto.DataMsg getDefaultInstanceForType() {
        return com.zc.web.message.DataMsgProto.DataMsg.getDefaultInstance();
      }

      public com.zc.web.message.DataMsgProto.DataMsg build() {
        com.zc.web.message.DataMsgProto.DataMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.zc.web.message.DataMsgProto.DataMsg buildPartial() {
        com.zc.web.message.DataMsgProto.DataMsg result = new com.zc.web.message.DataMsgProto.DataMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.now_ = now_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (playerBuilder_ == null) {
          result.player_ = player_;
        } else {
          result.player_ = playerBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.zc.web.message.DataMsgProto.DataMsg) {
          return mergeFrom((com.zc.web.message.DataMsgProto.DataMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.zc.web.message.DataMsgProto.DataMsg other) {
        if (other == com.zc.web.message.DataMsgProto.DataMsg.getDefaultInstance()) return this;
        if (other.hasNow()) {
          setNow(other.getNow());
        }
        if (other.hasPlayer()) {
          mergePlayer(other.getPlayer());
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
        com.zc.web.message.DataMsgProto.DataMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.zc.web.message.DataMsgProto.DataMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional int32 now = 1;
      private int now_ ;
      /**
       * <code>optional int32 now = 1;</code>
       *
       * <pre>
       *服务器时间
       * </pre>
       */
      public boolean hasNow() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 now = 1;</code>
       *
       * <pre>
       *服务器时间
       * </pre>
       */
      public int getNow() {
        return now_;
      }
      /**
       * <code>optional int32 now = 1;</code>
       *
       * <pre>
       *服务器时间
       * </pre>
       */
      public Builder setNow(int value) {
        bitField0_ |= 0x00000001;
        now_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 now = 1;</code>
       *
       * <pre>
       *服务器时间
       * </pre>
       */
      public Builder clearNow() {
        bitField0_ = (bitField0_ & ~0x00000001);
        now_ = 0;
        onChanged();
        return this;
      }

      // optional .com.zc.web.message.player.PlayerMsg player = 2;
      private com.zc.web.message.player.PlayerMsgProto.PlayerMsg player_ = com.zc.web.message.player.PlayerMsgProto.PlayerMsg.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.zc.web.message.player.PlayerMsgProto.PlayerMsg, com.zc.web.message.player.PlayerMsgProto.PlayerMsg.Builder, com.zc.web.message.player.PlayerMsgProto.PlayerMsgOrBuilder> playerBuilder_;
      /**
       * <code>optional .com.zc.web.message.player.PlayerMsg player = 2;</code>
       *
       * <pre>
       *玩家数据
       * </pre>
       */
      public boolean hasPlayer() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional .com.zc.web.message.player.PlayerMsg player = 2;</code>
       *
       * <pre>
       *玩家数据
       * </pre>
       */
      public com.zc.web.message.player.PlayerMsgProto.PlayerMsg getPlayer() {
        if (playerBuilder_ == null) {
          return player_;
        } else {
          return playerBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .com.zc.web.message.player.PlayerMsg player = 2;</code>
       *
       * <pre>
       *玩家数据
       * </pre>
       */
      public Builder setPlayer(com.zc.web.message.player.PlayerMsgProto.PlayerMsg value) {
        if (playerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          player_ = value;
          onChanged();
        } else {
          playerBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .com.zc.web.message.player.PlayerMsg player = 2;</code>
       *
       * <pre>
       *玩家数据
       * </pre>
       */
      public Builder setPlayer(
          com.zc.web.message.player.PlayerMsgProto.PlayerMsg.Builder builderForValue) {
        if (playerBuilder_ == null) {
          player_ = builderForValue.build();
          onChanged();
        } else {
          playerBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .com.zc.web.message.player.PlayerMsg player = 2;</code>
       *
       * <pre>
       *玩家数据
       * </pre>
       */
      public Builder mergePlayer(com.zc.web.message.player.PlayerMsgProto.PlayerMsg value) {
        if (playerBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              player_ != com.zc.web.message.player.PlayerMsgProto.PlayerMsg.getDefaultInstance()) {
            player_ =
              com.zc.web.message.player.PlayerMsgProto.PlayerMsg.newBuilder(player_).mergeFrom(value).buildPartial();
          } else {
            player_ = value;
          }
          onChanged();
        } else {
          playerBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .com.zc.web.message.player.PlayerMsg player = 2;</code>
       *
       * <pre>
       *玩家数据
       * </pre>
       */
      public Builder clearPlayer() {
        if (playerBuilder_ == null) {
          player_ = com.zc.web.message.player.PlayerMsgProto.PlayerMsg.getDefaultInstance();
          onChanged();
        } else {
          playerBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>optional .com.zc.web.message.player.PlayerMsg player = 2;</code>
       *
       * <pre>
       *玩家数据
       * </pre>
       */
      public com.zc.web.message.player.PlayerMsgProto.PlayerMsg.Builder getPlayerBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getPlayerFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .com.zc.web.message.player.PlayerMsg player = 2;</code>
       *
       * <pre>
       *玩家数据
       * </pre>
       */
      public com.zc.web.message.player.PlayerMsgProto.PlayerMsgOrBuilder getPlayerOrBuilder() {
        if (playerBuilder_ != null) {
          return playerBuilder_.getMessageOrBuilder();
        } else {
          return player_;
        }
      }
      /**
       * <code>optional .com.zc.web.message.player.PlayerMsg player = 2;</code>
       *
       * <pre>
       *玩家数据
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<
          com.zc.web.message.player.PlayerMsgProto.PlayerMsg, com.zc.web.message.player.PlayerMsgProto.PlayerMsg.Builder, com.zc.web.message.player.PlayerMsgProto.PlayerMsgOrBuilder> 
          getPlayerFieldBuilder() {
        if (playerBuilder_ == null) {
          playerBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.zc.web.message.player.PlayerMsgProto.PlayerMsg, com.zc.web.message.player.PlayerMsgProto.PlayerMsg.Builder, com.zc.web.message.player.PlayerMsgProto.PlayerMsgOrBuilder>(
                  player_,
                  getParentForChildren(),
                  isClean());
          player_ = null;
        }
        return playerBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:com.zc.web.message.DataMsg)
    }

    static {
      defaultInstance = new DataMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.zc.web.message.DataMsg)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_zc_web_message_DataMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_zc_web_message_DataMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,main/resources/com/zc/messages/DataMsg" +
      ".proto\022\022com.zc.web.message\0325main/resourc" +
      "es/com/zc/messages/player/PlayerMsg.prot" +
      "o\"L\n\007DataMsg\022\013\n\003now\030\001 \001(\005\0224\n\006player\030\002 \001(" +
      "\0132$.com.zc.web.message.player.PlayerMsgB" +
      "\016B\014DataMsgProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_zc_web_message_DataMsg_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_zc_web_message_DataMsg_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_zc_web_message_DataMsg_descriptor,
              new java.lang.String[] { "Now", "Player", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.zc.web.message.player.PlayerMsgProto.getDescriptor(),
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}