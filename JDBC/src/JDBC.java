<<<<<<< HEAD:GetCurrency/src/JDBC.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] args) throws SQLException {

		connect();
	}

	private static void connect() throws SQLException {
		String sqlSelect = "SELECT A.CUSTOMER, A.ACCOUNT_PAYOFF_TYPE FROM HUGO.ACCOUNT A WHERE A.ACCOUNT_ID = '2326080'";
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//10.10.101.20:1521/HUGODEV", "HUGO", "dba");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sqlSelect);
		while (rs.next()) {
			System.out.println("Ügyfélszám: "+rs.getString(1) + "\nSzámla fizetés státusza: " + rs.getString(2));
		}
	}
}
=======
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] args) throws SQLException {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "patient_manager", "admin");
			String SQL = "SELECT A.NAME, A.PASSWORD FROM USER_DATA A WHERE A.USER_ID = '1'";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(SQL);
			while (rs.next()) {
				System.out.println("Ez itt a válasz: " + rs.getString(1) + "\n" + rs.getString(2));
				System.out.println("Ez itt a getRow: " + rs.getRow());
			}
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Hiba: " + e.getMessage());
		}
	}
}
>>>>>>> master:JDBC/src/JDBC.java
