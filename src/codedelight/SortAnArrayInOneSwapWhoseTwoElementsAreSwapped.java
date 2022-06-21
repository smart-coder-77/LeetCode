package codedelight;

import java.util.Arrays;

/**
 * @author Choudhury Subham on 14-06-2022
 */
public class SortAnArrayInOneSwapWhoseTwoElementsAreSwapped {

    public static void main(String[] args) {
        int nums[] = {1,2,4,0,2,0,3,0,4,0,5,0};
        System.out.println(Arrays.toString(sortedArray(nums)));
    }

    private static int[] sortedArray(int[] nums) {
        int max =nums[0];
        for (int i=0;i<nums.length;i++){
            if (max>nums[i]){
                max=nums[i];

            }
        }

        return nums;
    }
}
