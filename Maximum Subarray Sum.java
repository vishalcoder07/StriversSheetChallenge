import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		long maxSum = arr[0];
		long curSum = 0l;

		for(int it : arr){
			curSum += it;

			if(curSum < 0) curSum = 0;
			
			maxSum = Math.max(maxSum, curSum);
		}

		return maxSum;
	
	}

}
