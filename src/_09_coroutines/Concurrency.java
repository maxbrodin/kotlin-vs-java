package _09_coroutines;

public class Concurrency {
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[10_000];
        for (int i = 0; i < threads.length; i++) {
            Thread t = new Thread(() -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Hi!" + Thread.currentThread().getName());
            });
            t.start();
            threads[i] = t;
        }

        for (Thread t : threads) {
            t.join();
        }
    }
}
