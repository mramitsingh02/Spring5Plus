package com.tester.aop.case9;

import com.tester.aop.pojo.User;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import java.util.logging.Logger;

@Aspect
@Component
public class Case9LoggingAspect {
    private static Logger logger = Logger.getLogger(Case9LoggingAspect.class.getName());

    @Around(value = "loggerRegisterService()")
    public Boolean stringValueGetMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        StopWatch stopWatch = new StopWatch("RegisterService.signIn");
        try {
            stopWatch.start();
            Boolean proceed = (Boolean) proceedingJoinPoint.proceed();
            return proceed;
        } finally {
            stopWatch.stop();
            logger.info("Time Taken: " + stopWatch.prettyPrint());
        }
    }


    @Pointcut("execution(* com.tester.aop.services.RegisterService.signIn(..))")
    public void loggerRegisterService() {
    }

    @Around(value = "execution(* com.tester.aop.services.RegisterService.signUp(..)) && args(user)")
    public Boolean userParamLoggingAround(ProceedingJoinPoint proceedingJoinPoint, User user) throws Throwable {
        StopWatch stopWatch = new StopWatch("RegisterService.signUp");
        try {
            stopWatch.start();
            Boolean proceed = (Boolean) proceedingJoinPoint.proceed();
            return proceed;
        } finally {
            stopWatch.stop();
            logger.info("Time Taken: " + stopWatch.prettyPrint());
        }
    }

}


