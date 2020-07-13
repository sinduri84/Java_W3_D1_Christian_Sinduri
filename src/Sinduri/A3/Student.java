package Sinduri.A3;

public class Student {

    private String sFirstName;
    private String sLastName;
    private int sYearOfBirth;
    private int sAge;
    private String sClass;

    public Student() {
    }

    public String getsFirstName() {
        return sFirstName;
    }

    public void setsFirstName(String sFirstName) {
        this.sFirstName = sFirstName;
    }

    public String getsLastName() {
        return sLastName;
    }

    public void setsLastName(String sLastName) {
        this.sLastName = sLastName;
    }

    public int getsYearOfBirth() {
        return sYearOfBirth;
    }

    public void setsYearOfBirth(int sYearOfBirth) {
        this.sYearOfBirth = sYearOfBirth;
    }

    public int getsAge() {
        return sAge;
    }

    public void setsAge(int sAge) {
        this.sAge = sAge;
    }

    public String getsClass() {
        return sClass;
    }

    public void setsClass(String sClass) {
        this.sClass = sClass;
    }
}
