package com.tester.spring5.plus.ioc.circular.dependencies.case1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanCurrentlyInCreationException;
import org.springframework.beans.factory.UnsatisfiedDependencyException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
public class CircularDependenciesTest  {

    @Test
    public void givenCircularDependency_whenConstructorInjection_thenItFails(){

    }

}
