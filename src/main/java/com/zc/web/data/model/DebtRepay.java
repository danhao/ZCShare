package com.zc.web.data.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.google.code.morphia.annotations.Entity;

/***
 * 还款记录
 *
 */
@Entity(noClassnameStored = true)
@EqualsAndHashCode(callSuper=false)
@Data
public class DebtRepay extends BaseModel{
	private long debtId;	// debtId
	private long ownerId;	// 发布人
	private long deputyId;	// 中标人
	private int money;	// 金额
	private int state;
	private int receiveTime; // 接单时间
	private String debtorName;
	private int time; // 还款时间
	private int repayMoney; // 还款金额
	private String memo; // 还款说明
}
