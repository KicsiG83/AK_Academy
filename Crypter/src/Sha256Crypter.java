import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Sha256Crypter {
	
	public static byte[] Sha256(String str) throws NoSuchAlgorithmException {
		MessageDigest digest = MessageDigest.getInstance("SHA-256");
		byte[] hash = digest.digest(str.getBytes(StandardCharsets.UTF_8));
		return hash;
	}

}
