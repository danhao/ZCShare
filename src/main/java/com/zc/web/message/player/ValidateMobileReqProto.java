// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: main/resources/com/zc/messages/player/ValidateMobileReq.proto

package com.zc.web.message.player;

public final class ValidateMobileReqProto {
  private ValidateMobileReqProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ValidateMobileReqOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional int32 code = 1;
    /**
     * <code>optional int32 code = 1;</code>
     */
    boolean hasCode();
    /**
     * <code>optional int32 code = 1;</code>
     */
    int getCode();
  }
  /**
   * Protobuf type {@code com.zc.web.message.player.ValidateMobileReq}
   */
  public static final class ValidateMobileReq extends
      com.google.protobuf.GeneratedMessage
      implements ValidateMobileReqOrBuilder {
    // Use ValidateMobileReq.newBuilder() to construct.
    private ValidateMobileReq(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ValidateMobileReq(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ValidateMobileReq defaultInstance;
    public static ValidateMobileReq getDefaultInstance() {
      return defaultInstance;
    }

    public ValidateMobileReq getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ValidateMobileReq(
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
      return com.zc.web.message.player.ValidateMobileReqProto.internal_static_com_zc_web_message_player_ValidateMobileReq_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.zc.web.message.player.ValidateMobileReqProto.internal_static_com_zc_web_message_player_ValidateMobileReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zc.web.message.player.ValidateMobileReqProto.ValidateMobileReq.class, com.zc.web.message.player.ValidateMobileReqProto.ValidateMobileReq.Builder.class);
    }

    public static com.google.protobuf.Parser<ValidateMobileReq> PARSER =
        new com.google.protobuf.AbstractParser<ValidateMobileReq>() {
      public ValidateMobileReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ValidateMobileReq(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ValidateMobileReq> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional int32 code = 1;
    public static final int CODE_FIELD_NUMBER = 1;
    private int code_;
    /**
     * <code>optional int32 code = 1;</code>
     */
    public boolean hasCode() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 code = 1;</code>
     */
    public int getCode() {
      return code_;
    }

    private void initFields() {
      code_ = 0;
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

    public static com.zc.web.message.player.ValidateMobileReqProto.ValidateMobileReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zc.web.message.player.ValidateMobileReqProto.ValidateMobileReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zc.web.message.player.ValidateMobileReqProto.ValidateMobileReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zc.web.message.player.ValidateMobileReqProto.ValidateMobileReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zc.web.message.player.ValidateMobileReqProto.ValidateMobileReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.zc.web.message.player.ValidateMobileReqProto.ValidateMobileReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.zc.web.message.player.ValidateMobileReqProto.ValidateMobileReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.zc.web.message.player.ValidateMobileReqProto.ValidateMobileReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.zc.web.message.player.ValidateMobileReqProto.ValidateMobileReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.zc.web.message.player.ValidateMobileReqProto.ValidateMobileReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.zc.web.message.player.ValidateMobileReqProto.ValidateMobileReq prototype) {
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
     * Protobuf type {@code com.zc.web.message.player.ValidateMobileReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.zc.web.message.player.ValidateMobileReqProto.ValidateMobileReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.zc.web.message.player.ValidateMobileReqProto.internal_static_com_zc_web_message_player_ValidateMobileReq_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.zc.web.message.player.ValidateMobileReqProto.internal_static_com_zc_web_message_player_ValidateMobileReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.zc.web.message.player.ValidateMobileReqProto.ValidateMobileReq.class, com.zc.web.message.player.ValidateMobileReqProto.ValidateMobileReq.Builder.class);
      }

      // Construct using com.zc.web.message.player.ValidateMobileReqProto.ValidateMobileReq.newBuilder()
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
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.zc.web.message.player.ValidateMobileReqProto.internal_static_com_zc_web_message_player_ValidateMobileReq_descriptor;
      }

      public com.zc.web.message.player.ValidateMobileReqProto.ValidateMobileReq getDefaultInstanceForType() {
        return com.zc.web.message.player.ValidateMobileReqProto.ValidateMobileReq.getDefaultInstance();
      }

      public com.zc.web.message.player.ValidateMobileReqProto.ValidateMobileReq build() {
        com.zc.web.message.player.ValidateMobileReqProto.ValidateMobileReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.zc.web.message.player.ValidateMobileReqProto.ValidateMobileReq buildPartial() {
        com.zc.web.message.player.ValidateMobileReqProto.ValidateMobileReq result = new com.zc.web.message.player.ValidateMobileReqProto.ValidateMobileReq(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.code_ = code_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.zc.web.message.player.ValidateMobileReqProto.ValidateMobileReq) {
          return mergeFrom((com.zc.web.message.player.ValidateMobileReqProto.ValidateMobileReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.zc.web.message.player.ValidateMobileReqProto.ValidateMobileReq other) {
        if (other == com.zc.web.message.player.ValidateMobileReqProto.ValidateMobileReq.getDefaultInstance()) return this;
        if (other.hasCode()) {
          setCode(other.getCode());
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
        com.zc.web.message.player.ValidateMobileReqProto.ValidateMobileReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.zc.web.message.player.ValidateMobileReqProto.ValidateMobileReq) e.getUnfinishedMessage();
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
       */
      public boolean hasCode() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 code = 1;</code>
       */
      public int getCode() {
        return code_;
      }
      /**
       * <code>optional int32 code = 1;</code>
       */
      public Builder setCode(int value) {
        bitField0_ |= 0x00000001;
        code_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 code = 1;</code>
       */
      public Builder clearCode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        code_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.zc.web.message.player.ValidateMobileReq)
    }

    static {
      defaultInstance = new ValidateMobileReq(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.zc.web.message.player.ValidateMobileReq)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_zc_web_message_player_ValidateMobileReq_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_zc_web_message_player_ValidateMobileReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=main/resources/com/zc/messages/player/" +
      "ValidateMobileReq.proto\022\031com.zc.web.mess" +
      "age.player\"!\n\021ValidateMobileReq\022\014\n\004code\030" +
      "\001 \001(\005B\030B\026ValidateMobileReqProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_zc_web_message_player_ValidateMobileReq_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_zc_web_message_player_ValidateMobileReq_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_zc_web_message_player_ValidateMobileReq_descriptor,
              new java.lang.String[] { "Code", });
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
