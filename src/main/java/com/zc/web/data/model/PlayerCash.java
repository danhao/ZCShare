package com.zc.web.data.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.zc.web.exception.SmallException;
import com.zc.web.message.pay.PlayerCashMsgProto.PlayerCashMsg;
import com.zc.web.util.PropUtil;

/***
 * 取现请求
 *
 */
@Entity(noClassnameStored = true)
@EqualsAndHashCode(callSuper=false)
@Data
public class PlayerCash extends BaseModel{
	@Id
	private long id;
	private long playerId;
	private int amount; //'金额（以分为单位）',
	private String name;	// 开户名
	private int type; // 账户类型
	private String bankName; // 银行
	private String bankAddr; // 开户行所在地
	private String bankBranch; // 开户行网点
	private String cardNo; // 银行卡号
	private String status; //'结果（ 0失败 1成功）',
	private String description; //'补充说明',
	private String createAt; //'创建时间',
	private String finishAt; //完成时间
	
	public PlayerCashMsg build() throws SmallException{
		PlayerCashMsg.Builder builder = PlayerCashMsg.newBuilder();
		PropUtil.copyProperties(builder, this, PlayerCashMsg.Builder.getDescriptor());
		
		return builder.build();
	}
}
