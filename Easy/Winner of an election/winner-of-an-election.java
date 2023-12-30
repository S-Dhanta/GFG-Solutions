//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            
            for(int i = 0; i < n; i++)
                arr[i] = sc.next();
            
            Solution obj = new Solution();    
            String result[] = obj.winner(arr, n);
            System.out.println(result[0] + " " + result[1]);
            
           
        }
        
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static String[] winner(String arr[], int n)
    {
        // HashMap to store the count of votes for each candidate.
        Map<String, Integer> voteCount = new HashMap<>();

        // Variables to track the maximum votes and lexicographically smallest candidate.
        String maxVotesCandidate = "";
        int maxVotes = 0;

        for (String candidate : arr)
        {
            // Updating the count of votes for the current candidate.
            voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);

            // Checking if the current candidate has more votes than the current maximum.
            if (voteCount.get(candidate) > maxVotes || 
                (voteCount.get(candidate) == maxVotes && candidate.compareTo(maxVotesCandidate) < 0))
            {
                maxVotesCandidate = candidate;
                maxVotes = voteCount.get(candidate);
            }
        }

        // Creating the result array with the name of the winner and the number of votes.
        String[] result = {maxVotesCandidate, String.valueOf(maxVotes)};
        return result;
    }
}
