package Methods;

/**
 * @author fzk
 * @version 1.0
 * @date 2024/3/18  11:24
 */
public class method01 {

    public static int max01(int num1, int num2) {
        int result;
        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }
        return result;
    }

    public int add(int num1, int num2) {
        return num1+num2;
    }

    /** 返回两个整数变量较大的值 */
    public static int max02(int num1, int num2) {
        int result;
        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }
        return result;
    }

    //方法重载
    public static double max03(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
    public static int max03(int num1, int num2) {
        int result;
        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }
        return result;
    }



    public static void main(String[] args) {

        //方法调用
        int i1 = 5;
        int j1 = 2;
        int k = max02(i1, j1);
        System.out.println( i1 + " 和 " + j1 + " 比较，最大值是：" + k);




    }
}
