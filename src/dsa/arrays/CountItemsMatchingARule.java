package dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Choudhury Subham on 21-06-2022
 */
public class CountItemsMatchingARule {

    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        List<String> a = new ArrayList<>(Arrays.asList("phone", "blue", "pixel"));
        List<String> b = new ArrayList<>(Arrays.asList("computer", "silver", "lenovo"));
        List<String> c = new ArrayList<>(Arrays.asList("phone", "gold", "iphone"));
        list.add(a);
        list.add(b);
        list.add(c);
        String ruleKey = "color";
        String ruleValue = "silver";
        System.out.println(countMatches(list,ruleKey,ruleValue));
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (List<String> str : items) {
            if (ruleKey.equals("type") && ruleValue.equals(str.get(0))) {
                count++;
            } else if (ruleKey.equals("color") && ruleValue.equals(str.get(1))) {
                count++;
            } else if (ruleKey.equals("name") && ruleValue.equals(str.get(2))) {
                count++;
            }
        }
        return count;
    }
}
