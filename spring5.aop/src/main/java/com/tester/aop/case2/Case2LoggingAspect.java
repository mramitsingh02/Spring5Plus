package com.tester.aop.case2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class Case2LoggingAspect {
    private static Logger logger = Logger.getLogger(Case2LoggingAspect.class.getName());

    @Before("execution(* com.tester.aop.services.UniversityService.add(..))")
    public void addLoggingBefore(JoinPoint joinPoint) {
        String logInfo = "Operation Before : " + joinPoint.getTarget().getClass().getCanonicalName() + "." + joinPoint.getSignature().getName();
        logger.info(logInfo);
    }

    @After("execution(* com.tester.aop.services.StudentService.add(..))")
    public void addLoggingAfter(JoinPoint joinPoint) {
        String logInfo = "Operation After : " + joinPoint.getTarget().getClass().getCanonicalName() + "." + joinPoint.getSignature().getName();
        logger.info(logInfo);
    }


    @Before("loggerAllGetOperation()")
    private void getLoggingBefore(JoinPoint joinPoint) {
        String logInfo = "Operation Before : " + joinPoint.getTarget().getClass().getCanonicalName() + "." + joinPoint.getSignature().getName();
        logger.info(logInfo);
    }

    @After("loggerAllGetOperation()")
    private void getLoggingAfter(JoinPoint joinPoint) {
        String logInfo = "Operation After : " + joinPoint.getTarget().getClass().getCanonicalName() + "." + joinPoint.getSignature().getName();
        logger.info(logInfo);
    }

    @Pointcut("execution(* com.tester.aop.services.*.get*(..))")
    public void loggerAllGetOperation() {
    }

}


