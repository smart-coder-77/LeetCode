package kunaldsa.binarysearch;

import java.util.Arrays;

/**
 * @author Choudhury Subham on 17-06-2022
 */
//Bi-tonic Array
public class MountainArray {

    public static void main(String[] args) {
        int[] arr ={5,7,8,10,9,6,7,5};
        int res = findPeekIndex(arr);
        System.out.println(res);

    }

    private static int findPeekIndex(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int mid = start+(end-start)/2;
            if (arr[mid]>arr[mid+1]){
                end=mid;
            }else {
                start=mid+1;
            }
        }
        return arr[start];
    }
}
