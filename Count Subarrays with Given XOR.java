import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int x) {
		// Write your code here.
		Map<Integer, Integer> map = new HashMap<>();
		int xor = 0;
		int cnt = 0;

		map.put(0, 1);
		for(int i=0; i<arr.size(); i++){
			xor = xor ^ arr.get(i);

			cnt += map.getOrDefault(xor ^ x, 0);

			map.put(xor, map.getOrDefault(xor, 0) + 1);
		}

		return cnt;
	}
}
