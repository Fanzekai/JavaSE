package CommonClass;

import java.util.Date;

/**
 * @author fzk
 * @version 1.0
 * @date 2024/3/18  16:10
 */
public class Dateeg {

    public static void main(String args[]) {
// 初始化 Date 对象
        Date date1 = new Date();
// 使用 toString() 函数显示日期时间
        System.out.println(date1.toString());


        //日期比较
        // 初始化 Date 对象
        Date date2 = new Date();
        long time = date2.getTime();
        long time2 = date2.getTime();
        System.out.println(time==time2);


        boolean before = new Date(97, 01, 05).before(new Date(99, 11, 16));
        System.out.println(before);
    }
}
