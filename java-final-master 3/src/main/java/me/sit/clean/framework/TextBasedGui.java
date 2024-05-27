package me.sit.clean.framework;

import me.sit.clean.entity.Student;
import me.sit.clean.repository.IStudentService;

import java.util.Scanner;

public class TextBasedGui {

    public static void main(String[] args) {

        IStudentService studentService = new IStudentService();

        // 1. Add Student
        // 2. Remove Student
        // 3. Get Student by ID (Print student info)
        // 4. Get Student by Name (Print student info)
        // 5. Print all student;
        // 6. Exit

        Scanner scanner = new Scanner(System.in);
        int status = 0;
        System.out.println("1. Add Student");
        System.out.println("2. Remove Student");
        System.out.println("3. Get Student by ID (Print student info)");
        System.out.println("4. Get Student by Name (Print student info)");
        System.out.println("5. Print all student");
        System.out.println("6. Write All Students to file");
        System.out.println("7. Read All Students from file");
        System.out.println("8. Exit");
        while (true) {
            if(status == 0) {
                System.out.print("Enter your choice [1, 2, 3, 4, 5, 6, 7, 8]: ");
                status = scanner.nextInt();
                scanner.nextLine();

                if (status > 8 || status < 1) {
                    System.out.println("Invalid input");
                }
            }

            switch (status) {
                case 1:
                   while (true) {
                       try {
                           System.out.println("---- Create Student ----");
                           System.out.println("Enter student name: ");
                           String name = scanner.nextLine();
                           System.out.println("Enter student ID: ");
                           int studentId = scanner.nextInt();

                           Student newStudent = studentService.addStudent(name, studentId);
                           System.out.println("Created student: " + newStudent.toString());
                           break;
                       } catch (RuntimeException e) {
                           scanner.nextLine();
                           System.out.println(e.getMessage());
                       }
                   }

                   break;
                case 2:
                    System.out.println("---- Remove Student by NAME ----");
                    System.out.println("Enter student NAME: ");
                    String studentNameToRemove = scanner.next();
                    studentService.removeStudentByName(studentNameToRemove);
                    break;
                case 3:
                    System.out.println("---- Find Student by ID ----");
                    System.out.println("Enter student ID: ");
                    int studentIdToGet = scanner.nextInt();
                    Student student = studentService.getStudentById(studentIdToGet);
                    if (student != null) {
                        System.out.println("Found student: " + student);
                    } else {
                        System.out.println("Student not found");
                    }
                    break;
                case 4:
                    System.out.println("---- Find Student by Name ----");
                    System.out.println("Enter student name: ");
                    String studentNameToGet = scanner.next();
                    Student studentByName = studentService.getStudentByName(studentNameToGet);
                    if (studentByName != null) {
                        System.out.println("Found student: " + studentByName);
                    } else {
                        System.out.println("Student not found");
                    }
                    break;
                case 5:
                    System.out.println("---- Print all students ----");
                    studentService.getAllStudents().forEach(System.out::println);
                    break;
                case 6:
                    System.out.println("---- Write all students to file ----");
                    studentService.writeAllStudentsToFile("students.txt");
                    break;
                case 7:
                    System.out.println("---- Read all students from file ----");
                    studentService.readAllStudentsFromFile("students.txt");
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
            }

            status = 0;
        }
    }
}
