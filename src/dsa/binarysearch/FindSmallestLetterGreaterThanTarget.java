package dsa.binarysearch;

/**
 * @author Choudhury Subham on 16-06-2022
 */
public class FindSmallestLetterGreaterThanTarget {

    public static void main(String[] args) {
         char [] ch = {'c','f','j'};
         char target = 'e';
         int ans = smallestLetter(ch,target);
        System.out.println(ch[ans]);
    }

    private static int smallestLetter(char[] ch, char target) {
        int start =0;
        int end = ch.length-1;
        while (start<=end){
           int mid= start+(end-start)/2;
            if (target<ch[mid]){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        /*if(start==ch.length){
            return 0;
        }else {
            return start;
        }*/
        return start% ch.length;
    }
}
