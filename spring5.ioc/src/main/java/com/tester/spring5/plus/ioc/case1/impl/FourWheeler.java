package com.tester.spring5.plus.ioc.case1.impl;

import com.tester.spring5.plus.ioc.case1.api.Manufacturers;
import com.tester.spring5.plus.ioc.case1.api.Wheeler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FourWheeler implements Wheeler {
    @Autowired
    private Manufacturers manufacturers;

    @Override
    public int getNumberOfWhile() {
        return 4;
    }

    @Override
    public String getManufacture() {
        return manufacturers.getManufacturerName();
    }
}
