//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*; 
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
    		System.out.println (new Solution().colName (n));
        }
        
    }
}

// Contributed By: Pranay Bansal 

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String reverseString(String ans) {
        String reversed = "";
        for (int i = ans.length() - 1; i >= 0; i--) {
            reversed += ans.charAt(i);
        }
        return reversed;
    }
    String colName(long n) {
        String ans = "";
        while (n > 0) {
            long mod = (n - 1) % 26;
            ans += (char) ('A' + mod);
            n = (n - 1) / 26;
        }
        return reverseString(ans);
    }
}