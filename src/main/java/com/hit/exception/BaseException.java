package com.hit.exception;

import java.util.Objects;

/**
 * BaseException
 *
 * @author Ruan
 * @create 2023-05-16 12:27:45
 */
public class BaseException extends RuntimeException{

    protected  Integer code;

    public BaseException(BaseExceptionType baseExceptionEnum){
        super(baseExceptionEnum.getMsg());
        this.code = baseExceptionEnum.getCode();
    }

    public BaseException(Integer code, String message){
        super(message);
        this.code = code;
    }

    public BaseException(BaseExceptionType baseExceptionEnum, String message){
        this(baseExceptionEnum.getCode(), message);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (!(o instanceof BaseException)) {
            return false;
        }
        BaseException that = (BaseException) o;
        return Objects.equals(code, that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    public static BaseExceptionType exceptionType(int code, String msg){
        return new BaseExceptionType() {
            @Override
            public Integer getCode() {
                return code;
            }

            @Override
            public String getMsg() {
                return msg;
            }
        };
    }

    public static final BaseExceptionType MESSAGING_EXCEPTION = exceptionType(11001,"Fail to send the email.");
    public static final BaseExceptionType HCAPTCHA_VERIFY_FAILED = exceptionType(11002,"Fail verify hCaptcha.");
}
