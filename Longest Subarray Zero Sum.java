import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int maxLen = 0;
		int curSum = 0;
		for(int i=0; i<arr.size(); i++){
			curSum += arr.get(i);

			if(curSum == 0){
				maxLen = i+1;
			}


			if(map.containsKey(curSum - 0))
				maxLen = Math.max(maxLen, i - map.get(curSum - 0));

			else
				map.put(curSum, i);
			
		}

		return maxLen;
	}
}
