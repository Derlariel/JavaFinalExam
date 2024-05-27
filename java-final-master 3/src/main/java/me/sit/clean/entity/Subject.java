package me.sit.clean.entity;

public class Subject {

    private final String subjectId;
    private Grade grade = Grade.A;

    public Subject(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
    public Subject clone() {
        return new Subject(subjectId);
    }

}
