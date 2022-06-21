package kunaldsa.arrays;

import java.util.Arrays;

/**
 * @author Choudhury Subham on 21-06-2022
 */
public class FindTheHighestAltitude {

    public static void main(String[] args) {
        int [] gain ={-5,1,5,0,-7};
        System.out.println(largestAltitude2(gain));
    }
    //
    public static int largestAltitude(int[] gain) {
        int [] pain = new int[gain.length+1];
        for (int i=1;i<pain.length;i++){
           pain[i] = pain[i-1]+gain[i-1];
        }
        System.out.println(Arrays.toString(pain));
        int max=pain[0];
        for (int i=1;i<pain.length;i++){
            if (max<pain[i]){
                max=pain[i];
            }
        }
       return max;
    }
    public static int largestAltitude1(int[] gain) {
        int [] pain = new int[gain.length+1];
        for (int i=1;i<pain.length;i++){
            pain[i] = pain[i-1]+gain[i-1];
        }
        Arrays.sort(pain);
        return pain[pain.length-1];
    }

    public static int largestAltitude2(int[] gain) {
        int altitude =0;
        int max =0;
        for (int i=0;i<gain.length;i++){
            altitude+=gain[i];
            max= Math.max(max,altitude);
        }
        return max;
    }
}
