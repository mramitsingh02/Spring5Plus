package com.tester.spring5.plus.ioc.case2;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployService implements GlobalService<Employee, Integer>{
    public Map<Integer, Employee> lisMap = new HashMap<>();

    @Override
    public void add(Employee employee) {
        lisMap.put(employee.getEmpId(),  employee);
    }

    @Override
    public Employee delete(Employee employee) {
        return lisMap.remove(employee);
    }

    @Override
    public Employee get(Integer index) {
        return lisMap.get(index);
    }

    @Override
    public List<Employee> getAll() {
        return new ArrayList<>(lisMap.values());
    }

    @Override
    public Employee update(Employee employee) {
        return lisMap.put(employee.getEmpId(), employee);
    }
}
