package sat_16_03.blockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueUsage {
    public static void main(String[] args) {
        int BOUND = 10;
        int N_PRODUCERS = 4;
        int N_CONSUMERS = Runtime.getRuntime().availableProcessors();
        int maxValue = Integer.MAX_VALUE;
        int maxValuePerProducer = N_CONSUMERS / N_PRODUCERS;

        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(BOUND);

        for (int i = 0; i < N_PRODUCERS; i++) {
            System.out.println("Producer " + i);
            new Thread(new NumbersProducer(queue, maxValue, maxValuePerProducer)).start();
        }

        for (int j = 0; j < N_CONSUMERS; j++) {
            System.out.println("Consumer " + j);
            new Thread(new NumbersConsumer(queue, maxValue)).start();
        }
    }
}