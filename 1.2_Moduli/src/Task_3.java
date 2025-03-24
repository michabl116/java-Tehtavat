import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Määrän lukeminen grammoina
        System.out.println("Enter the amount you want to convert:");
        int amount = sc.nextInt();

        //Gramojen muunnos luotiksi, naulaksi ja leiviskäksi
        double luoti = amount/13.28;
        double naula = luoti/32;
        double leiviska = naula/20;
        //Jäljellä olevien yksiköiden laskeminen
        double remaining_naula = naula % 20;
        double remaining_luoti = luoti % 32;

        //Muuntaminen kokonaisluvuiksi ja tulostusmuotoon
        int intleiska = (int) leiviska;
        int intnaula = (int) remaining_naula;
        String desimalluolti = String.format("%.2f", remaining_luoti);


        System.out.println(amount +" grams is: " + intleiska +" leviskä, " + intnaula + " naula, " + desimalluolti + " luoti");
    }
}
