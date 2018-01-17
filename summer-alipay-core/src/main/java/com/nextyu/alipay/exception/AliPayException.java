package com.nextyu.alipay.exception;

/**
 * created on 2018-01-10 11:47
 *
 * @author nextyu
 */
public class AliPayException extends RuntimeException {
    public AliPayException(String message) {
        super(message);
    }

    public AliPayException(String message, Throwable cause) {
        super(message, cause);
    }
}
