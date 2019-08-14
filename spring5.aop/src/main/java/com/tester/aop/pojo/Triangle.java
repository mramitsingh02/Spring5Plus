package com.tester.aop.pojo;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape {
    public String name = "triangle";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String shapeName) {
        this.name = shapeName;
    }
    @Override
    public void draw() {
        System.out.println("Drawing : " + getName());
    }

    @Override
    public void transparency(int percentage) {
        System.out.println("Transparency Increase by " + percentage + "%");
    }
}
