package dsa.arrays;

import java.util.Arrays;

/**
 * @author Choudhury Subham on 21-06-2022
 */
public class FlippingAnImage {


    public static void main(String[] args) {
        int [][] image = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };

        int[][] flipimage =flipAndInvertImage(image);
        for (int [] a:flipimage){
            System.out.println(Arrays.toString(a));
        }
    }
    public static int[][] flipAndInvertImage(int[][] image) {


        return image;
    }






    /*public static int[][] flipAndInvertImage(int[][] image) {
        for (int i=0;i<image.length;i++){
            for (int j=0;j<image[i].length;j++){
                if (image[i][j]==image[i][image.length-j-1]){
                    image[i][j] ^= 1;
                    image[i][image.length-j-1] = image[i][j];
                }
            }
        }
        return image;
    }*/
}
