package dsa.arrays;

import java.util.Arrays;

/**
 * @author Choudhury Subham on 22-06-2022
 */

public class PlusOne {

    public static void main(String[] args) {
        int[] digits = {9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static  int[] plusOne(int[] digits) {

        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++; return digits;
            }
            digits[i] = 0;
        }

        int[] newDigit = new int [n+1];
        newDigit[0] = 1;
        return newDigit;
    }
    }

