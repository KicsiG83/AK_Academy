import java.util.Scanner;
 
public class PrimeNumberChecker {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("K�rem, adjon meg egy sz�mot: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println("A megadott sz�m: " + number);
        if (isPrime(number)) {
            System.out.println("Ez egy pr�msz�m.");
        } else {
            System.out.println("Ez egy �sszetett sz�m.");
        }
        scanner.close();
    }
 
    static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int possibleDivisor = 2; possibleDivisor < number; possibleDivisor++) {
            if (number % possibleDivisor == 0) {
                return false;
            }
        }
        return true;
    }
 
}