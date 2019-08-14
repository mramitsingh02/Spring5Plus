package com.tester.aop.pojo;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class User implements Serializable {
    private final String userName;
    private final char[] password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password.toCharArray();
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userName.equals(user.userName) &&
                Arrays.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(userName);
        result = 31 * result + Arrays.hashCode(password);
        return result;
    }
}
