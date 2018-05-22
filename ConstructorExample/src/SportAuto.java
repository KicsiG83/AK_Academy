public class SportAuto extends Auto {
 
    {
        System.out.println("SportAuto inicializátora fut 2.");
    }
 
    int coolness = 100;
 
    {
        System.out.println("SportAuto inicializátora fut 1.");
    }
 
    SportAuto() {
        super(5);
        System.out.println("SportAuto 1 konstruktora fut.");
    }
 
    {
        System.out.println("SportAuto inicializátora fut 4.");
    }
 
    SportAuto(int speed) {
        super(speed);
        System.out.println("SportAuto 2 konstruktora fut.");
    }
 
    SportAuto(String coolness) {
        super();
        this.coolness = coolness.length() * 100;
        System.out.println("SportAuto 3 konstruktora fut.");
    }
 
    {
        System.out.println("SportAuto inicializátora fut 3.");
    }
 
}