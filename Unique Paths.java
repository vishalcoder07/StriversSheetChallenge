
import java.util.* ;
import java.io.*; 
public class Solution {
	public static int uniquePaths(int n, int m) {
		  int prev[] = new int[m];
        
        for(int i=0; i<n; i++){
            
            int cur[] = new int[m];
            
            for(int j=0; j<m; j++){
                
                if(i == 0 && j == 0){
                    cur[j] = 1;
                    continue;
                } 
                
                int up =0;
                if(i > 0) up = prev[j];
                    
                int left = 0;
                if(j > 0) left = cur[j-1];
                
                cur[j] = up + left;
            }
            
            prev = cur;
        }
        
        return prev[m-1];
	}
}
