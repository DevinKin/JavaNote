package com.devinkin.tdd.domain.tdddomain.response;

import java.io.Serializable;

/**
 * @program: TDD
 * @author: devinkin
 * @create: 2019-06-10 10:46
 * @description: 响应类
 **/
public class Response implements Serializable {
    private int code;
    private String message;
    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
