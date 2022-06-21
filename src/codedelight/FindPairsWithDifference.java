package codedelight;


import java.util.*;

/**
 * @author Choudhury Subham on 14-06-2022
 */
public class FindPairsWithDifference {

    public static void main(String[] args) {
        int nums[] = {1, 5, 2, 2, 2, 5, 5, 4};
        int dif = 3;
        difference(nums,dif);
    }

    //The time complexity of the above solution is O(n) and requires O(n) extra space.
    private static void difference(int[] nums,int dif) {
        Set<Integer> set = new HashSet<>();
        for (int i:nums){
            if (set.contains(dif+i)){
                System.out.println(i+","+(dif+i));
            }
            if (set.contains(i-dif)){
                System.out.println(i+","+(i-dif));
            }
            set.add(i);
        }}
    //

}
