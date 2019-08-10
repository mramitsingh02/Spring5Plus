package com.tester.spring5.plus.ioc.case1.impl;

import com.tester.spring5.plus.ioc.case1.api.VehicalModel;
import org.springframework.stereotype.Component;

@Component
public class MustangModel implements VehicalModel {
    @Override
    public String getModelName() {
        return "Mustang";
    }
}
