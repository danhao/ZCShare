package com.zc.web.config;

import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.zc.web.config.GlobalConfig.DBConfig;


public class SqlMapperConfig {
	private static final String RES_MAPPER_FILE = "com/zc/config/maps/ResMapperConfig.xml"; //资源库配置文件
	
	private static SqlSessionFactory resSessionFactory = null;
	
	/**
	 * 初始化资源库数据连接
	 * @throws IOException
	 */
	public static void initResSessionFactory() throws IOException{
		Reader reader = Resources.getResourceAsReader(RES_MAPPER_FILE);
		DBConfig dbConfig = GlobalConfig.RESDB;
		Properties properties = new Properties();
		properties.put("driver", dbConfig.driver);
		properties.put("url", dbConfig.url);
		properties.put("username", dbConfig.userName);
		properties.put("password", dbConfig.password);
		resSessionFactory = new SqlSessionFactoryBuilder().build(reader,properties); 
		reader.close();
	}
	
	public static SqlSessionFactory getResSessionFactory(){
		return resSessionFactory;
	}
	
}