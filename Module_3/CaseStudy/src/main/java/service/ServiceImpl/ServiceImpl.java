package service.ServiceImpl;

import model.Service;

import java.sql.SQLException;
import java.util.List;

public class ServiceImpl implements IService{
    @Override
    public void insertService(Service service) throws SQLException {

    }

    @Override
    public Service selectService(int id) {
        return null;
    }

    @Override
    public List<Service> selectAllUsers() {
        return null;
    }

    @Override
    public boolean deleteService(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean updateUser(Service service) throws SQLException {
        return false;
    }
}
