package com.tester.spring5.plus.ioc.circular.dependencies.case5;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class CircularDependenciesA implements ApplicationContextAware, InitializingBean {
    @Autowired
    private CircularDependenciesB dependenciesB;
    private ApplicationContext context;


    @Override
    public void afterPropertiesSet() throws Exception {
        dependenciesB = context.getBean(CircularDependenciesB.class);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
