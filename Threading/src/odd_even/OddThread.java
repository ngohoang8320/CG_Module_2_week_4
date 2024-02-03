package odd_even;

public class OddThread implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i <= 10) {
            if (i % 2 == 0) System.out.println("Even numbers: " + i);
            i++;
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
