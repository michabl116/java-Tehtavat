import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taulukon koon lukeminen
        System.out.println("Enter the size of the array:");
        int num = sc.nextInt();
        int[] array = new int[num];
        //Lukemalla taulukon kokonaisluvu
        System.out.println("Enter the integers into the array: ");
        for (int i = 0; i < num; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            array[i] = sc.nextInt();

        }
        //Silmukka löytää ja näyttää ainutlaatuisia kokonaislukuja
        for (int i = 0; i < array.length; i++) {
            boolean found = true;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    found = false;
                    break;
                }
            }
            if (found) {
                System.out.println("The array without duplicates:");
                System.out.print(array[i]);
            }

            }
        }
    }


