import java.util.HashMap;

public class longest_subarray_sum0 {
    public static int maxLen(int[] arr,int n){
        int max=0;
        int sum=0;
        HashMap<Integer,Integer> ans=new HashMap<>();
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0)
                max=i+1;
            else{
                if(ans.get(sum)!=null)
                    max=Math.max(max,i-ans.get(sum));
                else    
                    ans.put(sum,i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int n = 8; 
        int[] arr = {6, -2, 2, -8, 1, 7, 4, -10};
        System.out.println(maxLen(arr,n));
    }   
}
