package com.tester.aop.repository;

import com.tester.aop.pojo.University;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository
public class UniversityRepository {
    private static Map<Integer, University> universityMap = new HashMap<>();


    public void add(University u) {
        universityMap.put(u.getUniversityId(), u);
    }

    public University get(int universityId) {
        return universityMap.get(universityId);
    }

    public List<University> getAll() {
        return new ArrayList<>(universityMap.values());
    }
}
