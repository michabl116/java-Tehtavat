package Task_2;
import java.util.ArrayList;
import java.util.List;

public class LambdaCollectionOperations {
    public static void main(String[] args) {
        // 1. Luo lista kokonaisluvuista
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(8);
        numbers.add(20);
        numbers.add(15);
        numbers.add(3);
        numbers.add(12);

        System.out.println("Alkuperäinen lista: " + numbers);

        // 2. Suodata parilliset luvut käyttäen removeIf()
        List<Integer> evenNumbers = new ArrayList<>(numbers);
        evenNumbers.removeIf(n -> n % 2 != 0); // Poistaa parittomat luvut
        System.out.println("Parilliset luvut: " + evenNumbers);

        // 3. Kaksinkertaista parittomat luvut käyttäen replaceAll()
        List<Integer> oddNumbers = new ArrayList<>(numbers);
        oddNumbers.replaceAll(n -> (n % 2 != 0) ? n * 2 : n);
        System.out.println("Parittomat luvut kaksinkertaistettu: " + oddNumbers);

        // 4. Laske lukujen summa käyttäen forEach()
        final int[] sum = {0}; // Käytetään taulukkoa arvon muuttamiseen lambdan sisällä
        numbers.forEach(n -> sum[0] += n);
        System.out.println("Lukujen summa: " + sum[0]);
    }
}