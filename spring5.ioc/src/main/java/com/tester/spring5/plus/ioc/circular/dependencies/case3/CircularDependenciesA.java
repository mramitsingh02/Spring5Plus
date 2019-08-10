package com.tester.spring5.plus.ioc.circular.dependencies.case3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class CircularDependenciesA {

    @Autowired
    private CircularDependenciesB dependenciesB;

    public CircularDependenciesB getDependenciesB() {
        return dependenciesB;
    }

    @PostConstruct
    public void initPostConstruct() {
        this.dependenciesB.setDependenciesA(this);
    }
}
