package com.deaifish.boot.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description TODO
 *
 * @className GlobalExceptionHandler
 * @author DEAiFISH
 * @date 2023/8/6 12:48
 */
@ControllerAdvice   //这个类是集中处理所有 Controller 发生的错误
public class GlobalExceptionHandler {

    /**
     * @description
     *  1、@ExceptionHandler 标识一个方法处理错误，默认只能处理这个类发生的指定错误
     *  2、@ControllerAdvice 统一处理所有错误
     *
     *
     * @author DEAiFISH
     * @date 2023/8/6 12:45
     * @param e
     * @return java.lang.String
     */
    @ResponseBody
    @ExceptionHandler(Exception.class)
    public String handleException(Exception e){
        return "错误:" + e.getMessage() + "<br/>统一处理...";
    }
}
