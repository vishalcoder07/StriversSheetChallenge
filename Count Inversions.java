import java.util.* ;
import java.io.*; 

public class Solution {
    
    static long merge(long arr[], long temp[], int left, int mid, int right)
    {
        long inv_count=0;
        
        int i = left;
        int j = mid;
        int k = left;
        
        while((i <= mid-1) && (j <= right)){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }
            else
            {
                temp[k++] = arr[j++];
                inv_count = inv_count + (mid - i);
            }
        }

        while(i <= mid - 1)
            temp[k++] = arr[i++];

        while(j <= right)
            temp[k++] = arr[j++];

        for(i = left ; i <= right ; i++)
            arr[i] = temp[i];

        return inv_count;
    }
    
     static  long merge_Sort(long arr[], long temp[], int left, int right)
        {
            int mid,inv_count = 0;
            if(left < right)
            {
                mid = (left + right)/2;

                inv_count += merge_Sort(arr, temp, left, mid);
                inv_count += merge_Sort(arr, temp, mid+1, right);

                inv_count += merge(arr, temp, left, mid+1, right);
            }
            return inv_count;
        }

    public static long getInversions(long arr[], int n) {
        long temp[] = new long[n];
        return merge_Sort(arr, temp, 0, n-1);        
    }
}
