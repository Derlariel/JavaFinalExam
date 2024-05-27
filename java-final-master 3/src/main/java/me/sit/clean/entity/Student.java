package me.sit.clean.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String name;
    private final int studentId;
    private final List<Subject> subjects;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.subjects = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", studentId=").append(studentId);
        sb.append(", subjects=").append(subjects);
        sb.append('}');
        return sb.toString();
    }
}
