package repository.impl;

import model.TypeProduct;
import repository.DBConnection;
import repository.ProductTypeReponsitory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TypeProductImpl implements ProductTypeReponsitory {
    private static String SELECT_ALL_PRODUCT_TYPE = "SELECT * FROM phone ";
    @Override
    public List<TypeProduct> findAll() {
        Connection connection = DBConnection.getConnection();
        List<TypeProduct> typeProducts = new ArrayList<>();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(SELECT_ALL_PRODUCT_TYPE);
                resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    int idProduct = resultSet.getInt("id_category");
                    String categoryName = resultSet.getString("category_detail");
                    typeProducts.add(new TypeProduct(idProduct,categoryName));
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
        return typeProducts;
    }
}
