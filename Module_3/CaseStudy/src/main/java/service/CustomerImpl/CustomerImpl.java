package service.CustomerImpl;

import model.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerImpl implements ICustomer{
    private String jdbcURL = "jdbc:mysql://localhost:3306/casestudy_jsp";
    private String jdbcUsername = "root";
    private String jdbcPassword = "26021998";
    private static final String INSERT_CUSTOMER_SQL = "INSERT INTO customer (customer_code,customer_type_id,customer_name,customer_birthday," +
            " customer_gender, customer_id_card, customer_phone, customer_email, customer_address) VALUES (?,?,?,?,?,?,?,?,?);";
    private static final String SELECT_CUSTOMER_BY_ID_SQL = "SELECT (customer_code,customer_type_id,customer_name,customer_birthday," +
            "             customer_gender, customer_id_card, customer_phone, customer_email, customer_address) from casestudy_jsp.customer WHERE customer_id = ?";
    private static final String SELECT_ALL_CUSTOMER = "SELECT * FROM casestudy_jsp.customer WHERE del_flg = 0;";
    private static final String UPDATE_FLAG = "UPDATE `customer` SET `del_flg` = '1' WHERE `customer_id` = ?;";
    private static final String UPDATE_CUSTOMER_SQL = "UPDATE CUSTOMER SET customer_name = ? , customer_birthday = ? ," +
            " customer_gender = ? , customer_id_card = ? , customer_phone = ? , customer_email = ?, customer_address = ?, customer_type_id = ?";
    public CustomerImpl() {}
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
    public void insertUser(Customer customer) throws SQLException {
        System.out.println(INSERT_CUSTOMER_SQL);
        try {
            Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(INSERT_CUSTOMER_SQL);
                statement.setString(1,customer.getCustomerCode());
                statement.setInt(2, Integer.valueOf(customer.getCustomerTypeId()));
                statement.setString(3,customer.getCustomerName());
                statement.setString(4,customer.getCustomerBirthday());
                statement.setBoolean(5,Boolean.valueOf(customer.isGender()));
                statement.setString(6,customer.getCustomerIdCard());
                statement.setString(7,customer.getCustomerPhone());
                statement.setString(8,customer.getCustomerEmail());
                statement.setString(9,customer.getCustomerAddress());
                System.out.println(statement);
                statement.executeUpdate();
        } catch (SQLException e){
            printSQLException(e);
        }
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }

    @Override
    public Customer selectCustomer(int id) {
        Customer customer = null;
        try (Connection connection = getConnection()) {
            PreparedStatement statement = connection.prepareStatement(SELECT_CUSTOMER_BY_ID_SQL);
            statement.setInt(1,id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                String customerCode = resultSet.getString("customer_code");
                int customerType = resultSet.getInt("customer_type_id");
                String customerName = resultSet.getString("customer_name");
                String customerBirthday = resultSet.getString("customer_birthday");
                boolean customerGender = resultSet.getBoolean("customer_gender");
                String customerIdCard = resultSet.getString("customer_id_card");
                String customerPhone =  resultSet.getString("customer_phone");
                String customerEmail = resultSet.getString("customer_email");
                String customerAddress = resultSet.getString("customer-address");
                customer = new Customer(id,customerCode,customerType,customerName,customerBirthday,customerGender,customerIdCard,customerPhone,customerEmail,customerAddress);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customer;
    }

    @Override
    public List<Customer> selectAllCustomer() {
        List<Customer> customerList = new ArrayList<>();
        try (Connection connection = getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMER);
            System.out.println(preparedStatement);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("customer_id");
                String customerCode = resultSet.getString("customer_code");
                String customerName = resultSet.getString("customer_name");
                String customerBirthday = resultSet.getString("customer_birthday");
                boolean customerGender = resultSet.getBoolean("customer_gender");
                String customerIdCard = resultSet.getString("customer_id_card");
                String customerPhone =  resultSet.getString("customer_phone");
                String customerEmail = resultSet.getString("customer_email");
                String customerAddress = resultSet.getString("customer_address");
                int customerType = resultSet.getInt("customer_type_id");
                customerList.add(new Customer(id,customerCode,customerType,customerName,customerBirthday,customerGender,customerIdCard,customerPhone,customerEmail,customerAddress));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerList;
    }

    @Override
    public boolean deleteCustomer(int id) throws SQLException {
        boolean rowDeleted;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(UPDATE_FLAG)) {
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }

    @Override
    public boolean updateCustomer(Customer customer) throws SQLException {
        boolean rowUpdated;
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(UPDATE_CUSTOMER_SQL);) {
            statement.setString(1,customer.getCustomerCode());
            statement.setString(2, customer.getCustomerName());
            statement.setString(3, customer.getCustomerBirthday());
            statement.setBoolean(4, customer.isGender());
            statement.setString(5, customer.getCustomerIdCard());
            statement.setString(6,customer.getCustomerPhone());
            statement.setInt(7,customer.getCustomerTypeId());
            statement.setString(8,customer.getCustomerEmail());
            statement.setString(9,customer.getCustomerAddress());
            rowUpdated = statement.executeUpdate() > 0;
        }
        return rowUpdated;
    }
}

