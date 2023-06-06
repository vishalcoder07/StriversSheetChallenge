public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        int[] ans = new int[2];
        
        for(int i=0; i<n; i++){
            int index = Math.abs(arr.get(i)) - 1;

            if(arr.get(index) < 0){
                ans[1] = index + 1;
            }
            else{
                arr.set(index , arr.get(index) * -1);
            }
        }

        for(int i=0; i<n; i++){
            if(arr.get(i) > 0){
                ans[0] = i + 1;
                break;
            }
        }

        return ans;
    }
}
