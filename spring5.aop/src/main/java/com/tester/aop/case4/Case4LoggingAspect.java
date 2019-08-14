package com.tester.aop.case4;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class Case4LoggingAspect {
    private static Logger logger = Logger.getLogger(Case4LoggingAspect.class.getName());


    @After("loggerDrawOperationWithin()")
    private void drawOperationLoggingWithin(JoinPoint joinPoint) {
        String logInfo = "Operation After using within : " + joinPoint.getTarget().getClass().getCanonicalName() + "." + joinPoint.getSignature().getName();
        logger.info(logInfo);
    }

    @Pointcut("within(com.tester.aop.pojo.Circle)")
    public void loggerDrawOperationWithin() {
    }
}


