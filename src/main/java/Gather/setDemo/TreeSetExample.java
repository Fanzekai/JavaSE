package Gather.setDemo;
import java.util.Set;
import java.util.TreeSet;
/**
 * @author fzk
 * @version 1.0
 * @date 2024/5/2  12:54
 */


public class TreeSetExample {
    public static void main(String[] args) {
        // 创建一个 TreeSet 实例
        Set<String> treeSet = new TreeSet<>();

        // 添加元素
        treeSet.add("banana");
        treeSet.add("apple");
        treeSet.add("orange");
        treeSet.add("apple"); // 重复元素，不会被添加进去

        // 打印集合内容
        System.out.println("TreeSet: " + treeSet);
    }
}
