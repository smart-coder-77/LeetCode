package dsa.arrays;

import java.util.Arrays;

/**
 * @author Choudhury Subham on 16-06-2022
 */
public class ConcatenationOfArray {
    public static void main(String[] args) {
        int [] nums ={1,2,3,4};
        int[] any = getConcatenation(nums);
        int[] solution = getConcatenation1(nums);
        System.out.println(Arrays.toString(any));
        System.out.println(Arrays.toString(solution));
    }

    private static int[] getConcatenation1(int[] nums) {
        int n= nums.length;
        int[] ans = new int[n*2];
        for (int i=0;i<n;i++){
            ans[i]=ans[i+n]=nums[i];
        }
        return ans;
    }

    public static int[] getConcatenation(int[] nums) {
        int ans[] = new int[nums.length*2];
       int n=0;
        int l= nums.length;
        while (n<nums.length){
            ans[n]=nums[n];
            n++;
        }
        int k=0;
        while (n<nums.length*2){
            ans[n]=nums[k];
            k++;
            n++;
        }
        return ans;
    }
}
