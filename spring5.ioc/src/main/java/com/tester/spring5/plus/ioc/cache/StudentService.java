package com.tester.spring5.plus.ioc.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @CachePut(value = "myStudent", key = "#roll")
    public void add(int roll, Student student) {
        System.out.println("Adding new Student" + student.toString());
        studentRepository.add(student);
    }

    @CachePut(value = "myStudent", key = "#roll")
    public void update(int roll, Student student) {
        System.out.println("Updating Student: " + roll);
        studentRepository.update(student);
    }

    @Cacheable(value = "myStudent", key = "#roll")
    public Student get(int roll) {
        System.out.println("Getting Student: " + roll);
        return studentRepository.get(roll);
    }

    @CacheEvict(value = "myStudent",key = "#roll")
    public void refresh(int roll){

    }
}
