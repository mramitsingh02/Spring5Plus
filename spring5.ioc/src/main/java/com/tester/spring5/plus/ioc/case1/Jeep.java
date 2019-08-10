package com.tester.spring5.plus.ioc.case1;

import com.tester.spring5.plus.ioc.case1.api.Engine;
import com.tester.spring5.plus.ioc.case1.impl.WheelerManufacturers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Jeep implements Vehicle {
    @Autowired
    @Qualifier("turboEngine")
    private Engine engine;
    @Autowired
    private WheelerManufacturers wheelerManufacturers;

    @Override
    public String getColor() {
        return "Deep Green";
    }

    @Override
    public String getEngineName() {
        //


        return engine.getName();
    }

    @Override
    public int getWhiles() {
        return 4;
    }

    @Override
    public String getWhilesManufactures() {
        return wheelerManufacturers.getManufacturerName();
    }

    @Override
    public String getModel() {
        return "Thar";
    }
}
