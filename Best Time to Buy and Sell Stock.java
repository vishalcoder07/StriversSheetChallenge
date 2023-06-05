import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        int min = prices.get(0);
        int maxProfit = 0;

        for(int i=1; i<prices.size(); i++){
            maxProfit = Math.max(maxProfit, prices.get(i) - min);

            min = Math.min(min, prices.get(i));
        }

        return maxProfit;

    }
}
