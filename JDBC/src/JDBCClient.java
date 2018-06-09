import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCClient {

	public static void uploadClient(String name, String email, String phoneNumber, String type,
			String comment) throws SQLException {
		Connection connection = JDBCConnection.createConnection();
		String upload = "INSERT INTO CLIENT VALUES (client_seq.nextval, ?, ?, ?, ?, ?)";
		try (PreparedStatement clientStatement = connection.prepareStatement(upload)) {
			clientStatement.setString(1, name);
			clientStatement.setString(2, email);
			clientStatement.setString(3, phoneNumber);
			clientStatement.setString(4, type);
			clientStatement.setString(5, comment);
			clientStatement.addBatch();
			clientStatement.executeBatch();
		} catch (SQLException e) {
			System.err.println("Could not upload to client database!");
		}
		connection.close();
	}
}