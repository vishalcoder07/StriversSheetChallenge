import java.io.*;
import java.util.* ;

public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        int maxLen = Integer.MIN_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int it : arr){
            if(map.containsKey(it)) continue;

            int left = map.getOrDefault(it - 1 , 0);
            int right = map.getOrDefault(it + 1, 0);

            int len = left + right + 1;
            maxLen = Math.max(maxLen, len);

            map.put(it, len);
            
            map.put(it - left, len);
            map.put(it + right, len);
        }

        return maxLen;
    }
}
