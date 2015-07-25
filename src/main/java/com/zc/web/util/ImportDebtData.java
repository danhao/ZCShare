package com.zc.web.util;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.alibaba.fastjson.JSONObject;
import com.zc.web.core.Constant;

public class ImportDebtData {

	public static final String POST_URL = "http://127.0.0.1:30001";

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws Exception {
		String filePath = "E:\\dev\\1stzc\\mockups\\debt.xlsx";
		
		importExcel(filePath);
	}
	
	private static String post(String req) throws IOException {
		// Post请求的url，与get不同的是不需要带参数
		URL postUrl = new URL(POST_URL);

		// 打开连接
		HttpURLConnection connection = (HttpURLConnection) postUrl
				.openConnection();

		// 打开读写属性，默认均为false
		connection.setDoOutput(true);
		connection.setDoInput(true);

		// 设置请求方式，默认为GET
		connection.setRequestMethod("POST");

		// Post 请求不能使用缓存
		connection.setUseCaches(false);
		connection.setInstanceFollowRedirects(true);

		// 配置连接的Content-type，配置为application/x-
		// www-form-urlencoded的意思是正文是urlencoded编码过的form参数，下面我们可以看到我们对正文内容使用URLEncoder.encode进行编码
		connection.setRequestProperty("Content-Type",
				"application/x-www-form-urlencoded");

		// 连接，从postUrl.openConnection()至此的配置必须要在 connect之前完成，
		// 要注意的是connection.getOutputStream()会隐含的进行调用 connect()，所以这里可以省略
		DataOutputStream out = new DataOutputStream(
				connection.getOutputStream());

		// 正文内容其实跟get的URL中'?'后的参数字符串一致

		// DataOutputStream.writeBytes将字符串中的16位的 unicode字符以8位的字符形式写道流里面
		out.writeBytes(URLEncoder.encode(req, "utf-8"));
		out.flush();
		out.close(); // flush and close

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				connection.getInputStream()));

		String line;
		String ret = "";

		while ((line = reader.readLine()) != null) {
			ret += line;
		}

		reader.close();
		return ret;
	}
	
	private static void importExcel(String excelPath) throws Exception{
		
		// 创建Excel的工作书册 Workbook,对应到一个excel文档
		InputStream inputStream = new FileInputStream(excelPath);
		Workbook wb = new XSSFWorkbook(inputStream);
	    
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
	    int sheetNum = wb.getNumberOfSheets();
	    for(int i = 0; i<sheetNum; i++){
	    	Sheet sheet = wb.getSheetAt(i);
	    	String name = sheet.getSheetName().trim();

	    	Row header = sheet.getRow(0);
	    	if(header == null)
	    		continue;
	    	int cellNum = header.getPhysicalNumberOfCells();
	    	
	    	JSONObject json = new JSONObject();
	    	
	    	List<String> data = new ArrayList<String>();
	    	int dataRowIndex = 1;
	    	Row dataRow = sheet.getRow(dataRowIndex);
	    	while(dataRow != null && dataRow.getCell(0) != null && dataRow.getCell(0).getCellType()!=Cell.CELL_TYPE_BLANK){
	    		for(int j = 0 ; j < cellNum; j++){
	    			Cell cell = dataRow.getCell(j);
	    			if(cell != null){
	    				if(cell.getCellType() == Cell.CELL_TYPE_NUMERIC){
	    					int value = 0;
	    					if(HSSFDateUtil.isCellDateFormatted(cell)){
	    						value = (int)(cell.getDateCellValue().getTime() / 1000);
	    					}else{
	    						value = (int)cell.getNumericCellValue();
	    					}
    						json.put(header.getCell(j).getStringCellValue(), value);
	    				}else{
	    					cell.setCellType(Cell.CELL_TYPE_STRING);
	    	    			json.put(header.getCell(j).getStringCellValue(), cell.getStringCellValue().replaceAll("[']", "\\\\'"));
	    				}
	    			}
	    		}
	    		
	    		json.put("type", Constant.TYPE_DEPUTY);
	    		json.put("duration", 120);
	    		json.put("expireDays", 120);
	    		json.put("isCorp", 1);
	    		
	    		data.add(json.toJSONString());
	    		
	    		dataRowIndex ++;
	    		dataRow = sheet.getRow(dataRowIndex);
	    	}
	    	
	    	for(String d : data){
//	    		String createDebt = "{'code':100,'pid':624419524266954752,'sid':'283c7c49-d8c9-4fd3-924b-7d6810a0a182','req':" + d + "}";
	    		String createDebt = "{'code':100,'pid':606342446812499968,'sid':'8c9e6ff5-dd09-4883-9499-40ad14d353c5','req':" + d + "}";
	    		System.out.println(createDebt);
	    		
	    		post(createDebt);
	    	}
	    }
	}

}
