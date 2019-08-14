package com.tester.aop.case7;

import com.tester.aop.AOPConfig;
import com.tester.aop.services.AnimalService;
import com.tester.aop.services.CowService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AOPWithAfterReturningDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AOPConfig.class);

        AnimalService animalService = applicationContext.getBean(CowService.class);
        animalService.eat();
        animalService.withName("Domestic Cow");
        animalService.asName();

    }
}
