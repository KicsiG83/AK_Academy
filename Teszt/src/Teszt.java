import java.util.stream.IntStream;

public class Teszt {

	public static void main(String[] args) {
	
		int number = 123456;
		String strNumber = String.valueOf(number);
		int width = 12; 	// 12 char hossz�s�gban hat�rozom meg a sz�mot
		char fill = '0'; 	// 0-val fogom kiegs�z�teni, ha a sz�veg hossza nem �ri el a width-ben megadott �rt�ket  

		strNumber = new String(new char[width - strNumber.length()]).replace('\0', fill) + strNumber; // a fill-ben megadott char-al fogom kieg�sz�teni a sz�veg elej�t!
		
		int xyz;
		int[] sevenArray = new int[4];
		int beginIndexNumber = 3;
		int endIndexNumber = 0;
		int multiplier;
		
		for(int i = 0; i < 4; i++) {
			if(i == 0 || i == 2) {
				multiplier = +1;
			}else {
				multiplier = -1;
			}
			String strFourthThreeDigits = strNumber.substring(strNumber.length() - beginIndexNumber, strNumber.length() - endIndexNumber);
			int intFourthThreeDigits = Integer.parseInt(strFourthThreeDigits);
			sevenArray[i] = intFourthThreeDigits * multiplier;
			beginIndexNumber += 3;
			endIndexNumber += 3;
		}
		
		for(int i = 0; i < 4; i++) {
			System.out.println(sevenArray[i]);
		}
		/*
		String strFourthThreeDigits = strNumber.substring(strNumber.length() - 3, strNumber.length());
		int intFourthThreeDigits = Integer.parseInt(strFourthThreeDigits);
		sevenArray[0] = intFourthThreeDigits;

		String strThirdThreeDigits = strNumber.substring(strNumber.length() - 6, strNumber.length() - 3);
		int intThirdThreeDigits = Integer.parseInt(strThirdThreeDigits);
		sevenArray[1] = intThirdThreeDigits * -1;

		String strSecondThreeDigits = strNumber.substring(strNumber.length() - 9, strNumber.length() - 6);
		int intSecondTreeDigits = Integer.parseInt(strSecondThreeDigits);
		sevenArray[2] = intSecondTreeDigits;

		String strFirstThreeDigits = strNumber.substring(strNumber.length() - 12, strNumber.length() - 9);
		int intFirstThreeDigits = Integer.parseInt(strFirstThreeDigits);
		sevenArray[3] = intFirstThreeDigits * -1;
		*/
		
		int sumNumber = IntStream.of(sevenArray).sum();
		if(sumNumber < 0) {
			sumNumber = sumNumber * -1;
		}
		
		xyz = sumNumber - 7;
		if (sumNumber == 7) {
			
			}
		for (int i = 0; xyz >= 0; i++) {
			xyz = xyz - 7;
			if (xyz == 0) {
			}
		}
	}
}