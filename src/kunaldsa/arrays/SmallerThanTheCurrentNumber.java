package kunaldsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Choudhury Subham on 20-06-2022
 */
public class SmallerThanTheCurrentNumber {

    public static void main(String[] args) {
        int [] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent2(nums)));

    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int [] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]>nums[j])   count++;
            }
            ans[i]=count;
        }
        return ans;
    }

    //Worst approach
    public static int[] smallerNumbersThanCurrent1(int[] nums) {
        int [] ans = new int[nums.length];
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            list.add(nums[i]);
        }
        //8,1,2,2,3
        List<Integer> list1 =list.stream().sorted().collect(Collectors.toList());
        for (int i=0;i<nums.length;i++){
            ans[i]=list1.indexOf(nums[i]);
        }
        return ans;
    }

    //Best Approach
    public static int[] smallerNumbersThanCurrent2(int[] nums) {
        int [] temp = new int[101];
        for (int i=0;i<nums.length;i++){
            temp[nums[i]]++;
        }
        for (int i=1;i<101;i++){
              temp[i]+=temp[i-1];
        }
        for (int i=0;i<nums.length;i++){
            int postion = nums[i];
            if(postion==0){
                nums[i]=0;
            }else {
                nums[i]=temp[postion-1];
            }
        }
        return nums;
    }
}
