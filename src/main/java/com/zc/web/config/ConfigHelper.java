package com.zc.web.config;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.Data;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import com.zc.web.config.mapper.ConfigCityMapper;
import com.zc.web.config.mapper.ConfigVipMapper;
import com.zc.web.config.model.ConfigCity;
import com.zc.web.config.model.ConfigVip;


@Data
public class ConfigHelper {
	private static final Logger logger = Logger.getLogger(ConfigHelper.class);
	private static Map<Integer, ConfigCity> configCityMap = new HashMap<Integer, ConfigCity>();
	private static Map<Integer, ConfigVip> configVipMap = new HashMap<Integer, ConfigVip>();
	/**
	 * 初始化配置
	 */
	public static void init(){
		initConfigCity();
		initConfigVip();
	}
	
	private static SqlSession getSqlSession() {
		SqlSessionFactory sqlSessionFactory = SqlMapperConfig.getResSessionFactory();
		return sqlSessionFactory.openSession();
	}

	private static void initConfigCity() {
		SqlSession sqlSession = getSqlSession();
		configCityMap.clear();
		int count = 0;
		try{
			ConfigCityMapper mapper = sqlSession.getMapper(ConfigCityMapper.class);
			List<ConfigCity> list = mapper.selectByExample(null);
			if(list != null && list.size() > 0){
				for(ConfigCity config : list){
					count ++;
					configCityMap.put(config.getId(), config);
				}
			}
		}finally{
			sqlSession.close();
		}
		logger.info("config_city data loaded finished. count="+count);
	}
	
	public static ConfigCity getConfigCity(int code){
		return configCityMap.get(code);
	}
	
	private static void initConfigVip() {
		SqlSession sqlSession = getSqlSession();
		configVipMap.clear();
		int count = 0;
		try{
			ConfigVipMapper mapper = sqlSession.getMapper(ConfigVipMapper.class);
			List<ConfigVip> list = mapper.selectByExample(null);
			if(list != null && list.size() > 0){
				for(ConfigVip config : list){
					count ++;
					configVipMap.put(config.getLevel(), config);
				}
			}
		}finally{
			sqlSession.close();
		}
		logger.info("config_vip data loaded finished. count="+count);
	}
	
	public static ConfigVip getConfigVip(int level){
		return configVipMap.get(level);
	}
}
