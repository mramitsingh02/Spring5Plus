package com.tester.spring5.plus.ioc.case2;

import com.tester.spring5.plus.ioc.IOCConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.atomic.AtomicInteger;

public class EmployeeRunner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(IOCConfig.class);

        EmployService employService = applicationContext.getBean("employService", EmployService.class);
        AtomicInteger empIdGenerator = new AtomicInteger(10000);

        DepartmentAPI department = applicationContext.getBean("department", DepartmentAPI.class);
        department.setDepartmentId(1234);
        department.setDepartmentName("Mobile");
/*
        for (int i = 0; i < 100; i++) {
            Employee employee = applicationContext.getBean("employee", Employee.class);
            employee.setEmpId(empIdGenerator.incrementAndGet());
            employee.setName("Name_" + empIdGenerator.get());
            employee.setDepartment(department);
            employService.add(employee);
        }*/
        for (int i = 0; i < 100; i++) {
            RegularEmployee employee = applicationContext.getBean("regularEmployee", RegularEmployee.class);
            employee.setEmpId(empIdGenerator.incrementAndGet());
            employee.setName("Name_" + empIdGenerator.get());
            employee.setEmailId(employee.getName()+ "." + employee.getEmpId() + "@gmail.com");
            employee.setDepartment(department);
            employService.add(employee);
        }

        System.out.println(employService.getAll());


    }

    private static void addEmployee(EmployService employService) {
    }
}
