package thithu.phan1.models;

public class Student extends Person{
    private String studentId;
    private String className;
    private String point;

    public Student() {
    }

    public Student(String name, String dateOfBirth, String gender) {
        super(name, dateOfBirth, gender);
    }

    public Student(String name, String dateOfBirth, String gender, String studentId, String className, String point) {
        super(name, dateOfBirth, gender);
        this.studentId = studentId;
        this.className = className;
        this.point = point;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", className='" + className + '\'' +
                ", point='" + point + '\'' +
                '}';
    }
}
