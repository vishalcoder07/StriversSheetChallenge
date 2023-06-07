import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> nums) 
    {
          ArrayList<Integer> list = new ArrayList<>();
        
        int no1 = -1, no2 =-1;
        int count1 = 0, count2 = 0;
        
        for(int it : nums){
            
            if(it == no1) count1++;
            else if(it == no2) count2++;
            else if(count1 == 0){
                no1 = it;
                count1 = 1;
            }
            else if(count2 == 0){
                no2 = it;
                count2 = 1;
            }
            else{
                count1--;
                count2--;
            }
        }
        
        count1 = count2 = 0;
        for(int it : nums){
            if(it == no1) count1++;
            else if(it == no2) count2++;
        }
        
        int n = nums.size();
        if(count1 > n/3) list.add(no1);
        if(count2 > n/3) list.add(no2);
        
        return list;
    }
}
