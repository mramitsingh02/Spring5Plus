package com.tester.aop.case3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class Case3LoggingAspect {
    private static Logger logger = Logger.getLogger(Case3LoggingAspect.class.getName());
    @Before("loggerAllGetNameOperation()")
    private void loggingAfterShapeService(JoinPoint joinPoint) {
        String logInfo = "Operation After For Get Name : " + joinPoint.getTarget().getClass().getCanonicalName() + "." + joinPoint.getSignature().getName();
        logger.info(logInfo);
    }

    @Before("loggerDrawOperation()")
    private void drawOperationLogging(JoinPoint joinPoint) {
        String logInfo = "Operation Before Draw : " + joinPoint.getTarget().getClass().getCanonicalName() + "." + joinPoint.getSignature().getName();
        logger.info(logInfo);
    }

    @Pointcut("execution(* com.tester.aop.services.*.get*Name(..))")
    public void loggerAllGetNameOperation() {}

    @Pointcut("execution(* com.tester.aop.services.*.draw(..))")
    public void loggerDrawOperation() {}

}


