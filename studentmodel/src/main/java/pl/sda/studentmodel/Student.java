package pl.sda.studentmodel;

public class Student {
    String name;
    String lastname;
    Integer index;

    public Student(String name, String lastname, Integer index) {
        this.name = name;
        this.lastname = lastname;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Student(){

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", index=" + index +
                '}';
    }
}
