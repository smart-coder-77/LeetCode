package dsa.arrays;

/**
 * @author Choudhury Subham on 21-06-2022
 */
public class FindNumbersWithEvenNumberOfDigits {

    public static void main(String[] args) {
        int [] nums ={555,901,482,1771};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int count =0;
        for (int i=0;i<nums.length;i++){
            if (isEven(nums[i])){
                count++;
            }
        }
        return count;
    }
    private static boolean isEven(int num) {
        int x=(int)Math.log10(num)+1;
        return x%2==0;
    }
}
