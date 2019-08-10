package com.tester.spring5.plus.ioc.circular.dependencies.case2;

import com.tester.spring5.plus.ioc.circular.dependencies.case2.CircularDependenciesB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CircularDependenciesA {
    private CircularDependenciesB dependenciesB;

    /*@Autowired
    public CircularDependenciesA(CircularDependenciesB dependenciesB) {
        this.dependenciesB = dependenciesB;
    }*/

    public CircularDependenciesB getDependenciesB() {
        return dependenciesB;
    }
    @Autowired
    @Qualifier("circularDependenciesB")
    public void setDependenciesB(CircularDependenciesB dependenciesB) {
        this.dependenciesB = dependenciesB;
    }
}
