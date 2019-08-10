package com.tester.spring5.plus.ioc.beanlifecycle;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Base64;

@Component
@Scope("thread")
public class NickNameEncoder {
    private String string;
    public String encode(String nickname){
        return Base64.getEncoder().encodeToString(nickname.getBytes());
    }
}
