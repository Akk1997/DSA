
import java.util.*;

public class Practice4 {
    public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int m = s.nextInt();

    int[][] arr = new int[n][m];
    for(int i=0; i<n,i++){
        for(int j=0;j<m; j++){
        arr[i][j]=s.nextInt();
    }
    }
    int j,max_row_index = 0;
            j = m - 1;
 
        for (int i = 0; i < R; i++) {
            // Move left until a 0 is found
            while (j >= 0 && arr[i][j] == 1) {
                j = j - 1; // Update the index of leftmost 1
                       // seen so far
                max_row_index = i; // Update max_row_index
            }
        }
          if(max_row_index==0&&arr[0][m-1]==0){
            System.out.print("-1")
          }
        System.out.println(max_row_index);
        System.out.println(j);
    }
}

