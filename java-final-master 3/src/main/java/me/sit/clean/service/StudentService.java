package me.sit.clean.service;

import me.sit.clean.entity.Student;
import me.sit.clean.exceptions.CreateStudentException;

import java.util.Collection;
import java.util.List;

// กำหนดโครงของ Service สำหรับการจัดการข้อมูลของนักเรียน
public interface StudentService {

    Collection<Student> getAllStudents();

    Student getStudentById(int student);

    Student getStudentByName(String name);

    Student addStudent(String name, int studentId);

    boolean removeStudentById(int studentId);

    Student removeStudentByName(String name);

    Student addSubjectToStudent(int studentId, String subjectId, double grade);

    Student removeSubjectFromStudent(int studentId, String subjectId);

    void writeAllStudentsToFile(String fileName);

    void readAllStudentsFromFile(String fileName);

}
