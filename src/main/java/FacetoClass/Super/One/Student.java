package FacetoClass.Super.One;

/**
 * @author fzk
 * @version 1.0
 * @date 2024/3/18  14:43
 */

//访问父类中的属性
public class Student extends Person{
    private String name = "lisi";
    public void test(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }


}
