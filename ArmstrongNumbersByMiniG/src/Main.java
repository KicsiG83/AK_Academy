public class Main {

    private static final long[] TEST_DATA = new long[] { 0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 153L, 370L, 371L, 407L, 1634L, 8208L, 9474L, 54748L,
            92727L, 93084L, 548834L, 1741725L, 4210818L, 9800817L, 9926315L, 24678050L, 24678051L, 88593477L, 146511208L, 472335975L, 534494836L,
            912985153L, 4679307774L, 32164049650L, 32164049651L, 40028394225L, 42678290603L, 44708635679L, 49388550606L, 82693916578L, 94204591914L,
            28116440335967L, 4338281769391371L, 4338281769391370L, 21897142587612075L, 35641594208964132L, 35875699062250035L, 1517841543307505039L,
            3289582984443187032L, 4498128791164624869L };

    public static void main(String[] args) {
        long[] stored = doTheThing(new long[TEST_DATA.length], 0, 0);
        if (check(stored)) {
            System.out.println("yeah, megvan mind");
            for (long s : stored) {
                System.out.println(s);
            }
        } else {
            System.out.println("valamit elböktünk");
        }
    }

    private static long[] doTheThing(long[] stored, int index, long current) {
        if (index == TEST_DATA.length) {
            return stored;
        }
        String currentAsString = String.valueOf(current);
        char[] digits = currentAsString.toCharArray();
        long sum = 0;
        for (char c : digits) {
            sum += Math.pow(Long.valueOf(String.valueOf(c)), (double) digits.length);
        }
        if (sum == current) {
            stored[index] = current;
            index++;
        }
        current += 1;
        return doTheThing(stored, index, current);
    }

    private static boolean check(long[] resultset) {
        for (int i = 0; i < resultset.length; i++) {
            if (resultset[i] != TEST_DATA[i]) {
                return false;
            }
        }
        return true;
    }

}