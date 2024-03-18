package Array;

/**
 * @author fzk
 * @version 1.0
 * @date 2024/3/18  11:36
 */
public class Array01 {


    public static void main(String[] args) {
        //演示创建一个数组，并赋值，进行访问
        //1.声明一个数组
        int[] myList = null;
//2.创建一个数组
        myList = new int[10];
//3.像数组中存值
        myList[0] = 1;
        myList[1] = 2;
        myList[2] = 3;
        myList[3] = 4;
        myList[4] = 5;
        myList[5] = 6;
        myList[6] = 7;
        myList[7] = 8;
        myList[8] = 9;
        myList[9] = 10;
// 计算所有元素的总和
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println("总和为： " + total);

        System.out.println("-------------------------");


        //三种初始化
        //1.静态初始化
        int[] a1 = new int[2];
        a1[0]=1;
        a1[1]=2;
        //2.动态初始化
        int[] a2 = {1,2,3};
        //3.数组的默认初始化
        int[] a=new int[2];
        boolean[] b = new boolean[2];
        String[] s = new String[2];
        System.out.println(a[0]+":"+a[1]); //0,0
        System.out.println(b[0]+":"+b[1]); //false,false
        System.out.println(s[0]+":"+s[1]); //null, null

    }
}

