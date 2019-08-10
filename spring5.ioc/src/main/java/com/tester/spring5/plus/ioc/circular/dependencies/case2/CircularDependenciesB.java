package com.tester.spring5.plus.ioc.circular.dependencies.case2;

import com.tester.spring5.plus.ioc.circular.dependencies.case2.CircularDependenciesA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CircularDependenciesB {

    private CircularDependenciesA dependenciesA;

   /* @Autowired
    public CircularDependenciesB(CircularDependenciesA dependenciesA) {
        this.dependenciesA = dependenciesA;
    }*/

    public CircularDependenciesA getDependenciesA() {
        return dependenciesA;
    }

    @Autowired
    @Qualifier("circularDependenciesA")
    public void setDependenciesA(CircularDependenciesA dependenciesA) {
        this.dependenciesA = dependenciesA;
    }
}
