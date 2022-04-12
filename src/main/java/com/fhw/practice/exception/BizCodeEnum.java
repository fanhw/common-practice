package com.fhw.practice.exception;

import lombok.Getter;

/**
 * @author fhw
 * @version 1.0
 * @date 2022-04-11 21:17
 */


public enum BizCodeEnum {

    SUCCESS(200, "成功"),
    UNKNOWN_EXCEPTION(10000, "系统未知异常"),
    DATABASE_EXCEPTION(10001, "数据库异常"),
    TIMEOUT_EXCEPTION(10002, "超时");
    @Getter
    private int code;
    @Getter
    private String message;

    BizCodeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

}
