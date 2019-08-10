package com.tester.spring5.plus.ioc.case2;

import org.springframework.stereotype.Component;

public interface DepartmentAPI {
    public int getDepartmentId();
    public void setDepartmentId(int departmentId);
    public String getDepartmentName();
    public void setDepartmentName(String departmentName);

}

