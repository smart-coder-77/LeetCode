package dsa.binarysearch;

/**
 * @author Choudhury Subham on 15-06-2022
 */
public class OrderAgnosticBS {

    public static void main(String[] args) {
        int [] nums ={10,11,12,13,14,15,16,17,18};
        int target = 16;
        int ans = getElementBS(nums,target);
        System.out.println(ans);
    }

    private static int getElementBS(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        boolean isAsc= nums[start]<nums[end];
        while (start<=end){
            int mid = start+(end-start)/2;
            if(target==nums[mid]){
                return mid;
            }
            if (isAsc){
                if (target<nums[mid]){
                    end= mid-1;
                }else if (target>nums[mid]) {
                    start=mid+1;
                }
            }else {
                if (target>nums[mid]){
                    end= mid-1;
                }else if (target<nums[mid]) {
                    start=mid+1;
            }
        }
    }
        return -1;
}}
