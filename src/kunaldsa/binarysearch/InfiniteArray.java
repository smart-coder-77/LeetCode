package kunaldsa.binarysearch;
/**
 * @author Choudhury Subham on 16-06-2022
 */
public class InfiniteArray {

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,6,8,9,10,11,12,14,15};
        int target = 14;
        int ans = findTarget(arr,target);
        System.out.println(ans);

    }
    private static int findTarget(int[] arr, int target) {
        int start = 0;
        int end =1;
        while (target>arr[end]){
            int temp=end+1;
            end= end+(end-start+1)*2;
            start=temp;
        }
         return binarySearch(arr,target,start,end);
    }

    private static int binarySearch(int[] arr, int target,int start ,int end) {
        while(start<=end){
            int mid= start+(end-start)/2;
            if (target<arr[mid]){
                end=mid-1;
            }else if (target>arr[mid]){
                start=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
