package com.zc.web.message;
import lombok.Data;

@Data
public class ErrorMessage {
	private int errorCode;
	private String errorText;
}
