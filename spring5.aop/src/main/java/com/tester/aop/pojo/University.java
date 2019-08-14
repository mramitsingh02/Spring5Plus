package com.tester.aop.pojo;

public class University {
    private Integer universityId;
    private String universityName;

    public University(Integer universityId, String universityName) {
        this.universityId = universityId;
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return "University{" +
                "universityId='" + universityId + '\'' +
                ", universityName='" + universityName + '\'' +
                '}';
    }

    public Integer getUniversityId() {
        return universityId;
    }

    public void setUniversityId(Integer universityId) {
        this.universityId = universityId;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
}
