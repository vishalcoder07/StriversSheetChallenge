import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int maxLen = 0;
		int curSum = 0;
		int k = 0;
		for(int i=0; i<arr.size(); i++){
			curSum += arr.get(i);

			if(curSum == k){
				maxLen = i+1;
			}

			if(arr.get(i) == k && maxLen == 0){
				maxLen = 1;
			}

			if(map.containsKey(curSum - k))
				maxLen = Math.max(maxLen, i - map.get(curSum - k));

			
			if(!map.containsKey(curSum)) map.put(curSum, i);
			
		}

		return maxLen;
	}
}
