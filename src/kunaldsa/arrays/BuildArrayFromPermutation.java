package kunaldsa.arrays;

import java.util.Arrays;

/**
 * @author Choudhury Subham on 16-06-2022
 */
public class BuildArrayFromPermutation {

    public static void main(String[] args) {
        int [] nums ={5,0,1,2,3,4};
        //Input: nums = [5,0,1,2,3,4]
        //Output: [4,5,0,1,2,3]
        //Output: [0,1,2,4,5,3]
        int[] ans = buildArray(nums);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] buildArray(int[] nums) {
        int arr[] = new int[nums.length];
        for (int i=0;i< nums.length;i++){
             arr[i]=nums[nums[i]];
        }
        return arr;
    }
}
