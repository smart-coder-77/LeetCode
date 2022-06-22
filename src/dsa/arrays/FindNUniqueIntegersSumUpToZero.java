package dsa.arrays;

import java.util.Arrays;

/**
 * @author Choudhury Subham on 22-06-2022
 */
public class FindNUniqueIntegersSumUpToZero {

    public static void main(String[] args) {
        int n=5;
        System.out.println(Arrays.toString(sumZero(n)));
    }
    public static int[] sumZero(int n) {
        int[] v = new int[n];
        for(int i=0;i<n;i++)
            v[i]= 2*i - n + 1;
        return v;
    }
}
