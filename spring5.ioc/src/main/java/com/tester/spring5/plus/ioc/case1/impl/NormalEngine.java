package com.tester.spring5.plus.ioc.case1.impl;

import com.tester.spring5.plus.ioc.case1.api.Engine;
import org.springframework.stereotype.Component;

@Component
public class NormalEngine implements Engine {
    @Override
    public String getName() {
        return "Normal Engine";
    }
}
