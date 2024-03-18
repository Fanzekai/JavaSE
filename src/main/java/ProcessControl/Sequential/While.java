package ProcessControl.Sequential;

/**
 * @author fzk
 * @version 1.0
 * @date 2024/3/18  10:39
 */
public class While {


    //只要布尔表达式为 true，循环就会一直执行下去
    public static void test01(){
        int i = 0;
//i小于100就会一直循环
        while (i<100){
            i++;
            System.out.println(i);
        }
    }

    //do…while 循环和 while 循环相似，不同的是，do…while 循环至少会执行一次。
    public static void test02(){
        int i = 0;
        int sum = 0;
        while (i <= 100) {
            sum = sum+i;
            i++;
        }
        System.out.println("Sum= " + sum);
    }

    public static void test03(){
        int i = 0;
        int sum = 0;
        do {
            sum = sum+i;
            i++;
        }while (i <= 100);
        System.out.println("Sum= " + sum);
    }

    //while先判断后执行。dowhile是先执行后判断！Do...while总是保证循环体会被至少执行一次！这是他们的主要差别
    public static void test04(){
        int a = 0;
        while(a<0){
            System.out.println(a);
            a++;
        }
        System.out.println("-----");
        do{
            System.out.println(a);
            a++;
        } while (a<0);

    }

    public static void main(String[] args) {

        test01();
        test02();
        test03();
        test04();
    }
}
