package com.tester.aop.case6;

import com.tester.aop.AOPConfig;
import com.tester.aop.services.AnimalService;
import com.tester.aop.services.ShapeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AOPWithArgsConditionDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AOPConfig.class);
        AnimalService animalService = applicationContext.getBean(AnimalService.class);
        animalService.eat();
        animalService.withName("Domestic Cat");
        animalService.asName();
    }
}
