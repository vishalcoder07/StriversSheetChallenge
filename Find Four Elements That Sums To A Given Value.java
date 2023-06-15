import java.io.*;
import java.util.* ;

public class Solution {
  public static String fourSum(int[] arr, int target, int n) {
      Arrays.sort(arr);

      for(int i=0; i<n; i++){
        for(int j=i+1; j<n; j++){

          int low = j+1;
          int high = n-1;

          while(low < high){
            int sum = arr[i] + arr[j] + arr[low] + arr[high];

            if(sum > target){
              high--;
            }
            else if(sum < target){
              low++;
            }
            else{
              return "Yes";
            }
          }

        }
      }

      return "No";
  }
}
