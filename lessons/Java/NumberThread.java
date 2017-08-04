import java.util.concurrent.Semaphore;

/**
 * Created by sumeet
 * on 13/7/17.
 */

class NumberThread implements Runnable {

    private Semaphore numberSemaphore;
    private Semaphore alphabetSemaphore;
    private int maxIterations;

    public NumberThread(int maxIterations, Semaphore alphabetSemaphore, Semaphore numberSemaphore) {
        this.alphabetSemaphore = alphabetSemaphore;
        this.maxIterations = maxIterations;
        this.numberSemaphore = numberSemaphore;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < maxIterations; i++) {
                numberSemaphore.acquire();
                Thread.sleep(400);
                System.out.println(i + 1);
                alphabetSemaphore.release();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class AlphabetThread implements Runnable {

    private Semaphore numberSemaphore;
    private Semaphore alphabetSemaphore;
    private int maxIterations;

    public AlphabetThread(int maxIterations, Semaphore alphabetSemaphore, Semaphore numberSemaphore) {
        this.alphabetSemaphore = alphabetSemaphore;
        this.maxIterations = maxIterations;
        this.numberSemaphore = numberSemaphore;
    }

    public void run() {
        try {
            for (int i = 0; i < maxIterations; i++) {
                alphabetSemaphore.acquire();
                Thread.sleep(400);
                System.out.println((char) (i + 'A'));
                numberSemaphore.release();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

public class Synchronization {
    public static void main(String[] args) throws InterruptedException {
        Semaphore numberSemaphore = new Semaphore(0);
        Semaphore alphabetSemaphore = new Semaphore(1);

        Thread numberThread = new Thread(new NumberThread(10, alphabetSemaphore, numberSemaphore));
        Thread alphabetThread = new Thread(new AlphabetThread(10, alphabetSemaphore, numberSemaphore));

        numberThread.start();
        alphabetThread.start();

        numberThread.join();
        alphabetThread.join();
    }
}