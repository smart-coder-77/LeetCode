package arrays;

/**
 * @author Choudhury Subham on 26-05-2022
 */
public class LargestArrayElement {


    static int getLargest(int arr[]){
        int res = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[res]<arr[i]){
               res =i;
            }
        }
        return res;
    }


    public static void main(String[] args) {

        int arr[] = {10,12,8,5,6,7};
        System.out.println(getLargest(arr));

    }
}
