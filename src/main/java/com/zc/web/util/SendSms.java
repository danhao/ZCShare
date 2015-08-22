package com.zc.web.util;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public class SendSms {

	private static String Url = "http://106.ihuyi.cn/webservice/sms.php?method=Submit";

	private static Logger logger = Logger.getLogger(SendSms.class);

	public static void send(String content, String mobile) throws Exception {

		HttpClient client = new HttpClient();
		PostMethod method = new PostMethod(Url);

		client.getParams().setContentCharset("UTF-8");
		method.setRequestHeader("ContentType",
				"application/x-www-form-urlencoded;charset=UTF-8");

		NameValuePair[] data = {// 提交短信
				new NameValuePair("account", "cf_ddz"),
				new NameValuePair("password", "zaq12wsx"), // 密码可以使用明文密码或使用32位MD5加密
				new NameValuePair("mobile", mobile),
				new NameValuePair("content", content), };

		method.setRequestBody(data);

		client.executeMethod(method);

		String SubmitResult = method.getResponseBodyAsString();

		Document doc = DocumentHelper.parseText(SubmitResult);
		Element root = doc.getRootElement();

		String code = root.elementText("code");
		String msg = root.elementText("msg");
		String smsid = root.elementText("smsid");

		logger.info(code + "|" + msg + "|" + smsid);
	}

}