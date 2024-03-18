package CommonClass;

import java.util.Random;

/**
 * @author fzk
 * @version 1.0
 * @date 2024/3/18  16:05
 */
public class Randomeg {

    public static void main(String[] args) {
// 结果是个double类型的值，区间为[0.0,1.0）
        System.out.println("Math.random()=" + Math.random());
        int num = (int) (Math.random() * 3);
// 注意不要写成(int)Math.random()*3，这个结果为0或1，因为先执行了强制转换
        System.out.println("num=" + num);

//结果
//Math.random()=0.44938147153848396
//num=1


    Random rand =new Random();
    int ii=rand.nextInt(100);
    System.out.println(ii);

        Random ran1 = new Random(25);
        System.out.println("使用种子为25的Random对象生成[0,100)内随机整数序列: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(ran1.nextInt(100) + " ");
        }
        System.out.println();
}
}
