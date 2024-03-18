package FacetoClass.Statics;

/**
 * @author fzk
 * @version 1.0
 * @date 2024/3/18  15:06
 */
//非静态方法"可以"直接访问类中的非静态变量和非静态方法,也"可以"直接访问类中的静态变量和静态方法
public class student04 {
    private static int count;
    private int num;
    public void run(){}
    public static void go(){}


    public void test(){
//编译通过
        System.out.println(count);
        go();
//编译通过
        System.out.println(num);
        run();
    }
}
