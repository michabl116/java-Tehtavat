package Task_1;
import java.util.Arrays;

public class FunctionalAverage {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        // Laske keskiarvo ilman for-silmukoita
        double average = Arrays.stream(numbers).average().orElse(0);

        System.out.println("Matriisin keskiarvo: " + average);
    }
}