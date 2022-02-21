package service.CustomerImpl;

import model.Customer;

import java.sql.SQLException;
import java.util.List;

public interface ICustomer {
    void insertUser(Customer customer) throws SQLException;

    Customer selectCustomer(int id);

    List<Customer> selectAllCustomer();

    boolean deleteCustomer(int id) throws SQLException;

    boolean updateCustomer(Customer user) throws SQLException;
}
