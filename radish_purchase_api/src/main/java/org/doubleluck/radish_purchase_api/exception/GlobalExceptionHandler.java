package org.doubleluck.radish_purchase_api.exception;

import lombok.extern.slf4j.Slf4j;
import org.doubleluck.radish_purchase_api.model.api.RestApiResult;
import org.doubleluck.radish_purchase_api.model.api.RestApiResultImpl;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.UndeclaredThrowableException;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = RepositoryException.class)
    @ResponseBody
    public RestApiResult repositoryErrorHandler(RepositoryException e) {
        log.error("", e);
        return RestApiResultImpl.buildFromException(e);
    }

    @ExceptionHandler(value = ServiceException.class)
    @ResponseBody
    public RestApiResult serviceErrorHandler(ServiceException e) {
        log.error("", e);
        return RestApiResultImpl.buildFromException(e);
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public RestApiResult defaultErrorHandler(Exception e) {
        if (e instanceof UndeclaredThrowableException) {
            e = (Exception) ((UndeclaredThrowableException) e).getUndeclaredThrowable();
        }
        log.error("", e);
        return new RestApiResultImpl(false, -1, e.getMessage(), null);
    }

}
