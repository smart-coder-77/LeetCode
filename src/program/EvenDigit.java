package program;

/**
 * @author Choudhury Subham on 15-06-2022
 */
public class EvenDigit {

    public static void main(String[] args) {
        int[] nums = {16,13,1234,12,888,33456};
        System.out.println(findDigit(nums));
    }

    private static int findDigit(int[] nums) {
        int count =0;
        for(int num: nums){
            if (even(num)){
                count++;
            }
        }
        return count;
    }
    private static boolean even(int num) {
        int x= digit(num);
        return x%2==0;
    }

    //Faster way to find the number of digit
    private static int digit(int num) {
        return (int)Math.log10(num)+1;
    }
}
