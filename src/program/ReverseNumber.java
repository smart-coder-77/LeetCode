package program;

/**
 * @author Choudhury Subham on 13-06-2022
 */
public class ReverseNumber {

    public static void main(String[] args) {
        int x= 12345;
        int ans =0;
        while (x>0){
            int rem = x%10;
            ans = ans*10+rem;
            x/=10;
        }
        System.out.println(ans);
    }
}
