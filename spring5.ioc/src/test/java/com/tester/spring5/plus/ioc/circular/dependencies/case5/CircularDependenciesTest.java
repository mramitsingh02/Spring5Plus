package com.tester.spring5.plus.ioc.circular.dependencies.case5;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
public class CircularDependenciesTest {

    @Test
    public void shouldSuccessfulInjectBeanUsingInitializingBeanAndApplicationContextAware(){

    }


}