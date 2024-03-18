package FacetoClass.Statics;

/**
 * @author fzk
 * @version 1.0
 * @date 2024/3/18  15:02
 */
public class student02 {
    private static int count;
    private int num;
    public student02() {
        count++;
        num++;
    }
    public static void main(String[] args) {
        student02 s1 = new student02();
        student02 s2 = new student02();
        student02 s3 = new student02();
        student02 s4 = new student02();
//因为还是在类中,所以可以直接访问私有属性
        System.out.println(s1.num);
        System.out.println(s2.num);
        System.out.println(s3.num);
        System.out.println(s4.num);
        System.out.println(student02.count);
        System.out.println(s1.count);
        System.out.println(s2.count);
        System.out.println(s3.count);
        System.out.println(s4.count);
    }
}
