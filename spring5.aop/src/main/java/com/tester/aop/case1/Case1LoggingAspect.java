package com.tester.aop.case1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class Case1LoggingAspect {
    private static Logger logger = Logger.getLogger(Case1LoggingAspect.class.getName());

    @Before("execution(* com.tester.aop.case1.services.*.add(..))")
    public void addLoggingBefore(JoinPoint joinPoint) {
        String logInfo = "Operation Before : " + joinPoint.getTarget().getClass().getCanonicalName() + "." + joinPoint.getSignature().getName();
        logger.info(logInfo);
    }

    @After("execution(* com.tester.aop.case1.services.*.add(..))")
    public void addLoggingAfter(JoinPoint joinPoint) {
        String logInfo = "Operation After : " + joinPoint.getTarget().getClass().getCanonicalName() + "." + joinPoint.getSignature().getName();
        logger.info(logInfo);
    }
}


