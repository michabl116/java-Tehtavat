 import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a  binary number: ");
        String binary = in.nextLine();
        int decimal =0;
        for (int i = 0; i < binary.length(); i++) {
            char bits = binary.charAt(binary.length()-i-1);
            if (bits == '1') {
                decimal += Math.pow(2, i);

            }

        }
        System.out.println(decimal);
            }




            }







