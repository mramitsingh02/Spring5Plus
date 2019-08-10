package com.tester.spring5.plus.ioc.beanlifecycle;

import com.tester.spring5.plus.ioc.beanfactorypostprocessor.AppConfig;
import com.tester.spring5.plus.ioc.beanfactorypostprocessor.University;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

public class BeanLifeCycleDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(BeanLifeCycleConfig.class);
        applicationContext.refresh();
        MyBean myBean = applicationContext.getBean(MyBean.class);
        System.out.println("Bean: " + myBean);
        System.out.println("NickName: " + myBean.getNickName());
        applicationContext.registerShutdownHook();

    }
}
