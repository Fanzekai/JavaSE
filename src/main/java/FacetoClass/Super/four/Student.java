package FacetoClass.Super.four;

/**
 * @author fzk
 * @version 1.0
 * @date 2024/3/18  14:46
 */
public class Student extends Person {
    //编译报错,子类构造器中会隐式的调用父类的无参构造器,但是父类中没有无参构造器
    //super();
    public Student() {

    }
}
