package com.zc.web.data.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;

/***
 * 玩家充值订单
 * @author small
 *
 */
@Entity(noClassnameStored = true)
@EqualsAndHashCode(callSuper=false)
@Data
public class PlayerOrder extends BaseModel{
	@Id
	private long id;
	private long playerId;
	private String outOrderNo;//'外部订单号ID',
	private int amount; //'充值扣款金额（以分为单位）',
	private int realityAmount; //'实际充值的金额',
	private String status; //'订单结果（ 0失败 1成功）',
	private String description; //'补充说明',
	private String createAt; //'创建订单时间',
	private String finishAt; //完成时间
}
