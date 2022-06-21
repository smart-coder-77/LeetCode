package dsa.arrays;

import java.util.Arrays;

/**
 * @author Choudhury Subham on 16-06-2022
 */
public class RunningSumOfArray {

    public static void main(String[] args) {
        int [] nums ={1,1,1,1,1};
        int[] solution = runningSum(nums);
        System.out.println(Arrays.toString(solution));
    }

    public static int[] runningSum(int[] nums) {
        int sum=0;
        for (int i=0;i<nums.length;i++){
            sum+=nums[i];
            nums[i]=sum;
        }
        return nums;
    }
}
