package com.example.web.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class LogUtil {

    private static RestTemplate restTemplate=new RestTemplate();

    public static Logger logger= LogManager.getLogger(LogUtil.class);

// {"now":"Feb 17, 2021, 4:08:36 PM","isNewMessage":true,"id":"33ec1968-7dae-4f1e-9f6e-6abc09528d29","text":"hello, new message","type":"statistics","inner":{"start":"2021-02-17 16::008:36","user":{"name":"Visa","salary":1234.4,"age":12,"newEmployee":true}},"url":"http://localhost:8080/data"}

    public static void logging(String message){
        logger.info(message);
    }

    public static void loggingHttp(String message){
        HttpHeaders  httpHeaders=new HttpHeaders();
        httpHeaders.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<String> entity = new HttpEntity<>(message,httpHeaders);
        ResponseEntity<String> responseEntity = restTemplate.postForEntity("http://localhost:8000", entity, String.class);
        if (responseEntity.getStatusCode().isError()){
            System.out.println(responseEntity.getStatusCode());
        }else{
            System.out.println(responseEntity.getStatusCode()+" with body:"+responseEntity.getBody());
        }

    }
}
