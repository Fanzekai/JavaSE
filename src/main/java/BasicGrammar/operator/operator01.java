package BasicGrammar.operator;

/**
 * @author fzk
 * @version 1.0
 * @date 2024/3/18  9:53
 */

/**
 * Java 语言支持如下运算符：
 * 算术运算符: +，-，*，/，%，++，--
 * 赋值运算符 =
 * 关系运算符: >，<，>=，<=，==，!= instanceof
 * 逻辑运算符: &&，||，!
 * 位运算符: &，|，^，~ ， >>，<<，>>> (了解！！！)
 * 条件运算符 ？：
 * 扩展赋值运算符:+=，-=，*=，/=
 * *
 * */
public class operator01 {

    public static void main(String[] args) {

        //二元运算符
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b) );
        System.out.println("a - b = " + (a - b) );
        System.out.println("a * b = " + (a * b) );
        System.out.println("b / a = " + (b / a) );

        //整数运算
        long aa = 1231321311231231L;
        int bb = 1213;
        short cc = 10;
        byte dd = 8;
        System.out.println((aa+bb+cc+dd)); //Long类型
        System.out.println((bb + cc + dd));//Int类型
        System.out.println((cc + dd));//Int类型

        //浮点运算
        float aaa = 3.14565F;
        double bbb = 3.194546464;
        float ccc = 1.3123123F;
        System.out.println(aaa+bb); //doubble类型
        System.out.println(bb+ccc); //doubble类型
        System.out.println(aaa+ccc); //floaaat类型

        //
    }
}
