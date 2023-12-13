//{ Driver Code Starts
// Initial Template for Java

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

            long ans = new Solution().countStrings(n);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    private static final int MODULO = 1000000007;
    
    long countStrings(int n) {
        long count = 2;
        long endWithZero = 1;
        long endWithOne = 1;
        for (int i = 1; i < n; i++) {
            endWithOne = endWithZero;
            endWithZero = count;
            count = (endWithOne + endWithZero) % MODULO;
        }
        return count;
    }
}