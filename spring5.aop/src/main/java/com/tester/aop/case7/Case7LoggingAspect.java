package com.tester.aop.case7;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class Case7LoggingAspect {
    private static Logger logger = Logger.getLogger(Case7LoggingAspect.class.getName());


/*    @AfterReturning(pointcut = "args(name)")
    public void stringArgumentMethodsSuccessfulReturn(String name) {
        logger.info("Parameter Value : " + name + ", No Exception.");
    }*/

    @AfterReturning(pointcut = "execution (* com.tester.aop.services.CowService.asName(..))", returning = "returnValue")
    public void stringValueGetMethod(String returnValue) {
        logger.info("Parameter Value : " + returnValue + ", No Exception.");
    }
    @AfterThrowing("args(name)")
    public void stringArgumentMethodsAfterThrowing(String name) {
        logger.severe("An Exception throwing.");
    }
}


