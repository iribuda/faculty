package Models;

public class Educator extends User{

    private String description;
    private String experience;

    public Educator(String fName, String lName, String email, String password,String description,String experience) {
        super(fName, lName, email, password);
        this.description=description;
        this.experience=experience;
    }

    public String getDescription() {
        return description;
    }

    public String getExperience() {
        return experience;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public void addCourse(){

    }

    public void addMark(){

    }
}
