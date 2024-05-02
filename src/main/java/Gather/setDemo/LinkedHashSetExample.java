package Gather.setDemo;
import java.util.LinkedHashSet;
import java.util.Set;
/**
 * @author fzk
 * @version 1.0
 * @date 2024/5/2  12:53
 */


public class LinkedHashSetExample {
    public static void main(String[] args) {
        // 创建一个 LinkedHashSet 实例
        Set<String> linkedHashSet = new LinkedHashSet<>();

        // 添加元素
        linkedHashSet.add("apple");
        linkedHashSet.add("banana");
        linkedHashSet.add("orange");
        linkedHashSet.add("apple"); // 重复元素，不会被添加进去

        // 打印集合内容
        System.out.println("LinkedHashSet: " + linkedHashSet);
    }
}
