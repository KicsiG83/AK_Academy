package hu.ak_akademia.webshop;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCQueryExample {

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "webshop", "admin"); Statement statement = connection.createStatement()) {
            String sql = "SELECT product_id, product_name, price, creation_date, modification_date, status FROM product";
            try (ResultSet resultSet = statement.executeQuery(sql)) {
                while (resultSet.next()) {
                    int productId = resultSet.getInt("product_id");
                    String productName = resultSet.getString("product_name");
                    int price = resultSet.getInt("price");
                    Date creationDate = resultSet.getDate("creation_date");
                    Date modificationDate = resultSet.getDate("modification_date");
                    String status = resultSet.getString("status");

                    System.out.print("ID: " + productId);
                    System.out.print(", Name: " + productName);
                    System.out.print(", Price: " + price);
                    System.out.print(", Created: " + creationDate);
                    System.out.print(", Modified: " + modificationDate);
                    System.out.print(", Status: " + status);
                    System.out.println();
                }
            }
        } catch (SQLException e) {
            System.err.println("Az adatbázis művelet végrehajtása sikertelen.");
            e.printStackTrace();
        }
    }

}