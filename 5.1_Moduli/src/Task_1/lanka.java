package Task_1;

public class lanka {
    private static int max = 20; // Voit muuttaa tätä arvoa määrittääksesi numeroiden alueen

    public static void main(String[] args) {
        Thread evenThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 2; i <= max; i += 2) {
                    System.out.println("Even Thread: " + i);
                }
            }
        });

        Thread oddThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= max; i += 2) {
                    System.out.println("Odd Thread: " + i);
                }
            }
        });

        //evenThread.start();
        //oddThread.start();
        evenThread.start();
        try {
            evenThread.join(); // Odottaa, että parillisten numeroiden säie päättyy
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        oddThread.start();
    }
}
