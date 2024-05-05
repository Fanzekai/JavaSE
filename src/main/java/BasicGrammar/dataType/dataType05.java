package BasicGrammar.dataType;

/**
 * @author fzk
 * @version 1.0
 * @date 2024/4/25  16:54
 */

/*Java数据类型转换--
数据类型范围从小到大：
byte、short、char --> int --> long --> float --> double，其中byte、short、char在运算时自动提升为int。
  */
public class dataType05 {

    //自动类型转换（隐式）
    public static void main(String[] args) {

        System.out.println(1024);// 一个整数，默认int类型
        System.out.println(3.14);// 一个浮点数，默认double类型


// 左边是long类型，右边是默认的int类型，左右不一样；
// 等号代表赋值，将右侧的int常量，交给左侧的long变量进行存储；
// int --> long,符合数据范围从小到大的要求；
// 这一行代码发生了自动类型转换。
        long num1 = 100;
        System.out.println(num1);// 100


// 左边是double类型，右边是float类型，左右不一样；
// 等号代表赋值，将右侧的float常量，交给左侧的double变量进行存储；
// float --> double,符合数据范围从小到大的要求；
// 这一行代码发生了自动类型转换。
        double num2 = 2.5F;
        System.out.println(num2);// 2.5

// 左边是float类型，右边是long类型，左右不一样；
// long --> float,由于float范围更大，符合了从小到大的规则；
// 于是发生了自动类型转换。
        float num3 = 30L;
        System.out.println(num3);// 30.0

//使用double类型计算得到的圆的面积比使用float类型计算得到的要更精确
        float radius1 = 1.23456789f;
        float area1 = (float) (Math.PI * radius1 * radius1);
        System.out.println("圆的面积（使用 float）: " + area1);


        double radius = 1.23456789;
        double area = Math.PI * radius * radius;
        System.out.println("圆的面积（使用 double）: " + area);


    }
}
