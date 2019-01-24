package com.apollo.business.exception;

/**
 * 自定义token异常
 */
public class TokenException extends Exception {
    public TokenException(String errorMsg){
        super(errorMsg);
    }
}
