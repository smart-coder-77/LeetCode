package arrays;

/**
 * @author Choudhury Subham on 30-05-2022
 */
public class ReverseArray {

    public static void main(String[] args) {
        int arr[] = {5,0,0,20,0,12,20,8};
        int result[] =reverseArr(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(result[i]);
        }

    }

    private static int[] reverseArr(int[] arr) {
        int low=0,high = arr.length-1;
        while(low<high){
            int temp= arr[low];
            arr[low] =arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
        return arr;
    }
}
