import java.util.ArrayList;
public class Solution {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> matrix, int target) {
        int n = matrix.size();
        int m = matrix.get(0).size();
        
        int i=0;
        int j=m-1;
        while(i < n && j >= 0){
            if(matrix.get(i).get(j) == target) return true;
            else if(matrix.get(i).get(j) > target) j--;
            else i++;
        }
        
        return false;
    }
}
