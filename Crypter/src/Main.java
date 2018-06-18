import java.security.NoSuchAlgorithmException;

public class Main {

	public static void main(String[] args) throws NoSuchAlgorithmException {

		String str = "OlMJyBw14BOF0m1esEEV";
		byte[] hash256 = Sha256Crypter.Sha256(str);
		String hash512 = SHA512Crypter.get_SHA_512_SecurePassword(str);
		System.out.println("" + hash256 + "\n" + hash512);
		
		// 369D3CE0EE61B5D3E4192160BC57D51D904C8D5E8748D834142DCFCA044BDC28
		
	}

}
