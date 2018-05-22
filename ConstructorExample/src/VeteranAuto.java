public class VeteranAuto extends SportAuto {
 
    String name;
 
    {
        System.out.println("VeteranAuto inicializátora fut 3.");
    }
 
    VeteranAuto() {
        System.out.println("VeteranAuto 1 konstruktora fut.");
    }
 
    VeteranAuto(int speed) {
        super(speed);
        System.out.println("VeteranAuto 2 konstruktora fut.");
    }
 
    {
        System.out.println("VeteranAuto inicializátora fut 1.");
    }
 
    VeteranAuto(String coolness) {
        super(coolness);
        System.out.println("VeteranAuto 3 konstruktora fut.");
    }
 
    VeteranAuto(double coolness, double moreCoolness) {
        this((int) coolness + (int) moreCoolness);
        System.out.println("VeteranAuto 4 konstruktora fut.");
    }
 
    {
        System.out.println("VeteranAuto inicializátora fut 2.");
    }
 
}