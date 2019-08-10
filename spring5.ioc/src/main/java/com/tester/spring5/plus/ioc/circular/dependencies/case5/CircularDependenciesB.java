package com.tester.spring5.plus.ioc.circular.dependencies.case5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class CircularDependenciesB {
    @Autowired
    private CircularDependenciesA dependenciesA;

    public CircularDependenciesA getDependenciesA() {
        return dependenciesA;
    }

    public void setDependenciesA(CircularDependenciesA dependenciesA) {
        this.dependenciesA = dependenciesA;
    }
}
