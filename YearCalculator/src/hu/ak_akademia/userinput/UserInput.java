package hu.ak_akademia.userinput;

import java.util.Scanner;

public class UserInput {

    private String birthDate;

    public UserInput() {
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adja meg a születési dátumát (yyyyMMdd): ");
        birthDate = sc.nextLine();
        sc.close();
    }

}
