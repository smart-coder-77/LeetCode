package kunaldsa.binarysearch;

/**
 * @author Choudhury Subham on 15-06-2022
 */

public class SearchElement {

    public static void main(String[] args) {
        int [] nums ={10,11,12,13,14,15,16,17,18};
        int target = 16;
        int ans = getElement(nums,target);
        System.out.println(ans);
    }

    private static int getElement(int[] nums, int target) {
        int start = 0;
        int end= nums.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (target<nums[mid]){
                end=mid-1;
            }else if (target>nums[mid]){
                start=mid+1;
            }else {
                return mid;
            }
        }

        return -1;
    }
}
