package sat_16_03.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class NumbersConsumer implements Runnable {
    private final BlockingQueue<Integer> queue;
    private final int maxValue;

    public NumbersConsumer(BlockingQueue<Integer> queue, int maxValue) {
        this.queue = queue;
        this.maxValue = maxValue;
    }

    public void run() {
        try {
            while (true) {
                Integer number = queue.take();
                System.out.println("Number: " + number + " and maxValue: " + maxValue +
                        " for thread " + Thread.currentThread().getName());
                if (number.equals(maxValue)) {
                    return;
                }
                String result = number.toString();
                System.out.println(Thread.currentThread().getName() + " result: " + result);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}