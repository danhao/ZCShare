// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: main/resources/com/zc/messages/ClientAction.proto

package com.zc.web.message;

public final class ClientActionProto {
  private ClientActionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  /**
   * Protobuf enum {@code com.zc.web.message.ClientAction}
   */
  public enum ClientAction
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ACTION_LOGIN = 1;</code>
     *
     * <pre>
     * 登录操作(player.LoginReq----&gt;player.PlayerMsg)
     * </pre>
     */
    ACTION_LOGIN(0, 1),
    /**
     * <code>ACTION_CREATE_USER = 2;</code>
     *
     * <pre>
     * 注册(player.PlayerMsg----&gt;player.PlayerMsg)
     * </pre>
     */
    ACTION_CREATE_USER(1, 2),
    /**
     * <code>ACTION_GET_USER = 3;</code>
     *
     * <pre>
     * 获取用户(null----&gt;player.PlayerMsg)
     * </pre>
     */
    ACTION_GET_USER(2, 3),
    /**
     * <code>ACTION_VALIDATE = 4;</code>
     *
     * <pre>
     * 验证用户(player.ValidateReq----&gt;null)
     * </pre>
     */
    ACTION_VALIDATE(3, 4),
    /**
     * <code>ACTION_VALIDATE_EMAIL = 5;</code>
     *
     * <pre>
     * 验证Email(null----&gt;null)
     * </pre>
     */
    ACTION_VALIDATE_EMAIL(4, 5),
    /**
     * <code>ACTION_UPDATE_USER = 6;</code>
     *
     * <pre>
     * 更新用户(player.UpdateReq----&gt;null)
     * </pre>
     */
    ACTION_UPDATE_USER(5, 6),
    /**
     * <code>ACTION_SEND_MOBILE_CODE = 7;</code>
     *
     * <pre>
     * 发短信验证码(null----&gt;null)
     * </pre>
     */
    ACTION_SEND_MOBILE_CODE(6, 7),
    /**
     * <code>ACTION_VALIDATE_MOBILE = 8;</code>
     *
     * <pre>
     * 验证手机(player.ValidateMobileReq----&gt;null)
     * </pre>
     */
    ACTION_VALIDATE_MOBILE(7, 8),
    /**
     * <code>ACTION_CHANGE_PWD_ONE = 9;</code>
     *
     * <pre>
     * 重置密码第一步(player.ChangePwdReq----&gt;null)
     * </pre>
     */
    ACTION_CHANGE_PWD_ONE(8, 9),
    /**
     * <code>ACTION_CHANGE_PWD_TWO = 10;</code>
     *
     * <pre>
     * 重置密码第二步(player.ChangePwdReq----&gt;null)
     * </pre>
     */
    ACTION_CHANGE_PWD_TWO(9, 10),
    /**
     * <code>ACTION_CHANGE_PWD_THREE = 11;</code>
     *
     * <pre>
     * 重置密码第三步(player.ChangePwdReq----&gt;null)
     * </pre>
     */
    ACTION_CHANGE_PWD_THREE(10, 11),
    /**
     * <code>ACTION_GET_OTHER = 12;</code>
     *
     * <pre>
     * 查看他人(common.SingleMsg----&gt;player.SimplePlayerMsg)
     * </pre>
     */
    ACTION_GET_OTHER(11, 12),
    /**
     * <code>ACTION_LIST_MONEY_HISTORY = 13;</code>
     *
     * <pre>
     * 查看资金使用情况(player.ListMoneyHistoryReq----&gt;player.ListMoneyHistoryRsp)
     * </pre>
     */
    ACTION_LIST_MONEY_HISTORY(12, 13),
    /**
     * <code>ACTION_LIST_SITUAION = 14;</code>
     *
     * <pre>
     * 查看动态(null----&gt;player.ListSituationRsp)
     * </pre>
     */
    ACTION_LIST_SITUAION(13, 14),
    /**
     * <code>ACTION_LIST_CO_PLAYERS = 15;</code>
     *
     * <pre>
     * 最新企业用户(null----&gt;player.ListCoPlayersRsp)
     * </pre>
     */
    ACTION_LIST_CO_PLAYERS(14, 15),
    /**
     * <code>ACTION_SET_ALERT = 16;</code>
     *
     * <pre>
     * 提醒设置(player.AlertMsg----&gt;null)
     * </pre>
     */
    ACTION_SET_ALERT(15, 16),
    /**
     * <code>ACTION_BUY_VIP = 17;</code>
     *
     * <pre>
     * 购买VIP(common.SingleMsg(VIP等级)----&gt;null)
     * </pre>
     */
    ACTION_BUY_VIP(16, 17),
    /**
     * <code>ACTION_UPLOAD_PREPARE = 51;</code>
     *
     * <pre>
     * 准备上传文件(null----&gt;common.UploadMsg)
     * </pre>
     */
    ACTION_UPLOAD_PREPARE(17, 51),
    /**
     * <code>ACTION_CREATE_DEBT = 100;</code>
     *
     * <pre>
     * 创建债务(debt.DebtMsg----&gt;debt.DebtMsg)
     * </pre>
     */
    ACTION_CREATE_DEBT(18, 100),
    /**
     * <code>ACTION_LIST_DEBTS = 101;</code>
     *
     * <pre>
     * 债务列表(debt.ListDebtsReq----&gt;debt.ListDebtsRsp)
     * </pre>
     */
    ACTION_LIST_DEBTS(19, 101),
    /**
     * <code>ACTION_VIEW_DEBT = 102;</code>
     *
     * <pre>
     * 债务详情(common.SingleMsg----&gt;debt.DebtMsg)
     * </pre>
     */
    ACTION_VIEW_DEBT(20, 102),
    /**
     * <code>ACTION_LIST_VIEW_DEBTS = 103;</code>
     *
     * <pre>
     * 首页债务列表(null----&gt;debt.ListDebtsRsp)
     * </pre>
     */
    ACTION_LIST_VIEW_DEBTS(21, 103),
    /**
     * <code>ACTION_BID = 104;</code>
     *
     * <pre>
     * 投标(debt.BidReq----&gt;null)
     * </pre>
     */
    ACTION_BID(22, 104),
    /**
     * <code>ACTION_BID_WIN = 105;</code>
     *
     * <pre>
     * 中标(debt.BidWinReq----&gt;debt.DebtMsg)
     * </pre>
     */
    ACTION_BID_WIN(23, 105),
    /**
     * <code>ACTION_ADD_MESSAGE = 106;</code>
     *
     * <pre>
     * 增加动态(debt.MessageMsg----&gt;null)
     * </pre>
     */
    ACTION_ADD_MESSAGE(24, 106),
    /**
     * <code>ACTION_LIST_SELF_DEBTS = 107;</code>
     *
     * <pre>
     * 我相关的债务(common.SingleMsg(1:我发布的 2:我投标的 3:我中标的)----&gt;debt.ListDebtsRsp)
     * </pre>
     */
    ACTION_LIST_SELF_DEBTS(25, 107),
    /**
     * <code>ACTION_CREATE_ORDER = 200;</code>
     *
     * <pre>
     * 创建订单(pay.CreateOrderReq----&gt;pay.CreateOrderRsp)
     * </pre>
     */
    ACTION_CREATE_ORDER(26, 200),
    /**
     * <code>ACTION_DRAW_CASH = 201;</code>
     *
     * <pre>
     * 提现申请(pay.PlayerCashMsg----&gt;null)
     * </pre>
     */
    ACTION_DRAW_CASH(27, 201),
    ;

