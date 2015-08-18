package com.zc.web.data.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.google.code.morphia.annotations.Entity;

/**
 * 统计
 *
 */
@Entity(noClassnameStored = true)
@EqualsAndHashCode(callSuper=false)
@Data
public class Stat {
	private int total;
	private int done;
	private int money;
	private int repayment;
}
