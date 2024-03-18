package FacetoClass.Super.six;

/**
 * @author fzk
 * @version 1.0
 * @date 2024/3/18  14:49
 */
public class Student extends Person{
    //编译通过,子类构造器中显式的调用父类的有参构造器
    public Student(){
        super("tom");
    }}
