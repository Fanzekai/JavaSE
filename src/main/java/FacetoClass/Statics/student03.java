package FacetoClass.Statics;

/**
 * @author fzk
 * @version 1.0
 * @date 2024/3/18  15:05
 */

//静态方法数属于类的,"可以"使用类名来调用,非静态方法是属于对象的,"必须"使用对象来调用
public class student03 {
    private static int count;
    private int num;
    public void run(){}
    public static void go(){}
    public static void test(){
//编译通过
        System.out.println(count);
        go();
//编译报错
//        System.out.println(num);
//        run();

    }
}
