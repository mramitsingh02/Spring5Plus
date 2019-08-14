package com.tester.aop;

import com.tester.aop.services.ShapeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopMainClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AOPConfig.class);
//        UniversityService universityService = applicationContext.getBean(UniversityService.class);
//        universityService.add(new University(1, "BN Collage"));
//        //universityService.add(new University(2, "AN Collage"));
//        //universityService.add(new University(3, "RPS"));
//        universityService.getAll().forEach(System.out::println);
//        System.out.println("======================================");
//
//        StudentService studentService = applicationContext.getBean(StudentService.class);
//        studentService.add(new Student(1000, "Amit Kumar Singh"));
////        studentService.add(new Student(1001,"Arpit Singh"));
////        studentService.add(new Student(1002,"Priya Singh"));
////        studentService.add(new Student(1003,"Sonu Singh"));
////        studentService.add(new Student(1004,"Anuprity Singh"));
//        studentService.getAll().forEach(System.out::println);


        ShapeService shapeService = applicationContext.getBean(ShapeService.class);
        shapeService.draw();
        shapeService.getShapeName();


    }
}
