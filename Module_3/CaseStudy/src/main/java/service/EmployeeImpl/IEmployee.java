package service.EmployeeImpl;

import model.Employee;

import java.sql.SQLException;
import java.util.List;

public interface IEmployee {
    void insertEmployee(Employee employee) throws SQLException;

    Employee selectEmployee(int id);

    List<Employee> selectAllEmployee();

    boolean deleteEmployee(int id) throws SQLException;

    boolean updateEmployee(Employee employee) throws SQLException;

}
