package primeNumber;

public class Test {
    public static void main(String[] args) {
        OptimizedPrimeFactorization opPrime = new OptimizedPrimeFactorization();
        LazyPrimeFactorization lazy = new LazyPrimeFactorization();
        Thread tLazy = new Thread(lazy);
        Thread tOp = new Thread(opPrime);

        tOp.start();
        tLazy.start();
    }
}
