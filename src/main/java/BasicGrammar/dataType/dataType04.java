package BasicGrammar.dataType;

/**
 * @author fzk
 * @version 1.0
 * @date 2024/3/18  9:27
 */
public class dataType04 {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = '中';
        System.out.println(c1);
        System.out.println((int) c1); //97
        System.out.println(c2);
        System.out.println((int) c2); //20013

        char c3 = '\u0061';
        System.out.println(c3); //a


        //代码1
        String sa=new String("Hello world");
        String sb=new String("Hello world");
        System.out.println(sa==sb); // false
//代码2
        String sc="Hello world";
        String sd="Hello world";
        System.out.println(sc==sd); // true
        //test1和test2都是String类型的对象，它们的值都是"This is a test"，
        // 由于Java中的字符串常量池特性，相同的字符串常量在内存中只会有一个实例，
        // 因此test1和test2都指向字符串常量池中的同一块地址，所以test1 == test2会返回true
    }
}
