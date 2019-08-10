package com.tester.spring5.plus.ioc.factorybean;

import com.tester.spring5.plus.ioc.beanpostprocessor.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomeFactroyBeanDemo {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(CustomeFactoryBeanConfig.class);
        applicationContext.refresh();
        applicationContext.registerShutdownHook();

        //CustomeFactoryBean customeFactoryBean = (CustomeFactoryBean) applicationContext.getBean("customeFactoryBean");
        // the above line give the classCastException. to get the customeFactoryBean bean ampersand(&) you have to add
        // before the beanname.

        CustomeFactoryBean customeFactoryBean = (CustomeFactoryBean) applicationContext.getBean("&customeFactoryBean");
        System.out.println(customeFactoryBean.getObject());


    }
}
