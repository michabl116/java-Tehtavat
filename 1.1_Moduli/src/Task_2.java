public class Task_2 {
    public static void main(String[] args) {
        //rivit mara
        int rivi = 4;
        //rivit bucle
        for (int i = 1; i <= rivi; i++) {

            //rivit valit enen tahti merkit
            for (int j = 1; j <= rivi - i; j++) {
                System.out.print(" ");
            }
            //Printa tahti mekit
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
