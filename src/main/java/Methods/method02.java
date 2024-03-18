package Methods;

/**
 * @author fzk
 * @version 1.0
 * @date 2024/3/18  11:31
 */
public class method02 {


    //递归
    public static int f(int n) {
        if (1 == n) {
            return 1;
        } else {
            return n*f(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(f(5));
    }
}
