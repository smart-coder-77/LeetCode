package program;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Choudhury Subham on 14-06-2022
 */
public class MultiDimentionalArray {

    public static void main(String[] args) {
        int [][] xyz = new int[2][2];
        Scanner sc = new Scanner(System.in);

        for (int i=0;i< xyz.length;i++){
            for (int j=0;j<xyz[i].length;j++){
                xyz[i][j] = sc.nextInt();
            }
        }
       for (int [] a : xyz){
        System.out.println(Arrays.toString(a));
    }}
}
