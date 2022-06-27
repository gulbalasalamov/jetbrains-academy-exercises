package race_condtions_and_critical_sections;

/**
 * For race condition to occur, there must be at least 2 threads, which updates-writes to same variable.
 * You may have a visibility problem, but not race condition.
 */
public class RaceConditionExample3 {
    public static void main(String[] args) {
        //CounterSynchronized counter = new CounterSynchronized();
        Counter counter = new Counter();

        Thread thread1= new Thread(getIncrementingRunnable(counter));
        Thread thread2= new Thread(getReadingRunnable(counter));

        thread1.start();
        thread2.start();

    }

    private static Runnable getIncrementingRunnable(Counter counter) {
        return () -> {
            for (int i = 0; i < 1_000_000; i++) {
                counter.incAndGet();
            }
            System.out.println("Thread1 final count" + counter.get());
        };
    }

    private static Runnable getReadingRunnable(Counter counter) {
        return () -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Thread2 count: " + counter.get());
        };
    }
}
