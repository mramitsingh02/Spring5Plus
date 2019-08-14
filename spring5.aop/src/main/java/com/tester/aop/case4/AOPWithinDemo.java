package com.tester.aop.case4;

import com.tester.aop.AOPConfig;
import com.tester.aop.services.ShapeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AOPWithinDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AOPConfig.class);
        ShapeService shapeService = applicationContext.getBean(ShapeService.class);
        shapeService.draw();
        shapeService.getShapeName();
        shapeService.transparency(50);
    }
}
