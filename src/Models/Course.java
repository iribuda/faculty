package Models;

import java.util.ArrayList;

public class Course {

    private int Id;
    private String title;
    private ArrayList<Student> students;
    private Subject subject;
    private Educator educator;

    public Course(String name, ArrayList<Student> students, Subject subject, Educator educator) {
        this.title = name;
        this.students = students;
        this.subject = subject;
        this.educator = educator;
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

    public Educator getEducator() {
        return educator;
    }

    public void setEducator(Educator educator) {
        this.educator = educator;
    }

    public void confirm(){
        System.out.println("Student's enroll was confirmed");
    }

    public void completeCourse(){
        System.out.println("The course was completed");
    }
}

