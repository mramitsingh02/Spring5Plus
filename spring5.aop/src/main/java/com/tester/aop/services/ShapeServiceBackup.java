package com.tester.aop.services;

import com.tester.aop.pojo.Shape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ShapeServiceBackup {
    /*@Autowired
    @Qualifier("circle")
    private Shape circle;
    @Autowired
    @Qualifier("triangle")
    private Shape triangle;

    public Shape getCircle() {
        return circle;
    }

    public void setCircle(Shape circle) {
        this.circle = circle;
    }

    public Shape getTriangle() {
        return triangle;
    }

    public void setTriangle(Shape triangle) {
        this.triangle = triangle;
    }
    */
}
