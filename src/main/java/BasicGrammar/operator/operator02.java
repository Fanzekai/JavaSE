package BasicGrammar.operator;

/**
 * @author fzk
 * @version 1.0
 * @date 2024/3/18  9:58
 */
public class operator02 {

    public static void main(String[] args) {
        //取模运算
        System.out.println(9 % 4); //1
        System.out.println(-9 % -4); //-1
        System.out.println(-10 % 4); //-2
        System.out.println(9 % -4); //1


        //一元运算符
        int a = 3;
        int b = a++; //执行完后,b=3。先给b赋值，再自增。
        int c = ++a; //执行完后,c=5。先自增,再给b赋值

        //逻辑运算符
        boolean aa = true;
        boolean bb = false;
        System.out.println("aa && bb = " + (aa&&bb));
        System.out.println("aa || bb = " + (aa||bb) );
        System.out.println("!(aa && bb) = " + !(aa && bb));

        int a1 = 5;//定义一个变量；
        boolean b1 = (a1<4)&&(a1++<10);
        System.out.println("使用短路逻辑运算符的结果为"+b1);
        System.out.println("a的结果为"+a1);


        //位运算符


        //扩展运算符
        int a2=10;
        int b2=20;
        a2+=b2; // a2 = a2 + b2
        System.out.println(a2+":"+b2);


        //字符串连接符
        String s1="Hello 中文!";
        String s2=1+""; //转换成String
        //int
        int c1 = 12;
        System.out.println("c=" + c1);

        //三目条件运算符
        int score = 80;
        String type = score < 60 ? "不及格" : "及格";
        System.out.println("type= " + type);
    }
}
