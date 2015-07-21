package com.zc.web.config;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.Data;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import com.zc.web.config.mapper.ConfigCityMapper;
import com.zc.web.config.model.ConfigCity;


@Data
public class ConfigHelper {
	private static final Logger logger = Logger.getLogger(ConfigHelper.class);
	/**
	 * 视图配置
	 */
	private static Map<Integer, ConfigCity> configViewMap = new HashMap<Integer, ConfigCity>();
	/**
	 * 初始化配置
	 */
	public static void init(){
		initConfigCity();
		
	}
	
	private static SqlSession getSqlSession() {
		SqlSessionFactory sqlSessionFactory = SqlMapperConfig.getResSessionFactory();
		return sqlSessionFactory.openSession();
	}

	private static void initConfigCity() {
		SqlSession sqlSession = getSqlSession();
		configViewMap.clear();
		int count = 0;
		try{
			ConfigCityMapper mapper = sqlSession.getMapper(ConfigCityMapper.class);
			List<ConfigCity> list = mapper.selectByExample(null);
			if(list != null && list.size() > 0){
				for(ConfigCity config : list){
					count ++;
					configViewMap.put(config.getId(), config);
				}
			}
		}finally{
			sqlSession.close();
		}
		logger.info("config_view data loaded finished. count="+count);
	}
	

	
	public static ConfigCity getConfigCity(int code){
		return configViewMap.get(code);
	}
}
