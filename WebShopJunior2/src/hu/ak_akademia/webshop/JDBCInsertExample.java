package hu.ak_akademia.webshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsertExample {

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "webshop", "admin"); Statement statement = connection.createStatement()) {
            StringBuilder sql = new StringBuilder();
            sql.append("INSERT INTO product ( ");
            sql.append("    product_id, ");
            sql.append("    product_name, ");
            sql.append("    price, ");
            sql.append("    creation_date, ");
            sql.append("    modification_date ");
            sql.append(") VALUES ( ");
            sql.append("    product_seq.nextval, ");
            sql.append("    '1 kg cukor', ");
            sql.append("    285, ");
            sql.append("    to_date('2018.11.03.12:00:00', 'YYYY.MM.DD.HH24:MI:SS'), ");
            sql.append("    sysdate - 1 ");
            sql.append(") ");
            statement.execute(sql.toString());
            System.out.println("A termék rögzítése az adatbázisba sikeresen megtörtént.");
        } catch (SQLException e) {
            System.err.println("Az adatbázis művelet végrehajtása sikertelen.");
            e.printStackTrace();
        }
    }

}