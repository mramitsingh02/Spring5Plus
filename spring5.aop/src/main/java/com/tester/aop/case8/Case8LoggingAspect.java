package com.tester.aop.case8;

import com.tester.aop.pojo.User;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class Case8LoggingAspect {
    private static Logger logger = Logger.getLogger(Case8LoggingAspect.class.getName());

    @Around(value = "loggerLoginService()")
    public Boolean stringValueGetMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        String logBInfo = "Before : " + proceedingJoinPoint.getTarget().getClass().getCanonicalName() + "." + proceedingJoinPoint.getSignature().getName();
        logger.info(logBInfo);
        long startTime = System.currentTimeMillis();
        Boolean proceed = (Boolean) proceedingJoinPoint.proceed();
        long endTime = System.currentTimeMillis();
        System.out.println("Time Diff : " + (endTime - startTime) + "ms.");
        String logAInfo = "After : " + proceedingJoinPoint.getTarget().getClass().getCanonicalName() + "." + proceedingJoinPoint.getSignature().getName();
        logger.info(logAInfo);
        return proceed;
    }


    @Pointcut("execution(* com.tester.aop.services.LoginServices.signIn(..))")
    public void loggerLoginService() {
    }

    @Around(value = "execution(* com.tester.aop.services.LoginServices.signUp(..)) && args(user)")
    public Boolean userParamLoggingAround(ProceedingJoinPoint proceedingJoinPoint, User user) throws Throwable {
        logger.info("Before Login User");
        Boolean proceed = (Boolean) proceedingJoinPoint.proceed();
        logger.info("After Login User");
        return proceed;
    }

}


