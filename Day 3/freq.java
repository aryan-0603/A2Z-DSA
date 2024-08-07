//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
        int t = Integer.parseInt(br.readLine().trim()); 
        while(t-->0){
            
            //size of array
            int N = Integer.parseInt(br.readLine().trim()); 
            int arr[] = new int[N];
            String inputLine[] = br.readLine().trim().split(" ");

            //adding elements to the array
            for(int i = 0 ; i < N; i++){
                arr[i]=Integer.parseInt(inputLine[i]); 
            }
            int P= Integer.parseInt(br.readLine().trim());
            //calling frequncycount() function
            Solution ob = new Solution();
            ob.frequencyCount(arr, N, P); 
            
            //printing array elements
            for(int i = 0; i < N ; i++)
                System.out.print(arr[i] + " " );
            System.out.println();
        }
    }
}




// } Driver Code Ends


class Solution{
    public static void frequencyCount(int arr[], int N, int P)
    {
       HashMap<Integer, Integer> freqMap = new HashMap<>();
        
        for (int i = 0; i < N; i++) {
            if (arr[i] <= N) {
                freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
            }
        }
        
        
        for (int i = 0; i < N; i++) {
            arr[i] = freqMap.getOrDefault(i + 1, 0);
        }
    }
}
