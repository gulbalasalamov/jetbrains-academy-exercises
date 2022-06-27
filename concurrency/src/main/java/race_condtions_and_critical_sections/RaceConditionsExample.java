package race_condtions_and_critical_sections;


public class RaceConditionsExample {
    /**
     * THis is the example two threads reading and modifying and writing back the value
     *
     * @param args
     */
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread thread1 = new Thread(getRunnable(counter, "Thread1 final count: "));
        Thread thread2 = new Thread(getRunnable(counter, "Thread2 final count: "));

        thread1.start();
        thread2.start();

        /**
         * Before atomic:
         * Thread2 final count: 1969255
         * Thread1 final count: 1077602
         *
         * After atomic it is synchronized
         * Thread2 final count: 1956225
         * Thread1 final count: 2000000
         *
         * 1st thread finished little early before other 2nd one but now counts to 2million.
         */
    }

    private static Runnable getRunnable(Counter counter, String message) {
        return () -> {
            for (int i = 0; i < 1_000_000; i++) {
                counter.incAndGet();
            }
            System.out.println(message + counter.get());
        };
    }


}

class Counter {
    protected long count = 0;

    /**
     * This is critical section. The way to fix critical section is setting this atomic.
     * Atomic means that only one thread can execute within the critical section at a given time.
     * Once you make a critical section atomic, you get sequential access to the crtical section and
     * you can force behaviour of counter.
     * wrap it in synchronized block
     *
     * @return
     */
    public long incAndGet() {
        synchronized (this) {
            this.count++;
            return this.count;
        }
    }

    public long get() {
        return this.count;
    }
//
//    public void add(long value) {
//        this.count += value;
//    }
}