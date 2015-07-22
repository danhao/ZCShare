package com.zc.web.data.model;

import com.google.code.morphia.annotations.Entity;

public class BaseModel {
	public static final String ID_KEY = "_id";
	
	/**
     * 根据模型获取表名
     * 
     * @return 表名
     */
    public String getTable() {
        Entity entity = this.getClass().getAnnotation(Entity.class);
        return entity.value();
    }
}
