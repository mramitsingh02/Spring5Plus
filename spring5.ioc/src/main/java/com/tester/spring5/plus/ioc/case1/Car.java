package com.tester.spring5.plus.ioc.case1;

import com.tester.spring5.plus.ioc.case1.api.Engine;
import com.tester.spring5.plus.ioc.case1.api.VehicalColor;
import com.tester.spring5.plus.ioc.case1.api.VehicalModel;
import com.tester.spring5.plus.ioc.case1.api.Wheeler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
    @Autowired
    private VehicalColor vehicalColor;

    @Autowired
    @Qualifier("pistonEngine")
    private Engine engine;
    @Autowired
    @Qualifier("fourWheeler")
    private Wheeler whiles;
    @Autowired
    @Qualifier("i20")
    private VehicalModel model;

    @Override
    public String getColor() {
        return vehicalColor.color(125, 0, 125);
    }

    @Override
    public String getEngineName() {
        return engine.getName();
    }

    @Override
    public int getWhiles() {
        System.out.println(whiles.getManufacture());
        return whiles.getNumberOfWhile();
    }

    @Override
    public String getWhilesManufactures() {
        return whiles.getManufacture();
    }

    @Override
    public String getModel() {
        return model.getModelName();
    }

    public VehicalColor getVehicalColor() {
        return vehicalColor;
    }

    public Engine getEngine() {
        return engine;
    }
}
