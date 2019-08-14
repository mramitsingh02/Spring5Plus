package com.tester.aop.pojo;

import org.springframework.stereotype.Component;

@Component
public class Cow implements Animal {
    private String name = "cow";

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
    }
}
