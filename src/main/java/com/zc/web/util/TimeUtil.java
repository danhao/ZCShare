package com.zc.web.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 时间相关的工具类
 * @author Administrator
 *
 */
public class TimeUtil {
	/**秒*/
	public static int SECOND = 1;
	/**分钟*/
	public static int MINUTE = SECOND * 60;
	/**小时*/
	public static int HOUR = MINUTE * 60;
	/**天*/
	public static int DAY = HOUR * 24;
	
	/**
	 * 当前时间(单位:秒)
	 * @return
	 */
	public static int now(){
		return (int)(System.currentTimeMillis() / 1000);
	}
	
	/**
	 * 判断时间是否为今天
	 * @param time 时间:单位s
	 * @return
	 */
	public static boolean isToday(int time){
		if(time == 0){
			return false;
		}
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int day = cal.get(Calendar.DAY_OF_YEAR);
		
		cal.setTimeInMillis(time * 1000L);
		if(year == cal.get(Calendar.YEAR) && day == cal.get(Calendar.DAY_OF_YEAR)){
			return true;
		}
		return false;
	}
	
	/**
	 * 判断两个时间是否为同一天
	 * @param time1 单位秒
	 * @param time2 单位秒
	 * @return
	 */
	public static boolean isSameDay(int time1, int time2){
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(time1 * 1000L);
		int year = cal.get(Calendar.YEAR);
		int day = cal.get(Calendar.DAY_OF_YEAR);
		
		cal.setTimeInMillis(time2 * 1000L);
		if(year == cal.get(Calendar.YEAR) && day == cal.get(Calendar.DAY_OF_YEAR)){
			return true;
		}
		return false;
	}
	/**
	 * 判断时间是否在指定范围
	 * @param time	需要判断的时间(单位:秒)
	 * @param startTime 开始时间(单位:秒)
	 * @param endTime 结束时间(单位:秒)
	 * @return
	 */
	public static boolean isRange(int time,int startTime,int endTime)
	{
		return (time >= startTime && time <= endTime);
	}
	
	/**
	 * 计算两个时间相隔的天数
	 * @param time1 开始时间
	 * @param time2 结束时间
	 * @return
	 */
	public static int dayDelta(int time1, int time2){
		if((time1 - time2) > 0){
			return -1;
		}
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(time1 * 1000L);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		
		int tmpTime = (int)(cal.getTimeInMillis() / 1000);
		int deltaTime = time2 - tmpTime;
		int deltaDay = deltaTime / DAY;
		return deltaDay;
	}
	
	public static String dateToString(Date pdttValue, String pstrDateFormat) {
		String pstrDate = null; // return value
		if (pdttValue == null) {
			return null;
		}
		if ((pstrDateFormat == null) || (pstrDateFormat.equals(""))) {
			pstrDateFormat = "yyyy-MM-dd";
		}
		SimpleDateFormat oFormatter = new SimpleDateFormat(pstrDateFormat);
		pstrDate = oFormatter.format(pdttValue);
		return pstrDate;
	}
	
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(0);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(cal.getTime()));
		
		try {
			Date date = sdf.parse("2014-02-27 14:19:56");
			int time1 = (int)(date.getTime()/1000);
			date = sdf.parse("2014-02-27 23:29:56");
			int time2 = (int)(date.getTime()/1000);
			System.out.println(dayDelta(time1, time2));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
