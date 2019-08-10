package com.tester.spring5.plus.ioc.case1.impl;

import com.tester.spring5.plus.ioc.case1.api.Company;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class CFTCompany implements Company {
    private String name = "CFT";

    @Override
    public String getName() {
        return name + " : " + this.hashCode();
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CFTCompany{" +
                "name='" + name + '\'' +
                '}';
    }
}
