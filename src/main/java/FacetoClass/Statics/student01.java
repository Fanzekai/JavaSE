package FacetoClass.Statics;

/**
 * @author fzk
 * @version 1.0
 * @date 2024/3/18  15:01
 */
public class student01 {

    private static int age;
    private double score;
    public static void main(String[] args) {
        student01 s = new student01();
//推荐使用类名访问静态成员
        System.out.println(student01.age);
        System.out.println(s.age);
        System.out.println(s.score);
    }
}
