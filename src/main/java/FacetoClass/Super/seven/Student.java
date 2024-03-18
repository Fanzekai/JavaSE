package FacetoClass.Super.seven;

/**
 * @author fzk
 * @version 1.0
 * @date 2024/3/18  14:50
 */
public class Student extends Person{
    private int age;
    public Student(){
        this(20);
    }
    public Student(int age){
        super("tom");
        this.age = age;

    }}
