package Models;

public class Archive {

    private int Id;
    private Course course;
    private Student student;
    private Mark mark;

    public Archive(Course course, Student student, Mark mark) {
        this.course = course;
        this.student = student;
        this.mark = mark;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }
}
