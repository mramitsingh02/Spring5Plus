package com.tester.aop.pojo;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {
    private String name = "dog";

    @Override
    public void walk() {
        System.out.println(asName() + " walking.");
    }

    @Override
    public void talk() {
        System.out.println(asName() + " talking.");
    }

    @Override
    public void eat() {
        System.out.println(asName() + " eating.");
    }

    @Override
    public String asName() {
        return name;
    }

    @Override
    public void withName(String name) {
        this.name = name;
        throw new RuntimeException("Not allowed to set the value");
    }
}
