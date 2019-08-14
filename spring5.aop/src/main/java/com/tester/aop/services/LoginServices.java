package com.tester.aop.services;

import com.tester.aop.pojo.User;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@Component
public class LoginServices {
    private static final Map<String, User> mapOfUser = new HashMap<>();

    static {
        mapOfUser.put("Mohan", new User("Mohan", "@12345$"));
        mapOfUser.put("Amit", new User("Amit", "1234"));
        mapOfUser.put("Arpit", new User("Arpit", "12345"));
        mapOfUser.put("Sanu", new User("Sanu", "12346"));
    }


    public Boolean signIn(User user) {
        User dbUser = mapOfUser.get(user.getUserName());
        sleepMe();
        if (Objects.nonNull(dbUser)) {
            if (dbUser.equals(user)) {
                {
                    System.out.println("Successful login");
                    return Boolean.TRUE;
                }
            }
        }
        return Boolean.FALSE;
    }

    public Boolean signUp(User user) {
        User dbUser = mapOfUser.get(user.getUserName());
        sleepMe();
        if (Objects.nonNull(dbUser)) {
            mapOfUser.put(dbUser.getUserName(), user);
            System.out.println("Successful User Update.");
            return Boolean.TRUE;
        } else {
            mapOfUser.put(user.getUserName(), user);
            System.out.println("Successful Sign Up.");
            return Boolean.TRUE;
        }

    }

    private void sleepMe() {
        try {
            TimeUnit.SECONDS.sleep(new Random(10).nextInt());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
