package com.tester.aop.services;

import com.tester.aop.pojo.Shape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ShapeService {
    @Autowired
    @Qualifier("triangle")
    private Shape shape;

    public String getShapeName() {
        return this.shape.getName();
    }

    public void setShapeName(String shapeName) {
    shape.setName(shapeName);
    }

    public void draw() {
        this.shape.draw();
    }

    public void transparency(int i) {
        shape.transparency(i);
    }
}
