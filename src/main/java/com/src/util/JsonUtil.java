package com.src.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * 
 * @author Administrator 
 *
 */
public class JsonUtil {
	
	private static ObjectMapper  mapper = new ObjectMapper();
	private static ObjectMapper  mapperWithYMDDate = new ObjectMapper();
	
	static{
		
		    mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
		    mapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
		    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		    mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
            mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
            
            mapperWithYMDDate.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
            mapperWithYMDDate.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
            mapperWithYMDDate.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            mapperWithYMDDate.setSerializationInclusion(JsonInclude.Include.NON_NULL);
            mapperWithYMDDate.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
	} 
	  
	
	public static ObjectMapper getJsonMapper(){
		 return mapper;
	}
	
	public static <T> T parse(String value,Class<T> clz){
		if (StringUtils.isEmpty(value)) {
			return null;
		}
		//value = value.replaceAll("\'", "\"").trim();
		try {
			return mapper.readValue(value, clz);
		} 
		catch (Exception e) {
			throw new IllegalStateException(e);
		} 
	}
	
	public static <T> T parseWithOnlyYMDDate(String value,Class<T> clz){
		if (StringUtils.isEmpty(value)) {
			return null;
		}
		//value = value.replaceAll("\'", "\"").trim();
		try {
			return mapperWithYMDDate.readValue(value, clz);
		} 
		catch (Exception e) {
			throw new IllegalStateException(e);
		} 
	}
	
	public static <T> T parse(byte[] bytes,Class<T> clz){
		try {
			return mapper.readValue(bytes, clz);
		} 
		catch (Exception e) {
			throw new IllegalStateException(e);
		} 
	}
	
	
	public static <T> T parse(InputStream ins,Class<T> clz){
		try {
			return mapper.readValue(ins, clz);
		} 
		catch (Exception e) {
			throw new IllegalStateException(e);
		} 
	}
	
	
	public static <T> T  parse(Reader reader,Class<T> clz){
		try {
			return mapper.readValue(reader, clz);
		} 
		catch (Exception e) {
			throw new IllegalStateException(e);
		} 
	}
	
	public static JavaType createCollectionType(Class<?> collectionClass, Class<?>... elementClasses) {
		return mapper.getTypeFactory().constructParametricType(collectionClass, elementClasses);
	}
	
	
	@SuppressWarnings("unchecked")
	public static <T> T parse(String value, JavaType javaType) {
		if (StringUtils.isEmpty(value)) {
			return null;
		}

		try {
			return (T) mapper.readValue(value, javaType);
		}
		catch (IOException e) {
			throw new IllegalStateException(e);
		}
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T update(String value, T object) {
		try {
			return (T) mapper.readerForUpdating(object).readValue(value);
		} 
		catch (Exception e) {
			throw new IllegalStateException(e);
		} 
	}
	
	public static String writeValueAsString(Object o){
		try {
			return mapper.writeValueAsString(o);
		} 
		catch (Exception e) {
			throw new IllegalStateException(e);
		} 
	}

    public static void writeJson(Object obj,HttpServletResponse resp){
        try {
            resp.setContentType("application/json");
            resp.setCharacterEncoding("utf8");
            PrintWriter pw=resp.getWriter();
            String str=null;
            if(!(obj instanceof String)){
                str=toString(obj);
            }else{
                str=obj.toString();
            }
            pw.print(str);
            pw.flush();
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


	public static void write(OutputStream outs,Object o){
		try {
			mapper.writeValue(outs,o);
		} 
		catch (Exception e) {
			throw new IllegalStateException(e);
		} 
	}
	
	public static void write(Writer writer,Object o){
		try {
			mapper.writeValue(writer,o);
			//System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(o)+"===================");
		} 
		catch (Exception e) {
			throw new IllegalStateException(e);
		} 
	}
	
	public static void writeWithOnlyYMDDate(Writer writer,Object o){
		try {
			mapperWithYMDDate.writeValue(writer,o);
			//System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(o)+"===================");
		} 
		catch (Exception e) {
			throw new IllegalStateException(e);
		} 
	}
	
	public static String toString(Object o){
		try {
			return mapper.writeValueAsString(o);
		} 
		catch (Exception e) {
			throw new IllegalStateException(e);
		} 
	}
	
	public static byte[] toBytes(Object o){
		try {
			return mapper.writeValueAsBytes(o);
		} 
		catch (Exception e) {
			throw new IllegalStateException(e);
		} 
	}

}
