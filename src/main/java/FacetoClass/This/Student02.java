package FacetoClass.This;

/**
 * @author fzk
 * @version 1.0
 * @date 2024/3/18  14:26
 */

//调用类中的其他方法,默认情况下,setName("tom")和this.setName("tom")的效果是一样的.
public class Student02 {

    private String name;
    public void setName(String name){
        this.name = name;
    }
    public void print(){
//表示调用当前类中的setName方法
        this.setName("tom");
    }
}
