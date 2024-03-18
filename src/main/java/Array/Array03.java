package Array;

import java.util.Arrays;
import java.util.List;

/**
 * @author fzk
 * @version 1.0
 * @date 2024/3/18  11:52
 */
public class Array03 {

    //打印数组
    public static void test01() {
        int[] a = {1,2};
        System.out.println(a); //[I@1b6d3586
        System.out.println(Arrays.toString(a)); //[1, 2]
    }

    //数组排序
    public static void test02() {
        int[] a = {1,2,323,23,543,12,59};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }

    //二分法查找
    public static void test03() {

        int[] a = {1,2,323,23,543,12,59};
        Arrays.sort(a); //使用二分法查找，必须先对数组进行排序
        System.out.println("该元素的索引："+Arrays.binarySearch(a, 12));
    }

    //元素填充
    public static void test04() {
        int[] a = {1,2,323,23,543,12,59};
        Arrays.sort(a); //使用二分法查找，必须先对数组进行排序
        Arrays.fill(a, 2, 4, 100); //将2到4索引的元素替换为100
        System.out.println(Arrays.toString(a));
    }

    //数组转换为List集合
    public static void test05() {
    int[] a = {3,5,1,9,7};
    List<int[]> list = Arrays.asList(a);
    }


}
