package arrays;

/**
 * @author Choudhury Subham on 26-05-2022
 */
public class SecondLargestElementArray {
    static int getSecondLargest(int arr[]){
        int res= -1;
        int largest = getLargest(arr);
        for (int i=0;i<arr.length;i++){
            if(arr[i]!=arr[largest]){
                if (res==-1){
                    res=i;
                }else if (arr[i]>arr[res]){
                    res=i;
                }
            }
        }
        return res;
    }

    static int getLargest(int arr[]){
        int res=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>arr[res]){
                res= i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr [] = {10};
        System.out.println(getSecondLargest(arr));
    }
}
