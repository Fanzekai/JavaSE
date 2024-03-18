package BasicGrammar.variable;

/**
 * @author fzk
 * @version 1.0
 * @date 2024/3/18  9:47
 */
public class variable01 {

    //实例变量
    public String name;//这个实例变量对子类可见
    private double salary;// 私有变量，仅在该类可见



    static int allClicks=0; // 类变量
    String str="hello world"; // 实例变量
    public void method(){
        int i =0; // 局部变量
    }


    //静态变量
    private static double salary2;//salary是静态的私有变量
    public static final String DEPARTMENT = "开发人员"; // DEPARTMENT是一个常量



    //产量
    //final 常量名=值;
    final double PI=3.14; final String LOVE="hello";


    public static void main(String[] args) {

        int a, b, c; // 声明三个int型整数：a、 b、c
        int d = 3, e = 4, f = 5; // 声明三个整数并赋予初值
        byte z = 22; // 声明并初始化 z
        String s = "runoob"; // 声明并初始化字符串 s
        double pi = 3.14159; // 声明了双精度浮点型变量 pi
        char x = 'x';


        //局部变量
        int i=10;
        int j = i+5 ;
        System.out.println(j);


        salary2 = 10000;
        System.out.println(DEPARTMENT+"平均工资:"+salary2);


    }
}
