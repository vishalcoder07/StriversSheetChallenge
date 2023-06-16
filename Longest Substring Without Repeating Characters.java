import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static int uniqueSubstrings(String input) 
    {
		Set<Character> set = new HashSet<>();
		int i=0; 
		int j=0;
		int maxLen = 0;

		while(j < input.length()){
			char ch = input.charAt(j);
			if(!set.contains(ch)){
				set.add(ch);
				j++;

				maxLen = Math.max(maxLen, set.size());
			}
			else{
				set.remove(input.charAt(i));

				i++;
			}
		}

		return maxLen;
		
	}
}
