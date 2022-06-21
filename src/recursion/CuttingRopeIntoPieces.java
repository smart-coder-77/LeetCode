package recursion;

/**
 * @author Choudhury Subham on 31-05-2022
 */
public class CuttingRopeIntoPieces {
    public static void main(String[] args) {
        int n=5;
        int a=2,b=1,c=5;
        System.out.println(maxCuts(n,a,b,c));
    }
    private static int maxCuts(int n,int a,int b,int c) {
        if (n==0){
            return 0;
        }
        if (n<1){
            return -1;
        }
        int res = maxCuts(n,maxCuts(n-a,a,b,c),maxCuts(n-b,a,b,c),maxCuts(n-c,a,b,c));
        if (res==-1){
            return -1;
        }
        return res+1;
    }
}
