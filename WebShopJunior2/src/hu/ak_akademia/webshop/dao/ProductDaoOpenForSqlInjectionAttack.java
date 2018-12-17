package hu.ak_akademia.webshop.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import hu.ak_akademia.webshop.dto.Product;
import hu.ak_akademia.webshop.dto.Status;
import hu.ak_akademia.webshop.sql.ProductSqlBuilderOpenForSqlInjectionAttack;

public class ProductDaoOpenForSqlInjectionAttack extends AbstractDao<Product> {

    @Override
    public void create(Product entity) {
        String insert = ProductSqlBuilderOpenForSqlInjectionAttack.buildInsertProduct(entity);
        try (Connection connection = getConnection(); Statement statement = connection.createStatement()) {
            statement.executeUpdate(insert);
        } catch (SQLException e) {
            System.err.println("A product táblába új rekord beszúrása sikertelen.");
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Product entity) {
    }

    @Override
    public void update(Product from, Product to) {
    }

    @Override
    public List<Product> getAll(int limit) {
        List<Product> products = new ArrayList<>();
        int counter = 0;
        try (Connection connection = getConnection(); Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(ProductSqlBuilderOpenForSqlInjectionAttack.buildSelectProduct())) {
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
        return null;
    }

}