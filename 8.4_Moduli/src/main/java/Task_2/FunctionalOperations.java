package Task_2;

import java.util.List;

public class FunctionalOperations {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 5, 8, 20, 15, 3, 12);

        // Suodata parittomat numerot, kaksinkertaista jäljelle jääneet ja laske summa
        int result = numbers.stream()
                .filter(n -> n % 2 != 0)  // Suodata parittomat numerot
                .map(n -> n * 2)          // Kaksinkertaista jokainen jäljelle jäänyt numero
                .reduce(0, Integer::sum); // Laske yhteen muunnetut numerot

        System.out.println("Muunnettujen numeroiden summa: " + result);
    }
}
