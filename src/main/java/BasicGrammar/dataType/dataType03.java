package BasicGrammar.dataType;

/**
 * @author fzk
 * @version 1.0
 * @date 2024/3/18  9:25
 */
public class dataType03 {

    public static void main(String[] args) {
        float f = 0.1f;
        double d = 1.0/10;
        System.out.println(f==d); //false
        float d1 = 2131231231f;
        float d2 = d1+1;
        if(d1==d2){
            System.out.println("d1==d2");
        }else{
            System.out.println("d1!=d2");
        }
    }
}
