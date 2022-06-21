package arrays;

/**
 * @author Choudhury Subham on 30-05-2022
 */
public class BestOfMoveZeroToEnd {

    public static void main(String[] args) {
        int arr[] = {5,0,0,20,0,12,20,8};
        int result[] =moveZero(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(result[i]);
        }

    }

    private static int[] moveZero(int[] arr) {
        int count=0;
        int tempi,tempj;
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=0){
                tempi=arr[i];
                tempj=arr[count];
                arr[count]=tempi;
                arr[i]=tempj;
                count++;
            }
        }
        return arr;
    }
}
