package Models;

public class Student {
    private int age;
    private int mobileNumber;
    private String address;

    public Student(int age, int mobileNumber, String address) {
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

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
