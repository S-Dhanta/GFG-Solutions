//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking total testcases
		int t=sc.nextInt();
		
		sc.nextLine();
		while(t-->0)
		{
		   //taking String X and Y
		   String S[]=sc.nextLine().split(" ");
		   String X=S[0];
		   String Y=S[1];
		   
		   //calling function shortestCommonSupersequence()
		   System.out.println(new Solution().shortestCommonSupersequence(X, Y, X.length(), Y.length()));
		}
	}




       
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find length of shortest common supersequence of two strings.
    public static int shortestCommonSupersequence(String X,String Y,int m,int n)
    {
        //Your code here
        int i=0,j=0;
        int dp[][]=new int[m+1][n+1];
        
        for(i=1;i<=m;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(X.charAt(i-1)==Y.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    int x=dp[i][j-1];
                    int y=dp[i-1][j];
                    int z=x>y?x:y;
                    dp[i][j]=z;
                }
            }
        }
        
        //sum of length of both string minus length of LCS
        return m+n-dp[m][n];
    }
}