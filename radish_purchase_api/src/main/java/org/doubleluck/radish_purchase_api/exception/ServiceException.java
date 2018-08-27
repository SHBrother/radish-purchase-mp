package org.doubleluck.radish_purchase_api.exception;

import org.doubleluck.radish_purchase_api.model.api.RestApiResult;

/**
 * @author: lzf
 * @description:
 * @create: 2018-07-05 17:39
 **/
public class ServiceException extends RuntimeException implements RestApiResult {

    private int errorCode;

    public ServiceException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public ServiceException(String message) {
        super(message);
        this.errorCode = -1;
    }

    @Override
    public boolean isSuccess() {
        return false;
    }

    @Override
    public int getErrorCode() {
        return errorCode;
    }

    @Override
    public String getErrorMsg() {
        return getMessage();
    }

    @Override
    public Object getData() {
        return null;
    }
}
