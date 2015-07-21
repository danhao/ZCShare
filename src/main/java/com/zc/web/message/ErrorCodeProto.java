// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: main/resources/com/zc/messages/ErrorCode.proto

package com.zc.web.message;

public final class ErrorCodeProto {
  private ErrorCodeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  /**
   * Protobuf enum {@code com.zc.web.message.ErrorCode}
   */
  public enum ErrorCode
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ERR_SYSTEM = 1;</code>
     *
     * <pre>
     *-----------------系统相关错误码----------------------------
     * </pre>
     */
    ERR_SYSTEM(0, 1),
    /**
     * <code>ERR_UNKNOWN = 2;</code>
     *
     * <pre>
     *未知错误
     * </pre>
     */
    ERR_UNKNOWN(1, 2),
    /**
     * <code>ERR_PARAMETER = 3;</code>
     *
     * <pre>
     *错误的参数
     * </pre>
     */
    ERR_PARAMETER(2, 3),
    /**
     * <code>ERR_NET_TIMEOUT = 4;</code>
     *
     * <pre>
     *网络超时
     * </pre>
     */
    ERR_NET_TIMEOUT(3, 4),
    /**
     * <code>ERR_PLATFORM_INVALID = 5;</code>
     *
     * <pre>
     *平台校验无效
     * </pre>
     */
    ERR_PLATFORM_INVALID(4, 5),
    /**
     * <code>ERR_ILLEGAL_REQUEST = 6;</code>
     *
     * <pre>
     *非法请求
     * </pre>
     */
    ERR_ILLEGAL_REQUEST(5, 6),
    /**
     * <code>ERR_MAINTAIN = 7;</code>
     *
     * <pre>
     *服务器维护中
     * </pre>
     */
    ERR_MAINTAIN(6, 7),
    /**
     * <code>ERR_MAX_ONLINE = 8;</code>
     *
     * <pre>
     *最大在线人数
     * </pre>
     */
    ERR_MAX_ONLINE(7, 8),
    /**
     * <code>ERR_OTHER_LOGIN = 9;</code>
     *
     * <pre>
     *异地登陆
     * </pre>
     */
    ERR_OTHER_LOGIN(8, 9),
    /**
     * <code>ERR_SERVER_STOPPING = 10;</code>
     *
     * <pre>
     *停服中
     * </pre>
     */
    ERR_SERVER_STOPPING(9, 10),
    /**
     * <code>ERR_ACCOUNT_FORBIDDEN = 100;</code>
     *
     * <pre>
     *---------------------玩家相关错误码-----------------------------------
     * </pre>
     */
    ERR_ACCOUNT_FORBIDDEN(10, 100),
    /**
     * <code>ERR_LOGOUT = 101;</code>
     *
     * <pre>
     *登出
     * </pre>
     */
    ERR_LOGOUT(11, 101),
    /**
     * <code>ERR_NO_MONEY = 102;</code>
     *
     * <pre>
     *RMB不足
     * </pre>
     */
    ERR_NO_MONEY(12, 102),
    /**
     * <code>ERR_NO_PLAYER = 103;</code>
     *
     * <pre>
     *不存在
     * </pre>
     */
    ERR_NO_PLAYER(13, 103),
    /**
     * <code>ERR_EMAIL_EXIST = 104;</code>
     *
     * <pre>
     *存在email
     * </pre>
     */
    ERR_EMAIL_EXIST(14, 104),
    /**
     * <code>ERR_MOBILE_EXIST = 105;</code>
     *
     * <pre>
     *存在mobile
     * </pre>
     */
    ERR_MOBILE_EXIST(15, 105),
    /**
     * <code>ERR_PASSWD_NOT_SAME = 106;</code>
     *
     * <pre>
     *密码不一致
     * </pre>
     */
    ERR_PASSWD_NOT_SAME(16, 106),
    /**
     * <code>ERR_MOBILE_FAILED = 107;</code>
     *
     * <pre>
     *手机验证失败
     * </pre>
     */
    ERR_MOBILE_FAILED(17, 107),
    /**
     * <code>ERR_CODE_FAILED = 108;</code>
     *
     * <pre>
     *验证码不一致
     * </pre>
     */
    ERR_CODE_FAILED(18, 108),
    /**
     * <code>ERR_AUTHORIZED_FAILED = 109;</code>
     *
     * <pre>
     *权限不足
     * </pre>
     */
    ERR_AUTHORIZED_FAILED(19, 109),
    /**
     * <code>ERR_DEBT_INVALID = 200;</code>
     *
     * <pre>
     *---------------------债务相关错误码-----------------------------------
     * </pre>
     */
    ERR_DEBT_INVALID(20, 200),
    /**
     * <code>ERR_DEBT_BID_LOW = 201;</code>
     *
     * <pre>
     *投标金额不足
     * </pre>
     */
    ERR_DEBT_BID_LOW(21, 201),
    /**
     * <code>ERR_DEBT_EXPIRED = 202;</code>
     *
     * <pre>
     *过期
     * </pre>
     */
    ERR_DEBT_EXPIRED(22, 202),
    ;

