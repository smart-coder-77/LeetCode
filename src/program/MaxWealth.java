package program;

/**
 * @author Choudhury Subham on 15-06-2022
 */
public class MaxWealth {

    public static void main(String[] args) {
        int [][] wealth= {
                {10,20,3},
                {2,4,5},
                {7,17,2},
                {17,17,12}
        };
        System.out.println(findMaxWealth(wealth));

    }

    private static int findMaxWealth(int[][] wealth) {
        int ans= Integer.MIN_VALUE;
        for (int [] p: wealth){
            int sum =0;
            for(int acc: p){
                sum+=acc;
            }
            if (sum>ans){
                ans=sum;
            }
        }

        return ans;
    }
}
