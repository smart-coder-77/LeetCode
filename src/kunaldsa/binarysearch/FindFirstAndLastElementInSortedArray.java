package kunaldsa.binarysearch;
import java.util.Arrays;
/**
 * @author Choudhury Subham on 16-06-2022
 */
public class FindFirstAndLastElementInSortedArray {

    public static void main(String[] args) {
        int[] arr ={5,7,7,8,8,10};
        int target = 8;
        int[] res = findFirstAndLastElement(arr,target);
        System.out.println(Arrays.toString(res));
    }

    private static int[] findFirstAndLastElement(int[] arr, int target) {
         int []answer = {-1,-1};
         int start = search(arr,target,true);
        int end = search(arr,target,false);
        answer[0]=start;
        answer[1]=end;
        return answer;
    }

    static int search(int [] nums,int target,boolean findStartIndex){
        int start= 0;
        int end= nums.length-1;
        int ans =-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (target<nums[mid]){
                end=mid-1;
            }else if (target>nums[mid]){
                start=mid+1;
            }else{
                ans=mid;
                if (findStartIndex){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
