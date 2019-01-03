package hu.ak_akademia.userinput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UserInput {

    private List<List<String>> namesList = new ArrayList<>();

    public UserInput() {
    }

    public List<List<String>> getNamesList() {
        return namesList;
    }

    public void getName() {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "A nevek rögzítésekor a vezeték és keresztneveket vesszővel válassza el (Például: Gipsz, Jakab). \nAmennyiben bevitte az összes nevet, nyomjon egy entert.\n");
        String result = "-";
        while (result.length() > 0) {
            System.out.print("Kérem adja meg a rögzítendő neveket: ");
            result = sc.nextLine();
            if (result.length() > 0) {
                namesList.add(fillList(result));
            }
        }
        sc.close();
    }

    private List<String> fillList(String result) {
        String[] names = result.split(", ");
        List<String> tempName = new ArrayList<>();
        List<String> characteredSortedName = new ArrayList<>();
        for (String name : names) {
            char[] letters = new char[name.length()];
            tempName.add(name);
            for(int i = 0; i < name.length(); i++) {
                letters[i] = name.charAt(i);
            }
            Arrays.sort(letters);
            
        }
        return tempName;
    }
}
