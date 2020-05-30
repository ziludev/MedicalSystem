package com.secondgroup.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: alex
 * @date: 2020/5/29 8:39 下午
 */

public class ResultEntity {

    private Integer statusCode;

    private String message;

    private Map<String,Object> map = new HashMap<String, Object>();

    public static ResultEntity success(String message) {
        ResultEntity resultEntity = new ResultEntity();
        resultEntity.setStatusCode(200);
        resultEntity.setMessage(message);
        return resultEntity;
    }

    public static ResultEntity error(String message) {
        ResultEntity resultEntity = new ResultEntity();
        resultEntity.setStatusCode(500);
        resultEntity.setMessage(message);
        return resultEntity;
    }

    public ResultEntity put(String key, Object value) {
        this.map.put(key,value);
        return this;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
}
