package blockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class NumbersProducer implements Runnable {

    private final BlockingQueue<Integer> numbersQueue;
    private final int maxValue;
    private final int maxValuePerProducer;

    public NumbersProducer(BlockingQueue<Integer> numbersQueue, int maxValue, int maxValuePerProducer) {
        this.numbersQueue = numbersQueue;
        this.maxValue = maxValue;
        this.maxValuePerProducer = maxValuePerProducer;
    }

    public void run() {
        try {
            generateNumbers();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private void generateNumbers() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            numbersQueue.put(ThreadLocalRandom.current().nextInt(100));
        }
        for (int j = 0; j < maxValuePerProducer; j++) {
            numbersQueue.put(maxValue);
        }
    }
}