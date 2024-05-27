package Inheritance;

import java.time.LocalDate;
import java.time.Month;

public class MainInheritance {
    public static void main(String[] args) {
        testInheritance();
        testStaff();
    }
    static void testInheritance(){
        Student s1 = new Student();
        s1.setFirstName("Kongphob");
        s1.setLastName("Kongsan");
        s1.setGender("male");
        s1.setFaculty("Information Technology");
        s1.setMajor("IT");
        s1.setDob(LocalDate.of(2004, Month.JULY,1));
        System.out.println(s1.getFirstName()+ " " + s1.getLastName() + " "
                + s1.getGender() + " "+ s1.getFaculty()+ " " + s1.getMajor() + " "
                + s1.calculateDate() + " YearOld");
    }
    static void testStaff(){
        Student s2 = new Student();
        s2.setFirstName("Yanisa");
        s2.setLastName("Phongthirakan");
        s2.setGender("female");
        s2.setFaculty("gap year");
        s2.setMajor("");
        s2.setDob(LocalDate.of(2005, Month.APRIL,15));
        System.out.println(s2.getFirstName()+ " " + s2.getLastName() + " "
                + s2.getGender() + " "+ s2.getFaculty()+ " " + s2.getMajor() + " "
                + s2.calculateDate() + " Year old");
    }
    static void testExchangeStudent(){
        ExchangeStudent ex1 = new ExchangeStudent();
        ex1.setFirstName("Athur");
        ex1.setLastName("Smith");
        ex1.setPartnerUniversity("Pei Jing University");

    }
}
