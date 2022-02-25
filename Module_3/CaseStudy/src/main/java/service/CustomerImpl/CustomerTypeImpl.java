package service.CustomerImpl;

import model.Customer_Type;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerTypeImpl implements ICustomerType {
    private String jdbcURL = "jdbc:mysql://localhost:3306/casestudy_jsp";
    private String jdbcUsername = "root";
    private String jdbcPassword = "26021998";
    private static String SELECT_ALL_CUSTOMER_TYPE= "SELECT * FROM customer_type";
    protected Connection getConnection(){
        Connection connection = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    @Override
    public List<Customer_Type> findAll() {
        Connection connection = getConnection();
        List<Customer_Type> customerList = new ArrayList<>();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMER_TYPE);
                resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    int idCustomerType = resultSet.getInt("customer_type_id");
                    String nameCustomerType = resultSet.getString("customer_type_name");
                    customerList.add(new Customer_Type(idCustomerType, nameCustomerType));
                }

            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return customerList;
    }
}
