package repository.impl;

import model.Product;
import repository.DBConnection;
import repository.ProductRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductImpl implements ProductRepository {
    private static String SELECT_ALL_PRODUCT = "SELECT * FROM phone ";
    private static String INSERT_PRODUCT = "INSERT INTO `bai_thi`.`phone` ( `product_name`, `price`, `quatily`, `color`, `id_category`) VALUES ( ?, ?, ?,?,?);";
    private static String DELETE_PRODUCT = "delete from phone where id_phone = ?";
    @Override
    public List<Product> findAll() {
        Connection connection = DBConnection.getConnection();
        List<Product> productList = new ArrayList<>();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(SELECT_ALL_PRODUCT);
                resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    int idProduct = resultSet.getInt("id_phone");
                    String nameProduct = resultSet.getString("product_name");
                    double price = Double.parseDouble(resultSet.getString("price"));
                    double quatily = Double.parseDouble(resultSet.getString("quatily"));
                    String color = resultSet.getString("color");
                    String idCategory = resultSet.getString("id_category");
                    productList.add(new Product(idProduct, nameProduct, price, quatily, color, idCategory));
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
        return productList;
    }

    @Override
    public void create(Product product) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = null;
        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(INSERT_PRODUCT);
                preparedStatement.setString(1,product.getNameOfProduct());
                preparedStatement.setDouble(2,product.getPrice());
                preparedStatement.setDouble(3,product.getQuantity());
                preparedStatement.setString(4,product.getColor());
                preparedStatement.setString(5,product.getCategory());
                preparedStatement.executeUpdate();
            }catch (SQLException e){
                e.printStackTrace();
            }finally {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }

    @Override
    public void delete(int id) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = null;
        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(DELETE_PRODUCT);
                preparedStatement.setInt(1,id);
                preparedStatement.executeUpdate();
            }catch (SQLException e){
                e.printStackTrace();
            }finally {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }

    @Override
    public void edit(int id) {

    }

    @Override
    public void search(int id) {

    }
}
