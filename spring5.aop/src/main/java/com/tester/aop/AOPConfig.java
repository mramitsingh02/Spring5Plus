package com.tester.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.tester.aop")
@EnableAspectJAutoProxy
public class AOPConfig {
}
