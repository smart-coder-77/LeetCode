package dsa.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Choudhury Subham on 18-06-2022
 */
public class KidsWithTheGreatestNumberOfCandies {

    public static void main(String[] args) {
        int [] candies = {4,2,1,1,2};
        int extraCandies = 1;
        System.out.println(kidsWithCandies(candies,extraCandies));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
      int max= candies[0];
        for (int i=0;i<candies.length;i++)
        {
            if(max<candies[i]){
                max=candies[i];
            }
        }
        int k=0;
        List<Boolean> list = new ArrayList<>();
        while (k<candies.length) {
            if (max <=(candies[k] + extraCandies)) {
                list.add(true);
            } else {
                list.add(false);
            }
            k++;
        }
        return list;
    }
}
