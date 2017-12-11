package com.opps.provider.request;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lishuai on 2017/12/11.
 */
public class Result<T> {

    private String message;


    private T data;


    public static Result success(Object data) {
        Result result = new Result();
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        result.setMessage(String.valueOf(request.getServerPort()));
        result.setData(data);
        return result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}