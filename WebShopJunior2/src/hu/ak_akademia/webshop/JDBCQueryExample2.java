package hu.ak_akademia.webshop;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import hu.ak_akademia.webshop.dto.Product;
import hu.ak_akademia.webshop.dto.Status;
import hu.ak_akademia.webshop.sql.ProductSqlBuilderOpenForSqlInjectionAttack;

public class JDBCQueryExample2 {

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "webshop", "admin");
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(ProductSqlBuilderOpenForSqlInjectionAttack.buildSelectProduct())) {
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

                System.out.println(product);
            }
        } catch (SQLException e) {
            System.err.println("Az adatbázis művelet végrehajtása sikertelen.");
            e.printStackTrace();
        }
    }

}