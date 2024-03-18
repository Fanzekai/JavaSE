package ProcessControl.Sequential;

/**
 * @author fzk
 * @version 1.0
 * @date 2024/3/18  10:44
 */
public class For {

    public static void test01(){
        int a = 1; //初始化
        while(a<=100){ //条件判断
            System.out.println(a); //循环体
            a+=2; //迭代
        }
        System.out.println("while循环结束！");
        for(int i = 1;i<=100;i++){ //初始化//条件判断 //迭代
            System.out.println(i); //循环体
        }
        System.out.println("while循环结束！");
    }

    public static void test02(){
        int oddSum = 0; //用来保存奇数的和
        int evenSum = 0; //用来存放偶数的和
        for(int i=0;i<=100;i++) {
            if (i % 2 != 0) {
                oddSum += i;
            } else {
                evenSum += i;
            }
        }
            System.out.println("奇数的和："+oddSum);
            System.out.println("偶数的和："+evenSum);
    }

    public static void test03(){
        for(int j = 1;j<=1000;j++){
            if(j%5==0){
                System.out.print(j+"\t");
            }
            if(j%(5*3)==0){
                System.out.println();
            }
        }
    }

    //乘法表
    public static void test04(){
        for (int i = 1; i <= 9 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (i * j)+ "\t");
            }
            System.out.println();
        }
    }

    //增强for循环
    public  static void test05(){
        int [] numbers = {10, 20, 30, 40, 50};
        for(int x : numbers ){
            System.out.print( x );
            System.out.print(",");
        }
        System.out.print("\n");
        String [] names ={"James", "Larry", "Tom", "Lacy"};
        for( String name : names ) {
            System.out.print( name );
            System.out.print(",");
        }
    }

    //break 关键字
    //break 主要用在循环语句或者 switch 语句中，用来跳出整个语句块。
    //break 跳出最里层的循环，并且继续执行该循环下面的语句。
    public static void test06(){
        int i=0;
        while (i<100){
            i++;
            System.out.println(i);
            if (i==30){
                break;
            }
        }
    }

    //continue 关键字
    //continue 适用于任何循环控制结构中。作用是让程序立刻跳转到下一次循环的迭代。
    public static void test07(){
        int i=0;
        while (i<100){
            i++;
            if (i%10==0){
                System.out.println();
                continue;
            }
            System.out.print(i);
        }
    }

    //break在任何循环语句的主体部分，均可用break控制循环的流程。break用于强行退出循环，不执行循
    //环中剩余的语句。(break语句也在switch语句中使用)
    //continue 语句用在循环语句体中，用于终止某次循环过程，即跳过循环体中尚未执行的语句，接着进行
    //下一次是否执行循环的判定。

    public static void main(String[] args) {

        //test04();
        //test05();
        //test06();
        test07();
    }
}
