package kunaldsa.arrays;

import java.util.Arrays;


/**
 * @author Choudhury Subham on 16-06-2022
 */
public class ShuffleTheArray {

    public static void main(String[] args) {
        int [] nums ={1,2,3,4,4,3,2,1};
        int target = 4;
        int[] solution = shuffle(nums,target);
        int[] solutions = shuffle1(nums,target);
//Input: nums = [2,5,1,3,4,7], n = 3
//Output: [2,3,5,4,1,7]
        System.out.println(Arrays.toString(solutions));
    }
    private static int[] shuffle1(int[] nums, int n) {
        int [] ans = new int[n*2];
        int j=0;
        for (int i=0;i<n*2;i+=2){
            ans[i] = nums[j];
            ans[i+1] = nums[n+j];
            j++;
        }
           return ans;
    }

    private static int[] shuffle(int[] nums,int n) {
      int [] ans = new int[nums.length];
       int k=0;
       int i=1;
       while (k+n< nums.length){
           ans[i]= nums[k+n];
           k++;
           i+=2;
       }
       int z=0;
       int x=0;
       while (z<n){
           ans[x]=nums[z];
           z++;
           x+=2;
       }
        return ans;
    }
}
