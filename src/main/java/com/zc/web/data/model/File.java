package com.zc.web.data.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.google.code.morphia.annotations.Entity;

@Entity(noClassnameStored = true)
@EqualsAndHashCode(callSuper=false)
@Data
public class File {
	private String id;
	private String name;
}
