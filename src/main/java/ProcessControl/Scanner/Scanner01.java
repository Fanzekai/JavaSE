package ProcessControl.Scanner;

import java.util.Scanner;

/**
 * @author fzk
 * @version 1.0
 * @date 2024/3/18  10:13
 */
public class Scanner01 {

    public static void test01(){
        //创建一个扫描器对象，用于接收键盘数据
        Scanner scanner = new Scanner(System.in);
//next方式接收字符串
        System.out.println("Next方式接收:");
//判断用户还有没有输入字符
        if (scanner.hasNext()){
            String str = scanner.next();
            System.out.println("输入内容："+str);
        }
//凡是属于IO流的类如果不关闭会一直占用资源.要养成好习惯用完就关掉.就好像你接水完了要关水龙头一样.很多下载软件或者视频软件如果你不彻底关,都会自己上传下载从而占用资源,你就会觉得卡,这一个道理.
        scanner.close();
    }

    public static void test02(){


        Scanner scan = new Scanner(System.in);
// 从键盘接收数据
// nextLine方式接收字符串
        System.out.println("nextLine方式接收：");
// 判断是否还有输入
        if (scan.hasNextLine()) {
            String str2 = scan.nextLine();
            System.out.println("输入内容：" + str2);
        }
        scan.close();
    }


    //如果要输入 int 或 float 类型的数据，在 Scanner 类中也有支持，但是在输入之前最好先使用
    //hasNextXxx() 方法进行验证，再使用 nextXxx() 来读取：
    public static void test03() {
        Scanner scan = new Scanner(System.in);
// 从键盘接收数据
        int i = 0;
        float f = 0.0f;
        System.out.print("输入整数：");
        if (scan.hasNextInt()) {
// 判断输入的是否是整数
            i = scan.nextInt();
// 接收整数
            System.out.println("整数数据：" + i);
        } else {
// 输入错误的信息
            System.out.println("输入的不是整数！");
        }
        System.out.print("输入小数：");
        if (scan.hasNextFloat()) {
// 判断输入的是否是小数
            f = scan.nextFloat();
// 接收小数
            System.out.println("小数数据：" + f);
        } else {
// 输入错误的信息
            System.out.println("输入的不是小数！");
        }
        scan.close();
    }

    public static void  test04(){
        //扫描器接收键盘数据
        Scanner scan = new Scanner(System.in);
        double sum = 0; //和
        int m = 0; //输入了多少个数字
//通过循环判断是否还有输入，并在里面对每一次进行求和和统计
        while (scan.hasNextDouble()) {
            double x = scan.nextDouble();
            m = m + 1;
            sum = sum + x;
        }
        System.out.println(m + "个数的和为" + sum);
        System.out.println(m + "个数的平均值是" + (sum / m));
        scan.close();
    }

    public static void main(String[] args) {
        //test01();
        //test02();
        //test03();
        test04();
    }
}



