
public class Main {

    public static void main(String[] args) {

        new Main().run();
    }
    
    private void run() {
        Person a = new Person(false);
        Person b = new Person(true);
        letsPlay(a, b);
    }
    
    private void letsPlay(Person a, Person b) {
        System.out.println(a.getNumber());
        int temp = b.getGuess(100);
        int game = -1;
        while(game!=0) {
            System.out.println(temp);
            game = a.getNumber().compareTo(temp);
            if(game ==  1) {
                b.setGuess(temp);
               //ide kell megírni az a kalkulációt, ami az eredeti számból kivonja a tippet és megfelezi azt.
            }else if (game == -1) {
                b.setGuess(temp);
                temp = temp / 2;
            }else {
                game = 0;
            }
        }
        System.out.println(temp);
        System.out.println(a.getNumber().compareTo(temp));
        System.out.println();
    }
}
