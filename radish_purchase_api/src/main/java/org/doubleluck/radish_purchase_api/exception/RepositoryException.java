package org.doubleluck.radish_purchase_api.exception;

import org.doubleluck.radish_purchase_api.model.api.RestApiResult;

public class RepositoryException extends RuntimeException implements RestApiResult {

    private int errorCode;

    public RepositoryException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public RepositoryException(String message) {
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
