import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Quadratic Equation");
        System.out.println(" ");
        // pyydä  yhtälökertoimia
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first = sc.nextInt();
        System.out.println("Enter the second number: ");
        int second = sc.nextInt();
        System.out.println("Enter the third number: ");
        int third = sc.nextInt();
        //Diskriminantin laskenta
        double equals = second * second - 4 * first * third;
        //Diskriminantin arviointi ja juurien laskeminen
        if (equals > 0) {
            double equation1 = (-second + Math.sqrt(equals)) / (2 * first);
            double equation2 = (-second - Math.sqrt(equals)) / (2 * first);
            System.out.println("The roots is " + equation1);
            System.out.println("The roots is " + equation2);
        //Jos diskriminantti on suurempi kuin 0, yhtälöllä on kaksi erillistä reaalijuurta
            // Jos diskriminantti on yhtä suuri kuin 0, yhtälöllä on kaksinkertainen reaalijuuri
            //Jos diskriminantti on pienempi kuin 0, yhtälöllä ei ole todellisia juuria

        } else if (equals == 0) {
            double equation = -second / (2 * first);
            System.out.println("The equation is " + equation);
        } else {
            System.out.println(" No real roots");
        }
    }
}