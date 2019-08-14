package com.tester.aop.case8;

import com.tester.aop.AOPConfig;
import com.tester.aop.pojo.User;
import com.tester.aop.services.AnimalService;
import com.tester.aop.services.CowService;
import com.tester.aop.services.LoginServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AOPWithAroundDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AOPConfig.class);

        LoginServices animalService = applicationContext.getBean(LoginServices.class);
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
