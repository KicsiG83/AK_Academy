import java.util.Set;

public class Person {

    private Set<String> languages;

    public Person(Set<String> languages) {
        this.languages = languages;
        System.out.println(languages);
    }

    public Set<String> getLanguages() {
        return languages;
    }

    public void setLanguages(Set<String> languages) {
        this.languages = languages;
    }
}
