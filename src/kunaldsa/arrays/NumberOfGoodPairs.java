package kunaldsa.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Choudhury Subham on 18-06-2022
 */
public class NumberOfGoodPairs {

    public static void main(String[] args) {
           int [] nums = {1,1,1,1};
        System.out.println(numIdenticalPairs2(nums));
    }

    public static int numIdenticalPairs(int[] nums) {
        int count =0;
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[j]==nums[i]&&i<j){
                    count++;
                }
            }
        }
        return count;
    }

    public static int numIdenticalPairs2(int[] nums) {
        int count =0;
        Map<Integer,Integer> map = new HashMap<>();
        //1,2,3,1,1,3
        for (int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
            count= count +map.get(n)-1;
        }
        System.out.println(map);
        return count;
    }
}
