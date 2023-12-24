//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            String str=br.readLine();
    		String[] starr=str.split(" ");
    		
    		//input n and d
    	    int n=Integer.parseInt(starr[0]);
    		int k= Integer.parseInt(starr[1]);
            
            starr = br.readLine().trim().split(" ");
            int[] price = new int[n];
            for(int i = 0; i < n; i++)
                price[i] = Integer.parseInt(starr[i]);
            
            Solution obj = new Solution();
            int res = obj.buyMaximumProducts(n, k, price);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int buyMaximumProducts(int n, int k, int[] price) {
       HashMap<Integer,Integer>h=new HashMap<>();
       for(int i=0;i<n;i++){
           if(h.containsKey(price[i])){
               h.put(price[i],h.get(price[i])+(i+1));
           }
           else{
           h.put(price[i],i+1);
           }
       }
       Arrays.sort(price);
        int x=0;
        for(int i=0;i<n;i++){
            int j=h.get(price[i]);
            while(j>0 && (k-price[i])>=0){
                k=k-price[i];
                x++;
                j--;
            }
            h.put(price[i],0);
        }
        return x;
        
     
    }
}
        
