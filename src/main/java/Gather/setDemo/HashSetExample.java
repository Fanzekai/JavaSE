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
            Set<String> set = new HashSet<>();

            // 添加元素
            set.add("apple");
            set.add("banana");
            set.add("orange");
            System.out.println("Set after adding elements: " + set);

            // 判断元素是否存在
            System.out.println("Does set contain 'apple'? " + set.contains("apple"));

            // 获取集合大小
            System.out.println("Size of set: " + set.size());

            // 移除元素
            set.remove("banana");
            System.out.println("Set after removing 'banana': " + set);

            // 清空集合
            set.clear();
            System.out.println("Set after clearing: " + set);

            // 判断集合是否为空
            System.out.println("Is set empty? " + set.isEmpty());

            // 添加所有元素
            Set<String> otherSet = new HashSet<>();
            otherSet.add("grape");
            otherSet.add("pear");
            set.addAll(otherSet);
            System.out.println("Set after adding all elements from otherSet: " + set);

            // 转换为数组
            Object[] array = set.toArray();
            System.out.println("Array representation of set: ");
            for (Object element : array) {
                System.out.println(element);
            }
        }
    }



