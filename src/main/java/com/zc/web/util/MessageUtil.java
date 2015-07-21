package com.zc.web.util;

import com.alibaba.fastjson.JSONObject;
import com.zc.web.message.ErrorMessage;
import com.zc.web.message.ErrorMsgProto.ErrorMsg;

/**
 * 协议工具类
 * @author Administrator
 *
 */
public class MessageUtil {

	/**
	 * 构建错误信息
	 * @param errorCode
	 * @param args
	 * @return
	 */
	public static String buildErrorMsg(long playerId, int actionCode, int errorCode){
		JSONObject json = new JSONObject();
		json.put("pid", playerId);
		json.put("code", actionCode);
		json.put("error", errorCode);
		return json.toJSONString();
	}
	
	/**
	 * 构建错误信息
	 * @param errorCode
	 * @param args
	 * @return
	 */
	public static ErrorMessage buildErrorMsg(int errorCode, Object... args){
		ErrorMessage msg = new ErrorMessage();
		msg.setErrorCode(errorCode);
		if(args.length > 0){
			StringBuffer sb = new StringBuffer();
			for(int i = 0; i < args.length; i ++){
				sb.append((String)args[i]);
			}
			msg.setErrorText(sb.toString());
		}else
			msg.setErrorText("出现异常，请重试或者重新登录！");
		return msg;
	}	
	
	/**
	 * 构建PB错误信息
	 * @param msg
	 * @return
	 */
	public static ErrorMsg buildPBErrorMsg(ErrorMessage msg){
		ErrorMsg.Builder builder = ErrorMsg.newBuilder();
		builder.setCode(msg.getErrorCode());
		builder.setText(msg.getErrorText());
		return builder.build();
	}
	/**
	 * 构建错误信息
	 * @param errorCode
	 * @param args
	 * @return
	 */
	public static ErrorMsg buildPBErrorMsg(int errorCode, Object... args){
		ErrorMsg.Builder builder = ErrorMsg.newBuilder();
		builder.setCode(errorCode);
//		ConfigInformation configInformation = ConfigHelper.getConfigInformation(errorCode);
//		if(configInformation == null){
//			configInformation = ConfigHelper.getConfigInformation(ErrorCode.ERR_UNKNOWN_VALUE);
//		}
		String msg = "SERVER ERROR~~~";//configInformation.getContent();
//		msg = MessageFormat.format(msg, args);
		builder.setText(msg);
		return builder.build();
	}

}
