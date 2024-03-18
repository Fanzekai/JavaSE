package FacetoClass.This;

/**
 * @author fzk
 * @version 1.0
 * @date 2024/3/18  14:26
 */
//调用类中的其他构造器,this的这种用法,只能在构造器中使用.普通的方法是不能用的.并且这句调用的代码只能出现在构造器中的第一句
public class Student03 {

    private String name;
    public Student03(){
//调用一个参数的构造器,并且参数的类型是String
        this("tom");
    }
    public Student03(String name){
        this.name = name;
    }
}
