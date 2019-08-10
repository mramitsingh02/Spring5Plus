package com.tester.spring5.plus.ioc.case2;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class RegularEmployee extends Employee {
    @Setter
    @Getter
    private String emailId;

    @Override
    public String toString() {
        return "RegularEmployee{" +
                "Employee='" + super.toString() + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}
