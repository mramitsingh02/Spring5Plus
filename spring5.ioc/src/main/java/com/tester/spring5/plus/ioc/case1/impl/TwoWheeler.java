package com.tester.spring5.plus.ioc.case1.impl;

import com.tester.spring5.plus.ioc.case1.api.Manufacturers;
import com.tester.spring5.plus.ioc.case1.api.Wheeler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TwoWheeler implements Wheeler {
    @Autowired
    private Manufacturers manufacturers;

    @Override
    public int getNumberOfWhile() {
        return 2;
    }

    @Override
    public String getManufacture() {
        return manufacturers.getManufacturerName();
    }
}
