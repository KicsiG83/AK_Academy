import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {

        List<Person> personList = Arrays.asList(
                new Person(getLanguages(2)), 
                new Person(getLanguages(3)), 
                new Person(getLanguages(4)),
                new Person(getLanguages(5)), 
                new Person(getLanguages(6)));

        List<String> collect = personList
                .stream()
                .map(x -> x.getLanguages())
                .flatMap(x -> x.stream())
                .distinct()
                .collect(Collectors.toList());
        
        System.out.println("\n----------------------------\n");
        collect.forEach(System.out::println);
    }

    private Set<String> getLanguages(int size) {
        Set<String> personLanguages = new TreeSet<>();
        while (personLanguages.size() < size) {
            personLanguages.add(Languages.randomLanguage().getTextual());
        }
        return personLanguages;
    }
}