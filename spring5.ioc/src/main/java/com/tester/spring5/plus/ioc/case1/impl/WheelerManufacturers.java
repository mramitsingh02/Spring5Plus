package com.tester.spring5.plus.ioc.case1.impl;

import com.tester.spring5.plus.ioc.case1.api.Company;
import com.tester.spring5.plus.ioc.case1.api.Manufacturers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Scope("prototype")
public class WheelerManufacturers implements Manufacturers {
    @Autowired(required = false)
    @Qualifier("CFTCompany")
    private Company company;

    @Override
    public String getManufacturerName() {
        return this.hashCode() + ": " + company.getName();
    }

    public void setCompany(Company company) {
        System.out.println("Setting Value");
        this.company = company;
    }
}
