import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class HappyBirthday {

	public static void main(String[] args) {
		// Ma d�tum lek�rdez�se �v param�terre cs�kkente String form�tumban
		DateFormat df = new SimpleDateFormat("yyyy");
		Date today = Calendar.getInstance().getTime();
		String currentYear = df.format(today);

		// String form�tum� �v param�ter integerr� konvert�l�sa
		int intCurrentYear = Integer.parseInt(currentYear);

		// Integer form�tum� �vsz�mb�l kivonjuk a sz�let�si �vet, hogy megtudjuk az
		// aktu�lis �vsz�mot
		int birthYear = intCurrentYear - 1955;

		// String-g� visszaalak�tva a d�tum, hogy a t�mb�n bel�l tudjak r� hivatkozni
		String stringBirthYear = String.valueOf(birthYear);

		// Az aktu�lis �vb�l kivonjuk a Ph.D megszerz�s�nek az �v�t
		int previousBirthYear = intCurrentYear - 1983;

		String[] datas = { "James", "Gossling", stringBirthYear,
				" sz�let�snapod alkalm�b�l k�v�nok nagyon Boldog sz�let�snapot!",
				" �ves korodban szerezted a Ph.D-det a Carnegie Mellon University-n, amihez ut�lag is gratul�lok!",
				"Viszl�t! J�v�re Veled ugyanitt" };

		System.out.println("Isten �ltessen " + datas[0] + "!");
		System.out.println(stringBirthYear + datas[3]);
		System.out.println(previousBirthYear + datas[4]);
		System.out.println(datas[datas.length - 1]);

	}

}
