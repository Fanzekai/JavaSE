package Gather.Hashmap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author fzk
 * @version 1.0
 * @date 2024/3/19  20:40
 */


//多个线程对共享计数器进行 CAS 操作的情况
public class CASExample {
    private static final int NUM_THREADS = 5;
    private static final int MAX_COUNT = 1000;
    private static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {
        // 创建并启动多个线程
        Thread[] threads = new Thread[NUM_THREADS];
        for (int i = 0; i < NUM_THREADS; i++) {
            threads[i] = new Thread(new Worker());
            threads[i].start();
        }

        // 等待所有线程完成
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // 输出最终计数器的值
        System.out.println("Final counter value: " + counter.get());
    }

    static class Worker implements Runnable {
        @Override
        public void run() {
            // 模拟多个线程同时尝试递增计数器的过程
            for (int i = 0; i < MAX_COUNT; i++) {
                // 使用CAS操作递增计数器
                boolean success = false;
                while (!success) {
                    int currentValue = counter.get();
                    int newValue = currentValue + 1;
                    success = counter.compareAndSet(currentValue, newValue);
                    if (success) {
                        System.out.println(Thread.currentThread().getName() + " incremented counter to " + newValue);
                    } else {
                        System.out.println(Thread.currentThread().getName() + " failed to increment, retrying...");
                    }
                }
            }
        }
    }
}
/**
 * 在这个示例中，多个线程（共5个）并发地尝试对计数器进行递增操作。每次递增操作使用了CAS操作（compareAndSet方法）
 * ，如果CAS操作失败，线程会重试直到成功。你可以运行这个示例代码，观察多个线程竞争下计数器的递增过程
 *
 * **/
