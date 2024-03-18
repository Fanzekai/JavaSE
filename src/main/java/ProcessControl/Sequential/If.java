package ProcessControl.Sequential;

import java.util.Scanner;

/**
 * @author fzk
 * @version 1.0
 * @date 2024/3/18  10:28
 */
public class If {


//单if
    public static void test01(){

        Scanner scanner = new Scanner(System.in);
//接收用户输入
        System.out.print("请输入内容：");
        String s = scanner.nextLine();
        if (s.equals("Hello")){
            System.out.println("输入的是："+s);
        }
        System.out.println("End");
        scanner.close();
    }
//双if
    public static void test02() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入成绩：");
        int score = scanner.nextInt();
        if (score>60){
            System.out.println("及格");
        }else {
            System.out.println("不及格");
        }
        scanner.close();
    }
//多if
    public static void test03(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入成绩：");
        int score = scanner.nextInt();
        if (score==100){
            System.out.println("恭喜满分");
        }else if (score<100 && score >=90){
            System.out.println("A级");
        }else if (score<90 && score >=80){
            System.out.println("B级");
        }else if (score<80 && score >=70){
            System.out.println("C级");
        }else if (score<70 && score >=60){
            System.out.println("D级");
        }else if (score<60 && score >=0){
            System.out.println("不及格！");
        }else {
            System.out.println("成绩输入不合法！");
        }
        scanner.close();
    }
    public static void main(String[] args) {

        test01();
    }
}
