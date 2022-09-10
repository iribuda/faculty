package Models;

public class Subject {

    private int Id;
    private String title;
    private String description;
    private String period;

    public Subject(String name, String description, String period) {
        this.title = name;
        this.description = description;
        this.period = period;
    }

    public int getId() {
        return Id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }
}

