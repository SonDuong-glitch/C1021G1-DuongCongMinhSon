package service.ContractImpl;

import model.Contract;

import java.sql.*;
import java.util.List;

public class ContractImpl implements IContract{
    private String jdbcURL = "jdbc:mysql://localhost:3306/user_manager?allowPublicKeyRetrieval=true&useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "26021998";
    private static final String INSERT_Contract_SQL = "INSERT INTO " +
            " (contract_start_date, contract_end_day," +
            "contract_deposit,employee_id,customer_id,service_id) VALUES (?, ?, ?, ?, ?, ?);";
    private static final String SELECT_CONTRACT_BY_ID = "select contract_start_day,contract_end_day,contract_deposit,employee_id," +
            "customer_id,service_id from contract where contract_id  = ?";
    private static final String SELECT_ALL_USERS = "select * from users";
    private static final String DELETE_USERS_SQL = "delete from users where id = ?;";
    private static final String UPDATE_USERS_SQL = "update users set name = ?,email= ?, country =? where id = ?;";
    private static final String SORT_USER_BY_NAME_SQL = "select * from users order by name";
    protected Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    @Override
    public void insertContract(Contract contract) throws SQLException {
        System.out.println(INSERT_Contract_SQL);
        try(Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(INSERT_Contract_SQL)) {
            statement.setString(1, String.valueOf(contract.getContractStartDate()));
            statement.setString(2, String.valueOf(contract.getContractEndDate()));
            statement.setString(3, String.valueOf(contract.getContractDeposit()));
            statement.setString(4, String.valueOf(contract.getEmployeeId()));
            statement.setString(5, String.valueOf(contract.getCustomerId()));
            statement.setString(6,String.valueOf(contract.getServiceId()));
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
    public Contract selectContract(int contractId) {
        Contract contract = null;
        try (Connection connection = getConnection()) {
            PreparedStatement statement = connection.prepareStatement(SELECT_CONTRACT_BY_ID);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                String startDay = resultSet.getString("contract_start_day");
                String endDay = resultSet.getString("contract_end_day");
                String contractDeposit = resultSet.getString("contract_deposit");
                String employeeId = resultSet.getString("employee_id");
                String customerId = resultSet.getString("customer_id");
                String serviceId = resultSet.getString("service_id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contract;
    }

    @Override
    public List<Contract> selectAllContract() {
        return null;
    }
    @Override
    public boolean deleteContract(int contractID) throws SQLException {
        return false;
    }

    @Override
    public boolean editContract(Contract contract) throws SQLException {
        return false;
    }
}
