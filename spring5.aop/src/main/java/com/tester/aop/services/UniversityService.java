package com.tester.aop.services;

import com.tester.aop.pojo.University;
import com.tester.aop.repository.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversityService {
    @Autowired
    private UniversityRepository repository;

    public void add(University university) {
        repository.add(university);
    }

    public University get(int universityId) {
        return repository.get(universityId);
    }

    public List<University> getAll() {
       return repository.getAll();
    }
}
