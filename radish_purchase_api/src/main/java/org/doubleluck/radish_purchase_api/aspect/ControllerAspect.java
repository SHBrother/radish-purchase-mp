package org.doubleluck.radish_purchase_api.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class ControllerAspect {

    @Pointcut("execution(* org.doubleluck.radish_purchase_api.controller..*(..))")
    public void controllerPoint() {

    }

    @Before("controllerPoint()")
    public void logParam(JoinPoint point) {
        log.info("{}.{}, params : {}", point.getTarget(), point.getSignature().getName(), point.getArgs());
    }

    @AfterReturning(returning = "result", pointcut = "controllerPoint()")
    public void logApiResult(JoinPoint point, Object result) {
        log.info("{}.{}, result : {}", point.getTarget(), point.getSignature().getName(), result);
    }

}
