package primeNumber;

public class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        int check = 2;
        int time = 1;
        ac:
        while (time > 0) {
            for (int i = 2; i < check; i++) {
                if (check % i == 0) {
                    check++;
                    continue ac;
                }
            }
            if (check < 100) {
                System.out.println("Lazy: " + check);
                check++;
                time++;
                continue;
            }
            break;
        }
    }
}
