package com.zc.web.util;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.util.Date;

import com.aliyun.oss.ClientException;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSException;
import com.aliyun.oss.model.GeneratePresignedUrlRequest;
import com.aliyun.oss.model.ObjectMetadata;
import com.zc.web.core.Constant;

public class FileUtil {

	public static OSSClient client = new OSSClient(Constant.ENDPOINT, Constant.OSSAccessKeyId, Constant.OSSAccessKeySecret);
	
	public static String genDownloadUrl(String key) {
		if(key == null || key.isEmpty())
			return "";
		
		// Generate a presigned URL
		Date expires = new Date(new Date().getTime() + 1000 * 60 * 10); // 10 minute to expire
		GeneratePresignedUrlRequest generatePresignedUrlRequest = new GeneratePresignedUrlRequest(
				Constant.BUCKET, key);
		generatePresignedUrlRequest.setExpiration(expires);
		URL url = client.generatePresignedUrl(generatePresignedUrlRequest);
		return url.toString();
	}

    // 上传文件
    public static void uploadFile(String key, InputStream is)
            throws OSSException, ClientException {
    	
        ObjectMetadata objectMeta = new ObjectMetadata();
        
        // 可以在metadata中标记文件类型
        objectMeta.setContentType("application/pdf");

        client.putObject(Constant.BUCKET, key, is, objectMeta);
    }

	public static void main(String[] args) throws Exception{
		System.out.println(genDownloadUrl("testadf.jpg"));
//		InputStream is = new PdfUtil().writePdf("test", "xxxxx", null);
//		uploadFile("contract/test.pdf", is);
	}
}
