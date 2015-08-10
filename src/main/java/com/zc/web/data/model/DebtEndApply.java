package com.zc.web.data.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;

/***
 * 结单申请
 *
 */
@Entity(noClassnameStored = true)
@EqualsAndHashCode(callSuper=false)
@Data
public class DebtEndApply extends BaseModel{
	@Id
	private long id;		// debtId
	private long playerId;	// 
	private int status;		// 0：未处理；1：已处理
	private int createAt;	// 创建时间
}
