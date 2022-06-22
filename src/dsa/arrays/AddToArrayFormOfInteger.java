package dsa.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Choudhury Subham on 21-06-2022
 */
public class AddToArrayFormOfInteger {

    public static void main(String[] args) {
        int[] num = {2,1,5};
        int k=806;
        System.out.println(addToArrayForms(num,k));

    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        String str ="";
        List<Integer> list = new ArrayList<>();
        for (int i : num){
             str +=i;
        }
        Integer sum = Integer.parseInt(str)+k;
        while (sum>0){
            int rem= sum%10;
            list.add(rem);
            sum=sum/10;
        }
        Collections.reverse(list);
       return list;
    }

    public static List<Integer> addToArrayForms(int[] num, int k) {
        List<Integer> ans = new LinkedList<>();
        //2,1,5 //806
        for (int i = num.length - 1; i >= 0; --i) {
            ans.add(0, (num[i] + k) % 10);
            k = (num[i] + k) / 10;
        }

        while (k > 0) {
            ans.add(0, k % 10);
            k /= 10;
        }
        return ans;
    }
}
