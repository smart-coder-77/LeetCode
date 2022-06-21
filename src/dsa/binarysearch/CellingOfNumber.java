package dsa.binarysearch;

/**
 * @author Choudhury Subham on 16-06-2022
 */
//find the smallest number greater or equals to target number;
    //time complexity O(logn)
public class CellingOfNumber {

    public static void main(String[] args) {
         int[] arr ={1,2,3,4,5,6,8,9,10};
         int target = 11;
         int ans = findCelling(arr,target);
        System.out.println(ans);
    }

    private static int findCelling(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        int mid =0;
        if (target>arr[end]){
            return -1;
        }
        while (start<=end){
            mid = start+(end-start)/2;
            if (target<arr[mid]){
                end=mid-1;
            }else if (target>arr[mid]){
                start=mid+1;
            }else {
                return mid;
            }
        }
        return arr[start];
    }
}
