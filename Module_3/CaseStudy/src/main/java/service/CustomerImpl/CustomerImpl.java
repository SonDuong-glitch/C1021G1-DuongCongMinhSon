package service.CustomerImpl;

import model.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerImpl implements ICustomer{
    private String jdbcURL = "jdbc:mysql://localhost:3306/user_manager?allowPublicKeyRetrieval=true&useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "26021998";
    private static final String INSERT_CUSTOMER_SQL = "INSERT INTO customer (customer_code,customer_type_id,customer_birthday," +
            " customer_gender, customer_id_card, customer_phone, customer_email, customer_address) VALUES (?,?,?,?,?,?,?,?,?) ";
    private static final String SELECT_CUSTOMER_BY_ID_SQL = "SELECT customer_code,customer_type_id,customer_birthday,\" +\n" +
            "            \" customer_gender, customer_id_card, customer_phone, customer_email, customer_address WHERE CUSTOMER_CODE = ?";
    private static final String SELECT_ALL_CUSTOMER = "SELECT * FROM casestudy_jsp.customer";
    private static final String DELETE_CUSTOMER_SQL = "DELETE FROM CUSTOMER WHERE CUSTOMER_CODE = ? ";
    private static final String UPDATE_CUSTOMER_SQL = "UPDATE CUSTOMER SET CUSTOMER_NAME = ? , CUSTOMER_BIRTHDAY = ? ," +
            " CUSTOMER_GENDER = ? , CUSTOMER_ID_CARD = ? , CUSTOMER_PHONE = ? , CUSTOMER_EMAIL = ?, CUSTOMER_ADDRESS = ?, CUSTOMER_TYPE_ID = ?";
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
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(INSERT_CUSTOMER_SQL)){
            statement.setString(1,customer.getCustomerName());
            statement.setString(2, String.valueOf(customer.getCustomerBirthday()));
            statement.setString(3, String.valueOf(customer.isGender()));
            statement.setString(4,customer.getCustomerIdCard());
            statement.setString(5,customer.getCustomerPhone());
            statement.setString(6,customer.getCustomerEmail());
            statement.setString(7,customer.getCustomerAddress());
            statement.setString(8, String.valueOf(customer.getCustomerTypeId()));
            System.out.println(statement);
        }catch (SQLException e){
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
                String customerCode = resultSet.getString("CUSTOMER_CODE");
                String customerName = resultSet.getString("CUSTOMER_NAME");
                String customerBirthday = resultSet.getString("CUSTOMER_BIRTHDAY");
                boolean customerGender = resultSet.getBoolean("CUSTOMER_GENDER");
                String customerIdCard = resultSet.getString("CUSTOMER_ID_CARD");
                String customerPhone =  resultSet.getString("CUSTOMER_PHONE");
                String customerEmail = resultSet.getString("CUSTOMER_EMAIL");
                String customerAddress = resultSet.getString("CUSTOMER_ADDRESS");
                int customerType = resultSet.getInt("CUSTOMER_TYPE_ID");
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
        return false;
    }

    @Override
    public boolean updateCustomer(Customer user) throws SQLException {
        return false;
    }
}
