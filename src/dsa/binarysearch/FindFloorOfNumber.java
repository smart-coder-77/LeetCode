package dsa.binarysearch;

/**
 * @author Choudhury Subham on 16-06-2022
 */
//find the greatest number smaller or equals to target number;
public class FindFloorOfNumber {

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,6,8,9,10};
        int target = 5;
        int ans = findFloor(arr,target);
        System.out.println(ans);

    }

    private static int findFloor(int[] arr, int target) {
         int start = 0;
         int end = arr.length;
         while (start<=end){
             int mid = start+(end-start)/2;
             if (target<arr[mid]){
                 end= mid-1;
             }else if (target>arr[mid]){
                 start= mid+1;
             }else {
                 return mid;
             }
         }
        return arr[end];
    }
}
