package com.tester.spring5.plus.ioc.circular.dependencies.case1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class CircularDependenciesA {
    private CircularDependenciesB circularDependenciesB;

    @Autowired
    public CircularDependenciesA(CircularDependenciesB dependenciesB) {
        this.circularDependenciesB = dependenciesB;
    }

}
