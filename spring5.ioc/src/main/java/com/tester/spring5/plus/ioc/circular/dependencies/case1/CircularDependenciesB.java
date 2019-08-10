package com.tester.spring5.plus.ioc.circular.dependencies.case1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class CircularDependenciesB {

    private CircularDependenciesA dependenciesA;

    @Autowired
    public CircularDependenciesB(CircularDependenciesA dependenciesA) {
        this.dependenciesA = dependenciesA;
    }


}
