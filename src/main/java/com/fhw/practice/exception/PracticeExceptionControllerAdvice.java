package com.fhw.practice.exception;

import com.fhw.practice.utils.ResponseData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author fhw
 * @version 1.0
 * @date 2022-04-11 21:11
 */
@Slf4j
@RestControllerAdvice(basePackages = "com.fhw.practice")
public class PracticeExceptionControllerAdvice {
    @ExceptionHandler(value = {Throwable.class})
    public ResponseData handleException(Throwable throwable) {
        log.error("系统未知异常:{},异常类型:{}", throwable.getMessage(), throwable.getClass());
        return ResponseData.fail();
    }

}
