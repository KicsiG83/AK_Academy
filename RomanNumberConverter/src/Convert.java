import java.util.TreeMap;

public class Convert {

	public final static TreeMap<Integer, String> arabicToRoman = new TreeMap<Integer, String>();

    static {
        arabicToRoman.put(1000, "M");
        arabicToRoman.put(900, "CM");
        arabicToRoman.put(500, "D");
        arabicToRoman.put(400, "CD");
        arabicToRoman.put(100, "C");
        arabicToRoman.put(90, "XC");
        arabicToRoman.put(50, "L");
        arabicToRoman.put(40, "XL");
        arabicToRoman.put(10, "X");
        arabicToRoman.put(9, "IX");
        arabicToRoman.put(5, "V");
        arabicToRoman.put(4, "IV");
        arabicToRoman.put(1, "I");
    }

    public String toRoman(int number) {
        int l =  arabicToRoman.floorKey(number);
        if ( number == l ) {
        	System.out.print(arabicToRoman.get(l));
            return arabicToRoman.get(number);
        }
        System.out.print(arabicToRoman.get(l));
        return arabicToRoman.get(l) + toRoman(number-l);
    }
}