    /**
     * <code>ACTION_LOGIN = 1;</code>
     *
     * <pre>
     * 登录操作(player.LoginReq----&gt;player.PlayerMsg)
     * </pre>
     */
    public static final int ACTION_LOGIN_VALUE = 1;
    /**
     * <code>ACTION_CREATE_USER = 2;</code>
     *
     * <pre>
     * 注册(player.PlayerMsg----&gt;player.PlayerMsg)
     * </pre>
     */
    public static final int ACTION_CREATE_USER_VALUE = 2;
    /**
     * <code>ACTION_GET_USER = 3;</code>
     *
     * <pre>
     * 获取用户(null----&gt;player.PlayerMsg)
     * </pre>
     */
    public static final int ACTION_GET_USER_VALUE = 3;
    /**
     * <code>ACTION_VALIDATE = 4;</code>
     *
     * <pre>
     * 验证用户(player.ValidateReq----&gt;null)
     * </pre>
     */
    public static final int ACTION_VALIDATE_VALUE = 4;
    /**
     * <code>ACTION_VALIDATE_EMAIL = 5;</code>
     *
     * <pre>
     * 验证Email(null----&gt;null)
     * </pre>
     */
    public static final int ACTION_VALIDATE_EMAIL_VALUE = 5;
    /**
     * <code>ACTION_UPDATE_USER = 6;</code>
     *
     * <pre>
     * 更新用户(player.UpdateReq----&gt;null)
     * </pre>
     */
    public static final int ACTION_UPDATE_USER_VALUE = 6;
    /**
     * <code>ACTION_SEND_MOBILE_CODE = 7;</code>
     *
     * <pre>
     * 发短信验证码(null----&gt;null)
     * </pre>
     */
    public static final int ACTION_SEND_MOBILE_CODE_VALUE = 7;
    /**
     * <code>ACTION_VALIDATE_MOBILE = 8;</code>
     *
     * <pre>
     * 验证手机(player.ValidateMobileReq----&gt;null)
     * </pre>
     */
    public static final int ACTION_VALIDATE_MOBILE_VALUE = 8;
    /**
     * <code>ACTION_CHANGE_PWD_ONE = 9;</code>
     *
     * <pre>
     * 重置密码第一步(player.ChangePwdReq----&gt;null)
     * </pre>
     */
    public static final int ACTION_CHANGE_PWD_ONE_VALUE = 9;
    /**
     * <code>ACTION_CHANGE_PWD_TWO = 10;</code>
     *
     * <pre>
     * 重置密码第二步(player.ChangePwdReq----&gt;null)
     * </pre>
     */
    public static final int ACTION_CHANGE_PWD_TWO_VALUE = 10;
    /**
     * <code>ACTION_CHANGE_PWD_THREE = 11;</code>
     *
     * <pre>
     * 重置密码第三步(player.ChangePwdReq----&gt;null)
     * </pre>
     */
    public static final int ACTION_CHANGE_PWD_THREE_VALUE = 11;
    /**
     * <code>ACTION_GET_OTHER = 12;</code>
     *
     * <pre>
     * 查看他人(common.SingleMsg----&gt;player.SimplePlayerMsg)
     * </pre>
     */
    public static final int ACTION_GET_OTHER_VALUE = 12;
    /**
     * <code>ACTION_LIST_MONEY_HISTORY = 13;</code>
     *
     * <pre>
     * 查看资金使用情况(player.ListMoneyHistoryReq----&gt;player.ListMoneyHistoryRsp)
     * </pre>
     */
    public static final int ACTION_LIST_MONEY_HISTORY_VALUE = 13;
    /**
     * <code>ACTION_LIST_SITUAION = 14;</code>
     *
     * <pre>
     * 查看动态(null----&gt;player.ListSituationRsp)
     * </pre>
     */
    public static final int ACTION_LIST_SITUAION_VALUE = 14;
    /**
     * <code>ACTION_LIST_CO_PLAYERS = 15;</code>
     *
     * <pre>
     * 最新企业用户(null----&gt;player.ListCoPlayersRsp)
     * </pre>
     */
    public static final int ACTION_LIST_CO_PLAYERS_VALUE = 15;
    /**
     * <code>ACTION_SET_ALERT = 16;</code>
     *
     * <pre>
     * 提醒设置(player.AlertMsg----&gt;null)
     * </pre>
     */
    public static final int ACTION_SET_ALERT_VALUE = 16;
    /**
     * <code>ACTION_BUY_VIP = 17;</code>
     *
     * <pre>
     * 购买VIP(common.SingleMsg(VIP等级)----&gt;null)
     * </pre>
     */
    public static final int ACTION_BUY_VIP_VALUE = 17;
    /**
     * <code>ACTION_UPLOAD_PREPARE = 51;</code>
     *
     * <pre>
     * 准备上传文件(null----&gt;common.UploadMsg)
     * </pre>
     */
    public static final int ACTION_UPLOAD_PREPARE_VALUE = 51;
    /**
     * <code>ACTION_CREATE_DEBT = 100;</code>
     *
     * <pre>
     * 创建债务(debt.DebtMsg----&gt;debt.DebtMsg)
     * </pre>
     */
    public static final int ACTION_CREATE_DEBT_VALUE = 100;
    /**
     * <code>ACTION_LIST_DEBTS = 101;</code>
     *
     * <pre>
     * 债务列表(debt.ListDebtsReq----&gt;debt.ListDebtsRsp)
     * </pre>
     */
    public static final int ACTION_LIST_DEBTS_VALUE = 101;
    /**
     * <code>ACTION_VIEW_DEBT = 102;</code>
     *
     * <pre>
     * 债务详情(common.SingleMsg----&gt;debt.DebtMsg)
     * </pre>
     */
    public static final int ACTION_VIEW_DEBT_VALUE = 102;
    /**
     * <code>ACTION_LIST_VIEW_DEBTS = 103;</code>
     *
     * <pre>
     * 首页债务列表(null----&gt;debt.ListDebtsRsp)
     * </pre>
     */
    public static final int ACTION_LIST_VIEW_DEBTS_VALUE = 103;
    /**
     * <code>ACTION_BID = 104;</code>
     *
     * <pre>
     * 投标(debt.BidReq----&gt;null)
     * </pre>
     */
    public static final int ACTION_BID_VALUE = 104;
    /**
     * <code>ACTION_BID_WIN = 105;</code>
     *
     * <pre>
     * 中标(debt.BidWinReq----&gt;debt.DebtMsg)
     * </pre>
     */
    public static final int ACTION_BID_WIN_VALUE = 105;
    /**
     * <code>ACTION_ADD_MESSAGE = 106;</code>
     *
     * <pre>
     * 增加动态(debt.MessageMsg----&gt;null)
     * </pre>
     */
    public static final int ACTION_ADD_MESSAGE_VALUE = 106;
    /**
     * <code>ACTION_LIST_SELF_DEBTS = 107;</code>
     *
     * <pre>
     * 我相关的债务(common.SingleMsg(1:我发布的 2:我投标的 3:我中标的)----&gt;debt.ListDebtsRsp)
     * </pre>
     */
    public static final int ACTION_LIST_SELF_DEBTS_VALUE = 107;
    /**
     * <code>ACTION_CREATE_ORDER = 200;</code>
     *
     * <pre>
     * 创建订单(pay.CreateOrderReq----&gt;pay.CreateOrderRsp)
     * </pre>
     */
    public static final int ACTION_CREATE_ORDER_VALUE = 200;
    /**
     * <code>ACTION_DRAW_CASH = 201;</code>
     *
     * <pre>
     * 提现申请(pay.PlayerCashMsg----&gt;null)
     * </pre>
     */
    public static final int ACTION_DRAW_CASH_VALUE = 201;


