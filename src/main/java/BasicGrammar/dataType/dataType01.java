package BasicGrammar.dataType;

/**
 * @author fzk
 * @version 1.0
 * @date 2024/3/18  9:16
 */
public class dataType01 {

    public static void main(String[] args) {

        // byte
        System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);
        System.out.println("包装类：java.lang.Byte");
        System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);
        System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);
        System.out.println();
        // short
        System.out.println("基本类型：short 二进制位数：" + Short.SIZE);
        System.out.println("包装类：java.lang.Short");
        System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);
        System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);
        System.out.println();
        // int
        System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);
        System.out.println("包装类：java.lang.Integer");
        System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);
        System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);
        System.out.println();
        // long
        System.out.println("基本类型：long 二进制位数：" + Long.SIZE);
        System.out.println("包装类：java.lang.Long");
        System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);
        System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);
        System.out.println();
        // float
        System.out.println("基本类型：float 二进制位数：" + Float.SIZE);
        System.out.println("包装类：java.lang.Float");
        System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);
        System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);
        System.out.println();
        // double
        System.out.println("基本类型：double 二进制位数：" + Double.SIZE);
        System.out.println("包装类：java.lang.Double");
        System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);
        System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);
        System.out.println();
        // char
        System.out.println("基本类型：char 二进制位数：" + Character.SIZE);
        System.out.println("包装类：java.lang.Character");
        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台
        System.out.println("最小值：Character.MIN_VALUE="
                + (int) Character.MIN_VALUE);
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台
        System.out.println("最大值：Character.MAX_VALUE="
                + (int) Character.MAX_VALUE);
    }
}

/**
 * 位（bit）：是计算机 内部数据 储存的最小单位，11001100是一个八位二进制数。
 * 字节（byte）：是计算机中 数据处理 的基本单位，习惯上用大写 B 来表示,2字节=16位
 * 1B（byte,字节）= 8bit（位）
 * 字符：是指计算机中使用的字母、数字、字和符号
 * ASCIIS码：
 * 1个英文字母（不分大小写）= 1个字节的空间
 * 1个中文汉字 = 2个字节的空间
 * 1个ASCII码 = 一个字节
 * UTF-8编码：
 * 1个英文字符 = 1个字节
 * 英文标点 = 1个字节
 * 1个中文（含繁体） = 3个字节
 * 中文标点 = 3个字节
 * Unicode编码：
 * 1个英文字符 = 2个字节
 * 英文标点 = 2个字节
 * 1个中文（含繁体） = 2个字节
 * 中文标点 = 2个字节
 * 1bit表示1位，
 * 1Byte表示一个字节 1B=8b。
 * 1024B=1KB
 * 1024KB=1M
 * 1024M=1G.
 * **/
