package CommonClass;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author fzk
 * @version 1.0
 * @date 2024/3/18  16:13
 */
public class Calendareg {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();//默认是当前日期
        System.out.println(c);

        Calendar c1 = Calendar.getInstance();
        c1.set(2019, 4 - 1, 27);


        String months[] = {
                "Jan", "Feb", "Mar", "Apr",
                "May", "Jun", "Jul", "Aug",
                "Sep", "Oct", "Nov", "Dec"};
        int year;
// 初始化 Gregorian 日历
// 使用当前时间和日期
// 默认为本地时间和时区
        GregorianCalendar gcalendar = new GregorianCalendar();
// 显示当前时间和日期的信息
        System.out.print("Date: ");
        System.out.print(months[gcalendar.get(Calendar.MONTH)]);
        System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
        System.out.println(year = gcalendar.get(Calendar.YEAR));
        System.out.print("Time: ");
        System.out.print(gcalendar.get(Calendar.HOUR) + ":");
        System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
        System.out.println(gcalendar.get(Calendar.SECOND));
// 测试当前年份是否为闰年
        if(gcalendar.isLeapYear(year)) {
            System.out.println("当前年份是闰年");
        }
        else {
            System.out.println("当前年份不是闰年");
        }
    }
    }

