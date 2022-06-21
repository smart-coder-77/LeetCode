package program;

import java.util.Scanner;

/**
 * @author Choudhury Subham on 14-06-2022
 */
public class ArmstrongNumber {

    public static void main(String[] args) {
        for (int i=1;i<1000;i++){
            if (isArmstrong(i)){
                System.out.println(i);
            }
        }
    }
    private static Boolean isArmstrong(int num) {
        int sum=0;
        int original= num;
        while (num>0){
            int rem = num%10;
            int cube = rem*rem*rem;
            sum =sum+cube;
            num=num/10;
        }

        if (sum==original){
            return true;
        }
       return false;
    }
}
