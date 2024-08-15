import java.util.HashMap;
import java.util.Map;
public class longes_pos_neg {
    public static int getLongestSubarray(int[] arr,int k){
        int n=arr.length;
        Map<Integer, Integer> preSumMap = new HashMap<>();
        int maxLen=0, sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==k){
                maxLen=Math.max(maxLen,i+1);
            }
            int rem=sum-k;
            if(preSumMap.containsKey(rem)){
                int len=i-preSumMap.get(rem);
                maxLen=Math.max(maxLen,len);
            }
            if(!preSumMap.containsKey(sum)){
                preSumMap.put(sum,i);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] a = { -1, 1, 1,-1, 1};
        int k = 1;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}
