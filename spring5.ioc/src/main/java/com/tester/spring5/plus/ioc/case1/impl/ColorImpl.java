package com.tester.spring5.plus.ioc.case1.impl;

import com.tester.spring5.plus.ioc.case1.api.VehicalColor;
import com.tester.spring5.plus.ioc.utils.ColorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ColorImpl implements VehicalColor {

    @Autowired
    private ColorUtils colorUtils;

    @Override
    public String color(int r, int g, int b){
        return colorUtils.getColorNameFromRgb(r, g, b);
    }
}
