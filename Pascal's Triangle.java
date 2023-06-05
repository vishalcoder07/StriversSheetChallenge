import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int numRows) {
        ArrayList<ArrayList<Long>> res = new ArrayList<>();
        
        ArrayList<Long> prev = null, cur;
        
        for(int i=0; i<numRows; i++){
            cur = new ArrayList<>();
            
            for(int j=0; j<=i; j++){
                if(j == 0 || j == i){
                    cur.add(1l);
                }
                else{
                    cur.add(prev.get(j-1) + prev.get(j));
                }
            }
            prev = cur;
            res.add(prev);
        }
        
        return res;
	}
}
