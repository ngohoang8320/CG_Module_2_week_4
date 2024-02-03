package runnable_with_join;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread running... ");

        RunnableDemo runnableDemo1 = new RunnableDemo("Thread-1-HR-Database");
        runnableDemo1.start();
        /*try {
            runnableDemo1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        RunnableDemo runnableDemo2 = new RunnableDemo("Thread-2-Send-Email");
        runnableDemo2.start();
        /*try {
            runnableDemo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        System.out.println("Main thread stopped!!! ");
    }
}
