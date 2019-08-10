package com.tester.spring5.plus.ioc.case2;

import lombok.Data;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public @Data class Employee {

    private int empId;
    private String name;
    private DepartmentAPI department;

}
