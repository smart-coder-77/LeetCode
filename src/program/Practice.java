package program;

import java.util.Arrays;

/**
 * @author Choudhury Subham on 11-06-2022
 */

class Practice
{
    public static void main(String[] args) {
        int nums[] ={6, 0, 8, 2, 3, 0, 4, 0, 1};
        rearrange(nums);
    }
    public static void rearrange(int[] nums)
    {
        // Write your code here...
        int k=0;
        for (int i : nums){
            if (i!=0){
                nums[k++]=i;
            }
        }
        for (int i=k;i< nums.length;i++){
            nums[i]=0;
        }

        System.out.println(Arrays.toString(nums));
    }
}
