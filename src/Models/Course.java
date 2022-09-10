package Models;

import java.util.ArrayList;

public class Course {

    private int Id;
    private String title;
    private ArrayList<Student> students;
    private Subject subject;
    private ArrayList<Educator> educators;

    public Course(String name, ArrayList<Student> students, Subject subject, ArrayList<Educator> educators) {
        this.title = name;
        this.students = students;
        this.subject = subject;
        this.educators = educators;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public ArrayList<Educator> getEducators() {
        return educators;
    }

    public void setEducators(ArrayList<Educator> educators) {
        this.educators = educators;
    }
}

