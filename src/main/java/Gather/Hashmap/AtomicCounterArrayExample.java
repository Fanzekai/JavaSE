package Gather.Hashmap;

/**
 * @author fzk
 * @version 1.0
 * @date 2024/3/19  21:07
 */
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.ThreadLocalRandom;

public class AtomicCounterArrayExample {
    private static final int NUM_COUNTERS = 10; // 数组中计数器的数量
    private static AtomicIntegerArray counters = new AtomicIntegerArray(NUM_COUNTERS);

    public static void main(String[] args) {
        // 模拟多个线程并发递增元素个数
        for (int i = 0; i < 100; i++) {
            new Thread(() -> incrementTotal()).start();
        }

        // 等待所有线程完成
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 输出最终的元素个数
        int total = 0;
        for (int i = 0; i < NUM_COUNTERS; i++) {
            total += counters.get(i);
        }
        System.out.println("Final total: " + total);
    }

    private static void incrementTotal() {
        // 选择一个随机的计数器
        int index = ThreadLocalRandom.current().nextInt(NUM_COUNTERS);

        // 使用CAS操作递增选中的计数器的值
        boolean success = false;
        while (!success) {
            int oldValue = counters.get(index);
            int newValue = oldValue + 1;
            success = counters.compareAndSet(index, oldValue, newValue);
            if (success) {
                System.out.println(Thread.currentThread().getName() + " incremented counter " + index + " to " + newValue);
            }
        }
    }
}
