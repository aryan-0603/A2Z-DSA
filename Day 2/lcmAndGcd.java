//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            Long A = Long.parseLong(S[0]);
            Long B = Long.parseLong(S[1]);

            Solution ob = new Solution();
            Long[] ptr = ob.lcmAndGcd(A,B);
            
            System.out.print(ptr[0]);
            System.out.print(" ");
            System.out.println(ptr[1]);
        }
    }
}
// } Driver Code Ends


class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        Long gcd = 1L;
        Long lcm=1L;
        if(A==0){
             return new Long[] {A,B};
        }
        Long divisor = Math.min(A,B);
        Long dividend = Math.max(A,B);
        while(dividend%divisor>0){
            Long temp = dividend;
            dividend = divisor;
            divisor = temp%divisor;
        }
        gcd = divisor;
        lcm = (A*B)/gcd;
       
        return new Long[] {lcm,gcd};
    }
};
