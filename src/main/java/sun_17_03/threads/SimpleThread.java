package sun_17_03.threads;

public class SimpleThread {
    public static void main(String[] args) {
        Thread t1 = new MyThread("t1");
        Thread t2 = new MyThread("t2");
        t1.start();
        t2.start();
    }
    static class MyThread extends Thread {
        private final String name;
        MyThread(String name) {
            this.name = name;
        }
        @Override
        public void run() {
            for (int i = 1; i < 10; i++) {
                System.out.println(name + " -> " + i + ",");
            }
        }
    }
}
