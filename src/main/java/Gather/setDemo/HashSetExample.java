package Gather.setDemo;
import java.util.HashSet;
import java.util.Set;
/**
 * @author fzk
 * @version 1.0
 * @date 2024/5/2  12:53
 */


public class HashSetExample {
    public static void main(String[] args) {
        // 创建一个 HashSet 实例
        Set<String> hashSet = new HashSet<>();

        // 添加元素
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("orange");
        hashSet.add("apple"); // 重复元素，不会被添加进去

        // 打印集合内容
        System.out.println("HashSet: " + hashSet);
    }
}
