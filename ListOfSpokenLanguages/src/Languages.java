import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Languages {

    ENGLISH("Angol"), GERMAN("Német"), ITALIAN("Olasz"), DUTCH("Holland"), CHINA("Kínai"), RUSSIAN("Orosz"), SPANISH("Spanyol"), SWAHILI(
            "Szuahéli"), SWEDISH("Svéd"), GREEK("Görög"), FRENCH("Francia"), JAPANESE("Japán"), LATIN("Latin"), SERBIAN("Szerb"), POLISH("Lengyel");

    private String textual;

    private static final List<Languages> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static Languages randomLanguage() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }

    private Languages(String text) {
        textual = text;
    }

    public String getTextual() {
        return textual;
    }
}
