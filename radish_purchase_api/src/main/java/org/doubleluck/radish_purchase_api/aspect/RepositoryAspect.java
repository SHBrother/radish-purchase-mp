package org.doubleluck.radish_purchase_api.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.doubleluck.radish_purchase_api.exception.RepositoryException;
import org.doubleluck.radish_purchase_api.model.SupportLogicDelete;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class RepositoryAspect {

    @Pointcut("@annotation(org.doubleluck.radish_purchase_api.annotation.CheckLogicDelete)")
    public void findMethodPointForLogicDelete() {

    }

    @Before("findMethodPointForLogicDelete()")
    public void checkLogicDelete(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        if (args != null && args.length > 0) {
            SupportLogicDelete example = (SupportLogicDelete) args[0];
            if (example != null) {
                example.setDeleteFlagFalse();
            } else {
                throw new RepositoryException("Query Example is null , cannot filter logic delete");
            }
        }
    }

    @SuppressWarnings("unused")
//    @Around("repositoryPoint()")
    public Object handleException(ProceedingJoinPoint joinPoint) throws RepositoryException {
        log.info("{}.{}", joinPoint.getTarget(), joinPoint.getSignature());
        try {
            return joinPoint.proceed();
        } catch (Throwable throwable) {
            log.error("error at {}.{}, cause : {}", joinPoint.getTarget(), joinPoint.getSignature().getName(), throwable.getMessage());
            throw new RepositoryException(throwable.getMessage());
        }
    }
}
