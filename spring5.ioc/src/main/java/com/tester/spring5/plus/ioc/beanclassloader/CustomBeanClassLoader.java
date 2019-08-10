package com.tester.spring5.plus.ioc.beanclassloader;

import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanClassLoader implements BeanClassLoaderAware {
    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("Classloader : " + classLoader.getParent().getClass().getSimpleName());
    }
}
