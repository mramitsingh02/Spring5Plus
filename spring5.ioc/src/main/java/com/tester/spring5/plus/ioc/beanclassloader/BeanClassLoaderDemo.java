package com.tester.spring5.plus.ioc.beanclassloader;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanClassLoaderDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(BeanClassloaderConfig.class);
        applicationContext.refresh();
        applicationContext.registerShutdownHook();

    }
}
