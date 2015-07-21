package com.zc.web.util;

import org.apache.log4j.Logger;

/**
 * 用于统计的通用日志记录
 * 
 * @author dan
 *
 */
public class LogUtil {
	
	private static Logger logLogin = Logger.getLogger("LOGIN");
	private static Logger logStat = Logger.getLogger("STAT");
	
	/**
	 * 登录
	 * 
	 * @param channelId 渠道ID
	 */
	public static void logLogin(long id, String name, String... strings) {
		StringBuffer sb = logStart(id);
		sb.append("login|");
		logEnd(logLogin, sb, strings);
	}
	
	/**
	 * 创建用户
	 * 
	 * @param channelId 渠道ID
	 */
	public static void logCreatePlayer(long id, String name, String... strings) {
		StringBuffer sb = logStart(id);
		sb.append("createPlayer|");
		logEnd(logLogin, sb, strings);
	}
	
	public static void logAddMoney(long id, int money, int oldMoney, int current, String... strings){
		StringBuffer sb = logStart(id);
		sb.append("addMoney|");
		sb.append(money).append("|");
		sb.append(oldMoney).append("|");
		sb.append(current).append("|");
		logEnd(logStat, sb, strings);
	}
	
	public static void logAddRating(long id, int rating, int oldRating, int current, String... strings){
		StringBuffer sb = logStart(id);
		sb.append("addRating|");
		sb.append(rating).append("|");
		sb.append(oldRating).append("|");
		sb.append(current).append("|");
		logEnd(logStat, sb, strings);
	}

	public static void logReduceMoney(long id, int money, int oldMoney, int current, String... strings){
		StringBuffer sb = logStart(id);
		sb.append("reduceMoney|");
		sb.append(money).append("|");
		sb.append(oldMoney).append("|");
		sb.append(current).append("|");
		logEnd(logStat, sb, strings);
	}
	
	
	//------------------------------------------------------------------------------------------------------------------
	
	/**
	 * 初始数据
	 * 
	 * @param id
	 * @param openId
	 * @param level
	 * @return
	 */
	private static StringBuffer logStart(long id){
		StringBuffer sb = new StringBuffer();
		sb.append(id).append("|");
		return sb;
	}
	
	private static void logEnd(Logger log, StringBuffer sb, String... strings){
		for(String s : strings){
			sb.append(s).append("|");
		}
		log.info(sb.toString());
	}

}
