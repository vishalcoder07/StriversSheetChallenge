import java.io.*;
import java.util.* ;

public class Solution {
    public static void setZeros(int mat[][]) {
        int n = mat.length;
        int m = mat[0].length;

        boolean isFirstColHasZero = false;

        for(int i=0; i<n; i++){
            if(mat[i][0] == 0) isFirstColHasZero = true;
            for(int j=1; j<m; j++){
                if(mat[i][j] == 0){
                    mat[0][j] = mat[i][0] = 0;
                }
            }
        }

        for(int i=n-1; i >=0; i--){
            for(int j=m-1; j>=1; j--){
                if(mat[0][j] == 0  || mat[i][0] == 0){
                    mat[i][j] = 0;
                }
            }

            if(isFirstColHasZero){
                mat[i][0] = 0;
            }
        }
    }

}
