package kunaldsa.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Choudhury Subham on 20-06-2022
 */
public class PanagramProgram {

    public static void main(String[] args) {
        String str = "leetcode";
        if (checkIfPangram1(str) == true)
            System.out.print(str + " is a pangram.");
        else
            System.out.print(str + " is not a pangram.");
    }

    //Runtime 6ms
    private static boolean checkPangram(String str) {
        boolean[] temp = new boolean[26];
        int index= 0;
        for (int i=0;i<str.length();i++){
            if('a'<= str.charAt(i) && str.charAt(i)<='z'){
                index = str.charAt(i)-'a';
                temp[index]=true;
            }

        }
        for (int i=0;i<=25;i++){
            if (temp[i]==false){
                return false;
            }
        }
        return true;
    }
    //Runtime 17 milisecond
    public static boolean checkIfPangram(String sentence) {
        Map<Character,Integer> map = new HashMap<>();
        for (int i=0;i<sentence.length();i++){
            map.put(sentence.charAt(i),map.getOrDefault(sentence.charAt(i),0)+1);
        }
        if (map.size()>=26){
            return true;
        }else {
            return false;
        }
    }
   //4ms
    public static boolean checkIfPangram1(String sentence) {
        Set<Character> set = new HashSet<>();
        for (int i=0;i<sentence.length();i++){
            set.add(sentence.charAt(i));
        }
        return set.size()>=26;
    }
}

