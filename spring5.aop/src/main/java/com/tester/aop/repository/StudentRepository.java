package com.tester.aop.repository;

import com.tester.aop.pojo.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository
public class StudentRepository {
    Map<Integer, Student> list = new HashMap<>();

    public void add(Student student) {
        list.put(student.getRoll(), student);
    }

    public void update(Student student) {
        list.put(student.getRoll(), student);
    }

    public Student get(int roll) {
        return list.get(roll);
    }

    public List<Student> getAll() {
        return new ArrayList(list.values());
    }
}
