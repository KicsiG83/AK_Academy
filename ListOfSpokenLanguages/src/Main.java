import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    private Set<String> fullSpokenLanguages = new TreeSet<>();

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {

        collectLanguages(new Person(getLanguages(2)));
        collectLanguages(new Person(getLanguages(3)));
        collectLanguages(new Person(getLanguages(4)));
        collectLanguages(new Person(getLanguages(5)));
        collectLanguages(new Person(getLanguages(6)));

        System.out.println("\nBeszélt nyelvek listája: ");
        fullSpokenLanguages.stream().forEach(System.out::println);

    }

    private Set<String> getLanguages(int size) {
        Set<String> personLanguages = new TreeSet<>();
        while (personLanguages.size() < size) {
            personLanguages.add(Languages.randomLanguage().getTextual());
        }
        return personLanguages;
    }

    private void collectLanguages(Person person) {
        List<String> personSpokenLanguagesList = new ArrayList<>();
        personSpokenLanguagesList.addAll(person.getLanguages());
        for (String language : personSpokenLanguagesList) {
            fullSpokenLanguages.add(language);
        }
    }

}
