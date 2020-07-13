package ChristianA3;

public class Student {

    private String name;
    private String surname;
    private int born;
    private String schoolClass;

    public int getBorn() {
        return born;
    }

    public void setBorn(int born) {
        this.born = born;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(String schoolClass) {
        this.schoolClass = schoolClass;
    }


    public Student() {
    }
    public void displayStudent(){

        System.out.println("\n"+name+" "+surname+", born in " + born +", age "+ (2020 -born )+ ", goes to class "+schoolClass+"." );

    }

}
