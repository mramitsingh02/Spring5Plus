package com.tester.spring5.plus.ioc.case1;

import com.tester.spring5.plus.ioc.case1.api.Engine;
import com.tester.spring5.plus.ioc.case1.api.VehicalColor;
import com.tester.spring5.plus.ioc.case1.api.VehicalModel;
import com.tester.spring5.plus.ioc.case1.impl.WheelerManufacturers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Mustang extends Car implements Vehicle {

    @Autowired
    @Qualifier("turboEngine")
    private Engine engine;

    @Autowired
    @Qualifier("mustangModel")
    private VehicalModel model;
    @Autowired
    private WheelerManufacturers wheelerManufacturers;

    @Override
    public String getColor() {
        Random random = new Random();
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);
        return getVehicalColor().color(r, g, b);
    }

    @Override
    public String getEngineName() {
        return engine.getName();
    }

    @Override
    public String getWhilesManufactures() {
        return wheelerManufacturers.getManufacturerName();
    }

    @Override
    public String getModel() {
        return model.getModelName();
    }
}
