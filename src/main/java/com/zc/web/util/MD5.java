package com.zc.web.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {
	
	public static String encode(byte[] data)throws NoSuchAlgorithmException {
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		byte[] d = md5.digest(data);
		return byte2hex(d, 0, d.length);
	}
	
	public static String encode(String data) throws Exception {
		byte[] d = data.getBytes("utf-8");
		return encode(d);
	}

	public static String byte2hex(byte[] b, int start, int end) {
		String hs = "";
		String tmp = "";
		for (int n = start; n < end; n++) {
			tmp = (java.lang.Integer.toHexString(b[n] & 0XFF));
			if (tmp.length() == 1) {
				hs = hs + "0" + tmp;
			} else {
				hs = hs + tmp;
			}
		}
		tmp = null;
		return hs;
	}

	public static void main(String[] args) {
		try {
			String result = MD5.encode("dasdfasdfad");
			System.out.println(result);
			System.out.println(result.length());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}