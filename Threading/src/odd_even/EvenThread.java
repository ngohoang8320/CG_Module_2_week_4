package odd_even;

public class EvenThread extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i <= 10) {
            if (i % 2 != 0) System.out.println("Odd numbers: " + i);
            i++;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
