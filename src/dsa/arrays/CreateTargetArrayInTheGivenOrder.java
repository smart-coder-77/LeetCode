package dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Choudhury Subham on 20-06-2022
 */
public class CreateTargetArrayInTheGivenOrder {

    public static void main(String[] args) {
        int [] nums = {0,1,2,3,4};
        int [] index={0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list= new ArrayList<>();
        for (int i=0;i<nums.length;i++){
            list.add(index[i],nums[i]);
        }
        int ans[] = new int[nums.length];
        for (int i=0;i<nums.length;i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}
