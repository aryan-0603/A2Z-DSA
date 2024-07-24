//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.sumOfSeries(N));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    long sumOfSeries(long n) {
        long sum=0;
        if(n==0)
        return sum;
        return (long) Math.pow(n, 3) + sumOfSeries(n-1);
    }
}
