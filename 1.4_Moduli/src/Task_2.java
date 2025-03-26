import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        //Taulukon koon
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size]; //luo joukon kokonaislukuja (int), joiden koko on määritetty
        //Lukee taulukon kokonaisluvut
        System.out.println("Enter the integers into the array: ");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        int maxsuma = array[0]; //Tallentaa tähän mennessä löydetyn enimmäissumman.
        int sum = array[0];// Tallentaa nykyisen summan.
        int start = 0;//Almacenan los índices del subarray con la suma máxima.
        int end = 0;
        int tempStart = 0;//Tallentaa nykyisen alijärjestelmän väliaikaisen aloitusindeksin
        //Silmukalla löytääksesi enimmäissumma:
        for (int i = 1; i < size; i++) {
            if (array[i] > sum + array[i]) {
                sum = array[i];
                tempStart = i;
            } else {
                sum += array[i];
            }

            if (sum > maxsuma) {
                maxsuma = sum;
                start = tempStart;
                end = i;
            }
        }
        System.out.println("Maximum sum: " + maxsuma);
        System.out.println("Integers:" + (start +1)+ "-" +(end+1) );

        }
    }