    /**
     * <code>ERR_SYSTEM = 1;</code>
     *
     * <pre>
     *-----------------系统相关错误码----------------------------
     * </pre>
     */
    public static final int ERR_SYSTEM_VALUE = 1;
    /**
     * <code>ERR_UNKNOWN = 2;</code>
     *
     * <pre>
     *未知错误
     * </pre>
     */
    public static final int ERR_UNKNOWN_VALUE = 2;
    /**
     * <code>ERR_PARAMETER = 3;</code>
     *
     * <pre>
     *错误的参数
     * </pre>
     */
    public static final int ERR_PARAMETER_VALUE = 3;
    /**
     * <code>ERR_NET_TIMEOUT = 4;</code>
     *
     * <pre>
     *网络超时
     * </pre>
     */
    public static final int ERR_NET_TIMEOUT_VALUE = 4;
    /**
     * <code>ERR_PLATFORM_INVALID = 5;</code>
     *
     * <pre>
     *平台校验无效
     * </pre>
     */
    public static final int ERR_PLATFORM_INVALID_VALUE = 5;
    /**
     * <code>ERR_ILLEGAL_REQUEST = 6;</code>
     *
     * <pre>
     *非法请求
     * </pre>
     */
    public static final int ERR_ILLEGAL_REQUEST_VALUE = 6;
    /**
     * <code>ERR_MAINTAIN = 7;</code>
     *
     * <pre>
     *服务器维护中
     * </pre>
     */
    public static final int ERR_MAINTAIN_VALUE = 7;
    /**
     * <code>ERR_MAX_ONLINE = 8;</code>
     *
     * <pre>
     *最大在线人数
     * </pre>
     */
    public static final int ERR_MAX_ONLINE_VALUE = 8;
    /**
     * <code>ERR_OTHER_LOGIN = 9;</code>
     *
     * <pre>
     *异地登陆
     * </pre>
     */
    public static final int ERR_OTHER_LOGIN_VALUE = 9;
    /**
     * <code>ERR_SERVER_STOPPING = 10;</code>
     *
     * <pre>
     *停服中
     * </pre>
     */
    public static final int ERR_SERVER_STOPPING_VALUE = 10;
    /**
     * <code>ERR_ACCOUNT_FORBIDDEN = 100;</code>
     *
     * <pre>
     *---------------------玩家相关错误码-----------------------------------
     * </pre>
     */
    public static final int ERR_ACCOUNT_FORBIDDEN_VALUE = 100;
    /**
     * <code>ERR_LOGOUT = 101;</code>
     *
     * <pre>
     *登出
     * </pre>
     */
    public static final int ERR_LOGOUT_VALUE = 101;
    /**
     * <code>ERR_NO_MONEY = 102;</code>
     *
     * <pre>
     *RMB不足
     * </pre>
     */
    public static final int ERR_NO_MONEY_VALUE = 102;
    /**
     * <code>ERR_NO_PLAYER = 103;</code>
     *
     * <pre>
     *不存在
     * </pre>
     */
    public static final int ERR_NO_PLAYER_VALUE = 103;
    /**
     * <code>ERR_EMAIL_EXIST = 104;</code>
     *
     * <pre>
     *存在email
     * </pre>
     */
    public static final int ERR_EMAIL_EXIST_VALUE = 104;
    /**
     * <code>ERR_MOBILE_EXIST = 105;</code>
     *
     * <pre>
     *存在mobile
     * </pre>
     */
    public static final int ERR_MOBILE_EXIST_VALUE = 105;
    /**
     * <code>ERR_PASSWD_NOT_SAME = 106;</code>
     *
     * <pre>
     *密码不一致
     * </pre>
     */
    public static final int ERR_PASSWD_NOT_SAME_VALUE = 106;
    /**
     * <code>ERR_MOBILE_FAILED = 107;</code>
     *
     * <pre>
     *手机验证失败
     * </pre>
     */
    public static final int ERR_MOBILE_FAILED_VALUE = 107;
    /**
     * <code>ERR_CODE_FAILED = 108;</code>
     *
     * <pre>
     *验证码不一致
     * </pre>
     */
    public static final int ERR_CODE_FAILED_VALUE = 108;
    /**
     * <code>ERR_AUTHORIZED_FAILED = 109;</code>
     *
     * <pre>
     *权限不足
     * </pre>
     */
    public static final int ERR_AUTHORIZED_FAILED_VALUE = 109;
    /**
     * <code>ERR_DEBT_INVALID = 200;</code>
     *
     * <pre>
     *---------------------债务相关错误码-----------------------------------
     * </pre>
     */
    public static final int ERR_DEBT_INVALID_VALUE = 200;
    /**
     * <code>ERR_DEBT_BID_LOW = 201;</code>
     *
     * <pre>
     *投标金额不足
     * </pre>
     */
    public static final int ERR_DEBT_BID_LOW_VALUE = 201;
    /**
     * <code>ERR_DEBT_EXPIRED = 202;</code>
     *
     * <pre>
     *过期
     * </pre>
     */
    public static final int ERR_DEBT_EXPIRED_VALUE = 202;


