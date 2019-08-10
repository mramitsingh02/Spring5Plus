package com.tester.spring5.plus.ioc.circular.dependencies.case3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class CircularDependenciesB {
    private CircularDependenciesA dependenciesA;
    private String message = "Hi";

    public CircularDependenciesA getDependenciesA() {
        return dependenciesA;
    }

    public void setDependenciesA(CircularDependenciesA dependenciesA) {
        this.dependenciesA = dependenciesA;
    }

    public String getMessage() {
        return message;
    }
}
