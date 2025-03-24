import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit: ");
        int fahrenheit = sc.nextInt();
        //vaihta celsius
         double celsius = (fahrenheit - 32) * 5.0 / 9.0;


         System.out.println("Temperature Fahrenheit " + fahrenheit + "F");
         //printa terminali   uhden decimali
         System.out.printf("Temperature Celsius %.1fC%n" , celsius );

    }
}
