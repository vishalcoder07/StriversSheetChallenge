import java.io.*;
import java.util.* ;

public class Solution {

    public static void swap(int[] num1, int i, int num2[], int j){
       int temp = num1[i];
       num1[i] = num2[j];
       num2[j] = temp;
    }
    
    public static int[] ninjaAndSortedArrays(int nums1[], int nums2[], int n, int m) {
        int gap = (n+m)% 2 != 0 ? ((n+m)/2) + 1 : (n+m)/2;
        
        while(gap > 0){        
            int i = 0;
            int j = gap;
            
            while(j < (n+m)){
                // i and j is on first array
                if(j < n && nums1[i] > nums1[j]){
                    swap(nums1, i, nums1, j);
                } 
                // i is on first array and j is on secound array
                else if(j >= n && i < n && nums1[i] > nums2[j-n]){ 
                    swap(nums1, i, nums2, j-n);
                }
                // i and j is on secound array
                else if(j >= n && i >= n && nums2[i-n] > nums2[j-n]){
                    swap(nums2, i-n, nums2, j-n);
                }
                
                i++;
                j++;
            }
            
            if(gap == 1) gap = 0;
            else{
                gap = gap % 2 != 0 ? (gap /2) + 1: (gap/2);
            }
            
        }
        
        int i=n;
        int j=0;
        while(j < m){
            nums1[i++] = nums2[j++];
        }

        return nums1;
    }
}
