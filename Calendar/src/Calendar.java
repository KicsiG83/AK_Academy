
public class Calendar {

	public static void main(String[] args) {

		String[][] tomb = {
				{"	      |","		H�tf�      "," |	    Kedd         ","|	       Szerda           ","|     Cs�t�rt�k      ","|	     P�ntek        ","|	  Szombat       ","|	Vas�rnap     |\n"},
				{" 6:00 - 7:00  |"," Bund�st s�t�ltatni  ","| Bund�st s�t�ltatni ","|      Bund�st s�t�ltatni      ","| Bund�st s�t�ltatni ","| Bund�st s�t�ltatni  ","| Bund�st s�t�ltatni ","| Bund�st s�t�ltatni |\n"},
				{" 7:00 - 8:00  |","                     ","|                    ","|                              ","|                    ","|                     ","|                    ","|                    |\n"},
				{" 8:00 - 9:00  |","                     ","|                    ","|                              ","|                    ","|                     ","|     Kir�ndul�s     ","|                    |\n"},
				{" 9:00 - 10:00 |","aut�t szervizbe vinni","|                    ","|                              ","|                    ","|                     ","|     Kir�ndul�s     ","|                    |\n"},
				{"10:00 - 11:00 |","                     ","|   eb�det f�zni     ","|                              ","|                    ","|                     ","|     Kir�ndul�s     ","|                    |\n"},
				{"11:00 - 12:00 |","                     ","|                    ","|                              ","|                    ","|                     ","|     Kir�ndul�s     ","|                    |\n"},
				{"12:00 - 13:00 |","                     ","|                    ","|                              ","|                    ","|                     ","|     Kir�ndul�s     ","|                    |\n"},
				{"13:00 - 14:00 |","                     ","|                    ","|sz�m�t�g�p alkatr�szt rendelni","|                    ","|                     ","|     Kir�ndul�s     ","|                    |\n"},
				{"14:00 - 15:00 |","                     ","|                    ","|                              ","|                    ","|                     ","|     Kir�ndul�s     ","|        mozi        |\n"},
				{"15:00 - 16:00 |","                     ","|                    ","|                              ","|                    ","|                     ","|     Kir�ndul�s     ","|        mozi        |\n"},
				{"16:00 - 17:00 |","                     ","|                    ","|                              ","|                    ","|                     ","|     Kir�ndul�s     ","|        mozi        |\n"},
				{"17:00 - 18:00 |","                     ","|                    ","|                              ","|                    ","| vacsor�t k�sz�teni  ","|                    ","|                    |\n"},
				{"18:00 - 19:00 |"," Bund�st s�t�ltatni  ","| Bund�st s�t�ltatni ","|      Bund�st s�t�ltatni      ","| Bund�st s�t�ltatni ","| Bund�st s�t�ltatni  ","| Bund�st s�t�ltatni ","| Bund�st s�t�ltatni |\n"}
				};
		
		for(String[] aTomb : tomb) {
			for(String anTomb : aTomb) {
				System.out.print(anTomb);
			}
		}
	}
}
