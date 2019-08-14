package com.tester.aop.case6;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class Case6LoggingAspect {
    private static Logger logger = Logger.getLogger(Case6LoggingAspect.class.getName());


    //@After("loggerForArgsCondition()")
    private void drawOperationLoggingWithin(JoinPoint joinPoint) {
        String logInfo = "Operation After using within : " + joinPoint.getTarget().getClass().getCanonicalName() + "." + joinPoint.getSignature().getName();
        logger.info(logInfo);
    }

    @Before("args(name)")
    public void stringArgumentMethods(String name) {
        logger.info("Parameter Value : " + name);
    }
}


