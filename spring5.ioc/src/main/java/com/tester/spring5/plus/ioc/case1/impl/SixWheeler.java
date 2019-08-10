package com.tester.spring5.plus.ioc.case1.impl;

import com.tester.spring5.plus.ioc.case1.api.Company;
import com.tester.spring5.plus.ioc.case1.api.Wheeler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class SixWheeler implements Wheeler {
    @Autowired
    @Qualifier(value = "CFTCompany")
    private Company company;

    @Override
    public int getNumberOfWhile() {
        return 6;
    }

    @Override
    public String getManufacture() {
        return company.getName();
    }
}
