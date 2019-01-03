package hu.ak_akademia.main;

import hu.ak_akademia.userinput.UserInput;

//    1.  Lexikografikus sorrendbe    vezetéknév  keresztnév
//    2.  Lexikografikus sorrendbe    keresztnév  vezetéknév
//    3.  Fordított lexikografikus sorrendbe  vezetéknév  keresztnév
//    4.  Fordított lexikografikus sorrendbe  keresztnév  vezetéknév
//    5.  Nevek teljes hosszúsága alapján növekvő sorrendbe   teljes név hossza   
//    6.  Nevek teljes hosszúsága alapján csökkenő sorrendbe  teljes név hossza

public class Main {

    public static void main(String[] args) {
        // UserInput ui = new UserInput();
        // ui.getName();
        // System.out.println(ui.getNamesList());

        String strPrice = "15,290";
        String strMultiplier = "1,15";

        double bsPrice = Double.parseDouble(strPrice.replace(",", "."));
        double bsMultiplier = Double.parseDouble(strMultiplier.replace(",", "."));

        double multi = bsPrice * bsMultiplier;

        System.out.println(multi);

        System.out.println(round(17.583499999999997, 4));
        
        String alma = "17.583499999999997";
        System.out.println("alma ---->> " + alma);
        alma = alma.substring(0, alma.length()-1);
        System.out.println("szeletelt alma ---->> " + alma);

    }

    private static double round(double value, int places) {
        if (places < 0)
            throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}
