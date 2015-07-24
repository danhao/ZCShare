package com.zc.web.exception;

/**
 * DB异常
 * @author Administrator
 *
 */
public class DBException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DBException(String msg){
		super(msg);
	}
	
	public DBException(Exception e){
		super(e);
	}
}
