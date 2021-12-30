package case_study.task1.FuramaResort.models.person;

public class Employee extends Person{
    private String employeeCode;
    private String level;
    private String position;
    private double salary;
    public Employee(){}
    public Employee(String employeeCode, String level, String position, double salary) {
        this.employeeCode = employeeCode;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String name, String dateOfBirth, String gender, int ID, int phoneNumber, String email, String employeeCode, String level, String position, double salary) {
        super(name, dateOfBirth, gender, ID, phoneNumber, email);
        this.employeeCode = employeeCode;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString()+
                "employeeCode='" + employeeCode + '\'' +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
