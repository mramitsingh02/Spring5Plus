package com.tester.aop.services;

import com.tester.aop.pojo.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalService {
    @Autowired
    @Qualifier("dog")
    private Animal animal;

    public void walk() {
        animal.walk();
    }

    public void talk() {
        animal.talk();
    }

    public void eat() {
        animal.eat();
    }

    public void withName(String name) {
        animal.withName(name);
    }

    public String asName() {
        return animal.asName();
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
