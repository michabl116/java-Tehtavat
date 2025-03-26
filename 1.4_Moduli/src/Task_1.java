import java.util.Scanner;
import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        //määrittelee taulukot
        String[] firstNames = {"Miko", "Peka", "jose", "Migel", "Maria"};
        String[] lastNames = {"Virtanet", "Pipo", "Hukunen", "Sirtanen", "korhonen"};

        //kysyy käyttäjältä kuinka monta nimeä hän haluaa
        System.out.println("How many names do you want?");
        int radomRequiere = sc1.nextInt();
        Random random = new Random(); //Luo satunnaisobjektin satunnaislukujen luomiseksi.
        //Suorita 0:sta radomiin Vaatii
        for (int i = 0; i < radomRequiere; i++) {
            //Käytä Random-objektia valitaksesi satunnaisen etu- ja sukunimen taulukoista
            String randomName = firstNames[new Random().nextInt(firstNames.length)];
            String randomLastName = lastNames[new Random().nextInt(lastNames.length)];
            System.out.println(randomName + " " + randomLastName);

        }

    }
}






