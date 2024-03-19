package Gather.Hashmap;

/**
 * @author fzk
 * @version 1.0
 * @date 2024/3/19  11:21
 */
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounterExample {
    private static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {
        // 创建并启动10个线程，每个线程对计数器进行100次递增操作
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new CounterIncrementer());
            thread.start();
        }

        // 等待所有线程执行完毕
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 输出最终的计数器值
        System.out.println("Final Counter Value: " + counter.get());
    }

    // 线程类，用于递增计数器
    static class CounterIncrementer implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                // 使用CAS操作递增计数器
                counter.incrementAndGet();
            }
        }
    }
}

