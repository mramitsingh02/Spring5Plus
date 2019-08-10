package com.tester.spring5.plus.ioc.factorybean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class CustomeFactoryBean implements FactoryBean<CustomerService> {
    CustomerService service= new CustomerService();

    @Override
    public CustomerService getObject() throws Exception {
        return service;
    }

    @Override
    public Class<?> getObjectType() {
        return service.getClass();
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
