package Gather.Hashmap;

/**
 * @author fzk
 * @version 1.0
 * @date 2024/3/19  11:09
 */
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapSize {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();

        // 启动10个线程，每个线程往concurrentMap中插入100个元素
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new ElementAdder(concurrentMap));
            thread.start();
        }

        // 等待所有线程执行完毕
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 获取总元素个数
        int totalSize = (int) concurrentMap.mappingCount();
        System.out.println("Total size: " + totalSize);
    }

    static class ElementAdder implements Runnable {
        private final ConcurrentHashMap<String, Integer> concurrentMap;

        public ElementAdder(ConcurrentHashMap<String, Integer> concurrentMap) {
            this.concurrentMap = concurrentMap;
        }

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                // 插入元素
                concurrentMap.put(String.valueOf(i), i);
            }
        }
    }
}
