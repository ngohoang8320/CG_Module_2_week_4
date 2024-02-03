package simple_thread;

public class NumberGeneratorThreadClass extends Thread {
    private String name;

    public NumberGeneratorThreadClass(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new NumberGeneratorThreadClass("Num1"));
        Thread thread2 = new Thread(new NumberGeneratorThreadClass("Num2"));

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();

        System.out.println("End.");
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            try {
                System.out.println("Number of " + this.name + ": " + i);
                System.out.println("Hashcode of " + this.name + ": " + this.hashCode());
                i++;

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
