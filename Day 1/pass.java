//Step 1-Lecture 1- Pass by value and reference GFG practice question

//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            Solution obj = new Solution();
            int ans[] = obj.passedBy(n, m);

            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int value;
    static int[] passedBy(int a, int b) {
        a=passbyvalue(a);
        Solution obj1=new Solution();
        obj1.value=b;
        passbyreference(obj1);
        
        return new int[]{a,obj1.value};
    }
    static int passbyvalue(int a){
        a=a+1;
        return a;
    }
    static Solution passbyreference(Solution obj){
        obj.value+=2;
        return obj;
    }
}
