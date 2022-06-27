package race_condtions_and_critical_sections;

public class RaceConditionsExample {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread thread1 = new Thread(getRunnable(counter, "Thread1 final count: "));
        Thread thread2 = new Thread(getRunnable(counter, "Thread2 final count: "));

        thread1.start();
        thread2.start();
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

    public long incAndGet() {
        this.count++;
        return this.count;
    }

    public long get() {
        return this.count;
    }
//
//    public void add(long value) {
//        this.count += value;
//    }
}