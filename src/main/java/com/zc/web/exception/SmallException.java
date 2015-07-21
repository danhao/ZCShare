package com.zc.web.exception;

import com.zc.web.message.ErrorCodeProto.ErrorCode;

public class SmallException extends Exception {
	private static final long serialVersionUID = 1L;
	private int error = 0;
	public SmallException(Exception ex){
		super(ex);
	}
	public SmallException(ErrorCode err){
		this.setError(err.getNumber());
	}
	public SmallException(int error){
		this.setError(error);
	}
	public SmallException(String s){
		super(s);
	}
	public int getError() {
		return error;
	}
	public void setError(int error) {
		this.error = error;
	}
}
