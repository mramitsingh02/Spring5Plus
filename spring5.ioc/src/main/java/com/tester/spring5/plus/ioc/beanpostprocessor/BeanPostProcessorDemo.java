package com.tester.spring5.plus.ioc.beanpostprocessor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanPostProcessorDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(AppConfig.class);
        applicationContext.refresh();
        applicationContext.registerShutdownHook();

    }
}
