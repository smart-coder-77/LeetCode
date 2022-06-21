package arrays;

/**
 * @author Choudhury Subham on 30-05-2022
 */
public class LefRotateArrayByOne {

    public static void main(String[] args) {

        int arr[] = {5,0,0,20,0,12,20,8};
        int result[] =rotateArray(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(result[i]);
        }
    }

    private static int[] rotateArray(int[] arr) {
        int temp= arr[0];
       /* while (i<arr.length-1)
        {
            arr[i]=arr[i+1];
            i++;
        }
        arr[arr.length-1]= last;*/
        for (int i=1;i< arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]= temp;
        return arr;
    }
}
