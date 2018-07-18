import java.util.Arrays;
 
public class RegexSplitExamples {
    public static void main(String[] args) {
        new RegexSplitExamples().run();
    }
 
    private void run() {
        // A Stringeknek van egy split nevű metódusa, amiben reguláris kifejezéseket is meg lehet adni (regex)
        String text = "alfa-béta-gamma-delta";
        // formátuma többféle lehet: egyik varáció, hogy csak egy sima String-et adsz meg delimiterként
        // ez a metódus most a kötőjelek mentén feldarabolja a stringet, és beteszi az elemeket egy tömbbe
        String[] textArray = text.split("-");
        System.out.println(Arrays.toString(textArray));
         
        String anotherText = "alfa-béta+gamma@delta";
        // akár több delimitert is meg lehet adni a regexkben, ezeket egy kapcsos zárójelbe, egymás mellé írjuk elválasztójel nélkül
        // most egy adott stringet feldarabolunk az alábbi karakterek bármelyike mentén: - + @
        String[] anotherTextArray = anotherText.split("[-+@]");
        System.out.println(Arrays.toString(anotherTextArray));
         
        // speciális formátum még, amikor zárójelben adunk meg regex formátumot. Ezzel megőrizhetjük a delimitert (elválasztó) is
        // most azt csináljuk, hogy a kötőjelek mentén feldaraboljuk a stringet, de úgy hogy a kötőjelek az utánuk jövő szórészlet előtt maradjanak
        String[] textArray2 = text.split("(?=-)");
        System.out.println(Arrays.toString(textArray2));
         
        // természetesen azt is meg lehet oldani, hogy az elválasztó karakter az azt megelőző szórészlet végén maradjon
        String[] textArray3 = text.split("(?<=-)");
        System.out.println(Arrays.toString(textArray3));
         
        // amennyiben az előző kettőt kombináljuk, úgy maga az elválasztó is egy külön elem lesz a tömbben
        // itt az történik, hogy az elválasztót elválasztjuk az előtte, és az utána lévő szórészlettől is
        String[] textArray4 = text.split("(?=-)|(?<=-)");
        System.out.println(Arrays.toString(textArray4));
         
        String yetAnotherText = "EzEgySzövegRész";
        // egy szöveget szétszedhetünk akár úgy is, hogy a nagybetűs részek legyenek külön elemek
        // itt az történik, hogy a nagybetűk mentén daraboljuk fel a szöveget, úgy hogy a kisbetűs részek a nagybetűs rész után maradjanak
        String[] textArray5 = yetAnotherText.split("(?<=[a-z])(?=[A-Z])");
        System.out.println(Arrays.toString(textArray5));
         
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        // az is egy lehetséges opció, hogy bizonyos számú karakterenként szeretnénk szétdarabolni egy szöveget
        // a következő regex formáutm erre ad lehetőséget: négy karakterenként darabolja fel a szöveget
        String[] alphabetArray = alphabet.split("(?<=\\G.{4})");
        System.out.println(Arrays.toString(alphabetArray));
    }
 
}