    public final int getNumber() { return value; }

    public static ErrorCode valueOf(int value) {
      switch (value) {
        case 1: return ERR_SYSTEM;
        case 2: return ERR_UNKNOWN;
        case 3: return ERR_PARAMETER;
        case 4: return ERR_NET_TIMEOUT;
        case 5: return ERR_PLATFORM_INVALID;
        case 6: return ERR_ILLEGAL_REQUEST;
        case 7: return ERR_MAINTAIN;
        case 8: return ERR_MAX_ONLINE;
        case 9: return ERR_OTHER_LOGIN;
        case 10: return ERR_SERVER_STOPPING;
        case 100: return ERR_ACCOUNT_FORBIDDEN;
        case 101: return ERR_LOGOUT;
        case 102: return ERR_NO_MONEY;
        case 103: return ERR_NO_PLAYER;
        case 104: return ERR_EMAIL_EXIST;
        case 105: return ERR_MOBILE_EXIST;
        case 106: return ERR_PASSWD_NOT_SAME;
        case 107: return ERR_MOBILE_FAILED;
        case 108: return ERR_CODE_FAILED;
        case 109: return ERR_AUTHORIZED_FAILED;
        case 200: return ERR_DEBT_INVALID;
        case 201: return ERR_DEBT_BID_LOW;
        case 202: return ERR_DEBT_EXPIRED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ErrorCode>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<ErrorCode>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ErrorCode>() {
            public ErrorCode findValueByNumber(int number) {
              return ErrorCode.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.zc.web.message.ErrorCodeProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final ErrorCode[] VALUES = values();

    public static ErrorCode valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private ErrorCode(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.zc.web.message.ErrorCode)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.main/resources/com/zc/messages/ErrorCo" +
      "de.proto\022\022com.zc.web.message*\373\003\n\tErrorCo" +
      "de\022\016\n\nERR_SYSTEM\020\001\022\017\n\013ERR_UNKNOWN\020\002\022\021\n\rE" +
      "RR_PARAMETER\020\003\022\023\n\017ERR_NET_TIMEOUT\020\004\022\030\n\024E" +
      "RR_PLATFORM_INVALID\020\005\022\027\n\023ERR_ILLEGAL_REQ" +
      "UEST\020\006\022\020\n\014ERR_MAINTAIN\020\007\022\022\n\016ERR_MAX_ONLI" +
      "NE\020\010\022\023\n\017ERR_OTHER_LOGIN\020\t\022\027\n\023ERR_SERVER_" +
      "STOPPING\020\n\022\031\n\025ERR_ACCOUNT_FORBIDDEN\020d\022\016\n" +
      "\nERR_LOGOUT\020e\022\020\n\014ERR_NO_MONEY\020f\022\021\n\rERR_N" +
      "O_PLAYER\020g\022\023\n\017ERR_EMAIL_EXIST\020h\022\024\n\020ERR_M",
      "OBILE_EXIST\020i\022\027\n\023ERR_PASSWD_NOT_SAME\020j\022\025" +
      "\n\021ERR_MOBILE_FAILED\020k\022\023\n\017ERR_CODE_FAILED" +
      "\020l\022\031\n\025ERR_AUTHORIZED_FAILED\020m\022\025\n\020ERR_DEB" +
      "T_INVALID\020\310\001\022\025\n\020ERR_DEBT_BID_LOW\020\311\001\022\025\n\020E" +
      "RR_DEBT_EXPIRED\020\312\001B\020B\016ErrorCodeProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
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
