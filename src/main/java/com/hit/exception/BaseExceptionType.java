package com.hit.exception;

/**
 * super type of BaseExceptionEnum
 *
 * @author Ruan
 * @create 2023-05-16 12:27:45
 */
public interface BaseExceptionType {
    /**
     * get the error code of Exception
     * @return error code
     */
    Integer getCode();

    /**
     * get the error message
     * @return error message
     */
    String getMsg();
}
