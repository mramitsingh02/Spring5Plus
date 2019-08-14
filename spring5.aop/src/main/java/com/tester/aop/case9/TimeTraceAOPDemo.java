package com.tester.aop.case9;

import com.tester.aop.AOPConfig;
import com.tester.aop.pojo.User;
import com.tester.aop.services.LoginServices;
import com.tester.aop.services.RegisterService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TimeTraceAOPDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AOPConfig.class);

        RegisterService animalService = applicationContext.getBean(RegisterService.class);
        Boolean isSignUp = animalService.signUp(new User("Amit", "1234567"));

        if (isSignUp) {
            System.out.println("Login Successful");
        }else{
            System.out.println("Authorization error.");
        }



        Boolean isLogin = animalService.signIn(new User("Mohan", "@12345$"));
        if (Boolean.TRUE.equals(isLogin)) {
            System.out.println("Login Successful");
        }else{
            System.out.println("Authorization error.");
        }

    }
}
