package CommonClass;

/**
 * @author fzk
 * @version 1.0
 * @date 2024/3/18  15:59
 */
public class PackageClass {

    public static void main(String[] args) {
        int m = 500;
        Integer obj = new Integer(m); // 手动装箱
        int n = obj.intValue(); // 手动拆箱
        System.out.println("n = " + n);
        Integer obj1 = new Integer(500);
        System.out.println("obj 等价于 obj1？" + obj.equals(obj1));


        System.out.println("------------");

        String[] str = {"123", "123abc", "abc123", "abcxyz"};
        for(String str1 : str){
            try{
                int m2 = Integer.parseInt(str1, 10);
                System.out.println(str1 + " 可以转换为整数 " + m2);
            }catch(Exception e){
                System.out.println(str1 + " 无法转换为整数");
            }
        }


        System.out.println("------------");

        int m3 = 500;
        String s = Integer.toString(m3);
        String s2 = m+"";
        System.out.println("s = " + s);


        //自动拆箱和装箱
        int m4 = 500;
        Integer obj4 = m; // 自动装箱
        int n4 = obj4; // 自动拆箱
        System.out.println("n = " + n);
        Integer obj5 = 500;
        System.out.println("obj 等价于 obj1？" + obj.equals(obj5));

    }
}
