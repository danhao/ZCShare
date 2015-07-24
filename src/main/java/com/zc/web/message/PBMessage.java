package com.zc.web.message;

import lombok.Data;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.protobuf.Message;
import com.zc.web.util.JsonFormat;

@Data
public class PBMessage {

	private int code;
	private String pid;
	private String sid;
	private int error;
	private String csfid;
	
	private transient String req;	// 请求
	private transient Message rsp;	// 应答
	
	public PBMessage(){
		super();
	}
	
	public PBMessage(int code, String pid, String sid, String req){
		this.code = code;
		this.pid = pid;
		this.sid = sid;
		this.req = req;
	}
	
	public String buildRsp(){
		Message tmp = this.rsp;
		this.rsp = null;
		JSONObject json = (JSONObject)JSON.toJSON(this);
		
		if(tmp != null)
			json.put("rsp", JsonFormat.printToString(tmp));
		
		return json.toJSONString();
	}
}
