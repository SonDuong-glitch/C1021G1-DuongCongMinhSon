package week2.baitap_lamthem.bai2.model;

public class Student {
    private String id;
    private String name;
    private String dateOfBrith;
    private String gender;
    private String className;
    private String course;

    public Student(String id, String name, String dateOfBrith, String gender, String className, String course) {
        this.id = id;
        this.name = name;
        this.dateOfBrith = dateOfBrith;
        this.gender = gender;
        this.className = className;
        this.course = course;
    }

    public Student() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBrith() {
        return dateOfBrith;
    }

    public void setDateOfBrith(String dateOfBrith) {
        this.dateOfBrith = dateOfBrith;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBrith='" + dateOfBrith + '\'' +
                ", gender='" + gender + '\'' +
                ", className='" + className + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
