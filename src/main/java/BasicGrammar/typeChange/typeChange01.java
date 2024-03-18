package BasicGrammar.typeChange;

/**
 * @author fzk
 * @version 1.0
 * @date 2024/3/18  9:35
 */
public class typeChange01 {


        public static void main(String[] args){

            //自动类型转换
            char c1='a';//定义一个char类型
            int i1 = c1;//char自动类型转换为int
            System.out.println("char自动类型转换为int后的值等于"+i1);
            char c2 = 'A';//定义一个char类型
            int i2 = c2+1;//char 类型和 int 类型计算
            System.out.println("char类型和int计算后的值等于"+i2);

            //强制类型转换
            double x = 3.14;
            int nx = (int)x; //值为3
            char c = 'a';
            int d = c+1;
            System.out.println(d); //98
            System.out.println((char)d); //b
            int xx = 300;
            byte bx = (byte)xx; //值为44
            System.out.println(bx);


            //常见错误和问题
            int money = 1000000000; //10亿
            int years = 20;
            int total = money*years; //返回的是负数
            long total1 = money*years; //返回的仍然是负数。默认是int，因此结果会转成int值，再转成long。但是已经发生了数据丢失
            long total2 = money*((long)years); //先将一个因子变成long，整个表达式发生提升。全部用long来计算。
            System.out.println(total);
            System.out.println(total1);
            System.out.println(total2);

            int l = 2;
            long a = 23451L;//不要命名名字为l的变量,long类型使用大写L不要用小写。
            System.out.println(l+1); //3
            System.out.println(a); //23451
        }
    }
