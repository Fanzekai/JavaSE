package FacetoClass.Super.five;

/**
 * @author fzk
 * @version 1.0
 * @date 2024/3/18  14:47
 */
public class Student extends Person{
    //编译通过,子类构造器中显式的调用父类的有参构造器
    public Student() {
        super("tom");
    }  }


/**
 * 不管是显式还是隐式的父类的构造器,super语句一定要出现在子类构造器中第一行代码。所以this和
 * super不可能同时使用它们调用构造器的功能,因为它们都要出现在第一行代码位置。
 * **/
