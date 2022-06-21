package program;

/**
 * @author Choudhury Subham on 13-06-2022
 */
public class FindNumber {

    public static void main(String[] args) {
         int x= 123431233;
         int count=0;
         while (x>0){
             int rem = x%10;
             if (rem==3){
                count++;
             }
             x=x/10;
         }
        System.out.println(count);
    }
}
