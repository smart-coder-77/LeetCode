package program;

import java.util.Scanner;

/**
 * @author Choudhury Subham on 14-06-2022
 */
public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        Boolean aBoolean = isThisPrime(num);
        System.out.println(aBoolean);
    }

    private static Boolean isThisPrime(int num) {
        int c=2;
        if (num<2){
            return false;
        }
        while (c*c<num){
            if (num%c==0){
                return false;
            }
            c++;
        }
         return c*c>num;
    }
}
