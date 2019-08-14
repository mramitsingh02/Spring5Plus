package com.tester.aop.case2;

import com.tester.aop.AOPConfig;
import com.tester.aop.pojo.Student;
import com.tester.aop.pojo.University;
import com.tester.aop.services.StudentService;
import com.tester.aop.services.UniversityService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SimpleLoggingGetterAndSetterDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AOPConfig.class);
        UniversityService universityService = applicationContext.getBean(UniversityService.class);
        universityService.add(new University(1, "BN Collage"));
        universityService.getAll().forEach(System.out::println);
        StudentService studentService = applicationContext.getBean(StudentService.class);
        studentService.add(new Student(1000, "Amit Kumar Singh"));
        studentService.getAll().forEach(System.out::println);
    }
}
