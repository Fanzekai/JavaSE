package FacetoClass.Super.two;

/**
 * @author fzk
 * @version 1.0
 * @date 2024/3/18  14:44
 */
//调用父类中的方法
public class Student extends Person{
    public void print(){
        System.out.println("Student");
    }
    public void test(){
        print();
        this.print();
        super.print();
    }}
