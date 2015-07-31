package com.zc.web.core;

import org.apache.commons.codec.binary.Base64;

import com.zc.web.util.HMACSHA1;

public class Constant {
	
	public static final int ONE_DAY = 24 * 3600;
	
	// 登录过期时间
	public static final int SESSION_EXPIRED = 15 * ONE_DAY;
	
	// 阿里云OSS服务
	public static final String OSSAccessKeyId = "1P160AxzpPoOG6Ej";
	public static final String OSSAccessKeySecret = "3ZYEqfI5JKqaQo2P9zS3HlrJIQDWHd";
	public static final String POLICY = "ewoiZXhwaXJhdGlvbiI6ICIyMTIwLTAxLTAxVDEyOjAwOjAwLjAwMFoiLAoiY29uZGl0aW9ucyI6IFsKWyJjb250ZW50LWxlbmd0aC1yYW5nZSIsIDAsIDEwNDg1NzYwMF0KXQp9Cg==";
	public static final String BUCKET = "zichan";
	public static final String ENDPOINT = "oss-cn-shenzhen.aliyuncs.com";
	public static String SIGNATURE = "";
	
	// 通联支付
	public static final String CERT_PATH = "/usr/local/etc/TLCert.cer";
	
	// 信用评分
	public static final int RATING_CREDIT = 5;
	public static final int RATING_NONECRIME = 5;
	public static final int RATING_CLOSE_DEAL = 1;
	
	// 平台服务费，百分比，佣金中扣除
	public static final int SERVICE_FEE = 5;
	
	static{
		SIGNATURE = Base64.encodeBase64String(HMACSHA1.getSignature(POLICY, OSSAccessKeySecret));
	}
	
	public static final int BOND = 10;		// 保证金，百分比
	public static final int MAX_BOND = 50000;	// 最高保证金（分）
	
	// 0未审核；1已通过；2未通过；3已成交；4已完成；
	public static final int STATE_NEW = 0;
	public static final int STATE_PUBLISH = 1;
	public static final int STATE_FAILED = 2;
	public static final int STATE_DEALED = 3;
	public static final int STATE_CLOSED = 4;
	
	// 债务类型
	public static final int TYPE_DEPUTY = 1;
	public static final int TYPE_BID = 2;
	
	// 用户身份
	public static final int USER_EMAIL_VALIDATED = 1;
	public static final int USER_MOBILE_VALIDATED = 2;
	public static final int USER_ID_VALIDATED = 4;
	public static final int USER_CO_VALIDATED = 8;
	
	// 0：系统；1：充值；2：结单；3：保证金返回；4：提现；5：支付保证金；6：购买VIP
	public static final int MONEY_TYPE_ADMIN = 0;
	public static final int MONEY_TYPE_CHARGE = 1;
	public static final int MONEY_TYPE_CLOSE = 2;
	public static final int MONEY_TYPE_BOND_RETURN = 3;
	public static final int MONEY_TYPE_REDRAW = 4;
	public static final int MONEY_TYPE_BOND_PAY = 5;
	public static final int MONEY_TYPE_BUY_VIP = 6;
	
	// 0：失败；1：成功
	public static final int MONEY_STATE_FAIL = 0;
	public static final int MONEY_STATE_SUCC = 1;
	
	// 0：默认；1：银联
	public static final int MONEY_PLATFORM_DEFAULT = 0;
	public static final int MONEY_PLATFORM_UNIONPAY = 1;
	
	// 1：发布债务 2:回款结单
	public static final int SITUATION_CREATE_DEBT = 1;
	public static final int SITUATION_DEBT_END = 2;
	public static final int SITUATION_BOND_RETURN = 3;
	
	// 用户角色：0有债务；1催债
	public static final int USER_ROLE_CREDITOR = 0;
	public static final int USER_ROLE_DEPUTOR = 1;
	
}
