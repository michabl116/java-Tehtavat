import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Quadratic Equation");
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first = sc.nextInt();
        System.out.println("Enter the second number: ");
        int second = sc.nextInt();
        System.out.println("Enter the third number: ");
        int third = sc.nextInt();
        double equals = second * second - 4 * first * third;

        if (equals > 0) {
            double equation1 = (-second + Math.sqrt(equals)) / (2 * first);
            double equation2 = (-second - Math.sqrt(equals)) / (2 * first);
            System.out.println("The equation is " + equation1);
            System.out.println("The equation is " + equation2);

        } else if (equals == 0) {
            double equation = -second / (2 * first);
            System.out.println("The equation is " + equation);
        } else {
            System.out.println("The equation is rais conplecx");
        }
    }
}