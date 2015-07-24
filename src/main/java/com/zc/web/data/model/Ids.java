package com.zc.web.data.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.google.code.morphia.annotations.Entity;

/**
 * 玩家信息
 */
@Entity(noClassnameStored = true)
@EqualsAndHashCode(callSuper=false)
@Data 
public class Ids extends BaseModel {
	private String table;		// 表名
	private int maxId;			// 最大id
}