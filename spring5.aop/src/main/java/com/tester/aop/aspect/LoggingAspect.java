package com.tester.aop.aspect;

import com.tester.aop.pojo.Student;
import com.tester.aop.pojo.University;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

public class LoggingAspect {
    private static Logger logger = Logger.getLogger(LoggingAspect.class.getName());


}
