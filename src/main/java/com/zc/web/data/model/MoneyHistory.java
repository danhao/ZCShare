package com.zc.web.data.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;

/***
 * 资金记录
 *
 */
@Entity(noClassnameStored = true)
@EqualsAndHashCode(callSuper=false)
@Data
public class MoneyHistory extends BaseModel{
	@Id
	private long id; 				// id
	private long playerId;			// player id
	private int money;				// 金额
	private int type;				// 1：充值；2：结单；3：保证金返回；4：提现；5：支付保证金
	private int platform;			// 1：银联
	private int time; 				// 操作时间
	private int state;				// 0：失败；1：成功
	private int balance;			// 余额
	private String debtId;			// 债务单号
	private String descript;		// 备注
}
