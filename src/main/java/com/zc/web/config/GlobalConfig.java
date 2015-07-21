package com.zc.web.config;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class GlobalConfig {
	
	private static final String CONFIG_FILE_PATH = "config.xml";//配置文件类路径
	public static String KEY = null;
	public static ZoneMode MODE = ZoneMode.RELEASE ;//模式
	public static DBConfig RESDB = null;
	public static AllinPay ALLINPAY = null;
	
	/**
	 * 区列表
	 */
	private static Map<Integer, ZoneConfig> zoneConfigMap = new HashMap<Integer, ZoneConfig>();
	
	public static class ZoneConfig{
		public int zoneId;//区id
		public String host;//主机ip
		public String hostOut;
		public int httpPort; //HTTP服务端口
		public int adminPort;//管理员端口
		public int payPort;// 支付
		
		public int maxOnline = 2000;//最大在线人数
		
		public MongoConfig mongoConfig = null;//mongo数据库配置
	}
	
	public static class DBConfig{
		public int id;
		public String userName;
		public String password;
		public String url;
		public String driver;
	}
	
	public static class AllinPay{
		public String key;
		public String merchantId;
	}
	
	public static class MongoConfig{
		public String masterHost;
		public int masterPort;
		public String dbName;
		public String userName;
		public String password;
		public String slaveHost;
		public int slavePort;
	}
	
	public static enum ZoneMode {
		TEST,
		RELEASE
	}
	
	/**
	 * 初始化配置信息
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public static void init() throws Exception {
		SAXReader reader = new SAXReader();
		Document document = reader.read(GlobalConfig.class.getClassLoader().getResourceAsStream(CONFIG_FILE_PATH));
		Element root = document.getRootElement();
		if (root == null) {
			throw new Exception("no root node in config");
		}
		// 全局变量
		Element global = root.element("global");
		if (global == null) {
			throw new Exception("no global node in config");
		}
		
		String mode = global.attributeValue("mode");
		if(mode != null && mode.equals("test")){
			MODE = ZoneMode.TEST;
		}
		KEY = global.attributeValue("key");
		
		//资源库
		Element resElement = global.element("res");
		if (resElement == null) {
			throw new Exception("no res node in config");
		}
		RESDB = createDBConfig(resElement);
		
		//通联
		Element allinapyElement = global.element("allinpay");
		if (allinapyElement == null) {
			throw new Exception("no allinpay node in config");
		}
		ALLINPAY = createAllinPay(allinapyElement);
		
		//zone列表
		List<Element> zones = root.elements("zone");
		for(Element zoneElement : zones){
			ZoneConfig zone = new ZoneConfig();
			zone.zoneId = Integer.valueOf(zoneElement.attributeValue("id"));
			zone.host = zoneElement.attributeValue("host");
			zone.hostOut = zoneElement.attributeValue("hostOut");
			zone.httpPort = Integer.valueOf(zoneElement.attributeValue("httpPort"));
			zone.adminPort = Integer.parseInt(zoneElement.attributeValue("adminPort"));
			zone.payPort = Integer.parseInt(zoneElement.attributeValue("payPort"));

			Element dbElement = zoneElement.element("db");
			if (dbElement == null) {
				throw new Exception("no db element in zone = " + zone.zoneId);
			}
			//mongodb配置
			Element mongoElement = dbElement.element("mongo");
			zone.mongoConfig = createMongoConfig(mongoElement);
			
			zoneConfigMap.put(zone.zoneId, zone);
		}
	}
	
	private static DBConfig createDBConfig(Element dbElement){
		DBConfig config = new DBConfig();
		config.id = Integer.valueOf(dbElement.attributeValue("id"));
		config.userName = dbElement.attributeValue("username");
		config.password = dbElement.attributeValue("password");
		config.url = dbElement.attributeValue("url");
		config.driver = dbElement.attributeValue("driver");
		return config;
	}
	
	private static AllinPay createAllinPay(Element dbElement){
		AllinPay config = new AllinPay();
		config.key = dbElement.attributeValue("key");
		config.merchantId = dbElement.attributeValue("merchantId");
		return config;
	}
	
	private static MongoConfig createMongoConfig(Element element){
		MongoConfig mongoConfig = new MongoConfig();
		mongoConfig.masterHost = element.attributeValue("masterHost");
		mongoConfig.masterPort = Integer.valueOf(element.attributeValue("masterPort"));
		mongoConfig.dbName = element.attributeValue("dbname");
		mongoConfig.userName = element.attributeValue("username");
		mongoConfig.password = element.attributeValue("password");
		if(element.attribute("slaveHost") != null){
			mongoConfig.slaveHost = element.attributeValue("slaveHost");
			mongoConfig.slavePort = Integer.valueOf(element.attributeValue("slavePort"));
		}
		return mongoConfig;
	}
	
	public static ZoneConfig getZoneConfig(int zoneId){
		return zoneConfigMap.get(zoneId);
	}
	
	/**
	 * 返回所有区的配置
	 * @return
	 */
	public static Map<Integer, ZoneConfig> getZoneConfigMap(){
		return zoneConfigMap;
	}
	
	public static void main(String[] args) {
		try {
			init();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}