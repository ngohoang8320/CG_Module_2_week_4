package odd_even;

public class TestThread {
    public static void main(String[] args) {
        EvenThread even = new EvenThread();
        Thread odd = new Thread(new OddThread());

        even.start();
        try {
            even.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        odd.start();
        try {
            odd.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End.");
    }
}
