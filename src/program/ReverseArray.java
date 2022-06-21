package program;

import java.util.Arrays;

/**
 * @author Choudhury Subham on 14-06-2022
 */
public class ReverseArray {

    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5};
        reverseMyAr(nums);
    }
    private static void reverseMyAr(int[] nums) {
        int start=0;
        int end = nums.length-1;
        while (start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(nums));
    }
    private static void swap(int[] nums,int i,int j){
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
    }

}
