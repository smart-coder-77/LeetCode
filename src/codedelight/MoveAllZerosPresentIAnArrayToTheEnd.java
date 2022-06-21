package codedelight;

import java.util.Arrays;

/**
 * @author Choudhury Subham on 14-06-2022
 */

public class MoveAllZerosPresentIAnArrayToTheEnd {

    public static void main(String[] args) {
         int nums[] = {1,2,4,0,2,0,3,0,4,0,5,0};
        System.out.println(Arrays.toString(moveZero(nums)));
    }

    //The time complexity of the above solution is O(n) and doesn’t require any extra space, where n is the size of the input.
    private static int [] moveZero(int[] nums) {
         int k=0;
         for (int i:nums){
             if (i!=0){
                 nums[k++]=i;
             }
         }
         for (int i=k;i<nums.length;i++){
             nums[i]=0;
         }
        return nums;
    }
}