    public final int getNumber() { return value; }

    public static ClientAction valueOf(int value) {
      switch (value) {
        case 1: return ACTION_LOGIN;
        case 2: return ACTION_CREATE_USER;
        case 3: return ACTION_GET_USER;
        case 4: return ACTION_VALIDATE;
        case 5: return ACTION_VALIDATE_EMAIL;
        case 6: return ACTION_UPDATE_USER;
        case 7: return ACTION_SEND_MOBILE_CODE;
        case 8: return ACTION_VALIDATE_MOBILE;
        case 9: return ACTION_CHANGE_PWD_ONE;
        case 10: return ACTION_CHANGE_PWD_TWO;
        case 11: return ACTION_CHANGE_PWD_THREE;
        case 12: return ACTION_GET_OTHER;
        case 13: return ACTION_LIST_MONEY_HISTORY;
        case 14: return ACTION_LIST_SITUAION;
        case 15: return ACTION_LIST_CO_PLAYERS;
        case 16: return ACTION_SET_ALERT;
        case 17: return ACTION_BUY_VIP;
        case 51: return ACTION_UPLOAD_PREPARE;
        case 100: return ACTION_CREATE_DEBT;
        case 101: return ACTION_LIST_DEBTS;
        case 102: return ACTION_VIEW_DEBT;
        case 103: return ACTION_LIST_VIEW_DEBTS;
        case 104: return ACTION_BID;
        case 105: return ACTION_BID_WIN;
        case 106: return ACTION_ADD_MESSAGE;
        case 107: return ACTION_LIST_SELF_DEBTS;
        case 200: return ACTION_CREATE_ORDER;
        case 201: return ACTION_DRAW_CASH;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ClientAction>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<ClientAction>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ClientAction>() {
            public ClientAction findValueByNumber(int number) {
              return ClientAction.valueOf(number);
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
      return com.zc.web.message.ClientActionProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final ClientAction[] VALUES = values();

    public static ClientAction valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private ClientAction(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.zc.web.message.ClientAction)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1main/resources/com/zc/messages/ClientA" +
      "ction.proto\022\022com.zc.web.message*\273\005\n\014Clie" +
      "ntAction\022\020\n\014ACTION_LOGIN\020\001\022\026\n\022ACTION_CRE" +
      "ATE_USER\020\002\022\023\n\017ACTION_GET_USER\020\003\022\023\n\017ACTIO" +
      "N_VALIDATE\020\004\022\031\n\025ACTION_VALIDATE_EMAIL\020\005\022" +
      "\026\n\022ACTION_UPDATE_USER\020\006\022\033\n\027ACTION_SEND_M" +
      "OBILE_CODE\020\007\022\032\n\026ACTION_VALIDATE_MOBILE\020\010" +
      "\022\031\n\025ACTION_CHANGE_PWD_ONE\020\t\022\031\n\025ACTION_CH" +
      "ANGE_PWD_TWO\020\n\022\033\n\027ACTION_CHANGE_PWD_THRE" +
      "E\020\013\022\024\n\020ACTION_GET_OTHER\020\014\022\035\n\031ACTION_LIST",
      "_MONEY_HISTORY\020\r\022\030\n\024ACTION_LIST_SITUAION" +
      "\020\016\022\032\n\026ACTION_LIST_CO_PLAYERS\020\017\022\024\n\020ACTION" +
      "_SET_ALERT\020\020\022\022\n\016ACTION_BUY_VIP\020\021\022\031\n\025ACTI" +
      "ON_UPLOAD_PREPARE\0203\022\026\n\022ACTION_CREATE_DEB" +
      "T\020d\022\025\n\021ACTION_LIST_DEBTS\020e\022\024\n\020ACTION_VIE" +
      "W_DEBT\020f\022\032\n\026ACTION_LIST_VIEW_DEBTS\020g\022\016\n\n" +
      "ACTION_BID\020h\022\022\n\016ACTION_BID_WIN\020i\022\026\n\022ACTI" +
      "ON_ADD_MESSAGE\020j\022\032\n\026ACTION_LIST_SELF_DEB" +
      "TS\020k\022\030\n\023ACTION_CREATE_ORDER\020\310\001\022\025\n\020ACTION" +
      "_DRAW_CASH\020\311\001B\023B\021ClientActionProto"
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
