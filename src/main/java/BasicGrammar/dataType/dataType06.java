package BasicGrammar.dataType;

/**
 * @author fzk
 * @version 1.0
 * @date 2024/4/25  16:56
 */
//强制类型转换（显式）
/**数据类型范围从小到大：
byte、short、char --> int --> long --> float --> double，其中byte、short、char在运算时自动提升为int

 byte（1字节）
 short（2字节）
 char（2字节，Unicode字符）
 int（4字节）
 long（8字节） L
 float（4字节） f
 double（8字节） d
 */
public class dataType06 {


    public static void main(String[] args) {



        // 左边是int类型，右边是long类型，左右不一样；
// long --> int,范围从大到小；
// 需要强制类型转换。
        int num = (int) 100L;
        System.out.println(num);//100

// 假设从大到小不进行强制类型转换
// int num = 100L;
// System.out.println(num);//报错：从long转换到int可能会有损失

    }
}
