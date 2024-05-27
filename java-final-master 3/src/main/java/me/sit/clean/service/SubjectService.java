package me.sit.clean.service;

import me.sit.clean.entity.Subject;

import java.util.List;

public interface SubjectService {

    Subject addSubject(String subjectId);
    Subject removeSubject(String subjectId);

    Subject getSubjectById(String subjectId);

    List<Subject> getAllSubjects();

}
