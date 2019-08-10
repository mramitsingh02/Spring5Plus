package com.tester.spring5.plus.ioc.circular.dependencies.case4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CircularDependenciesA {
    private CircularDependenciesB dependenciesB;

    public CircularDependenciesB getDependenciesB() {
        return dependenciesB;
    }
    @Autowired
    @Qualifier("circularDependenciesB")
    public void setDependenciesB(CircularDependenciesB dependenciesB) {
        this.dependenciesB = dependenciesB;
    }
}
