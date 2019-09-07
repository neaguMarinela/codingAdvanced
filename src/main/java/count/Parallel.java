package count;

import java.util.stream.IntStream;

public class Parallel {
    public static void main(String[] args){
        //count the even numbers from 0 to one billion
        long startTime = System.currentTimeMillis();
        long counted = IntStream.rangeClosed(0,1000000000)
                .parallel()
                .filter(i->i%2==0)
                .count();
        long duration = System.currentTimeMillis() - startTime;
        System.out.println("the number of evens: "+counted + " time for execution: "+duration + " millis");

        long startTimeSecond = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i<= 1000000000; i++) {
            if (i%2==0){
                count++;
            }
        }
        long durationSecond = System.currentTimeMillis() - startTimeSecond;
        System.out.println("the number of evens: "+count + " time for execution: "+durationSecond + " millis");
    }
}
