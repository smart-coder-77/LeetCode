package recursion;

/**
 * @author Choudhury Subham on 30-05-2022
 */
public class FirstProgram {

    public static void main(String[] args) {
        fun(3);
    }

    private static void fun(int i) {
        if(i<1){
            return ;
        }else{
            System.out.println(i);
             fun(i-1);

        }
    }
}
