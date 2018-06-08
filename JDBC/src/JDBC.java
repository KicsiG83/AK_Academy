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
