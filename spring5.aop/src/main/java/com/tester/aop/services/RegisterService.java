package com.tester.aop.services;

import com.tester.aop.pojo.User;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@Component
public class RegisterService {
    private static final Map<String, User> mapOfUser = new HashMap<>();

    static {
        mapOfUser.put("Mohan", new User("Mohan", "@12345$"));
        mapOfUser.put("Amit", new User("Amit", "1234"));
        mapOfUser.put("Arpit", new User("Arpit", "12345"));
        mapOfUser.put("Sanu", new User("Sanu", "12346"));
    }


    public Boolean signIn(User user) {
        User dbUser = mapOfUser.get(user.getUserName());

        if (Objects.nonNull(dbUser)) {
            if (dbUser.equals(user)) {
                {
                    sleepMe();
                    System.out.println("Successful login");
                    return Boolean.TRUE;
                }
            }
        }
        return Boolean.FALSE;
    }

    public Boolean signUp(User user) {
        User dbUser = mapOfUser.get(user.getUserName());

        if (Objects.nonNull(dbUser)) {
            mapOfUser.put(dbUser.getUserName(), user);
            System.out.println("Successful User Update.");
            sleepMe();
            return Boolean.TRUE;
        } else {
            mapOfUser.put(user.getUserName(), user);
            System.out.println("Successful Sign Up.");
            sleepMe();
            return Boolean.TRUE;
        }

    }

    private void sleepMe() {
        try {
            Random random = new Random(50);

            TimeUnit.SECONDS.sleep(random.nextInt());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
