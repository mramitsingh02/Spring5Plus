package com.tester.spring5.plus.ioc.beanfactorypostprocessor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanFactoryPostProcessorDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(AppConfig.class);
        applicationContext.refresh();
        University university = applicationContext.getBean(University.class);
        university.getDepartmentList().forEach(System.out::println);
        applicationContext.registerShutdownHook();
    }
}
