package dsa.arrays;

import java.util.*;

/**
 * @author Choudhury Subham on 22-06-2022
 */
public class TwoSum {

    public static void main(String[] args) {
        int [] nums ={3,3};
        int target =6;
        System.out.println(Arrays.toString(twoSum3(nums,target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int [] arr = new int[2];
        for (int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
            if (map.containsKey(target-i)){
                arr[0]= i;
                arr[1]=target-i;
            }
        }
        return arr;
    }
    //Failed {3,3}
    public static int[] twoSum1(int[] nums, int target) {
        List<Integer> list = new LinkedList<>();
        int [] arr = new int[2];
        for (int i: nums){
          list.add(i);
          if (list.contains(target-i)){
              arr[0]= list.indexOf(target-i);
              arr[1]= list.indexOf(i);
          }
        }
        return arr;
    }

    //failed 3,2,4
    public static int[] twoSum2(int[] nums, int target) {
        int start =0;
        int arr[] = new int[2];
        int end = nums.length-1;
        while (start<end){
            if (nums[start]+nums[end]==target){
                arr[0]=start;
                arr[1]=end;
            }
            if (nums[start]+nums[end]>target){
                end--;
            }else {
               start++;
            }
        }
        return arr;
    }
   //Got result here
    public static int[] twoSum3(int[] nums, int target) {
       Map<Integer,Integer> map = new HashMap<>();
       for (int i=0;i< nums.length;i++){
           int temp = target-nums[i];
           if (map.containsKey(temp)){
              return new int[]{map.get(temp),i};
           }
           map.put(nums[i],i);
       }
        throw new IllegalStateException("Not solution");
    }


}
