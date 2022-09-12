package Test;

import Models.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Test1 {


    public static void main(String[] args) {

        Educator educator1 = new Educator("Jibek", "Sarypbekova", "educator1@gmail.com", "12345678", "A good teacher", "15 years");
        Educator educator2 = new Educator("Mirlan", "Shadiev", "educator2@gmail.com", "12345678", "A good teacher", "5 years");

        Student student1 = new Student("Adis", "Kerimov", "student1@gmail.com", "87654321", 20, "0220075870", "Kok-Jhar 1/1");
        Student student2 = new Student("Bekzhan", "Chandaev", "student2@gmail.com", "87654321", 20, "0555545454", "Kievskaya 18");
        Student student3 = new Student("Akmaral", "Abdylmanap kyzy", "student3@gmail.com", "87654321", 20, "0555545455", "Moskovskaya 19");
        Student student4 = new Student("Aruuke", "Toktosunova", "student4@gmail.com", "87654321", 20, "0555545456", "Manasa 77");
        Student student5 = new Student("Aisha", "Madali kyzy", "student5@gmail.com", "87654321", 20, "0555545457", "Tynystanova 8");
        Student student6 = new Student("Ayana", "Israilova", "student6@gmail.com", "87654321", 20, "0555545458", "Toktogula 11");
        Student student7 = new Student("Madina", "Turabaeva", "student7@gmail.com", "87654321", 19, "0555545459", "Gogolya 43");
        Student student8 = new Student("Aidar", "Sharshenkulov", "student8@gmail.com", "87654321", 20, "0555545460", "12 microdistrict 10");
        Student student9 = new Student("Ismail", "Akhmetov", "student9@gmail.com", "87654321", 20, "0555545461", "6 microdistrict 22");
        Student student10 = new Student("Alaken", "Kubatbekov", "student10@gmail.com", "87654321", 20, "0555545462", "8 microdistrict 99");

        Subject subject1 = new Subject("Front-End", "A great course", "10 months");
        Subject subject2 = new Subject("OOP", "A great course", "12 months");

        ArrayList<Student> students1 = new ArrayList<>(Arrays.asList(student1, student2, student3, student4));
        ArrayList<Student> students2 = new ArrayList<>(Arrays.asList(student5, student6, student7, student8, student9, student10));

        Course course1 = new Course("Basic Front-End Course", students1, subject1, educator2);
        Course course2 = new Course("Basic OOP Course", students2, subject2, educator1);

        Archive archive1 = new Archive(course1, student1, Mark.EXCELLENT);
        Archive archive2 = new Archive(course1, student2, Mark.EXCELLENT);
        Archive archive3 = new Archive(course1, student3, Mark.EXCELLENT);
        Archive archive4 = new Archive(course1, student4, Mark.EXCELLENT);

        educator1.addCourse();
        student10.enroll();
        course1.confirm();
        student10.startStudyingProcess();
        course1.completeCourse();
        educator1.giveMark();
        archive1.addRecord();
    }
}
