package com.fhw.practice.utils;

import com.fhw.practice.exception.BizCodeEnum;
import lombok.Data;

/**
 * @author fhw
 * @version 1.0
 * @date 2022-04-11 21:22
 */

@Data
public class ResponseData<T> {
    private int code;
    private String message;
    private T data;

    public ResponseData() {
    }

    public static ResponseData success() {
        ResponseData responseData = new ResponseData();
        responseData.setCode(BizCodeEnum.SUCCESS.getCode());
        responseData.setMessage(BizCodeEnum.SUCCESS.getMessage());
        return responseData;
    }

    public static ResponseData success(int code, String message) {
        ResponseData responseData = new ResponseData();
        responseData.setCode(code);
        responseData.setMessage(message);
        return responseData;
    }

    public static ResponseData success(BizCodeEnum bizCodeEnum) {
        return success(bizCodeEnum.getCode(), bizCodeEnum.getMessage());
    }

    public static <T> ResponseData<T> success(T t) {
        ResponseData responseData = new ResponseData();
        responseData.setCode(BizCodeEnum.SUCCESS.getCode());
        responseData.setMessage(BizCodeEnum.SUCCESS.getMessage());
        responseData.setData(t);
        return responseData;
    }

    public static ResponseData fail() {
        ResponseData responseData = new ResponseData();
        responseData.setCode(BizCodeEnum.UNKNOWN_EXCEPTION.getCode());
        responseData.setMessage(BizCodeEnum.UNKNOWN_EXCEPTION.getMessage());
        return responseData;
    }

    public static ResponseData fail(int code, String message) {
        ResponseData responseData = new ResponseData();
        responseData.setCode(code);
        responseData.setMessage(message);
        return responseData;
    }

    public static ResponseData fail(BizCodeEnum bizCodeEnum) {
        return fail(bizCodeEnum.getCode(), bizCodeEnum.getMessage());
    }
}
