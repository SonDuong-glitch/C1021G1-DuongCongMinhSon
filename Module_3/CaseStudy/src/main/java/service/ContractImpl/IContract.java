package service.ContractImpl;

import model.Contract;

import java.sql.SQLException;
import java.util.List;

public interface IContract {
    void insertContract(Contract contract) throws SQLException;
    Contract selectContract(int contractId);
    List<Contract> selectAllContract();
    boolean deleteContract(int contractID) throws SQLException;
    boolean editContract(Contract contract) throws SQLException;
}
