package com.tester.aop.services;

import com.tester.aop.pojo.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CowService extends AnimalService {


    @Autowired
    @Qualifier("cow")
    @Override
    public void setAnimal(Animal animal) {
        super.setAnimal(animal);
    }
}
