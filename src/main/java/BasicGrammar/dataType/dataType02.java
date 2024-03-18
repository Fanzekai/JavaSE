package BasicGrammar.dataType;

/**
 * @author fzk
 * @version 1.0
 * @date 2024/3/18  9:22
 */
public class dataType02 {

    public static void main(String[] args) {
//整型
        int i1=100;
//长整型
        long i2=998877665544332211L;
//短整型
        short i3=235;
//浮点型
        double d1=3.5; //双精度
        double d2=3;
        float f1=(float)3.5; //单精度
        float f2=3.5f; //单精度
//布尔类型 boolean true真/false假
        boolean isPass=true;
        boolean isOk=false;
        boolean isBig=5>8;
        if(isPass){
            System.out.println("通过了");
        }else{
            System.out.println("未通过");
        }
//单字符
        char f='女';
        char m='男';
    }
}

/**
 * Java语言的整型常数默认为int型，浮点数默认是Double
 * **/
