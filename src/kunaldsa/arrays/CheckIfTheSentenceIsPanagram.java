package kunaldsa.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Choudhury Subham on 20-06-2022
 */
public class CheckIfTheSentenceIsPanagram {

    public static void main(String[] args) {

        String sentence = "thequickbrownfoxjumpsoverthelazydog";//"thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }

    public static  boolean checkIfPangram(String sentence) {
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char ch [] = sentence.toCharArray();
        System.out.println(ch.length);
        boolean ans = false;
        int count =0;
        for (int i=0;i<ch.length;i++){
            int j=0;
            if (ch[i]==alphabet[j]&& ch.length>=26){
                count++;
                if (count>=26){
                    ans = true;
                }
                j++;
            }

        }
        return ans;
    }
}
