package org.doubleluck.radish_purchase_api.model.api;

public interface RestApiResult {

    int NOT_LOGIN = -100;

    boolean isSuccess();

    int getErrorCode();

    String getErrorMsg();

    Object getData();
}