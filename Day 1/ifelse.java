//Step 1-Lecture 1- if-else conditions GFG practice question

//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int m;
            m = Integer.parseInt(br.readLine());
            
            Solution obj = new Solution();
            String res = obj.compareNM(n, m);
            
            System.out.println(res);
            
        }
    }
}


// } Driver Code Ends
//User function Template for Java
class Solution {
    public static String compareNM(int n, int m) {
        if(n>m)
        return "greater";
        else if(m==n)
        return "equal";
        else
        return "lesser";
    }
}

//{ Driver Code Starts.

// } Driver Code Ends
