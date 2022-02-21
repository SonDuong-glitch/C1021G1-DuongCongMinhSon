package service.EmployeeImpl;

import model.Employee;

import java.sql.SQLException;
import java.util.List;

public class EmployeeImpl implements IEmployee{
    @Override
    public void insertEmployee(Employee employee) throws SQLException {

    }

    @Override
    public Employee selectEmployee(int id) {
        return null;
    }

    @Override
    public List<Employee> selectAllEmployee() {
        return null;
    }

    @Override
    public boolean deleteEmployee(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean updateEmployee(Employee employee) throws SQLException {
        return false;
    }
}
