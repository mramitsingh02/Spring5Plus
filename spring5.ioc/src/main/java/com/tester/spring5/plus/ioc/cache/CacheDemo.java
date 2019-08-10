package com.tester.spring5.plus.ioc.cache;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CacheDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(AppConfig.class);
        applicationContext.refresh();
        StudentService studentService = applicationContext.getBean(StudentService.class);


        for (int i = 1; i <= 10; i++) {
            studentService.add(i, new Student(i, "Name" + i));
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(studentService.get(1));
        }
        for (int i = 1; i <= 10; i++) {
            Student student = studentService.get(1);
            studentService.refresh(1);
            if (i == 1) {
                student.setName(student.getName() + (i + 1));
                studentService.update(1, student);
            }
            System.out.println(student.toString());
        }
    }
}
