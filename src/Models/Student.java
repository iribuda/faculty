package Models;

public class Student extends User{
    private int age;
    private String mobileNumber;
    private String address;

    public Student(String fName, String lName, String email, String password, int age, String mobileNumber, String address) {
        super(fName, lName, email, password);
        this.age = age;
        this.mobileNumber = mobileNumber;
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void enroll(){
        System.out.println("The student is enrolling ...");
    }

    public void startStudyingProcess(){}
}
