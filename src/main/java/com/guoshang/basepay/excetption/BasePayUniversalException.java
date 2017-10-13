package com.guoshang.basepay.excetption;

/**
 * @Author :zlg
 * @Description : 统一的异常的处理
 * @Date : Create in 2017/10/12  上午11:14
 * @Modified By :
 */
public class BasePayUniversalException extends Exception{


    public BasePayUniversalException(String message) {
        super(message);
    }

    public BasePayUniversalException(String message, Throwable cause) {
        super(message, cause);
    }

    public BasePayUniversalException(Throwable cause) {
        super(cause);
    }
}
