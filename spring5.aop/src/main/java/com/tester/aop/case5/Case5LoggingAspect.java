package com.tester.aop.case5;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class Case5LoggingAspect {
    private static Logger logger = Logger.getLogger(Case5LoggingAspect.class.getName());


    @After("loggerDrawOperationWithin() && loggerForTransparencyOperation()")
    private void drawOperationLoggingWithin(JoinPoint joinPoint) {
        String logInfo = "Operation After using within : " + joinPoint.getTarget().getClass().getCanonicalName() + "." + joinPoint.getSignature().getName();
        logger.info(logInfo);
    }


    @Pointcut("execution(* com.tester.aop.pojo.*.transparency(..))")
    public void loggerForTransparencyOperation() {}


    @Pointcut("within(com.tester.aop.pojo.Triangle)")
    public void loggerDrawOperationWithin() {
    }
}


