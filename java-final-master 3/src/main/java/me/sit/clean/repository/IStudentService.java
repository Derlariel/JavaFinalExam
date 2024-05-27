package me.sit.clean.repository;

import me.sit.clean.entity.Student;
import me.sit.clean.exceptions.CreateStudentException;
import me.sit.clean.service.StudentService;

import java.io.*;
import java.util.*;

public class IStudentService implements StudentService {

    private final Map<Integer, Student> students = new HashMap<>();

    @Override
    public Collection<Student> getAllStudents() {
        return students.values();
    }

    @Override
    public Student getStudentById(int studentId) {
      return students.get(studentId);
    }

    @Override
    public Student getStudentByName(String name) {
        for(Student student : getAllStudents()) {
            if(student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }

        return null;
    }

    @Override
    public Student addStudent(String name, int studentId) {
        if (name == null || name.isBlank()) {
            throw new CreateStudentException("Name cannot be blank");
        }

        if (students.containsKey(studentId)) {
            throw new CreateStudentException("Student already exists");
        }

        Student newStudent = new Student(name, studentId);
//        students.computeIfAbsent(studentId, x -> newStudent);
        students.put(studentId, newStudent);
        return newStudent;
    }

    @Override
    public boolean removeStudentById(int studentId) {
        if(students.containsKey(studentId)) {
            students.remove(studentId);
            return true;
        }

        return false;
    }

    @Override
    public Student removeStudentByName(String name) {
        Student student = getStudentByName(name);
        if(student == null) {
            throw new IllegalArgumentException("Student not found");
        }

        students.remove(student.getStudentId());
        return student;
    }

    @Override
    public Student addSubjectToStudent(int studentId, String subjectId, double grade) {
        return null;
    }

    @Override
    public Student removeSubjectFromStudent(int studentId, String subjectId) {
        return null;
    }

    @Override
    public void writeAllStudentsToFile(String fileName) {
            try (ObjectOutputStream fileWriter = new ObjectOutputStream(new FileOutputStream("src/main/resources/" + fileName))) {
                for(Student student : getAllStudents()) {
                    fileWriter.writeObject(student);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                System.out.println("File written successfully");
            }
    }

    @Override
    public void readAllStudentsFromFile(String fileName) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Reading file: ").append(fileName).append("\n");

        try (ObjectInputStream fileReader = new ObjectInputStream(new FileInputStream("src/main/resources/" + fileName))) {
            while (true) {
                Student student = (Student) fileReader.readObject();
                stringBuilder.append(student.toString()).append("\n");
            }
        } catch (EOFException e) {
            System.out.println("File read successfully");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println(stringBuilder);
        }
    }
}
