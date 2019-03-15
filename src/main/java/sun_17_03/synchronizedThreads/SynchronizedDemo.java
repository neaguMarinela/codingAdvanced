package sun_17_03.synchronizedThreads;

public class SynchronizedDemo implements Runnable {
    public static final int N = 10;
    public static final int MAX_TRY = 1_000;

    private final char threadChar;
    private final StringBuffer sb;

    public SynchronizedDemo(char threadChar, StringBuffer sb) {
        this.threadChar = threadChar;
        this.sb = sb;
    }

    @Override
    public void run() {
        for (int i = 0; i < N; i++) {
            synchronized (sb) {
                sb.append(threadChar);
                System.out.println("++++++" + threadChar);
                sleep();
                sb.append(threadChar);
                System.out.println("------" + threadChar);
            }
        }
    }

    private void sleep() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException ignored) {
        }
    }

    public static void main(String[] args) {
        boolean failed = false;
        int tries = 0;
        while (!failed && tries < MAX_TRY) {
            tries++;
            StringBuffer sb = new StringBuffer(4 * N);
            new Thread(new SynchronizedDemo('a', sb)).start();
            new Thread(new SynchronizedDemo('b', sb)).start();
            System.out.println("*********  -> " + sb);
            failed = sb.indexOf("aba") != -1 || sb.indexOf("bab") != -1;
            //failed = sb.indexOf("aaa") != -1 || sb.indexOf("bab") != -1;
        }
        System.out.println(failed ? "failed after " + tries + " tries" : "not failed");
    }
}

