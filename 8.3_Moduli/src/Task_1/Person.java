package Task_1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person {
    String name;
    int age;
    String city;

    // Konstruktori
    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    // Metodi henkilön tietojen näyttämiseen
    @Override
    public String toString() {
        return name + " (" + age + ") - " + city;
    }
}
 class LambdaSortingFiltering {
    public static void main(String[] args) {
        // 1. Luo lista Person-olioista
        List<Person> people = new ArrayList<>();
        people.add(new Person("Carlos", 30, "New York"));
        people.add(new Person("Ana", 25, "Los Angeles"));
        people.add(new Person("Bruno", 35, "New York"));
        people.add(new Person("Daniel", 28, "Chicago"));
        people.add(new Person("Elena", 22, "New York"));

        System.out.println("Alkuperäinen lista:");
        people.forEach(System.out::println);

        // 2. Järjestä iän mukaan käyttäen Comparatoria ja lambdaa
        Collections.sort(people, (p1, p2) -> Integer.compare(p1.age, p2.age));
        System.out.println("\nJärjestetty iän mukaan:");
        people.forEach(System.out::println);

        // 3. Suodata kaupungin mukaan (vain New York) käyttäen removeIf()
        people.removeIf(p -> !p.city.equals("New York"));
        System.out.println("\nSuodatettu (vain henkilöt New Yorkista):");
        people.forEach(System.out::println);
    }
}