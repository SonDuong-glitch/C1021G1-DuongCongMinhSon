package thithu.models;

public class Teacher extends Person{
    private String teacherId;
    private String specialize;

    public Teacher() {
    }

    public Teacher(String name, String dateOfBirth, String gender) {
        super(name, dateOfBirth, gender);
    }

    public Teacher(String teacherId, String specialize) {
        this.teacherId = teacherId;
        this.specialize = specialize;
    }

    public Teacher(String name, String dateOfBirth, String gender, String teacherId, String specialize) {
        super(name, dateOfBirth, gender);
        this.teacherId = teacherId;
        this.specialize = specialize;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId='" + teacherId + '\'' +
                ", specialize='" + specialize + '\'' +
                '}';
    }
}
