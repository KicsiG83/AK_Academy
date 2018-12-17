package hu.ak_akademia.webshop.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import hu.ak_akademia.webshop.dto.Product;
import hu.ak_akademia.webshop.dto.Status;
import hu.ak_akademia.webshop.exception.WebShopRuntimeException;
import hu.ak_akademia.webshop.sql.ProductSqlBuilder;

public class ProductDao extends AbstractDao<Product> {

    @Override
    public void create(Product entity) {
        String insert = ProductSqlBuilder.buildInsertProduct();
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(insert)) {
            preparedStatement.setString(1, entity.getName());
            preparedStatement.setInt(2, entity.getPrice());
            preparedStatement.setDate(3, new java.sql.Date(entity.getCreated()
                    .getTime()));
            preparedStatement.setDate(4, new java.sql.Date(entity.getModified()
                    .getTime()));
            preparedStatement.setString(5, entity.getStatus()
                    .getCode());

            preparedStatement.execute();
        } catch (SQLException e) {
            System.err.println("A product táblába új rekord beszúrása sikertelen.");
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Product entity) {
        String sql = ProductSqlBuilder.buildDeleteProduct();
        int id = entity.getId();
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.execute();
        } catch (SQLException e) {
            System.err.println("A product táblában a rekord logikai törlése sikertelen.");
            e.printStackTrace();
        }
    }

    @Override
    public void update(Product from, Product to) {
        String sql = ProductSqlBuilder.buildUpdateProduct();
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, to.getName());
            statement.setInt(2, to.getPrice());
            statement.setString(3, to.getStatus()
                    .getCode());
            statement.setInt(4, from.getId());
            statement.execute();
        } catch (SQLException e) {
            System.err.println("A product táblában a rekord frissítése sikertelen.");
            e.printStackTrace();
        }
    }

    @Override
    public List<Product> getAll(int limit) {
        List<Product> products = new ArrayList<>();
        int counter = 0;
        try (Connection connection = getConnection(); Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(ProductSqlBuilder.buildSelectProduct())) {
            while (resultSet.next()) {
                int productId = resultSet.getInt("product_id");
                String productName = resultSet.getString("product_name");
                int price = resultSet.getInt("price");
                Date creationDate = resultSet.getDate("creation_date");
                Date modificationDate = resultSet.getDate("modification_date");
                String statusCode = resultSet.getString("status");

                Product product = new Product();
                product.setId(productId);
                product.setName(productName);
                product.setPrice(price);
                product.setCreated(new java.util.Date(creationDate.getTime()));
                product.setModified(new java.util.Date(modificationDate.getTime()));
                product.setStatus(Status.getFromCode(statusCode));

                products.add(product);

                if (++counter >= limit) {
                    break;
                }
            }
        } catch (SQLException e) {
            System.err.println("A product táblán végrehajtott lekérdezés sikertelen.");
            e.printStackTrace();
        }
        return products;
    }

    @Override
    public Product getById(Product entity) {
        String sql = ProductSqlBuilder.buildGetByIdSelect();
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, entity.getId());
            try (ResultSet resultSet = statement.executeQuery()) {
                boolean hasNext = resultSet.next();
                if (!hasNext) {
                    throw new NoSuchElementException("Ilyen azonosítóval nem létezik termék.");
                }
                Product result = new Product();
                result.setId(resultSet.getInt("product_id"));
                result.setName(resultSet.getString("product_name"));
                result.setPrice(resultSet.getInt("price"));
                result.setCreated(resultSet.getDate("creation_date"));
                result.setModified(resultSet.getDate("modification_date"));
                result.setStatus(Status.getFromCode(resultSet.getString("status")));
                return result;
            }
        } catch (SQLException e) {
            throw new WebShopRuntimeException("A product táblából az azonosító alapján történő lekérdezés sikertelen.", e);
        }
    }

}