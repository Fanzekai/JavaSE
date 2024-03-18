package FacetoClass.This;

/**
 * @author fzk
 * @version 1.0
 * @date 2024/3/18  14:29
 */
public class Student04 {

    //this在类中表示当前类将来创建出的对象
    private String name;
    public Student04(){
        System.out.println("this = "+this);
    }
    public static void main(String[] args){
        Student04 s = new Student04();
        System.out.println("s = "+s);
    }
}
