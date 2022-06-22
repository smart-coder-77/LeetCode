package dsa.arrays;

import java.util.Arrays;

/**
 * @author Choudhury Subham on 21-06-2022
 */
public class ReverseArray {

    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6};
        System.out.println(Arrays.toString(reverseAB(arr)));
    }

    public static int[] reverseA(int [] arr){
        int j=0;
        int []rev= new int[arr.length];
        for (int i=arr.length-1;i>=0;i--){
            rev[j]=arr[i];
            j++;
        }
        return rev;
    }

    public static int[] reverseAB(int [] arr){
        int start =0;
        int end = arr.length-1;
        while (start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
}
