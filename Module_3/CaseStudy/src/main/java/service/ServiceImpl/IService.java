package service.ServiceImpl;

import model.Service;

import java.sql.SQLException;
import java.util.List;

public interface IService {
    void insertService(Service service) throws SQLException;

    Service selectService(int id);

    List<Service> selectAllUsers();

    boolean deleteService(int id) throws SQLException;

    boolean updateUser(Service service) throws SQLException;
}
