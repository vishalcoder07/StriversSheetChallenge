import java.util.* ;
import java.io.*; 
public class Solution 
{
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void sort012(int[] arr)
    {
       int left = 0;
       int mid = 0;
       int right = arr.length - 1;

       while(mid <= right){
           switch(arr[mid]){
               case 0:
                    swap(arr, left, mid);
                    left++;
                    mid++;
                break;

                case 1:
                    mid++;
                break;

                case 2:
                    swap(arr, mid, right);
                    right--;
                break;
           }
       }
    }
}
