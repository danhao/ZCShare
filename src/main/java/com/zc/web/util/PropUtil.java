package com.zc.web.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.PropertyUtils;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor.JavaType;
import com.google.protobuf.GeneratedMessage;
import com.zc.web.exception.SmallException;

/*
 * pro数据转化
 * @author guanxing
 */
public class PropUtil {

	/**
	 * 转换内存对象到protobuf对象，避免大量setter
	 * 
	 * @param builder
	 * @param srcObject
	 * @throws SmallException 
	 */
	@SuppressWarnings("rawtypes")
	public static void copyProperties(GeneratedMessage.Builder builder, Object srcObject,Descriptor descriptor) throws SmallException{
		try{
			if(srcObject != null){
				List<Field> fields = new ArrayList<Field>();
				Class c = srcObject.getClass();
				while(c != null){
					Field[] props = getDeclaredField(c);
					for(int i = 0; i < props.length; i++){
						fields.add(props[i]);
					}
					c = c.getSuperclass();
				}
				for (Field f : fields) {
					Descriptors.FieldDescriptor fd = descriptor.findFieldByName(f.getName());
					if (fd != null && fd.getJavaType() != JavaType.MESSAGE){
						Object value = PropertyUtils.getProperty(srcObject, f.getName());
						if (value == null)
							continue;
						builder.setField(fd, value);
					}
				}
			}
		}catch (Exception e) {
			throw new SmallException(e);
		}
	}
	
	/*
	 * 获取父类 所有属性
	 */
	@SuppressWarnings("rawtypes")
	public static Field[] getDeclaredField(Class clazz) throws SecurityException, NoSuchFieldException{
        Field[] field = clazz.getDeclaredFields() ;  
        return field ;
    }     
	
	/*
	 * 获取父类 对应属性
	 */
	public static Field getDeclaredField(Object object, String fieldName) throws SecurityException, NoSuchFieldException{  
        Field field = null ;  
          
        Class<?> clazz = object.getClass() ;  
          
        for(; clazz != Object.class ; clazz = clazz.getSuperclass()) {  
                field = clazz.getDeclaredField(fieldName) ;  
                return field ;  
        }  
      
        return null;  
    }
}
