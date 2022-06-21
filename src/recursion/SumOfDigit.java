package recursion;

/**
 * @author Choudhury Subham on 30-05-2022
 */
public class SumOfDigit {

    public static void main(String[] args) {
        System.out.println(sum(587));
    }
    private static int  sum(int i) {
        if(i<10){
            return i;
        }else{
            return sum(i/10)+i%10;
        }
    }
}
