import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetSumII {

    public static void main(String[] args) {
        int [] arr ={1,1,2};
        System.out.println(getTheCombinationOfSubSet(arr));

    }

    private static List<List<Integer>> getTheCombinationOfSubSet(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        getSubset(arr,0,new ArrayList<>(),ans);
        return ans;
    }

    private static void getSubset(int[] arr, int index, ArrayList<Integer> list, List<List<Integer>> ans) {
              ans.add(new ArrayList<>(list));
              for (int i=index;i<arr.length;i++){
                  if (index!=i && arr[i]==arr[i-1])continue;
                  list.add(arr[i]);
                  getSubset(arr,index+1,list,ans);
                  list.remove(list.size()-1);
              }
    }


}
