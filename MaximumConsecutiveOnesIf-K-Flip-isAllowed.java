import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            int m = Integer.parseInt(br.readLine().trim());

            int ans = new Solve().findZeroes(arr, n, m);

            System.out.println(ans);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solve {
    // m is maximum of number zeroes allowed to flip
    
    //Using Windows slider method
    int findZeroes(int arr[], int n, int m) {
        // code here
        int maxCountOnes = 0;
        int zeroCounts = 0;
        int start = 0;
        
        for(int end = 0;end<arr.length;end++){
            
            if(arr[end] == 0){
                zeroCounts += 1;
            }
            
            while(zeroCounts>m){
                if(arr[start] == 0){
                    zeroCounts--;
                }
                start++;
            }
            
            maxCountOnes = Math.max(maxCountOnes, end-start+1);
        }
        return maxCountOnes;
    }
}
