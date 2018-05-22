public class Auto {
 
    int speed = 10;
 
    {
        System.out.println("Példány inicializátor fut 1.");
    }
 
    Auto() {
        super();
        System.out.println("Konstruktor 1 fut.");
    }
 
    {
        System.out.println("Példány inicializátor fut 3.");
    }
 
    Auto(int speed) {
        this();
        System.out.println("Konstruktor 2 fut.");
        this.speed = speed;
    }
 
    {
        System.out.println("Példány inicializátor fut 2.");
    }
 
}