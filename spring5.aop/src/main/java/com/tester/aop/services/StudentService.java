package com.tester.aop.services;

import com.tester.aop.pojo.Student;
import com.tester.aop.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public void add(Student student) {
        repository.add(student);
    }

    public void update(Student student) {
        repository.update(student);
    }

    public Student get(int roll) {
        return repository.get(roll);
    }

    public List<Student> getAll() {
        return repository.getAll();
    }
}
