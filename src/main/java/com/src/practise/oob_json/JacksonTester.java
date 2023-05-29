package com.src.practise.oob_json;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;


public class JacksonTester {
  public static void main(String args[]){
     ObjectMapper mapper = new ObjectMapper();
     String jsonString = "{\"name\":\"Mahesh\", \"age\":21}";

     //map json to student
     try {
        Student student = mapper.readValue(jsonString, Student.class);
        System.out.println(student);
        mapper.enable(SerializationConfig.Feature.INDENT_OUTPUT);
        //把对象转成json string类型的
        jsonString = mapper.writeValueAsString(student);
        System.out.println(jsonString);

     } catch (JsonParseException e) {
        e.printStackTrace();
     } catch (JsonMappingException e) {
        e.printStackTrace();
     } catch (IOException e) {
        e.printStackTrace();
     }
  }
}
