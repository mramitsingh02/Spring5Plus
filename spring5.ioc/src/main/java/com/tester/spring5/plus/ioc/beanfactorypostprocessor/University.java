package com.tester.spring5.plus.ioc.beanfactorypostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class University implements BeanFactoryPostProcessor {

    private String universityName;
    private List<Department> departmentList;

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public List<Department> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        BeanDefinition department = configurableListableBeanFactory.getBeanDefinition("department");
        if(Objects.isNull(departmentList)){
            departmentList= new ArrayList<>();
        }

        try {
            Class classDept= Class.forName(department.getBeanClassName());
            for (int i=1; i<=10; i++) {
                Department dept = (Department) classDept.newInstance();
                dept.setDepartmentId(i);
                dept.setDepartmentName("Dept"+i);
                departmentList.add(dept);
            }

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(department.getBeanClassName());
    }
}
