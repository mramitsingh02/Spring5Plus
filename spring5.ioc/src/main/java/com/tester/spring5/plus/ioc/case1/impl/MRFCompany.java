package com.tester.spring5.plus.ioc.case1.impl;

import com.tester.spring5.plus.ioc.case1.api.Company;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MRFCompany implements Company {
    private String name= "MRF";

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public String getName() {
        return name + " : " + this.hashCode();
    }
}
