package ProcessControl.Sequential;

/**
 * @author fzk
 * @version 1.0
 * @date 2024/3/18  10:35
 */
public class Switch {

    //switch case 执行时，一定会先进行匹配，匹配成功返回当前 case 的值，再根据是否有 break，判断
    //是否继续输出，或是跳出判断。
    public static void test01(){
        //char grade = args[0].charAt(0);
        char grade = 'C';
        switch(grade)
        {
            case 'A' :
                System.out.println("优秀");
                break;
            case 'B' :
            case 'C' :
                System.out.println("良好");
                break;
            case 'D' :
                System.out.println("及格");
                break;
            case 'F' :
                System.out.println("你需要再努力努力");
                break;
            default :
                System.out.println("未知等级");
        }
        System.out.println("你的等级是 " + grade);
    }

    //如果 case 语句块中没有 break 语句时，匹配成功后，从当前 case 开始，后续所有 case 的值都会输
    //出。如果后续的 case 语句块有 break 语句则会跳出判断。
    public static void test02(){
        int i = 1;
        switch(i){
            case 0:
                System.out.println("0");
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("default");
        }
    }


    public static void test03() {
        String name = "fzk";
        switch (name) { //JDK7的新特性，表达式结果可以是字符串！！！
            case "fzk":
                System.out.println("输入的fzk");
                break;
            case "czn":
                System.out.println("输入的czn");
                break;
            default:
                System.out.println("弄啥嘞！");
                break;
    }}


    public static void main(String[] args) {
        test01();
        test02();
        test03();
    }
}
