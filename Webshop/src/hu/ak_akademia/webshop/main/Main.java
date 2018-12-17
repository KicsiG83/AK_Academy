package hu.ak_akademia.webshop.main;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String loginName = "WEBSHOP";
	private String password = "ADMIN";
	private String query = "select * from product";
	private StringBuilder insert = new StringBuilder();

	public static void main(String[] args) {

		new Main().run();
	}
	public void run() {
		insert.append("INSERT INTO product(");
		insert.append(" product_id, ");
		insert.append("product_name, ");
		insert.append("price, ");
		insert.append("X__INSDATE, ");
		insert.append("X__MODDATE, ");
		insert.append("STATUS )");
		insert.append("VALUES (");
		insert.append(" PRODUCT_SEQ.NEXTVAL, ");
		insert.append("'guminő', ");
		insert.append("'5000', ");
		insert.append("sysdate, ");
		insert.append("sysdate, ");
		insert.append("'A') ");

		try {
			Connection connetion = DriverManager.getConnection(url, loginName, password);
			Statement statement = connetion.createStatement();
//			statement.execute(insert.toString());
			try(ResultSet rs = statement.executeQuery(query)){
				while(rs.next()) {
					int product_id = rs.getInt("product_id");
					String product_name = rs.getString("product_name");
					int price = rs.getInt("price");
					Date x__insdate = rs.getDate("X__INSDATE");
					Date x__moddate = rs.getDate("X__MODDATE");
					String status = rs.getString("STATUS");
					System.out.print("ID: " + product_id);
					System.out.print(", Name: " + product_name);
					System.out.print(", Price: " + price);
					System.out.print(", Created : " + x__insdate);
					System.out.print(", Modified: " + x__moddate);
					System.out.print(", Status: " + status);
					System.out.println();
				}
			}
		} catch (SQLException e) {
			System.out.println("sikertelen.");
			e.printStackTrace();
		}
	}
}
