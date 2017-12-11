package com.opps.consumer.request;

/**
 * Created by lishuai on 2017/12/11.
 */
public class Result<T> {

    private String message;


    private T data;

    public static Result msg(String message) {
        Result result = new Result();
        result.setMessage(message);
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