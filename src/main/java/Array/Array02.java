package Array;

/**
 * @author fzk
 * @version 1.0
 * @date 2024/3/18  11:50
 */
public class Array02 {

    //数组作方法入参
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //数组作返回值
    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];
        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        return result;
    }

    public static void test03() {
        //For-Each 循环
        double[] myList = {1.9, 2.9, 3.4, 3.5};
// 打印所有数组元素
        for (double element: myList) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {

        test03();

    }
}
