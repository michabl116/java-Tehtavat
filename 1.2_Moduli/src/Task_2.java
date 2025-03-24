import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Kolmion jalkojen lukeminen
        System.out.println("Enter the first leg of the triangle ");
        double a = sc.nextDouble();
        System.out.println("Enter the second leg of the triangle ");
        double b = sc.nextDouble();

        //Hypotenuusan laskeminen
        double hypotenuse = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        //Hypotenuusa on painettu kahden desimaalin tarkkuudella.
        System.out.printf("Hypotenuse %.2f%n" , hypotenuse);
    }
}
