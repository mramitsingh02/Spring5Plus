package com.tester.spring5.plus.ioc.beanlifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class MyBean implements InitializingBean, DisposableBean {

    private String nickName = "Amit Singh";

    @PostConstruct
    public void initPostConstruct() {
        System.out.println(this.getClass().getSimpleName() + "----> initPostConstruct by Annotation.");

    }

    @PreDestroy
    public void destroyPreDestroy() {
        System.out.println(this.getClass().getSimpleName() + "----> destroyPreDestroy by Annotation.");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(this.getClass().getSimpleName() + "----> destroy by DisposableBean.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this.getClass().getSimpleName() + "----> afterPropertiesSet by InitializingBean.");
    }


    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
