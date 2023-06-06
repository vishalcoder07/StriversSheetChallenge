import java.util.* ;
import java.io.*; 
/*******************************************************

    Following is the Interval class structure

    class Interval {
        int start, int finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }
    
*******************************************************/

import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static List<Interval> mergeIntervals(Interval[] intervals) {
        int n = intervals.length;
        List<Interval> merge = new ArrayList<>();
        Arrays.sort(intervals , (a , b) -> a.start -b.start);

        int start = intervals[0].start;
        int end = intervals[0].finish;

        for(int i=1; i<n; i++){
               
            if(intervals[i].start <= end){
                end = Math.max(intervals[i].finish, end);
            }
            else{
                merge.add(new Interval(start, end));
                start = intervals[i].start;
                end = intervals[i].finish;
            }
        }
        merge.add(new Interval(start, end)); 

        return merge;
    }
}
